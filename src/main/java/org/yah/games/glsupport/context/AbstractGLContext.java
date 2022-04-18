package org.yah.games.glsupport.context;

import org.yah.games.glsupport.GLState;

import static org.lwjgl.glfw.GLFW.glfwDestroyWindow;
import static org.lwjgl.glfw.GLFW.glfwMakeContextCurrent;
import static org.lwjgl.system.MemoryUtil.NULL;

public abstract class AbstractGLContext implements GLContext {

    protected final long window;
    protected final GLState state;

    public AbstractGLContext(long window) {
        this.window = window;
        this.state = new GLState(this);
    }

    @Override
    public long window() {
        return window;
    }

    @Override
    public final void makeCurrent() {
        glfwMakeContextCurrent(window);
        makeCurrent(window);
    }

    @Override
    public final void unmakeCurrent() {
        makeCurrent(NULL);
        glfwMakeContextCurrent(NULL);
    }

    @Override
    public GLState getState() {
        return state;
    }

    @Override
    public ContextInfo getContextInfo() {
        return new ContextInfo(
                getContextClass().getSimpleName(),
                glGetString(GL_RENDERER),
                glGetString(GL_VENDOR),
                glGetString(GL_VERSION),
                glGetInteger(GL_MAJOR_VERSION),
                glGetInteger(GL_MINOR_VERSION)
        );
    }

    @Override
    public void delete() {
        makeCurrent(0);
        glfwDestroyWindow(window);
    }

    protected abstract Class<?> getContextClass();

    protected abstract void makeCurrent(long window);

}
