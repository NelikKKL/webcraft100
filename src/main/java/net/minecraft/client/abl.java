package net.minecraft.client;

public class abl extends ba {
   protected abl(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.d);
   }

   public int b(int var1) {
      return this.bL + (var1 == 1 ? 1 : 0);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.d(var2, var3, var4) == 0) {
         return false;
      } else {
         this.g(var1, var2, var3, var4);
         return true;
      }
   }

   public void f(ry var1, int var2, int var3, int var4, int var5) {
      if (!var1.I) {
         agc var6 = (agc)var1.b(var2, var3, var4);
         if (var6 != null) {
            var6.a = var5;
            var6.h();
            var1.f(var2, var3, var4, 1);
         }
      }
   }

   public void g(ry var1, int var2, int var3, int var4) {
      if (!var1.I) {
         agc var5 = (agc)var1.b(var2, var3, var4);
         if (var5 != null) {
            int var6 = var5.a;
            if (var6 != 0) {
               var1.g(1005, var2, var3, var4, 0);
               var1.a((String)null, var2, var3, var4);
               var5.a = 0;
               var5.h();
               var1.f(var2, var3, var4, 0);
               float var8 = 0.7F;
               double var9 = (double)(var1.w.nextFloat() * var8) + (double)(1.0F - var8) * (double)0.5F;
               double var11 = (double)(var1.w.nextFloat() * var8) + (double)(1.0F - var8) * 0.2 + 0.6;
               double var13 = (double)(var1.w.nextFloat() * var8) + (double)(1.0F - var8) * (double)0.5F;
               ih var15 = new ih(var1, (double)var2 + var9, (double)var3 + var11, (double)var4 + var13, new dk(var6, 1, 0));
               var15.c = 10;
               var1.a((ia)var15);
            }
         }
      }
   }

   public void d(ry var1, int var2, int var3, int var4) {
      this.g(var1, var2, var3, var4);
      super.d(var1, var2, var3, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.I) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }
   }

   public bq j_() {
      return new agc();
   }
}
