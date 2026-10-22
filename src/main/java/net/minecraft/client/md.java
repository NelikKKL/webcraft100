package net.minecraft.client;

import java.util.Random;

public class md extends yy {
   protected md(int var1, int var2) {
      super(var1, net.minecraft.client.p.j);
      this.bL = var2;
      float var3 = 0.375F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.b(true);
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (var1.h(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bM; ++var6) {
         }

         if (var6 < 3) {
            int var7 = var1.d(var2, var3, var4);
            if (var7 == 15) {
               var1.g(var2, var3 + 1, var4, this.bM);
               var1.f(var2, var3, var4, 0);
            } else {
               var1.f(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      if (var5 == this.bM) {
         return true;
      } else if (var5 != yy.u.bM && var5 != yy.v.bM && var5 != yy.E.bM) {
         return false;
      } else if (var1.e(var2 - 1, var3 - 1, var4) == net.minecraft.client.p.g) {
         return true;
      } else if (var1.e(var2 + 1, var3 - 1, var4) == net.minecraft.client.p.g) {
         return true;
      } else if (var1.e(var2, var3 - 1, var4 - 1) == net.minecraft.client.p.g) {
         return true;
      } else {
         return var1.e(var2, var3 - 1, var4 + 1) == net.minecraft.client.p.g;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      this.f(var1, var2, var3, var4);
   }

   protected final void f(ry var1, int var2, int var3, int var4) {
      if (!this.e(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean e(ry var1, int var2, int var3, int var4) {
      return this.c(var1, var2, var3, var4);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2, int var3) {
      return acy.aI.bM;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 1;
   }
}
