package org.yah.games.glsupport.program.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum ShaderParameter implements GLEnum {
    GL_SHADER_TYPE(GLContext.GL_SHADER_TYPE),
    GL_DELETE_STATUS(GLContext.GL_DELETE_STATUS),
    GL_COMPILE_STATUS(GLContext.GL_COMPILE_STATUS),
    GL_INFO_LOG_LENGTH(GLContext.GL_INFO_LOG_LENGTH),
    GL_SHADER_SOURCE_LENGTH(GLContext.GL_SHADER_SOURCE_LENGTH);

    private final int id;

    ShaderParameter(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
