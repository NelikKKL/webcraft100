package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class wn extends du {
   private uj b = new uj();

   public void a(rq var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F, (float)var6 + 0.5F);
      float var9 = (float)var1.a + var8;
      GL11.glTranslatef(0.0F, 0.1F + me.a(var9 * 0.1F) * 0.01F, 0.0F);

      float var10;
      for(var10 = var1.o - var1.p; var10 >= (float)Math.PI; var10 -= ((float)Math.PI * 2F)) {
      }

      while(var10 < -(float)Math.PI) {
         var10 += ((float)Math.PI * 2F);
      }

      float var11 = var1.p + var10 * var8;
      GL11.glRotatef(-var11 * 180.0F / (float)Math.PI, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
      this.a("/item/book.png");
      float var12 = var1.j + (var1.b - var1.j) * var8 + 0.25F;
      float var13 = var1.j + (var1.b - var1.j) * var8 + 0.75F;
      var12 = (var12 - (float)me.b((double)var12)) * 1.6F - 0.3F;
      var13 = (var13 - (float)me.b((double)var13)) * 1.6F - 0.3F;
      if (var12 < 0.0F) {
         var12 = 0.0F;
      }

      if (var13 < 0.0F) {
         var13 = 0.0F;
      }

      if (var12 > 1.0F) {
         var12 = 1.0F;
      }

      if (var13 > 1.0F) {
         var13 = 1.0F;
      }

      float var14 = var1.n + (var1.m - var1.n) * var8;
      this.b.a((ia)null, var9, var12, var13, var14, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(bq v0, double v1, double v2, double v3, float v4) { this.a((rq)v0, v1, v2, v3, v4); }
}
