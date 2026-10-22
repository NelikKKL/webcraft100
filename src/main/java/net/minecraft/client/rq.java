package net.minecraft.client;

import java.util.Random;

public class rq extends bq {
   public int a;
   public float b;
   public float j;
   public float k;
   public float l;
   public float m;
   public float n;
   public float o;
   public float p;
   public float q;
   private static Random r = new Random();

   public void b() {
      super.b();
      this.n = this.m;
      this.p = this.o;
      vi var1 = this.c.a((double)((float)this.d + 0.5F), (double)((float)this.e + 0.5F), (double)((float)this.f + 0.5F), (double)3.0F);
      if (var1 != null) {
         double var2 = var1.s - (double)((float)this.d + 0.5F);
         double var4 = var1.u - (double)((float)this.f + 0.5F);
         this.q = (float)Math.atan2(var4, var2);
         this.m += 0.1F;
         if (this.m < 0.5F || r.nextInt(40) == 0) {
            float var6 = this.k;

            do {
               this.k += (float)(r.nextInt(4) - r.nextInt(4));
            } while(var6 == this.k);
         }
      } else {
         this.q += 0.02F;
         this.m -= 0.1F;
      }

      while(this.o >= (float)Math.PI) {
         this.o -= ((float)Math.PI * 2F);
      }

      while(this.o < -(float)Math.PI) {
         this.o += ((float)Math.PI * 2F);
      }

      while(this.q >= (float)Math.PI) {
         this.q -= ((float)Math.PI * 2F);
      }

      while(this.q < -(float)Math.PI) {
         this.q += ((float)Math.PI * 2F);
      }

      float var7;
      for(var7 = this.q - this.o; var7 >= (float)Math.PI; var7 -= ((float)Math.PI * 2F)) {
      }

      while(var7 < -(float)Math.PI) {
         var7 += ((float)Math.PI * 2F);
      }

      this.o += var7 * 0.4F;
      if (this.m < 0.0F) {
         this.m = 0.0F;
      }

      if (this.m > 1.0F) {
         this.m = 1.0F;
      }

      ++this.a;
      this.j = this.b;
      float var3 = (this.k - this.b) * 0.4F;
      float var8 = 0.2F;
      if (var3 < -var8) {
         var3 = -var8;
      }

      if (var3 > var8) {
         var3 = var8;
      }

      this.l += (var3 - this.l) * 0.9F;
      this.b += this.l;
   }
}
