package net.minecraft.client;

import java.util.Comparator;

class ga implements Comparator {
   // $FF: synthetic field
   final sl a;

   ga(sl var1) {
      this.a = var1;
   }

   public int a(ue var1, ue var2) {
      if (var1 instanceof bc && var2 instanceof aga) {
         return 1;
      } else if (var2 instanceof bc && var1 instanceof aga) {
         return -1;
      } else if (var2.b() < var1.b()) {
         return -1;
      } else {
         return var2.b() > var1.b() ? 1 : 0;
      }
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compare(Object v0, Object v1) { return this.a((ue)v0, (ue)v1); }
}
