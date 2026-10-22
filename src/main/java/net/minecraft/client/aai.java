package net.minecraft.client;

public class aai extends al {
   public acf g;
   public acf h;
   public acf i;
   public acf j;
   public acf k;

   public aai() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.i = (new acf(this, 0, 0)).b(64, 64);
      this.i.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.i.a(0.0F, 0.0F + var1, 0.0F);
      this.j = (new acf(this, 32, 0)).b(64, 64);
      this.j.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.j.a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.k = (new acf(this, 32, 0)).b(64, 64);
      this.k.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.k.a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.g = (new acf(this, 0, 16)).b(64, 64);
      this.g.a(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.g.a(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      this.h = (new acf(this, 0, 36)).b(64, 64);
      this.h.a(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.h.a(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.i.g = var4 / (180F / (float)Math.PI);
      this.i.f = var5 / (180F / (float)Math.PI);
      this.g.g = var4 / (180F / (float)Math.PI) * 0.25F;
      float var7 = me.a(this.g.g);
      float var8 = me.b(this.g.g);
      this.j.h = 1.0F;
      this.k.h = -1.0F;
      this.j.g = 0.0F + this.g.g;
      this.k.g = (float)Math.PI + this.g.g;
      this.j.c = var8 * 5.0F;
      this.j.e = -var7 * 5.0F;
      this.k.c = -var8 * 5.0F;
      this.k.e = var7 * 5.0F;
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.g.a(var7);
      this.h.a(var7);
      this.i.a(var7);
      this.j.a(var7);
      this.k.a(var7);
   }
}
