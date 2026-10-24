package net.minecraft.client;

import java.io.File;
import java.util.Random;
import net.minecraft.client.web.Sfx;

/**
 * PATCH(1.0.0): SoundManager. Оригинал (paulscode SoundSystem + OpenAL + кодеки ogg/mus/wav)
 * заменён на Web Audio через web/Sfx.java -> window.Sounds (web/extras.js).
 * Сигнатуры методов сохранены 1:1 с оригиналом, логика (громкости, дальность 16 блоков,
 * множитель 0.25 у UI-звуков, таймер музыки 12000..24000 тиков, остановка музыки при
 * пластинке) повторяет оригинал. Файлы звуков регистрируются на стороне JS
 * (assets.akrile), поэтому a/b/c(String, File) — заглушки.
 *
 * Поля настроек ki: a — громкость музыки, b — громкость звука.
 * Поля сущности nq: p/q/r — прошлая позиция, s/t/u — текущая, A — прошлый yaw, y — текущий.
 */
public class ahm {

   private ki f;
   private final Random h = new net.minecraft.client.web.JRandom();
   private int i = this.h.nextInt(12000);

   public ahm() {
   }

   /** Инициализация / смена настроек. */
   public void a(ki var1) {
      this.f = var1;
      this.a();
   }

   /** Громкость музыки; нулевая громкость выключает музыку. */
   public void a() {
      if (this.f == null) {
         return;
      }

      if (this.f.a == 0.0F) {
         Sfx.stopMusic();
      } else {
         Sfx.musicVolume(this.f.a);
      }
   }

   /** Освобождение. */
   public void b() {
      Sfx.stopMusic();
      Sfx.stopStream();
   }

   /** Регистрация файлов делается на стороне JS (assets.akrile). */
   public void a(String var1, File var2) {
   }

   public void b(String var1, File var2) {
   }

   public void c(String var1, File var2) {
   }

   /** Каждый тик: пробуем запустить фоновую музыку. */
   public void c() {
      if (this.f == null || this.f.a == 0.0F) {
         return;
      }

      if (!Sfx.musicPlaying() && !Sfx.streamPlaying()) {
         if (this.i > 0) {
            --this.i;
            return;
         }

         // таймер перезапускается, только если трек реально стартовал (браузер мог не разрешить звук)
         if (Sfx.hasMusic() && Sfx.startMusic(this.f.a)) {
            this.i = this.h.nextInt(12000) + 12000;
         }
      }
   }

   /** Положение и ориентация слушателя (камеры). */
   public void a(nq var1, float var2) {
      if (this.f == null || this.f.b == 0.0F || var1 == null) {
         return;
      }

      float var3 = var1.A + (var1.y - var1.A) * var2;
      double var4 = var1.p + (var1.s - var1.p) * (double)var2;
      double var6 = var1.q + (var1.t - var1.q) * (double)var2;
      double var8 = var1.r + (var1.u - var1.r) * (double)var2;
      float var10 = -var3 * ((float)Math.PI / 180F) - (float)Math.PI;
      float var11 = (float)Math.cos((double)var10);
      float var12 = (float)Math.sin((double)var10);
      Sfx.listener((float)var4, (float)var6, (float)var8, -var12, 0.0F, -var11);
   }

   /** Пластинка (потоковый звук). Имя null только останавливает. */
   public void a(String var1, float var2, float var3, float var4, float var5, float var6) {
      if (this.f == null || this.f.b == 0.0F) {
         return;
      }

      if (Sfx.streamPlaying()) {
         Sfx.stopStream();
      }

      if (var1 == null) {
         return;
      }

      if (Sfx.hasStream(var1) && var5 > 0.0F) {
         if (Sfx.musicPlaying()) {
            Sfx.stopMusic();
         }

         Sfx.startStream(var1, 0.5F * this.f.b);
      }
   }

   /** Позиционный эффект: блоки, мобы и т.д. */
   public void b(String var1, float var2, float var3, float var4, float var5, float var6) {
      if (this.f == null || this.f.b == 0.0F || var1 == null || var5 <= 0.0F) {
         return;
      }

      float var7 = 16.0F;
      if (var5 > 1.0F) {
         var7 *= var5;
         var5 = 1.0F;
      }

      Sfx.play(var1, var2, var3, var4, var5 * this.f.b, var6, true, var7);
   }

   /** Непозиционный эффект (UI): громкость x0.25. */
   public void a(String var1, float var2, float var3) {
      if (this.f == null || this.f.b == 0.0F || var1 == null) {
         return;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      Sfx.play(var1, 0.0F, 0.0F, 0.0F, var2 * 0.25F * this.f.b, var3, false, 0.0F);
   }
}
