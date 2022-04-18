package org.yah.games.glsupport.buffer.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum DrawMode implements GLEnum {
    GL_POINTS(GLContext.GL_POINTS),
    GL_LINES(GLContext.GL_LINES),
    GL_LINE_LOOP(GLContext.GL_LINE_LOOP),
    GL_LINE_STRIP(GLContext.GL_LINE_STRIP),
    GL_TRIANGLES(GLContext.GL_TRIANGLES),
    GL_TRIANGLE_STRIP(GLContext.GL_TRIANGLE_STRIP),
    GL_TRIANGLE_FAN(GLContext.GL_TRIANGLE_FAN);

    public static final int COUNT = values().length;

    private final int id;

    DrawMode(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
