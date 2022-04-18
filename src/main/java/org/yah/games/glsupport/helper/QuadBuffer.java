package org.yah.games.glsupport.helper;

import org.yah.games.glsupport.GLState;
import org.yah.games.glsupport.buffer.BufferHelper;
import org.yah.games.glsupport.buffer.VertexArrayBuilder;
import org.yah.games.glsupport.buffer.enums.BufferTarget;
import org.yah.games.glsupport.buffer.enums.BufferUsage;
import org.yah.games.glsupport.buffer.enums.FloatPointerAttributeType;
import org.yah.games.glsupport.context.GLContext;

import java.util.Objects;

public class QuadBuffer {

    private static final float[] VERTICES = {
            -1.0f, -1.0f,
            1.0f, -1.0f,
            1.0f, 1.0f,
            -1.0f, 1.0f
    };

    private static final short[] INDICES = {
            0, 1, 2,
            2, 3, 0
    };

    private final GLContext context;
    private final int vao;
    private final int vbo;
    private final int ibo;

    public QuadBuffer(GLContext context) {
        this.context = Objects.requireNonNull(context, "context is null");
        vbo = BufferHelper.createVBO(context, VERTICES, BufferUsage.GL_STATIC_DRAW);
        ibo = BufferHelper.createIBO(context, INDICES, BufferUsage.GL_STATIC_DRAW);
        vao = new VertexArrayBuilder(context)
                .floatAttributePointer(2, FloatPointerAttributeType.GL_FLOAT)
                .build();

        GLState state = context.getState();
        state.bindBuffer(BufferTarget.GL_ARRAY_BUFFER, GLContext.GL_NONE);
        state.bindBuffer(BufferTarget.GL_ELEMENT_ARRAY_BUFFER, GLContext.GL_NONE);
    }

    public void draw() {
        GLState state = context.getState();
        state.bindVertexArray(vao);
        state.bindBuffer(BufferTarget.GL_ELEMENT_ARRAY_BUFFER, ibo);
        context.glDrawElements(GLContext.GL_TRIANGLES, INDICES.length, GLContext.GL_UNSIGNED_SHORT, 0);
    }

    public void delete() {
        context.glDeleteVertexArrays(vao);
        context.glDeleteBuffers(new int[]{ibo, vbo});
    }
}
