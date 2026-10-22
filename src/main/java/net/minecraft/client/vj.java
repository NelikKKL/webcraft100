package net.minecraft.client;

import java.util.Random;

public class vj extends yy {
   protected vj(int var1) {
      super(var1, net.minecraft.client.p.d);
      this.bL = 26;
   }

   public int a(kq var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.bL - 1;
      } else if (var5 == 0) {
         return this.bL - 1;
      } else {
         int var6 = var1.a(var2, var3, var4 - 1);
         int var7 = var1.a(var2, var3, var4 + 1);
         int var8 = var1.a(var2 - 1, var3, var4);
         int var9 = var1.a(var2 + 1, var3, var4);
         byte var10 = 3;
         if (yy.m[var6] && !yy.m[var7]) {
            var10 = 3;
         }

         if (yy.m[var7] && !yy.m[var6]) {
            var10 = 2;
         }

         if (yy.m[var8] && !yy.m[var9]) {
            var10 = 5;
         }

         if (yy.m[var9] && !yy.m[var8]) {
            var10 = 4;
         }

         return var5 == var10 ? this.bL + 1 : this.bL;
      }
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL - 1;
      } else if (var1 == 0) {
         return this.bL - 1;
      } else {
         return var1 == 3 ? this.bL + 1 : this.bL;
      }
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      var1.g(var2, var3, var4, 0);
   }
}
