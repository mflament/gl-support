package org.yah.games.glsupport.buffer.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum FloatPointerAttributeType implements GLEnum {
    GL_BYTE(GLContext.GL_BYTE),
    GL_UNSIGNED_BYTE(GLContext.GL_UNSIGNED_BYTE),
    GL_SHORT(GLContext.GL_SHORT),
    GL_UNSIGNED_SHORT(GLContext.GL_UNSIGNED_SHORT),
    GL_FLOAT(GLContext.GL_FLOAT),
    GL_HALF_FLOAT(GLContext.GL_HALF_FLOAT);

    public static final int COUNT = values().length;

    private final int id;
    FloatPointerAttributeType(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
