package net.minecraft.client;

public class op extends al {
   acf g;
   acf[] h = new acf[8];

   public op() {
      byte var1 = -16;
      this.g = new acf(this, 0, 0);
      this.g.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      acf var10000 = this.g;
      var10000.d += (float)(24 + var1);

      for(int var2 = 0; var2 < this.h.length; ++var2) {
         this.h[var2] = new acf(this, 48, 0);
         double var3 = (double)var2 * Math.PI * (double)2.0F / (double)this.h.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.h[var2].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.h[var2].c = var5;
         this.h[var2].e = var6;
         this.h[var2].d = (float)(31 + var1);
         var3 = (double)var2 * Math.PI * (double)-2.0F / (double)this.h.length + (Math.PI / 2D);
         this.h[var2].g = (float)var3;
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      for(int var7 = 0; var7 < this.h.length; ++var7) {
         this.h[var7].f = var3;
      }

   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.g.a(var7);

      for(int var8 = 0; var8 < this.h.length; ++var8) {
         this.h[var8].a(var7);
      }

   }
}
