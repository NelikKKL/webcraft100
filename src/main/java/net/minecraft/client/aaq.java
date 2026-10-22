package net.minecraft.client;

public class aaq extends al {
   private acf[] g = new acf[7];
   private acf[] h;
   private float[] i = new float[7];
   private static final int[][] j = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] k = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public aaq() {
      float var1 = -3.5F;

      for(int var2 = 0; var2 < this.g.length; ++var2) {
         this.g[var2] = new acf(this, k[var2][0], k[var2][1]);
         this.g[var2].a((float)j[var2][0] * -0.5F, 0.0F, (float)j[var2][2] * -0.5F, j[var2][0], j[var2][1], j[var2][2]);
         this.g[var2].a(0.0F, (float)(24 - j[var2][1]), var1);
         this.i[var2] = var1;
         if (var2 < this.g.length - 1) {
            var1 += (float)(j[var2][2] + j[var2 + 1][2]) * 0.5F;
         }
      }

      this.h = new acf[3];
      this.h[0] = new acf(this, 20, 0);
      this.h[0].a(-5.0F, 0.0F, (float)j[2][2] * -0.5F, 10, 8, j[2][2]);
      this.h[0].a(0.0F, 16.0F, this.i[2]);
      this.h[1] = new acf(this, 20, 11);
      this.h[1].a(-3.0F, 0.0F, (float)j[4][2] * -0.5F, 6, 4, j[4][2]);
      this.h[1].a(0.0F, 20.0F, this.i[4]);
      this.h[2] = new acf(this, 20, 18);
      this.h[2].a(-3.0F, 0.0F, (float)j[4][2] * -0.5F, 6, 5, j[1][2]);
      this.h[2].a(0.0F, 19.0F, this.i[1]);
   }

   public int a() {
      return 38;
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);

      for(int var8 = 0; var8 < this.g.length; ++var8) {
         this.g[var8].a(var7);
      }

      for(int var9 = 0; var9 < this.h.length; ++var9) {
         this.h[var9].a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      for(int var7 = 0; var7 < this.g.length; ++var7) {
         this.g[var7].g = me.b(var3 * 0.9F + (float)var7 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(var7 - 2));
         this.g[var7].c = me.a(var3 * 0.9F + (float)var7 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(var7 - 2);
      }

      this.h[0].g = this.g[2].g;
      this.h[1].g = this.g[4].g;
      this.h[1].c = this.g[4].c;
      this.h[2].g = this.g[1].g;
      this.h[2].c = this.g[1].c;
   }
}
