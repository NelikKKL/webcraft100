package net.minecraft.client;

import net.minecraft.client.Minecraft;

public class uq extends aes {
   private int c;

   public uq(Minecraft var1) {
      super(var1);
      this.b = true;
   }

   public static void b(vi var0) {
      var0.cc.c = true;
      var0.cc.d = true;
      var0.cc.a = true;
   }

   public static void c(vi var0) {
      var0.cc.c = false;
      var0.cc.b = false;
      var0.cc.d = false;
      var0.cc.a = false;
   }

   public void d(vi var1) {
      b(var1);

      for(int var2 = 0; var2 < 9; ++var2) {
         if (var1.by.a[var2] == null) {
            var1.by.a[var2] = new dk((yy)dr.a.get(var2));
         }
      }

   }

   public static void a(Minecraft var0, aes var1, int var2, int var3, int var4, int var5) {
      var0.f.a((vi)var0.h, var2, var3, var4, var5);
      var1.a(var2, var3, var4, var5);
   }

   public boolean a(vi var1, ry var2, dk var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.a(var4, var5, var6);
      if (var8 > 0 && yy.k[var8].a(var2, var4, var5, var6, var1)) {
         return true;
      } else if (var3 == null) {
         return false;
      } else {
         int var9 = var3.i();
         int var10 = var3.a;
         boolean var11 = var3.a(var1, var2, var4, var5, var6, var7);
         var3.b(var9);
         var3.a = var10;
         return var11;
      }
   }

   public void b(int var1, int var2, int var3, int var4) {
      a(this.a, this, var1, var2, var3, var4);
      this.c = 5;
   }

   public void c(int var1, int var2, int var3, int var4) {
      --this.c;
      if (this.c <= 0) {
         this.c = 5;
         a(this.a, this, var1, var2, var3, var4);
      }

   }

   public void b() {
   }

   public boolean a() {
      return false;
   }

   public void a(ry var1) {
      super.a(var1);
   }

   public float c() {
      return 5.0F;
   }

   public boolean f() {
      return false;
   }

   public boolean g() {
      return true;
   }

   public boolean h() {
      return true;
   }
}
