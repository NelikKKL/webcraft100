package net.minecraft.client;

import java.util.Random;

public class cu extends ba {
   private Random a = new Random();

   protected cu(int var1) {
      super(var1, net.minecraft.client.p.e);
      this.bL = 45;
   }

   public int d() {
      return 4;
   }

   public int a(int var1, Random var2, int var3) {
      return yy.P.bM;
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
         return var5 != var6 ? this.bL : this.bL + 1;
      }
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL + 17;
      } else if (var1 == 0) {
         return this.bL + 17;
      } else {
         return var1 == 3 ? this.bL + 1 : this.bL;
      }
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         bp var6 = (bp)var1.b(var2, var3, var4);
         if (var6 != null) {
            var5.a(var6);
         }

         return true;
      }
   }

   private void c(ry var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.d(var2, var3, var4);
      byte var9 = 0;
      byte var10 = 0;
      if (var6 == 3) {
         var10 = 1;
      } else if (var6 == 2) {
         var10 = -1;
      } else if (var6 == 5) {
         var9 = 1;
      } else {
         var9 = -1;
      }

      bp var11 = (bp)var1.b(var2, var3, var4);
      if (var11 != null) {
         dk var12 = var11.a();
         double var13 = (double)var2 + (double)var9 * 0.6 + (double)0.5F;
         double var15 = (double)var3 + (double)0.5F;
         double var17 = (double)var4 + (double)var10 * 0.6 + (double)0.5F;
         if (var12 == null) {
            var1.g(1001, var2, var3, var4, 0);
         } else {
            if (var12.c == acy.k.bM) {
               ro var25 = new ro(var1, var13, var15, var17);
               var25.a((double)var9, (double)0.1F, (double)var10, 1.1F, 6.0F);
               var25.a = true;
               var1.a((ia)var25);
               var1.g(1002, var2, var3, var4, 0);
            } else if (var12.c == acy.aO.bM) {
               qw var24 = new qw(var1, var13, var15, var17);
               var24.a((double)var9, (double)0.1F, (double)var10, 1.1F, 6.0F);
               var1.a((ia)var24);
               var1.g(1002, var2, var3, var4, 0);
            } else if (var12.c == acy.aC.bM) {
               aah var23 = new aah(var1, var13, var15, var17);
               var23.a((double)var9, (double)0.1F, (double)var10, 1.1F, 6.0F);
               var1.a((ia)var23);
               var1.g(1002, var2, var3, var4, 0);
            } else if (var12.c == acy.br.bM && abk.e(var12.i())) {
               ab var22 = new ab(var1, var13, var15, var17, var12.i());
               var22.a((double)var9, (double)0.1F, (double)var10, 1.375F, 3.0F);
               var1.a((ia)var22);
               var1.g(1002, var2, var3, var4, 0);
            } else {
               ih var19 = new ih(var1, var13, var15 - 0.3, var17, var12);
               double var20 = var5.nextDouble() * 0.1 + 0.2;
               var19.v = (double)var9 * var20;
               var19.w = (double)0.2F;
               var19.x = (double)var10 * var20;
               var19.v += var5.nextGaussian() * (double)0.0075F * (double)6.0F;
               var19.w += var5.nextGaussian() * (double)0.0075F * (double)6.0F;
               var19.x += var5.nextGaussian() * (double)0.0075F * (double)6.0F;
               var1.a((ia)var19);
               var1.g(1000, var2, var3, var4, 0);
            }

            var1.g(2000, var2, var3, var4, var9 + 1 + (var10 + 1) * 3);
         }
      }

   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (var5 > 0 && yy.k[var5].g()) {
         boolean var6 = var1.v(var2, var3, var4) || var1.v(var2, var3 + 1, var4);
         if (var6) {
            var1.a(var2, var3, var4, this.bM, this.d());
         }
      }

   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I && (var1.v(var2, var3, var4) || var1.v(var2, var3 + 1, var4))) {
         this.c(var1, var2, var3, var4, var5);
      }

   }

   public bq j_() {
      return new bp();
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
      bp var5 = (bp)var1.b(var2, var3, var4);
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

      super.d(var1, var2, var3, var4);
   }
}
