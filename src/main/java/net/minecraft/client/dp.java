package net.minecraft.client;

public class dp extends acq {
   public dp(al var1, float var2) {
      super(var1, var2);
   }

   public void a(qh var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected float a(qh var1, float var2) {
      float var3 = var1.e + (var1.b - var1.e) * var2;
      float var4 = var1.d + (var1.c - var1.d) * var2;
      return (me.a(var3) + 1.0F) * var4;
   }
}
