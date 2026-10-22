package net.minecraft.client;

import java.io.File;

/**
 * PATCH(1.0.0): ThreadDownloadResources. Оригинал скачивал звуки/музыку с s3.amazonaws.com
 * (HTTP + XML) — в вебе это не нужно: все ресурсы лежат в assets.akrile и подгружаются
 * ResourcePreloader'ом. Класс оставлен как заглушка с прежними сигнатурами.
 */
public class ng {
   public File a;

   public ng(File var1, Minecraft var2) {
      this.a = var1;
   }

   public void start() {
   }

   public void a() {
   }

   public void b() {
   }
}
