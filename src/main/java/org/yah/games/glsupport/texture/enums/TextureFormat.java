package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureFormat implements GLEnum {
    GL_RGB(GLContext.GL_RGB),
    GL_RGBA(GLContext.GL_RGBA),
    GL_LUMINANCE_ALPHA(GLContext.GL_LUMINANCE_ALPHA),
    GL_LUMINANCE(GLContext.GL_LUMINANCE),
    GL_ALPHA(GLContext.GL_ALPHA),
    GL_RED(GLContext.GL_RED),
    GL_RED_INTEGER(GLContext.GL_RED_INTEGER),
    GL_RG(GLContext.GL_RG),
    GL_RG_INTEGER(GLContext.GL_RG_INTEGER),
    GL_RGB_INTEGER(GLContext.GL_RGB_INTEGER),
    GL_RGBA_INTEGER(GLContext.GL_RGBA_INTEGER);

    private final int id;

    TextureFormat(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
