package net.minecraft.client;

public class pv {
   public fs[] a;
   public int b;
   private boolean c;

   public pv(fs[] var1) {
      this.b = 0;
      this.c = false;
      this.a = var1;
      this.b = var1.length;
   }

   public pv(fs[] var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this(var1);
      float var8 = 0.0F / var6;
      float var9 = 0.0F / var7;
      var1[0] = var1[0].a((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].a((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].a((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].a((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   public void a() {
      fs[] var1 = new fs[this.a.length];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1[var2] = this.a[this.a.length - var2 - 1];
      }

      this.a = var1;
   }

   public void a(cv var1, float var2) {
      fb var3 = this.a[1].a.a(this.a[0].a);
      fb var4 = this.a[1].a.a(this.a[2].a);
      fb var5 = var4.c(var3).c();
      var1.b();
      if (this.c) {
         var1.b(-((float)var5.a), -((float)var5.b), -((float)var5.c));
      } else {
         var1.b((float)var5.a, (float)var5.b, (float)var5.c);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         fs var7 = this.a[var6];
         var1.a((double)((float)var7.a.a * var2), (double)((float)var7.a.b * var2), (double)((float)var7.a.c * var2), (double)var7.b, (double)var7.c);
      }

      var1.a();
   }
}
