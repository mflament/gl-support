package org.yah.games.glsupport.buffer;

import org.yah.games.glsupport.buffer.enums.FloatPointerAttributeType;
import org.yah.games.glsupport.buffer.enums.IntPointerAttributeType;
import org.yah.games.glsupport.context.GLContext;

final class PointerAttributes {
    private PointerAttributes() {
    }

    static PointerAttribute floatAttribute(int index, int size, FloatPointerAttributeType type, boolean normalized, int offset) {
        return new FloatPointerAttribute(index, size, type, normalized, offset);
    }

    static PointerAttribute intAttribute(int index, int size, IntPointerAttributeType type, int offset) {
        return new IntPointerAttribute(index, size, type, offset);
    }

    interface PointerAttribute {
        int getIndex();

        int getSize();

        int getAttributeBytes();

        int getComponentBytes();

        default boolean isFloatAttribute() {
            return false;
        }

        default FloatPointerAttribute asFloatAttribute() {
            throw new UnsupportedOperationException(this.toString());
        }

        default boolean isIntAttribute() {
            return false;
        }

        default IntPointerAttribute asIntAttribute() {
            throw new UnsupportedOperationException(this.toString());
        }

        int getOffset();
    }

    static abstract class AbstractPointerAttribute implements PointerAttribute {
        protected final int index;
        protected final int size;
        protected final int componentBytes;
        protected final int offset;

        public AbstractPointerAttribute(int index, int size, int componentBytes, int offset) {
            this.index = index;
            this.size = size;
            this.componentBytes = componentBytes;
            this.offset = offset;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getComponentBytes() {
            return componentBytes;
        }

        @Override
        public int getAttributeBytes() {
            return size * componentBytes;
        }

        @Override
        public int getOffset() {
            return offset;
        }

        protected static int getComponentBytes(int typeId) {
            switch (typeId) {
                case GLContext.GL_BYTE:
                case GLContext.GL_UNSIGNED_BYTE:
                    return 1;
                case GLContext.GL_SHORT:
                case GLContext.GL_UNSIGNED_SHORT:
                case GLContext.GL_HALF_FLOAT:
                    return 2;
                case GLContext.GL_FLOAT:
                case GLContext.GL_INT:
                case GLContext.GL_UNSIGNED_INT:
                    return 4;
                default:
                    throw new IllegalArgumentException("Invalid type " + typeId);
            }
        }
    }


    public static final class FloatPointerAttribute extends AbstractPointerAttribute {
        private final FloatPointerAttributeType type;
        private final boolean normalized;

        private FloatPointerAttribute(int index, int size, FloatPointerAttributeType type, boolean normalized, int offset) {
            super(index, size, getComponentBytes(type.get()), offset);
            this.type = type;
            this.normalized = normalized;
        }

        public FloatPointerAttributeType getType() {
            return type;
        }

        public boolean isNormalized() {
            return normalized;
        }

        @Override
        public boolean isFloatAttribute() {
            return true;
        }

        @Override
        public FloatPointerAttribute asFloatAttribute() {
            return this;
        }
    }

    public static final class IntPointerAttribute extends AbstractPointerAttribute {
        private final IntPointerAttributeType type;

        private IntPointerAttribute(int index, int size, IntPointerAttributeType type, int offset) {
            super(index, size, getComponentBytes(type.get()), offset);
            this.type = type;
        }

        public IntPointerAttributeType getType() {
            return type;
        }

        @Override
        public boolean isIntAttribute() {
            return true;
        }

        @Override
        public IntPointerAttribute asIntAttribute() {
            return this;
        }
    }

}
