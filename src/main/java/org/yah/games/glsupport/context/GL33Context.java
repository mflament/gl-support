package org.yah.games.glsupport.context;

import org.lwjgl.opengl.GL33;
import javax.annotation.processing.Generated;
import java.nio.IntBuffer;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.ARBES2Compatibility;
import org.lwjgl.opengl.GL;

@SuppressWarnings({ "unused", "SpellCheckingInspection" })
@Generated(value = "ContextGenerator", date = "2022-04-18T20:31:24")
public class GL33Context extends AbstractGLContext {

    public GL33Context(long window) {
        super(window);
    }

    @Override
    public void glDeleteSamplers(int[] samplers) {
        GL33.glDeleteSamplers(samplers);
    }

    @Override
    public void glDeleteSamplers(IntBuffer samplers) {
        GL33.glDeleteSamplers(samplers);
    }

    @Override
    public void glDeleteSamplers(int sampler) {
        GL33.glDeleteSamplers(sampler);
    }

    @Override
    public int glGenSamplers() {
        return GL33.glGenSamplers();
    }

    @Override
    public void glGenSamplers(IntBuffer samplers) {
        GL33.glGenSamplers(samplers);
    }

    @Override
    public void glGenSamplers(int[] samplers) {
        GL33.glGenSamplers(samplers);
    }

    @Override
    public boolean glIsSampler(int sampler) {
        return GL33.glIsSampler(sampler);
    }

    @Override
    public void glBindSampler(int unit, int sampler) {
        GL33.glBindSampler(unit, sampler);
    }

    @Override
    public void glSamplerParameteri(int sampler, int pname, int param) {
        GL33.glSamplerParameteri(sampler, pname, param);
    }

    @Override
    public void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
        GL33.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
        GL33.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public float glGetSamplerParameterf(int sampler, int pname) {
        return GL33.glGetSamplerParameterf(sampler, pname);
    }

    @Override
    public void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
        GL33.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
        GL33.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public void glSamplerParameterfv(int sampler, int pname, FloatBuffer param) {
        GL33.glSamplerParameterfv(sampler, pname, param);
    }

    @Override
    public void glSamplerParameterfv(int sampler, int pname, float[] param) {
        GL33.glSamplerParameterfv(sampler, pname, param);
    }

    @Override
    public void glSamplerParameterf(int sampler, int pname, float param) {
        GL33.glSamplerParameterf(sampler, pname, param);
    }

    @Override
    public void glSamplerParameteriv(int sampler, int pname, int[] param) {
        GL33.glSamplerParameteriv(sampler, pname, param);
    }

    @Override
    public void glSamplerParameteriv(int sampler, int pname, IntBuffer param) {
        GL33.glSamplerParameteriv(sampler, pname, param);
    }

    @Override
    public int glGetSamplerParameteri(int sampler, int pname) {
        return GL33.glGetSamplerParameteri(sampler, pname);
    }

    @Override
    public void glVertexAttribDivisor(int index, int divisor) {
        GL33.glVertexAttribDivisor(index, divisor);
    }

    @Override
    public long glGetInteger64i(int target, int index) {
        return GL33.glGetInteger64i(target, index);
    }

    @Override
    public void glWaitSync(long sync, int flags, long timeout) {
        GL33.glWaitSync(sync, flags, timeout);
    }

    @Override
    public boolean glIsSync(long sync) {
        return GL33.glIsSync(sync);
    }

    @Override
    public void glDeleteSync(long sync) {
        GL33.glDeleteSync(sync);
    }

    @Override
    public int glClientWaitSync(long sync, int flags, long timeout) {
        return GL33.glClientWaitSync(sync, flags, timeout);
    }

    @Override
    public void glGetInteger64i_v(int target, int index, LongBuffer data) {
        GL33.glGetInteger64i_v(target, index, data);
    }

    @Override
    public void glGetInteger64i_v(int target, int index, long[] data) {
        GL33.glGetInteger64i_v(target, index, data);
    }

    @Override
    public void glGetInteger64v(int pname, long[] data) {
        GL33.glGetInteger64v(pname, data);
    }

    @Override
    public void glGetInteger64v(int pname, LongBuffer data) {
        GL33.glGetInteger64v(pname, data);
    }

    @Override
    public long glFenceSync(int condition, int flags) {
        return GL33.glFenceSync(condition, flags);
    }

    @Override
    public void glGetSynciv(long sync, int pname, int[] length, int[] values) {
        GL33.glGetSynciv(sync, pname, length, values);
    }

