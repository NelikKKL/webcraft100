package net.minecraft.client;

import java.util.ArrayList;

class xa extends mx {
   // $FF: synthetic field
   final in a;

   public xa(in var1) {
      super(var1);
      this.a = var1;
      this.h = new ArrayList();

      for(yl var3 : (Iterable<yl>)(Iterable)(ny.d)) {
         boolean var4 = false;
         int var5 = var3.f();
         if (in.c(var1).a((px)var3) > 0) {
            var4 = true;
         } else if (ny.F[var5] != null && in.c(var1).a(ny.F[var5]) > 0) {
            var4 = true;
         } else if (ny.D[var5] != null && in.c(var1).a(ny.D[var5]) > 0) {
            var4 = true;
         }

         if (var4) {
            this.h.add(var3);
         }
      }

      this.i = new gf(this, var1);
   }

   protected void a(int var1, int var2, cv var3) {
      super.a(var1, var2, var3);
      if (this.g == 0) {
         in.a(this.a, var1 + 115 - 18 + 1, var2 + 1 + 1, 72, 18);
      } else {
         in.a(this.a, var1 + 115 - 18, var2 + 1, 72, 18);
      }

      if (this.g == 1) {
         in.a(this.a, var1 + 165 - 18 + 1, var2 + 1 + 1, 18, 18);
      } else {
         in.a(this.a, var1 + 165 - 18, var2 + 1, 18, 18);
      }

      if (this.g == 2) {
         in.a(this.a, var1 + 215 - 18 + 1, var2 + 1 + 1, 36, 18);
      } else {
         in.a(this.a, var1 + 215 - 18, var2 + 1, 36, 18);
      }

   }

   protected void a(int var1, int var2, int var3, int var4, cv var5) {
      yl var6 = this.c(var1);
      int var7 = var6.f();
      in.a(this.a, var2 + 40, var3, var7);
      this.a((yl)ny.F[var7], var2 + 115, var3, var1 % 2 == 0);
      this.a((yl)ny.D[var7], var2 + 165, var3, var1 % 2 == 0);
      this.a(var6, var2 + 215, var3, var1 % 2 == 0);
   }

   protected String b(int var1) {
      if (var1 == 1) {
         return "stat.crafted";
      } else {
         return var1 == 2 ? "stat.used" : "stat.depleted";
      }
   }
}
