package net.minecraft.client;

public class yv extends dn {
   public float a = 0.0F;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d = 0.0F;
   public float e = 0.0F;
   public float f = 0.0F;
   public float g = 0.0F;
   public float bz = 0.0F;
   private float bA = 0.0F;
   private float bB = 0.0F;
   private float bC = 0.0F;
   private float bD = 0.0F;
   private float bE = 0.0F;
   private float bF = 0.0F;

   public yv(ry var1) {
      super(var1);
      this.aA = "/mob/squid.png";
      this.a(0.95F, 0.95F);
      this.bB = 1.0F / (this.Y.nextFloat() + 1.0F) * 0.2F;
   }

   public int f_() {
      return 10;
   }

   public void a(ik var1) {
      super.a(var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected String e() {
      return null;
   }

   protected String f() {
      return null;
   }

   protected String g() {
      return null;
   }

   protected float w_() {
      return 0.4F;
   }

   protected int k() {
      return 0;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.Y.nextInt(3 + var2) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.a(new dk(acy.aV, 1, 0), 0.0F);
      }

   }

   public boolean c(vi var1) {
      return super.c(var1);
   }

   public boolean D() {
      return this.o.a(this.C.b((double)0.0F, (double)-0.6F, (double)0.0F), net.minecraft.client.p.g, this);
   }

   public void c() {
      super.c();
      this.b = this.a;
      this.d = this.c;
      this.f = this.e;
      this.bz = this.g;
      this.e += this.bB;
      if (this.e > ((float)Math.PI * 2F)) {
         this.e -= ((float)Math.PI * 2F);
         if (this.Y.nextInt(10) == 0) {
            this.bB = 1.0F / (this.Y.nextFloat() + 1.0F) * 0.2F;
         }
      }

      if (this.D()) {
         if (this.e < (float)Math.PI) {
            float var1 = this.e / (float)Math.PI;
            this.g = me.a(var1 * var1 * (float)Math.PI) * (float)Math.PI * 0.25F;
            if ((double)var1 > (double)0.75F) {
               this.bA = 1.0F;
               this.bC = 1.0F;
            } else {
               this.bC *= 0.8F;
            }
         } else {
            this.g = 0.0F;
            this.bA *= 0.9F;
            this.bC *= 0.99F;
         }

         if (!this.aH) {
            this.v = (double)(this.bD * this.bA);
            this.w = (double)(this.bE * this.bA);
            this.x = (double)(this.bF * this.bA);
         }

         float var2 = me.a(this.v * this.v + this.x * this.x);
         this.at += (-((float)Math.atan2(this.v, this.x)) * 180.0F / (float)Math.PI - this.at) * 0.1F;
         this.y = this.at;
         this.c += (float)Math.PI * this.bC * 1.5F;
         this.a += (-((float)Math.atan2((double)var2, this.w)) * 180.0F / (float)Math.PI - this.a) * 0.1F;
      } else {
         this.g = me.e(me.a(this.e)) * (float)Math.PI * 0.25F;
         if (!this.aH) {
            this.v = (double)0.0F;
            this.w -= 0.08;
            this.w *= (double)0.98F;
            this.x = (double)0.0F;
         }

         this.a = (float)((double)this.a + (double)(-90.0F - this.a) * 0.02);
      }

   }

   public void d(float var1, float var2) {
      this.b(this.v, this.w, this.x);
   }

   protected void n() {
      ++this.bq;
      if (this.bq > 100) {
         this.bD = this.bE = this.bF = 0.0F;
      } else if (this.Y.nextInt(50) == 0 || !this.ab || this.bD == 0.0F && this.bE == 0.0F && this.bF == 0.0F) {
         float var1 = this.Y.nextFloat() * (float)Math.PI * 2.0F;
         this.bD = me.b(var1) * 0.2F;
         this.bE = -0.1F + this.Y.nextFloat() * 0.2F;
         this.bF = me.a(var1) * 0.2F;
      }

      this.al();
   }

   public boolean i() {
      return this.t > (double)45.0F && this.t < (double)this.o.e && super.i();
   }
}
