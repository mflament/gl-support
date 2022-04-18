package org.yah.games.glsupport.buffer.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum BufferTarget implements GLEnum {
    GL_ARRAY_BUFFER(GLContext.GL_ARRAY_BUFFER),
    GL_COPY_READ_BUFFER(GLContext.GL_COPY_READ_BUFFER),
    GL_COPY_WRITE_BUFFER(GLContext.GL_COPY_WRITE_BUFFER),
    GL_ELEMENT_ARRAY_BUFFER(GLContext.GL_ELEMENT_ARRAY_BUFFER),
    GL_PIXEL_PACK_BUFFER(GLContext.GL_PIXEL_PACK_BUFFER),
    GL_PIXEL_UNPACK_BUFFER(GLContext.GL_PIXEL_UNPACK_BUFFER),
    GL_TRANSFORM_FEEDBACK_BUFFER(GLContext.GL_TRANSFORM_FEEDBACK_BUFFER),
    GL_UNIFORM_BUFFER(GLContext.GL_UNIFORM_BUFFER);

    public static final int COUNT = values().length;

    private final int id;
    BufferTarget(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
