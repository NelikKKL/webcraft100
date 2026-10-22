package net.minecraft.client;

import java.util.Random;

public class wj extends yy {
   private int[] a = new int[256];
   private int[] cb = new int[256];

   protected wj(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.n);
      this.b(true);
   }

   public void x_() {
      this.a(yy.x.bM, 5, 20);
      this.a(yy.aZ.bM, 5, 20);
      this.a(yy.at.bM, 5, 20);
      this.a(yy.J.bM, 5, 5);
      this.a(yy.K.bM, 30, 60);
      this.a(yy.an.bM, 30, 20);
      this.a(yy.am.bM, 15, 100);
      this.a(yy.X.bM, 60, 100);
      this.a(yy.ab.bM, 30, 60);
      this.a(yy.bu.bM, 15, 100);
   }

   private void a(int var1, int var2, int var3) {
      this.a[var1] = var2;
      this.cb[var1] = var3;
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 3;
   }

   public int a(Random var1) {
      return 0;
   }

   public int d() {
      return 40;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = var1.a(var2, var3 - 1, var4) == yy.bb.bM;
      if (var1.y instanceof ol && var1.a(var2, var3 - 1, var4) == yy.z.bM) {
         var6 = true;
      }

      if (!this.c(var1, var2, var3, var4)) {
         var1.g(var2, var3, var4, 0);
      }

      if (var6 || !var1.E() || !var1.w(var2, var3, var4) && !var1.w(var2 - 1, var3, var4) && !var1.w(var2 + 1, var3, var4) && !var1.w(var2, var3, var4 - 1) && !var1.w(var2, var3, var4 + 1)) {
         int var7 = var1.d(var2, var3, var4);
         if (var7 < 15) {
            var1.c(var2, var3, var4, var7 + var5.nextInt(3) / 2);
         }

         var1.a(var2, var3, var4, this.bM, this.d());
         if (!var6 && !this.g(var1, var2, var3, var4)) {
            if (!var1.g(var2, var3 - 1, var4) || var7 > 3) {
               var1.g(var2, var3, var4, 0);
            }

         } else if (!var6 && !this.c((kq)var1, var2, var3 - 1, var4) && var7 == 15 && var5.nextInt(4) == 0) {
            var1.g(var2, var3, var4, 0);
         } else {
            this.a(var1, var2 + 1, var3, var4, 300, var5, var7);
            this.a(var1, var2 - 1, var3, var4, 300, var5, var7);
            this.a(var1, var2, var3 - 1, var4, 250, var5, var7);
            this.a(var1, var2, var3 + 1, var4, 250, var5, var7);
            this.a(var1, var2, var3, var4 - 1, 300, var5, var7);
            this.a(var1, var2, var3, var4 + 1, 300, var5, var7);

            for(int var8 = var2 - 1; var8 <= var2 + 1; ++var8) {
               for(int var9 = var4 - 1; var9 <= var4 + 1; ++var9) {
                  for(int var10 = var3 - 1; var10 <= var3 + 4; ++var10) {
                     if (var8 != var2 || var10 != var3 || var9 != var4) {
                        int var11 = 100;
                        if (var10 > var3 + 1) {
                           var11 += (var10 - (var3 + 1)) * 100;
                        }

                        int var12 = this.h(var1, var8, var10, var9);
                        if (var12 > 0) {
                           int var13 = (var12 + 40) / (var7 + 30);
                           if (var13 > 0 && var5.nextInt(var11) <= var13 && (!var1.E() || !var1.w(var8, var10, var9)) && !var1.w(var8 - 1, var10, var4) && !var1.w(var8 + 1, var10, var9) && !var1.w(var8, var10, var9 - 1) && !var1.w(var8, var10, var9 + 1)) {
                              int var14 = var7 + var5.nextInt(5) / 4;
                              if (var14 > 15) {
                                 var14 = 15;
                              }

                              var1.d(var8, var10, var9, this.bM, var14);
                           }
                        }
                     }
                  }
               }
            }

         }
      } else {
         var1.g(var2, var3, var4, 0);
      }
   }

   private void a(ry var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
      int var8 = this.cb[var1.a(var2, var3, var4)];
      if (var6.nextInt(var5) < var8) {
         boolean var9 = var1.a(var2, var3, var4) == yy.am.bM;
         if (var6.nextInt(var7 + 10) < 5 && !var1.w(var2, var3, var4)) {
            int var10 = var7 + var6.nextInt(5) / 4;
            if (var10 > 15) {
               var10 = 15;
            }

            var1.d(var2, var3, var4, this.bM, var10);
         } else {
            var1.g(var2, var3, var4, 0);
         }

         if (var9) {
            yy.am.e((ry)var1, var2, var3, var4, 1);
         }
      }

   }

   private boolean g(ry var1, int var2, int var3, int var4) {
      if (this.c((kq)var1, var2 + 1, var3, var4)) {
         return true;
      } else if (this.c((kq)var1, var2 - 1, var3, var4)) {
         return true;
      } else if (this.c((kq)var1, var2, var3 - 1, var4)) {
         return true;
      } else if (this.c((kq)var1, var2, var3 + 1, var4)) {
         return true;
      } else if (this.c((kq)var1, var2, var3, var4 - 1)) {
         return true;
      } else {
         return this.c((kq)var1, var2, var3, var4 + 1);
      }
   }

   private int h(ry var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (!var1.h(var2, var3, var4)) {
         return 0;
      } else {
         var5 = this.f(var1, var2 + 1, var3, var4, var5);
         var5 = this.f(var1, var2 - 1, var3, var4, var5);
         var5 = this.f(var1, var2, var3 - 1, var4, var5);
         var5 = this.f(var1, var2, var3 + 1, var4, var5);
         var5 = this.f(var1, var2, var3, var4 - 1, var5);
         var5 = this.f(var1, var2, var3, var4 + 1, var5);
         return var5;
      }
   }

   public boolean k() {
      return false;
   }

   public boolean c(kq var1, int var2, int var3, int var4) {
      return this.a[var1.a(var2, var3, var4)] > 0;
   }

   public int f(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a[var1.a(var2, var3, var4)];
      return var6 > var5 ? var6 : var5;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4) || this.g(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.g(var2, var3 - 1, var4) && !this.g(var1, var2, var3, var4)) {
         var1.g(var2, var3, var4, 0);
      }
   }

   public void a(ry var1, int var2, int var3, int var4) {
      if (var1.y.g > 0 || var1.a(var2, var3 - 1, var4) != yy.ap.bM || !yy.be.g(var1, var2, var3, var4)) {
         if (!var1.g(var2, var3 - 1, var4) && !this.g(var1, var2, var3, var4)) {
            var1.g(var2, var3, var4, 0);
         } else {
            var1.a(var2, var3, var4, this.bM, this.d());
         }
      }
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(24) == 0) {
         var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
      }

      if (!var1.g(var2, var3 - 1, var4) && !yy.ar.c((kq)var1, var2, var3 - 1, var4)) {
         if (yy.ar.c((kq)var1, var2 - 1, var3, var4)) {
            for(int var10 = 0; var10 < 2; ++var10) {
               float var15 = (float)var2 + var5.nextFloat() * 0.1F;
               float var20 = (float)var3 + var5.nextFloat();
               float var25 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var15, (double)var20, (double)var25, (double)0.0F, (double)0.0F, (double)0.0F);
            }
         }

         if (yy.ar.c((kq)var1, var2 + 1, var3, var4)) {
            for(int var11 = 0; var11 < 2; ++var11) {
               float var16 = (float)(var2 + 1) - var5.nextFloat() * 0.1F;
               float var21 = (float)var3 + var5.nextFloat();
               float var26 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var16, (double)var21, (double)var26, (double)0.0F, (double)0.0F, (double)0.0F);
            }
         }

         if (yy.ar.c((kq)var1, var2, var3, var4 - 1)) {
            for(int var12 = 0; var12 < 2; ++var12) {
               float var17 = (float)var2 + var5.nextFloat();
               float var22 = (float)var3 + var5.nextFloat();
               float var27 = (float)var4 + var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var17, (double)var22, (double)var27, (double)0.0F, (double)0.0F, (double)0.0F);
            }
         }

         if (yy.ar.c((kq)var1, var2, var3, var4 + 1)) {
            for(int var13 = 0; var13 < 2; ++var13) {
               float var18 = (float)var2 + var5.nextFloat();
               float var23 = (float)var3 + var5.nextFloat();
               float var28 = (float)(var4 + 1) - var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var18, (double)var23, (double)var28, (double)0.0F, (double)0.0F, (double)0.0F);
            }
         }

         if (yy.ar.c((kq)var1, var2, var3 + 1, var4)) {
            for(int var14 = 0; var14 < 2; ++var14) {
               float var19 = (float)var2 + var5.nextFloat();
               float var24 = (float)(var3 + 1) - var5.nextFloat() * 0.1F;
               float var29 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var19, (double)var24, (double)var29, (double)0.0F, (double)0.0F, (double)0.0F);
            }
         }
      } else {
         for(int var6 = 0; var6 < 3; ++var6) {
            float var7 = (float)var2 + var5.nextFloat();
            float var8 = (float)var3 + var5.nextFloat() * 0.5F + 0.5F;
            float var9 = (float)var4 + var5.nextFloat();
            var1.a("largesmoke", (double)var7, (double)var8, (double)var9, (double)0.0F, (double)0.0F, (double)0.0F);
         }
      }

   }
}
