package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class aeu extends du {
   private rb b = new rb();

   public void a(u var1, double var2, double var4, double var6, float var8) {
      yy var9 = var1.g();
      GL11.glPushMatrix();
      float var10 = 0.6666667F;
      if (var9 == yy.aD) {
         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         float var11 = (float)(var1.f() * 360) / 16.0F;
         GL11.glRotatef(-var11, 0.0F, 1.0F, 0.0F);
         this.b.h.j = true;
      } else {
         int var16 = var1.f();
         float var12 = 0.0F;
         if (var16 == 2) {
            var12 = 180.0F;
         }

         if (var16 == 4) {
            var12 = 90.0F;
         }

         if (var16 == 5) {
            var12 = -90.0F;
         }

         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         GL11.glRotatef(-var12, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
         this.b.h.j = false;
      }

      this.a("/item/sign.png");
      GL11.glPushMatrix();
      GL11.glScalef(var10, -var10, -var10);
      this.b.a();
      GL11.glPopMatrix();
      abe var17 = this.a();
      float var18 = 0.016666668F * var10;
      GL11.glTranslatef(0.0F, 0.5F * var10, 0.07F * var10);
      GL11.glScalef(var18, -var18, var18);
      GL11.glNormal3f(0.0F, 0.0F, -1.0F * var18);
      GL11.glDepthMask(false);
      byte var13 = 0;

      for(int var14 = 0; var14 < var1.a.length; ++var14) {
         String var15 = var1.a[var14];
         if (var14 == var1.b) {
            var15 = "> " + var15 + " <";
            var17.b(var15, -var17.a(var15) / 2, var14 * 10 - var1.a.length * 5, var13);
         } else {
            var17.b(var15, -var17.a(var15) / 2, var14 * 10 - var1.a.length * 5, var13);
         }
      }

      GL11.glDepthMask(true);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(bq v0, double v1, double v2, double v3, float v4) { this.a((u)v0, v1, v2, v3, v4); }
}
