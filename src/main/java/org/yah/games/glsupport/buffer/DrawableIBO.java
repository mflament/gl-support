package org.yah.games.glsupport.buffer;

import org.yah.games.glsupport.GLState;
import org.yah.games.glsupport.buffer.enums.BufferTarget;
import org.yah.games.glsupport.buffer.enums.DrawMode;
import org.yah.games.glsupport.buffer.enums.IndexBufferType;
import org.yah.games.glsupport.context.GLContext;

import java.util.Objects;

public class DrawableIBO extends DrawableVBO {

    private final int ibo;
    private final IndexBufferType type;

    public DrawableIBO(GLContext context, DrawMode drawMode, int vao, int ibo, IndexBufferType type, int count) {
        super(context, drawMode, vao, count);
        this.ibo = ibo;
        this.type = Objects.requireNonNull(type, "type is null");
    }

    @Override
    public void draw(int first, int count) {
        GLState state = context.getState();
        state.bindVertexArray(vao);
        state.bindBuffer(BufferTarget.GL_ELEMENT_ARRAY_BUFFER, ibo);
        context.glDrawElements(drawMode, count, type.get(), first);
    }
}
