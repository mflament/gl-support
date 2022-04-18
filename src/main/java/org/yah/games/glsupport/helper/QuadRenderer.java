package org.yah.games.glsupport.helper;

import org.yah.games.glsupport.context.GLContext;

import java.util.Objects;

public class QuadRenderer {

    private final GLContext context;
    private final QuadBuffer quadBuffer;
    private final int program;

    public QuadRenderer(GLContext context, QuadBuffer quadBuffer, int program) {
        this.context = Objects.requireNonNull(context, "context is null");
        this.quadBuffer = Objects.requireNonNull(quadBuffer, "quadBuffer is null");
        this.program = program;
    }

    public void draw() {
        context.getState().useProgram(program);
        quadBuffer.draw();
    }
}
