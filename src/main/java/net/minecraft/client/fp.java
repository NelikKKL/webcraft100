package net.minecraft.client;

public class fp extends yy {
   public fp(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.d);
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return !var1.e(var2, var3 - 1, var4).b() ? false : super.c(var1, var2, var3, var4);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      return b_(var5) ? null : net.minecraft.client.c.b((double)var2, (double)var3, (double)var4, (double)(var2 + 1), (double)((float)var3 + 1.5F), (double)(var4 + 1));
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 21;
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = (me.c((double)(var5.y * 4.0F / 360.0F) + (double)0.5F) & 3) % 4;
      var1.f(var2, var3, var4, var6);
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      int var6 = var1.d(var2, var3, var4);
      if (b_(var6)) {
         var1.f(var2, var3, var4, var6 & -5);
      } else {
         int var7 = (me.c((double)(var5.y * 4.0F / 360.0F) + (double)0.5F) & 3) % 4;
         int var8 = d(var6);
         if (var8 == (var7 + 2) % 4) {
            var6 = var7;
         }

         var1.f(var2, var3, var4, var6 | 4);
      }

      var1.a(var5, 1003, var2, var3, var4, 0);
      return true;
   }

   public static boolean b_(int var0) {
      return (var0 & 4) != 0;
   }

   public static int d(int var0) {
      return var0 & 3;
   }
}
