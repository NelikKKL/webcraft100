package net.minecraft.client;

import java.util.Random;

public class ahv extends yy {
   protected ahv(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.p);
      this.b(true);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public int d() {
      return 20;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean d(ry var1, int var2, int var3, int var4, int var5) {
      if (var5 == 2 && var1.g(var2, var3, var4 + 1)) {
         return true;
      } else if (var5 == 3 && var1.g(var2, var3, var4 - 1)) {
         return true;
      } else if (var5 == 4 && var1.g(var2 + 1, var3, var4)) {
         return true;
      } else {
         return var5 == 5 && var1.g(var2 - 1, var3, var4);
      }
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      if (var1.g(var2 - 1, var3, var4)) {
         return true;
      } else if (var1.g(var2 + 1, var3, var4)) {
         return true;
      } else if (var1.g(var2, var3, var4 - 1)) {
         return true;
      } else {
         return var1.g(var2, var3, var4 + 1);
      }
   }

   public void b(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.d(var2, var3, var4);
      int var7 = var6 & 8;
      var6 &= 7;
      if (var5 == 2 && var1.g(var2, var3, var4 + 1)) {
         var6 = 4;
      } else if (var5 == 3 && var1.g(var2, var3, var4 - 1)) {
         var6 = 3;
      } else if (var5 == 4 && var1.g(var2 + 1, var3, var4)) {
         var6 = 2;
      } else if (var5 == 5 && var1.g(var2 - 1, var3, var4)) {
         var6 = 1;
      } else {
         var6 = this.g(var1, var2, var3, var4);
      }

      var1.f(var2, var3, var4, var6 + var7);
   }

   private int g(ry var1, int var2, int var3, int var4) {
      if (var1.g(var2 - 1, var3, var4)) {
         return 1;
      } else if (var1.g(var2 + 1, var3, var4)) {
         return 2;
      } else if (var1.g(var2, var3, var4 - 1)) {
         return 3;
      } else {
         return var1.g(var2, var3, var4 + 1) ? 4 : 1;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (this.h(var1, var2, var3, var4)) {
         int var6 = var1.d(var2, var3, var4) & 7;
         boolean var7 = false;
         if (!var1.g(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if (!var1.g(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if (!var1.g(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if (!var1.g(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if (var7) {
            this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
            var1.g(var2, var3, var4, 0);
         }
      }

   }

   private boolean h(ry var1, int var2, int var3, int var4) {
      if (!this.c(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void b(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      float var8 = 0.375F;
      float var9 = 0.625F;
      float var10 = 0.1875F;
      float var11 = 0.125F;
      if (var7) {
         var11 = 0.0625F;
      }

      if (var6 == 1) {
         this.a(0.0F, var8, 0.5F - var10, var11, var9, 0.5F + var10);
      } else if (var6 == 2) {
         this.a(1.0F - var11, var8, 0.5F - var10, 1.0F, var9, 0.5F + var10);
      } else if (var6 == 3) {
         this.a(0.5F - var10, var8, 0.0F, 0.5F + var10, var9, var11);
      } else if (var6 == 4) {
         this.a(0.5F - var10, var8, 1.0F - var11, 0.5F + var10, var9, 1.0F);
      }

   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      this.a(var1, var2, var3, var4, var5);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      int var6 = var1.d(var2, var3, var4);
      int var7 = var6 & 7;
      int var8 = 8 - (var6 & 8);
      if (var8 == 0) {
         return true;
      } else {
         var1.f(var2, var3, var4, var7 + var8);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + (double)0.5F, (double)var3 + (double)0.5F, (double)var4 + (double)0.5F, "random.click", 0.3F, 0.6F);
         var1.j(var2, var3, var4, this.bM);
         if (var7 == 1) {
            var1.j(var2 - 1, var3, var4, this.bM);
         } else if (var7 == 2) {
            var1.j(var2 + 1, var3, var4, this.bM);
         } else if (var7 == 3) {
            var1.j(var2, var3, var4 - 1, this.bM);
         } else if (var7 == 4) {
            var1.j(var2, var3, var4 + 1, this.bM);
         } else {
            var1.j(var2, var3 - 1, var4, this.bM);
         }

         var1.a(var2, var3, var4, this.bM, this.d());
         return true;
      }
   }

   public void d(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      if ((var5 & 8) > 0) {
         var1.j(var2, var3, var4, this.bM);
         int var6 = var5 & 7;
         if (var6 == 1) {
            var1.j(var2 - 1, var3, var4, this.bM);
         } else if (var6 == 2) {
            var1.j(var2 + 1, var3, var4, this.bM);
         } else if (var6 == 3) {
            var1.j(var2, var3, var4 - 1, this.bM);
         } else if (var6 == 4) {
            var1.j(var2, var3, var4 + 1, this.bM);
         } else {
            var1.j(var2, var3 - 1, var4, this.bM);
         }
      }

      super.d(var1, var2, var3, var4);
   }

   public boolean b(kq var1, int var2, int var3, int var4, int var5) {
      return (var1.d(var2, var3, var4) & 8) > 0;
   }

   public boolean c(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.d(var2, var3, var4);
      if ((var6 & 8) == 0) {
         return false;
      } else {
         int var7 = var6 & 7;
         if (var7 == 5 && var5 == 1) {
            return true;
         } else if (var7 == 4 && var5 == 2) {
            return true;
         } else if (var7 == 3 && var5 == 3) {
            return true;
         } else if (var7 == 2 && var5 == 4) {
            return true;
         } else {
            return var7 == 1 && var5 == 5;
         }
      }
   }

   public boolean g() {
      return true;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I) {
         int var6 = var1.d(var2, var3, var4);
         if ((var6 & 8) != 0) {
            var1.f(var2, var3, var4, var6 & 7);
            var1.j(var2, var3, var4, this.bM);
            int var7 = var6 & 7;
            if (var7 == 1) {
               var1.j(var2 - 1, var3, var4, this.bM);
            } else if (var7 == 2) {
               var1.j(var2 + 1, var3, var4, this.bM);
            } else if (var7 == 3) {
               var1.j(var2, var3, var4 - 1, this.bM);
            } else if (var7 == 4) {
               var1.j(var2, var3, var4 + 1, this.bM);
            } else {
               var1.j(var2, var3 - 1, var4, this.bM);
            }

            var1.a((double)var2 + (double)0.5F, (double)var3 + (double)0.5F, (double)var4 + (double)0.5F, "random.click", 0.3F, 0.5F);
            var1.c(var2, var3, var4, var2, var3, var4);
         }
      }
   }

   public void e() {
      float var1 = 0.1875F;
      float var2 = 0.125F;
      float var3 = 0.125F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }
}
