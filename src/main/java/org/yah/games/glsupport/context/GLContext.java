package org.yah.games.glsupport.context;

import javax.annotation.processing.Generated;
import java.nio.IntBuffer;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import java.nio.ShortBuffer;
import org.yah.games.glsupport.GLState;

@SuppressWarnings({ "unused", "SpellCheckingInspection" })
@Generated(value = "ContextGenerator", date = "2022-04-18T20:31:24")
public interface GLContext {

    public static final int GL_ANY_SAMPLES_PASSED = 0x8c2f;

    public static final int GL_SAMPLER_BINDING = 0x8919;

    public static final int GL_RGB10_A2UI = 0x906f;

    public static final int GL_TEXTURE_SWIZZLE_R = 0x8e42;

    public static final int GL_TEXTURE_SWIZZLE_G = 0x8e43;

    public static final int GL_TEXTURE_SWIZZLE_B = 0x8e44;

    public static final int GL_TEXTURE_SWIZZLE_A = 0x8e45;

    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88fe;

    public static final int GL_INT_2_10_10_10_REV = 0x8d9f;

    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;

    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;

    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;

    public static final int GL_OBJECT_TYPE = 0x9112;

    public static final int GL_SYNC_CONDITION = 0x9113;

    public static final int GL_SYNC_STATUS = 0x9114;

    public static final int GL_SYNC_FLAGS = 0x9115;

    public static final int GL_SYNC_FENCE = 0x9116;

    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

    public static final int GL_UNSIGNALED = 0x9118;

    public static final int GL_SIGNALED = 0x9119;

    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x1;

    public static final long GL_TIMEOUT_IGNORED = -1;

    public static final int GL_ALREADY_SIGNALED = 0x911a;

    public static final int GL_TIMEOUT_EXPIRED = 0x911b;

    public static final int GL_CONDITION_SATISFIED = 0x911c;

    public static final int GL_WAIT_FAILED = 0x911d;

    public static final int GL_R8_SNORM = 0x8f94;

    public static final int GL_RG8_SNORM = 0x8f95;

    public static final int GL_RGB8_SNORM = 0x8f96;

    public static final int GL_RGBA8_SNORM = 0x8f97;

    public static final int GL_SIGNED_NORMALIZED = 0x8f9c;

    public static final int GL_COPY_READ_BUFFER = 0x8f36;

    public static final int GL_COPY_WRITE_BUFFER = 0x8f37;

    public static final int GL_UNIFORM_BUFFER = 0x8a11;

    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8a28;

    public static final int GL_UNIFORM_BUFFER_START = 0x8a29;

    public static final int GL_UNIFORM_BUFFER_SIZE = 0x8a2a;

    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8a2b;

    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8a2d;

    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8a2e;

    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8a2f;

    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8a30;

    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8a31;

    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8a33;

    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8a34;

    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8a35;

    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8a36;

    public static final int GL_UNIFORM_TYPE = 0x8a37;

    public static final int GL_UNIFORM_SIZE = 0x8a38;

    public static final int GL_UNIFORM_NAME_LENGTH = 0x8a39;

    public static final int GL_UNIFORM_BLOCK_INDEX = 0x8a3a;

    public static final int GL_UNIFORM_OFFSET = 0x8a3b;

    public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8a3c;

    public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8a3d;

    public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8a3e;

    public static final int GL_UNIFORM_BLOCK_BINDING = 0x8a3f;

    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8a40;

    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8a41;

    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8a42;

    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8a43;

    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8a44;

    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8a46;

    public static final int GL_INVALID_INDEX = 0xffffffff;

    public static final int GL_MAJOR_VERSION = 0x821b;

    public static final int GL_MINOR_VERSION = 0x821c;

    public static final int GL_NUM_EXTENSIONS = 0x821d;

    public static final int GL_COMPARE_REF_TO_TEXTURE = 0x884e;

    public static final int GL_MAX_VARYING_COMPONENTS = 0x8b4b;

    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88fd;

    public static final int GL_SAMPLER_2D_ARRAY = 0x8dc1;

    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8dc4;

    public static final int GL_SAMPLER_CUBE_SHADOW = 0x8dc5;

    public static final int GL_UNSIGNED_INT_VEC2 = 0x8dc6;

    public static final int GL_UNSIGNED_INT_VEC3 = 0x8dc7;

    public static final int GL_UNSIGNED_INT_VEC4 = 0x8dc8;

    public static final int GL_INT_SAMPLER_2D = 0x8dca;

    public static final int GL_INT_SAMPLER_3D = 0x8dcb;

    public static final int GL_INT_SAMPLER_CUBE = 0x8dcc;

    public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8dcf;

    public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8dd2;

    public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8dd3;

    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8dd4;

    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8dd7;

    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;

    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

    public static final int GL_MAP_READ_BIT = 0x1;

    public static final int GL_MAP_WRITE_BIT = 0x2;

    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x4;

    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x8;

    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x10;

    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x20;

    public static final int GL_BUFFER_ACCESS_FLAGS = 0x911f;

    public static final int GL_BUFFER_MAP_LENGTH = 0x9120;

    public static final int GL_BUFFER_MAP_OFFSET = 0x9121;

    public static final int GL_DEPTH_COMPONENT32F = 0x8cac;

    public static final int GL_DEPTH32F_STENCIL8 = 0x8cad;

    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8dad;

    public static final int GL_UNSIGNED_NORMALIZED = 0x8c17;

    public static final int GL_RGBA32F = 0x8814;

    public static final int GL_RGB32F = 0x8815;

    public static final int GL_RGBA16F = 0x881a;

    public static final int GL_RGB16F = 0x881b;

    public static final int GL_R11F_G11F_B10F = 0x8c3a;

    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8c3b;

    public static final int GL_RGB9_E5 = 0x8c3d;

    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8c3e;

    public static final int GL_FRAMEBUFFER = 0x8d40;

    public static final int GL_READ_FRAMEBUFFER = 0x8ca8;

    public static final int GL_DRAW_FRAMEBUFFER = 0x8ca9;

    public static final int GL_RENDERBUFFER = 0x8d41;

    public static final int GL_STENCIL_INDEX8 = 0x8d48;

    public static final int GL_RENDERBUFFER_WIDTH = 0x8d42;

    public static final int GL_RENDERBUFFER_HEIGHT = 0x8d43;

    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8d44;

    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8d50;

    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8d51;

    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8d52;

    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8d53;

    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8d54;

    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8d55;

