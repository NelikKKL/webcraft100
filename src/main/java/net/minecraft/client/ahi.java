package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ahi extends acq {
   private float a;

   public ahi(al var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.a = var3;
   }

   protected void a(abc var1, float var2) {
      GL11.glScalef(this.a, this.a, this.a);
   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void a(nq v0, float v1) { this.a((abc)v0, v1); }
}
