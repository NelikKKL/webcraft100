package net.minecraft.client;

import java.util.Random;

public class uc extends yy {
   protected uc(int var1, p var2) {
      super(var1, var2);
      this.bL = 97;
      if (var2 == net.minecraft.client.p.f) {
         ++this.bL;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public int a(int var1, int var2) {
      if (var1 != 0 && var1 != 1) {
         int var3 = this.f(var2);
         if ((var3 == 0 || var3 == 2) ^ var1 <= 3) {
            return this.bL;
         } else {
            int var4 = var3 / 2 + (var1 & 1 ^ var3);
            var4 += (var2 & 4) / 4;
            int var5 = this.bL - (var2 & 8) * 2;
            if ((var4 & 1) != 0) {
               var5 = -var5;
            }

            return var5;
         }
      } else {
         return this.bL;
      }
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 7;
   }

   public c c_(ry var1, int var2, int var3, int var4) {
      this.b((kq)var1, var2, var3, var4);
      return super.c_(var1, var2, var3, var4);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      this.b((kq)var1, var2, var3, var4);
      return super.b(var1, var2, var3, var4);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      this.e(this.f(var1.d(var2, var3, var4)));
   }

   public void e(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      if (var1 == 0) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
      }

      if (var1 == 1) {
         this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 3) {
         this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
      }

   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      this.a(var1, var2, var3, var4, var5);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (this.bZ == net.minecraft.client.p.f) {
         return true;
      } else {
         int var6 = var1.d(var2, var3, var4);
         if ((var6 & 8) != 0) {
            if (var1.a(var2, var3 - 1, var4) == this.bM) {
               this.a(var1, var2, var3 - 1, var4, var5);
            }

            return true;
         } else {
            if (var1.a(var2, var3 + 1, var4) == this.bM) {
               var1.f(var2, var3 + 1, var4, (var6 ^ 4) + 8);
            }

            var1.f(var2, var3, var4, var6 ^ 4);
            var1.c(var2, var3 - 1, var4, var2, var3, var4);
            var1.a(var5, 1003, var2, var3, var4, 0);
            return true;
         }
      }
   }

   public void a(ry var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.d(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.a(var2, var3 - 1, var4) == this.bM) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }

      } else {
         boolean var7 = (var1.d(var2, var3, var4) & 4) > 0;
         if (var7 != var5) {
            if (var1.a(var2, var3 + 1, var4) == this.bM) {
               var1.f(var2, var3 + 1, var4, (var6 ^ 4) + 8);
            }

            var1.f(var2, var3, var4, var6 ^ 4);
            var1.c(var2, var3 - 1, var4, var2, var3, var4);
            var1.a((vi)null, 1003, var2, var3, var4, 0);
         }
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.d(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.a(var2, var3 - 1, var4) != this.bM) {
            var1.g(var2, var3, var4, 0);
         }

         if (var5 > 0 && yy.k[var5].g()) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = false;
         if (var1.a(var2, var3 + 1, var4) != this.bM) {
            var1.g(var2, var3, var4, 0);
            var7 = true;
         }

         if (!var1.g(var2, var3 - 1, var4)) {
            var1.g(var2, var3, var4, 0);
            var7 = true;
            if (var1.a(var2, var3 + 1, var4) == this.bM) {
               var1.g(var2, var3 + 1, var4, 0);
            }
         }

         if (var7) {
            if (!var1.I) {
               this.b(var1, var2, var3, var4, var6, 0);
            }
         } else if (var5 > 0) {
            boolean var8 = var1.v(var2, var3, var4) || var1.v(var2, var3 + 1, var4);
            this.a(var1, var2, var3, var4, var8);
         }
      }

   }

   public int a(int var1, Random var2, int var3) {
      if ((var1 & 8) != 0) {
         return 0;
      } else {
         return this.bZ == net.minecraft.client.p.f ? acy.aA.bM : acy.au.bM;
      }
   }

   public gv a(ry var1, int var2, int var3, int var4, fb var5, fb var6) {
      this.b((kq)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public int f(int var1) {
      return (var1 & 4) == 0 ? var1 - 1 & 3 : var1 & 3;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      if (var3 >= var1.c - 1) {
         return false;
      } else {
         return var1.g(var2, var3 - 1, var4) && super.c(var1, var2, var3, var4) && super.c(var1, var2, var3 + 1, var4);
      }
   }

   public static boolean g(int var0) {
      return (var0 & 4) != 0;
   }

   public int i() {
      return 1;
   }
}
