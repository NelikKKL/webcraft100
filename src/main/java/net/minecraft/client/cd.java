package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class cd extends rg {
   private int a;

   public cd(int var1) {
      this.a = var1;
   }

   public void a(ia var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable(32826);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      this.a("/gui/items.png");
      cv var10 = cv.a;
      if (this.a == 154) {
         int var11 = pk.a(((ab)var1).e(), false);
         float var12 = (float)(var11 >> 16 & 255) / 255.0F;
         float var13 = (float)(var11 >> 8 & 255) / 255.0F;
         float var14 = (float)(var11 & 255) / 255.0F;
         GL11.glColor3f(var12, var13, var14);
         GL11.glPushMatrix();
         this.a(var10, 141);
         GL11.glPopMatrix();
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
      }

      this.a(var10, this.a);
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   private void a(cv var1, int var2) {
      float var3 = (float)(var2 % 16 * 16 + 0) / 256.0F;
      float var4 = (float)(var2 % 16 * 16 + 16) / 256.0F;
      float var5 = (float)(var2 / 16 * 16 + 0) / 256.0F;
      float var6 = (float)(var2 / 16 * 16 + 16) / 256.0F;
      float var7 = 1.0F;
      float var8 = 0.5F;
      float var9 = 0.25F;
      GL11.glRotatef(180.0F - this.c.i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.c.j, 1.0F, 0.0F, 0.0F);
      var1.b();
      var1.b(0.0F, 1.0F, 0.0F);
      var1.a((double)(0.0F - var8), (double)(0.0F - var9), (double)0.0F, (double)var3, (double)var6);
      var1.a((double)(var7 - var8), (double)(0.0F - var9), (double)0.0F, (double)var4, (double)var6);
      var1.a((double)(var7 - var8), (double)(var7 - var9), (double)0.0F, (double)var4, (double)var5);
      var1.a((double)(0.0F - var8), (double)(var7 - var9), (double)0.0F, (double)var3, (double)var5);
      var1.a();
   }
}
