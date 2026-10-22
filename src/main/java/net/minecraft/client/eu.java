package net.minecraft.client;

import java.util.Random;

public class eu extends ba {
   private Random a = new Random();
   private final boolean cb;
   private static boolean cc = false;

   protected eu(int var1, boolean var2) {
      super(var1, net.minecraft.client.p.e);
      this.cb = var2;
      this.bL = 45;
   }

   public int a(int var1, Random var2, int var3) {
      return yy.aB.bM;
   }

   public void a(ry var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      this.g(var1, var2, var3, var4);
   }

   private void g(ry var1, int var2, int var3, int var4) {
      if (!var1.I) {
         int var5 = var1.a(var2, var3, var4 - 1);
         int var6 = var1.a(var2, var3, var4 + 1);
         int var7 = var1.a(var2 - 1, var3, var4);
         int var8 = var1.a(var2 + 1, var3, var4);
         byte var9 = 3;
         if (yy.m[var5] && !yy.m[var6]) {
            var9 = 3;
         }

         if (yy.m[var6] && !yy.m[var5]) {
            var9 = 2;
         }

         if (yy.m[var7] && !yy.m[var8]) {
            var9 = 5;
         }

         if (yy.m[var8] && !yy.m[var7]) {
            var9 = 4;
         }

         var1.f(var2, var3, var4, var9);
      }
   }

   public int a(kq var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.bL + 17;
      } else if (var5 == 0) {
         return this.bL + 17;
      } else {
         int var6 = var1.d(var2, var3, var4);
         if (var5 != var6) {
            return this.bL;
         } else {
            return this.cb ? this.bL + 16 : this.bL - 1;
         }
      }
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      if (this.cb) {
         int var6 = var1.d(var2, var3, var4);
         float var7 = (float)var2 + 0.5F;
         float var8 = (float)var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = (float)var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if (var6 == 4) {
            var1.a("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), (double)0.0F, (double)0.0F, (double)0.0F);
            var1.a("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), (double)0.0F, (double)0.0F, (double)0.0F);
         } else if (var6 == 5) {
            var1.a("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), (double)0.0F, (double)0.0F, (double)0.0F);
            var1.a("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), (double)0.0F, (double)0.0F, (double)0.0F);
         } else if (var6 == 2) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), (double)0.0F, (double)0.0F, (double)0.0F);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), (double)0.0F, (double)0.0F, (double)0.0F);
         } else if (var6 == 3) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), (double)0.0F, (double)0.0F, (double)0.0F);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), (double)0.0F, (double)0.0F, (double)0.0F);
         }

      }
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL + 17;
      } else if (var1 == 0) {
         return this.bL + 17;
      } else {
         return var1 == 3 ? this.bL - 1 : this.bL;
      }
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         oe var6 = (oe)var1.b(var2, var3, var4);
         if (var6 != null) {
            var5.a(var6);
         }

         return true;
      }
   }

   public static void a(boolean var0, ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      bq var6 = var1.b(var2, var3, var4);
      cc = true;
      if (var0) {
         var1.g(var2, var3, var4, yy.aC.bM);
      } else {
         var1.g(var2, var3, var4, yy.aB.bM);
      }

      cc = false;
      var1.f(var2, var3, var4, var5);
      if (var6 != null) {
         var6.m();
         var1.a(var2, var3, var4, var6);
      }

   }

   public bq j_() {
      return new oe();
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = me.c((double)(var5.y * 4.0F / 360.0F) + (double)0.5F) & 3;
      if (var6 == 0) {
         var1.f(var2, var3, var4, 2);
      }

      if (var6 == 1) {
         var1.f(var2, var3, var4, 5);
      }

      if (var6 == 2) {
         var1.f(var2, var3, var4, 3);
      }

      if (var6 == 3) {
         var1.f(var2, var3, var4, 4);
      }

   }

   public void d(ry var1, int var2, int var3, int var4) {
      if (!cc) {
         oe var5 = (oe)var1.b(var2, var3, var4);
         if (var5 != null) {
            for(int var6 = 0; var6 < var5.c(); ++var6) {
               dk var7 = var5.d(var6);
               if (var7 != null) {
                  float var8 = this.a.nextFloat() * 0.8F + 0.1F;
                  float var9 = this.a.nextFloat() * 0.8F + 0.1F;
                  float var10 = this.a.nextFloat() * 0.8F + 0.1F;

                  while(var7.a > 0) {
                     int var11 = this.a.nextInt(21) + 10;
                     if (var11 > var7.a) {
                        var11 = var7.a;
                     }

                     var7.a -= var11;
                     ih var12 = new ih(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new dk(var7.c, var11, var7.i()));
                     float var13 = 0.05F;
                     var12.v = (double)((float)this.a.nextGaussian() * var13);
                     var12.w = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
                     var12.x = (double)((float)this.a.nextGaussian() * var13);
                     var1.a((ia)var12);
                  }
               }
            }
         }
      }

      super.d(var1, var2, var3, var4);
   }
}
