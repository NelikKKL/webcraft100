package org.lwjgl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/** Шим org.lwjgl.BufferUtils (1.0.0 использует его в abx/скриншотах и др.). */
public final class BufferUtils {
    private BufferUtils() {}
    public static ByteBuffer createByteBuffer(int n) { return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder()); }
    public static FloatBuffer createFloatBuffer(int n) { return createByteBuffer(n << 2).asFloatBuffer(); }
    public static IntBuffer createIntBuffer(int n) { return createByteBuffer(n << 2).asIntBuffer(); }
    public static ShortBuffer createShortBuffer(int n) { return createByteBuffer(n << 1).asShortBuffer(); }
}
