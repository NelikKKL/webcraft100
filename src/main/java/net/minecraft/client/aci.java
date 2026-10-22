package net.minecraft.client;

import java.util.Random;

public class aci extends yy {
   public aci(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.z);
   }

   public void a(ry var1, int var2, int var3, int var4) {
      var1.a(var2, var3, var4, this.bM, this.d());
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, this.bM, this.d());
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      this.g(var1, var2, var3, var4);
   }

   private void g(ry var1, int var2, int var3, int var4) {
      if (cj.b_(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var8 = 32;
         if (!cj.a && var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
            uo var9 = new uo(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.bM);
            var1.a((ia)var9);
         } else {
            var1.g(var2, var3, var4, 0);

            while(cj.b_(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if (var3 > 0) {
               var1.g(var2, var3, var4, this.bM);
            }
         }
      }

   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      this.h(var1, var2, var3, var4);
      return true;
   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(ry var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4) == this.bM) {
         if (!var1.I) {
            for(int var5 = 0; var5 < 1000; ++var5) {
               int var6 = var2 + var1.w.nextInt(16) - var1.w.nextInt(16);
               int var7 = var3 + var1.w.nextInt(8) - var1.w.nextInt(8);
               int var8 = var4 + var1.w.nextInt(16) - var1.w.nextInt(16);
               if (var1.a(var6, var7, var8) == 0) {
                  var1.d(var6, var7, var8, this.bM, var1.d(var2, var3, var4));
                  var1.g(var2, var3, var4, 0);
                  short var9 = 128;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     double var11 = var1.w.nextDouble();
                     float var13 = (var1.w.nextFloat() - 0.5F) * 0.2F;
                     float var14 = (var1.w.nextFloat() - 0.5F) * 0.2F;
                     float var15 = (var1.w.nextFloat() - 0.5F) * 0.2F;
                     double var16 = (double)var6 + (double)(var2 - var6) * var11 + (var1.w.nextDouble() - (double)0.5F) * (double)1.0F + (double)0.5F;
                     double var18 = (double)var7 + (double)(var3 - var7) * var11 + var1.w.nextDouble() * (double)1.0F - (double)0.5F;
                     double var20 = (double)var8 + (double)(var4 - var8) * var11 + (var1.w.nextDouble() - (double)0.5F) * (double)1.0F + (double)0.5F;
                     var1.a("portal", var16, var18, var20, (double)var13, (double)var14, (double)var15);
                  }

                  return;
               }
            }

         }
      }
   }

   public int d() {
      return 3;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 27;
   }
}
