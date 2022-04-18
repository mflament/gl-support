package org.yah.games.glsupport.tools;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GLInterfaceParser {

    static List<Method> collectMethods(GLClasses classes) {
        List<Method> glMethods = collectMethods(classes.glClasses);
        List<Method> glesMethods = collectMethods(classes.glesClass);
        List<Method> matchedMethods = new ArrayList<>(Math.min(glMethods.size(), glesMethods.size()));
        for (Method glMethod : glMethods) {
            glesMethods.stream()
                    .filter(m -> sameMethods(m, glMethod))
                    .findFirst().ifPresentOrElse(matchedMethods::add, () -> System.out.println("Unmatched method " + glMethod));
        }
        return matchedMethods;
    }

    static List<Field> collectConstants(GLClasses classes) {
        List<Field> glConstants = collectConstants(classes.glClasses);
        List<Field> glesConstants = collectConstants(classes.glesClass);
        List<Field> matchedConstants = new ArrayList<>(Math.min(glConstants.size(), glesConstants.size()));
        for (Field glConstant : glConstants) {
            glesConstants.stream()
                    .filter(c -> sameConstant(c, glConstant))
                    .findFirst().ifPresentOrElse(matchedConstants::add, () -> System.out.println("Unmatched constant " + glConstant));
        }
        return matchedConstants;
    }


    private static boolean sameMethods(Method m1, Method m2) {
        if (!m1.getName().equals(m2.getName()) || m1.getParameterCount() != m2.getParameterCount())
            return false;
        Parameter[] params1 = m1.getParameters();
        Parameter[] params2 = m2.getParameters();
        for (int i = 0; i < params1.length; i++) {
            Parameter p1 = params1[i];
            Parameter p2 = params2[i];
            if (!p1.getType().equals(p2.getType()))
                return false;
        }
        return true;
    }

    private static boolean sameConstant(Field f1, Field f2) {
        if (f1.getName().equals(f2.getName()) && f1.getType().equals(f2.getType())) {
            try {
                Object v1 = f1.get(null);
                Object v2 = f2.get(null);
                return v1.equals(v2);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    private static List<Method> collectMethods(List<Class<?>> classes) {
        return classes.stream().flatMap(c -> collectMethods(c).stream()).collect(Collectors.toList());
    }

    private static List<Method> collectMethods(Class<?> clazz) {
        return Arrays.stream(clazz.getMethods())
                .filter(m -> m.getName().startsWith("gl"))
                .collect(Collectors.toList());
    }

    private static List<Field> collectConstants(List<Class<?>> classes) {
        return classes.stream().flatMap(c -> collectConstants(c).stream()).collect(Collectors.toList());
    }

    private static List<Field> collectConstants(Class<?> clazz) {
        return Arrays.stream(clazz.getFields())
                .filter(f -> Modifier.isStatic(f.getModifiers()) && f.getName().startsWith("GL_"))
                .collect(Collectors.toList());
    }


}
