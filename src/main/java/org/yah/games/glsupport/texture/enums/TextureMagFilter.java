package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureMagFilter implements GLEnum {
    GL_NEAREST(GLContext.GL_NEAREST),
    GL_LINEAR(GLContext.GL_LINEAR);

    private final int id;

    TextureMagFilter(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
