package net.minecraft.client;

public class adm extends al {
   private acf[] g = new acf[12];
   private acf h;

   public adm() {
      for(int var1 = 0; var1 < this.g.length; ++var1) {
         this.g[var1] = new acf(this, 0, 16);
         this.g[var1].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      }

      this.h = new acf(this, 0, 0);
      this.h.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
   }

   public int a() {
      return 8;
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.h.a(var7);

      for(int var8 = 0; var8 < this.g.length; ++var8) {
         this.g[var8].a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var3 * (float)Math.PI * -0.1F;

      for(int var8 = 0; var8 < 4; ++var8) {
         this.g[var8].d = -2.0F + me.b(((float)(var8 * 2) + var3) * 0.25F);
         this.g[var8].c = me.b(var7) * 9.0F;
         this.g[var8].e = me.a(var7) * 9.0F;
         ++var7;
      }

      var7 = ((float)Math.PI / 4F) + var3 * (float)Math.PI * 0.03F;

      for(int var11 = 4; var11 < 8; ++var11) {
         this.g[var11].d = 2.0F + me.b(((float)(var11 * 2) + var3) * 0.25F);
         this.g[var11].c = me.b(var7) * 7.0F;
         this.g[var11].e = me.a(var7) * 7.0F;
         ++var7;
      }

      var7 = 0.47123894F + var3 * (float)Math.PI * -0.05F;

      for(int var12 = 8; var12 < 12; ++var12) {
         this.g[var12].d = 11.0F + me.b(((float)var12 * 1.5F + var3) * 0.5F);
         this.g[var12].c = me.b(var7) * 5.0F;
         this.g[var12].e = me.a(var7) * 5.0F;
         ++var7;
      }

      this.h.g = var4 / (180F / (float)Math.PI);
      this.h.f = var5 / (180F / (float)Math.PI);
   }
}
