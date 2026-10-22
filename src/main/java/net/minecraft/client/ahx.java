package net.minecraft.client;

import java.util.Random;

public class ahx extends agw {
   int a = 0;
   boolean[] cb = new boolean[4];
   int[] cc = new int[4];

   protected ahx(int var1, p var2) {
      super(var1, var2);
   }

   private void j(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      var1.b(var2, var3, var4, this.bM + 1, var5);
      var1.c(var2, var3, var4, var2, var3, var4);
      var1.j(var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.g(var1, var2, var3, var4);
      byte var7 = 1;
      if (this.bZ == net.minecraft.client.p.h && !var1.y.d) {
         var7 = 2;
      }

      boolean var8 = true;
      if (var6 > 0) {
         int var9 = -100;
         this.a = 0;
         var9 = this.f(var1, var2 - 1, var3, var4, var9);
         var9 = this.f(var1, var2 + 1, var3, var4, var9);
         var9 = this.f(var1, var2, var3, var4 - 1, var9);
         var9 = this.f(var1, var2, var3, var4 + 1, var9);
         int var10 = var9 + var7;
         if (var10 >= 8 || var9 < 0) {
            var10 = -1;
         }

         if (this.g(var1, var2, var3 + 1, var4) >= 0) {
            int var11 = this.g(var1, var2, var3 + 1, var4);
            if (var11 >= 8) {
               var10 = var11;
            } else {
               var10 = var11 + 8;
            }
         }

         if (this.a >= 2 && this.bZ == net.minecraft.client.p.g) {
            if (var1.e(var2, var3 - 1, var4).b()) {
               var10 = 0;
            } else if (var1.e(var2, var3 - 1, var4) == this.bZ && var1.d(var2, var3, var4) == 0) {
               var10 = 0;
            }
         }

         if (this.bZ == net.minecraft.client.p.h && var6 < 8 && var10 < 8 && var10 > var6 && var5.nextInt(4) != 0) {
            var10 = var6;
            var8 = false;
         }

         if (var10 != var6) {
            var6 = var10;
            if (var10 < 0) {
               var1.g(var2, var3, var4, 0);
            } else {
               var1.f(var2, var3, var4, var10);
               var1.a(var2, var3, var4, this.bM, this.d());
               var1.j(var2, var3, var4, this.bM);
            }
         } else if (var8) {
            this.j(var1, var2, var3, var4);
         }
      } else {
         this.j(var1, var2, var3, var4);
      }

      if (this.m(var1, var2, var3 - 1, var4)) {
         if (this.bZ == net.minecraft.client.p.h && var1.e(var2, var3 - 1, var4) == net.minecraft.client.p.g) {
            var1.g(var2, var3 - 1, var4, yy.t.bM);
            this.h(var1, var2, var3 - 1, var4);
            return;
         }

         if (var6 >= 8) {
            var1.d(var2, var3 - 1, var4, this.bM, var6);
         } else {
            var1.d(var2, var3 - 1, var4, this.bM, var6 + 8);
         }
      } else if (var6 >= 0 && (var6 == 0 || this.l(var1, var2, var3 - 1, var4))) {
         boolean[] var16 = this.k(var1, var2, var3, var4);
         int var17 = var6 + var7;
         if (var6 >= 8) {
            var17 = 1;
         }

         if (var17 >= 8) {
            return;
         }

         if (var16[0]) {
            this.g(var1, var2 - 1, var3, var4, var17);
         }

         if (var16[1]) {
            this.g(var1, var2 + 1, var3, var4, var17);
         }

         if (var16[2]) {
            this.g(var1, var2, var3, var4 - 1, var17);
         }

         if (var16[3]) {
            this.g(var1, var2, var3, var4 + 1, var17);
         }
      }

   }

   private void g(ry var1, int var2, int var3, int var4, int var5) {
      if (this.m(var1, var2, var3, var4)) {
         int var6 = var1.a(var2, var3, var4);
         if (var6 > 0) {
            if (this.bZ == net.minecraft.client.p.h) {
               this.h(var1, var2, var3, var4);
            } else {
               yy.k[var6].b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
            }
         }

         var1.d(var2, var3, var4, this.bM, var5);
      }

   }

   private int c(ry var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for(int var8 = 0; var8 < 4; ++var8) {
         if ((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var11 = var4;
            if (var8 == 0) {
               var9 = var2 - 1;
            }

            if (var8 == 1) {
               ++var9;
            }

            if (var8 == 2) {
               var11 = var4 - 1;
            }

            if (var8 == 3) {
               ++var11;
            }

            if (!this.l(var1, var9, var3, var11) && (var1.e(var9, var3, var11) != this.bZ || var1.d(var9, var3, var11) != 0)) {
               if (!this.l(var1, var9, var3 - 1, var11)) {
                  return var5;
               }

               if (var5 < 4) {
                  int var12 = this.c(var1, var9, var3, var11, var5 + 1, var8);
                  if (var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] k(ry var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < 4; ++var5) {
         this.cc[var5] = 1000;
         int var6 = var2;
         int var8 = var4;
         if (var5 == 0) {
            var6 = var2 - 1;
         }

         if (var5 == 1) {
            ++var6;
         }

         if (var5 == 2) {
            var8 = var4 - 1;
         }

         if (var5 == 3) {
            ++var8;
         }

         if (!this.l(var1, var6, var3, var8) && (var1.e(var6, var3, var8) != this.bZ || var1.d(var6, var3, var8) != 0)) {
            if (!this.l(var1, var6, var3 - 1, var8)) {
               this.cc[var5] = 0;
            } else {
               this.cc[var5] = this.c(var1, var6, var3, var8, 1, var5);
            }
         }
      }

      int var9 = this.cc[0];

      for(int var10 = 1; var10 < 4; ++var10) {
         if (this.cc[var10] < var9) {
            var9 = this.cc[var10];
         }
      }

      for(int var11 = 0; var11 < 4; ++var11) {
         this.cb[var11] = this.cc[var11] == var9;
      }

      return this.cb;
   }

   private boolean l(ry var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      if (var5 != yy.aE.bM && var5 != yy.aL.bM && var5 != yy.aD.bM && var5 != yy.aF.bM && var5 != yy.aX.bM) {
         if (var5 == 0) {
            return false;
         } else {
            p var6 = yy.k[var5].bZ;
            if (var6 == net.minecraft.client.p.A) {
               return true;
            } else {
               return var6.d();
            }
         }
      } else {
         return true;
      }
   }

   protected int f(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = this.g(var1, var2, var3, var4);
      if (var6 < 0) {
         return var5;
      } else {
         if (var6 == 0) {
            ++this.a;
         }

         if (var6 >= 8) {
            var6 = 0;
         }

         return var5 >= 0 && var6 >= var5 ? var5 : var6;
      }
   }

   private boolean m(ry var1, int var2, int var3, int var4) {
      p var5 = var1.e(var2, var3, var4);
      if (var5 == this.bZ) {
         return false;
      } else if (var5 == net.minecraft.client.p.h) {
         return false;
      } else {
         return !this.l(var1, var2, var3, var4);
      }
   }

   public void a(ry var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if (var1.a(var2, var3, var4) == this.bM) {
         var1.a(var2, var3, var4, this.bM, this.d());
      }

   }
}
