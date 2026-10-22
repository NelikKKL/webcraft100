package net.minecraft.client;

import java.util.Comparator;

class gf implements Comparator {
   // $FF: synthetic field
   final in a;
   // $FF: synthetic field
   final xa b;

   gf(xa var1, in var2) {
      this.b = var1;
      this.a = var2;
   }

   public int a(yl var1, yl var2) {
      int var3 = var1.f();
      int var4 = var2.f();
      px var5 = null;
      px var6 = null;
      if (this.b.j == 0) {
         var5 = ny.F[var3];
         var6 = ny.F[var4];
      } else if (this.b.j == 1) {
         var5 = ny.D[var3];
         var6 = ny.D[var4];
      } else if (this.b.j == 2) {
         var5 = ny.E[var3];
         var6 = ny.E[var4];
      }

      if (var5 != null || var6 != null) {
         if (var5 == null) {
            return 1;
         }

         if (var6 == null) {
            return -1;
         }

         int var7 = in.c(this.b.a).a(var5);
         int var8 = in.c(this.b.a).a(var6);
         if (var7 != var8) {
            return (var7 - var8) * this.b.k;
         }
      }

      return var3 - var4;
   }

   // PATCH(bridge): bridge-метод, потерянный декомпилятором
   public int compare(Object v0, Object v1) { return this.a((yl)v0, (yl)v1); }
}
