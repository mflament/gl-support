package org.yah.games.glsupport.buffer;

import org.yah.games.glsupport.GLState;
import org.yah.games.glsupport.buffer.enums.DrawMode;
import org.yah.games.glsupport.context.GLContext;

import java.util.Objects;

public class DrawableVBO {
    protected final GLContext context;
    protected final int drawMode;
    protected final int vao;
    protected int count;


    public DrawableVBO(GLContext context, DrawMode drawMode, int vao, int count) {
        this.context = Objects.requireNonNull(context, "context is null");
        this.drawMode = Objects.requireNonNull(drawMode, "drawMode is null").get();
        this.vao = vao;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public GLContext getContext() {
        return context;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void draw() {
        draw(0, count);
    }

    public void draw(int first, int count) {
        GLState state = context.getState();
        state.bindVertexArray(vao);
        context.glDrawArrays(drawMode, first, count);
    }
}
