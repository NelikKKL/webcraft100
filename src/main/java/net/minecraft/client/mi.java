package net.minecraft.client;

import java.util.Map;

class mi extends Thread {
   // $FF: synthetic field
   final Map a;
   // $FF: synthetic field
   final jq b;

   mi(jq var1, Map var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         jq.a(this.b, this.a, jq.e(this.b), jq.f(this.b), jq.g(this.b));
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         jq.a(this.b, false);
      }

   }
}
