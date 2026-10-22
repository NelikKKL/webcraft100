package net.minecraft.client;

import java.util.Random;

public class ahl extends yy {
   public ahl(int var1) {
      super(var1, 143, net.minecraft.client.p.k);
      this.b(true);
   }

   public void e() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int c() {
      return 20;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void b(kq var1, int var2, int var3, int var4) {
      int var6 = var1.d(var2, var3, var4);
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = 1.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      boolean var13 = var6 > 0;
      if ((var6 & 2) != 0) {
         var10 = Math.max(var10, 0.0625F);
         var7 = 0.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if ((var6 & 8) != 0) {
         var7 = Math.min(var7, 0.9375F);
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if ((var6 & 4) != 0) {
         var12 = Math.max(var12, 0.0625F);
         var9 = 0.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if ((var6 & 1) != 0) {
         var9 = Math.min(var9, 0.9375F);
         var12 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if (!var13 && this.e(var1.a(var2, var3 + 1, var4))) {
         var8 = Math.min(var8, 0.9375F);
         var11 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
      }

      this.a(var7, var8, var9, var10, var11, var12);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean d(ry var1, int var2, int var3, int var4, int var5) {
      switch (var5) {
         case 1:
            return this.e(var1.a(var2, var3 + 1, var4));
         case 2:
            return this.e(var1.a(var2, var3, var4 + 1));
         case 3:
            return this.e(var1.a(var2, var3, var4 - 1));
         case 4:
            return this.e(var1.a(var2 + 1, var3, var4));
         case 5:
            return this.e(var1.a(var2 - 1, var3, var4));
         default:
            return false;
      }
   }

   private boolean e(int var1) {
      if (var1 == 0) {
         return false;
      } else {
         yy var2 = yy.k[var1];
         return var2.b() && var2.bZ.d();
      }
   }

   private boolean g(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      int var6 = var5;
      if (var5 > 0) {
         for(int var7 = 0; var7 <= 3; ++var7) {
            int var8 = 1 << var7;
            if ((var5 & var8) != 0 && !this.e(var1.a(var2 + lz.a[var7], var3, var4 + lz.b[var7])) && (var1.a(var2, var3 + 1, var4) != this.bM || (var1.d(var2, var3 + 1, var4) & var8) == 0)) {
               var6 &= ~var8;
            }
         }
      }

      if (var6 == 0 && !this.e(var1.a(var2, var3 + 1, var4))) {
         return false;
      } else {
         if (var6 != var5) {
            var1.f(var2, var3, var4, var6);
         }

         return true;
      }
   }

   public int f() {
      return db.c();
   }

   public int c(int var1) {
      return db.c();
   }

   public int a(kq var1, int var2, int var3, int var4) {
      return var1.a().a(var2, var4).b(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I && !this.g(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I && var1.w.nextInt(4) == 0) {
         byte var6 = 4;
         int var7 = 5;
         boolean var8 = false;

         label141:
         for(int var9 = var2 - var6; var9 <= var2 + var6; ++var9) {
            for(int var10 = var4 - var6; var10 <= var4 + var6; ++var10) {
               for(int var11 = var3 - 1; var11 <= var3 + 1; ++var11) {
                  if (var1.a(var9, var11, var10) == this.bM) {
                     --var7;
                     if (var7 <= 0) {
                        var8 = true;
                        break label141;
                     }
                  }
               }
            }
         }

         int var15 = var1.d(var2, var3, var4);
         int var16 = var1.w.nextInt(6);
         int var17 = lz.d[var16];
         if (var16 == 1 && var3 < var1.c - 1 && var1.h(var2, var3 + 1, var4)) {
            if (var8) {
               return;
            }

            int var19 = var1.w.nextInt(16) & var15;
            if (var19 > 0) {
               for(int var22 = 0; var22 <= 3; ++var22) {
                  if (!this.e(var1.a(var2 + lz.a[var22], var3 + 1, var4 + lz.b[var22]))) {
                     var19 &= ~(1 << var22);
                  }
               }

               if (var19 > 0) {
                  var1.d(var2, var3 + 1, var4, this.bM, var19);
               }
            }
         } else if (var16 >= 2 && var16 <= 5 && (var15 & 1 << var17) == 0) {
            if (var8) {
               return;
            }

            int var18 = var1.a(var2 + lz.a[var17], var3, var4 + lz.b[var17]);
            if (var18 != 0 && yy.k[var18] != null) {
               if (yy.k[var18].bZ.j() && yy.k[var18].b()) {
                  var1.f(var2, var3, var4, var15 | 1 << var17);
               }
            } else {
               int var21 = var17 + 1 & 3;
               int var23 = var17 + 3 & 3;
               if ((var15 & 1 << var21) != 0 && this.e(var1.a(var2 + lz.a[var17] + lz.a[var21], var3, var4 + lz.b[var17] + lz.b[var21]))) {
                  var1.d(var2 + lz.a[var17], var3, var4 + lz.b[var17], this.bM, 1 << var21);
               } else if ((var15 & 1 << var23) != 0 && this.e(var1.a(var2 + lz.a[var17] + lz.a[var23], var3, var4 + lz.b[var17] + lz.b[var23]))) {
                  var1.d(var2 + lz.a[var17], var3, var4 + lz.b[var17], this.bM, 1 << var23);
               } else if ((var15 & 1 << var21) != 0 && var1.h(var2 + lz.a[var17] + lz.a[var21], var3, var4 + lz.b[var17] + lz.b[var21]) && this.e(var1.a(var2 + lz.a[var21], var3, var4 + lz.b[var21]))) {
                  var1.d(var2 + lz.a[var17] + lz.a[var21], var3, var4 + lz.b[var17] + lz.b[var21], this.bM, 1 << (var17 + 2 & 3));
               } else if ((var15 & 1 << var23) != 0 && var1.h(var2 + lz.a[var17] + lz.a[var23], var3, var4 + lz.b[var17] + lz.b[var23]) && this.e(var1.a(var2 + lz.a[var23], var3, var4 + lz.b[var23]))) {
                  var1.d(var2 + lz.a[var17] + lz.a[var23], var3, var4 + lz.b[var17] + lz.b[var23], this.bM, 1 << (var17 + 2 & 3));
               } else if (this.e(var1.a(var2 + lz.a[var17], var3 + 1, var4 + lz.b[var17]))) {
                  var1.d(var2 + lz.a[var17], var3, var4 + lz.b[var17], this.bM, 0);
               }
            }
         } else if (var3 > 1) {
            int var12 = var1.a(var2, var3 - 1, var4);
            if (var12 == 0) {
               int var13 = var1.w.nextInt(16) & var15;
               if (var13 > 0) {
                  var1.d(var2, var3 - 1, var4, this.bM, var13);
               }
            } else if (var12 == this.bM) {
               int var20 = var1.w.nextInt(16) & var15;
               int var14 = var1.d(var2, var3 - 1, var4);
               if (var14 != (var14 | var20)) {
                  var1.f(var2, var3 - 1, var4, var14 | var20);
               }
            }
         }
      }

   }

   public void b(ry var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      switch (var5) {
         case 2:
            var6 = 1;
            break;
         case 3:
            var6 = 4;
            break;
         case 4:
            var6 = 8;
            break;
         case 5:
            var6 = 2;
      }

      if (var6 != 0) {
         var1.f(var2, var3, var4, var6);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      if (!var1.I && var2.aH() != null && var2.aH().c == acy.bd.bM) {
         var2.a((px)ny.C[this.bM], 1);
         this.a(var1, var3, var4, var5, new dk(yy.bu, 1, 0));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
