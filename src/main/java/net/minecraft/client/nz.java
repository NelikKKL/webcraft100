package net.minecraft.client;

public class nz extends yy {
   public nz(int var1, int var2) {
      super(var1, var2, net.minecraft.client.p.d);
   }

   public nz(int var1, int var2, p var3) {
      super(var1, var2, var3);
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4);
   }

   public c b(ry var1, int var2, int var3, int var4) {
      boolean var5 = this.c((kq)var1, var2, var3, var4 - 1);
      boolean var6 = this.c((kq)var1, var2, var3, var4 + 1);
      boolean var7 = this.c((kq)var1, var2 - 1, var3, var4);
      boolean var8 = this.c((kq)var1, var2 + 1, var3, var4);
      float var9 = 0.375F;
      float var10 = 0.625F;
      float var11 = 0.375F;
      float var12 = 0.625F;
      if (var5) {
         var11 = 0.0F;
      }

      if (var6) {
         var12 = 1.0F;
      }

      if (var7) {
         var9 = 0.0F;
      }

      if (var8) {
         var10 = 1.0F;
      }

      return net.minecraft.client.c.b((double)((float)var2 + var9), (double)var3, (double)((float)var4 + var11), (double)((float)var2 + var10), (double)((float)var3 + 1.5F), (double)((float)var4 + var12));
   }

   public void b(kq var1, int var2, int var3, int var4) {
      boolean var5 = this.c(var1, var2, var3, var4 - 1);
      boolean var6 = this.c(var1, var2, var3, var4 + 1);
      boolean var7 = this.c(var1, var2 - 1, var3, var4);
      boolean var8 = this.c(var1, var2 + 1, var3, var4);
      float var9 = 0.375F;
      float var10 = 0.625F;
      float var11 = 0.375F;
      float var12 = 0.625F;
      if (var5) {
         var11 = 0.0F;
      }

      if (var6) {
         var12 = 1.0F;
      }

      if (var7) {
         var9 = 0.0F;
      }

      if (var8) {
         var10 = 1.0F;
      }

      this.a(var9, 0.0F, var11, var10, 1.0F, var12);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int c() {
      return 11;
   }

   public boolean c(kq var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      if (var5 != this.bM && var5 != yy.bv.bM) {
         yy var6 = yy.k[var5];
         if (var6 != null && var6.bZ.j() && var6.b()) {
            return var6.bZ != net.minecraft.client.p.y;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
