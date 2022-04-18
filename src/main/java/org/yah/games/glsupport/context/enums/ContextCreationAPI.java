package org.yah.games.glsupport.context.enums;

import static org.lwjgl.glfw.GLFW.*;

public enum ContextCreationAPI implements GLFWEnum  {
    NATIVE(GLFW_NATIVE_CONTEXT_API),
    EGL(GLFW_EGL_CONTEXT_API),
    OSMESA(GLFW_OSMESA_CONTEXT_API);

    public final int id;

    ContextCreationAPI(int glfwEnum) {
        this.id = glfwEnum;
    }

    @Override
    public int get() {
        return id;
    }
}
