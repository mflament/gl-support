package org.yah.games.glsupport.tools;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.expr.LongLiteralExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import org.lwjgl.opengl.ARBES2Compatibility;
import org.lwjgl.opengl.ARBES3Compatibility;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL33;
import org.lwjgl.opengles.GLES;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.system.Configuration;
import org.yah.games.glsupport.GLState;
import org.yah.games.glsupport.context.AbstractGLContext;
import org.yah.games.glsupport.context.ContextInfo;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

import static com.github.javaparser.ast.Modifier.Keyword.*;

public class ContextGenerator {

    public static void main(String[] args) throws IOException {
        Configuration.OPENGLES_EXPLICIT_INIT.set(true);
        GLClasses glClasses = new GLClasses(List.of(GL33.class, ARBES3Compatibility.class, ARBES2Compatibility.class), GLES30.class);
        List<Method> matchedMethods = GLInterfaceParser.collectMethods(glClasses);
        List<Field> matchedConstants = GLInterfaceParser.collectConstants(glClasses);
        generate(glClasses, matchedConstants, matchedMethods);
    }

    private static final Set<String> IMPLEMENTED_METHODS = Set.of("getState", "makeCurrent", "unmakeCurrent", "getContextInfo", "delete", "window");

    private static final JavaParser JAVA_PARSER = new JavaParser();

    public static void generate(GLClasses glClasses, List<Field> matchedConstants, List<Method> matchedMethods) throws IOException {
        CompilationUnit compilationUnit = new CompilationUnit("org.yah.games.glsupport.context");
        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit.addInterface("GLContext");

        addAnnotations(interfaceDeclaration);

        matchedConstants.forEach(c -> interfaceDeclaration.addFieldWithInitializer(c.getType(), c.getName(), initializeConstant(c), PUBLIC, STATIC, FINAL));

        matchedMethods.forEach(m -> createInterfaceMethod(compilationUnit, interfaceDeclaration, m));
        interfaceDeclaration.addMethod("getState").setType(GLState.class).removeBody();
        interfaceDeclaration.addMethod("makeCurrent").removeBody();
        interfaceDeclaration.addMethod("unmakeCurrent").removeBody();
        interfaceDeclaration.addMethod("getContextInfo").setType(ContextInfo.class.getSimpleName()).removeBody();
        interfaceDeclaration.addMethod("delete").removeBody();
        interfaceDeclaration.addMethod("window").setType(Long.TYPE).removeBody();

        save(compilationUnit);

        createImplementation(glClasses.glClasses, compilationUnit, interfaceDeclaration);
        createImplementation(List.of(glClasses.glesClass), compilationUnit, interfaceDeclaration);
    }

