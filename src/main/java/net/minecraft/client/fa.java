package net.minecraft.client;

public class fa extends al {
   public acf g;
   public acf h;
   public acf i;
   public acf j;
   public acf k;
   public acf l;
   public acf m;
   public acf n;
   public acf o;
   public int p;
   public int q;
   public boolean r;
   public boolean s;

   public fa() {
      this(0.0F);
   }

   public fa(float var1) {
      this(var1, 0.0F);
   }

   public fa(float var1, float var2) {
      this.p = 0;
      this.q = 0;
      this.r = false;
      this.s = false;
      this.o = new acf(this, 0, 0);
      this.o.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, var1);
      this.n = new acf(this, 24, 0);
      this.n.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, var1);
      this.g = new acf(this, 0, 0);
      this.g.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.g.a(0.0F, 0.0F + var2, 0.0F);
      this.h = new acf(this, 32, 0);
      this.h.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.h.a(0.0F, 0.0F + var2, 0.0F);
      this.i = new acf(this, 16, 16);
      this.i.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.i.a(0.0F, 0.0F + var2, 0.0F);
      this.j = new acf(this, 40, 16);
      this.j.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.j.a(-5.0F, 2.0F + var2, 0.0F);
      this.k = new acf(this, 40, 16);
      this.k.i = true;
      this.k.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.k.a(5.0F, 2.0F + var2, 0.0F);
      this.l = new acf(this, 0, 16);
      this.l.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.l.a(-2.0F, 12.0F + var2, 0.0F);
      this.m = new acf(this, 0, 16);
      this.m.i = true;
      this.m.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.m.a(2.0F, 12.0F + var2, 0.0F);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.g.a(var7);
      this.i.a(var7);
      this.j.a(var7);
      this.k.a(var7);
      this.l.a(var7);
      this.m.a(var7);
      this.h.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.g.g = var4 / (180F / (float)Math.PI);
      this.g.f = var5 / (180F / (float)Math.PI);
      this.h.g = this.g.g;
      this.h.f = this.g.f;
      this.j.f = me.b(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
      this.k.f = me.b(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.j.h = 0.0F;
      this.k.h = 0.0F;
      this.l.f = me.b(var1 * 0.6662F) * 1.4F * var2;
      this.m.f = me.b(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.l.g = 0.0F;
      this.m.g = 0.0F;
      if (this.b) {
         acf var10000 = this.j;
         var10000.f += (-(float)Math.PI / 5F);
         var10000 = this.k;
         var10000.f += (-(float)Math.PI / 5F);
         this.l.f = -1.2566371F;
         this.m.f = -1.2566371F;
         this.l.g = ((float)Math.PI / 10F);
         this.m.g = (-(float)Math.PI / 10F);
      }

      if (this.p != 0) {
         this.k.f = this.k.f * 0.5F - ((float)Math.PI / 10F) * (float)this.p;
      }

      if (this.q != 0) {
         this.j.f = this.j.f * 0.5F - ((float)Math.PI / 10F) * (float)this.q;
      }

      this.j.g = 0.0F;
      this.k.g = 0.0F;
      if (this.a > -9990.0F) {
         float var7 = this.a;
         this.i.g = me.a(me.c(var7) * (float)Math.PI * 2.0F) * 0.2F;
         this.j.e = me.a(this.i.g) * 5.0F;
         this.j.c = -me.b(this.i.g) * 5.0F;
         this.k.e = -me.a(this.i.g) * 5.0F;
         this.k.c = me.b(this.i.g) * 5.0F;
         acf var17 = this.j;
         var17.g += this.i.g;
         var17 = this.k;
         var17.g += this.i.g;
         var17 = this.k;
         var17.f += this.i.g;
         var7 = 1.0F - this.a;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         float var8 = me.a(var7 * (float)Math.PI);
         float var9 = me.a(this.a * (float)Math.PI) * -(this.g.f - 0.7F) * 0.75F;
         var17 = this.j;
         var17.f = (float)((double)var17.f - ((double)var8 * 1.2 + (double)var9));
         var17 = this.j;
         var17.g += this.i.g * 2.0F;
         this.j.h = me.a(this.a * (float)Math.PI) * -0.4F;
      }

      if (this.r) {
         this.i.f = 0.5F;
         acf var22 = this.l;
         var22.f -= 0.0F;
         var22 = this.m;
         var22.f -= 0.0F;
         var22 = this.j;
         var22.f += 0.4F;
         var22 = this.k;
         var22.f += 0.4F;
         this.l.e = 4.0F;
         this.m.e = 4.0F;
         this.l.d = 9.0F;
         this.m.d = 9.0F;
         this.g.d = 1.0F;
      } else {
         this.i.f = 0.0F;
         this.l.e = 0.0F;
         this.m.e = 0.0F;
         this.l.d = 12.0F;
         this.m.d = 12.0F;
         this.g.d = 0.0F;
      }

      acf var26 = this.j;
      var26.h += me.b(var3 * 0.09F) * 0.05F + 0.05F;
      var26 = this.k;
      var26.h -= me.b(var3 * 0.09F) * 0.05F + 0.05F;
      var26 = this.j;
      var26.f += me.a(var3 * 0.067F) * 0.05F;
      var26 = this.k;
      var26.f -= me.a(var3 * 0.067F) * 0.05F;
      if (this.s) {
         float var14 = 0.0F;
         float var15 = 0.0F;
         this.j.h = 0.0F;
         this.k.h = 0.0F;
         this.j.g = -(0.1F - var14 * 0.6F) + this.g.g;
         this.k.g = 0.1F - var14 * 0.6F + this.g.g + 0.4F;
         this.j.f = (-(float)Math.PI / 2F) + this.g.f;
         this.k.f = (-(float)Math.PI / 2F) + this.g.f;
         var26 = this.j;
         var26.f -= var14 * 1.2F - var15 * 0.4F;
         var26 = this.k;
         var26.f -= var14 * 1.2F - var15 * 0.4F;
         var26 = this.j;
         var26.h += me.b(var3 * 0.09F) * 0.05F + 0.05F;
         var26 = this.k;
         var26.h -= me.b(var3 * 0.09F) * 0.05F + 0.05F;
         var26 = this.j;
         var26.f += me.a(var3 * 0.067F) * 0.05F;
         var26 = this.k;
         var26.f -= me.a(var3 * 0.067F) * 0.05F;
      }

   }

   public void a(float var1) {
      this.n.g = this.g.g;
      this.n.f = this.g.f;
      this.n.c = 0.0F;
      this.n.d = 0.0F;
      this.n.a(var1);
   }

   public void b(float var1) {
      this.o.a(var1);
   }
}