    public static final int GL_RENDERBUFFER_SAMPLES = 0x8cab;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8cd0;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8cd1;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8cd2;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8cd3;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8cd4;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;

    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;

    public static final int GL_COLOR_ATTACHMENT0 = 0x8ce0;

    public static final int GL_COLOR_ATTACHMENT1 = 0x8ce1;

    public static final int GL_COLOR_ATTACHMENT2 = 0x8ce2;

    public static final int GL_COLOR_ATTACHMENT3 = 0x8ce3;

    public static final int GL_COLOR_ATTACHMENT4 = 0x8ce4;

    public static final int GL_COLOR_ATTACHMENT5 = 0x8ce5;

    public static final int GL_COLOR_ATTACHMENT6 = 0x8ce6;

    public static final int GL_COLOR_ATTACHMENT7 = 0x8ce7;

    public static final int GL_COLOR_ATTACHMENT8 = 0x8ce8;

    public static final int GL_COLOR_ATTACHMENT9 = 0x8ce9;

    public static final int GL_COLOR_ATTACHMENT10 = 0x8cea;

    public static final int GL_COLOR_ATTACHMENT11 = 0x8ceb;

    public static final int GL_COLOR_ATTACHMENT12 = 0x8cec;

    public static final int GL_COLOR_ATTACHMENT13 = 0x8ced;

    public static final int GL_COLOR_ATTACHMENT14 = 0x8cee;

    public static final int GL_COLOR_ATTACHMENT15 = 0x8cef;

    public static final int GL_COLOR_ATTACHMENT16 = 0x8cf0;

    public static final int GL_COLOR_ATTACHMENT17 = 0x8cf1;

    public static final int GL_COLOR_ATTACHMENT18 = 0x8cf2;

    public static final int GL_COLOR_ATTACHMENT19 = 0x8cf3;

    public static final int GL_COLOR_ATTACHMENT20 = 0x8cf4;

    public static final int GL_COLOR_ATTACHMENT21 = 0x8cf5;

    public static final int GL_COLOR_ATTACHMENT22 = 0x8cf6;

    public static final int GL_COLOR_ATTACHMENT23 = 0x8cf7;

    public static final int GL_COLOR_ATTACHMENT24 = 0x8cf8;

    public static final int GL_COLOR_ATTACHMENT25 = 0x8cf9;

    public static final int GL_COLOR_ATTACHMENT26 = 0x8cfa;

    public static final int GL_COLOR_ATTACHMENT27 = 0x8cfb;

    public static final int GL_COLOR_ATTACHMENT28 = 0x8cfc;

    public static final int GL_COLOR_ATTACHMENT29 = 0x8cfd;

    public static final int GL_COLOR_ATTACHMENT30 = 0x8cfe;

    public static final int GL_COLOR_ATTACHMENT31 = 0x8cff;

    public static final int GL_DEPTH_ATTACHMENT = 0x8d00;

    public static final int GL_STENCIL_ATTACHMENT = 0x8d20;

    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821a;

    public static final int GL_MAX_SAMPLES = 0x8d57;

    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8cd5;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8cd6;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8cd7;

    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8cdd;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8d56;

    public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;

    public static final int GL_FRAMEBUFFER_BINDING = 0x8ca6;

    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8ca6;

    public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8caa;

    public static final int GL_RENDERBUFFER_BINDING = 0x8ca7;

    public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8cdf;

    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84e8;

    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

    public static final int GL_DEPTH_STENCIL = 0x84f9;

    public static final int GL_UNSIGNED_INT_24_8 = 0x84fa;

    public static final int GL_DEPTH24_STENCIL8 = 0x88f0;

    public static final int GL_HALF_FLOAT = 0x140b;

    public static final int GL_RGBA32UI = 0x8d70;

    public static final int GL_RGB32UI = 0x8d71;

    public static final int GL_RGBA16UI = 0x8d76;

    public static final int GL_RGB16UI = 0x8d77;

    public static final int GL_RGBA8UI = 0x8d7c;

    public static final int GL_RGB8UI = 0x8d7d;

    public static final int GL_RGBA32I = 0x8d82;

    public static final int GL_RGB32I = 0x8d83;

    public static final int GL_RGBA16I = 0x8d88;

    public static final int GL_RGB16I = 0x8d89;

    public static final int GL_RGBA8I = 0x8d8e;

    public static final int GL_RGB8I = 0x8d8f;

    public static final int GL_RED_INTEGER = 0x8d94;

    public static final int GL_RGB_INTEGER = 0x8d98;

    public static final int GL_RGBA_INTEGER = 0x8d99;

    public static final int GL_TEXTURE_2D_ARRAY = 0x8c1a;

    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8c1d;

    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88ff;

    public static final int GL_R8 = 0x8229;

    public static final int GL_RG8 = 0x822b;

    public static final int GL_R16F = 0x822d;

    public static final int GL_R32F = 0x822e;

    public static final int GL_RG16F = 0x822f;

    public static final int GL_RG32F = 0x8230;

    public static final int GL_R8I = 0x8231;

    public static final int GL_R8UI = 0x8232;

    public static final int GL_R16I = 0x8233;

    public static final int GL_R16UI = 0x8234;

    public static final int GL_R32I = 0x8235;

    public static final int GL_R32UI = 0x8236;

    public static final int GL_RG8I = 0x8237;

    public static final int GL_RG8UI = 0x8238;

    public static final int GL_RG16I = 0x8239;

    public static final int GL_RG16UI = 0x823a;

    public static final int GL_RG32I = 0x823b;

    public static final int GL_RG32UI = 0x823c;

    public static final int GL_RG = 0x8227;

    public static final int GL_RG_INTEGER = 0x8228;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8c8e;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8c84;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8c85;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8c8f;

    public static final int GL_INTERLEAVED_ATTRIBS = 0x8c8c;

    public static final int GL_SEPARATE_ATTRIBS = 0x8c8d;

    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8c88;

    public static final int GL_RASTERIZER_DISCARD = 0x8c89;

    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8c8a;

    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8c8b;

    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8c80;

    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8c83;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8c7f;

    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8c76;

    public static final int GL_VERTEX_ARRAY_BINDING = 0x85b5;

    public static final int GL_FLOAT_MAT2x3 = 0x8b65;

    public static final int GL_FLOAT_MAT2x4 = 0x8b66;

    public static final int GL_FLOAT_MAT3x2 = 0x8b67;

