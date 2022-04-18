package org.yah.games.glsupport.buffer;

import org.yah.games.glsupport.GLState;
import org.yah.games.glsupport.buffer.PointerAttributes.FloatPointerAttribute;
import org.yah.games.glsupport.buffer.PointerAttributes.IntPointerAttribute;
import org.yah.games.glsupport.buffer.PointerAttributes.PointerAttribute;
import org.yah.games.glsupport.buffer.enums.FloatPointerAttributeType;
import org.yah.games.glsupport.buffer.enums.IntPointerAttributeType;
import org.yah.games.glsupport.context.GLContext;
import org.yah.games.glsupport.utils.GLUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.IntFunction;

public class VertexArrayBuilder {
    private final GLContext context;
    private int attributeCount;
    private int offset;
    private final List<PointerAttribute> pointerAttributes = new ArrayList<>();

    public VertexArrayBuilder(GLContext context) {
        this.context = Objects.requireNonNull(context, "context is null");
    }

    public VertexArrayBuilder floatAttributePointer(int size, FloatPointerAttributeType type) {
        return floatAttributePointer(size, type, false, 0);
    }

    public VertexArrayBuilder floatAttributePointer(int size, FloatPointerAttributeType type, boolean normalized, int offset) {
        push(offset, o -> PointerAttributes.floatAttribute(attributeCount++, size, type, normalized, o));
        return this;
    }

    public VertexArrayBuilder intAttributePointer(int size, IntPointerAttributeType type) {
        return intAttributePointer(size, type, 0);
    }

    public VertexArrayBuilder intAttributePointer(int size, IntPointerAttributeType type, int offset) {
        push(offset, o -> PointerAttributes.intAttribute(attributeCount++, size, type, o));
        return this;
    }

    public int build() {
        int stride = offset;

        GLState state = context.getState();
        int vao = GLUtils.check(context.glGenVertexArrays(), "vertex array");
        state.bindVertexArray(vao);

        for (int i = 0; i < attributeCount; i++)
            context.glEnableVertexAttribArray(i);

        for (PointerAttribute attribute : pointerAttributes) {
            if (attribute.isFloatAttribute()) {
                FloatPointerAttribute floatAttribute = attribute.asFloatAttribute();
                context.glVertexAttribPointer(attribute.getIndex(), attribute.getSize(), floatAttribute.getType().get(),
                        floatAttribute.isNormalized(), stride, attribute.getOffset());
            } else {
                IntPointerAttribute intPointerAttribute = attribute.asIntAttribute();
                context.glVertexAttribIPointer(attribute.getIndex(), attribute.getSize(), intPointerAttribute.getType().get(),
                        stride, attribute.getOffset());
            }
        }
        state.bindVertexArray(GLContext.GL_NONE);
        return vao;
    }

    private void push(int offset, IntFunction<PointerAttribute> factory) {
        int effectiveOffset = offset == 0 ? this.offset : offset;
        PointerAttribute attributePointer = factory.apply(effectiveOffset);
        pointerAttributes.add(attributePointer);
        this.offset += attributePointer.getAttributeBytes();
    }
}
