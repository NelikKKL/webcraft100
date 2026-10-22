package net.minecraft.client;

import java.util.Random;

public class qz extends ba {
   public qz(int var1) {
      super(var1, net.minecraft.client.p.D);
      this.c(-1.0F);
   }

   public bq j_() {
      return null;
   }

   public void a(ry var1, int var2, int var3, int var4) {
   }

   public void d(ry var1, int var2, int var3, int var4) {
      bq var5 = var1.b(var2, var3, var4);
      if (var5 != null && var5 instanceof agb) {
         ((agb)var5).j();
      } else {
         super.d(var1, var2, var3, var4);
      }

   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean d(ry var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int c() {
      return -1;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (!var1.I && var1.b(var2, var3, var4) == null) {
         var1.g(var2, var3, var4, 0);
         return true;
      } else {
         return false;
      }
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.I) {
         agb var8 = this.c((kq)var1, var2, var3, var4);
         if (var8 != null) {
            yy.k[var8.a()].b(var1, var2, var3, var4, var8.f(), 0);
         }
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I && var1.b(var2, var3, var4) == null) {
      }

   }

   public static bq a(int var0, int var1, int var2, boolean var3, boolean var4) {
      return new agb(var0, var1, var2, var3, var4);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      agb var5 = this.c((kq)var1, var2, var3, var4);
      if (var5 == null) {
         return null;
      } else {
         float var6 = var5.a(0.0F);
         if (var5.c()) {
            var6 = 1.0F - var6;
         }

         return this.b(var1, var2, var3, var4, var5.a(), var6, var5.d());
      }
   }

   public void b(kq var1, int var2, int var3, int var4) {
      agb var5 = this.c(var1, var2, var3, var4);
      if (var5 != null) {
         yy var6 = yy.k[var5.a()];
         if (var6 == null || var6 == this) {
            return;
         }

         var6.b(var1, var2, var3, var4);
         float var7 = var5.a(0.0F);
         if (var5.c()) {
            var7 = 1.0F - var7;
         }

         int var8 = var5.d();
         this.bR = var6.bR - (double)((float)ot.b[var8] * var7);
         this.bS = var6.bS - (double)((float)ot.c[var8] * var7);
         this.bT = var6.bT - (double)((float)ot.d[var8] * var7);
         this.bU = var6.bU - (double)((float)ot.b[var8] * var7);
         this.bV = var6.bV - (double)((float)ot.c[var8] * var7);
         this.bW = var6.bW - (double)((float)ot.d[var8] * var7);
      }

   }

   public c b(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (var5 != 0 && var5 != this.bM) {
         c var8 = yy.k[var5].b(var1, var2, var3, var4);
         if (var8 == null) {
            return null;
         } else {
            var8.a -= (double)((float)ot.b[var7] * var6);
            var8.d -= (double)((float)ot.b[var7] * var6);
            var8.b -= (double)((float)ot.c[var7] * var6);
            var8.e -= (double)((float)ot.c[var7] * var6);
            var8.c -= (double)((float)ot.d[var7] * var6);
            var8.f -= (double)((float)ot.d[var7] * var6);
            return var8;
         }
      } else {
         return null;
      }
   }

   private agb c(kq var1, int var2, int var3, int var4) {
      bq var5 = var1.b(var2, var3, var4);
      return var5 != null && var5 instanceof agb ? (agb)var5 : null;
   }
}
