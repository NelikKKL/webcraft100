package net.minecraft.client;

import java.util.HashMap;

class nv extends HashMap {
   // $FF: synthetic field
   final abq a;

   nv(abq var1) {
      this.a = var1;

      for(aax var3 : (Iterable<aax>)(Iterable)(abq.a(this.a))) {
         this.put(var3.b(), var3.c());
      }

   }
}
