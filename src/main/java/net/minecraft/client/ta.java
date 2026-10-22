package net.minecraft.client;

public class ta extends fa {
   public boolean t = false;
   public boolean u = false;

   public ta() {
      super(0.0F, -14.0F);
      float var1 = -14.0F;
      float var2 = 0.0F;
      this.h = new acf(this, 0, 16);
      this.h.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.h.a(0.0F, 0.0F + var1, 0.0F);
      this.i = new acf(this, 32, 16);
      this.i.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var2);
      this.i.a(0.0F, 0.0F + var1, 0.0F);
      this.j = new acf(this, 56, 0);
      this.j.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.j.a(-3.0F, 2.0F + var1, 0.0F);
      this.k = new acf(this, 56, 0);
      this.k.i = true;
      this.k.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.k.a(5.0F, 2.0F + var1, 0.0F);
      this.l = new acf(this, 56, 0);
      this.l.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.l.a(-2.0F, 12.0F + var1, 0.0F);
      this.m = new acf(this, 56, 0);
      this.m.i = true;
      this.m.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.m.a(2.0F, 12.0F + var1, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.g.j = true;
      float var7 = -14.0F;
      this.i.f = 0.0F;
      this.i.d = var7;
      this.i.e = 0.0F;
      acf var10000 = this.l;
      var10000.f -= 0.0F;
      var10000 = this.m;
      var10000.f -= 0.0F;
      var10000 = this.j;
      var10000.f = (float)((double)var10000.f * (double)0.5F);
      var10000 = this.k;
      var10000.f = (float)((double)var10000.f * (double)0.5F);
      var10000 = this.l;
      var10000.f = (float)((double)var10000.f * (double)0.5F);
      var10000 = this.m;
      var10000.f = (float)((double)var10000.f * (double)0.5F);
      float var8 = 0.4F;
      if (this.j.f > var8) {
         this.j.f = var8;
      }

      if (this.k.f > var8) {
         this.k.f = var8;
      }

      if (this.j.f < -var8) {
         this.j.f = -var8;
      }

      if (this.k.f < -var8) {
         this.k.f = -var8;
      }

      if (this.l.f > var8) {
         this.l.f = var8;
      }

      if (this.m.f > var8) {
         this.m.f = var8;
      }

      if (this.l.f < -var8) {
         this.l.f = -var8;
      }

      if (this.m.f < -var8) {
         this.m.f = -var8;
      }

      if (this.t) {
         this.j.f = -0.5F;
         this.k.f = -0.5F;
         this.j.h = 0.05F;
         this.k.h = -0.05F;
      }

      this.j.e = 0.0F;
      this.k.e = 0.0F;
      this.l.e = 0.0F;
      this.m.e = 0.0F;
      this.l.d = 9.0F + var7;
      this.m.d = 9.0F + var7;
      this.g.e = 0.0F;
      this.g.d = var7 + 1.0F;
      this.h.c = this.g.c;
      this.h.d = this.g.d;
      this.h.e = this.g.e;
      this.h.f = this.g.f;
      this.h.g = this.g.g;
      this.h.h = this.g.h;
      if (this.u) {
         float var9 = 1.0F;
         var10000 = this.g;
         var10000.d -= var9 * 5.0F;
      }

   }
}
