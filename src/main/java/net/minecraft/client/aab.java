package net.minecraft.client;

import java.util.Random;

public class aab extends yy {
   public static final int[][] a = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

   public aab(int var1) {
      super(var1, 134, net.minecraft.client.p.m);
      this.s();
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         int var6 = var1.d(var2, var3, var4);
         if (!f(var6)) {
            int var7 = e(var6);
            var2 += a[var7][0];
            var4 += a[var7][1];
            if (var1.a(var2, var3, var4) != this.bM) {
               return true;
            }

            var6 = var1.d(var2, var3, var4);
         }

         if (!var1.y.d()) {
            double var18 = (double)var2 + (double)0.5F;
            double var20 = (double)var3 + (double)0.5F;
            double var11 = (double)var4 + (double)0.5F;
            var1.g(var2, var3, var4, 0);
            int var13 = e(var6);
            var2 += a[var13][0];
            var4 += a[var13][1];
            if (var1.a(var2, var3, var4) == this.bM) {
               var1.g(var2, var3, var4, 0);
               var18 = (var18 + (double)var2 + (double)0.5F) / (double)2.0F;
               var20 = (var20 + (double)var3 + (double)0.5F) / (double)2.0F;
               var11 = (var11 + (double)var4 + (double)0.5F) / (double)2.0F;
            }

            var1.a((ia)null, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), 5.0F, true);
            return true;
         } else {
            if (g(var6)) {
               vi var16 = null;

               for(vi var9 : (Iterable<vi>)(Iterable)(var1.i)) {
                  if (var9.ar()) {
                     dh var10 = var9.bU;
                     if (var10.a == var2 && var10.b == var3 && var10.c == var4) {
                        var16 = var9;
                     }
                  }
               }

               if (var16 != null) {
                  var5.b("tile.bed.occupied");
                  return true;
               }

               a(var1, var2, var3, var4, false);
            }

            qy var17 = var5.d(var2, var3, var4);
            if (var17 == qy.a) {
               a(var1, var2, var3, var4, true);
               return true;
            } else {
               if (var17 == qy.c) {
                  var5.b("tile.bed.noSleep");
               } else if (var17 == qy.f) {
                  var5.b("tile.bed.notSafe");
               }

               return true;
            }
         }
      }
   }

   public int a(int var1, int var2) {
      if (var1 == 0) {
         return yy.x.bL;
      } else {
         int var3 = e(var2);
         int var4 = lz.h[var3][var1];
         if (f(var2)) {
            if (var4 == 2) {
               return this.bL + 2 + 16;
            } else {
               return var4 != 5 && var4 != 4 ? this.bL + 1 : this.bL + 1 + 16;
            }
         } else if (var4 == 3) {
            return this.bL - 1 + 16;
         } else {
            return var4 != 5 && var4 != 4 ? this.bL : this.bL + 16;
         }
      }
   }

   public int c() {
      return 14;
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public void b(kq var1, int var2, int var3, int var4) {
      this.s();
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.d(var2, var3, var4);
      int var7 = e(var6);
      if (f(var6)) {
         if (var1.a(var2 - a[var7][0], var3, var4 - a[var7][1]) != this.bM) {
            var1.g(var2, var3, var4, 0);
         }
      } else if (var1.a(var2 + a[var7][0], var3, var4 + a[var7][1]) != this.bM) {
         var1.g(var2, var3, var4, 0);
         if (!var1.I) {
            this.b(var1, var2, var3, var4, var6, 0);
         }
      }

   }

   public int a(int var1, Random var2, int var3) {
      return f(var1) ? 0 : acy.aZ.bM;
   }

   private void s() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   public static int e(int var0) {
      return var0 & 3;
   }

   public static boolean f(int var0) {
      return (var0 & 8) != 0;
   }

   public static boolean g(int var0) {
      return (var0 & 4) != 0;
   }

   public static void a(ry var0, int var1, int var2, int var3, boolean var4) {
      int var5 = var0.d(var1, var2, var3);
      if (var4) {
         var5 |= 4;
      } else {
         var5 &= -5;
      }

      var0.f(var1, var2, var3, var5);
   }

   public static dh f(ry var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.d(var1, var2, var3);
      int var6 = e(var5);

      for(int var7 = 0; var7 <= 1; ++var7) {
         int var8 = var1 - a[var6][0] * var7 - 1;
         int var9 = var3 - a[var6][1] * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               if (var0.g(var12, var2 - 1, var13) && var0.h(var12, var2, var13) && var0.h(var12, var2 + 1, var13)) {
                  if (var4 <= 0) {
                     return new dh(var12, var2, var13);
                  }

                  --var4;
               }
            }
         }
      }

      return null;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!f(var5)) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }

   }

   public int i() {
      return 1;
   }
}
