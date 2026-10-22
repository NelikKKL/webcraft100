package net.minecraft.client;

import java.util.Random;

public abstract class agw extends yy {
   protected agw(int var1, p var2) {
      super(var1, (var2 == net.minecraft.client.p.h ? 14 : 12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      this.a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.b(true);
   }

   public int f() {
      return 16777215;
   }

   public int a(kq var1, int var2, int var3, int var4) {
      if (this.bZ == net.minecraft.client.p.g) {
         sr var5 = var1.a().a(var2, var4);
         return var5.A;
      } else {
         return 16777215;
      }
   }

   public static float e(int var0) {
      if (var0 >= 8) {
         var0 = 0;
      }

      float var1 = (float)(var0 + 1) / 9.0F;
      return var1;
   }

   public int b(int var1) {
      return var1 != 0 && var1 != 1 ? this.bL + 1 : this.bL;
   }

   protected int g(ry var1, int var2, int var3, int var4) {
      return var1.e(var2, var3, var4) != this.bZ ? -1 : var1.d(var2, var3, var4);
   }

   protected int c(kq var1, int var2, int var3, int var4) {
      if (var1.e(var2, var3, var4) != this.bZ) {
         return -1;
      } else {
         int var5 = var1.d(var2, var3, var4);
         if (var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean e(kq var1, int var2, int var3, int var4, int var5) {
      p var6 = var1.e(var2, var3, var4);
      if (var6 == this.bZ) {
         return false;
      } else if (var5 == 1) {
         return true;
      } else {
         return var6 == net.minecraft.client.p.t ? false : super.e(var1, var2, var3, var4, var5);
      }
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      p var6 = var1.e(var2, var3, var4);
      if (var6 == this.bZ) {
         return false;
      } else if (var5 == 1) {
         return true;
      } else {
         return var6 == net.minecraft.client.p.t ? false : super.a_(var1, var2, var3, var4, var5);
      }
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public int c() {
      return 4;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   private fb g(kq var1, int var2, int var3, int var4) {
      fb var5 = fb.b((double)0.0F, (double)0.0F, (double)0.0F);
      int var6 = this.c(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if (var7 == 0) {
            var8 = var2 - 1;
         }

         if (var7 == 1) {
            var10 = var4 - 1;
         }

         if (var7 == 2) {
            ++var8;
         }

         if (var7 == 3) {
            ++var10;
         }

         int var11 = this.c(var1, var8, var3, var10);
         if (var11 < 0) {
            if (!var1.e(var8, var3, var10).d()) {
               var11 = this.c(var1, var8, var3 - 1, var10);
               if (var11 >= 0) {
                  int var12 = var11 - (var6 - 8);
                  var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if (var11 >= 0) {
            int var16 = var11 - var6;
            var5 = var5.c((double)((var8 - var2) * var16), (double)((var3 - var3) * var16), (double)((var10 - var4) * var16));
         }
      }

      if (var1.d(var2, var3, var4) >= 8) {
         boolean var14 = false;
         if (var14 || this.e(var1, var2, var3, var4 - 1, 2)) {
            var14 = true;
         }

         if (var14 || this.e(var1, var2, var3, var4 + 1, 3)) {
            var14 = true;
         }

         if (var14 || this.e(var1, var2 - 1, var3, var4, 4)) {
            var14 = true;
         }

         if (var14 || this.e(var1, var2 + 1, var3, var4, 5)) {
            var14 = true;
         }

         if (var14 || this.e(var1, var2, var3 + 1, var4 - 1, 2)) {
            var14 = true;
         }

         if (var14 || this.e(var1, var2, var3 + 1, var4 + 1, 3)) {
            var14 = true;
         }

         if (var14 || this.e(var1, var2 - 1, var3 + 1, var4, 4)) {
            var14 = true;
         }

         if (var14 || this.e(var1, var2 + 1, var3 + 1, var4, 5)) {
            var14 = true;
         }

         if (var14) {
            var5 = var5.c().c((double)0.0F, (double)-6.0F, (double)0.0F);
         }
      }

      var5 = var5.c();
      return var5;
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5, fb var6) {
      fb var7 = this.g((kq)var1, var2, var3, var4);
      var6.a += var7.a;
      var6.b += var7.b;
      var6.c += var7.c;
   }

   public int d() {
      if (this.bZ == net.minecraft.client.p.g) {
         return 5;
      } else {
         return this.bZ == net.minecraft.client.p.h ? 30 : 0;
      }
   }

   public int e(kq var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4, 0);
      int var6 = var1.a(var2, var3 + 1, var4, 0);
      int var7 = var5 & 255;
      int var8 = var6 & 255;
      int var9 = var5 >> 16 & 255;
      int var10 = var6 >> 16 & 255;
      return (var7 > var8 ? var7 : var8) | (var9 > var10 ? var9 : var10) << 16;
   }

   public float d(kq var1, int var2, int var3, int var4) {
      float var5 = var1.c(var2, var3, var4);
      float var6 = var1.c(var2, var3 + 1, var4);
      return var5 > var6 ? var5 : var6;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   public int h() {
      return this.bZ == net.minecraft.client.p.g ? 1 : 0;
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      if (this.bZ == net.minecraft.client.p.g) {
         if (var5.nextInt(10) == 0) {
            int var6 = var1.d(var2, var3, var4);
            if (var6 <= 0 || var6 >= 8) {
               var1.a("suspended", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + var5.nextFloat()), (double)((float)var4 + var5.nextFloat()), (double)0.0F, (double)0.0F, (double)0.0F);
            }
         }

         for(int var21 = 0; var21 < 0; ++var21) {
            int var7 = var5.nextInt(4);
            int var8 = var2;
            int var9 = var4;
            if (var7 == 0) {
               var8 = var2 - 1;
            }

            if (var7 == 1) {
               ++var8;
            }

            if (var7 == 2) {
               var9 = var4 - 1;
            }

            if (var7 == 3) {
               ++var9;
            }

            if (var1.e(var8, var3, var9) == net.minecraft.client.p.a && (var1.e(var8, var3 - 1, var9).d() || var1.e(var8, var3 - 1, var9).a())) {
               float var10 = 0.0625F;
               double var11 = (double)((float)var2 + var5.nextFloat());
               double var13 = (double)((float)var3 + var5.nextFloat());
               double var15 = (double)((float)var4 + var5.nextFloat());
               if (var7 == 0) {
                  var11 = (double)((float)var2 - var10);
               }

               if (var7 == 1) {
                  var11 = (double)((float)(var2 + 1) + var10);
               }

               if (var7 == 2) {
                  var15 = (double)((float)var4 - var10);
               }

               if (var7 == 3) {
                  var15 = (double)((float)(var4 + 1) + var10);
               }

               double var17 = (double)0.0F;
               double var19 = (double)0.0F;
               if (var7 == 0) {
                  var17 = (double)(-var10);
               }

               if (var7 == 1) {
                  var17 = (double)var10;
               }

               if (var7 == 2) {
                  var19 = (double)(-var10);
               }

               if (var7 == 3) {
                  var19 = (double)var10;
               }

               var1.a("splash", var11, var13, var15, var17, (double)0.0F, var19);
            }
         }
      }

      if (this.bZ == net.minecraft.client.p.g && var5.nextInt(64) == 0) {
         int var22 = var1.d(var2, var3, var4);
         if (var22 > 0 && var22 < 8) {
            var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      if (this.bZ == net.minecraft.client.p.h && var1.e(var2, var3 + 1, var4) == net.minecraft.client.p.a && !var1.f(var2, var3 + 1, var4) && var5.nextInt(100) == 0) {
         double var23 = (double)((float)var2 + var5.nextFloat());
         double var25 = (double)var3 + this.bV;
         double var27 = (double)((float)var4 + var5.nextFloat());
         var1.a("lava", var23, var25, var27, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      if (var5.nextInt(10) == 0 && var1.g(var2, var3 - 1, var4) && !var1.e(var2, var3 - 2, var4).d()) {
         double var24 = (double)((float)var2 + var5.nextFloat());
         double var26 = (double)var3 - 1.05;
         double var28 = (double)((float)var4 + var5.nextFloat());
         if (this.bZ == net.minecraft.client.p.g) {
            var1.a("dripWater", var24, var26, var28, (double)0.0F, (double)0.0F, (double)0.0F);
         } else {
            var1.a("dripLava", var24, var26, var28, (double)0.0F, (double)0.0F, (double)0.0F);
         }
      }

   }

   public static double a(kq var0, int var1, int var2, int var3, p var4) {
      fb var5 = null;
      if (var4 == net.minecraft.client.p.g) {
         var5 = ((agw)yy.A).g(var0, var1, var2, var3);
      }

      if (var4 == net.minecraft.client.p.h) {
         var5 = ((agw)yy.C).g(var0, var1, var2, var3);
      }

      return var5.a == (double)0.0F && var5.c == (double)0.0F ? (double)-1000.0F : Math.atan2(var5.c, var5.a) - (Math.PI / 2D);
   }

   public void a(ry var1, int var2, int var3, int var4) {
      this.j(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      this.j(var1, var2, var3, var4);
   }

   private void j(ry var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4) == this.bM) {
         if (this.bZ == net.minecraft.client.p.h) {
            boolean var5 = false;
            if (var5 || var1.e(var2, var3, var4 - 1) == net.minecraft.client.p.g) {
               var5 = true;
            }

            if (var5 || var1.e(var2, var3, var4 + 1) == net.minecraft.client.p.g) {
               var5 = true;
            }

            if (var5 || var1.e(var2 - 1, var3, var4) == net.minecraft.client.p.g) {
               var5 = true;
            }

            if (var5 || var1.e(var2 + 1, var3, var4) == net.minecraft.client.p.g) {
               var5 = true;
            }

            if (var5 || var1.e(var2, var3 + 1, var4) == net.minecraft.client.p.g) {
               var5 = true;
            }

            if (var5) {
               int var6 = var1.d(var2, var3, var4);
               if (var6 == 0) {
                  var1.g(var2, var3, var4, yy.ap.bM);
               } else if (var6 <= 4) {
                  var1.g(var2, var3, var4, yy.w.bM);
               }

               this.h(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void h(ry var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.w.nextFloat() - var1.w.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2, (double)var4 + Math.random(), (double)0.0F, (double)0.0F, (double)0.0F);
      }

   }
}
