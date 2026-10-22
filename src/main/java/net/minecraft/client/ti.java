package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ti extends rg {
   private int a = -1;
   private al b;

   public ti() {
      this.e = 0.5F;
   }

   public void a(sf var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.a != 1) {
         this.b = new afb(0.0F);
         this.a = 1;
      }

      float var10 = (float)var1.a + var9;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/mob/enderdragon/crystal.png");
      float var11 = me.a(var10 * 0.2F) / 2.0F + 0.5F;
      var11 = var11 * var11 + var11;
      this.b.a(var1, 0.0F, var10 * 3.0F, var11 * 0.2F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((sf)v0, v1, v2, v3, v4, v5); }
}
