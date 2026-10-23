package net.minecraft.client;

import java.util.Random;

public class mr extends ba {
   private Class a;
   private boolean cb;

   protected mr(int var1, Class var2, boolean var3) {
      super(var1, net.minecraft.client.p.d);
      this.cb = var3;
      this.bL = 4;
      this.a = var2;
      float var4 = 0.25F;
      float var5 = 1.0F;
      this.a(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var5, 0.5F + var4);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public c c_(ry var1, int var2, int var3, int var4) {
      this.b((kq)var1, var2, var3, var4);
      return super.c_(var1, var2, var3, var4);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      if (!this.cb) {
         int var5 = var1.d(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if (var5 == 2) {
            this.a(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if (var5 == 3) {
            this.a(var8, var6, 0.0F, var9, var7, var10);
         }

         if (var5 == 4) {
            this.a(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if (var5 == 5) {
            this.a(0.0F, var6, var8, var10, var7, var9);
         }

      }
   }

   public int c() {
      return -1;
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public bq j_() {
      try {
         return (bq)net.minecraft.client.Reflect.newEmpty(this.a);
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public int a(int var1, Random var2, int var3) {
      return acy.at.bM;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (this.cb) {
         if (!var1.e(var2, var3 - 1, var4).b()) {
            var6 = true;
         }
      } else {
         int var7 = var1.d(var2, var3, var4);
         var6 = true;
         if (var7 == 2 && var1.e(var2, var3, var4 + 1).b()) {
            var6 = false;
         }

         if (var7 == 3 && var1.e(var2, var3, var4 - 1).b()) {
            var6 = false;
         }

         if (var7 == 4 && var1.e(var2 + 1, var3, var4).b()) {
            var6 = false;
         }

         if (var7 == 5 && var1.e(var2 - 1, var3, var4).b()) {
            var6 = false;
         }
      }

      if (var6) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

      super.a(var1, var2, var3, var4, var5);
   }
}
