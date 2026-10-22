package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class afb extends al {
   private acf g;
   private acf h = new acf(this, "glass");
   private acf i;

   public afb(float var1) {
      this.h.a(0, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.g = new acf(this, "cube");
      this.g.a(32, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.i = new acf(this, "base");
      this.i.a(0, 16).a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      GL11.glTranslatef(0.0F, -0.5F, 0.0F);
      this.i.a(var7);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.8F + var4, 0.0F);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      this.h.a(var7);
      float var8 = 0.875F;
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.h.a(var7);
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.g.a(var7);
      GL11.glPopMatrix();
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }
}
