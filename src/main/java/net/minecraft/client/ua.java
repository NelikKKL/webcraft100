package net.minecraft.client;

public class ua extends al {
   public acf[] g = new acf[5];

   public ua() {
      this.g[0] = new acf(this, 0, 8);
      this.g[1] = new acf(this, 0, 0);
      this.g[2] = new acf(this, 0, 0);
      this.g[3] = new acf(this, 0, 0);
      this.g[4] = new acf(this, 0, 0);
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.g[0].a((float)(-var1 / 2), (float)(-var3 / 2 + 2), -3.0F, var1, var3 - 4, 4, 0.0F);
      this.g[0].a(0.0F, (float)(0 + var4), 0.0F);
      this.g[1].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.g[1].a((float)(-var1 / 2 + 1), (float)(0 + var4), 0.0F);
      this.g[2].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.g[2].a((float)(var1 / 2 - 1), (float)(0 + var4), 0.0F);
      this.g[3].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.g[3].a(0.0F, (float)(0 + var4), (float)(-var3 / 2 + 1));
      this.g[4].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.g[4].a(0.0F, (float)(0 + var4), (float)(var3 / 2 - 1));
      this.g[0].f = ((float)Math.PI / 2F);
      this.g[1].g = ((float)Math.PI * 1.5F);
      this.g[2].g = ((float)Math.PI / 2F);
      this.g[3].g = (float)Math.PI;
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      for(int var8 = 0; var8 < 5; ++var8) {
         this.g[var8].a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
   }
}
