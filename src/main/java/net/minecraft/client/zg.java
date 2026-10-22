package net.minecraft.client;

public class zg extends acy {
   private p a;

   public zg(int var1, p var2) {
      super(var1);
      this.a = var2;
      this.bN = 1;
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      } else {
         ++var5;
         yy var8;
         if (this.a == net.minecraft.client.p.d) {
            var8 = yy.aE;
         } else {
            var8 = yy.aL;
         }

         if (var2.e(var4, var5, var6) && var2.e(var4, var5 + 1, var6)) {
            if (!var8.c(var3, var4, var5, var6)) {
               return false;
            } else {
               int var9 = me.c((double)((var2.y + 180.0F) * 4.0F / 360.0F) - (double)0.5F) & 3;
               a(var3, var4, var5, var6, var9, var8);
               --var1.a;
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public static void a(ry var0, int var1, int var2, int var3, int var4, yy var5) {
      byte var6 = 0;
      byte var7 = 0;
      if (var4 == 0) {
         var7 = 1;
      }

      if (var4 == 1) {
         var6 = -1;
      }

      if (var4 == 2) {
         var7 = -1;
      }

      if (var4 == 3) {
         var6 = 1;
      }

      int var8 = (var0.g(var1 - var6, var2, var3 - var7) ? 1 : 0) + (var0.g(var1 - var6, var2 + 1, var3 - var7) ? 1 : 0);
      int var9 = (var0.g(var1 + var6, var2, var3 + var7) ? 1 : 0) + (var0.g(var1 + var6, var2 + 1, var3 + var7) ? 1 : 0);
      boolean var10 = var0.a(var1 - var6, var2, var3 - var7) == var5.bM || var0.a(var1 - var6, var2 + 1, var3 - var7) == var5.bM;
      boolean var11 = var0.a(var1 + var6, var2, var3 + var7) == var5.bM || var0.a(var1 + var6, var2 + 1, var3 + var7) == var5.bM;
      boolean var12 = false;
      if (var10 && !var11) {
         var12 = true;
      } else if (var9 > var8) {
         var12 = true;
      }

      if (var12) {
         var4 = var4 - 1 & 3;
         var4 += 4;
      }

      var0.t = true;
      var0.d(var1, var2, var3, var5.bM, var4);
      var0.d(var1, var2 + 1, var3, var5.bM, var4 + 8);
      var0.t = false;
      var0.j(var1, var2, var3, var5.bM);
      var0.j(var1, var2 + 1, var3, var5.bM);
   }
}
