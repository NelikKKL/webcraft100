package net.minecraft.client;

public class wh extends yy {
   protected wh(int var1) {
      super(var1, net.minecraft.client.p.l);
      this.bL = 48;
   }

   public void a(ry var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               if (var1.e(var6, var7, var8) == net.minecraft.client.p.g) {
               }
            }
         }
      }

   }

   public void d(ry var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               var1.j(var6, var7, var8, var1.a(var6, var7, var8));
            }
         }
      }

   }
}
