package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ch extends acq {
   protected zf a;

   public ch() {
      super(new zf(0.0F), 0.5F);
      this.a = (zf)this.g;
   }

   protected int a(ai var1, int var2, float var3) {
      return -1;
   }

   public void a(ai var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected void a(ai var1, double var2, double var4, double var6) {
   }

   protected void a(ai var1, float var2) {
      super.b(var1, var2);
   }

   protected void b(ai var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }
}
