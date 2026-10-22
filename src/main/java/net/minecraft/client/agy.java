package net.minecraft.client;

public class agy extends al {
   acf[] g = new acf[8];
   acf h;

   public agy() {
      for(int var1 = 0; var1 < this.g.length; ++var1) {
         byte var2 = 0;
         int var3 = var1;
         if (var1 == 2) {
            var2 = 24;
            var3 = 10;
         } else if (var1 == 3) {
            var2 = 24;
            var3 = 19;
         }

         this.g[var1] = new acf(this, var2, var3);
         this.g[var1].a(-4.0F, (float)(16 + var1), -4.0F, 8, 1, 8);
      }

      this.h = new acf(this, 0, 16);
      this.h.a(-2.0F, 18.0F, -2.0F, 4, 4, 4);
   }

   public int a() {
      return 5;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void a(nq var1, float var2, float var3, float var4) {
      aea var5 = (aea)var1;
      float var6 = var5.c + (var5.b - var5.c) * var4;
      if (var6 < 0.0F) {
         var6 = 0.0F;
      }

      for(int var7 = 0; var7 < this.g.length; ++var7) {
         this.g[var7].d = (float)(-(4 - var7)) * var6 * 1.7F;
      }

   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.h.a(var7);

      for(int var8 = 0; var8 < this.g.length; ++var8) {
         this.g[var8].a(var7);
      }

   }
}
