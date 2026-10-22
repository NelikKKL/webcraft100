package net.minecraft.client;

public class aed extends nq implements aey {
   public float a;
   public float b;
   public float c;
   private int d = 0;

   public aed(ry var1) {
      super(var1);
      this.aA = "/mob/slime.png";
      int var2 = 1 << this.Y.nextInt(3);
      this.L = 0.0F;
      this.d = this.Y.nextInt(20) + 10;
      this.b(var2);
      this.aX = var2;
   }

   protected void b() {
      super.b();
      this.ag.a(16, new Byte((byte)1));
   }

   public void b(int var1) {
      this.ag.b(16, new Byte((byte)var1));
      this.a(0.6F * (float)var1, 0.6F * (float)var1);
      this.d(this.s, this.t, this.u);
      this.h(this.f_());
   }

   public int f_() {
      int var1 = this.aF();
      return var1 * var1;
   }

   public int aF() {
      return this.ag.a(16);
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("Size", this.aF() - 1);
   }

   public void b(ik var1) {
      super.b(var1);
      this.b(var1.e("Size") + 1);
   }

   protected String ax() {
      return "slime";
   }

   protected String aD() {
      return "mob.slime";
   }

   public void a() {
      if (!this.o.I && this.o.v == 0 && this.aF() > 0) {
         this.K = true;
      }

      this.b += (this.a - this.b) * 0.5F;
      this.c = this.b;
      boolean var1 = this.D;
      super.a();
      if (this.D && !var1) {
         int var2 = this.aF();

         for(int var3 = 0; var3 < var2 * 8; ++var3) {
            float var4 = this.Y.nextFloat() * (float)Math.PI * 2.0F;
            float var5 = this.Y.nextFloat() * 0.5F + 0.5F;
            float var6 = me.a(var4) * (float)var2 * 0.5F * var5;
            float var7 = me.b(var4) * (float)var2 * 0.5F * var5;
            this.o.a(this.ax(), this.s + (double)var6, this.C.b, this.u + (double)var7, (double)0.0F, (double)0.0F, (double)0.0F);
         }

         if (this.aE()) {
            this.o.a(this, this.aD(), this.w_(), ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.a = -0.5F;
      }

      this.aA();
   }

   protected void n() {
      this.al();
      vi var1 = this.o.b(this, (double)16.0F);
      if (var1 != null) {
         this.a(var1, 10.0F, 20.0F);
      }

      if (this.D && this.d-- <= 0) {
         this.d = this.az();
         if (var1 != null) {
            this.d /= 3;
         }

         this.bu = true;
         if (this.aG()) {
            this.o.a(this, this.aD(), this.w_(), ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.a = 1.0F;
         this.br = 1.0F - this.Y.nextFloat() * 2.0F;
         this.bs = (float)(1 * this.aF());
      } else {
         this.bu = false;
         if (this.D) {
            this.br = this.bs = 0.0F;
         }
      }

   }

   protected void aA() {
      this.a *= 0.6F;
   }

   protected int az() {
      return this.Y.nextInt(20) + 10;
   }

   protected aed ay() {
      return new aed(this.o);
   }

   public void v() {
      int var1 = this.aF();
      if (!this.o.I && var1 > 1 && this.ag() <= 0) {
         int var2 = 2 + this.Y.nextInt(3);

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = ((float)(var3 % 2) - 0.5F) * (float)var1 / 4.0F;
            float var5 = ((float)(var3 / 2) - 0.5F) * (float)var1 / 4.0F;
            aed var6 = this.ay();
            var6.b(var1 / 2);
            var6.c(this.s + (double)var4, this.t + (double)0.5F, this.u + (double)var5, this.Y.nextFloat() * 360.0F, 0.0F);
            this.o.a((ia)var6);
         }
      }

      super.v();
   }

   public void a(vi var1) {
      if (this.aB()) {
         int var2 = this.aF();
         if (this.i(var1) && (double)this.c((ia)var1) < 0.6 * (double)var2 && var1.a(net.minecraft.client.pm.a((nq)this), this.aC())) {
            this.o.a(this, "mob.slimeattack", 1.0F, (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
         }
      }

   }

   protected boolean aB() {
      return this.aF() > 1;
   }

   protected int aC() {
      return this.aF();
   }

   protected String f() {
      return "mob.slime";
   }

   protected String g() {
      return "mob.slime";
   }

   protected int k() {
      return this.aF() == 1 ? acy.aL.bM : 0;
   }

   public boolean i() {
      zx var1 = this.o.b(me.c(this.s), me.c(this.u));
      return (this.aF() == 1 || this.o.v > 0) && this.Y.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.t < (double)40.0F ? super.i() : false;
   }

   protected float w_() {
      return 0.4F * (float)this.aF();
   }

   protected int am() {
      return 0;
   }

   protected boolean aG() {
      return this.aF() > 1;
   }

   protected boolean aE() {
      return this.aF() > 2;
   }
}
