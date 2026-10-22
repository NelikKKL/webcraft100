package net.minecraft.client;

public class kn extends acy {
   public kn(int var1) {
      super(var1);
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      } else {
         ++var5;
         aab var8 = (aab)yy.S;
         int var9 = me.c((double)(var2.y * 4.0F / 360.0F) + (double)0.5F) & 3;
         byte var10 = 0;
         byte var11 = 0;
         if (var9 == 0) {
            var11 = 1;
         }

         if (var9 == 1) {
            var10 = -1;
         }

         if (var9 == 2) {
            var11 = -1;
         }

         if (var9 == 3) {
            var10 = 1;
         }

         if (var2.e(var4, var5, var6) && var2.e(var4 + var10, var5, var6 + var11)) {
            if (var3.h(var4, var5, var6) && var3.h(var4 + var10, var5, var6 + var11) && var3.g(var4, var5 - 1, var6) && var3.g(var4 + var10, var5 - 1, var6 + var11)) {
               var3.d(var4, var5, var6, var8.bM, var9);
               if (var3.a(var4, var5, var6) == var8.bM) {
                  var3.d(var4 + var10, var5, var6 + var11, var8.bM, var9 + 8);
               }

               --var1.a;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }
}
