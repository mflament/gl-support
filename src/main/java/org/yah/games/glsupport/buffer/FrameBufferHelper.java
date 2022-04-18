package org.yah.games.glsupport.buffer;

import org.lwjgl.BufferUtils;
import org.yah.games.glsupport.buffer.enums.AttachmentPoint;
import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.texture.GLTexture2D;

import java.nio.IntBuffer;
import java.util.List;
import java.util.Objects;

public class FrameBufferHelper {

    private final GLContext context;
    private final IntBuffer drawBuffers = BufferUtils.createIntBuffer(AttachmentPoint.COUNT);

    public FrameBufferHelper(GLContext context) {
        this.context = Objects.requireNonNull(context, "context is null");
    }

    public void attach(int frameBuffer, GLTexture2D target) {
        attach(frameBuffer, List.of(target));
    }

    public void attach(int frameBuffer, List<GLTexture2D> targets) {
        int attachmentPoint = GLContext.GL_COLOR_ATTACHMENT0;
        context.getState().bindFrameBuffer(frameBuffer);
        drawBuffers.position(0);
        for (GLTexture2D target : targets) {
            context.glFramebufferTexture2D(GLContext.GL_FRAMEBUFFER, attachmentPoint, GLContext.GL_TEXTURE_2D, target.get(), 0);
            drawBuffers.put(attachmentPoint);
            attachmentPoint++;
        }
        drawBuffers.flip();
        context.glDrawBuffers(drawBuffers);
    }

}
