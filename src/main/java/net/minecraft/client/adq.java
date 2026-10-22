package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class adq extends al {
   public acf g;
   public acf h;
   public acf i;
   public acf j;
   public acf k;
   public acf l;
   public acf m;
   public acf n;

   public adq() {
      byte var1 = 16;
      this.g = new acf(this, 0, 0);
      this.g.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.g.a(0.0F, (float)(-1 + var1), -4.0F);
      this.m = new acf(this, 14, 0);
      this.m.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.m.a(0.0F, (float)(-1 + var1), -4.0F);
      this.n = new acf(this, 14, 4);
      this.n.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.n.a(0.0F, (float)(-1 + var1), -4.0F);
      this.h = new acf(this, 0, 9);
      this.h.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.h.a(0.0F, (float)(0 + var1), 0.0F);
      this.i = new acf(this, 26, 0);
      this.i.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.i.a(-2.0F, (float)(3 + var1), 1.0F);
      this.j = new acf(this, 26, 0);
      this.j.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.j.a(1.0F, (float)(3 + var1), 1.0F);
      this.k = new acf(this, 24, 13);
      this.k.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.k.a(-4.0F, (float)(-3 + var1), 0.0F);
      this.l = new acf(this, 24, 13);
      this.l.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.l.a(4.0F, (float)(-3 + var1), 0.0F);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      if (this.d) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.g.a(var7);
         this.m.a(var7);
         this.n.a(var7);
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
         this.m.a(var7);
         this.n.a(var7);
         this.h.a(var7);
         this.i.a(var7);
         this.j.a(var7);
         this.k.a(var7);
         this.l.a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.g.f = -(var5 / (180F / (float)Math.PI));
      this.g.g = var4 / (180F / (float)Math.PI);
      this.m.f = this.g.f;
      this.m.g = this.g.g;
      this.n.f = this.g.f;
      this.n.g = this.g.g;
      this.h.f = ((float)Math.PI / 2F);
      this.i.f = me.b(var1 * 0.6662F) * 1.4F * var2;
      this.j.f = me.b(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.k.h = var3;
      this.l.h = -var3;
   }
}
