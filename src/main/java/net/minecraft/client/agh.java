package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class agh extends rg {
   private acr a = new acr();

   public agh() {
      this.e = 0.5F;
   }

   public void a(uo var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/terrain.png");
      yy var10 = yy.k[var1.a];
      ry var11 = var1.g();
      GL11.glDisable(2896);
      if (var10 == yy.bK) {
         this.a.a = var11;
         cv var12 = cv.a;
         var12.b();
         var12.b((double)((float)(-me.c(var1.s)) - 0.5F), (double)((float)(-me.c(var1.t)) - 0.5F), (double)((float)(-me.c(var1.u)) - 0.5F));
         this.a.b(var10, me.c(var1.s), me.c(var1.t), me.c(var1.u));
         var12.b((double)0.0F, (double)0.0F, (double)0.0F);
         var12.a();
      } else {
         this.a.a(var10, var11, me.c(var1.s), me.c(var1.t), me.c(var1.u));
      }

      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((uo)v0, v1, v2, v3, v4, v5); }
}
