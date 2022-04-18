package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureMinFilter implements GLEnum {
    GL_NEAREST(GLContext.GL_NEAREST),
    GL_LINEAR(GLContext.GL_LINEAR),
    GL_NEAREST_MIPMAP_NEAREST(GLContext.GL_NEAREST_MIPMAP_NEAREST),
    GL_LINEAR_MIPMAP_NEAREST(GLContext.GL_LINEAR_MIPMAP_NEAREST),
    GL_NEAREST_MIPMAP_LINEAR(GLContext.GL_NEAREST_MIPMAP_LINEAR),
    GL_LINEAR_MIPMAP_LINEAR(GLContext.GL_LINEAR_MIPMAP_LINEAR);

    private final int id;

    TextureMinFilter(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
