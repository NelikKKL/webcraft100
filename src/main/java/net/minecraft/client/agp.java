package net.minecraft.client;

public class agp extends dt {
   protected float[] g = new float[320];
   protected float[] h = new float[320];

   public agp(int var1) {
      super(yy.ar.bL + var1 * 16);
   }

   public void a() {
      for(int var1 = 0; var1 < 16; ++var1) {
         for(int var2 = 0; var2 < 20; ++var2) {
            int var3 = 18;
            float var4 = this.g[var1 + (var2 + 1) % 20 * 16] * (float)var3;

            for(int var5 = var1 - 1; var5 <= var1 + 1; ++var5) {
               for(int var6 = var2; var6 <= var2 + 1; ++var6) {
                  if (var5 >= 0 && var6 >= 0 && var5 < 16 && var6 < 20) {
                     var4 += this.g[var5 + var6 * 16];
                  }

                  ++var3;
               }
            }

            this.h[var1 + var2 * 16] = var4 / ((float)var3 * 1.06F);
            if (var2 >= 19) {
               this.h[var1 + var2 * 16] = (float)(Math.random() * Math.random() * Math.random() * (double)4.0F + Math.random() * (double)0.1F + (double)0.2F);
            }
         }
      }

      float[] var12 = this.h;
      this.h = this.g;
      this.g = var12;

      for(int var13 = 0; var13 < 256; ++var13) {
         float var14 = this.g[var13] * 1.8F;
         if (var14 > 1.0F) {
            var14 = 1.0F;
         }

         if (var14 < 0.0F) {
            var14 = 0.0F;
         }

         int var16 = (int)(var14 * 155.0F + 100.0F);
         int var17 = (int)(var14 * var14 * 255.0F);
         int var7 = (int)(var14 * var14 * var14 * var14 * var14 * var14 * var14 * var14 * var14 * var14 * 255.0F);
         short var8 = 255;
         if (var14 < 0.5F) {
            var8 = 0;
         }

         float var15 = (var14 - 0.5F) * 2.0F;
         if (this.c) {
            int var9 = (var16 * 30 + var17 * 59 + var7 * 11) / 100;
            int var10 = (var16 * 30 + var17 * 70) / 100;
            int var11 = (var16 * 30 + var7 * 70) / 100;
            var16 = var9;
            var17 = var10;
            var7 = var11;
         }

         this.a[var13 * 4 + 0] = (byte)var16;
         this.a[var13 * 4 + 1] = (byte)var17;
         this.a[var13 * 4 + 2] = (byte)var7;
         this.a[var13 * 4 + 3] = (byte)var8;
      }

   }
}