    public static final int GL_FLOAT_MAT3x4 = 0x8b68;

    public static final int GL_FLOAT_MAT4x2 = 0x8b69;

    public static final int GL_FLOAT_MAT4x3 = 0x8b6a;

    public static final int GL_PIXEL_PACK_BUFFER = 0x88eb;

    public static final int GL_PIXEL_UNPACK_BUFFER = 0x88ec;

    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ed;

    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88ef;

    public static final int GL_SRGB = 0x8c40;

    public static final int GL_SRGB8 = 0x8c41;

    public static final int GL_SRGB8_ALPHA8 = 0x8c43;

    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8b8c;

    public static final int GL_CURRENT_PROGRAM = 0x8b8d;

    public static final int GL_SHADER_TYPE = 0x8b4f;

    public static final int GL_DELETE_STATUS = 0x8b80;

    public static final int GL_COMPILE_STATUS = 0x8b81;

    public static final int GL_LINK_STATUS = 0x8b82;

    public static final int GL_VALIDATE_STATUS = 0x8b83;

    public static final int GL_INFO_LOG_LENGTH = 0x8b84;

    public static final int GL_ATTACHED_SHADERS = 0x8b85;

    public static final int GL_ACTIVE_UNIFORMS = 0x8b86;

    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8b87;

    public static final int GL_ACTIVE_ATTRIBUTES = 0x8b89;

    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8b8a;

    public static final int GL_SHADER_SOURCE_LENGTH = 0x8b88;

    public static final int GL_FLOAT_VEC2 = 0x8b50;

    public static final int GL_FLOAT_VEC3 = 0x8b51;

    public static final int GL_FLOAT_VEC4 = 0x8b52;

    public static final int GL_INT_VEC2 = 0x8b53;

    public static final int GL_INT_VEC3 = 0x8b54;

    public static final int GL_INT_VEC4 = 0x8b55;

    public static final int GL_BOOL = 0x8b56;

    public static final int GL_BOOL_VEC2 = 0x8b57;

    public static final int GL_BOOL_VEC3 = 0x8b58;

    public static final int GL_BOOL_VEC4 = 0x8b59;

    public static final int GL_FLOAT_MAT2 = 0x8b5a;

    public static final int GL_FLOAT_MAT3 = 0x8b5b;

    public static final int GL_FLOAT_MAT4 = 0x8b5c;

    public static final int GL_SAMPLER_2D = 0x8b5e;

    public static final int GL_SAMPLER_3D = 0x8b5f;

    public static final int GL_SAMPLER_CUBE = 0x8b60;

    public static final int GL_SAMPLER_2D_SHADOW = 0x8b62;

    public static final int GL_VERTEX_SHADER = 0x8b31;

    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8b4a;

    public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;

    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;

    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8b4c;

    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8b4d;

    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;

    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;

    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;

    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;

    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886a;

    public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;

    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

    public static final int GL_FRAGMENT_SHADER = 0x8b30;

    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8b49;

    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8b8b;

    public static final int GL_MAX_DRAW_BUFFERS = 0x8824;

    public static final int GL_DRAW_BUFFER0 = 0x8825;

    public static final int GL_DRAW_BUFFER1 = 0x8826;

    public static final int GL_DRAW_BUFFER2 = 0x8827;

    public static final int GL_DRAW_BUFFER3 = 0x8828;

    public static final int GL_DRAW_BUFFER4 = 0x8829;

    public static final int GL_DRAW_BUFFER5 = 0x882a;

    public static final int GL_DRAW_BUFFER6 = 0x882b;

    public static final int GL_DRAW_BUFFER7 = 0x882c;

    public static final int GL_DRAW_BUFFER8 = 0x882d;

    public static final int GL_DRAW_BUFFER9 = 0x882e;

    public static final int GL_DRAW_BUFFER10 = 0x882f;

    public static final int GL_DRAW_BUFFER11 = 0x8830;

    public static final int GL_DRAW_BUFFER12 = 0x8831;

    public static final int GL_DRAW_BUFFER13 = 0x8832;

    public static final int GL_DRAW_BUFFER14 = 0x8833;

    public static final int GL_DRAW_BUFFER15 = 0x8834;

    public static final int GL_BLEND_EQUATION_RGB = 0x8009;

    public static final int GL_BLEND_EQUATION_ALPHA = 0x883d;

    public static final int GL_STENCIL_BACK_FUNC = 0x8800;

    public static final int GL_STENCIL_BACK_FAIL = 0x8801;

    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;

    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;

    public static final int GL_STENCIL_BACK_REF = 0x8ca3;

    public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8ca4;

    public static final int GL_STENCIL_BACK_WRITEMASK = 0x8ca5;

    public static final int GL_ARRAY_BUFFER = 0x8892;

    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

    public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;

    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;

    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889f;

    public static final int GL_STREAM_DRAW = 0x88e0;

    public static final int GL_STREAM_READ = 0x88e1;

    public static final int GL_STREAM_COPY = 0x88e2;

    public static final int GL_STATIC_DRAW = 0x88e4;

    public static final int GL_STATIC_READ = 0x88e5;

    public static final int GL_STATIC_COPY = 0x88e6;

    public static final int GL_DYNAMIC_DRAW = 0x88e8;

    public static final int GL_DYNAMIC_READ = 0x88e9;

    public static final int GL_DYNAMIC_COPY = 0x88ea;

    public static final int GL_BUFFER_SIZE = 0x8764;

    public static final int GL_BUFFER_USAGE = 0x8765;

    public static final int GL_BUFFER_MAPPED = 0x88bc;

    public static final int GL_BUFFER_MAP_POINTER = 0x88bd;

    public static final int GL_CURRENT_QUERY = 0x8865;

    public static final int GL_QUERY_RESULT = 0x8866;

    public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;

    public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;

    public static final int GL_CONSTANT_COLOR = 0x8001;

    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;

    public static final int GL_CONSTANT_ALPHA = 0x8003;

    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

    public static final int GL_FUNC_ADD = 0x8006;

    public static final int GL_MIN = 0x8007;

    public static final int GL_MAX = 0x8008;

    public static final int GL_FUNC_SUBTRACT = 0x800a;

    public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800b;

    public static final int GL_DEPTH_COMPONENT16 = 0x81a5;

    public static final int GL_DEPTH_COMPONENT24 = 0x81a6;

    public static final int GL_TEXTURE_COMPARE_MODE = 0x884c;

    public static final int GL_TEXTURE_COMPARE_FUNC = 0x884d;

