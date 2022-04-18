package org.yah.games.glsupport.context;

import org.lwjgl.opengles.GLES30;
import javax.annotation.processing.Generated;
import java.nio.IntBuffer;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengles.GLES;

@SuppressWarnings({ "unused", "SpellCheckingInspection" })
@Generated(value = "ContextGenerator", date = "2022-04-18T20:31:24")
public class GLES30Context extends AbstractGLContext {

    public GLES30Context(long window) {
        super(window);
    }

    @Override
    public void glDeleteSamplers(int[] samplers) {
        GLES30.glDeleteSamplers(samplers);
    }

    @Override
    public void glDeleteSamplers(IntBuffer samplers) {
        GLES30.glDeleteSamplers(samplers);
    }

    @Override
    public void glDeleteSamplers(int sampler) {
        GLES30.glDeleteSamplers(sampler);
    }

    @Override
    public int glGenSamplers() {
        return GLES30.glGenSamplers();
    }

    @Override
    public void glGenSamplers(IntBuffer samplers) {
        GLES30.glGenSamplers(samplers);
    }

    @Override
    public void glGenSamplers(int[] samplers) {
        GLES30.glGenSamplers(samplers);
    }

    @Override
    public boolean glIsSampler(int sampler) {
        return GLES30.glIsSampler(sampler);
    }

    @Override
    public void glBindSampler(int unit, int sampler) {
        GLES30.glBindSampler(unit, sampler);
    }

    @Override
    public void glSamplerParameteri(int sampler, int pname, int param) {
        GLES30.glSamplerParameteri(sampler, pname, param);
    }

    @Override
    public void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
        GLES30.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
        GLES30.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public float glGetSamplerParameterf(int sampler, int pname) {
        return GLES30.glGetSamplerParameterf(sampler, pname);
    }

    @Override
    public void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
        GLES30.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
        GLES30.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public void glSamplerParameterfv(int sampler, int pname, FloatBuffer param) {
        GLES30.glSamplerParameterfv(sampler, pname, param);
    }

    @Override
    public void glSamplerParameterfv(int sampler, int pname, float[] param) {
        GLES30.glSamplerParameterfv(sampler, pname, param);
    }

    @Override
    public void glSamplerParameterf(int sampler, int pname, float param) {
        GLES30.glSamplerParameterf(sampler, pname, param);
    }

    @Override
    public void glSamplerParameteriv(int sampler, int pname, int[] param) {
        GLES30.glSamplerParameteriv(sampler, pname, param);
    }

    @Override
    public void glSamplerParameteriv(int sampler, int pname, IntBuffer param) {
        GLES30.glSamplerParameteriv(sampler, pname, param);
    }

    @Override
    public int glGetSamplerParameteri(int sampler, int pname) {
        return GLES30.glGetSamplerParameteri(sampler, pname);
    }

    @Override
    public void glVertexAttribDivisor(int index, int divisor) {
        GLES30.glVertexAttribDivisor(index, divisor);
    }

    @Override
    public long glGetInteger64i(int target, int index) {
        return GLES30.glGetInteger64i(target, index);
    }

    @Override
    public void glWaitSync(long sync, int flags, long timeout) {
        GLES30.glWaitSync(sync, flags, timeout);
    }

    @Override
    public boolean glIsSync(long sync) {
        return GLES30.glIsSync(sync);
    }

    @Override
    public void glDeleteSync(long sync) {
        GLES30.glDeleteSync(sync);
    }

    @Override
    public int glClientWaitSync(long sync, int flags, long timeout) {
        return GLES30.glClientWaitSync(sync, flags, timeout);
    }

    @Override
    public void glGetInteger64i_v(int target, int index, LongBuffer data) {
        GLES30.glGetInteger64i_v(target, index, data);
    }

    @Override
    public void glGetInteger64i_v(int target, int index, long[] data) {
        GLES30.glGetInteger64i_v(target, index, data);
    }

    @Override
    public void glGetInteger64v(int pname, long[] data) {
        GLES30.glGetInteger64v(pname, data);
    }

    @Override
    public void glGetInteger64v(int pname, LongBuffer data) {
        GLES30.glGetInteger64v(pname, data);
    }

    @Override
    public long glFenceSync(int condition, int flags) {
        return GLES30.glFenceSync(condition, flags);
    }

    @Override
    public void glGetSynciv(long sync, int pname, int[] length, int[] values) {
        GLES30.glGetSynciv(sync, pname, length, values);
    }

