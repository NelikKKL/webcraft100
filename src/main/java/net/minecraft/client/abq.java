package net.minecraft.client;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class abq implements rv {
   private final List a = new LinkedList();

   abq() {
   }

   public abq a(aax var1) {
      this.a.add(var1);
      return this;
   }

   public wz a() {
      return ahf.a((Map)(new nv(this)));
   }

   // $FF: synthetic method
   static List a(abq var0) {
      return var0.a;
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public an b() { return this.a(); }
}
