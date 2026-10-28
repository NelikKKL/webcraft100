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

    // PATCH(perf): 48-битное состояние хранится как два 24-битных int (sh:sl), шаг LCG считается в double
    // (все промежуточные значения < 2^53 — точно). В TeaVM long-арифметика эмулируется и медленна, а Random
    // дёргается миллионы раз при генерации чанков. Результат побитно совпадает с java.util.Random (см. tools/smoke/JRandomCheck).
    private static final double TWO24 = 16777216.0;
    private static final double INV24 = 1.0 / 16777216.0;
    private static final int MUL_HI = 0x5DE;      // MULTIPLIER >> 24
    private static final int MUL_LO = 0xECE66D;   // MULTIPLIER & 0xFFFFFF

    private int seedHi;   // биты 47..24
    private int seedLo;   // биты 23..0
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
        long v = (s ^ MULTIPLIER) & MASK;
        this.seedHi = (int) (v >>> 24);
        this.seedLo = (int) (v & 0xFFFFFFL);
        this.haveNextNextGaussian = false;
    }

    @Override
    protected int next(int bits) {
        // seed = (seed * MULTIPLIER + 0xB) & (2^48 - 1)
        double p0 = (double) seedLo * MUL_LO + 11.0;                  // < 2^48 + 11
        double carry = Math.floor(p0 * INV24);                        // p0 >> 24
        int newLo = (int) (p0 - carry * TWO24);                       // p0 & 0xFFFFFF
        double p1 = (double) seedHi * MUL_LO + (double) seedLo * MUL_HI + carry;
        int newHi = (int) (p1 - Math.floor(p1 * INV24) * TWO24);      // p1 & 0xFFFFFF
        seedLo = newLo;
        seedHi = newHi;
        // (int) (seed >>> (48 - bits))
        if (bits <= 24) return newHi >>> (24 - bits);
        return (newHi << (bits - 24)) | (newLo >>> (48 - bits));
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
            // (bound * (long) r) >> 31 для степени двойки = r >> (31 - log2(bound))
            r = r >> (31 - Integer.numberOfTrailingZeros(bound));
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
        return ((double) next(26) * 134217728.0 + (double) next(27)) * (1.0 / 9007199254740992.0);
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
