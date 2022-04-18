package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureTarget implements GLEnum {
    GL_TEXTURE_2D(GLContext.GL_TEXTURE_2D),
    GL_TEXTURE_3D(GLContext.GL_TEXTURE_3D),
    GL_TEXTURE_2D_ARRAY(GLContext.GL_TEXTURE_2D_ARRAY),
    GL_TEXTURE_CUBE_MAP(GLContext.GL_TEXTURE_CUBE_MAP);

    private final int id;

    TextureTarget(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
