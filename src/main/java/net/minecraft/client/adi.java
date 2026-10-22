package net.minecraft.client;

public class adi extends ub {
   public adi(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.g = 0.04F;
      this.c(this.k() + 1);
      if (var10 == (double)0.0F && (var8 != (double)0.0F || var12 != (double)0.0F)) {
         this.v = var8;
         this.w = var10 + 0.1;
         this.x = var12;
      }

   }
}
