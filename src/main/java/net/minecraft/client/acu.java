package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class acu extends yy {
   private int a = -1;

   public acu(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.D);
      this.a(f);
      this.c(0.5F);
   }

   public void e(int var1) {
      this.a = var1;
   }

   public void s() {
      this.a = -1;
   }

   public void d(ry var1, int var2, int var3, int var4) {
      super.d(var1, var2, var3, var4);
      int var5 = var1.d(var2, var3, var4);
      int var6 = ot.a[f(var5)];
      var2 += ot.b[var6];
      var3 += ot.c[var6];
      var4 += ot.d[var6];
      int var7 = var1.a(var2, var3, var4);
      if (var7 == yy.Z.bM || var7 == yy.V.bM) {
         var5 = var1.d(var2, var3, var4);
         if (abr.f(var5)) {
            yy.k[var7].b(var1, var2, var3, var4, var5, 0);
            var1.g(var2, var3, var4, 0);
         }
      }

   }

   public int a(int var1, int var2) {
      int var3 = f(var2);
      if (var1 == var3) {
         if (this.a >= 0) {
            return this.a;
         } else {
            return (var2 & 8) != 0 ? this.bL - 1 : this.bL;
         }
      } else {
         return var1 == ot.a[var3] ? 107 : 108;
      }
   }

   public int c() {
      return 17;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean d(ry var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      int var7 = var1.d(var2, var3, var4);
      switch (f(var7)) {
         case 0:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
            super.a(var1, var2, var3, var4, var5, var6);
            break;
         case 1:
            this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
            super.a(var1, var2, var3, var4, var5, var6);
            break;
         case 2:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            break;
         case 3:
            this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
            super.a(var1, var2, var3, var4, var5, var6);
            break;
         case 4:
            this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            break;
         case 5:
            this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6);
            this.a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
            super.a(var1, var2, var3, var4, var5, var6);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      switch (f(var5)) {
         case 0:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            break;
         case 1:
            this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 2:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            break;
         case 3:
            this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            break;
         case 4:
            this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            break;
         case 5:
            this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      int var6 = f(var1.d(var2, var3, var4));
      int var7 = var1.a(var2 - ot.b[var6], var3 - ot.c[var6], var4 - ot.d[var6]);
      if (var7 != yy.Z.bM && var7 != yy.V.bM) {
         var1.g(var2, var3, var4, 0);
      } else {
         yy.k[var7].a(var1, var2 - ot.b[var6], var3 - ot.c[var6], var4 - ot.d[var6], var5);
      }

   }

   public static int f(int var0) {
      return var0 & 7;
   }
}