    public static final int GL_BLEND_DST_RGB = 0x80c8;

    public static final int GL_BLEND_SRC_RGB = 0x80c9;

    public static final int GL_BLEND_DST_ALPHA = 0x80ca;

    public static final int GL_BLEND_SRC_ALPHA = 0x80cb;

    public static final int GL_INCR_WRAP = 0x8507;

    public static final int GL_DECR_WRAP = 0x8508;

    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84fd;

    public static final int GL_MIRRORED_REPEAT = 0x8370;

    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86a2;

    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86a3;

    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;

    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;

    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;

    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851a;

    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851c;

    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809e;

    public static final int GL_SAMPLE_COVERAGE = 0x80a0;

    public static final int GL_SAMPLE_BUFFERS = 0x80a8;

    public static final int GL_SAMPLES = 0x80a9;

    public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80aa;

    public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80ab;

    public static final int GL_TEXTURE0 = 0x84c0;

    public static final int GL_TEXTURE1 = 0x84c1;

    public static final int GL_TEXTURE2 = 0x84c2;

    public static final int GL_TEXTURE3 = 0x84c3;

    public static final int GL_TEXTURE4 = 0x84c4;

    public static final int GL_TEXTURE5 = 0x84c5;

    public static final int GL_TEXTURE6 = 0x84c6;

    public static final int GL_TEXTURE7 = 0x84c7;

    public static final int GL_TEXTURE8 = 0x84c8;

    public static final int GL_TEXTURE9 = 0x84c9;

    public static final int GL_TEXTURE10 = 0x84ca;

    public static final int GL_TEXTURE11 = 0x84cb;

    public static final int GL_TEXTURE12 = 0x84cc;

    public static final int GL_TEXTURE13 = 0x84cd;

    public static final int GL_TEXTURE14 = 0x84ce;

    public static final int GL_TEXTURE15 = 0x84cf;

    public static final int GL_TEXTURE16 = 0x84d0;

    public static final int GL_TEXTURE17 = 0x84d1;

    public static final int GL_TEXTURE18 = 0x84d2;

    public static final int GL_TEXTURE19 = 0x84d3;

    public static final int GL_TEXTURE20 = 0x84d4;

    public static final int GL_TEXTURE21 = 0x84d5;

    public static final int GL_TEXTURE22 = 0x84d6;

    public static final int GL_TEXTURE23 = 0x84d7;

    public static final int GL_TEXTURE24 = 0x84d8;

    public static final int GL_TEXTURE25 = 0x84d9;

    public static final int GL_TEXTURE26 = 0x84da;

    public static final int GL_TEXTURE27 = 0x84db;

    public static final int GL_TEXTURE28 = 0x84dc;

    public static final int GL_TEXTURE29 = 0x84dd;

    public static final int GL_TEXTURE30 = 0x84de;

    public static final int GL_TEXTURE31 = 0x84df;

    public static final int GL_ACTIVE_TEXTURE = 0x84e0;

    public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846d;

    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846e;

    public static final int GL_TEXTURE_BINDING_3D = 0x806a;

    public static final int GL_UNPACK_SKIP_IMAGES = 0x806d;

    public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806e;

    public static final int GL_TEXTURE_3D = 0x806f;

    public static final int GL_TEXTURE_WRAP_R = 0x8072;

    public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;

    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;

    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;

    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;

    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;

    public static final int GL_CLAMP_TO_EDGE = 0x812f;

    public static final int GL_TEXTURE_MIN_LOD = 0x813a;

    public static final int GL_TEXTURE_MAX_LOD = 0x813b;

    public static final int GL_TEXTURE_BASE_LEVEL = 0x813c;

    public static final int GL_TEXTURE_MAX_LEVEL = 0x813d;

    public static final int GL_MAX_ELEMENTS_VERTICES = 0x80e8;

    public static final int GL_MAX_ELEMENTS_INDICES = 0x80e9;

    public static final int GL_NEVER = 0x200;

    public static final int GL_LESS = 0x201;

    public static final int GL_EQUAL = 0x202;

    public static final int GL_LEQUAL = 0x203;

    public static final int GL_GREATER = 0x204;

    public static final int GL_NOTEQUAL = 0x205;

    public static final int GL_GEQUAL = 0x206;

    public static final int GL_ALWAYS = 0x207;

    public static final int GL_DEPTH_BUFFER_BIT = 0x100;

    public static final int GL_STENCIL_BUFFER_BIT = 0x400;

    public static final int GL_COLOR_BUFFER_BIT = 0x4000;

    public static final int GL_POINTS = 0x0;

    public static final int GL_LINES = 0x1;

    public static final int GL_LINE_LOOP = 0x2;

    public static final int GL_LINE_STRIP = 0x3;

    public static final int GL_TRIANGLES = 0x4;

    public static final int GL_TRIANGLE_STRIP = 0x5;

    public static final int GL_TRIANGLE_FAN = 0x6;

    public static final int GL_ZERO = 0x0;

    public static final int GL_ONE = 0x1;

    public static final int GL_SRC_COLOR = 0x300;

    public static final int GL_ONE_MINUS_SRC_COLOR = 0x301;

    public static final int GL_SRC_ALPHA = 0x302;

    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x303;

    public static final int GL_DST_ALPHA = 0x304;

    public static final int GL_ONE_MINUS_DST_ALPHA = 0x305;

    public static final int GL_DST_COLOR = 0x306;

    public static final int GL_ONE_MINUS_DST_COLOR = 0x307;

    public static final int GL_SRC_ALPHA_SATURATE = 0x308;

    public static final int GL_TRUE = 0x1;

    public static final int GL_FALSE = 0x0;

    public static final int GL_BYTE = 0x1400;

    public static final int GL_UNSIGNED_BYTE = 0x1401;

    public static final int GL_SHORT = 0x1402;

    public static final int GL_UNSIGNED_SHORT = 0x1403;

    public static final int GL_INT = 0x1404;

    public static final int GL_UNSIGNED_INT = 0x1405;

    public static final int GL_FLOAT = 0x1406;

    public static final int GL_NONE = 0x0;

    public static final int GL_FRONT = 0x404;

    public static final int GL_BACK = 0x405;

    public static final int GL_FRONT_AND_BACK = 0x408;

    public static final int GL_NO_ERROR = 0x0;

    public static final int GL_INVALID_ENUM = 0x500;

    public static final int GL_INVALID_VALUE = 0x501;

