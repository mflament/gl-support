package org.yah.games.glsupport.texture;

import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.texture.enums.*;
import org.yah.games.glsupport.utils.GLUtils;

import javax.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class Texture2DBuilder {
    private final GLContext context;
    private final int texture;

    private TextureInternalFormat internalFormat = TextureInternalFormat.GL_RGBA32F;
    private TextureFormat format = TextureFormat.GL_RGBA;
    private TextureType type = TextureType.GL_UNSIGNED_BYTE;

    private final Map<PixelStoreName, Integer> pixelStoreParameters = new EnumMap<>(PixelStoreName.class);
    private TextureMagFilter magFilter;
    private TextureMinFilter minFilter;

    private TextureWrappingMode wrapS;
    private TextureWrappingMode wrapT;

    public Texture2DBuilder(GLContext context) {
        this.context = Objects.requireNonNull(context, "context is null");
        texture = GLUtils.check(context.glGenTextures(), "texture");
    }

    public Texture2DBuilder internalFormat(TextureInternalFormat internalFormat) {
        this.internalFormat = internalFormat;
        return this;
    }

    public Texture2DBuilder format(TextureFormat format) {
        this.format = format;
        return this;
    }

    public Texture2DBuilder type(TextureType type) {
        this.type = type;
        return this;
    }

    public Texture2DBuilder pixelStore(PixelStoreName name, int value) {
        this.pixelStoreParameters.put(name, value);
        return this;
    }

    public Texture2DBuilder minFilter(TextureMinFilter minFilter) {
        this.minFilter = minFilter;
        return this;
    }

    public Texture2DBuilder magFilter(TextureMagFilter magFilter) {
        this.magFilter = magFilter;
        return this;
    }

    public Texture2DBuilder wrapS(TextureWrappingMode wrapS) {
        this.wrapS = wrapS;
        return this;
    }

    public Texture2DBuilder wrapT(TextureWrappingMode wrapT) {
        this.wrapT = wrapT;
        return this;
    }

    public Texture2DBuilder dataTexture() {
        wrapS = wrapT = TextureWrappingMode.GL_CLAMP_TO_EDGE;
        minFilter = TextureMinFilter.GL_NEAREST;
        magFilter = TextureMagFilter.GL_NEAREST;
        return this;
    }

    public GLTexture2D create(int width, int height, @Nullable IntBuffer buffer) {
        GLTexture2D texture2D = createTexture(width, height);
        context.glTexImage2D(GLContext.GL_TEXTURE_2D, 0, internalFormat.get(), width, height, 0, format.get(), type.get(), buffer);
        return texture2D;
    }

    public GLTexture2D create(int width, int height, @Nullable FloatBuffer buffer) {
        GLTexture2D texture2D = createTexture(width, height);
        context.glTexImage2D(GLContext.GL_TEXTURE_2D, 0, internalFormat.get(), width, height, 0, format.get(), type.get(), buffer);
        return texture2D;
    }

    public GLTexture2D create(int width, int height, @Nullable ByteBuffer buffer) {
        GLTexture2D texture2D = createTexture(width, height);
        context.glTexImage2D(GLContext.GL_TEXTURE_2D, 0, internalFormat.get(), width, height, 0, format.get(), type.get(), buffer);
        return texture2D;
    }

    public GLTexture2D create(int width, int height) {
        return create(width, height, (ByteBuffer) null);
    }

    private GLTexture2D createTexture(int width, int height) {
        context.getState().bindTexture(TextureTarget.GL_TEXTURE_2D, texture);
        int target = TextureTarget.GL_TEXTURE_2D.get();
        if (minFilter != null)
            context.glTexParameteri(target, GLContext.GL_TEXTURE_MIN_FILTER, minFilter.get());
        if (magFilter != null)
            context.glTexParameteri(target, GLContext.GL_TEXTURE_MAG_FILTER, magFilter.get());
        if (wrapS != null)
            context.glTexParameteri(target, GLContext.GL_TEXTURE_WRAP_S, wrapS.get());
        if (wrapT != null)
            context.glTexParameteri(target, GLContext.GL_TEXTURE_WRAP_T, wrapT.get());

        pixelStoreParameters.forEach((name, value) -> context.glPixelStorei(name.get(), value));

        return new GLTexture2D(texture, internalFormat, format, type, width, height);
    }

}
