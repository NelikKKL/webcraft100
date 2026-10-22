package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class wy extends rg {
   public void a(ia var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      a(var1.C, var2 - var1.R, var4 - var1.S, var6 - var1.T);
      GL11.glPopMatrix();
   }
}
