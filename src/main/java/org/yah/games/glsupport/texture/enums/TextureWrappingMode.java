package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureWrappingMode implements GLEnum {
    GL_CLAMP_TO_EDGE(GLContext.GL_CLAMP_TO_EDGE),
    GL_MIRRORED_REPEAT(GLContext.GL_MIRRORED_REPEAT),
    GL_REPEAT(GLContext.GL_REPEAT);

    private final int id;

    TextureWrappingMode(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
