package net.minecraft.client;

import java.util.Random;

public class mu extends al {
   acf g;
   acf[] h = new acf[9];

   public mu() {
      byte var1 = -16;
      this.g = new acf(this, 0, 0);
      this.g.a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
      acf var10000 = this.g;
      var10000.d += (float)(24 + var1);
      Random var2 = new Random(1660L);

      for(int var3 = 0; var3 < this.h.length; ++var3) {
         this.h[var3] = new acf(this, 0, 0);
         float var4 = (((float)(var3 % 3) - (float)(var3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var5 = ((float)(var3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var6 = var2.nextInt(7) + 8;
         this.h[var3].a(-1.0F, 0.0F, -1.0F, 2, var6, 2);
         this.h[var3].c = var4;
         this.h[var3].e = var5;
         this.h[var3].d = (float)(31 + var1);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      for(int var7 = 0; var7 < this.h.length; ++var7) {
         this.h[var7].f = 0.2F * me.a(var3 * 0.3F + (float)var7) + 0.4F;
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
