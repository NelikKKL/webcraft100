package net.minecraft.client;

class po extends Thread {
   // $FF: synthetic field
   final hc a;

   po(hc var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(2000L);
         if (hc.a(this.a)) {
            hc.h(this.a).interrupt();
            this.a.a("disconnect.closed");
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
