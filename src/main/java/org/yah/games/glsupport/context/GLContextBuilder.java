package org.yah.games.glsupport.context;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;
import org.yah.games.glsupport.context.enums.*;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public class GLContextBuilder {

    private final Map<Integer, Integer> initHints = new LinkedHashMap<>();
    private final Map<Integer, Integer> windowHints = new LinkedHashMap<>();

    private String windowName = "glfw window";
    private int width = 640;
    private int height = 480;
    private long monitor;
    private long share;
    private boolean makeCurrent = true;
    private boolean debug;

    public GLContextBuilder width(int width) {
        this.width = width;
        return this;
    }

    public GLContextBuilder height(int height) {
        this.height = height;
        return this;
    }

    public GLContextBuilder share(Long share) {
        this.share = share;
        return this;
    }

    public GLContextBuilder windowName(String windowName) {
        this.windowName = windowName;
        return this;
    }

    public GLContextBuilder debug(boolean debug) {
        this.debug = debug;
        return this;
    }

    public GLContextBuilder monitor(Long monitor) {
        this.monitor = monitor;
        return this;
    }

    public GLContextBuilder majorVersion(int version) {
        this.windowHints.put(GLFW_CONTEXT_VERSION_MAJOR, version);
        return this;
    }

    public GLContextBuilder minorVersion(int version) {
        this.windowHints.put(GLFW_CONTEXT_VERSION_MINOR, version);
        return this;
    }

    public GLContextBuilder clientAPI(ClientAPI clientAPI) {
        this.windowHints.put(GLFW_CLIENT_API, clientAPI.id);
        return this;
    }

    public GLContextBuilder contextRobustness(ContextRobustness contextRobustness) {
        this.windowHints.put(GLFW_CONTEXT_ROBUSTNESS, contextRobustness.id);
        return this;
    }

    public GLContextBuilder contextNoError(boolean contextNoError) {
        this.windowHints.put(GLFW_CONTEXT_NO_ERROR, glfwBoolean(contextNoError));
        return this;
    }

    public GLContextBuilder contextCreationAPI(ContextCreationAPI creationApi) {
        this.windowHints.put(GLFW_CONTEXT_CREATION_API, creationApi.id);
        return this;
    }

    public GLContextBuilder openGLProfile(OpenGLProfile profile) {
        this.windowHints.put(GLFW_OPENGL_PROFILE, profile.id);
        return this;
    }

    public GLContextBuilder forwardCompat(boolean forwardCompat) {
        this.windowHints.put(GLFW_OPENGL_FORWARD_COMPAT, glfwBoolean(forwardCompat));
        return this;
    }

    public GLContextBuilder initHint(InitHint hint, int value) {
        this.initHints.put(hint.get(), value);
        return this;
    }

    public GLContextBuilder windowHint(WindowHint hint, int value) {
        this.windowHints.put(hint.get(), value);
        return this;
    }

    public GLContextBuilder visible(boolean visible) {
        this.windowHints.put(GLFW_VISIBLE, glfwBoolean(visible));
        return this;
    }

    public GLContextBuilder makeCurrent(boolean makeCurrent) {
        this.makeCurrent = makeCurrent;
        return this;
    }

    private void setHint(int name, int value) {
        if (!windowHints.containsKey(name))
            glfwWindowHint(name, value);
    }

    public GLContext build() {
        initHints.forEach(GLFW::glfwInitHint);
        if (!glfwInit())
            throw new IllegalStateException("Error initializing GLFW");

        windowHints.putIfAbsent(GLFW_OPENGL_DEBUG_CONTEXT, glfwBoolean(debug));
        windowHints.putIfAbsent(GLFW_CLIENT_API, GLFW_OPENGL_API);

        int clientApi = windowHints.get(GLFW_CLIENT_API);
        if (clientApi == GLFW_OPENGL_API) {
            windowHints.putIfAbsent(GLFW_CONTEXT_VERSION_MAJOR, 3);
            windowHints.putIfAbsent(GLFW_CONTEXT_VERSION_MINOR, 3);
        } else if (clientApi == GLFW_OPENGL_ES_API) {
            windowHints.putIfAbsent(GLFW_CONTEXT_VERSION_MAJOR, 3);
            windowHints.putIfAbsent(GLFW_CONTEXT_VERSION_MINOR, 0);
        } else
            throw new IllegalStateException("Invalid client api " + clientApi);

        long window = createWindow();
        GLContext context = clientApi == GLFW_OPENGL_API ? new GL33Context(window) : new GLES30Context(window);
        if (makeCurrent)
            context.makeCurrent();
        return context;
    }

    private long createWindow() {
        windowHints.forEach(GLFW::glfwWindowHint);

        long window = glfwCreateWindow(width, height, windowName, monitor, share);
        if (window == NULL) {
            PointerBuffer pb = BufferUtils.createPointerBuffer(1024);
            int code = glfwGetError(pb);
            String message = "Failed to create the GLFW window " + Long.toHexString(code);
            long messagePtr = pb.get(0);
            if (messagePtr != 0) message += " : " + MemoryUtil.memASCII(pb.get(0));
            throw new RuntimeException(message);
        }
        return window;
    }

    private static int glfwBoolean(boolean b) {
        return b ? GLFW_TRUE : GLFW_FALSE;
    }

}
