package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class m extends acq {
   private int a;

   public m() {
      super(new agy(), 0.25F);
      this.a = ((agy)this.g).a();
   }

   public void a(aea var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((agy)this.g).a();
      if (var10 != this.a) {
         this.a = var10;
         this.g = new agy();
         System.out.println("new lava slime model");
      }

      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected void a(aea var1, float var2) {
      int var3 = var1.aF();
      float var4 = (var1.c + (var1.b - var1.c) * var2) / ((float)var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      float var6 = (float)var3;
      GL11.glScalef(var5 * var6, 1.0F / var5 * var6, var5 * var6);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   public void a(nq v0, double v1, double v2, double v3, float v4, float v5) { this.a((aea)v0, v1, v2, v3, v4, v5); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void a(nq v0, float v1) { this.a((aea)v0, v1); }
}
