package org.lwjgl.opengl;

/** Шим PixelFormat: параметры контекста задаёт WebGL, поэтому класс пустой. */
public class PixelFormat {
    public PixelFormat() {}
    public PixelFormat withDepthBits(int bits) { return this; }
    public PixelFormat withAlphaBits(int bits) { return this; }
    public PixelFormat withSamples(int samples) { return this; }
}
