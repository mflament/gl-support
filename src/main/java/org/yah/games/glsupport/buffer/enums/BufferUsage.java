package org.yah.games.glsupport.buffer.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum BufferUsage implements GLEnum {
    GL_STREAM_DRAW(GLContext.GL_STREAM_DRAW),
    GL_STREAM_READ(GLContext.GL_STREAM_READ),
    GL_STREAM_COPY(GLContext.GL_STREAM_COPY),
    GL_STATIC_DRAW(GLContext.GL_STATIC_DRAW),
    GL_STATIC_READ(GLContext.GL_STATIC_READ),
    GL_STATIC_COPY(GLContext.GL_STATIC_COPY),
    GL_DYNAMIC_DRAW(GLContext.GL_DYNAMIC_DRAW),
    GL_DYNAMIC_READ(GLContext.GL_DYNAMIC_READ),
    GL_DYNAMIC_COPY(GLContext.GL_DYNAMIC_COPY);

    private final int id;
    BufferUsage(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
