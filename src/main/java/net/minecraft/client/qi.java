package net.minecraft.client;

public class qi extends wg {
   protected qi(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.5F;
      float var4 = 0.015625F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public int c() {
      return 23;
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return net.minecraft.client.c.b((double)var2 + this.bR, (double)var3 + this.bS, (double)var4 + this.bT, (double)var2 + this.bU, (double)var3 + this.bV, (double)var4 + this.bW);
   }

   public int f() {
      return 2129968;
   }

   public int c(int var1) {
      return 2129968;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4);
   }

   public int a(kq var1, int var2, int var3, int var4) {
      return 2129968;
   }

   protected boolean d(int var1) {
      return var1 == yy.B.bM;
   }

   public boolean e(ry var1, int var2, int var3, int var4) {
      if (var3 >= 0 && var3 < var1.c) {
         return var1.e(var2, var3 - 1, var4) == net.minecraft.client.p.g && var1.d(var2, var3 - 1, var4) == 0;
      } else {
         return false;
      }
   }
}
