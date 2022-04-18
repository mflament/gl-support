package org.yah.games.glsupport;

import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.context.GLContextBuilder;
import org.yah.games.glsupport.helper.QuadBuffer;
import org.yah.games.glsupport.helper.QuadRenderer;
import org.yah.games.glsupport.program.ProgramBuilder;

import java.io.IOException;

import static org.lwjgl.glfw.GLFW.*;

class Sandbox {

    public static void main(String[] args) throws IOException {
        GLContext context = new GLContextBuilder()
                .debug(true)
                .build();
        long window = context.window();

        glfwSwapInterval(1);
        GLFWWindowSizeCallback resizeCallback = GLFWWindowSizeCallback.create((w, width, height) -> context.glViewport(0, 0, width, height));
        glfwSetWindowSizeCallback(window, resizeCallback);

        int[] width = new int[1];
        int[] height = new int[1];
        glfwGetWindowSize(window, width, height);
        context.glViewport(0, 0, width[0], height[0]);

        supported(context);

        context.delete();
        resizeCallback.free();
        glfwTerminate();
    }

    public static void supported(GLContext context) throws IOException {
        long window = context.window();

        int program = new ProgramBuilder(context)
                .vsResource("quad-vs.glsl", s -> "#version 330\n" + s)
                .fsResource("quad-fs.glsl", s -> "#version 330\n" + s)
                .link();

        context.getState().useProgram(program);
        QuadBuffer quadBuffer = new QuadBuffer(context);
        QuadRenderer renderer = new QuadRenderer(context, quadBuffer, program);

        while (!glfwWindowShouldClose(window)) {
            context.glClearColor(0, 0, 1, 1);
            context.glClear(GLContext.GL_COLOR_BUFFER_BIT | GLContext.GL_DEPTH_BUFFER_BIT);

            renderer.draw();

            glfwSwapBuffers(window);

            glfwPollEvents();
        }

        quadBuffer.delete();
        context.glDeleteProgram(program);
    }

}