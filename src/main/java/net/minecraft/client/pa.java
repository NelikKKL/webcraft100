package net.minecraft.client;

class pa extends Thread {
   // $FF: synthetic field
   final hc a;

   pa(hc var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      synchronized(hc.a) {
         ++hc.b;
      }

      try {
         while(hc.a(this.a) && !hc.b(this.a)) {
            while(hc.c(this.a)) {
            }

            try {
               sleep(2L);
            } catch (InterruptedException var13) {
            }
         }
      } finally {
         synchronized(hc.a) {
            --hc.b;
         }
      }

   }
}
