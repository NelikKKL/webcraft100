package net.minecraft.client;

public class ol extends k {
   public void b() {
      this.b = new bx(sr.k, 0.5F, 0.0F);
      this.g = 1;
      this.e = true;
      this.c = true;
   }

   public ej c() {
      return new a(this.a, this.a.t());
   }

   public float a(long var1, float var3) {
      return 0.0F;
   }

   public float[] a(float var1, float var2) {
      return null;
   }

   public fb b(float var1, float var2) {
      int var3 = 8421536;
      float var4 = me.b(var1 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;
      if (var4 < 0.0F) {
         var4 = 0.0F;
      }

      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      float var5 = (float)(var3 >> 16 & 255) / 255.0F;
      float var6 = (float)(var3 >> 8 & 255) / 255.0F;
      float var7 = (float)(var3 & 255) / 255.0F;
      var5 *= var4 * 0.0F + 0.15F;
      var6 *= var4 * 0.0F + 0.15F;
      var7 *= var4 * 0.0F + 0.15F;
      return fb.b((double)var5, (double)var6, (double)var7);
   }

   public boolean f() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public float e() {
      return 8.0F;
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.a(var1, var2);
      return var3 == 0 ? false : yy.k[var3].bZ.d();
   }

   public dh g() {
      return new dh(100, 50, 0);
   }
}
