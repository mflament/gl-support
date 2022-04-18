package org.yah.games.glsupport.buffer;

import org.yah.games.glsupport.buffer.enums.BufferTarget;
import org.yah.games.glsupport.buffer.enums.BufferUsage;
import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.utils.GLUtils;

import java.nio.ByteBuffer;

public final class BufferHelper {

    public static int createVBO(GLContext context, float[] data, BufferUsage usage) {
        int buffer = GLUtils.check(context.glGenBuffers(), "buffer");
        context.getState().bindBuffer(BufferTarget.GL_ARRAY_BUFFER, buffer);
        context.glBufferData(GLContext.GL_ARRAY_BUFFER, data, usage.get());
        return buffer;
    }

    public static int createIBO(GLContext context, int[] data, BufferUsage usage) {
        int buffer = GLUtils.check(context.glGenBuffers(), "buffer");
        context.getState().bindBuffer(BufferTarget.GL_ELEMENT_ARRAY_BUFFER, buffer);
        context.glBufferData(GLContext.GL_ELEMENT_ARRAY_BUFFER, data, usage.get());
        return buffer;
    }

    public static int createIBO(GLContext context, short[] data, BufferUsage usage) {
        int buffer = GLUtils.check(context.glGenBuffers(), "buffer");
        context.getState().bindBuffer(BufferTarget.GL_ELEMENT_ARRAY_BUFFER, buffer);
        context.glBufferData(GLContext.GL_ELEMENT_ARRAY_BUFFER, data, usage.get());
        return buffer;
    }

    public static int createUniformBuffer(GLContext context, ByteBuffer data, BufferUsage usage) {
        int buffer = GLUtils.check(context.glGenBuffers(), "buffer");
        context.getState().bindBuffer(BufferTarget.GL_UNIFORM_BUFFER, buffer);
        context.glBufferData(GLContext.GL_UNIFORM_BUFFER, data, usage.get());
        return buffer;
    }

    public static int createUniformBuffer(GLContext context, int size, BufferUsage usage) {
        int buffer = GLUtils.check(context.glGenBuffers(), "buffer");
        context.getState().bindBuffer(BufferTarget.GL_UNIFORM_BUFFER, buffer);
        context.glBufferData(GLContext.GL_UNIFORM_BUFFER, size, usage.get());
        return buffer;
    }

}
