package net.minecraft.client;

import java.util.Random;

public class pu extends wg {
   private yy a;

   protected pu(int var1, yy var2) {
      super(var1, 111);
      this.a = var2;
      this.b(true);
      float var3 = 0.125F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   protected boolean d(int var1) {
      return var1 == yy.aA.bM;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if (var1.n(var2, var3 + 1, var4) >= 9) {
         float var6 = this.j(var1, var2, var3, var4);
         if (var5.nextInt((int)(25.0F / var6) + 1) == 0) {
            int var7 = var1.d(var2, var3, var4);
            if (var7 < 7) {
               ++var7;
               var1.f(var2, var3, var4, var7);
            } else {
               if (var1.a(var2 - 1, var3, var4) == this.a.bM) {
                  return;
               }

               if (var1.a(var2 + 1, var3, var4) == this.a.bM) {
                  return;
               }

               if (var1.a(var2, var3, var4 - 1) == this.a.bM) {
                  return;
               }

               if (var1.a(var2, var3, var4 + 1) == this.a.bM) {
                  return;
               }

               int var8 = var5.nextInt(4);
               int var9 = var2;
               int var10 = var4;
               if (var8 == 0) {
                  var9 = var2 - 1;
               }

               if (var8 == 1) {
                  ++var9;
               }

               if (var8 == 2) {
                  var10 = var4 - 1;
               }

               if (var8 == 3) {
                  ++var10;
               }

               if (var1.a(var9, var3, var10) == 0 && var1.a(var9, var3 - 1, var10) == yy.aA.bM) {
                  var1.g(var9, var3, var10, this.a.bM);
               }
            }
         }
      }

   }

   public void g(ry var1, int var2, int var3, int var4) {
      var1.f(var2, var3, var4, 7);
   }

   private float j(ry var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      int var10 = var1.a(var2 - 1, var3, var4 - 1);
      int var11 = var1.a(var2 + 1, var3, var4 - 1);
      int var12 = var1.a(var2 + 1, var3, var4 + 1);
      int var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.bM || var9 == this.bM;
      boolean var15 = var6 == this.bM || var7 == this.bM;
      boolean var16 = var10 == this.bM || var11 == this.bM || var12 == this.bM || var13 == this.bM;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if (var19 == yy.aA.bM) {
               var20 = 1.0F;
               if (var1.d(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if (var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if (var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int c(int var1) {
      int var2 = var1 * 32;
      int var3 = 255 - var1 * 8;
      int var4 = var1 * 4;
      return var2 << 16 | var3 << 8 | var4;
   }

   public int a(kq var1, int var2, int var3, int var4) {
      return this.c(var1.d(var2, var3, var4));
   }

   public int a(int var1, int var2) {
      return this.bL;
   }

   public void e() {
      float var1 = 0.125F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      this.bV = (double)((float)(var1.d(var2, var3, var4) * 2 + 2) / 16.0F);
      float var5 = 0.125F;
      this.a(0.5F - var5, 0.0F, 0.5F - var5, 0.5F + var5, (float)this.bV, 0.5F + var5);
   }

   public int c() {
      return 19;
   }

   public int c(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      if (var5 < 7) {
         return -1;
      } else if (var1.a(var2 - 1, var3, var4) == this.a.bM) {
         return 0;
      } else if (var1.a(var2 + 1, var3, var4) == this.a.bM) {
         return 1;
      } else if (var1.a(var2, var3, var4 - 1) == this.a.bM) {
         return 2;
      } else {
         return var1.a(var2, var3, var4 + 1) == this.a.bM ? 3 : -1;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (!var1.I) {
         acy var8 = null;
         if (this.a == yy.ba) {
            var8 = acy.bf;
         }

         if (this.a == yy.br) {
            var8 = acy.bg;
         }

         for(int var9 = 0; var9 < 3; ++var9) {
            if (var1.w.nextInt(15) <= var5) {
               float var10 = 0.7F;
               float var11 = var1.w.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               float var12 = var1.w.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               float var13 = var1.w.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               ih var14 = new ih(var1, (double)((float)var2 + var11), (double)((float)var3 + var12), (double)((float)var4 + var13), new dk(var8));
               var14.c = 10;
               var1.a((ia)var14);
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      if (var1 == 7) {
      }

      return -1;
   }

   public int a(Random var1) {
      return 1;
   }
}
