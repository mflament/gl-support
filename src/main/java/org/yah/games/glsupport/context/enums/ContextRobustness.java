package org.yah.games.glsupport.context.enums;

import static org.lwjgl.glfw.GLFW.*;

public enum ContextRobustness implements GLFWEnum {
    NO_RESET_NOTIFICATION(GLFW_NO_RESET_NOTIFICATION),
    LOSE_CONTEXT_ON_RESET(GLFW_LOSE_CONTEXT_ON_RESET),
    NO_ROBUSTNESS(GLFW_NO_ROBUSTNESS);

    public final int id;

    ContextRobustness(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
