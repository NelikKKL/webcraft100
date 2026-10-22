package net.minecraft.client;

import java.util.Random;

public class mz extends yy {
   public static final double[] a = new double[]{(double)-0.0625F, (double)0.0625F, (double)0.1875F, (double)0.3125F};
   private static final int[] cb = new int[]{1, 2, 3, 4};
   private final boolean cc;

   protected mz(int var1, boolean var2) {
      super(var1, 6, net.minecraft.client.p.p);
      this.cc = var2;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean b() {
      return false;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return !var1.g(var2, var3 - 1, var4) ? false : super.c(var1, var2, var3, var4);
   }

   public boolean e(ry var1, int var2, int var3, int var4) {
      return !var1.g(var2, var3 - 1, var4) ? false : super.e(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.d(var2, var3, var4);
      boolean var7 = this.f(var1, var2, var3, var4, var6);
      if (this.cc && !var7) {
         var1.d(var2, var3, var4, yy.bh.bM, var6);
      } else if (!this.cc) {
         var1.d(var2, var3, var4, yy.bi.bM, var6);
         if (!var7) {
            int var8 = (var6 & 12) >> 2;
            var1.a(var2, var3, var4, yy.bi.bM, cb[var8] * 2);
         }
      }

   }

   public int a(int var1, int var2) {
      if (var1 == 0) {
         return this.cc ? 99 : 115;
      } else if (var1 == 1) {
         return this.cc ? 147 : 131;
      } else {
         return 5;
      }
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 && var5 != 1;
   }

   public int c() {
      return 15;
   }

   public int b(int var1) {
      return this.a(var1, 0);
   }

   public boolean c(ry var1, int var2, int var3, int var4, int var5) {
      return this.b((kq)var1, var2, var3, var4, var5);
   }

   public boolean b(kq var1, int var2, int var3, int var4, int var5) {
      if (!this.cc) {
         return false;
      } else {
         int var6 = var1.d(var2, var3, var4) & 3;
         if (var6 == 0 && var5 == 3) {
            return true;
         } else if (var6 == 1 && var5 == 4) {
            return true;
         } else if (var6 == 2 && var5 == 2) {
            return true;
         } else {
            return var6 == 3 && var5 == 5;
         }
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!this.e(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      } else {
         int var6 = var1.d(var2, var3, var4);
         boolean var7 = this.f(var1, var2, var3, var4, var6);
         int var8 = (var6 & 12) >> 2;
         if (this.cc && !var7) {
            var1.a(var2, var3, var4, this.bM, cb[var8] * 2);
         } else if (!this.cc && var7) {
            var1.a(var2, var3, var4, this.bM, cb[var8] * 2);
         }

      }
   }

   private boolean f(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = var5 & 3;
      switch (var6) {
         case 0:
            return var1.l(var2, var3, var4 + 1, 3) || var1.a(var2, var3, var4 + 1) == yy.av.bM && var1.d(var2, var3, var4 + 1) > 0;
         case 1:
            return var1.l(var2 - 1, var3, var4, 4) || var1.a(var2 - 1, var3, var4) == yy.av.bM && var1.d(var2 - 1, var3, var4) > 0;
         case 2:
            return var1.l(var2, var3, var4 - 1, 2) || var1.a(var2, var3, var4 - 1) == yy.av.bM && var1.d(var2, var3, var4 - 1) > 0;
         case 3:
            return var1.l(var2 + 1, var3, var4, 5) || var1.a(var2 + 1, var3, var4) == yy.av.bM && var1.d(var2 + 1, var3, var4) > 0;
         default:
            return false;
      }
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      int var6 = var1.d(var2, var3, var4);
      int var7 = (var6 & 12) >> 2;
      var7 = var7 + 1 << 2 & 12;
      var1.f(var2, var3, var4, var7 | var6 & 3);
      return true;
   }

   public boolean g() {
      return false;
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = ((me.c((double)(var5.y * 4.0F / 360.0F) + (double)0.5F) & 3) + 2) % 4;
      var1.f(var2, var3, var4, var6);
      boolean var7 = this.f(var1, var2, var3, var4, var6);
      if (var7) {
         var1.a(var2, var3, var4, this.bM, 1);
      }

   }

   public void a(ry var1, int var2, int var3, int var4) {
      var1.j(var2 + 1, var3, var4, this.bM);
      var1.j(var2 - 1, var3, var4, this.bM);
      var1.j(var2, var3, var4 + 1, this.bM);
      var1.j(var2, var3, var4 - 1, this.bM);
      var1.j(var2, var3 - 1, var4, this.bM);
      var1.j(var2, var3 + 1, var4, this.bM);
   }

   public void e(ry var1, int var2, int var3, int var4, int var5) {
      if (this.cc) {
         var1.j(var2, var3 + 1, var4, this.bM);
      }

      super.e(var1, var2, var3, var4, var5);
   }

   public boolean a() {
      return false;
   }

   public int a(int var1, Random var2, int var3) {
      return acy.ba.bM;
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      if (this.cc) {
         int var6 = var1.d(var2, var3, var4);
         double var7 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2;
         double var9 = (double)((float)var3 + 0.4F) + (double)(var5.nextFloat() - 0.5F) * 0.2;
         double var11 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2;
         double var13 = (double)0.0F;
         double var15 = (double)0.0F;
         if (var5.nextInt(2) == 0) {
            switch (var6 & 3) {
               case 0:
                  var15 = (double)-0.3125F;
                  break;
               case 1:
                  var13 = (double)0.3125F;
                  break;
               case 2:
                  var15 = (double)0.3125F;
                  break;
               case 3:
                  var13 = (double)-0.3125F;
            }
         } else {
            int var17 = (var6 & 12) >> 2;
            switch (var6 & 3) {
               case 0:
                  var15 = a[var17];
                  break;
               case 1:
                  var13 = -a[var17];
                  break;
               case 2:
                  var15 = -a[var17];
                  break;
               case 3:
                  var13 = a[var17];
            }
         }

         var1.a("reddust", var7 + var13, var9, var11 + var15, (double)0.0F, (double)0.0F, (double)0.0F);
      }
   }
}