    public static final int GL_INVALID_OPERATION = 0x502;

    public static final int GL_OUT_OF_MEMORY = 0x505;

    public static final int GL_CW = 0x900;

    public static final int GL_CCW = 0x901;

    public static final int GL_LINE_WIDTH = 0xb21;

    public static final int GL_CULL_FACE = 0xb44;

    public static final int GL_CULL_FACE_MODE = 0xb45;

    public static final int GL_FRONT_FACE = 0xb46;

    public static final int GL_DEPTH_RANGE = 0xb70;

    public static final int GL_DEPTH_TEST = 0xb71;

    public static final int GL_DEPTH_WRITEMASK = 0xb72;

    public static final int GL_DEPTH_CLEAR_VALUE = 0xb73;

    public static final int GL_DEPTH_FUNC = 0xb74;

    public static final int GL_STENCIL_TEST = 0xb90;

    public static final int GL_STENCIL_CLEAR_VALUE = 0xb91;

    public static final int GL_STENCIL_FUNC = 0xb92;

    public static final int GL_STENCIL_VALUE_MASK = 0xb93;

    public static final int GL_STENCIL_FAIL = 0xb94;

    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0xb95;

    public static final int GL_STENCIL_PASS_DEPTH_PASS = 0xb96;

    public static final int GL_STENCIL_REF = 0xb97;

    public static final int GL_STENCIL_WRITEMASK = 0xb98;

    public static final int GL_VIEWPORT = 0xba2;

    public static final int GL_DITHER = 0xbd0;

    public static final int GL_BLEND = 0xbe2;

    public static final int GL_READ_BUFFER = 0xc02;

    public static final int GL_SCISSOR_BOX = 0xc10;

    public static final int GL_SCISSOR_TEST = 0xc11;

    public static final int GL_COLOR_CLEAR_VALUE = 0xc22;

    public static final int GL_COLOR_WRITEMASK = 0xc23;

    public static final int GL_UNPACK_ROW_LENGTH = 0xcf2;

    public static final int GL_UNPACK_SKIP_ROWS = 0xcf3;

    public static final int GL_UNPACK_SKIP_PIXELS = 0xcf4;

    public static final int GL_UNPACK_ALIGNMENT = 0xcf5;

    public static final int GL_PACK_ROW_LENGTH = 0xd02;

    public static final int GL_PACK_SKIP_ROWS = 0xd03;

    public static final int GL_PACK_SKIP_PIXELS = 0xd04;

    public static final int GL_PACK_ALIGNMENT = 0xd05;

    public static final int GL_MAX_TEXTURE_SIZE = 0xd33;

    public static final int GL_MAX_VIEWPORT_DIMS = 0xd3a;

    public static final int GL_SUBPIXEL_BITS = 0xd50;

    public static final int GL_RED_BITS = 0xd52;

    public static final int GL_GREEN_BITS = 0xd53;

    public static final int GL_BLUE_BITS = 0xd54;

    public static final int GL_ALPHA_BITS = 0xd55;

    public static final int GL_DEPTH_BITS = 0xd56;

    public static final int GL_STENCIL_BITS = 0xd57;

    public static final int GL_TEXTURE_2D = 0xde1;

    public static final int GL_DONT_CARE = 0x1100;

    public static final int GL_FASTEST = 0x1101;

    public static final int GL_NICEST = 0x1102;

    public static final int GL_INVERT = 0x150a;

    public static final int GL_TEXTURE = 0x1702;

    public static final int GL_COLOR = 0x1800;

    public static final int GL_DEPTH = 0x1801;

    public static final int GL_STENCIL = 0x1802;

    public static final int GL_DEPTH_COMPONENT = 0x1902;

    public static final int GL_RED = 0x1903;

    public static final int GL_GREEN = 0x1904;

    public static final int GL_BLUE = 0x1905;

    public static final int GL_ALPHA = 0x1906;

    public static final int GL_RGB = 0x1907;

    public static final int GL_RGBA = 0x1908;

    public static final int GL_LUMINANCE = 0x1909;

    public static final int GL_LUMINANCE_ALPHA = 0x190a;

    public static final int GL_KEEP = 0x1e00;

    public static final int GL_REPLACE = 0x1e01;

    public static final int GL_INCR = 0x1e02;

    public static final int GL_DECR = 0x1e03;

    public static final int GL_VENDOR = 0x1f00;

    public static final int GL_RENDERER = 0x1f01;

    public static final int GL_VERSION = 0x1f02;

    public static final int GL_EXTENSIONS = 0x1f03;

    public static final int GL_NEAREST = 0x2600;

    public static final int GL_LINEAR = 0x2601;

    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;

    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;

    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;

    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;

    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;

    public static final int GL_TEXTURE_WRAP_S = 0x2802;

    public static final int GL_TEXTURE_WRAP_T = 0x2803;

    public static final int GL_REPEAT = 0x2901;

    public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;

    public static final int GL_POLYGON_OFFSET_UNITS = 0x2a00;

    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;

    public static final int GL_RGB8 = 0x8051;

    public static final int GL_RGBA4 = 0x8056;

    public static final int GL_RGB5_A1 = 0x8057;

    public static final int GL_RGBA8 = 0x8058;

    public static final int GL_RGB10_A2 = 0x8059;

    public static final int GL_TEXTURE_BINDING_2D = 0x8069;

    public static final int GL_COMPRESSED_RGB8_ETC2 = 0x9274;

    public static final int GL_COMPRESSED_SRGB8_ETC2 = 0x9275;

    public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;

    public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;

    public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = 0x9278;

    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;

    public static final int GL_COMPRESSED_R11_EAC = 0x9270;

    public static final int GL_COMPRESSED_SIGNED_R11_EAC = 0x9271;

    public static final int GL_COMPRESSED_RG11_EAC = 0x9272;

    public static final int GL_COMPRESSED_SIGNED_RG11_EAC = 0x9273;

    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8d69;

    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8d6a;

    public static final int GL_MAX_ELEMENT_INDEX = 0x8d6b;

    public static final int GL_SHADER_COMPILER = 0x8dfa;

    public static final int GL_SHADER_BINARY_FORMATS = 0x8df8;

    public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8df9;

    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8dfb;

    public static final int GL_MAX_VARYING_VECTORS = 0x8dfc;

    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8dfd;

    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8b9a;

    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8b9b;

    public static final int GL_FIXED = 0x140c;

    public static final int GL_LOW_FLOAT = 0x8df0;

