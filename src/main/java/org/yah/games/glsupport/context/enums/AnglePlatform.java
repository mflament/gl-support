package org.yah.games.glsupport.context.enums;

import static org.lwjgl.glfw.GLFW.*;

public enum AnglePlatform implements GLFWEnum {
    NONE(GLFW_ANGLE_PLATFORM_TYPE_NONE),
    OPENGL(GLFW_ANGLE_PLATFORM_TYPE_OPENGL),
    OPENGLES(GLFW_ANGLE_PLATFORM_TYPE_OPENGLES),
    D3D9(GLFW_ANGLE_PLATFORM_TYPE_D3D9),
    D3D11(GLFW_ANGLE_PLATFORM_TYPE_D3D11),
    VULKAN(GLFW_ANGLE_PLATFORM_TYPE_VULKAN),
    METAL(GLFW_ANGLE_PLATFORM_TYPE_METAL);

    private final int id;

    AnglePlatform(int id) {
        this.id = id;
    }

    public int get() {
        return id;
    }
}
