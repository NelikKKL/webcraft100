package net.minecraft.client.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.ej;
import net.minecraft.client.me;
import net.minecraft.client.mv;

/**
 * PATCH(perf): размазывание генерации чанков по кадрам.
 *
 * В 1.0.0 одиночная игра генерирует чанки синхронно в главном потоке: как только игрок пересекает границу чанка,
 * мировой тик (activeChunkSet, радиус 7) и рендер за ОДИН тик запрашивают целый ряд новых чанков, каждый из которых
 * генерируется и «заселяется» (деревья, руды, озёра, освещение). В браузере (один поток, TeaVM) это даёт
 * фриз на сотни миллисекунд.
 *
 * Здесь чанки вокруг игрока подгружаются заранее, не более нескольких штук за кадр (и не дольше ~6 мс),
 * от ближних к дальним, а «заселение» (mv.a(ej,int,int)) на это время откладывается в очередь и выполняется
 * по одному чанку за шаг. Для остального кода ничего не меняется: если чанк понадобился раньше, чем мы его
 * подгрузили, он создаётся обычным путём (немедленно, с заселением).
 */
public final class ChunkPreloader {
    private ChunkPreloader() {}

    /** true только пока шаг прелоадера сам вызывает mv.b(): тогда mv.a(ej,int,int) не заселяет, а ставит чанк в очередь. */
    public static boolean deferPopulate = false;

    private static final long BUDGET_NANOS = 6_000_000L;
    private static final int MAX_OPS_PER_FRAME = 3;

    private static final List<int[]> queue = new ArrayList<>();
    private static final Set<Long> queued = new HashSet<>();
    private static mv lastProvider = null;

    private static long key(int x, int z) {
        return ((long) x << 32) ^ (z & 0xFFFFFFFFL);
    }

    /** Вызывается из mv.a(ej,int,int), если deferPopulate включён. */
    public static void defer(int x, int z) {
        if (queued.add(key(x, z))) {
            queue.add(new int[] { x, z });
        }
    }

    /** Один шаг на кадр. Вызывается из Minecraft.x() после тиков. */
    public static void step(Minecraft mc) {
        if (mc == null || mc.f == null || mc.h == null) {
            clear();
            return;
        }
        ej provider = mc.f.x();
        if (!(provider instanceof mv)) {
            clear();
            return;
        }
        mv m = (mv) provider;
        if (m != lastProvider) {
            clear();
            lastProvider = m;
        }
        // Пока мир ищет точку спавна/идёт загрузка с экраном «Building terrain» — не вмешиваемся.
        if (mc.f.D) return;

        int pcx = me.d((float) ((int) mc.h.s)) >> 4;
        int pcz = me.d((float) ((int) mc.h.u)) >> 4;
        int radius = Math.max(9, Math.min(13, (16 >> (mc.A.e & 3)) + 2));

        long start = System.nanoTime();
        int ops = 0;
        deferPopulate = true;
        try {
            while (ops < MAX_OPS_PER_FRAME) {
                if (!populateOne(m, pcx, pcz) && !loadOne(m, pcx, pcz, radius)) break;
                ops++;
                if (System.nanoTime() - start > BUDGET_NANOS) break;
            }
        } finally {
            deferPopulate = false;
        }
    }

    private static void clear() {
        queue.clear();
        queued.clear();
        lastProvider = null;
    }

    /** Заселяет ближайший к игроку отложенный чанк. */
    private static boolean populateOne(mv m, int pcx, int pcz) {
        int best = -1;
        long bestDist = Long.MAX_VALUE;
        for (int i = 0; i < queue.size(); i++) {
            int[] c = queue.get(i);
            long dx = c[0] - pcx, dz = c[1] - pcz;
            long d = dx * dx + dz * dz;
            if (d < bestDist) {
                bestDist = d;
                best = i;
            }
        }
        if (best < 0) return false;
        int[] c = queue.remove(best);
        queued.remove(key(c[0], c[1]));
        // Заселение может само вызвать загрузку соседей -> не откладываем повторно.
        boolean prev = deferPopulate;
        deferPopulate = false;
        try {
            m.populateDeferred(c[0], c[1]);
        } finally {
            deferPopulate = prev;
        }
        return true;
    }

    /** Загружает/генерирует ближайший ещё не загруженный чанк в квадрате радиуса radius вокруг игрока. */
    private static boolean loadOne(mv m, int pcx, int pcz, int radius) {
        for (int r = 0; r <= radius; r++) {
            for (int dx = -r; dx <= r; dx++) {
                for (int dz = -r; dz <= r; dz++) {
                    if (Math.max(Math.abs(dx), Math.abs(dz)) != r) continue;
                    if (m.preloadChunk(pcx + dx, pcz + dz)) return true;
                }
            }
        }
        return false;
    }
}
