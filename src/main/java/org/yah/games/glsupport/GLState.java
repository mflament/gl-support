package org.yah.games.glsupport;

import org.yah.games.glsupport.buffer.enums.BufferTarget;
import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.texture.enums.TextureTarget;
import org.yah.games.glsupport.texture.enums.TextureUnit;

import java.util.Objects;

public class GLState {

    private int program;

    private int activeTexture = GLContext.GL_TEXTURE0;

    private final int[][] textures = new int[TextureUnit.COUNT][2]; // [texture unit][target, texture]

    private int vertexArray;

    private final int[] buffers = new int[BufferTarget.COUNT];

    private int frameBuffer;

    private final GLContext glContext;

    public GLState(GLContext glContext) {
        this.glContext = Objects.requireNonNull(glContext, "glContext is null");
    }

    public GLState useProgram(int program) {
        int actual = this.program;
        if (actual != program) {
            glContext.glUseProgram(program);
            this.program = program;
        }
        return this;
    }

    public GLState activateTexture(TextureUnit textureUnit) {
        return activateTexture(textureUnit.get());
    }

    public GLState activateTexture(int textureUnit) {
        int actual = this.activeTexture;
        if (actual != textureUnit) {
            glContext.glActiveTexture(textureUnit);
            this.activeTexture = textureUnit;
        }
        return this;
    }

    public GLState bindTexture(TextureTarget target, int texture) {
        return bindTexture(target.get(), texture);
    }

    public GLState bindTexture(int target, int texture) {
        int[] actual = textures[activeTexture - GLContext.GL_TEXTURE0];
        if (actual[0] != target || actual[1] != texture) {
            if (actual[0] != 0)
                glContext.glBindTexture(actual[0], 0);
            glContext.glBindTexture(target, texture);
            actual[0] = target;
            actual[1] = texture;
        }
        return this;
    }

    public GLState bindBuffer(BufferTarget target, int buffer) {
        int actual = buffers[target.ordinal()];
        if (actual != buffer) {
            glContext.glBindBuffer(target.get(), buffer);
            buffers[target.ordinal()] = buffer;
        }
        return this;
    }

    public GLState bindFrameBuffer(int frameBuffer) {
        int actual = this.frameBuffer;
        if (actual != frameBuffer) {
            glContext.glBindFramebuffer(GLContext.GL_FRAMEBUFFER, frameBuffer);
            this.frameBuffer = frameBuffer;
        }
        return this;
    }

    public GLState bindVertexArray(int vertexArray) {
        int actual = this.vertexArray;
        if (actual != vertexArray) {
            glContext.glBindVertexArray(vertexArray);
            this.vertexArray = vertexArray;
        }
        return this;
    }

}
