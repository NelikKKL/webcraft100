package net.minecraft.client;

import java.util.Random;

public class jb extends yy {
   protected jb(int var1) {
      super(var1, net.minecraft.client.p.b);
      this.bL = 3;
      this.b(true);
   }

   public int a(int var1, int var2) {
      if (var1 == 1) {
         return 0;
      } else {
         return var1 == 0 ? 2 : 3;
      }
   }

   public int a(kq var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return 0;
      } else if (var5 == 0) {
         return 2;
      } else {
         p var6 = var1.e(var2, var3 + 1, var4);
         return var6 != net.minecraft.client.p.u && var6 != net.minecraft.client.p.v ? 3 : 68;
      }
   }

   public int f() {
      double var1 = (double)0.5F;
      double var3 = (double)1.0F;
      return ha.a(var1, var3);
   }

   public int c(int var1) {
      return this.f();
   }

   public int a(kq var1, int var2, int var3, int var4) {
      return var1.a().a(var2, var4).a(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I) {
         if (var1.n(var2, var3 + 1, var4) < 4 && yy.o[var1.a(var2, var3 + 1, var4)] > 2) {
            var1.g(var2, var3, var4, yy.v.bM);
         } else if (var1.n(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               int var10 = var1.a(var7, var8 + 1, var9);
               if (var1.a(var7, var8, var9) == yy.v.bM && var1.n(var7, var8 + 1, var9) >= 4 && yy.o[var10] <= 2) {
                  var1.g(var7, var8, var9, yy.u.bM);
               }
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return yy.v.a(0, var2, var3);
   }
}
