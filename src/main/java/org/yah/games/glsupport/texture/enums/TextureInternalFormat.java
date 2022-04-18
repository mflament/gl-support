package org.yah.games.glsupport.texture.enums;

import org.yah.games.glsupport.GLEnum;
import org.yah.games.glsupport.context.GLContext;

public enum TextureInternalFormat implements GLEnum {
    GL_RGBA(GLContext.GL_RGBA),
    GL_RGB(GLContext.GL_RGB),
    GL_LUMINANCE_ALPHA(GLContext.GL_LUMINANCE_ALPHA),
    GL_LUMINANCE(GLContext.GL_LUMINANCE),
    GL_ALPHA(GLContext.GL_ALPHA),
    GL_DEPTH_COMPONENT16(GLContext.GL_DEPTH_COMPONENT16),
    GL_DEPTH_COMPONENT24(GLContext.GL_DEPTH_COMPONENT24),
    GL_DEPTH_COMPONENT32F(GLContext.GL_DEPTH_COMPONENT32F),
    GL_DEPTH_STENCIL(GLContext.GL_DEPTH_STENCIL),
    GL_R8(GLContext.GL_R8),
    GL_R8_SNORM(GLContext.GL_R8_SNORM),
    GL_RG8(GLContext.GL_RG8),
    GL_RG8_SNORM(GLContext.GL_RG8_SNORM),
    GL_RGB8(GLContext.GL_RGB8),
    GL_RGB8_SNORM(GLContext.GL_RGB8_SNORM),
    GL_RGB565(GLContext.GL_RGB565),
    GL_RGBA4(GLContext.GL_RGBA4),
    GL_RGB5_A1(GLContext.GL_RGB5_A1),
    GL_RGBA8(GLContext.GL_RGBA8),
    GL_RGBA8_SNORM(GLContext.GL_RGBA8_SNORM),
    GL_RGB10_A2(GLContext.GL_RGB10_A2),
    GL_RGB10_A2UI(GLContext.GL_RGB10_A2UI),
    GL_SRGB8(GLContext.GL_SRGB8),
    GL_SRGB8_ALPHA8(GLContext.GL_SRGB8_ALPHA8),
    GL_R16F(GLContext.GL_R16F),
    GL_RG16F(GLContext.GL_RG16F),
    GL_RGB16F(GLContext.GL_RGB16F),
    GL_RGBA16F(GLContext.GL_RGBA16F),
    GL_R32F(GLContext.GL_R32F),
    GL_RG32F(GLContext.GL_RG32F),
    GL_RGB32F(GLContext.GL_RGB32F),
    GL_RGBA32F(GLContext.GL_RGBA32F),
    GL_R11F_G11F_B10F(GLContext.GL_R11F_G11F_B10F),
    GL_RGB9_E5(GLContext.GL_RGB9_E5),
    GL_R8I(GLContext.GL_R8I),
    GL_R8UI(GLContext.GL_R8UI),
    GL_R16I(GLContext.GL_R16I),
    GL_R16UI(GLContext.GL_R16UI),
    GL_R32I(GLContext.GL_R32I),
    GL_R32UI(GLContext.GL_R32UI),
    GL_RG8I(GLContext.GL_RG8I),
    GL_RG8UI(GLContext.GL_RG8UI),
    GL_RG16I(GLContext.GL_RG16I),
    GL_RG16UI(GLContext.GL_RG16UI),
    GL_RG32I(GLContext.GL_RG32I),
    GL_RG32UI(GLContext.GL_RG32UI),
    GL_RGB8I(GLContext.GL_RGB8I),
    GL_RGB8UI(GLContext.GL_RGB8UI),
    GL_RGB16I(GLContext.GL_RGB16I),
    GL_RGB16UI(GLContext.GL_RGB16UI),
    GL_RGB32I(GLContext.GL_RGB32I),
    GL_RGB32UI(GLContext.GL_RGB32UI),
    GL_RGBA8I(GLContext.GL_RGBA8I),
    GL_RGBA8UI(GLContext.GL_RGBA8UI),
    GL_RGBA16I(GLContext.GL_RGBA16I),
    GL_RGBA16UI(GLContext.GL_RGBA16UI),
    GL_RGBA32I(GLContext.GL_RGBA32I),
    GL_RGBA32UI(GLContext.GL_RGBA32UI);

    private final int id;

    TextureInternalFormat(int id) {
        this.id = id;
    }

    @Override
    public int get() {
        return id;
    }
}
