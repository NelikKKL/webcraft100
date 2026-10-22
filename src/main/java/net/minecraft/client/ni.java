package net.minecraft.client;

import java.util.Random;

public class ni extends yy {
   protected ni(int var1) {
      super(var1, net.minecraft.client.p.c);
      this.bL = 87;
      this.b(true);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.h(255);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return net.minecraft.client.c.b((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int a(int var1, int var2) {
      if (var1 == 1 && var2 > 0) {
         return this.bL - 1;
      } else {
         return var1 == 1 ? this.bL : 2;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!this.h(var1, var2, var3, var4) && !var1.w(var2, var3 + 1, var4)) {
         int var6 = var1.d(var2, var3, var4);
         if (var6 > 0) {
            var1.f(var2, var3, var4, var6 - 1);
         } else if (!this.g(var1, var2, var3, var4)) {
            var1.g(var2, var3, var4, yy.v.bM);
         }
      } else {
         var1.f(var2, var3, var4, 7);
      }

   }

   public void b(ry var1, int var2, int var3, int var4, ia var5) {
      if (var1.w.nextInt(4) == 0) {
         var1.g(var2, var3, var4, yy.v.bM);
      }

   }

   private boolean g(ry var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
            int var8 = var1.a(var6, var3 + 1, var7);
            if (var8 == yy.az.bM || var8 == yy.bt.bM || var8 == yy.bs.bM) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean h(ry var1, int var2, int var3, int var4) {
      for(int var5 = var2 - 4; var5 <= var2 + 4; ++var5) {
         for(int var6 = var3; var6 <= var3 + 1; ++var6) {
            for(int var7 = var4 - 4; var7 <= var4 + 4; ++var7) {
               if (var1.e(var5, var6, var7) == net.minecraft.client.p.g) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      p var6 = var1.e(var2, var3 + 1, var4);
      if (var6.b()) {
         var1.g(var2, var3, var4, yy.v.bM);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return yy.v.a(0, var2, var3);
   }
}
