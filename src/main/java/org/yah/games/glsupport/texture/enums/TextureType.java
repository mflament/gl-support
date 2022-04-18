package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureType implements GLEnum {
    GL_BYTE(GLContext.GL_BYTE),
    GL_UNSIGNED_BYTE(GLContext.GL_UNSIGNED_BYTE),
    GL_SHORT(GLContext.GL_SHORT),
    GL_UNSIGNED_SHORT(GLContext.GL_UNSIGNED_SHORT),
    GL_UNSIGNED_SHORT_5_6_5(GLContext.GL_UNSIGNED_SHORT_5_6_5),
    GL_UNSIGNED_SHORT_5_5_5_1(GLContext.GL_UNSIGNED_SHORT_5_5_5_1),
    GL_UNSIGNED_SHORT_4_4_4_4(GLContext.GL_UNSIGNED_SHORT_4_4_4_4),
    GL_INT(GLContext.GL_INT),
    GL_UNSIGNED_INT(GLContext.GL_UNSIGNED_INT),
    GL_UNSIGNED_INT_5_9_9_9_REV(GLContext.GL_UNSIGNED_INT_5_9_9_9_REV),
    GL_UNSIGNED_INT_2_10_10_10_REV(GLContext.GL_UNSIGNED_INT_2_10_10_10_REV),
    GL_UNSIGNED_INT_10F_11F_11F_REV(GLContext.GL_UNSIGNED_INT_10F_11F_11F_REV),
    GL_UNSIGNED_INT_24_8(GLContext.GL_UNSIGNED_INT_24_8),
    GL_HALF_FLOAT(GLContext.GL_HALF_FLOAT),
    GL_FLOAT(GLContext.GL_FLOAT);

    private final int id;

    TextureType(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
