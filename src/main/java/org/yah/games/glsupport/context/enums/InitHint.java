package org.yah.games.glsupport.context.enums;

import org.lwjgl.glfw.GLFW;

public enum InitHint implements GLFWEnum {
    GLFW_JOYSTICK_HAT_BUTTONS(GLFW.GLFW_JOYSTICK_HAT_BUTTONS),
    GLFW_ANGLE_PLATFORM_TYPE(GLFW.GLFW_ANGLE_PLATFORM_TYPE),
    GLFW_COCOA_CHDIR_RESOURCES(GLFW.GLFW_COCOA_CHDIR_RESOURCES),
    GLFW_COCOA_MENUBAR(GLFW.GLFW_COCOA_MENUBAR),
    GLFW_PLATFORM(GLFW.GLFW_PLATFORM),
    GLFW_X11_XCB_VULKAN_SURFACE(GLFW.GLFW_X11_XCB_VULKAN_SURFACE);

    private final int id;

    InitHint(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }

}