    @Override
    public void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
        GL33.glGetSynciv(sync, pname, length, values);
    }

    @Override
    public int glGetSynci(long sync, int pname, IntBuffer length) {
        return GL33.glGetSynci(sync, pname, length);
    }

    @Override
    public long glGetInteger64(int pname) {
        return GL33.glGetInteger64(pname);
    }

    @Override
    public void glGetBufferParameteri64v(int target, int pname, long[] params) {
        GL33.glGetBufferParameteri64v(target, pname, params);
    }

    @Override
    public void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
        GL33.glGetBufferParameteri64v(target, pname, params);
    }

    @Override
    public long glGetBufferParameteri64(int target, int pname) {
        return GL33.glGetBufferParameteri64(target, pname);
    }

    @Override
    public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
        GL33.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override
    public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
        GL33.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override
    public int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
        return GL33.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    @Override
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName) {
        GL33.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        return GL33.glGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    @Override
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        return GL33.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

    @Override
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
        GL33.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override
    public void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
        GL33.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override
    public void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
        GL33.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override
    public void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount) {
        GL33.glDrawElementsInstanced(mode, type, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
        GL33.glDrawElementsInstanced(mode, count, type, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount) {
        GL33.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount) {
        GL33.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override
    public void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount) {
        GL33.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override
    public void glDrawArraysInstanced(int mode, int first, int count, int instancecount) {
        GL33.glDrawArraysInstanced(mode, first, count, instancecount);
    }

    @Override
    public void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        GL33.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    @Override
    public void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
        GL33.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override
    public void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
        GL33.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override
    public int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
        return GL33.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override
    public int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
        return GL33.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override
    public void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        GL33.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params) {
        GL33.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
        GL33.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        return GL33.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    @Override
    public String glGetStringi(int name, int index) {
        return GL33.glGetStringi(name, index);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
        GL33.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
        GL33.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        GL33.glVertexAttribI4ui(index, x, y, z, w);
    }

    @Override
    public void glVertexAttribI4iv(int index, int[] v) {
        GL33.glVertexAttribI4iv(index, v);
    }

    @Override
    public void glVertexAttribI4iv(int index, IntBuffer v) {
        GL33.glVertexAttribI4iv(index, v);
    }

    @Override
    public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        GL33.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
        GL33.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
        GL33.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        GL33.glVertexAttribI4i(index, x, y, z, w);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
        GL33.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
        GL33.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public boolean glIsRenderbuffer(int renderbuffer) {
        return GL33.glIsRenderbuffer(renderbuffer);
    }

    @Override
    public void glBindRenderbuffer(int target, int renderbuffer) {
        GL33.glBindRenderbuffer(target, renderbuffer);
    }

    @Override
    public void glUniform1uiv(int location, IntBuffer value) {
        GL33.glUniform1uiv(location, value);
    }

    @Override
    public void glUniform1uiv(int location, int[] value) {
        GL33.glUniform1uiv(location, value);
    }

    @Override
    public void glUniform2ui(int location, int v0, int v1) {
        GL33.glUniform2ui(location, v0, v1);
    }

    @Override
    public void glUniform3ui(int location, int v0, int v1, int v2) {
        GL33.glUniform3ui(location, v0, v1, v2);
    }

    @Override
    public void glUniform2uiv(int location, IntBuffer value) {
        GL33.glUniform2uiv(location, value);
    }

    @Override
    public void glUniform2uiv(int location, int[] value) {
        GL33.glUniform2uiv(location, value);
    }

    @Override
    public void glGetUniformuiv(int program, int location, int[] params) {
        GL33.glGetUniformuiv(program, location, params);
    }

    @Override
    public void glGetUniformuiv(int program, int location, IntBuffer params) {
        GL33.glGetUniformuiv(program, location, params);
    }

    @Override
    public void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        GL33.glUniform4ui(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform4uiv(int location, IntBuffer value) {
        GL33.glUniform4uiv(location, value);
    }

    @Override
    public void glUniform4uiv(int location, int[] value) {
        GL33.glUniform4uiv(location, value);
    }

    @Override
    public void glUniform3uiv(int location, IntBuffer value) {
        GL33.glUniform3uiv(location, value);
    }

    @Override
    public void glUniform3uiv(int location, int[] value) {
        GL33.glUniform3uiv(location, value);
    }

    @Override
    public int glGetUniformui(int program, int location) {
        return GL33.glGetUniformui(program, location);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
        return GL33.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
        return GL33.glMapBufferRange(target, offset, length, access);
    }

    @Override
    public void glUniform1ui(int location, int v0) {
        GL33.glUniform1ui(location, v0);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, int[] data) {
        GL33.glGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, IntBuffer data) {
        GL33.glGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGenFramebuffers(int[] framebuffers) {
        GL33.glGenFramebuffers(framebuffers);
    }

    @Override
    public int glGenFramebuffers() {
        return GL33.glGenFramebuffers();
    }

    @Override
    public void glGenFramebuffers(IntBuffer framebuffers) {
        GL33.glGenFramebuffers(framebuffers);
    }

    @Override
    public void glGenerateMipmap(int target) {
        GL33.glGenerateMipmap(target);
    }

    @Override
    public void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        GL33.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override
    public boolean glIsFramebuffer(int framebuffer) {
        return GL33.glIsFramebuffer(framebuffer);
    }

    @Override
    public void glBindFramebuffer(int target, int framebuffer) {
        GL33.glBindFramebuffer(target, framebuffer);
    }

    @Override
    public int glGenRenderbuffers() {
        return GL33.glGenRenderbuffers();
    }

    @Override
    public void glGenRenderbuffers(IntBuffer renderbuffers) {
        GL33.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public void glGenRenderbuffers(int[] renderbuffers) {
        GL33.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public void glGenVertexArrays(IntBuffer arrays) {
        GL33.glGenVertexArrays(arrays);
    }

    @Override
    public void glGenVertexArrays(int[] arrays) {
        GL33.glGenVertexArrays(arrays);
    }

    @Override
    public int glGenVertexArrays() {
        return GL33.glGenVertexArrays();
    }

    @Override
    public void glBindVertexArray(int array) {
        GL33.glBindVertexArray(array);
    }

    @Override
    public int glGetIntegeri(int target, int index) {
        return GL33.glGetIntegeri(target, index);
    }

    @Override
    public void glBindBufferBase(int target, int index, int buffer) {
        GL33.glBindBufferBase(target, index, buffer);
    }

    @Override
    public boolean glIsVertexArray(int array) {
        return GL33.glIsVertexArray(array);
    }

    @Override
    public void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
        GL33.glBindBufferRange(target, index, buffer, offset, size);
    }

    @Override
    public void glVertexAttribI4uiv(int index, IntBuffer v) {
        GL33.glVertexAttribI4uiv(index, v);
    }

    @Override
    public void glVertexAttribI4uiv(int index, int[] v) {
        GL33.glVertexAttribI4uiv(index, v);
    }

    @Override
    public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        GL33.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Override
    public int glGetVertexAttribIui(int index, int pname) {
        return GL33.glGetVertexAttribIui(index, pname);
    }

    @Override
    public void glFlushMappedBufferRange(int target, long offset, long length) {
        GL33.glFlushMappedBufferRange(target, offset, length);
    }

    @Override
    public int glGetRenderbufferParameteri(int target, int pname) {
        return GL33.glGetRenderbufferParameteri(target, pname);
    }

    @Override
    public int glGetVertexAttribIi(int index, int pname) {
        return GL33.glGetVertexAttribIi(index, pname);
    }

    @Override
    public int glCheckFramebufferStatus(int target) {
        return GL33.glCheckFramebufferStatus(target);
    }

    @Override
    public int glGetFragDataLocation(int program, CharSequence name) {
        return GL33.glGetFragDataLocation(program, name);
    }

    @Override
    public int glGetFragDataLocation(int program, ByteBuffer name) {
        return GL33.glGetFragDataLocation(program, name);
    }

    @Override
    public void glDeleteFramebuffers(int framebuffer) {
        GL33.glDeleteFramebuffers(framebuffer);
    }

    @Override
    public void glDeleteFramebuffers(int[] framebuffers) {
        GL33.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glDeleteFramebuffers(IntBuffer framebuffers) {
        GL33.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        GL33.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
        GL33.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
        GL33.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GL33.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        GL33.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
        GL33.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
        GL33.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
        GL33.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GL33.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GL33.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
        return GL33.glGetTransformFeedbackVarying(program, index, size, type);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GL33.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, int[] params) {
        GL33.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
        GL33.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glDeleteRenderbuffers(int renderbuffer) {
        GL33.glDeleteRenderbuffers(renderbuffer);
    }

    @Override
    public void glDeleteRenderbuffers(int[] renderbuffers) {
        GL33.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glDeleteRenderbuffers(IntBuffer renderbuffers) {
        GL33.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        GL33.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    @Override
    public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        GL33.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, int[] params) {
        GL33.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
        GL33.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glEndTransformFeedback() {
        GL33.glEndTransformFeedback();
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, int[] params) {
        GL33.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
        GL33.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glDeleteVertexArrays(int[] arrays) {
        GL33.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glDeleteVertexArrays(IntBuffer arrays) {
        GL33.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glDeleteVertexArrays(int array) {
        GL33.glDeleteVertexArrays(array);
    }

    @Override
    public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        GL33.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Override
    public void glBeginTransformFeedback(int primitiveMode) {
        GL33.glBeginTransformFeedback(primitiveMode);
    }

    @Override
    public void glUniformMatrix4x2fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x2fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x3fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x3fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x4fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x4fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override
    public int glGetProgrami(int program, int pname) {
        return GL33.glGetProgrami(program, pname);
    }

    @Override
    public void glLinkProgram(int program) {
        GL33.glLinkProgram(program);
    }

    @Override
    public int glCreateProgram() {
        return GL33.glCreateProgram();
    }

    @Override
    public void glAttachShader(int program, int shader) {
        GL33.glAttachShader(program, shader);
    }

    @Override
    public void glDeleteShader(int shader) {
        GL33.glDeleteShader(shader);
    }

    @Override
    public void glShaderSource(int shader, CharSequence[] string) {
        GL33.glShaderSource(shader, string);
    }

    @Override
    public void glShaderSource(int shader, CharSequence string) {
        GL33.glShaderSource(shader, string);
    }

    @Override
    public void glShaderSource(int shader, PointerBuffer string, IntBuffer length) {
        GL33.glShaderSource(shader, string, length);
    }

    @Override
    public void glShaderSource(int shader, PointerBuffer string, int[] length) {
        GL33.glShaderSource(shader, string, length);
    }

    @Override
    public boolean glIsProgram(int program) {
        return GL33.glIsProgram(program);
    }

    @Override
    public void glValidateProgram(int program) {
        GL33.glValidateProgram(program);
    }

    @Override
    public boolean glIsShader(int shader) {
        return GL33.glIsShader(shader);
    }

    @Override
    public void glCompileShader(int shader) {
        GL33.glCompileShader(shader);
    }

    @Override
    public void glUseProgram(int program) {
        GL33.glUseProgram(program);
    }

    @Override
    public void glDeleteProgram(int program) {
        GL33.glDeleteProgram(program);
    }

    @Override
    public int glCreateShader(int type) {
        return GL33.glCreateShader(type);
    }

    @Override
    public void glDetachShader(int program, int shader) {
        GL33.glDetachShader(program, shader);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void glUniform4fv(int location, FloatBuffer value) {
        GL33.glUniform4fv(location, value);
    }

    @Override
    public void glUniform4fv(int location, float[] value) {
        GL33.glUniform4fv(location, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void glUniform2f(int location, float v0, float v1) {
        GL33.glUniform2f(location, v0, v1);
    }

    @Override
    public void glUniform3f(int location, float v0, float v1, float v2) {
        GL33.glUniform3f(location, v0, v1, v2);
    }

    @Override
    public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        GL33.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform2fv(int location, FloatBuffer value) {
        GL33.glUniform2fv(location, value);
    }

    @Override
    public void glUniform2fv(int location, float[] value) {
        GL33.glUniform2fv(location, value);
    }

    @Override
    public void glUniform3fv(int location, FloatBuffer value) {
        GL33.glUniform3fv(location, value);
    }

    @Override
    public void glUniform3fv(int location, float[] value) {
        GL33.glUniform3fv(location, value);
    }

    @Override
    public void glUniform1f(int location, float v0) {
        GL33.glUniform1f(location, v0);
    }

    @Override
    public void glUniform2iv(int location, IntBuffer value) {
        GL33.glUniform2iv(location, value);
    }

    @Override
    public void glUniform2iv(int location, int[] value) {
        GL33.glUniform2iv(location, value);
    }

    @Override
    public void glUniform1fv(int location, float[] value) {
        GL33.glUniform1fv(location, value);
    }

    @Override
    public void glUniform1fv(int location, FloatBuffer value) {
        GL33.glUniform1fv(location, value);
    }

    @Override
    public void glUniform3i(int location, int v0, int v1, int v2) {
        GL33.glUniform3i(location, v0, v1, v2);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        GL33.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, float[] value) {
        GL33.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        GL33.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform3iv(int location, int[] value) {
        GL33.glUniform3iv(location, value);
    }

    @Override
    public void glUniform3iv(int location, IntBuffer value) {
        GL33.glUniform3iv(location, value);
    }

    @Override
    public void glUniform1i(int location, int v0) {
        GL33.glUniform1i(location, v0);
    }

    @Override
    public void glUniform4iv(int location, int[] value) {
        GL33.glUniform4iv(location, value);
    }

    @Override
    public void glUniform4iv(int location, IntBuffer value) {
        GL33.glUniform4iv(location, value);
    }

    @Override
    public void glUniform2i(int location, int v0, int v1) {
        GL33.glUniform2i(location, v0, v1);
    }

    @Override
    public void glUniform1iv(int location, IntBuffer value) {
        GL33.glUniform1iv(location, value);
    }

    @Override
    public void glUniform1iv(int location, int[] value) {
        GL33.glUniform1iv(location, value);
    }

    @Override
    public void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GL33.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GL33.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
        return GL33.glGetActiveUniform(program, index, size, type);
    }

    @Override
    public String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GL33.glGetActiveUniform(program, index, bufSize, size, type);
    }

    @Override
    public float glGetUniformf(int program, int location) {
        return GL33.glGetUniformf(program, location);
    }

    @Override
    public int glGetShaderi(int shader, int pname) {
        return GL33.glGetShaderi(shader, pname);
    }

    @Override
    public void glGetUniformiv(int program, int location, IntBuffer params) {
        GL33.glGetUniformiv(program, location, params);
    }

    @Override
    public void glGetUniformiv(int program, int location, int[] params) {
        GL33.glGetUniformiv(program, location, params);
    }

    @Override
    public void glVertexAttrib2f(int index, float x, float y) {
        GL33.glVertexAttrib2f(index, x, y);
    }

    @Override
    public int glGetUniformi(int program, int location) {
        return GL33.glGetUniformi(program, location);
    }

    @Override
    public void glVertexAttrib3f(int index, float x, float y, float z) {
        GL33.glVertexAttrib3f(index, x, y, z);
    }

    @Override
    public void glGetUniformfv(int program, int location, float[] params) {
        GL33.glGetUniformfv(program, location, params);
    }

    @Override
    public void glGetUniformfv(int program, int location, FloatBuffer params) {
        GL33.glGetUniformfv(program, location, params);
    }

    @Override
    public void glVertexAttrib1f(int index, float x) {
        GL33.glVertexAttrib1f(index, x);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, IntBuffer params) {
        GL33.glGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, int[] params) {
        GL33.glGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetShaderSource(int shader, int[] length, ByteBuffer source) {
        GL33.glGetShaderSource(shader, length, source);
    }

    @Override
    public String glGetShaderSource(int shader) {
        return GL33.glGetShaderSource(shader);
    }

    @Override
    public void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
        GL33.glGetShaderSource(shader, length, source);
    }

    @Override
    public String glGetShaderSource(int shader, int bufSize) {
        return GL33.glGetShaderSource(shader, bufSize);
    }

    @Override
    public void glGetProgramiv(int program, int pname, IntBuffer params) {
        GL33.glGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetProgramiv(int program, int pname, int[] params) {
        GL33.glGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
        GL33.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public String glGetShaderInfoLog(int shader, int bufSize) {
        return GL33.glGetShaderInfoLog(shader, bufSize);
    }

    @Override
    public void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog) {
        GL33.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public String glGetShaderInfoLog(int shader) {
        return GL33.glGetShaderInfoLog(shader);
    }

    @Override
    public void glVertexAttrib4f(int index, float x, float y, float z, float w) {
        GL33.glVertexAttrib4f(index, x, y, z, w);
    }

    @Override
    public void glVertexAttrib1fv(int index, FloatBuffer v) {
        GL33.glVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib1fv(int index, float[] v) {
        GL33.glVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, float[] v) {
        GL33.glVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, FloatBuffer v) {
        GL33.glVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, FloatBuffer v) {
        GL33.glVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, float[] v) {
        GL33.glVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, FloatBuffer v) {
        GL33.glVertexAttrib3fv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, float[] v) {
        GL33.glVertexAttrib3fv(index, v);
    }

    @Override
    public void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GL33.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
        return GL33.glGetActiveAttrib(program, index, size, type);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GL33.glGetActiveAttrib(program, index, bufSize, size, type);
    }

    @Override
    public void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GL33.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public void glDrawBuffers(int[] bufs) {
        GL33.glDrawBuffers(bufs);
    }

    @Override
    public void glDrawBuffers(IntBuffer bufs) {
        GL33.glDrawBuffers(bufs);
    }

    @Override
    public void glDrawBuffers(int buf) {
        GL33.glDrawBuffers(buf);
    }

    @Override
    public void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
        GL33.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public void glGetAttachedShaders(int program, int[] count, int[] shaders) {
        GL33.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public int glGetUniformLocation(int program, CharSequence name) {
        return GL33.glGetUniformLocation(program, name);
    }

    @Override
    public int glGetUniformLocation(int program, ByteBuffer name) {
        return GL33.glGetUniformLocation(program, name);
    }

    @Override
    public void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog) {
        GL33.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public String glGetProgramInfoLog(int program, int bufSize) {
        return GL33.glGetProgramInfoLog(program, bufSize);
    }

    @Override
    public void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
        GL33.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public String glGetProgramInfoLog(int program) {
        return GL33.glGetProgramInfoLog(program);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
        GL33.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
        GL33.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        GL33.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
        GL33.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
        GL33.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glEnableVertexAttribArray(int index) {
        GL33.glEnableVertexAttribArray(index);
    }

    @Override
    public void glDisableVertexAttribArray(int index) {
        GL33.glDisableVertexAttribArray(index);
    }

    @Override
    public void glBindAttribLocation(int program, int index, ByteBuffer name) {
        GL33.glBindAttribLocation(program, index, name);
    }

    @Override
    public void glBindAttribLocation(int program, int index, CharSequence name) {
        GL33.glBindAttribLocation(program, index, name);
    }

    @Override
    public void glStencilMaskSeparate(int face, int mask) {
        GL33.glStencilMaskSeparate(face, mask);
    }

    @Override
    public int glGetAttribLocation(int program, CharSequence name) {
        return GL33.glGetAttribLocation(program, name);
    }

    @Override
    public int glGetAttribLocation(int program, ByteBuffer name) {
        return GL33.glGetAttribLocation(program, name);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, float[] params) {
        GL33.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        GL33.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, int[] params) {
        GL33.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        GL33.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        GL33.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override
    public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        GL33.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override
    public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        GL33.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override
    public long glGetVertexAttribPointer(int index, int pname) {
        return GL33.glGetVertexAttribPointer(index, pname);
    }

    @Override
    public void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
        GL33.glGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override
    public int glGenBuffers() {
        return GL33.glGenBuffers();
    }

    @Override
    public void glGenBuffers(IntBuffer buffers) {
        GL33.glGenBuffers(buffers);
    }

    @Override
    public void glGenBuffers(int[] buffers) {
        GL33.glGenBuffers(buffers);
    }

    @Override
    public boolean glIsBuffer(int buffer) {
        return GL33.glIsBuffer(buffer);
    }

    @Override
    public boolean glUnmapBuffer(int target) {
        return GL33.glUnmapBuffer(target);
    }

    @Override
    public boolean glIsQuery(int id) {
        return GL33.glIsQuery(id);
    }

    @Override
    public void glBindBuffer(int target, int buffer) {
        GL33.glBindBuffer(target, buffer);
    }

    @Override
    public void glBufferData(int target, long size, int usage) {
        GL33.glBufferData(target, size, usage);
    }

    @Override
    public void glBufferData(int target, ByteBuffer data, int usage) {
        GL33.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, ShortBuffer data, int usage) {
        GL33.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, IntBuffer data, int usage) {
        GL33.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, int[] data, int usage) {
        GL33.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, short[] data, int usage) {
        GL33.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, float[] data, int usage) {
        GL33.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, FloatBuffer data, int usage) {
        GL33.glBufferData(target, data, usage);
    }

    @Override
    public long glGetBufferPointer(int target, int pname) {
        return GL33.glGetBufferPointer(target, pname);
    }

    @Override
    public void glDeleteBuffers(int[] buffers) {
        GL33.glDeleteBuffers(buffers);
    }

    @Override
    public void glDeleteBuffers(int buffer) {
        GL33.glDeleteBuffers(buffer);
    }

    @Override
    public void glDeleteBuffers(IntBuffer buffers) {
        GL33.glDeleteBuffers(buffers);
    }

    @Override
    public void glBufferSubData(int target, long offset, ShortBuffer data) {
        GL33.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, ByteBuffer data) {
        GL33.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, float[] data) {
        GL33.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, short[] data) {
        GL33.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, int[] data) {
        GL33.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, IntBuffer data) {
        GL33.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, FloatBuffer data) {
        GL33.glBufferSubData(target, offset, data);
    }

    @Override
    public void glDeleteQueries(IntBuffer ids) {
        GL33.glDeleteQueries(ids);
    }

    @Override
    public void glDeleteQueries(int[] ids) {
        GL33.glDeleteQueries(ids);
    }

    @Override
    public void glDeleteQueries(int id) {
        GL33.glDeleteQueries(id);
    }

    @Override
    public void glBeginQuery(int target, int id) {
        GL33.glBeginQuery(target, id);
    }

    @Override
    public void glGenQueries(IntBuffer ids) {
        GL33.glGenQueries(ids);
    }

    @Override
    public void glGenQueries(int[] ids) {
        GL33.glGenQueries(ids);
    }

    @Override
    public int glGenQueries() {
        return GL33.glGenQueries();
    }

    @Override
    public int glGetQueryi(int target, int pname) {
        return GL33.glGetQueryi(target, pname);
    }

    @Override
    public int glGetQueryObjectui(int id, int pname) {
        return GL33.glGetQueryObjectui(id, pname);
    }

    @Override
    public void glGetQueryiv(int target, int pname, IntBuffer params) {
        GL33.glGetQueryiv(target, pname, params);
    }

    @Override
    public void glGetQueryiv(int target, int pname, int[] params) {
        GL33.glGetQueryiv(target, pname, params);
    }

    @Override
    public void glEndQuery(int target) {
        GL33.glEndQuery(target);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, int[] params) {
        GL33.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        GL33.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
        GL33.glGetBufferPointerv(target, pname, params);
    }

    @Override
    public int glGetBufferParameteri(int target, int pname) {
        return GL33.glGetBufferParameteri(target, pname);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, int[] params) {
        GL33.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        GL33.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public void glBlendColor(float red, float green, float blue, float alpha) {
        GL33.glBlendColor(red, green, blue, alpha);
    }

    @Override
    public void glBlendEquation(int mode) {
        GL33.glBlendEquation(mode);
    }

    @Override
    public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        GL33.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    @Override
    public void glSampleCoverage(float value, boolean invert) {
        GL33.glSampleCoverage(value, invert);
    }

    @Override
    public void glActiveTexture(int texture) {
        GL33.glActiveTexture(texture);
    }

    @Override
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
        GL33.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    @Override
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        GL33.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override
    public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        GL33.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override
    public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
        GL33.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    @Override
    public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        GL33.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    @Override
    public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        GL33.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override
    public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        GL33.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    @Override
    public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        GL33.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
        GL33.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        GL33.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override
    public void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        GL33.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
        GL33.glDrawRangeElements(mode, start, end, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        GL33.glDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
        GL33.glDrawRangeElements(mode, start, end, type, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
        GL33.glDrawRangeElements(mode, start, end, indices);
    }

    @Override
    public void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
        GL33.glDrawRangeElements(mode, start, end, indices);
    }

    @Override
    public void glEnable(int cap) {
        GL33.glEnable(cap);
    }

    @Override
    public void glDisable(int cap) {
        GL33.glDisable(cap);
    }

    @Override
    public void glClearColor(float red, float green, float blue, float alpha) {
        GL33.glClearColor(red, green, blue, alpha);
    }

    @Override
    public void glBlendFunc(int sfactor, int dfactor) {
        GL33.glBlendFunc(sfactor, dfactor);
    }

    @Override
    public void glClear(int mask) {
        GL33.glClear(mask);
    }

    @Override
    public void glBindTexture(int target, int texture) {
        GL33.glBindTexture(target, texture);
    }

    @Override
    public void glClearStencil(int s) {
        GL33.glClearStencil(s);
    }

    @Override
    public void glDrawElements(int mode, int count, int type, long indices) {
        GL33.glDrawElements(mode, count, type, indices);
    }

    @Override
    public void glDrawElements(int mode, int type, ByteBuffer indices) {
        GL33.glDrawElements(mode, type, indices);
    }

    @Override
    public void glDrawElements(int mode, IntBuffer indices) {
        GL33.glDrawElements(mode, indices);
    }

    @Override
    public void glDrawElements(int mode, ByteBuffer indices) {
        GL33.glDrawElements(mode, indices);
    }

    @Override
    public void glDrawElements(int mode, ShortBuffer indices) {
        GL33.glDrawElements(mode, indices);
    }

    @Override
    public void glDepthMask(boolean flag) {
        GL33.glDepthMask(flag);
    }

    @Override
    public void glGenTextures(IntBuffer textures) {
        GL33.glGenTextures(textures);
    }

    @Override
    public int glGenTextures() {
        return GL33.glGenTextures();
    }

    @Override
    public void glGenTextures(int[] textures) {
        GL33.glGenTextures(textures);
    }

    @Override
    public void glFrontFace(int mode) {
        GL33.glFrontFace(mode);
    }

    @Override
    public void glDeleteTextures(IntBuffer textures) {
        GL33.glDeleteTextures(textures);
    }

    @Override
    public void glDeleteTextures(int texture) {
        GL33.glDeleteTextures(texture);
    }

    @Override
    public void glDeleteTextures(int[] textures) {
        GL33.glDeleteTextures(textures);
    }

    @Override
    public void glFinish() {
        GL33.glFinish();
    }

    @Override
    public void glCullFace(int mode) {
        GL33.glCullFace(mode);
    }

    @Override
    public void glDrawArrays(int mode, int first, int count) {
        GL33.glDrawArrays(mode, first, count);
    }

    @Override
    public void glFlush() {
        GL33.glFlush();
    }

    @Override
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        GL33.glColorMask(red, green, blue, alpha);
    }

    @Override
    public void glDepthFunc(int func) {
        GL33.glDepthFunc(func);
    }

    @Override
    public void glGetIntegerv(int pname, IntBuffer data) {
        GL33.glGetIntegerv(pname, data);
    }

    @Override
    public void glGetIntegerv(int pname, int[] data) {
        GL33.glGetIntegerv(pname, data);
    }

    @Override
    public void glGetBooleanv(int pname, ByteBuffer data) {
        GL33.glGetBooleanv(pname, data);
    }

    @Override
    public void glGetFloatv(int pname, float[] data) {
        GL33.glGetFloatv(pname, data);
    }

    @Override
    public void glGetFloatv(int pname, FloatBuffer data) {
        GL33.glGetFloatv(pname, data);
    }

    @Override
    public int glGetInteger(int pname) {
        return GL33.glGetInteger(pname);
    }

    @Override
    public float glGetFloat(int pname) {
        return GL33.glGetFloat(pname);
    }

    @Override
    public String glGetString(int name) {
        return GL33.glGetString(name);
    }

    @Override
    public int glGetError() {
        return GL33.glGetError();
    }

    @Override
    public boolean glGetBoolean(int pname) {
        return GL33.glGetBoolean(pname);
    }

    @Override
    public int glGetTexParameteri(int target, int pname) {
        return GL33.glGetTexParameteri(target, pname);
    }

    @Override
    public float glGetTexParameterf(int target, int pname) {
        return GL33.glGetTexParameterf(target, pname);
    }

    @Override
    public boolean glIsEnabled(int cap) {
        return GL33.glIsEnabled(cap);
    }

    @Override
    public boolean glIsTexture(int texture) {
        return GL33.glIsTexture(texture);
    }

    @Override
    public void glHint(int target, int mode) {
        GL33.glHint(target, mode);
    }

    @Override
    public void glLineWidth(float width) {
        GL33.glLineWidth(width);
    }

    @Override
    public void glPixelStorei(int pname, int param) {
        GL33.glPixelStorei(pname, param);
    }

    @Override
    public void glPolygonOffset(float factor, float units) {
        GL33.glPolygonOffset(factor, units);
    }

    @Override
    public void glStencilFunc(int func, int ref, int mask) {
        GL33.glStencilFunc(func, ref, mask);
    }

    @Override
    public void glReadBuffer(int src) {
        GL33.glReadBuffer(src);
    }

    @Override
    public void glStencilOp(int fail, int zfail, int zpass) {
        GL33.glStencilOp(fail, zfail, zpass);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        GL33.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glStencilMask(int mask) {
        GL33.glStencilMask(mask);
    }

    @Override
    public void glScissor(int x, int y, int width, int height) {
        GL33.glScissor(x, y, width, height);
    }

    @Override
    public void glTexParameteri(int target, int pname, int param) {
        GL33.glTexParameteri(target, pname, param);
    }

    @Override
    public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        GL33.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
        GL33.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexParameteriv(int target, int pname, int[] params) {
        GL33.glTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameteriv(int target, int pname, IntBuffer params) {
        GL33.glTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameterf(int target, int pname, float param) {
        GL33.glTexParameterf(target, pname, param);
    }

    @Override
    public void glTexParameterfv(int target, int pname, float[] params) {
        GL33.glTexParameterfv(target, pname, params);
    }

    @Override
    public void glTexParameterfv(int target, int pname, FloatBuffer params) {
        GL33.glTexParameterfv(target, pname, params);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        GL33.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glViewport(int x, int y, int width, int height) {
        GL33.glViewport(x, y, width, height);
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        GL33.glGetTexParameteriv(target, pname, params);
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, int[] params) {
        GL33.glGetTexParameteriv(target, pname, params);
    }

    @Override
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        GL33.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, float[] params) {
        GL33.glGetTexParameterfv(target, pname, params);
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        GL33.glGetTexParameterfv(target, pname, params);
    }

    @Override
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision) {
        ARBES2Compatibility.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
        ARBES2Compatibility.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override
    public void glReleaseShaderCompiler() {
        ARBES2Compatibility.glReleaseShaderCompiler();
    }

    @Override
    public void glClearDepthf(float d) {
        ARBES2Compatibility.glClearDepthf(d);
    }

    @Override
    public void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
        ARBES2Compatibility.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override
    public void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary) {
        ARBES2Compatibility.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override
    public void glDepthRangef(float n, float f) {
        ARBES2Compatibility.glDepthRangef(n, f);
    }

    @Override
    protected final void makeCurrent(long window) {
        if (window != 0)
            GL.createCapabilities();
    }

    @Override
    protected Class getContextClass() {
        return GL33.class;
    }
}
