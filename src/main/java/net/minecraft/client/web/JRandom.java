package net.minecraft.client.web;

import java.util.Random;

/**
 * Точная копия алгоритма java.util.Random (OpenJDK, 48-битный LCG).
 *
 * Random из классов TeaVM даёт другие числа для того же seed (new Random(1).nextInt(100): TeaVM = 1, JVM = 85),
 * поэтому миры не совпадали бы с настоящим Minecraft. Игра создаёт все генераторы через new JRandom(...).
 */
public class JRandom extends Random {
    private static final long MULTIPLIER = 0x5DEECE66DL;
    private static final long ADDEND = 0xBL;
    private static final long MASK = (1L << 48) - 1;
    private static long uniquifier = 8682522807148012L;

    private long seed;
    private double nextNextGaussian;
    private boolean haveNextNextGaussian;

    public JRandom() {
        this(nextUniquifier() ^ System.nanoTime() ^ System.currentTimeMillis());
    }

    public JRandom(long seed) {
        super(0L);
        setSeed(seed);
    }

    private static long nextUniquifier() {
        uniquifier *= 1181783497276652981L;
        return uniquifier;
    }

    @Override
    public void setSeed(long s) {
        this.seed = (s ^ MULTIPLIER) & MASK;
        this.haveNextNextGaussian = false;
    }

    @Override
    protected int next(int bits) {
        seed = (seed * MULTIPLIER + ADDEND) & MASK;
        return (int) (seed >>> (48 - bits));
    }

    @Override
    public int nextInt() {
        return next(32);
    }

    @Override
    public int nextInt(int bound) {
        if (bound <= 0) throw new IllegalArgumentException("bound must be positive");
        int r = next(31);
        int m = bound - 1;
        if ((bound & m) == 0) {
            r = (int) ((bound * (long) r) >> 31);
        } else {
            for (int u = r; u - (r = u % bound) + m < 0; u = next(31)) {
            }
        }
        return r;
    }

    @Override
    public long nextLong() {
        return ((long) next(32) << 32) + next(32);
    }

    @Override
    public boolean nextBoolean() {
        return next(1) != 0;
    }

    @Override
    public float nextFloat() {
        return next(24) / ((float) (1 << 24));
    }

    @Override
    public double nextDouble() {
        return (((long) next(26) << 27) + next(27)) * (1.0 / (1L << 53));
    }

    @Override
    public void nextBytes(byte[] bytes) {
        for (int i = 0, len = bytes.length; i < len; ) {
            for (int rnd = nextInt(), n = Math.min(len - i, 4); n-- > 0; rnd >>= 8) {
                bytes[i++] = (byte) rnd;
            }
        }
    }

    @Override
    public double nextGaussian() {
        if (haveNextNextGaussian) {
            haveNextNextGaussian = false;
            return nextNextGaussian;
        }
        double v1, v2, s;
        do {
            v1 = 2 * nextDouble() - 1;
            v2 = 2 * nextDouble() - 1;
            s = v1 * v1 + v2 * v2;
        } while (s >= 1 || s == 0);
        double multiplier = Math.sqrt(-2 * Math.log(s) / s);
        nextNextGaussian = v2 * multiplier;
        haveNextNextGaussian = true;
        return v1 * multiplier;
    }
}
