package net.minecraft.client;

public class wr extends acy {
   public wr(int var1, nu var2) {
      super(var1);
      this.bN = 1;
      this.i(var2.a());
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (!var2.e(var4, var5, var6)) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         int var9 = var3.a(var4, var5 + 1, var6);
         if ((var7 == 0 || var9 != 0 || var8 != yy.u.bM) && var8 != yy.v.bM) {
            return false;
         } else {
            yy var10 = yy.aA;
            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var10.bX.d(), (var10.bX.b() + 1.0F) / 2.0F, var10.bX.c() * 0.8F);
            if (var3.I) {
               return true;
            } else {
               var3.g(var4, var5, var6, var10.bM);
               var1.a(1, var2);
               return true;
            }
         }
      }
   }

   public boolean a() {
      return true;
   }
}
