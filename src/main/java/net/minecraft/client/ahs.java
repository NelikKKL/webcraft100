package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ahs extends rg {
   public void a(ro var1, double var2, double var4, double var6, float var8, float var9) {
      this.a("/item/arrows.png");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var1.A + (var1.y - var1.A) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var1.B + (var1.z - var1.B) * var9, 0.0F, 0.0F, 1.0F);
      cv var10 = cv.a;
      byte var11 = 0;
      float var12 = 0.0F;
      float var13 = 0.5F;
      float var14 = (float)(0 + var11 * 10) / 32.0F;
      float var15 = (float)(5 + var11 * 10) / 32.0F;
      float var16 = 0.0F;
      float var17 = 0.15625F;
      float var18 = (float)(5 + var11 * 10) / 32.0F;
      float var19 = (float)(10 + var11 * 10) / 32.0F;
      float var20 = 0.05625F;
      GL11.glEnable(32826);
      float var21 = (float)var1.b - var9;
      if (var21 > 0.0F) {
         float var22 = -me.a(var21 * 3.0F) * var21;
         GL11.glRotatef(var22, 0.0F, 0.0F, 1.0F);
      }

      GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
      GL11.glScalef(var20, var20, var20);
      GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
      GL11.glNormal3f(var20, 0.0F, 0.0F);
      var10.b();
      var10.a((double)-7.0F, (double)-2.0F, (double)-2.0F, (double)var16, (double)var18);
      var10.a((double)-7.0F, (double)-2.0F, (double)2.0F, (double)var17, (double)var18);
      var10.a((double)-7.0F, (double)2.0F, (double)2.0F, (double)var17, (double)var19);
      var10.a((double)-7.0F, (double)2.0F, (double)-2.0F, (double)var16, (double)var19);
      var10.a();
      GL11.glNormal3f(-var20, 0.0F, 0.0F);
      var10.b();
      var10.a((double)-7.0F, (double)2.0F, (double)-2.0F, (double)var16, (double)var18);
      var10.a((double)-7.0F, (double)2.0F, (double)2.0F, (double)var17, (double)var18);
      var10.a((double)-7.0F, (double)-2.0F, (double)2.0F, (double)var17, (double)var19);
      var10.a((double)-7.0F, (double)-2.0F, (double)-2.0F, (double)var16, (double)var19);
      var10.a();

      for(int var23 = 0; var23 < 4; ++var23) {
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glNormal3f(0.0F, 0.0F, var20);
         var10.b();
         var10.a((double)-8.0F, (double)-2.0F, (double)0.0F, (double)var12, (double)var14);
         var10.a((double)8.0F, (double)-2.0F, (double)0.0F, (double)var13, (double)var14);
         var10.a((double)8.0F, (double)2.0F, (double)0.0F, (double)var13, (double)var15);
         var10.a((double)-8.0F, (double)2.0F, (double)0.0F, (double)var12, (double)var15);
         var10.a();
      }

      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((ro)v0, v1, v2, v3, v4, v5); }
}