    @Override
    public void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
        GLES30.glGetSynciv(sync, pname, length, values);
    }

    @Override
    public int glGetSynci(long sync, int pname, IntBuffer length) {
        return GLES30.glGetSynci(sync, pname, length);
    }

    @Override
    public long glGetInteger64(int pname) {
        return GLES30.glGetInteger64(pname);
    }

    @Override
    public void glGetBufferParameteri64v(int target, int pname, long[] params) {
        GLES30.glGetBufferParameteri64v(target, pname, params);
    }

    @Override
    public void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
        GLES30.glGetBufferParameteri64v(target, pname, params);
    }

    @Override
    public long glGetBufferParameteri64(int target, int pname) {
        return GLES30.glGetBufferParameteri64(target, pname);
    }

    @Override
    public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
        GLES30.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override
    public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
        GLES30.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override
    public int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
        return GLES30.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    @Override
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName) {
        GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        return GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    @Override
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        return GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

    @Override
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
        GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override
    public void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
        GLES30.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override
    public void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
        GLES30.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override
    public void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount) {
        GLES30.glDrawElementsInstanced(mode, type, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
        GLES30.glDrawElementsInstanced(mode, count, type, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount) {
        GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount) {
        GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount) {
        GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override
    public void glDrawArraysInstanced(int mode, int first, int count, int instancecount) {
        GLES30.glDrawArraysInstanced(mode, first, count, instancecount);
    }

    @Override
    public void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        GLES30.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    @Override
    public void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
        GLES30.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override
    public void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
        GLES30.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override
    public int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
        return GLES30.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override
    public int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
        return GLES30.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override
    public void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        GLES30.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params) {
        GLES30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
        GLES30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        return GLES30.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    @Override
    public String glGetStringi(int name, int index) {
        return GLES30.glGetStringi(name, index);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
        GLES30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
        GLES30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        GLES30.glVertexAttribI4ui(index, x, y, z, w);
    }

    @Override
    public void glVertexAttribI4iv(int index, int[] v) {
        GLES30.glVertexAttribI4iv(index, v);
    }

    @Override
    public void glVertexAttribI4iv(int index, IntBuffer v) {
        GLES30.glVertexAttribI4iv(index, v);
    }

    @Override
    public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        GLES30.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
        GLES30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
        GLES30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        GLES30.glVertexAttribI4i(index, x, y, z, w);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
        GLES30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
        GLES30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public boolean glIsRenderbuffer(int renderbuffer) {
        return GLES30.glIsRenderbuffer(renderbuffer);
    }

    @Override
    public void glBindRenderbuffer(int target, int renderbuffer) {
        GLES30.glBindRenderbuffer(target, renderbuffer);
    }

    @Override
    public void glUniform1uiv(int location, IntBuffer value) {
        GLES30.glUniform1uiv(location, value);
    }

    @Override
    public void glUniform1uiv(int location, int[] value) {
        GLES30.glUniform1uiv(location, value);
    }

    @Override
    public void glUniform2ui(int location, int v0, int v1) {
        GLES30.glUniform2ui(location, v0, v1);
    }

    @Override
    public void glUniform3ui(int location, int v0, int v1, int v2) {
        GLES30.glUniform3ui(location, v0, v1, v2);
    }

    @Override
    public void glUniform2uiv(int location, IntBuffer value) {
        GLES30.glUniform2uiv(location, value);
    }

    @Override
    public void glUniform2uiv(int location, int[] value) {
        GLES30.glUniform2uiv(location, value);
    }

    @Override
    public void glGetUniformuiv(int program, int location, int[] params) {
        GLES30.glGetUniformuiv(program, location, params);
    }

    @Override
    public void glGetUniformuiv(int program, int location, IntBuffer params) {
        GLES30.glGetUniformuiv(program, location, params);
    }

    @Override
    public void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        GLES30.glUniform4ui(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform4uiv(int location, IntBuffer value) {
        GLES30.glUniform4uiv(location, value);
    }

    @Override
    public void glUniform4uiv(int location, int[] value) {
        GLES30.glUniform4uiv(location, value);
    }

    @Override
    public void glUniform3uiv(int location, IntBuffer value) {
        GLES30.glUniform3uiv(location, value);
    }

    @Override
    public void glUniform3uiv(int location, int[] value) {
        GLES30.glUniform3uiv(location, value);
    }

    @Override
    public int glGetUniformui(int program, int location) {
        return GLES30.glGetUniformui(program, location);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
        return GLES30.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
        return GLES30.glMapBufferRange(target, offset, length, access);
    }

    @Override
    public void glUniform1ui(int location, int v0) {
        GLES30.glUniform1ui(location, v0);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, int[] data) {
        GLES30.glGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, IntBuffer data) {
        GLES30.glGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGenFramebuffers(int[] framebuffers) {
        GLES30.glGenFramebuffers(framebuffers);
    }

    @Override
    public int glGenFramebuffers() {
        return GLES30.glGenFramebuffers();
    }

    @Override
    public void glGenFramebuffers(IntBuffer framebuffers) {
        GLES30.glGenFramebuffers(framebuffers);
    }

    @Override
    public void glGenerateMipmap(int target) {
        GLES30.glGenerateMipmap(target);
    }

    @Override
    public void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        GLES30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override
    public boolean glIsFramebuffer(int framebuffer) {
        return GLES30.glIsFramebuffer(framebuffer);
    }

    @Override
    public void glBindFramebuffer(int target, int framebuffer) {
        GLES30.glBindFramebuffer(target, framebuffer);
    }

    @Override
    public int glGenRenderbuffers() {
        return GLES30.glGenRenderbuffers();
    }

    @Override
    public void glGenRenderbuffers(IntBuffer renderbuffers) {
        GLES30.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public void glGenRenderbuffers(int[] renderbuffers) {
        GLES30.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public void glGenVertexArrays(IntBuffer arrays) {
        GLES30.glGenVertexArrays(arrays);
    }

    @Override
    public void glGenVertexArrays(int[] arrays) {
        GLES30.glGenVertexArrays(arrays);
    }

    @Override
    public int glGenVertexArrays() {
        return GLES30.glGenVertexArrays();
    }

    @Override
    public void glBindVertexArray(int array) {
        GLES30.glBindVertexArray(array);
    }

    @Override
    public int glGetIntegeri(int target, int index) {
        return GLES30.glGetIntegeri(target, index);
    }

    @Override
    public void glBindBufferBase(int target, int index, int buffer) {
        GLES30.glBindBufferBase(target, index, buffer);
    }

    @Override
    public boolean glIsVertexArray(int array) {
        return GLES30.glIsVertexArray(array);
    }

    @Override
    public void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
        GLES30.glBindBufferRange(target, index, buffer, offset, size);
    }

    @Override
    public void glVertexAttribI4uiv(int index, IntBuffer v) {
        GLES30.glVertexAttribI4uiv(index, v);
    }

    @Override
    public void glVertexAttribI4uiv(int index, int[] v) {
        GLES30.glVertexAttribI4uiv(index, v);
    }

    @Override
    public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        GLES30.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Override
    public int glGetVertexAttribIui(int index, int pname) {
        return GLES30.glGetVertexAttribIui(index, pname);
    }

    @Override
    public void glFlushMappedBufferRange(int target, long offset, long length) {
        GLES30.glFlushMappedBufferRange(target, offset, length);
    }

    @Override
    public int glGetRenderbufferParameteri(int target, int pname) {
        return GLES30.glGetRenderbufferParameteri(target, pname);
    }

    @Override
    public int glGetVertexAttribIi(int index, int pname) {
        return GLES30.glGetVertexAttribIi(index, pname);
    }

    @Override
    public int glCheckFramebufferStatus(int target) {
        return GLES30.glCheckFramebufferStatus(target);
    }

    @Override
    public int glGetFragDataLocation(int program, CharSequence name) {
        return GLES30.glGetFragDataLocation(program, name);
    }

    @Override
    public int glGetFragDataLocation(int program, ByteBuffer name) {
        return GLES30.glGetFragDataLocation(program, name);
    }

    @Override
    public void glDeleteFramebuffers(int framebuffer) {
        GLES30.glDeleteFramebuffers(framebuffer);
    }

    @Override
    public void glDeleteFramebuffers(int[] framebuffers) {
        GLES30.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glDeleteFramebuffers(IntBuffer framebuffers) {
        GLES30.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        GLES30.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
        GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
        GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
        GLES30.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
        GLES30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
        GLES30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GLES30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GLES30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
        return GLES30.glGetTransformFeedbackVarying(program, index, size, type);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GLES30.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, int[] params) {
        GLES30.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
        GLES30.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glDeleteRenderbuffers(int renderbuffer) {
        GLES30.glDeleteRenderbuffers(renderbuffer);
    }

    @Override
    public void glDeleteRenderbuffers(int[] renderbuffers) {
        GLES30.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glDeleteRenderbuffers(IntBuffer renderbuffers) {
        GLES30.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        GLES30.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    @Override
    public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        GLES30.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, int[] params) {
        GLES30.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
        GLES30.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glEndTransformFeedback() {
        GLES30.glEndTransformFeedback();
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, int[] params) {
        GLES30.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
        GLES30.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glDeleteVertexArrays(int[] arrays) {
        GLES30.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glDeleteVertexArrays(IntBuffer arrays) {
        GLES30.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glDeleteVertexArrays(int array) {
        GLES30.glDeleteVertexArrays(array);
    }

    @Override
    public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        GLES30.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Override
    public void glBeginTransformFeedback(int primitiveMode) {
        GLES30.glBeginTransformFeedback(primitiveMode);
    }

    @Override
    public void glUniformMatrix4x2fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x2fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x3fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x3fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x4fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x4fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override
    public int glGetProgrami(int program, int pname) {
        return GLES30.glGetProgrami(program, pname);
    }

    @Override
    public void glLinkProgram(int program) {
        GLES30.glLinkProgram(program);
    }

    @Override
    public int glCreateProgram() {
        return GLES30.glCreateProgram();
    }

    @Override
    public void glAttachShader(int program, int shader) {
        GLES30.glAttachShader(program, shader);
    }

    @Override
    public void glDeleteShader(int shader) {
        GLES30.glDeleteShader(shader);
    }

    @Override
    public void glShaderSource(int shader, CharSequence[] string) {
        GLES30.glShaderSource(shader, string);
    }

    @Override
    public void glShaderSource(int shader, CharSequence string) {
        GLES30.glShaderSource(shader, string);
    }

    @Override
    public void glShaderSource(int shader, PointerBuffer string, IntBuffer length) {
        GLES30.glShaderSource(shader, string, length);
    }

    @Override
    public void glShaderSource(int shader, PointerBuffer string, int[] length) {
        GLES30.glShaderSource(shader, string, length);
    }

    @Override
    public boolean glIsProgram(int program) {
        return GLES30.glIsProgram(program);
    }

    @Override
    public void glValidateProgram(int program) {
        GLES30.glValidateProgram(program);
    }

    @Override
    public boolean glIsShader(int shader) {
        return GLES30.glIsShader(shader);
    }

    @Override
    public void glCompileShader(int shader) {
        GLES30.glCompileShader(shader);
    }

    @Override
    public void glUseProgram(int program) {
        GLES30.glUseProgram(program);
    }

    @Override
    public void glDeleteProgram(int program) {
        GLES30.glDeleteProgram(program);
    }

    @Override
    public int glCreateShader(int type) {
        return GLES30.glCreateShader(type);
    }

    @Override
    public void glDetachShader(int program, int shader) {
        GLES30.glDetachShader(program, shader);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void glUniform4fv(int location, FloatBuffer value) {
        GLES30.glUniform4fv(location, value);
    }

    @Override
    public void glUniform4fv(int location, float[] value) {
        GLES30.glUniform4fv(location, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void glUniform2f(int location, float v0, float v1) {
        GLES30.glUniform2f(location, v0, v1);
    }

    @Override
    public void glUniform3f(int location, float v0, float v1, float v2) {
        GLES30.glUniform3f(location, v0, v1, v2);
    }

    @Override
    public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        GLES30.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform2fv(int location, FloatBuffer value) {
        GLES30.glUniform2fv(location, value);
    }

    @Override
    public void glUniform2fv(int location, float[] value) {
        GLES30.glUniform2fv(location, value);
    }

    @Override
    public void glUniform3fv(int location, FloatBuffer value) {
        GLES30.glUniform3fv(location, value);
    }

    @Override
    public void glUniform3fv(int location, float[] value) {
        GLES30.glUniform3fv(location, value);
    }

    @Override
    public void glUniform1f(int location, float v0) {
        GLES30.glUniform1f(location, v0);
    }

    @Override
    public void glUniform2iv(int location, IntBuffer value) {
        GLES30.glUniform2iv(location, value);
    }

    @Override
    public void glUniform2iv(int location, int[] value) {
        GLES30.glUniform2iv(location, value);
    }

    @Override
    public void glUniform1fv(int location, float[] value) {
        GLES30.glUniform1fv(location, value);
    }

    @Override
    public void glUniform1fv(int location, FloatBuffer value) {
        GLES30.glUniform1fv(location, value);
    }

    @Override
    public void glUniform3i(int location, int v0, int v1, int v2) {
        GLES30.glUniform3i(location, v0, v1, v2);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        GLES30.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, float[] value) {
        GLES30.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        GLES30.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform3iv(int location, int[] value) {
        GLES30.glUniform3iv(location, value);
    }

    @Override
    public void glUniform3iv(int location, IntBuffer value) {
        GLES30.glUniform3iv(location, value);
    }

    @Override
    public void glUniform1i(int location, int v0) {
        GLES30.glUniform1i(location, v0);
    }

    @Override
    public void glUniform4iv(int location, int[] value) {
        GLES30.glUniform4iv(location, value);
    }

    @Override
    public void glUniform4iv(int location, IntBuffer value) {
        GLES30.glUniform4iv(location, value);
    }

    @Override
    public void glUniform2i(int location, int v0, int v1) {
        GLES30.glUniform2i(location, v0, v1);
    }

    @Override
    public void glUniform1iv(int location, IntBuffer value) {
        GLES30.glUniform1iv(location, value);
    }

    @Override
    public void glUniform1iv(int location, int[] value) {
        GLES30.glUniform1iv(location, value);
    }

    @Override
    public void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GLES30.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GLES30.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
        return GLES30.glGetActiveUniform(program, index, size, type);
    }

    @Override
    public String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GLES30.glGetActiveUniform(program, index, bufSize, size, type);
    }

    @Override
    public float glGetUniformf(int program, int location) {
        return GLES30.glGetUniformf(program, location);
    }

    @Override
    public int glGetShaderi(int shader, int pname) {
        return GLES30.glGetShaderi(shader, pname);
    }

    @Override
    public void glGetUniformiv(int program, int location, IntBuffer params) {
        GLES30.glGetUniformiv(program, location, params);
    }

    @Override
    public void glGetUniformiv(int program, int location, int[] params) {
        GLES30.glGetUniformiv(program, location, params);
    }

    @Override
    public void glVertexAttrib2f(int index, float x, float y) {
        GLES30.glVertexAttrib2f(index, x, y);
    }

    @Override
    public int glGetUniformi(int program, int location) {
        return GLES30.glGetUniformi(program, location);
    }

    @Override
    public void glVertexAttrib3f(int index, float x, float y, float z) {
        GLES30.glVertexAttrib3f(index, x, y, z);
    }

    @Override
    public void glGetUniformfv(int program, int location, float[] params) {
        GLES30.glGetUniformfv(program, location, params);
    }

    @Override
    public void glGetUniformfv(int program, int location, FloatBuffer params) {
        GLES30.glGetUniformfv(program, location, params);
    }

    @Override
    public void glVertexAttrib1f(int index, float x) {
        GLES30.glVertexAttrib1f(index, x);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, IntBuffer params) {
        GLES30.glGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, int[] params) {
        GLES30.glGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetShaderSource(int shader, int[] length, ByteBuffer source) {
        GLES30.glGetShaderSource(shader, length, source);
    }

    @Override
    public String glGetShaderSource(int shader) {
        return GLES30.glGetShaderSource(shader);
    }

    @Override
    public void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
        GLES30.glGetShaderSource(shader, length, source);
    }

    @Override
    public String glGetShaderSource(int shader, int bufSize) {
        return GLES30.glGetShaderSource(shader, bufSize);
    }

    @Override
    public void glGetProgramiv(int program, int pname, IntBuffer params) {
        GLES30.glGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetProgramiv(int program, int pname, int[] params) {
        GLES30.glGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
        GLES30.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public String glGetShaderInfoLog(int shader, int bufSize) {
        return GLES30.glGetShaderInfoLog(shader, bufSize);
    }

    @Override
    public void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog) {
        GLES30.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public String glGetShaderInfoLog(int shader) {
        return GLES30.glGetShaderInfoLog(shader);
    }

    @Override
    public void glVertexAttrib4f(int index, float x, float y, float z, float w) {
        GLES30.glVertexAttrib4f(index, x, y, z, w);
    }

    @Override
    public void glVertexAttrib1fv(int index, FloatBuffer v) {
        GLES30.glVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib1fv(int index, float[] v) {
        GLES30.glVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, float[] v) {
        GLES30.glVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, FloatBuffer v) {
        GLES30.glVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, FloatBuffer v) {
        GLES30.glVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, float[] v) {
        GLES30.glVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, FloatBuffer v) {
        GLES30.glVertexAttrib3fv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, float[] v) {
        GLES30.glVertexAttrib3fv(index, v);
    }

    @Override
    public void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GLES30.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
        return GLES30.glGetActiveAttrib(program, index, size, type);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GLES30.glGetActiveAttrib(program, index, bufSize, size, type);
    }

    @Override
    public void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GLES30.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public void glDrawBuffers(int[] bufs) {
        GLES30.glDrawBuffers(bufs);
    }

    @Override
    public void glDrawBuffers(IntBuffer bufs) {
        GLES30.glDrawBuffers(bufs);
    }

    @Override
    public void glDrawBuffers(int buf) {
        GLES30.glDrawBuffers(buf);
    }

    @Override
    public void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
        GLES30.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public void glGetAttachedShaders(int program, int[] count, int[] shaders) {
        GLES30.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public int glGetUniformLocation(int program, CharSequence name) {
        return GLES30.glGetUniformLocation(program, name);
    }

    @Override
    public int glGetUniformLocation(int program, ByteBuffer name) {
        return GLES30.glGetUniformLocation(program, name);
    }

    @Override
    public void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog) {
        GLES30.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public String glGetProgramInfoLog(int program, int bufSize) {
        return GLES30.glGetProgramInfoLog(program, bufSize);
    }

    @Override
    public void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
        GLES30.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public String glGetProgramInfoLog(int program) {
        return GLES30.glGetProgramInfoLog(program);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
        GLES30.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
        GLES30.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        GLES30.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
        GLES30.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
        GLES30.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glEnableVertexAttribArray(int index) {
        GLES30.glEnableVertexAttribArray(index);
    }

    @Override
    public void glDisableVertexAttribArray(int index) {
        GLES30.glDisableVertexAttribArray(index);
    }

    @Override
    public void glBindAttribLocation(int program, int index, ByteBuffer name) {
        GLES30.glBindAttribLocation(program, index, name);
    }

    @Override
    public void glBindAttribLocation(int program, int index, CharSequence name) {
        GLES30.glBindAttribLocation(program, index, name);
    }

    @Override
    public void glStencilMaskSeparate(int face, int mask) {
        GLES30.glStencilMaskSeparate(face, mask);
    }

    @Override
    public int glGetAttribLocation(int program, CharSequence name) {
        return GLES30.glGetAttribLocation(program, name);
    }

    @Override
    public int glGetAttribLocation(int program, ByteBuffer name) {
        return GLES30.glGetAttribLocation(program, name);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, float[] params) {
        GLES30.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        GLES30.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, int[] params) {
        GLES30.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        GLES30.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        GLES30.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override
    public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        GLES30.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override
    public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        GLES30.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override
    public long glGetVertexAttribPointer(int index, int pname) {
        return GLES30.glGetVertexAttribPointer(index, pname);
    }

    @Override
    public void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
        GLES30.glGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override
    public int glGenBuffers() {
        return GLES30.glGenBuffers();
    }

    @Override
    public void glGenBuffers(IntBuffer buffers) {
        GLES30.glGenBuffers(buffers);
    }

    @Override
    public void glGenBuffers(int[] buffers) {
        GLES30.glGenBuffers(buffers);
    }

    @Override
    public boolean glIsBuffer(int buffer) {
        return GLES30.glIsBuffer(buffer);
    }

    @Override
    public boolean glUnmapBuffer(int target) {
        return GLES30.glUnmapBuffer(target);
    }

    @Override
    public boolean glIsQuery(int id) {
        return GLES30.glIsQuery(id);
    }

    @Override
    public void glBindBuffer(int target, int buffer) {
        GLES30.glBindBuffer(target, buffer);
    }

    @Override
    public void glBufferData(int target, long size, int usage) {
        GLES30.glBufferData(target, size, usage);
    }

    @Override
    public void glBufferData(int target, ByteBuffer data, int usage) {
        GLES30.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, ShortBuffer data, int usage) {
        GLES30.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, IntBuffer data, int usage) {
        GLES30.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, int[] data, int usage) {
        GLES30.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, short[] data, int usage) {
        GLES30.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, float[] data, int usage) {
        GLES30.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, FloatBuffer data, int usage) {
        GLES30.glBufferData(target, data, usage);
    }

    @Override
    public long glGetBufferPointer(int target, int pname) {
        return GLES30.glGetBufferPointer(target, pname);
    }

    @Override
    public void glDeleteBuffers(int[] buffers) {
        GLES30.glDeleteBuffers(buffers);
    }

    @Override
    public void glDeleteBuffers(int buffer) {
        GLES30.glDeleteBuffers(buffer);
    }

    @Override
    public void glDeleteBuffers(IntBuffer buffers) {
        GLES30.glDeleteBuffers(buffers);
    }

    @Override
    public void glBufferSubData(int target, long offset, ShortBuffer data) {
        GLES30.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, ByteBuffer data) {
        GLES30.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, float[] data) {
        GLES30.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, short[] data) {
        GLES30.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, int[] data) {
        GLES30.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, IntBuffer data) {
        GLES30.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, FloatBuffer data) {
        GLES30.glBufferSubData(target, offset, data);
    }

    @Override
    public void glDeleteQueries(IntBuffer ids) {
        GLES30.glDeleteQueries(ids);
    }

    @Override
    public void glDeleteQueries(int[] ids) {
        GLES30.glDeleteQueries(ids);
    }

    @Override
    public void glDeleteQueries(int id) {
        GLES30.glDeleteQueries(id);
    }

    @Override
    public void glBeginQuery(int target, int id) {
        GLES30.glBeginQuery(target, id);
    }

    @Override
    public void glGenQueries(IntBuffer ids) {
        GLES30.glGenQueries(ids);
    }

    @Override
    public void glGenQueries(int[] ids) {
        GLES30.glGenQueries(ids);
    }

    @Override
    public int glGenQueries() {
        return GLES30.glGenQueries();
    }

    @Override
    public int glGetQueryi(int target, int pname) {
        return GLES30.glGetQueryi(target, pname);
    }

    @Override
    public int glGetQueryObjectui(int id, int pname) {
        return GLES30.glGetQueryObjectui(id, pname);
    }

    @Override
    public void glGetQueryiv(int target, int pname, IntBuffer params) {
        GLES30.glGetQueryiv(target, pname, params);
    }

    @Override
    public void glGetQueryiv(int target, int pname, int[] params) {
        GLES30.glGetQueryiv(target, pname, params);
    }

    @Override
    public void glEndQuery(int target) {
        GLES30.glEndQuery(target);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, int[] params) {
        GLES30.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        GLES30.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
        GLES30.glGetBufferPointerv(target, pname, params);
    }

    @Override
    public int glGetBufferParameteri(int target, int pname) {
        return GLES30.glGetBufferParameteri(target, pname);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, int[] params) {
        GLES30.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        GLES30.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public void glBlendColor(float red, float green, float blue, float alpha) {
        GLES30.glBlendColor(red, green, blue, alpha);
    }

    @Override
    public void glBlendEquation(int mode) {
        GLES30.glBlendEquation(mode);
    }

    @Override
    public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        GLES30.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    @Override
    public void glSampleCoverage(float value, boolean invert) {
        GLES30.glSampleCoverage(value, invert);
    }

    @Override
    public void glActiveTexture(int texture) {
        GLES30.glActiveTexture(texture);
    }

    @Override
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
        GLES30.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    @Override
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        GLES30.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override
    public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        GLES30.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override
    public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
        GLES30.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    @Override
    public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        GLES30.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    @Override
    public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        GLES30.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override
    public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        GLES30.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    @Override
    public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        GLES30.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
        GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        GLES30.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
        GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        GLES30.glDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
        GLES30.glDrawRangeElements(mode, start, end, type, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
        GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
        GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override
    public void glEnable(int cap) {
        GLES30.glEnable(cap);
    }

    @Override
    public void glDisable(int cap) {
        GLES30.glDisable(cap);
    }

    @Override
    public void glClearColor(float red, float green, float blue, float alpha) {
        GLES30.glClearColor(red, green, blue, alpha);
    }

    @Override
    public void glBlendFunc(int sfactor, int dfactor) {
        GLES30.glBlendFunc(sfactor, dfactor);
    }

    @Override
    public void glClear(int mask) {
        GLES30.glClear(mask);
    }

    @Override
    public void glBindTexture(int target, int texture) {
        GLES30.glBindTexture(target, texture);
    }

    @Override
    public void glClearStencil(int s) {
        GLES30.glClearStencil(s);
    }

    @Override
    public void glDrawElements(int mode, int count, int type, long indices) {
        GLES30.glDrawElements(mode, count, type, indices);
    }

    @Override
    public void glDrawElements(int mode, int type, ByteBuffer indices) {
        GLES30.glDrawElements(mode, type, indices);
    }

    @Override
    public void glDrawElements(int mode, IntBuffer indices) {
        GLES30.glDrawElements(mode, indices);
    }

    @Override
    public void glDrawElements(int mode, ByteBuffer indices) {
        GLES30.glDrawElements(mode, indices);
    }

    @Override
    public void glDrawElements(int mode, ShortBuffer indices) {
        GLES30.glDrawElements(mode, indices);
    }

    @Override
    public void glDepthMask(boolean flag) {
        GLES30.glDepthMask(flag);
    }

    @Override
    public void glGenTextures(IntBuffer textures) {
        GLES30.glGenTextures(textures);
    }

    @Override
    public int glGenTextures() {
        return GLES30.glGenTextures();
    }

    @Override
    public void glGenTextures(int[] textures) {
        GLES30.glGenTextures(textures);
    }

    @Override
    public void glFrontFace(int mode) {
        GLES30.glFrontFace(mode);
    }

    @Override
    public void glDeleteTextures(IntBuffer textures) {
        GLES30.glDeleteTextures(textures);
    }

    @Override
    public void glDeleteTextures(int texture) {
        GLES30.glDeleteTextures(texture);
    }

    @Override
    public void glDeleteTextures(int[] textures) {
        GLES30.glDeleteTextures(textures);
    }

    @Override
    public void glFinish() {
        GLES30.glFinish();
    }

    @Override
    public void glCullFace(int mode) {
        GLES30.glCullFace(mode);
    }

    @Override
    public void glDrawArrays(int mode, int first, int count) {
        GLES30.glDrawArrays(mode, first, count);
    }

    @Override
    public void glFlush() {
        GLES30.glFlush();
    }

    @Override
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        GLES30.glColorMask(red, green, blue, alpha);
    }

    @Override
    public void glDepthFunc(int func) {
        GLES30.glDepthFunc(func);
    }

    @Override
    public void glGetIntegerv(int pname, IntBuffer data) {
        GLES30.glGetIntegerv(pname, data);
    }

    @Override
    public void glGetIntegerv(int pname, int[] data) {
        GLES30.glGetIntegerv(pname, data);
    }

    @Override
    public void glGetBooleanv(int pname, ByteBuffer data) {
        GLES30.glGetBooleanv(pname, data);
    }

    @Override
    public void glGetFloatv(int pname, float[] data) {
        GLES30.glGetFloatv(pname, data);
    }

    @Override
    public void glGetFloatv(int pname, FloatBuffer data) {
        GLES30.glGetFloatv(pname, data);
    }

    @Override
    public int glGetInteger(int pname) {
        return GLES30.glGetInteger(pname);
    }

    @Override
    public float glGetFloat(int pname) {
        return GLES30.glGetFloat(pname);
    }

    @Override
    public String glGetString(int name) {
        return GLES30.glGetString(name);
    }

    @Override
    public int glGetError() {
        return GLES30.glGetError();
    }

    @Override
    public boolean glGetBoolean(int pname) {
        return GLES30.glGetBoolean(pname);
    }

    @Override
    public int glGetTexParameteri(int target, int pname) {
        return GLES30.glGetTexParameteri(target, pname);
    }

    @Override
    public float glGetTexParameterf(int target, int pname) {
        return GLES30.glGetTexParameterf(target, pname);
    }

    @Override
    public boolean glIsEnabled(int cap) {
        return GLES30.glIsEnabled(cap);
    }

    @Override
    public boolean glIsTexture(int texture) {
        return GLES30.glIsTexture(texture);
    }

    @Override
    public void glHint(int target, int mode) {
        GLES30.glHint(target, mode);
    }

    @Override
    public void glLineWidth(float width) {
        GLES30.glLineWidth(width);
    }

    @Override
    public void glPixelStorei(int pname, int param) {
        GLES30.glPixelStorei(pname, param);
    }

    @Override
    public void glPolygonOffset(float factor, float units) {
        GLES30.glPolygonOffset(factor, units);
    }

    @Override
    public void glStencilFunc(int func, int ref, int mask) {
        GLES30.glStencilFunc(func, ref, mask);
    }

    @Override
    public void glReadBuffer(int src) {
        GLES30.glReadBuffer(src);
    }

    @Override
    public void glStencilOp(int fail, int zfail, int zpass) {
        GLES30.glStencilOp(fail, zfail, zpass);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glStencilMask(int mask) {
        GLES30.glStencilMask(mask);
    }

    @Override
    public void glScissor(int x, int y, int width, int height) {
        GLES30.glScissor(x, y, width, height);
    }

    @Override
    public void glTexParameteri(int target, int pname, int param) {
        GLES30.glTexParameteri(target, pname, param);
    }

    @Override
    public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        GLES30.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
        GLES30.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexParameteriv(int target, int pname, int[] params) {
        GLES30.glTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameteriv(int target, int pname, IntBuffer params) {
        GLES30.glTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameterf(int target, int pname, float param) {
        GLES30.glTexParameterf(target, pname, param);
    }

    @Override
    public void glTexParameterfv(int target, int pname, float[] params) {
        GLES30.glTexParameterfv(target, pname, params);
    }

    @Override
    public void glTexParameterfv(int target, int pname, FloatBuffer params) {
        GLES30.glTexParameterfv(target, pname, params);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        GLES30.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glViewport(int x, int y, int width, int height) {
        GLES30.glViewport(x, y, width, height);
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        GLES30.glGetTexParameteriv(target, pname, params);
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, int[] params) {
        GLES30.glGetTexParameteriv(target, pname, params);
    }

    @Override
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        GLES30.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, float[] params) {
        GLES30.glGetTexParameterfv(target, pname, params);
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        GLES30.glGetTexParameterfv(target, pname, params);
    }

    @Override
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision) {
        GLES30.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
        GLES30.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override
    public void glReleaseShaderCompiler() {
        GLES30.glReleaseShaderCompiler();
    }

    @Override
    public void glClearDepthf(float d) {
        GLES30.glClearDepthf(d);
    }

    @Override
    public void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
        GLES30.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override
    public void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary) {
        GLES30.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override
    public void glDepthRangef(float n, float f) {
        GLES30.glDepthRangef(n, f);
    }

    @Override
    protected final void makeCurrent(long window) {
        if (window != 0)
            GLES.createCapabilities();
    }

    @Override
    protected Class getContextClass() {
        return GLES30.class;
    }
}
