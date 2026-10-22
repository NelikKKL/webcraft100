package net.minecraft.client;

public class r extends uw {
   public r(int var1) {
      super(var1);
      this.i(0);
      this.a(true);
   }

   public int a(int var1) {
      return yy.ak.a(2, var1);
   }

   public int b(int var1) {
      return var1;
   }

   public String a(dk var1) {
      int var2 = var1.i();
      if (var2 < 0 || var2 >= xs.a.length) {
         var2 = 0;
      }

      return super.d() + "." + xs.a[var2];
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
      }

      if (var1.a == 0) {
         return false;
      } else if (!var2.e(var4, var5, var6)) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         int var9 = var3.d(var4, var5, var6);
         if (var7 == 1 && var8 == yy.ak.bM && var9 == var1.i()) {
            if (var3.d(var4, var5, var6, yy.aj.bM, var9)) {
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), yy.aj.bX.d(), (yy.aj.bX.b() + 1.0F) / 2.0F, yy.aj.bX.c() * 0.8F);
               --var1.a;
            }

            return true;
         } else {
            return super.a(var1, var2, var3, var4, var5, var6, var7);
         }
      }
   }
}