    public static final int GL_MEDIUM_FLOAT = 0x8df1;

    public static final int GL_HIGH_FLOAT = 0x8df2;

    public static final int GL_LOW_INT = 0x8df3;

    public static final int GL_MEDIUM_INT = 0x8df4;

    public static final int GL_HIGH_INT = 0x8df5;

    public static final int GL_RGB565 = 0x8d62;

    void glDeleteSamplers(int[] samplers);

    void glDeleteSamplers(IntBuffer samplers);

    void glDeleteSamplers(int sampler);

    int glGenSamplers();

    void glGenSamplers(IntBuffer samplers);

    void glGenSamplers(int[] samplers);

    boolean glIsSampler(int sampler);

    void glBindSampler(int unit, int sampler);

    void glSamplerParameteri(int sampler, int pname, int param);

    void glGetSamplerParameteriv(int sampler, int pname, int[] params);

    void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params);

    float glGetSamplerParameterf(int sampler, int pname);

    void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params);

    void glGetSamplerParameterfv(int sampler, int pname, float[] params);

    void glSamplerParameterfv(int sampler, int pname, FloatBuffer param);

    void glSamplerParameterfv(int sampler, int pname, float[] param);

    void glSamplerParameterf(int sampler, int pname, float param);

    void glSamplerParameteriv(int sampler, int pname, int[] param);

    void glSamplerParameteriv(int sampler, int pname, IntBuffer param);

    int glGetSamplerParameteri(int sampler, int pname);

    void glVertexAttribDivisor(int index, int divisor);

    long glGetInteger64i(int target, int index);

    void glWaitSync(long sync, int flags, long timeout);

    boolean glIsSync(long sync);

    void glDeleteSync(long sync);

    int glClientWaitSync(long sync, int flags, long timeout);

    void glGetInteger64i_v(int target, int index, LongBuffer data);

    void glGetInteger64i_v(int target, int index, long[] data);

    void glGetInteger64v(int pname, long[] data);

    void glGetInteger64v(int pname, LongBuffer data);

    long glFenceSync(int condition, int flags);

    void glGetSynciv(long sync, int pname, int[] length, int[] values);

    void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values);

    int glGetSynci(long sync, int pname, IntBuffer length);

    long glGetInteger64(int pname);

    void glGetBufferParameteri64v(int target, int pname, long[] params);

    void glGetBufferParameteri64v(int target, int pname, LongBuffer params);

    long glGetBufferParameteri64(int target, int pname);

    void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params);

    void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params);

    int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname);

    void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int[] length, ByteBuffer uniformBlockName);

    String glGetActiveUniformBlockName(int program, int uniformBlockIndex);

    String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize);

    void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName);

    void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices);

    void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices);

    void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount);

    void glDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount);

    void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount);

    void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount);

    void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount);

    void glDrawArraysInstanced(int mode, int first, int count, int instancecount);

    void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size);

    void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params);

    void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params);

    int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName);

    int glGetUniformBlockIndex(int program, CharSequence uniformBlockName);

    void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params);

    void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params);

    int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname);

    String glGetStringi(int name, int index);

    void glClearBufferiv(int buffer, int drawbuffer, int[] value);

    void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value);

    void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    void glVertexAttribI4iv(int index, int[] v);

    void glVertexAttribI4iv(int index, IntBuffer v);

    void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value);

    void glClearBufferfv(int buffer, int drawbuffer, float[] value);

    void glVertexAttribI4i(int index, int x, int y, int z, int w);

    void glClearBufferuiv(int buffer, int drawbuffer, int[] value);

    void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value);

    boolean glIsRenderbuffer(int renderbuffer);

    void glBindRenderbuffer(int target, int renderbuffer);

    void glUniform1uiv(int location, IntBuffer value);

    void glUniform1uiv(int location, int[] value);

    void glUniform2ui(int location, int v0, int v1);

    void glUniform3ui(int location, int v0, int v1, int v2);

    void glUniform2uiv(int location, IntBuffer value);

    void glUniform2uiv(int location, int[] value);

    void glGetUniformuiv(int program, int location, int[] params);

    void glGetUniformuiv(int program, int location, IntBuffer params);

    void glUniform4ui(int location, int v0, int v1, int v2, int v3);

    void glUniform4uiv(int location, IntBuffer value);

    void glUniform4uiv(int location, int[] value);

    void glUniform3uiv(int location, IntBuffer value);

    void glUniform3uiv(int location, int[] value);

    int glGetUniformui(int program, int location);

    ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer);

    ByteBuffer glMapBufferRange(int target, long offset, long length, int access);

    void glUniform1ui(int location, int v0);

    void glGetIntegeri_v(int target, int index, int[] data);

    void glGetIntegeri_v(int target, int index, IntBuffer data);

    void glGenFramebuffers(int[] framebuffers);

    int glGenFramebuffers();

    void glGenFramebuffers(IntBuffer framebuffers);

    void glGenerateMipmap(int target);

    void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

    boolean glIsFramebuffer(int framebuffer);

    void glBindFramebuffer(int target, int framebuffer);

    int glGenRenderbuffers();

    void glGenRenderbuffers(IntBuffer renderbuffers);

    void glGenRenderbuffers(int[] renderbuffers);

    void glGenVertexArrays(IntBuffer arrays);

    void glGenVertexArrays(int[] arrays);

    int glGenVertexArrays();

    void glBindVertexArray(int array);

    int glGetIntegeri(int target, int index);

    void glBindBufferBase(int target, int index, int buffer);

    boolean glIsVertexArray(int array);

    void glBindBufferRange(int target, int index, int buffer, long offset, long size);

    void glVertexAttribI4uiv(int index, IntBuffer v);

    void glVertexAttribI4uiv(int index, int[] v);

    void glRenderbufferStorage(int target, int internalformat, int width, int height);

    int glGetVertexAttribIui(int index, int pname);

    void glFlushMappedBufferRange(int target, long offset, long length);

    int glGetRenderbufferParameteri(int target, int pname);

    int glGetVertexAttribIi(int index, int pname);

    int glCheckFramebufferStatus(int target);

    int glGetFragDataLocation(int program, CharSequence name);

    int glGetFragDataLocation(int program, ByteBuffer name);

    void glDeleteFramebuffers(int framebuffer);

    void glDeleteFramebuffers(int[] framebuffers);

    void glDeleteFramebuffers(IntBuffer framebuffers);

    void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer);

    void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode);

    void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode);

    void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode);

    void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type);

    String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type);

    void glGetVertexAttribIuiv(int index, int pname, int[] params);

    void glGetVertexAttribIuiv(int index, int pname, IntBuffer params);

    void glDeleteRenderbuffers(int renderbuffer);

    void glDeleteRenderbuffers(int[] renderbuffers);

    void glDeleteRenderbuffers(IntBuffer renderbuffers);

    void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

    void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);

    void glGetRenderbufferParameteriv(int target, int pname, int[] params);

    void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params);

    void glEndTransformFeedback();

    void glGetVertexAttribIiv(int index, int pname, int[] params);

    void glGetVertexAttribIiv(int index, int pname, IntBuffer params);

    void glDeleteVertexArrays(int[] arrays);

    void glDeleteVertexArrays(IntBuffer arrays);

    void glDeleteVertexArrays(int array);

    void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer);

    void glBeginTransformFeedback(int primitiveMode);

    void glUniformMatrix4x2fv(int location, boolean transpose, float[] value);

    void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix3x2fv(int location, boolean transpose, float[] value);

    void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix2x3fv(int location, boolean transpose, float[] value);

    void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix4x3fv(int location, boolean transpose, float[] value);

    void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix2x4fv(int location, boolean transpose, float[] value);

    void glUniformMatrix3x4fv(int location, boolean transpose, float[] value);

    void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value);

    int glGetProgrami(int program, int pname);

    void glLinkProgram(int program);

    int glCreateProgram();

    void glAttachShader(int program, int shader);

    void glDeleteShader(int shader);

    void glShaderSource(int shader, CharSequence[] string);

    void glShaderSource(int shader, CharSequence string);

    void glShaderSource(int shader, PointerBuffer string, IntBuffer length);

    void glShaderSource(int shader, PointerBuffer string, int[] length);

    boolean glIsProgram(int program);

    void glValidateProgram(int program);

    boolean glIsShader(int shader);

    void glCompileShader(int shader);

    void glUseProgram(int program);

    void glDeleteProgram(int program);

    int glCreateShader(int type);

    void glDetachShader(int program, int shader);

    void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix2fv(int location, boolean transpose, float[] value);

    void glUniform4fv(int location, FloatBuffer value);

    void glUniform4fv(int location, float[] value);

    void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix3fv(int location, boolean transpose, float[] value);

    void glUniform2f(int location, float v0, float v1);

    void glUniform3f(int location, float v0, float v1, float v2);

    void glUniform4f(int location, float v0, float v1, float v2, float v3);

    void glUniform2fv(int location, FloatBuffer value);

    void glUniform2fv(int location, float[] value);

    void glUniform3fv(int location, FloatBuffer value);

    void glUniform3fv(int location, float[] value);

    void glUniform1f(int location, float v0);

    void glUniform2iv(int location, IntBuffer value);

    void glUniform2iv(int location, int[] value);

    void glUniform1fv(int location, float[] value);

    void glUniform1fv(int location, FloatBuffer value);

    void glUniform3i(int location, int v0, int v1, int v2);

    void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value);

    void glUniformMatrix4fv(int location, boolean transpose, float[] value);

    void glUniform4i(int location, int v0, int v1, int v2, int v3);

    void glUniform3iv(int location, int[] value);

    void glUniform3iv(int location, IntBuffer value);

    void glUniform1i(int location, int v0);

    void glUniform4iv(int location, int[] value);

    void glUniform4iv(int location, IntBuffer value);

    void glUniform2i(int location, int v0, int v1);

    void glUniform1iv(int location, IntBuffer value);

    void glUniform1iv(int location, int[] value);

    void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type);

    String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type);

    float glGetUniformf(int program, int location);

    int glGetShaderi(int shader, int pname);

    void glGetUniformiv(int program, int location, IntBuffer params);

    void glGetUniformiv(int program, int location, int[] params);

    void glVertexAttrib2f(int index, float x, float y);

    int glGetUniformi(int program, int location);

    void glVertexAttrib3f(int index, float x, float y, float z);

    void glGetUniformfv(int program, int location, float[] params);

    void glGetUniformfv(int program, int location, FloatBuffer params);

    void glVertexAttrib1f(int index, float x);

    void glGetShaderiv(int shader, int pname, IntBuffer params);

    void glGetShaderiv(int shader, int pname, int[] params);

    void glGetShaderSource(int shader, int[] length, ByteBuffer source);

    String glGetShaderSource(int shader);

    void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source);

    String glGetShaderSource(int shader, int bufSize);

    void glGetProgramiv(int program, int pname, IntBuffer params);

    void glGetProgramiv(int program, int pname, int[] params);

    void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog);

    String glGetShaderInfoLog(int shader, int bufSize);

    void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog);

    String glGetShaderInfoLog(int shader);

    void glVertexAttrib4f(int index, float x, float y, float z, float w);

    void glVertexAttrib1fv(int index, FloatBuffer v);

    void glVertexAttrib1fv(int index, float[] v);

    void glVertexAttrib4fv(int index, float[] v);

    void glVertexAttrib4fv(int index, FloatBuffer v);

    void glVertexAttrib2fv(int index, FloatBuffer v);

    void glVertexAttrib2fv(int index, float[] v);

    void glVertexAttrib3fv(int index, FloatBuffer v);

    void glVertexAttrib3fv(int index, float[] v);

    void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type);

    String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type);

    void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    void glDrawBuffers(int[] bufs);

    void glDrawBuffers(IntBuffer bufs);

    void glDrawBuffers(int buf);

    void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders);

    void glGetAttachedShaders(int program, int[] count, int[] shaders);

    int glGetUniformLocation(int program, CharSequence name);

    int glGetUniformLocation(int program, ByteBuffer name);

    void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog);

    String glGetProgramInfoLog(int program, int bufSize);

    void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog);

    String glGetProgramInfoLog(int program);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer);

    void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer);

    void glEnableVertexAttribArray(int index);

    void glDisableVertexAttribArray(int index);

    void glBindAttribLocation(int program, int index, ByteBuffer name);

    void glBindAttribLocation(int program, int index, CharSequence name);

    void glStencilMaskSeparate(int face, int mask);

    int glGetAttribLocation(int program, CharSequence name);

    int glGetAttribLocation(int program, ByteBuffer name);

    void glGetVertexAttribfv(int index, int pname, float[] params);

    void glGetVertexAttribfv(int index, int pname, FloatBuffer params);

    void glGetVertexAttribiv(int index, int pname, int[] params);

    void glGetVertexAttribiv(int index, int pname, IntBuffer params);

    void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass);

    void glStencilFuncSeparate(int face, int func, int ref, int mask);

    void glBlendEquationSeparate(int modeRGB, int modeAlpha);

    long glGetVertexAttribPointer(int index, int pname);

    void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer);

    int glGenBuffers();

    void glGenBuffers(IntBuffer buffers);

    void glGenBuffers(int[] buffers);

    boolean glIsBuffer(int buffer);

    boolean glUnmapBuffer(int target);

    boolean glIsQuery(int id);

    void glBindBuffer(int target, int buffer);

    void glBufferData(int target, long size, int usage);

    void glBufferData(int target, ByteBuffer data, int usage);

    void glBufferData(int target, ShortBuffer data, int usage);

    void glBufferData(int target, IntBuffer data, int usage);

    void glBufferData(int target, int[] data, int usage);

    void glBufferData(int target, short[] data, int usage);

    void glBufferData(int target, float[] data, int usage);

    void glBufferData(int target, FloatBuffer data, int usage);

    long glGetBufferPointer(int target, int pname);

    void glDeleteBuffers(int[] buffers);

    void glDeleteBuffers(int buffer);

    void glDeleteBuffers(IntBuffer buffers);

    void glBufferSubData(int target, long offset, ShortBuffer data);

    void glBufferSubData(int target, long offset, ByteBuffer data);

    void glBufferSubData(int target, long offset, float[] data);

    void glBufferSubData(int target, long offset, short[] data);

    void glBufferSubData(int target, long offset, int[] data);

    void glBufferSubData(int target, long offset, IntBuffer data);

    void glBufferSubData(int target, long offset, FloatBuffer data);

    void glDeleteQueries(IntBuffer ids);

    void glDeleteQueries(int[] ids);

    void glDeleteQueries(int id);

    void glBeginQuery(int target, int id);

    void glGenQueries(IntBuffer ids);

    void glGenQueries(int[] ids);

    int glGenQueries();

    int glGetQueryi(int target, int pname);

    int glGetQueryObjectui(int id, int pname);

    void glGetQueryiv(int target, int pname, IntBuffer params);

    void glGetQueryiv(int target, int pname, int[] params);

    void glEndQuery(int target);

    void glGetQueryObjectuiv(int id, int pname, int[] params);

    void glGetQueryObjectuiv(int id, int pname, IntBuffer params);

    void glGetBufferPointerv(int target, int pname, PointerBuffer params);

    int glGetBufferParameteri(int target, int pname);

    void glGetBufferParameteriv(int target, int pname, int[] params);

    void glGetBufferParameteriv(int target, int pname, IntBuffer params);

    void glBlendColor(float red, float green, float blue, float alpha);

    void glBlendEquation(int mode);

    void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha);

    void glSampleCoverage(float value, boolean invert);

    void glActiveTexture(int texture);

    void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data);

    void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data);

    void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data);

    void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data);

    void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int[] pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, float[] pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, short[] pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels);

    void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

    void glDrawRangeElements(int mode, int start, int end, IntBuffer indices);

    void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices);

    void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices);

    void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices);

    void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices);

    void glEnable(int cap);

    void glDisable(int cap);

    void glClearColor(float red, float green, float blue, float alpha);

    void glBlendFunc(int sfactor, int dfactor);

    void glClear(int mask);

    void glBindTexture(int target, int texture);

    void glClearStencil(int s);

    void glDrawElements(int mode, int count, int type, long indices);

    void glDrawElements(int mode, int type, ByteBuffer indices);

    void glDrawElements(int mode, IntBuffer indices);

    void glDrawElements(int mode, ByteBuffer indices);

    void glDrawElements(int mode, ShortBuffer indices);

    void glDepthMask(boolean flag);

    void glGenTextures(IntBuffer textures);

    int glGenTextures();

    void glGenTextures(int[] textures);

    void glFrontFace(int mode);

    void glDeleteTextures(IntBuffer textures);

    void glDeleteTextures(int texture);

    void glDeleteTextures(int[] textures);

    void glFinish();

    void glCullFace(int mode);

    void glDrawArrays(int mode, int first, int count);

    void glFlush();

    void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

    void glDepthFunc(int func);

    void glGetIntegerv(int pname, IntBuffer data);

    void glGetIntegerv(int pname, int[] data);

    void glGetBooleanv(int pname, ByteBuffer data);

    void glGetFloatv(int pname, float[] data);

    void glGetFloatv(int pname, FloatBuffer data);

    int glGetInteger(int pname);

    float glGetFloat(int pname);

    String glGetString(int name);

    int glGetError();

    boolean glGetBoolean(int pname);

    int glGetTexParameteri(int target, int pname);

    float glGetTexParameterf(int target, int pname);

    boolean glIsEnabled(int cap);

    boolean glIsTexture(int texture);

    void glHint(int target, int mode);

    void glLineWidth(float width);

    void glPixelStorei(int pname, int param);

    void glPolygonOffset(float factor, float units);

    void glStencilFunc(int func, int ref, int mask);

    void glReadBuffer(int src);

    void glStencilOp(int fail, int zfail, int zpass);

    void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels);

    void glStencilMask(int mask);

    void glScissor(int x, int y, int width, int height);

    void glTexParameteri(int target, int pname, int param);

    void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels);

    void glTexParameteriv(int target, int pname, int[] params);

    void glTexParameteriv(int target, int pname, IntBuffer params);

    void glTexParameterf(int target, int pname, float param);

    void glTexParameterfv(int target, int pname, float[] params);

    void glTexParameterfv(int target, int pname, FloatBuffer params);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels);

    void glViewport(int x, int y, int width, int height);

    void glGetTexParameteriv(int target, int pname, IntBuffer params);

    void glGetTexParameteriv(int target, int pname, int[] params);

    void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    void glGetTexParameterfv(int target, int pname, float[] params);

    void glGetTexParameterfv(int target, int pname, FloatBuffer params);

    void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision);

    void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision);

    void glReleaseShaderCompiler();

    void glClearDepthf(float d);

    void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary);

    void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary);

    void glDepthRangef(float n, float f);

    GLState getState();

    void makeCurrent();

    void unmakeCurrent();

    ContextInfo getContextInfo();

    void delete();

    long window();
}
