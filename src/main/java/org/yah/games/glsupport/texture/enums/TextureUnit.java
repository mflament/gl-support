package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureUnit implements GLEnum {
    GL_TEXTURE0(GLContext.GL_TEXTURE0),
    GL_TEXTURE1(GLContext.GL_TEXTURE1),
    GL_TEXTURE2(GLContext.GL_TEXTURE2),
    GL_TEXTURE3(GLContext.GL_TEXTURE3),
    GL_TEXTURE4(GLContext.GL_TEXTURE4),
    GL_TEXTURE5(GLContext.GL_TEXTURE5),
    GL_TEXTURE6(GLContext.GL_TEXTURE6),
    GL_TEXTURE7(GLContext.GL_TEXTURE7),
    GL_TEXTURE8(GLContext.GL_TEXTURE8),
    GL_TEXTURE9(GLContext.GL_TEXTURE9),
    GL_TEXTURE10(GLContext.GL_TEXTURE10),
    GL_TEXTURE11(GLContext.GL_TEXTURE11),
    GL_TEXTURE12(GLContext.GL_TEXTURE12),
    GL_TEXTURE13(GLContext.GL_TEXTURE13),
    GL_TEXTURE14(GLContext.GL_TEXTURE14),
    GL_TEXTURE15(GLContext.GL_TEXTURE15),
    GL_TEXTURE16(GLContext.GL_TEXTURE16),
    GL_TEXTURE17(GLContext.GL_TEXTURE17),
    GL_TEXTURE18(GLContext.GL_TEXTURE18),
    GL_TEXTURE19(GLContext.GL_TEXTURE19),
    GL_TEXTURE20(GLContext.GL_TEXTURE20),
    GL_TEXTURE21(GLContext.GL_TEXTURE21),
    GL_TEXTURE22(GLContext.GL_TEXTURE22),
    GL_TEXTURE23(GLContext.GL_TEXTURE23),
    GL_TEXTURE24(GLContext.GL_TEXTURE24),
    GL_TEXTURE25(GLContext.GL_TEXTURE25),
    GL_TEXTURE26(GLContext.GL_TEXTURE26),
    GL_TEXTURE27(GLContext.GL_TEXTURE27),
    GL_TEXTURE28(GLContext.GL_TEXTURE28),
    GL_TEXTURE29(GLContext.GL_TEXTURE29),
    GL_TEXTURE30(GLContext.GL_TEXTURE30),
    GL_TEXTURE31(GLContext.GL_TEXTURE31);

    public static final int COUNT = TextureUnit.values().length;

    private final int id;

    TextureUnit(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }

}
