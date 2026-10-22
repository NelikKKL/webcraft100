package net.minecraft.client;

public class pd extends hf {
   public pd(int var1) {
      super(var1, false);
   }

   public dk c(dk var1, ry var2, vi var3) {
      gv var4 = this.a(var2, var3, true);
      if (var4 == null) {
         return var1;
      } else {
         if (var4.a == net.minecraft.client.bo.a) {
            int var5 = var4.b;
            int var6 = var4.c;
            int var7 = var4.d;
            if (!var2.a(var3, var5, var6, var7)) {
               return var1;
            }

            if (!var3.e(var5, var6, var7)) {
               return var1;
            }

            if (var2.e(var5, var6, var7) == net.minecraft.client.p.g && var2.d(var5, var6, var7) == 0 && var2.h(var5, var6 + 1, var7)) {
               var2.g(var5, var6 + 1, var7, yy.bz.bM);
               if (!var3.cc.d) {
                  --var1.a;
               }
            }
         }

         return var1;
      }
   }

   public int c(int var1) {
      return yy.bz.c(var1);
   }
}
