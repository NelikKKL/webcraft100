package net.minecraft.client;


class cw extends Thread {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final aaj b;
   // $FF: synthetic field
   final aap c;

   cw(aap var1, String var2, aaj var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   /**
    * PATCH(1.0.0): оригинал скачивал скины/плащи с s3.amazonaws.com — сервис закрыт, а браузер блокирует
    * запрос (CORS). Остаётся стандартный скин /mob/char.png; пользовательские скины — через web/SkinStore.
    */
   public void run() {
   }
}
