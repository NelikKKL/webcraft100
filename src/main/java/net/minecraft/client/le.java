package net.minecraft.client;

public class le extends fa {
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      float var7 = me.a(this.a * (float)Math.PI);
      float var8 = me.a((1.0F - (1.0F - this.a) * (1.0F - this.a)) * (float)Math.PI);
      this.j.h = 0.0F;
      this.k.h = 0.0F;
      this.j.g = -(0.1F - var7 * 0.6F);
      this.k.g = 0.1F - var7 * 0.6F;
      this.j.f = (-(float)Math.PI / 2F);
      this.k.f = (-(float)Math.PI / 2F);
      acf var10000 = this.j;
      var10000.f -= var7 * 1.2F - var8 * 0.4F;
      var10000 = this.k;
      var10000.f -= var7 * 1.2F - var8 * 0.4F;
      var10000 = this.j;
      var10000.h += me.b(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.k;
      var10000.h -= me.b(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.j;
      var10000.f += me.a(var3 * 0.067F) * 0.05F;
      var10000 = this.k;
      var10000.f -= me.a(var3 * 0.067F) * 0.05F;
   }
}
