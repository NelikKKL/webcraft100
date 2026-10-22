package net.minecraft.client;

public class bs extends ia {
   public int a = 0;
   private double b;
   private double c;
   private double d;
   private int e;
   private boolean f;

   public bs(ry var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   protected void b() {
   }

   public boolean a(double var1) {
      double var3 = this.C.c() * (double)4.0F;
      var3 *= (double)64.0F;
      return var1 < var3 * var3;
   }

   public bs(ry var1, double var2, double var4, double var6) {
      super(var1);
      this.e = 0;
      this.a(0.25F, 0.25F);
      this.d(var2, var4, var6);
      this.L = 0.0F;
   }

   public void a(double var1, int var3, double var4) {
      double var6 = var1 - this.s;
      double var8 = var4 - this.u;
      float var10 = me.a(var6 * var6 + var8 * var8);
      if (var10 > 12.0F) {
         this.b = this.s + var6 / (double)var10 * (double)12.0F;
         this.d = this.u + var8 / (double)var10 * (double)12.0F;
         this.c = this.t + (double)8.0F;
      } else {
         this.b = var1;
         this.c = (double)var3;
         this.d = var4;
      }

      this.e = 0;
      this.f = this.Y.nextInt(5) > 0;
   }

   public void a(double var1, double var3, double var5) {
      this.v = var1;
      this.w = var3;
      this.x = var5;
      if (this.B == 0.0F && this.A == 0.0F) {
         float var7 = me.a(var1 * var1 + var5 * var5);
         this.A = this.y = (float)(Math.atan2(var1, var5) * (double)180.0F / (double)(float)Math.PI);
         this.B = this.z = (float)(Math.atan2(var3, (double)var7) * (double)180.0F / (double)(float)Math.PI);
      }

   }

   public void a() {
      this.R = this.s;
      this.S = this.t;
      this.T = this.u;
      super.a();
      this.s += this.v;
      this.t += this.w;
      this.u += this.x;
      float var1 = me.a(this.v * this.v + this.x * this.x);
      this.y = (float)(Math.atan2(this.v, this.x) * (double)180.0F / (double)(float)Math.PI);

      for(this.z = (float)(Math.atan2(this.w, (double)var1) * (double)180.0F / (double)(float)Math.PI); this.z - this.B < -180.0F; this.B -= 360.0F) {
      }

      while(this.z - this.B >= 180.0F) {
         this.B += 360.0F;
      }

      while(this.y - this.A < -180.0F) {
         this.A -= 360.0F;
      }

      while(this.y - this.A >= 180.0F) {
         this.A += 360.0F;
      }

      this.z = this.B + (this.z - this.B) * 0.2F;
      this.y = this.A + (this.y - this.A) * 0.2F;
      if (!this.o.I) {
         double var2 = this.b - this.s;
         double var4 = this.d - this.u;
         float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
         float var7 = (float)Math.atan2(var4, var2);
         double var8 = (double)var1 + (double)(var6 - var1) * 0.0025;
         if (var6 < 1.0F) {
            var8 *= 0.8;
            this.w *= 0.8;
         }

         this.v = Math.cos((double)var7) * var8;
         this.x = Math.sin((double)var7) * var8;
         if (this.t < this.c) {
            this.w += ((double)1.0F - this.w) * (double)0.015F;
         } else {
            this.w += ((double)-1.0F - this.w) * (double)0.015F;
         }
      }

      float var10 = 0.25F;
      if (this.D()) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.o.a("bubble", this.s - this.v * (double)var10, this.t - this.w * (double)var10, this.u - this.x * (double)var10, this.v, this.w, this.x);
         }
      } else {
         this.o.a("portal", this.s - this.v * (double)var10 + this.Y.nextDouble() * 0.6 - 0.3, this.t - this.w * (double)var10 - (double)0.5F, this.u - this.x * (double)var10 + this.Y.nextDouble() * 0.6 - 0.3, this.v, this.w, this.x);
      }

      if (!this.o.I) {
         this.d(this.s, this.t, this.u);
         ++this.e;
         if (this.e > 80 && !this.o.I) {
            this.v();
            if (this.f) {
               this.o.a((ia)(new ih(this.o, this.s, this.t, this.u, new dk(acy.bz))));
            } else {
               this.o.g(2003, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), 0);
            }
         }
      }

   }

   public void a(ik var1) {
   }

   public void b(ik var1) {
   }

   public void a(vi var1) {
   }

   public float i_() {
      return 0.0F;
   }

   public float b(float var1) {
      return 1.0F;
   }

   public int a(float var1) {
      return 15728880;
   }
}
