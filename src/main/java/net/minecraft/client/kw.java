package net.minecraft.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class kw extends yy {
   private boolean a = true;
   private Set cb = new HashSet();

   public kw(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.p);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   public int a(int var1, int var2) {
      return this.bL;
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
      return 5;
   }

   public int a(kq var1, int var2, int var3, int var4) {
      return 8388608;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4);
   }

   private void g(ry var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, var2, var3, var4);
      ArrayList var5 = new ArrayList(this.cb);
      this.cb.clear();

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         am var7 = (am)var5.get(var6);
         var1.j(var7.a, var7.b, var7.c, this.bM);
      }

   }

   private void a(ry var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.d(var2, var3, var4);
      int var9 = 0;
      this.a = false;
      boolean var10 = var1.v(var2, var3, var4);
      this.a = true;
      if (var10) {
         var9 = 15;
      } else {
         for(int var11 = 0; var11 < 4; ++var11) {
            int var12 = var2;
            int var13 = var4;
            if (var11 == 0) {
               var12 = var2 - 1;
            }

            if (var11 == 1) {
               ++var12;
            }

            if (var11 == 2) {
               var13 = var4 - 1;
            }

            if (var11 == 3) {
               ++var13;
            }

            if (var12 != var5 || var3 != var6 || var13 != var7) {
               var9 = this.f(var1, var12, var3, var13, var9);
            }

            if (var1.g(var12, var3, var13) && !var1.g(var2, var3 + 1, var4)) {
               if (var12 != var5 || var3 + 1 != var6 || var13 != var7) {
                  var9 = this.f(var1, var12, var3 + 1, var13, var9);
               }
            } else if (!var1.g(var12, var3, var13) && (var12 != var5 || var3 - 1 != var6 || var13 != var7)) {
               var9 = this.f(var1, var12, var3 - 1, var13, var9);
            }
         }

         if (var9 > 0) {
            --var9;
         } else {
            var9 = 0;
         }
      }

      if (var8 != var9) {
         var1.t = true;
         var1.f(var2, var3, var4, var9);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.t = false;

         for(int var18 = 0; var18 < 4; ++var18) {
            int var19 = var2;
            int var20 = var4;
            int var14 = var3 - 1;
            if (var18 == 0) {
               var19 = var2 - 1;
            }

            if (var18 == 1) {
               ++var19;
            }

            if (var18 == 2) {
               var20 = var4 - 1;
            }

            if (var18 == 3) {
               ++var20;
            }

            if (var1.g(var19, var3, var20)) {
               var14 += 2;
            }

            int var15 = 0;
            var15 = this.f(var1, var19, var3, var20, -1);
            var9 = var1.d(var2, var3, var4);
            if (var9 > 0) {
               --var9;
            }

            if (var15 >= 0 && var15 != var9) {
               this.a(var1, var19, var3, var20, var2, var3, var4);
            }

            var15 = this.f(var1, var19, var14, var20, -1);
            var9 = var1.d(var2, var3, var4);
            if (var9 > 0) {
               --var9;
            }

            if (var15 >= 0 && var15 != var9) {
               this.a(var1, var19, var14, var20, var2, var3, var4);
            }
         }

         if (var8 == 0 || var9 == 0) {
            this.cb.add(new am(var2, var3, var4));
            this.cb.add(new am(var2 - 1, var3, var4));
            this.cb.add(new am(var2 + 1, var3, var4));
            this.cb.add(new am(var2, var3 - 1, var4));
            this.cb.add(new am(var2, var3 + 1, var4));
            this.cb.add(new am(var2, var3, var4 - 1));
            this.cb.add(new am(var2, var3, var4 + 1));
         }
      }

   }

   private void h(ry var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4) == this.bM) {
         var1.j(var2, var3, var4, this.bM);
         var1.j(var2 - 1, var3, var4, this.bM);
         var1.j(var2 + 1, var3, var4, this.bM);
         var1.j(var2, var3, var4 - 1, this.bM);
         var1.j(var2, var3, var4 + 1, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
         var1.j(var2, var3 + 1, var4, this.bM);
      }
   }

   public void a(ry var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if (!var1.I) {
         this.g(var1, var2, var3, var4);
         var1.j(var2, var3 + 1, var4, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
         this.h(var1, var2 - 1, var3, var4);
         this.h(var1, var2 + 1, var3, var4);
         this.h(var1, var2, var3, var4 - 1);
         this.h(var1, var2, var3, var4 + 1);
         if (var1.g(var2 - 1, var3, var4)) {
            this.h(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 - 1, var3 - 1, var4);
         }

         if (var1.g(var2 + 1, var3, var4)) {
            this.h(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 + 1, var3 - 1, var4);
         }

         if (var1.g(var2, var3, var4 - 1)) {
            this.h(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 - 1);
         }

         if (var1.g(var2, var3, var4 + 1)) {
            this.h(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   public void d(ry var1, int var2, int var3, int var4) {
      super.d(var1, var2, var3, var4);
      if (!var1.I) {
         var1.j(var2, var3 + 1, var4, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
         this.g(var1, var2, var3, var4);
         this.h(var1, var2 - 1, var3, var4);
         this.h(var1, var2 + 1, var3, var4);
         this.h(var1, var2, var3, var4 - 1);
         this.h(var1, var2, var3, var4 + 1);
         if (var1.g(var2 - 1, var3, var4)) {
            this.h(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 - 1, var3 - 1, var4);
         }

         if (var1.g(var2 + 1, var3, var4)) {
            this.h(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.h(var1, var2 + 1, var3 - 1, var4);
         }

         if (var1.g(var2, var3, var4 - 1)) {
            this.h(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 - 1);
         }

         if (var1.g(var2, var3, var4 + 1)) {
            this.h(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.h(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   private int f(ry var1, int var2, int var3, int var4, int var5) {
      if (var1.a(var2, var3, var4) != this.bM) {
         return var5;
      } else {
         int var6 = var1.d(var2, var3, var4);
         return var6 > var5 ? var6 : var5;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I) {
         int var6 = var1.d(var2, var3, var4);
         boolean var7 = this.c(var1, var2, var3, var4);
         if (!var7) {
            this.b(var1, var2, var3, var4, var6, 0);
            var1.g(var2, var3, var4, 0);
         } else {
            this.g(var1, var2, var3, var4);
         }

         super.a(var1, var2, var3, var4, var5);
      }
   }

   public int a(int var1, Random var2, int var3) {
      return acy.aB.bM;
   }

   public boolean c(ry var1, int var2, int var3, int var4, int var5) {
      return !this.a ? false : this.b((kq)var1, var2, var3, var4, var5);
   }

   public boolean b(kq var1, int var2, int var3, int var4, int var5) {
      if (!this.a) {
         return false;
      } else if (var1.d(var2, var3, var4) == 0) {
         return false;
      } else if (var5 == 1) {
         return true;
      } else {
         boolean var6 = d(var1, var2 - 1, var3, var4, 1) || !var1.g(var2 - 1, var3, var4) && d(var1, var2 - 1, var3 - 1, var4, -1);
         boolean var7 = d(var1, var2 + 1, var3, var4, 3) || !var1.g(var2 + 1, var3, var4) && d(var1, var2 + 1, var3 - 1, var4, -1);
         boolean var8 = d(var1, var2, var3, var4 - 1, 2) || !var1.g(var2, var3, var4 - 1) && d(var1, var2, var3 - 1, var4 - 1, -1);
         boolean var9 = d(var1, var2, var3, var4 + 1, 0) || !var1.g(var2, var3, var4 + 1) && d(var1, var2, var3 - 1, var4 + 1, -1);
         if (!var1.g(var2, var3 + 1, var4)) {
            if (var1.g(var2 - 1, var3, var4) && d(var1, var2 - 1, var3 + 1, var4, -1)) {
               var6 = true;
            }

            if (var1.g(var2 + 1, var3, var4) && d(var1, var2 + 1, var3 + 1, var4, -1)) {
               var7 = true;
            }

            if (var1.g(var2, var3, var4 - 1) && d(var1, var2, var3 + 1, var4 - 1, -1)) {
               var8 = true;
            }

            if (var1.g(var2, var3, var4 + 1) && d(var1, var2, var3 + 1, var4 + 1, -1)) {
               var9 = true;
            }
         }

         if (!var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5) {
            return true;
         } else if (var5 == 2 && var8 && !var6 && !var7) {
            return true;
         } else if (var5 == 3 && var9 && !var6 && !var7) {
            return true;
         } else if (var5 == 4 && var6 && !var8 && !var9) {
            return true;
         } else {
            return var5 == 5 && var7 && !var8 && !var9;
         }
      }
   }

   public boolean g() {
      return this.a;
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.d(var2, var3, var4);
      if (var6 > 0) {
         double var7 = (double)var2 + (double)0.5F + ((double)var5.nextFloat() - (double)0.5F) * 0.2;
         double var9 = (double)((float)var3 + 0.0625F);
         double var11 = (double)var4 + (double)0.5F + ((double)var5.nextFloat() - (double)0.5F) * 0.2;
         float var13 = (float)var6 / 15.0F;
         float var14 = var13 * 0.6F + 0.4F;
         if (var6 == 0) {
            var14 = 0.0F;
         }

         float var15 = var13 * var13 * 0.7F - 0.5F;
         float var16 = var13 * var13 * 0.6F - 0.7F;
         if (var15 < 0.0F) {
            var15 = 0.0F;
         }

         if (var16 < 0.0F) {
            var16 = 0.0F;
         }

         var1.a("reddust", var7, var9, var11, (double)var14, (double)var15, (double)var16);
      }

   }

   public static boolean c(kq var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.a(var1, var2, var3);
      if (var5 == yy.av.bM) {
         return true;
      } else if (var5 == 0) {
         return false;
      } else if (yy.k[var5].g() && var4 != -1) {
         return true;
      } else if (var5 != yy.bh.bM && var5 != yy.bi.bM) {
         return false;
      } else {
         int var6 = var0.d(var1, var2, var3);
         return var4 == (var6 & 3) || var4 == lz.e[var6 & 3];
      }
   }

   public static boolean d(kq var0, int var1, int var2, int var3, int var4) {
      if (c(var0, var1, var2, var3, var4)) {
         return true;
      } else {
         int var5 = var0.a(var1, var2, var3);
         if (var5 == yy.bi.bM) {
            int var6 = var0.d(var1, var2, var3);
            return var4 == (var6 & 3);
         } else {
            return false;
         }
      }
   }
}
