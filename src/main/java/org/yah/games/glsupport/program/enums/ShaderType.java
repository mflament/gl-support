package org.yah.games.glsupport.program.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum ShaderType implements GLEnum {
    GL_FRAGMENT_SHADER(GLContext.GL_FRAGMENT_SHADER),
    GL_VERTEX_SHADER(GLContext.GL_VERTEX_SHADER);
    private final int id;

    ShaderType(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
