package org.yah.games.glsupport.context.enums;

import static org.lwjgl.glfw.GLFW.*;

public enum OpenGLProfile implements GLFWEnum {
    CORE_PROFILE(GLFW_OPENGL_CORE_PROFILE),
    COMPAT_PROFILE(GLFW_OPENGL_COMPAT_PROFILE),
    ANY_PROFILE(GLFW_OPENGL_ANY_PROFILE);

    public final int id;

    OpenGLProfile(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
