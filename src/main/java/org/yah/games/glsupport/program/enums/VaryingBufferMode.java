package org.yah.games.glsupport.program.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum VaryingBufferMode implements GLEnum {
    GL_INTERLEAVED_ATTRIBS(GLContext.GL_INTERLEAVED_ATTRIBS),
    GL_SEPARATE_ATTRIBS(GLContext.GL_SEPARATE_ATTRIBS);

    private final int id;

    VaryingBufferMode(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
