package net.minecraft.client;

class acx extends Thread {
   // $FF: synthetic field
   final hc a;

   acx(hc var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if (hc.g(this.a).isAlive()) {
            try {
               hc.g(this.a).interrupt();
            } catch (Throwable var3) {
            }
         }

         if (hc.h(this.a).isAlive()) {
            try {
               hc.h(this.a).interrupt();
            } catch (Throwable var2) {
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
