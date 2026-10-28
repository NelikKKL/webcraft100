package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class abw extends acq {
   public abw() {
      super(new lv(), 1.0F);
      this.a((al)(new lv()));
   }

   protected float a(vq var1) {
      return 180.0F;
   }

   protected int a(vq var1, int var2, float var3) {
      if (var2 != 0) {
         return -1;
      } else {
         this.a((String)"/mob/spider_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         adx.a(adx.b, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

   protected void a(vq var1, float var2) {
      float var3 = var1.ax();
      GL11.glScalef(var3, var3, var3);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected float a(nq v0) { return this.a((vq)v0); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected int a(nq v0, int v1, float v2) { return this.a((vq)v0, v1, v2); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void a(nq v0, float v1) { this.a((vq)v0, v1); }
}
