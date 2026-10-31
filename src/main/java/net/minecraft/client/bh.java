package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class bh extends acq {
   private aai a;

   public bh() {
      super(new aai(), 0.5F);
      this.a = (aai)super.g;
      this.a(this.a);
   }

   protected void a(ahd var1, float var2) {
      super.b(var1, var2);
      dk var3 = new dk(yy.ba, 1);
      if (var3 != null && var3.a().bM < 256) {
         GL11.glPushMatrix();
         this.a.i.c(0.0625F);
         if (acr.a(yy.k[var3.c].c())) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         }

         this.c.f.a(var1, var3, 0);
         GL11.glPopMatrix();
      }

   }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void b(nq v0, float v1) { this.a((ahd)v0, v1); } // PATCH(bridge3): bridge к методу с ДРУГИМ именем (a<->b), прежний bridge2 был привязан к одноимённому и вызывал не то
}
