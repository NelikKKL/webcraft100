package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class ahp extends ba {
   private Random a = new net.minecraft.client.web.JRandom();

   public ahp(int var1) {
      super(var1, net.minecraft.client.p.f);
      this.bL = 157;
   }

   public boolean a() {
      return false;
   }

   public int c() {
      return 25;
   }

   public bq j_() {
      return new tt();
   }

   public boolean b() {
      return false;
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      this.a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.e();
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void e() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         tt var6 = (tt)var1.b(var2, var3, var4);
         if (var6 != null) {
            var5.a(var6);
         }

         return true;
      }
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + 0.4F + var5.nextFloat() * 0.2F);
      double var8 = (double)((float)var3 + 0.7F + var5.nextFloat() * 0.3F);
      double var10 = (double)((float)var4 + 0.4F + var5.nextFloat() * 0.2F);
      var1.a("smoke", var6, var8, var10, (double)0.0F, (double)0.0F, (double)0.0F);
   }

   public void d(ry var1, int var2, int var3, int var4) {
      bq var5 = var1.b(var2, var3, var4);
      if (var5 != null && var5 instanceof tt) {
         tt var6 = (tt)var5;

         for(int var7 = 0; var7 < var6.c(); ++var7) {
            dk var8 = var6.d(var7);
            if (var8 != null) {
               float var9 = this.a.nextFloat() * 0.8F + 0.1F;
               float var10 = this.a.nextFloat() * 0.8F + 0.1F;
               float var11 = this.a.nextFloat() * 0.8F + 0.1F;

               while(var8.a > 0) {
                  int var12 = this.a.nextInt(21) + 10;
                  if (var12 > var8.a) {
                     var12 = var8.a;
                  }

                  var8.a -= var12;
                  ih var13 = new ih(var1, (double)((float)var2 + var9), (double)((float)var3 + var10), (double)((float)var4 + var11), new dk(var8.c, var12, var8.i()));
                  float var14 = 0.05F;
                  var13.v = (double)((float)this.a.nextGaussian() * var14);
                  var13.w = (double)((float)this.a.nextGaussian() * var14 + 0.2F);
                  var13.x = (double)((float)this.a.nextGaussian() * var14);
                  var1.a((ia)var13);
               }
            }
         }
      }

      super.d(var1, var2, var3, var4);
   }

   public int a(int var1, Random var2, int var3) {
      return acy.bx.bM;
   }
}
