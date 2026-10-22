package net.minecraft.client;

public class yu extends dt {
   protected float[] g = new float[256];
   protected float[] h = new float[256];
   protected float[] i = new float[256];
   protected float[] j = new float[256];

   public yu() {
      super(yy.C.bL);
   }

   public void a() {
      for(int var1 = 0; var1 < 16; ++var1) {
         for(int var2 = 0; var2 < 16; ++var2) {
            float var3 = 0.0F;
            int var4 = (int)(me.a((float)var2 * (float)Math.PI * 2.0F / 16.0F) * 1.2F);
            int var5 = (int)(me.a((float)var1 * (float)Math.PI * 2.0F / 16.0F) * 1.2F);

            for(int var6 = var1 - 1; var6 <= var1 + 1; ++var6) {
               for(int var7 = var2 - 1; var7 <= var2 + 1; ++var7) {
                  int var8 = var6 + var4 & 15;
                  int var9 = var7 + var5 & 15;
                  var3 += this.g[var8 + var9 * 16];
               }
            }

            this.h[var1 + var2 * 16] = var3 / 10.0F + (this.i[(var1 + 0 & 15) + (var2 + 0 & 15) * 16] + this.i[(var1 + 1 & 15) + (var2 + 0 & 15) * 16] + this.i[(var1 + 1 & 15) + (var2 + 1 & 15) * 16] + this.i[(var1 + 0 & 15) + (var2 + 1 & 15) * 16]) / 4.0F * 0.8F;
            float[] var10000 = this.i;
            var10000[var1 + var2 * 16] += this.j[var1 + var2 * 16] * 0.01F;
            if (this.i[var1 + var2 * 16] < 0.0F) {
               this.i[var1 + var2 * 16] = 0.0F;
            }

            var10000 = this.j;
            var10000[var1 + var2 * 16] -= 0.06F;
            if (Math.random() < 0.005) {
               this.j[var1 + var2 * 16] = 1.5F;
            }
         }
      }

      float[] var11 = this.h;
      this.h = this.g;
      this.g = var11;

      for(int var12 = 0; var12 < 256; ++var12) {
         float var13 = this.g[var12] * 2.0F;
         if (var13 > 1.0F) {
            var13 = 1.0F;
         }

         if (var13 < 0.0F) {
            var13 = 0.0F;
         }

         int var14 = (int)(var13 * 100.0F + 155.0F);
         int var15 = (int)(var13 * var13 * 255.0F);
         int var16 = (int)(var13 * var13 * var13 * var13 * 128.0F);
         if (this.c) {
            int var17 = (var14 * 30 + var15 * 59 + var16 * 11) / 100;
            int var18 = (var14 * 30 + var15 * 70) / 100;
            int var10 = (var14 * 30 + var16 * 70) / 100;
            var14 = var17;
            var15 = var18;
            var16 = var10;
         }

         this.a[var12 * 4 + 0] = (byte)var14;
         this.a[var12 * 4 + 1] = (byte)var15;
         this.a[var12 * 4 + 2] = (byte)var16;
         this.a[var12 * 4 + 3] = -1;
      }

   }
}
