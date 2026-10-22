package net.minecraft.client;

public class mf extends yy {
   protected mf(int var1, p var2) {
      super(var1, var2);
      this.bL = 84;
      if (var2 == net.minecraft.client.p.f) {
         ++this.bL;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 0;
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
      this.d(var1.d(var2, var3, var4));
   }

   public void e() {
      float var1 = 0.1875F;
      this.a(0.0F, 0.5F - var1 / 2.0F, 0.0F, 1.0F, 0.5F + var1 / 2.0F, 1.0F);
   }

   public void d(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var2, 1.0F);
      if (e(var1)) {
         if ((var1 & 3) == 0) {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }

         if ((var1 & 3) == 1) {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }

         if ((var1 & 3) == 2) {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         if ((var1 & 3) == 3) {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
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
         var1.f(var2, var3, var4, var6 ^ 4);
         var1.a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.d(var2, var3, var4);
      boolean var7 = (var6 & 4) > 0;
      if (var7 != var5) {
         var1.f(var2, var3, var4, var6 ^ 4);
         var1.a((vi)null, 1003, var2, var3, var4, 0);
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I) {
         int var6 = var1.d(var2, var3, var4);
         int var7 = var2;
         int var8 = var4;
         if ((var6 & 3) == 0) {
            var8 = var4 + 1;
         }

         if ((var6 & 3) == 1) {
            --var8;
         }

         if ((var6 & 3) == 2) {
            var7 = var2 + 1;
         }

         if ((var6 & 3) == 3) {
            --var7;
         }

         if (!f(var1.a(var7, var3, var8))) {
            var1.g(var2, var3, var4, 0);
            this.b(var1, var2, var3, var4, var6, 0);
         }

         if (var5 > 0) {
            boolean var9 = var1.v(var2, var3, var4);
            if (var9 || yy.k[var5].g()) {
               this.a(var1, var2, var3, var4, var9);
            }
         }

      }
   }

   public gv a(ry var1, int var2, int var3, int var4, fb var5, fb var6) {
      this.b((kq)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void b(ry var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      if (var5 == 2) {
         var6 = 0;
      }

      if (var5 == 3) {
         var6 = 1;
      }

      if (var5 == 4) {
         var6 = 2;
      }

      if (var5 == 5) {
         var6 = 3;
      }

      var1.f(var2, var3, var4, var6);
   }

   public boolean d(ry var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         return false;
      } else if (var5 == 1) {
         return false;
      } else {
         if (var5 == 2) {
            ++var4;
         }

         if (var5 == 3) {
            --var4;
         }

         if (var5 == 4) {
            ++var2;
         }

         if (var5 == 5) {
            --var2;
         }

         return f(var1.a(var2, var3, var4));
      }
   }

   public static boolean e(int var0) {
      return (var0 & 4) != 0;
   }

   private static boolean f(int var0) {
      if (var0 <= 0) {
         return false;
      } else {
         yy var1 = yy.k[var0];
         return var1 != null && var1.bZ.j() && var1.b() || var1 == yy.bd;
      }
   }
}
