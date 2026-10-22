package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class fh extends al {
   public acf g = new acf(this, 0, 0);
   public acf h;
   public acf i;
   public acf j;
   public acf k;
   public acf l;
   protected float m = 8.0F;
   protected float n = 4.0F;

   public fh(int var1, float var2) {
      this.g.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.g.a(0.0F, (float)(18 - var1), -6.0F);
      this.h = new acf(this, 28, 8);
      this.h.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.h.a(0.0F, (float)(17 - var1), 2.0F);
      this.i = new acf(this, 0, 16);
      this.i.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.i.a(-3.0F, (float)(24 - var1), 7.0F);
      this.j = new acf(this, 0, 16);
      this.j.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.j.a(3.0F, (float)(24 - var1), 7.0F);
      this.k = new acf(this, 0, 16);
      this.k.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.k.a(-3.0F, (float)(24 - var1), -5.0F);
      this.l = new acf(this, 0, 16);
      this.l.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.l.a(3.0F, (float)(24 - var1), -5.0F);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      if (this.d) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, this.m * var7, this.n * var7);
         this.g.a(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.h.a(var7);
         this.i.a(var7);
         this.j.a(var7);
         this.k.a(var7);
         this.l.a(var7);
         GL11.glPopMatrix();
      } else {
         this.g.a(var7);
         this.h.a(var7);
         this.i.a(var7);
         this.j.a(var7);
         this.k.a(var7);
         this.l.a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.g.f = var5 / (180F / (float)Math.PI);
      this.g.g = var4 / (180F / (float)Math.PI);
      this.h.f = ((float)Math.PI / 2F);
      this.i.f = me.b(var1 * 0.6662F) * 1.4F * var2;
      this.j.f = me.b(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.k.f = me.b(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.l.f = me.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
