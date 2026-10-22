package net.minecraft.client;

public class aij {
   float a;
   private double f;
   public int b;
   public float c;
   public float d = 1.0F;
   public float e = 0.0F;
   private long g;
   private long h;
   private long i;
   private double j = (double)1.0F;

   public aij(float var1) {
      this.a = var1;
      this.g = System.currentTimeMillis();
      this.h = System.nanoTime() / 1000000L;
   }

   public void a() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.g;
      long var5 = System.nanoTime() / 1000000L;
      double var7 = (double)var5 / (double)1000.0F;
      if (var3 > 1000L) {
         this.f = var7;
      } else if (var3 < 0L) {
         this.f = var7;
      } else {
         this.i += var3;
         if (this.i > 1000L) {
            long var9 = var5 - this.h;
            double var11 = (double)this.i / (double)var9;
            this.j += (var11 - this.j) * (double)0.2F;
            this.h = var5;
            this.i = 0L;
         }

         if (this.i < 0L) {
            this.h = var5;
         }
      }

      this.g = var1;
      double var13 = (var7 - this.f) * this.j;
      this.f = var7;
      if (var13 < (double)0.0F) {
         var13 = (double)0.0F;
      }

      if (var13 > (double)1.0F) {
         var13 = (double)1.0F;
      }

      this.e = (float)((double)this.e + var13 * (double)this.d * (double)this.a);
      this.b = (int)this.e;
      this.e -= (float)this.b;
      if (this.b > 10) {
         this.b = 10;
      }

      this.c = this.e;
   }
}
