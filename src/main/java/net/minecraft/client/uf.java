package net.minecraft.client;

class uf extends Thread {
   // $FF: synthetic field
   final jq a;

   uf(jq var1) {
      this.a = var1;
   }

   public void run() {
      try {
         if (jq.a(this.a) != null) {
            jq.a(this.a, jq.a(this.a), jq.b(this.a), jq.c(this.a), jq.d(this.a));
         } else if (jq.b(this.a).exists()) {
            jq.a(this.a, jq.a(this.a, jq.b(this.a), jq.c(this.a), jq.d(this.a)));
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         jq.a(this.a, false);
      }

   }
}
