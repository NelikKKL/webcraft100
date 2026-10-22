package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ahz extends za {
   private int a;

   public ahz(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
      this.a = Math.max(var3.b(), var3.d());
   }

   public void a(nk var1, List var2, Random var3) {
      boolean var4 = false;

      for(int var5 = var3.nextInt(5); var5 < this.a - 8; var5 += 2 + var3.nextInt(5)) {
         nk var6 = this.a((yp)var1, var2, var3, 0, var5);
         if (var6 != null) {
            var5 += Math.max(var6.e.b(), var6.e.d());
            var4 = true;
         }
      }

      for(int var7 = var3.nextInt(5); var7 < this.a - 8; var7 += 2 + var3.nextInt(5)) {
         nk var8 = this.b((yp)var1, var2, var3, 0, var7);
         if (var8 != null) {
            var7 += Math.max(var8.e.b(), var8.e.d());
            var4 = true;
         }
      }

      if (var4 && var3.nextInt(3) > 0) {
         switch (this.f) {
            case 0:
               xy.b((yp)var1, var2, var3, this.e.a - 1, this.e.b, this.e.f - 2, 1, this.b());
               break;
            case 1:
               xy.b((yp)var1, var2, var3, this.e.a, this.e.b, this.e.c - 1, 2, this.b());
               break;
            case 2:
               xy.b((yp)var1, var2, var3, this.e.a - 1, this.e.b, this.e.c, 1, this.b());
               break;
            case 3:
               xy.b((yp)var1, var2, var3, this.e.d - 2, this.e.b, this.e.c - 1, 2, this.b());
         }
      }

      if (var4 && var3.nextInt(3) > 0) {
         switch (this.f) {
            case 0:
               xy.b((yp)var1, var2, var3, this.e.d + 1, this.e.b, this.e.f - 2, 3, this.b());
               break;
            case 1:
               xy.b((yp)var1, var2, var3, this.e.a, this.e.b, this.e.f + 1, 0, this.b());
               break;
            case 2:
               xy.b((yp)var1, var2, var3, this.e.d + 1, this.e.b, this.e.c, 3, this.b());
               break;
            case 3:
               xy.b((yp)var1, var2, var3, this.e.d - 2, this.e.b, this.e.f + 1, 0, this.b());
         }
      }

   }

   public static nl a(yp var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 7 * me.a(var2, 3, 5); var7 >= 7; var7 -= 7) {
         nl var8 = nl.a(var3, var4, var5, 0, 0, 0, 3, 3, var7, var6);
         if (nk.a(var1, var8) == null) {
            return var8;
         }
      }

      return null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      for(int var4 = this.e.a; var4 <= this.e.d; ++var4) {
         for(int var5 = this.e.c; var5 <= this.e.f; ++var5) {
            if (var3.b(var4, 64, var5)) {
               int var6 = var1.f(var4, var5) - 1;
               var1.d(var4, var6, var5, yy.F.bM);
            }
         }
      }

      return true;
   }
}
