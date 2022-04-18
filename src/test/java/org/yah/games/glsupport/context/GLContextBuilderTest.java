package org.yah.games.glsupport.context;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lwjgl.egl.EGL;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Configuration;
import org.yah.games.glsupport.context.enums.ClientAPI;
import org.yah.games.glsupport.context.enums.ContextCreationAPI;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class GLContextBuilderTest {

    @BeforeEach
    void beforeEach() {
        Configuration.EGL_EXPLICIT_INIT.set(true);
        Configuration.OPENGLES_EXPLICIT_INIT.set(true);
    }

    @AfterEach
    void afterEach() {
        GLES.destroy();
        EGL.destroy();
        GLFW.glfwTerminate();
    }

    @Test
    void buildOpenGL() {
        GLContext context = new GLContextBuilder()
                .visible(false)
                .clientAPI(ClientAPI.OPENGL_API)
                .build();
        System.out.println(context.getContextInfo());
        assertInstanceOf(GL33Context.class, context);
        context.delete();
    }

    @Test
    void buildGLES() {
        GLES.create("./angle/windows/libGLESv2");
        GLContext context = new GLContextBuilder()
                .visible(false)
                .clientAPI(ClientAPI.OPENGL_ES_API)
                .build();
        System.out.println(context.getContextInfo());
        assertInstanceOf(GLES30Context.class, context);
        context.delete();
    }

    @Test
    void buildAngleGLES() {
        EGL.create("./angle/windows/libEGL");
        GLES.create("./angle/windows/libGLESv2");

        GLContext context = new GLContextBuilder()
                .visible(false)
                .contextCreationAPI(ContextCreationAPI.EGL)
                .clientAPI(ClientAPI.OPENGL_ES_API)
                .build();
        System.out.println(context.getContextInfo());
        assertInstanceOf(GLES30Context.class, context);
        context.delete();
    }
}