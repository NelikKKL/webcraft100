package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class ahh extends yy {
   private yy a;

   protected ahh(int var1, yy var2) {
      super(var1, var2.bL, var2.bZ);
      this.a = var2;
      this.c(var2.bN);
      this.b(var2.bO / 3.0F);
      this.a(var2.bX);
      this.h(255);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return super.b(var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 10;
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      return super.a_(var1, var2, var3, var4, var5);
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      int var7 = var1.d(var2, var3, var4);
      if (var7 == 0) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 1) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void e(ry var1, int var2, int var3, int var4, int var5) {
      this.a.e(var1, var2, var3, var4, var5);
   }

   public int e(kq var1, int var2, int var3, int var4) {
      return this.a.e(var1, var2, var3, var4);
   }

   public float d(kq var1, int var2, int var3, int var4) {
      return this.a.d(var1, var2, var3, var4);
   }

   public float a(ia var1) {
      return this.a.a(var1);
   }

   public int h() {
      return this.a.h();
   }

   public int a(int var1, int var2) {
      return this.a.a(var1, 0);
   }

   public int b(int var1) {
      return this.a.a(var1, 0);
   }

   public int d() {
      return this.a.d();
   }

   public c c_(ry var1, int var2, int var3, int var4) {
      return this.a.c_(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5, fb var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean k() {
      return this.a.k();
   }

   public boolean a(int var1, boolean var2) {
      return this.a.a(var1, var2);
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return this.a.c(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 0);
      this.a.a(var1, var2, var3, var4);
   }

   public void d(ry var1, int var2, int var3, int var4) {
      this.a.d(var1, var2, var3, var4);
   }

   public void b(ry var1, int var2, int var3, int var4, ia var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      return this.a.a(var1, var2, var3, var4, var5);
   }

   public void i(ry var1, int var2, int var3, int var4) {
      this.a.i(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = me.c((double)(var5.y * 4.0F / 360.0F) + (double)0.5F) & 3;
      if (var6 == 0) {
         var1.f(var2, var3, var4, 2);
      }

      if (var6 == 1) {
         var1.f(var2, var3, var4, 1);
      }

      if (var6 == 2) {
         var1.f(var2, var3, var4, 3);
      }

      if (var6 == 3) {
         var1.f(var2, var3, var4, 0);
      }

   }
}
