package net.minecraft.client;

public class dd extends ia {
   public int a;

   public dd(ry var1) {
      super(var1);
      this.a = 0;
      this.l = true;
      this.a(0.98F, 0.98F);
      this.L = this.N / 2.0F;
   }

   public dd(ry var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4, var6);
      float var8 = (float)(Math.random() * (double)(float)Math.PI * (double)2.0F);
      this.v = (double)(-me.a(var8 * (float)Math.PI / 180.0F) * 0.02F);
      this.w = (double)0.2F;
      this.x = (double)(-me.b(var8 * (float)Math.PI / 180.0F) * 0.02F);
      this.a = 80;
      this.p = var2;
      this.q = var4;
      this.r = var6;
   }

   protected void b() {
   }

   protected boolean d_() {
      return false;
   }

   public boolean e_() {
      return !this.K;
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      this.w -= (double)0.04F;
      this.b(this.v, this.w, this.x);
      this.v *= (double)0.98F;
      this.w *= (double)0.98F;
      this.x *= (double)0.98F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
         this.w *= (double)-0.5F;
      }

      if (this.a-- <= 0) {
         if (!this.o.I) {
            this.v();
            this.g();
         } else {
            this.v();
         }
      } else {
         this.o.a("smoke", this.s, this.t + (double)0.5F, this.u, (double)0.0F, (double)0.0F, (double)0.0F);
      }

   }

   private void g() {
      float var1 = 4.0F;
      this.o.a((ia)null, this.s, this.t, this.u, var1);
   }

   protected void a(ik var1) {
      var1.a("Fuse", (byte)this.a);
   }

   protected void b(ik var1) {
      this.a = var1.c("Fuse");
   }

   public float i_() {
      return 0.0F;
   }
}
