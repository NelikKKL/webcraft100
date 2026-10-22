package net.minecraft.client;

import java.util.Random;

public class ez extends yy {
   protected ez(int var1) {
      super(var1, net.minecraft.client.p.b);
      this.bL = 77;
      this.b(true);
   }

   public int a(int var1, int var2) {
      if (var1 == 1) {
         return 78;
      } else {
         return var1 == 0 ? 2 : 77;
      }
   }

   public int a(kq var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return 78;
      } else if (var5 == 0) {
         return 2;
      } else {
         p var6 = var1.e(var2, var3 + 1, var4);
         return var6 != net.minecraft.client.p.u && var6 != net.minecraft.client.p.v ? 77 : 68;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I) {
         if (var1.n(var2, var3 + 1, var4) < 4 && yy.o[var1.a(var2, var3 + 1, var4)] > 2) {
            var1.g(var2, var3, var4, yy.v.bM);
         } else if (var1.n(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               int var10 = var1.a(var7, var8 + 1, var9);
               if (var1.a(var7, var8, var9) == yy.v.bM && var1.n(var7, var8 + 1, var9) >= 4 && yy.o[var10] <= 2) {
                  var1.g(var7, var8, var9, this.bM);
               }
            }
         }

      }
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
      super.b(var1, var2, var3, var4, var5);
      if (var5.nextInt(10) == 0) {
         var1.a("townaura", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + 1.1F), (double)((float)var4 + var5.nextFloat()), (double)0.0F, (double)0.0F, (double)0.0F);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return yy.v.a(0, var2, var3);
   }
}
