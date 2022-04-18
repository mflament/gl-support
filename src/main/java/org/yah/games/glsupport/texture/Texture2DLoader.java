package org.yah.games.glsupport.texture;

import org.lwjgl.BufferUtils;
import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.texture.enums.TextureFormat;
import org.yah.games.glsupport.texture.enums.TextureInternalFormat;
import org.yah.games.glsupport.utils.InputStreamSupplier;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Texture2DLoader {
    private final GLContext context;

    public Texture2DLoader(GLContext context) {
        this.context = Objects.requireNonNull(context, "context is null");
    }

    public GLTexture2D load(Path file) throws IOException {
        return create(() -> Files.newInputStream(file));
    }

    public GLTexture2D load(String resourcePath) throws IOException {
        ClassLoader classLoader = GLTexture2D.class.getClassLoader();
        return create(() -> classLoader.getResourceAsStream(resourcePath));
    }

    private GLTexture2D create(InputStreamSupplier inputStreamSupplier) throws IOException {
        try (InputStream is = inputStreamSupplier.get()) {
            BufferedImage image = ImageIO.read(is);
            Raster raster = image.getData();
            DataBuffer dataBuffer = raster.getDataBuffer();
            Texture2DBuilder builder = new Texture2DBuilder(context);
            if (dataBuffer instanceof DataBufferByte) {
                int numBands = raster.getNumBands();
                if (numBands == 1) {
                    builder.internalFormat(TextureInternalFormat.GL_R8).format(TextureFormat.GL_RED);
                } else if (numBands == 3) {
                    builder.internalFormat(TextureInternalFormat.GL_RGB8).format(TextureFormat.GL_RGB);
                } else if (numBands == 4) {
                    builder.internalFormat(TextureInternalFormat.GL_RGBA8).format(TextureFormat.GL_RGBA);
                } else throw new UnsupportedOperationException("Unsupported numBands " + numBands);
                byte[] data = ((DataBufferByte) dataBuffer).getData();
                ByteBuffer buffer = BufferUtils.createByteBuffer(data.length);
                buffer.put(data, 0, data.length);
                buffer.position(0);
                return builder.create(image.getWidth(), image.getHeight(), buffer);
            } else throw new UnsupportedOperationException("Unsupported data buffer " + dataBuffer);
        }
    }
}
