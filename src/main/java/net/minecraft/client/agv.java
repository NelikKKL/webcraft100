package net.minecraft.client;

import java.io.IOException;

class agv extends Thread {
   // $FF: synthetic field
   final hc a;

   agv(hc var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      synchronized(hc.a) {
         ++hc.c;
      }

      try {
         while(hc.a(this.a)) {
            while(hc.d(this.a)) {
            }

            try {
               if (hc.e(this.a) != null) {
                  hc.e(this.a).flush();
               }
            } catch (IOException var16) {
               if (!hc.f(this.a)) {
                  hc.a((hc)this.a, (Exception)var16);
               }

               var16.printStackTrace();
            }

            try {
               sleep(2L);
            } catch (InterruptedException var14) {
            }
         }
      } finally {
         synchronized(hc.a) {
            --hc.c;
         }
      }

   }
}
