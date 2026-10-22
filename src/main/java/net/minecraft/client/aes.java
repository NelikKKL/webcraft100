package net.minecraft.client;

import net.minecraft.client.Minecraft;

public abstract class aes {
   protected final Minecraft a;
   public boolean b = false;

   public aes(Minecraft var1) {
      this.a = var1;
   }

   public void a(ry var1) {
   }

   public abstract void b(int var1, int var2, int var3, int var4);

   public boolean a(int var1, int var2, int var3, int var4) {
      ry var5 = this.a.f;
      yy var6 = yy.k[var5.a(var1, var2, var3)];
      if (var6 == null) {
         return false;
      } else {
         var5.g(2001, var1, var2, var3, var6.bM + var5.d(var1, var2, var3) * 256);
         int var7 = var5.d(var1, var2, var3);
         boolean var8 = var5.g(var1, var2, var3, 0);
         if (var6 != null && var8) {
            var6.e(var5, var1, var2, var3, var7);
         }

         return var8;
      }
   }

   public abstract void c(int var1, int var2, int var3, int var4);

   public abstract void b();

   public void a(float var1) {
   }

   public abstract float c();

   public boolean a(vi var1, ry var2, dk var3) {
      int var4 = var3.a;
      dk var5 = var3.a(var2, var1);
      if (var5 != var3 || var5 != null && var5.a != var4) {
         var1.by.a[var1.by.c] = var5;
         if (var5.a == 0) {
            var1.by.a[var1.by.c] = null;
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(vi var1) {
   }

   public void d() {
   }

   public abstract boolean a();

   public void d(vi var1) {
      uq.c(var1);
   }

   public abstract boolean a(vi var1, ry var2, dk var3, int var4, int var5, int var6, int var7);

   public vi b(ry var1) {
      return new di(this.a, var1, this.a.k, var1.y.g);
   }

   public void b(vi var1, ia var2) {
      var1.j(var2);
   }

   public void a(vi var1, ia var2) {
      var1.k(var2);
   }

   public dk a(int var1, int var2, int var3, boolean var4, vi var5) {
      return var5.bA.a(var2, var3, var4, var5);
   }

   public void a(int var1, vi var2) {
      var2.bA.b(var2);
      var2.bA = var2.bz;
   }

   public void a(int var1, int var2) {
   }

   public boolean i() {
      return false;
   }

   public void a_(vi var1) {
      var1.aB();
   }

   public boolean e() {
      return false;
   }

   public boolean f() {
      return true;
   }

   public boolean g() {
      return false;
   }

   public boolean h() {
      return false;
   }

   public void a(dk var1, int var2) {
   }

   public void a(dk var1) {
   }
}
