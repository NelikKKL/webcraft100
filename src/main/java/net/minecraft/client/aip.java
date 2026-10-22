package net.minecraft.client;

import java.util.Random;

public class aip extends yy {
   protected aip(int var1) {
      super(var1, net.minecraft.client.p.d);
      this.bL = 20;
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2, int var3) {
      return yy.J.bM;
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void d(ry var1, int var2, int var3, int var4) {
      byte var5 = 4;
      int var6 = var5 + 1;
      if (var1.b(var2 - var6, var3 - var6, var4 - var6, var2 + var6, var3 + var6, var4 + var6)) {
         for(int var7 = -var5; var7 <= var5; ++var7) {
            for(int var8 = -var5; var8 <= var5; ++var8) {
               for(int var9 = -var5; var9 <= var5; ++var9) {
                  int var10 = var1.a(var2 + var7, var3 + var8, var4 + var9);
                  if (var10 == yy.K.bM) {
                     int var11 = var1.d(var2 + var7, var3 + var8, var4 + var9);
                     if ((var11 & 8) == 0) {
                        var1.c(var2 + var7, var3 + var8, var4 + var9, var11 | 8);
                     }
                  }
               }
            }
         }
      }

   }

   public int a(int var1, int var2) {
      if (var1 == 1) {
         return 21;
      } else if (var1 == 0) {
         return 21;
      } else if (var2 == 1) {
         return 116;
      } else {
         return var2 == 2 ? 117 : 20;
      }
   }

   protected int a(int var1) {
      return var1;
   }
}
