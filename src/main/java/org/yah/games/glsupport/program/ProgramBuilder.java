package org.yah.games.glsupport.program;

import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.program.enums.ProgramParameter;
import org.yah.games.glsupport.program.enums.ShaderParameter;
import org.yah.games.glsupport.program.enums.ShaderType;
import org.yah.games.glsupport.program.enums.VaryingBufferMode;
import org.yah.games.glsupport.utils.InputStreamSupplier;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.UnaryOperator;

import static org.yah.games.glsupport.utils.GLUtils.check;

public class ProgramBuilder {

    private final GLContext context;
    private int fs, vs;
    private Varyings varyings;

    public ProgramBuilder(GLContext context) {
        this.context = Objects.requireNonNull(context, "context is null");
    }

    public ProgramBuilder fsResource(String resourcePath) throws IOException {
        return fsResource(resourcePath, UnaryOperator.identity());
    }

    public ProgramBuilder fsResource(String resourcePath, UnaryOperator<String> customizer) throws IOException {
        ClassLoader classLoader = ProgramBuilder.class.getClassLoader();
        return fsSource(load(() -> classLoader.getResourceAsStream(resourcePath), customizer));
    }

    public ProgramBuilder fsFile(Path path) throws IOException {
        return fsFile(path, UnaryOperator.identity());
    }

    public ProgramBuilder fsFile(Path path, UnaryOperator<String> customizer) throws IOException {
        return fsSource(load(() -> Files.newInputStream(path), customizer));
    }

    public ProgramBuilder fsSource(String source) {
        fs = this.compileShader(ShaderType.GL_FRAGMENT_SHADER, source);
        return this;
    }

    public ProgramBuilder vsResource(String resourcePath) throws IOException {
        return vsResource(resourcePath, UnaryOperator.identity());
    }

    public ProgramBuilder vsResource(String resourcePath, UnaryOperator<String> customizer) throws IOException {
        ClassLoader classLoader = ProgramBuilder.class.getClassLoader();
        return vsSource(load(() -> classLoader.getResourceAsStream(resourcePath), customizer));
    }

    public ProgramBuilder vsFile(Path path) throws IOException {
        return vsFile(path, UnaryOperator.identity());
    }

    public ProgramBuilder vsFile(Path path, UnaryOperator<String> customizer) throws IOException {
        return vsSource(load(() -> Files.newInputStream(path), customizer));
    }

    public ProgramBuilder vsSource(String source) {
        vs = this.compileShader(ShaderType.GL_VERTEX_SHADER, source);
        return this;
    }

    public ProgramBuilder varyings(VaryingBufferMode bufferMode, String... names) {
        varyings = new Varyings(names, bufferMode);
        return this;
    }

    public int link() {
        if (fs == 0) throw new IllegalStateException("No fragment shader");
        if (vs == 0) throw new IllegalStateException("No vertex shader");

        int program = check(context.glCreateProgram(), "program");

        context.glAttachShader(program, vs);
        context.glDeleteShader(vs);

        context.glAttachShader(program, fs);
        context.glDeleteShader(fs);

        if (varyings != null) {
            context.glTransformFeedbackVaryings(program, varyings.names, varyings.varyingBufferMode.get());
        }

        context.glLinkProgram(program);
        if (context.glGetProgrami(program, ProgramParameter.GL_LINK_STATUS.get()) != GLContext.GL_TRUE) {
            String log = context.glGetProgramInfoLog(program);
            context.glDeleteProgram(program);
            throw new IllegalStateException(log);
        }

        return program;
    }

    private int compileShader(ShaderType type, String source) {
        int shader = check(context.glCreateShader(type.get()), type.name());
        context.glShaderSource(shader, source);
        context.glCompileShader(shader);
        if (context.glGetShaderi(shader, ShaderParameter.GL_COMPILE_STATUS.get()) != GLContext.GL_TRUE) {
            String log = context.glGetShaderInfoLog(shader);
            source = context.glGetShaderSource(shader);
            context.glDeleteShader(shader);
            throw new IllegalArgumentException("Shader compile error\n" + source + "\n\n" + log);
        }
        return shader;
    }

    private static String load(InputStreamSupplier isSupplier, UnaryOperator<String> customizer) throws IOException {
        try (InputStream is = isSupplier.get()) {
            return customizer.apply(new String(is.readAllBytes(), StandardCharsets.UTF_8));
        }
    }

    private static final class Varyings {
        final String[] names;
        final VaryingBufferMode varyingBufferMode;

        public Varyings(String[] names, VaryingBufferMode varyingBufferMode) {
            this.names = Objects.requireNonNull(names, "names is null");
            this.varyingBufferMode = Objects.requireNonNull(varyingBufferMode, "varyingBufferMode is null");
        }
    }

}
