package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum PixelStoreName implements GLEnum {
    GL_PACK_ROW_LENGTH(GLContext.GL_PACK_ROW_LENGTH),
    GL_PACK_SKIP_ROWS(GLContext.GL_PACK_SKIP_ROWS),
    GL_PACK_SKIP_PIXELS(GLContext.GL_PACK_SKIP_PIXELS),
    GL_PACK_ALIGNMENT(GLContext.GL_PACK_ALIGNMENT),
    GL_UNPACK_ROW_LENGTH(GLContext.GL_UNPACK_ROW_LENGTH),
    GL_UNPACK_IMAGE_HEIGHT(GLContext.GL_UNPACK_IMAGE_HEIGHT),
    GL_UNPACK_SKIP_PIXELS(GLContext.GL_UNPACK_SKIP_PIXELS),
    GL_UNPACK_SKIP_ROWS(GLContext.GL_UNPACK_SKIP_ROWS),
    GL_UNPACK_SKIP_IMAGES(GLContext.GL_UNPACK_SKIP_IMAGES),
    GL_UNPACK_ALIGNMENT(GLContext.GL_UNPACK_ALIGNMENT);

    public static final int COUNT = values().length;

    private final int id;

    PixelStoreName(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
