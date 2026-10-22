package net.minecraft.client;

public class uj extends al {
   public acf g = (new acf(this)).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
   public acf h = (new acf(this)).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
   public acf i = (new acf(this)).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
   public acf j = (new acf(this)).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
   public acf k = (new acf(this)).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public acf l = (new acf(this)).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public acf m = (new acf(this)).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);

   public uj() {
      this.g.a(0.0F, 0.0F, -1.0F);
      this.h.a(0.0F, 0.0F, 1.0F);
      this.m.g = ((float)Math.PI / 2F);
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.g.a(var7);
      this.h.a(var7);
      this.m.a(var7);
      this.i.a(var7);
      this.j.a(var7);
      this.k.a(var7);
      this.l.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = (me.a(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.g.g = (float)Math.PI + var7;
      this.h.g = -var7;
      this.i.g = var7;
      this.j.g = -var7;
      this.k.g = var7 - var7 * 2.0F * var2;
      this.l.g = var7 - var7 * 2.0F * var3;
      this.i.c = me.a(var7);
      this.j.c = me.a(var7);
      this.k.c = me.a(var7);
      this.l.c = me.a(var7);
   }
}
