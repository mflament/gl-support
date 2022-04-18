package org.yah.games.glsupport.context.enums;

import static org.lwjgl.glfw.GLFW.*;

public enum ClientAPI implements GLFWEnum {
    OPENGL_API(GLFW_OPENGL_API),
    OPENGL_ES_API(GLFW_OPENGL_ES_API),
    NO_API(GLFW_NO_API);

    public final int id;

    ClientAPI(int glfwEnum) {
        this.id = glfwEnum;
    }

    @Override
    public int get() {
        return id;
    }
}
