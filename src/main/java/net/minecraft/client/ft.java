package net.minecraft.client;

import java.util.LinkedList;
import java.util.List;

public final class ft implements rv {
   private final List a = new LinkedList();

   ft() {
   }

   public ft a(rv var1) {
      this.a.add(var1);
      return this;
   }

   public wz a() {
      LinkedList var1 = new LinkedList();

      for(rv var3 : (Iterable<rv>)(Iterable)(this.a)) {
         var1.add(var3.b());
      }

      return ahf.a((Iterable)var1);
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public an b() { return this.a(); }
}
