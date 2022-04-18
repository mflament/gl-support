package org.yah.games.glsupport.texture;

import org.yah.games.glsupport.texture.enums.TextureFormat;
import org.yah.games.glsupport.texture.enums.TextureInternalFormat;
import org.yah.games.glsupport.texture.enums.TextureType;

public class GLTexture2D {
    private final int texture;
    private final TextureInternalFormat internalFormat;
    private final TextureFormat format;
    private final TextureType type;
    private final int width;
    private final int height;

    public GLTexture2D(int texture, TextureInternalFormat internalFormat, TextureFormat format,
                       TextureType type, int width, int height) {
        this.texture = texture;
        this.internalFormat = internalFormat;
        this.format = format;
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public int get() {
        return texture;
    }

    public TextureInternalFormat getInternalFormat() {
        return internalFormat;
    }

    public TextureFormat getFormat() {
        return format;
    }

    public TextureType getType() {
        return type;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
