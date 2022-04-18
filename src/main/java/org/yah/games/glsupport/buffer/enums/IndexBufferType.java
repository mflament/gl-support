package org.yah.games.glsupport.buffer.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum IndexBufferType implements GLEnum {
    GL_UNSIGNED_BYTE(GLContext.GL_UNSIGNED_BYTE),
    GL_UNSIGNED_SHORT(GLContext.GL_UNSIGNED_SHORT),
    GL_UNSIGNED_INT(GLContext.GL_UNSIGNED_INT);

    public static final int COUNT = values().length;

    private final int id;

    IndexBufferType(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
