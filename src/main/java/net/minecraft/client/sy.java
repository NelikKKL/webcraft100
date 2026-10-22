package net.minecraft.client;

import java.util.Random;

public class sy extends ba {
   protected sy(int var1) {
      super(var1, 166, net.minecraft.client.p.e);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.h(0);
   }

   public boolean b() {
      return false;
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      super.b(var1, var2, var3, var4, var5);

      for(int var6 = var2 - 2; var6 <= var2 + 2; ++var6) {
         for(int var7 = var4 - 2; var7 <= var4 + 2; ++var7) {
            if (var6 > var2 - 2 && var6 < var2 + 2 && var7 == var4 - 1) {
               var7 = var4 + 2;
            }

            if (var5.nextInt(16) == 0) {
               for(int var8 = var3; var8 <= var3 + 1; ++var8) {
                  if (var1.a(var6, var8, var7) == yy.an.bM) {
                     if (!var1.h((var6 - var2) / 2 + var2, var8, (var7 - var4) / 2 + var4)) {
                        break;
                     }

                     var1.a("enchantmenttable", (double)var2 + (double)0.5F, (double)var3 + (double)2.0F, (double)var4 + (double)0.5F, (double)((float)(var6 - var2) + var5.nextFloat()) - (double)0.5F, (double)((float)(var8 - var3) - var5.nextFloat() - 1.0F), (double)((float)(var7 - var4) + var5.nextFloat()) - (double)0.5F);
                  }
               }
            }
         }
      }

   }

   public boolean a() {
      return false;
   }

   public int a(int var1, int var2) {
      return this.b(var1);
   }

   public int b(int var1) {
      if (var1 == 0) {
         return this.bL + 17;
      } else {
         return var1 == 1 ? this.bL : this.bL + 16;
      }
   }

   public bq j_() {
      return new rq();
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         var5.b(var2, var3, var4);
         return true;
      }
   }
}
