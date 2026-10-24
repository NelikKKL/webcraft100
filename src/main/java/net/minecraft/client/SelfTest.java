package net.minecraft.client;

import java.util.Random;

/**
 * Диагностика расхождений TeaVM и JVM: печатает результаты вычислений, которые на JVM известны.
 * Запускается один раз при старте (WebEntryPoint) и пишет строки "SELFTEST ..." в консоль.
 * Эталон для JVM получают запуском того же класса (tools/smoke/SelfTestMain.java.txt).
 */
public final class SelfTest {
    private SelfTest() {}

    public static String run() {
        StringBuilder sb = new StringBuilder();
        try {
            Random r = new net.minecraft.client.web.JRandom(1L);
            sb.append("SELFTEST random ").append(r.nextInt(100)).append(' ').append(r.nextInt(100)).append(' ')
              .append(r.nextInt(100)).append(' ').append(r.nextLong()).append(' ').append(r.nextDouble()).append('\n');

            Random tr = new Random(1L);
            sb.append("SELFTEST tvmRandom ").append(tr.nextInt(100)).append(" (JVM=85, JRandom used by the game)\n");

            long x = 1L;
            for (int i = 0; i < 4; i++) { x *= x * 6364136223846793005L + 1442695040888963407L; x += 7L; }
            sb.append("SELFTEST lcg ").append(x).append(' ').append((int) ((x >> 24) % 10L)).append(' ')
              .append((int) ((-x >> 24) % 7L)).append(' ').append(x >>> 33).append('\n');

            long t = 123456789L;
            int d = (int) (t % 24000L);
            float f = ((float) d + 0.5F) / 24000.0F - 0.25F;
            sb.append("SELFTEST time ").append(d).append(' ').append(f).append(' ')
              .append((float) Math.cos((double) f * Math.PI * 2.0D)).append(' ')
              .append(net.minecraft.client.web.JMath.round(-2.5D)).append(' ').append((int) -2.7F).append(' ')
              .append((int) Math.floor(-0.5D)).append('\n');

            int nulls = 0;
            for (sr b : sr.a) if (b == null) nulls++;
            sb.append("SELFTEST biomes nulls=").append(nulls).append(" forest=").append(sr.f != null)
              .append(" plains=").append(sr.c != null).append('\n');

            jx[] layers = jx.a(1L);
            int[] ids = layers[0].a(-64, -64, 129, 129);
            int[] hist = new int[64];
            int hits = 0;
            for (int id : ids) {
                hist[id & 63]++;
                sr b = sr.a[id & 255];
                if (b == sr.f || b == sr.h || b == sr.g) hits++;
            }
            sb.append("SELFTEST layers len=").append(ids.length).append(" hist=");
            for (int i = 0; i < 64; i++) if (hist[i] > 0) sb.append(i).append(':').append(hist[i]).append(' ');
            sb.append("hits=").append(hits).append('\n');

        } catch (Throwable e) {
            sb.append("SELFTEST error ").append(e).append('\n');
        }
        return sb.toString();
    }
}
