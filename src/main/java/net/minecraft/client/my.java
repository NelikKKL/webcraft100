package net.minecraft.client;

public class my extends acy {
   public my(int var1) {
      super(var1);
      this.bN = 1;
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         return false;
      } else if (!var3.e(var4, var5, var6).b()) {
         return false;
      } else {
         if (var7 == 1) {
            ++var5;
         }

         if (var7 == 2) {
            --var6;
         }

         if (var7 == 3) {
            ++var6;
         }

         if (var7 == 4) {
            --var4;
         }

         if (var7 == 5) {
            ++var4;
         }

         if (!var2.e(var4, var5, var6)) {
            return false;
         } else if (!yy.aD.c(var3, var4, var5, var6)) {
            return false;
         } else {
            if (var7 == 1) {
               int var8 = me.c((double)((var2.y + 180.0F) * 16.0F / 360.0F) + (double)0.5F) & 15;
               var3.d(var4, var5, var6, yy.aD.bM, var8);
            } else {
               var3.d(var4, var5, var6, yy.aI.bM, var7);
            }

            --var1.a;
            u var9 = (u)var3.b(var4, var5, var6);
            if (var9 != null) {
               var2.a(var9);
            }

            return true;
         }
      }
   }
}
