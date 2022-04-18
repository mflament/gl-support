package org.yah.games.glsupport.program.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum ProgramParameter implements GLEnum {
    GL_DELETE_STATUS(GLContext.GL_DELETE_STATUS),
    GL_LINK_STATUS(GLContext.GL_LINK_STATUS),
    GL_VALIDATE_STATUS(GLContext.GL_VALIDATE_STATUS),
    GL_INFO_LOG_LENGTH(GLContext.GL_INFO_LOG_LENGTH),
    GL_ATTACHED_SHADERS(GLContext.GL_ATTACHED_SHADERS),
    GL_ACTIVE_ATTRIBUTES(GLContext.GL_ACTIVE_ATTRIBUTES),
    GL_ACTIVE_ATTRIBUTE_MAX_LENGTH(GLContext.GL_ACTIVE_ATTRIBUTE_MAX_LENGTH),
    GL_ACTIVE_UNIFORMS(GLContext.GL_ACTIVE_UNIFORMS),
    GL_ACTIVE_UNIFORM_MAX_LENGTH(GLContext.GL_ACTIVE_UNIFORM_MAX_LENGTH),
    GL_TRANSFORM_FEEDBACK_BUFFER_MODE(GLContext.GL_TRANSFORM_FEEDBACK_BUFFER_MODE),
    GL_TRANSFORM_FEEDBACK_VARYINGS(GLContext.GL_TRANSFORM_FEEDBACK_VARYINGS),
    GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH(GLContext.GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH);

    private final int id;

    ProgramParameter(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
