package net.minecraft.client;

public class aac extends al {
   public acf g;
   public acf h;
   public acf i;
   public acf j;
   public acf k;
   public acf l;
   public acf m;

   public aac() {
      this(0.0F);
   }

   public aac(float var1) {
      byte var2 = 4;
      this.g = new acf(this, 0, 0);
      this.g.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.g.a(0.0F, (float)var2, 0.0F);
      this.h = new acf(this, 32, 0);
      this.h.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.h.a(0.0F, (float)var2, 0.0F);
      this.i = new acf(this, 16, 16);
      this.i.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.i.a(0.0F, (float)var2, 0.0F);
      this.j = new acf(this, 0, 16);
      this.j.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.j.a(-2.0F, (float)(12 + var2), 4.0F);
      this.k = new acf(this, 0, 16);
      this.k.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.k.a(2.0F, (float)(12 + var2), 4.0F);
      this.l = new acf(this, 0, 16);
      this.l.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.l.a(-2.0F, (float)(12 + var2), -4.0F);
      this.m = new acf(this, 0, 16);
      this.m.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.m.a(2.0F, (float)(12 + var2), -4.0F);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.g.a(var7);
      this.i.a(var7);
      this.j.a(var7);
      this.k.a(var7);
      this.l.a(var7);
      this.m.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.g.g = var4 / (180F / (float)Math.PI);
      this.g.f = var5 / (180F / (float)Math.PI);
      this.j.f = me.b(var1 * 0.6662F) * 1.4F * var2;
      this.k.f = me.b(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.l.f = me.b(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.m.f = me.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