    private static Expression initializeConstant(Field c) {
        try {
            Object o = c.get(null);
            if (o instanceof Integer) {
                return new IntegerLiteralExpr("0x" + Integer.toHexString((Integer) o));
            } else if (o instanceof Long) {
                return new LongLiteralExpr(o.toString());
            } else
                throw new IllegalArgumentException(c.getName() + " : " + o.toString() + " : " + o.getClass().getName());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void addAnnotations(ClassOrInterfaceDeclaration interfaceDeclaration) {
        JAVA_PARSER.parseAnnotation("@SuppressWarnings({\"unused\", \"SpellCheckingInspection\"})")
                .ifSuccessful(interfaceDeclaration::addAnnotation);
        interfaceDeclaration.findCompilationUnit().ifPresent(cu -> cu.addImport(Generated.class));
        String value = ContextGenerator.class.getSimpleName();
        String date = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        JAVA_PARSER.parseAnnotation("@Generated(value = \"" + value + "\", date = \"" + date + "\")").ifSuccessful(interfaceDeclaration::addAnnotation);
    }

    private static void save(CompilationUnit compilationUnit) throws IOException {
        Path dir = Path.of("src/main/java/org/yah/games/glsupport/context");
        String typeName = compilationUnit.getType(0).getNameAsString();
        Path filePath = dir.resolve(typeName + ".java");
        try (OutputStream os = Files.newOutputStream(filePath)) {
            os.write(compilationUnit.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    private static void createInterfaceMethod(CompilationUnit compilationUnit,
                                              ClassOrInterfaceDeclaration interfaceDeclaration,
                                              Method method) {
        compilationUnit.addImport(method.getReturnType());
        MethodDeclaration methodDeclaration = interfaceDeclaration.addMethod(method.getName())
                .setType(method.getReturnType())
                .removeBody();
        java.lang.reflect.Parameter[] parameters = method.getParameters();
        for (java.lang.reflect.Parameter parameter : parameters) {
            Class<?> type = parameter.getType();
            compilationUnit.addImport(type);
            methodDeclaration.addParameter(type, parameter.getName());
        }
    }

    private static void createImplementation(List<Class<?>> glContextClasses,
                                             CompilationUnit interfaceCompilationUnit,
                                             ClassOrInterfaceDeclaration interfaceDeclaration) throws IOException {
        String packageName = interfaceCompilationUnit.getPackageDeclaration().map(PackageDeclaration::getNameAsString).orElseThrow();
        CompilationUnit compilationUnit = new CompilationUnit(packageName);

        Class<?> contextClass = glContextClasses.get(0);
        compilationUnit.addImport(contextClass);
        ClassOrInterfaceDeclaration implementationDeclaration = compilationUnit.addClass(contextClass.getSimpleName() + "Context", PUBLIC);
        addAnnotations(implementationDeclaration);
        implementationDeclaration.addExtendedType(AbstractGLContext.class.getSimpleName());

        implementationDeclaration.addConstructor(PUBLIC)
                .addParameter(Long.TYPE, "window")
                .setBody(new BlockStmt().addStatement("super(window);"));

        interfaceDeclaration.getMethods().forEach(m -> {
            String name = m.getNameAsString();
            if (IMPLEMENTED_METHODS.contains(name))
                return;
            MethodDeclaration md = implementationDeclaration.addMethod(m.getNameAsString(), PUBLIC);
            md.setType(m.getType().clone());
            md.addMarkerAnnotation(Override.class);
            m.getParameters().stream()
                    .filter(p -> p.getType().isClassOrInterfaceType())
                    .map(p -> resolveType(p.getType().asClassOrInterfaceType().getNameAsString(), interfaceCompilationUnit))
                    .filter(Objects::nonNull)
                    .forEach(compilationUnit::addImport);
            m.getParameters().stream().map(Parameter::clone).forEach(md::addParameter);
            md.setBody(new BlockStmt().addStatement(implementMethod(compilationUnit, glContextClasses, m)));
        });

        implementationDeclaration.addMethod("makeCurrent", PROTECTED, FINAL)
                .addParameter(Long.TYPE, "window")
                .addMarkerAnnotation(Override.class)
                .setBody(new BlockStmt().addStatement(implementMakeCurrent(compilationUnit, glContextClasses.get(0))));

        implementationDeclaration.addMethod("getContextClass", PROTECTED)
                .setType(Class.class)
                .addMarkerAnnotation(Override.class)
                .setBody(new BlockStmt().addStatement("return " + contextClass.getSimpleName() + ".class;"));

        save(compilationUnit);
    }


    private static String implementMethod(CompilationUnit compilationUnit, List<Class<?>> glContextClasses, MethodDeclaration interfaceMethod) {
        StringBuilder sb = new StringBuilder();
        if (!interfaceMethod.getType().isVoidType())
            sb.append("return ");

        Class<?> glContextClass = glContextClasses.stream()
                .filter(c -> containsMethod(c, interfaceMethod.getNameAsString()))
                .findFirst().orElseThrow(() -> new NoSuchElementException(interfaceMethod.getNameAsString()));
        compilationUnit.addImport(glContextClass);
        sb.append(glContextClass.getSimpleName()).append(".").append(interfaceMethod.getNameAsString()).append("(");
        sb.append(interfaceMethod.getParameters().stream()
                .map(Parameter::getNameAsString)
                .collect(Collectors.joining(", ")));
        sb.append(");");
        return sb.toString();
    }

    private static boolean containsMethod(Class<?> clazz, String methodName) {
        return Arrays.stream(clazz.getMethods()).map(Method::getName).anyMatch(n -> n.equals(methodName));
    }

    @Nullable
    private static String resolveType(String name, CompilationUnit interfaceCompilationUnit) {
        return interfaceCompilationUnit.getImports().stream()
                .map(ImportDeclaration::getNameAsString)
                .filter(n -> n.endsWith(name))
                .findFirst().orElse(null);
    }

    private static String implementMakeCurrent(CompilationUnit compilationUnit, Class<?> glContextClass) {
        String res = "if (window != 0) ";
        if (glContextClass.getSimpleName().startsWith("GLES")) {
            compilationUnit.addImport(GLES.class);
            res += "GLES";
        } else {
            compilationUnit.addImport(GL.class);
            res += "GL";
        }
        return res + ".createCapabilities();";
    }

}
