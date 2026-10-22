package net.minecraft.client;

import java.util.Random;

public class cj extends yy {
   public static boolean a = false;

   public cj(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.o);
   }

   public void a(ry var1, int var2, int var3, int var4) {
      var1.a(var2, var3, var4, this.bM, this.d());
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, this.bM, this.d());
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      this.g(var1, var2, var3, var4);
   }

   private void g(ry var1, int var2, int var3, int var4) {
      if (b_(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var8 = 32;
         if (!a && var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
            if (!var1.I) {
               uo var9 = new uo(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.bM);
               var1.a((ia)var9);
            }
         } else {
            var1.g(var2, var3, var4, 0);

            while(b_(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if (var3 > 0) {
               var1.g(var2, var3, var4, this.bM);
            }
         }
      }

   }

   public int d() {
      return 3;
   }

   public static boolean b_(ry var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if (var4 == 0) {
         return true;
      } else if (var4 == yy.ar.bM) {
         return true;
      } else {
         p var5 = yy.k[var4].bZ;
         if (var5 == net.minecraft.client.p.g) {
            return true;
         } else {
            return var5 == net.minecraft.client.p.h;
         }
      }
   }
}
