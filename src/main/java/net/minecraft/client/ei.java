package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ei extends al {
   public acf g;
   public acf h;
   public acf i;
   public acf j;
   public acf k;
   public acf l;
   acf m;
   acf n;

   public ei() {
      float var1 = 0.0F;
      float var2 = 13.5F;
      this.g = new acf(this, 0, 0);
      this.g.a(-3.0F, -3.0F, -2.0F, 6, 6, 4, var1);
      this.g.a(-1.0F, var2, -7.0F);
      this.h = new acf(this, 18, 14);
      this.h.a(-4.0F, -2.0F, -3.0F, 6, 9, 6, var1);
      this.h.a(0.0F, 14.0F, 2.0F);
      this.n = new acf(this, 21, 0);
      this.n.a(-4.0F, -3.0F, -3.0F, 8, 6, 7, var1);
      this.n.a(-1.0F, 14.0F, 2.0F);
      this.i = new acf(this, 0, 18);
      this.i.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.i.a(-2.5F, 16.0F, 7.0F);
      this.j = new acf(this, 0, 18);
      this.j.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.j.a(0.5F, 16.0F, 7.0F);
      this.k = new acf(this, 0, 18);
      this.k.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.k.a(-2.5F, 16.0F, -4.0F);
      this.l = new acf(this, 0, 18);
      this.l.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.l.a(0.5F, 16.0F, -4.0F);
      this.m = new acf(this, 9, 18);
      this.m.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.m.a(-1.0F, 12.0F, 8.0F);
      this.g.a(16, 14).a(-3.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.g.a(16, 14).a(1.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.g.a(0, 10).a(-1.5F, 0.0F, -5.0F, 3, 3, 4, var1);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(var2, var3, var4, var5, var6, var7);
      if (this.d) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.g.b(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.h.a(var7);
         this.i.a(var7);
         this.j.a(var7);
         this.k.a(var7);
         this.l.a(var7);
         this.m.b(var7);
         this.n.a(var7);
         GL11.glPopMatrix();
      } else {
         this.g.b(var7);
         this.h.a(var7);
         this.i.a(var7);
         this.j.a(var7);
         this.k.a(var7);
         this.l.a(var7);
         this.m.b(var7);
         this.n.a(var7);
      }

   }

   public void a(nq var1, float var2, float var3, float var4) {
      aik var5 = (aik)var1;
      if (var5.aF()) {
         this.m.g = 0.0F;
      } else {
         this.m.g = me.b(var2 * 0.6662F) * 1.4F * var3;
      }

      if (var5.aE()) {
         this.n.a(-1.0F, 16.0F, -3.0F);
         this.n.f = 1.2566371F;
         this.n.g = 0.0F;
         this.h.a(0.0F, 18.0F, 0.0F);
         this.h.f = ((float)Math.PI / 4F);
         this.m.a(-1.0F, 21.0F, 6.0F);
         this.i.a(-2.5F, 22.0F, 2.0F);
         this.i.f = ((float)Math.PI * 1.5F);
         this.j.a(0.5F, 22.0F, 2.0F);
         this.j.f = ((float)Math.PI * 1.5F);
         this.k.f = 5.811947F;
         this.k.a(-2.49F, 17.0F, -4.0F);
         this.l.f = 5.811947F;
         this.l.a(0.51F, 17.0F, -4.0F);
      } else {
         this.h.a(0.0F, 14.0F, 2.0F);
         this.h.f = ((float)Math.PI / 2F);
         this.n.a(-1.0F, 14.0F, -3.0F);
         this.n.f = this.h.f;
         this.m.a(-1.0F, 12.0F, 8.0F);
         this.i.a(-2.5F, 16.0F, 7.0F);
         this.j.a(0.5F, 16.0F, 7.0F);
         this.k.a(-2.5F, 16.0F, -4.0F);
         this.l.a(0.5F, 16.0F, -4.0F);
         this.i.f = me.b(var2 * 0.6662F) * 1.4F * var3;
         this.j.f = me.b(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
         this.k.f = me.b(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
         this.l.f = me.b(var2 * 0.6662F) * 1.4F * var3;
      }

      float var6 = var5.h(var4) + var5.e(var4, 0.0F);
      this.g.h = var6;
      this.n.h = var5.e(var4, -0.08F);
      this.h.h = var5.e(var4, -0.16F);
      this.m.h = var5.e(var4, -0.2F);
      if (var5.ax()) {
         float var7 = var5.b(var4) * var5.g(var4);
         GL11.glColor3f(var7, var7, var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.g.f = var5 / (180F / (float)Math.PI);
      this.g.g = var4 / (180F / (float)Math.PI);
      this.m.f = var3;
   }
}
