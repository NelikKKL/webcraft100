package net.minecraft.client;

public class zf extends al {
   public acf g;
   public acf h;
   public acf i;
   public acf j;
   public acf k;
   public int l;
   public int m;
   public boolean n;
   public boolean o;

   public zf() {
      this(0.0F);
   }

   public zf(float var1) {
      this(var1, 0.0F);
   }

   public zf(float var1, float var2) {
      this.l = 0;
      this.m = 0;
      this.n = false;
      this.o = false;
      byte var3 = 64;
      byte var4 = 64;
      this.g = (new acf(this)).b(var3, var4);
      this.g.a(0.0F, 0.0F + var2, 0.0F);
      this.g.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      this.g.a(24, 0).a(-1.0F, -3.0F, -6.0F, 2, 4, 2, var1);
      this.h = (new acf(this)).b(var3, var4);
      this.h.a(0.0F, 0.0F + var2, 0.0F);
      this.h.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.h.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.5F);
      this.i = (new acf(this)).b(var3, var4);
      this.i.a(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.i.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.i.a(44, 22).a(4.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.i.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8, 4, 4, var1);
      this.j = (new acf(this, 0, 22)).b(var3, var4);
      this.j.a(-2.0F, 12.0F + var2, 0.0F);
      this.j.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.k = (new acf(this, 0, 22)).b(var3, var4);
      this.k.i = true;
      this.k.a(2.0F, 12.0F + var2, 0.0F);
      this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.g.a(var7);
      this.h.a(var7);
      this.j.a(var7);
      this.k.a(var7);
      this.i.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.g.g = var4 / (180F / (float)Math.PI);
      this.g.f = var5 / (180F / (float)Math.PI);
      this.i.d = 3.0F;
      this.i.e = -1.0F;
      this.i.f = -0.75F;
      this.j.f = me.b(var1 * 0.6662F) * 1.4F * var2 * 0.5F;
      this.k.f = me.b(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 * 0.5F;
      this.j.g = 0.0F;
      this.k.g = 0.0F;
   }
}
