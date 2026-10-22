package net.minecraft.client;

public class vq extends zo {
   public vq(ry var1) {
      super(var1);
      this.aA = "/mob/spider.png";
      this.a(1.4F, 0.9F);
      this.bw = 0.8F;
   }

   protected void b() {
      super.b();
      this.ag.a(16, new Byte((byte)0));
   }

   public void c() {
      super.c();
   }

   public void a() {
      super.a();
      if (!this.o.I) {
         this.b(this.E);
      }

   }

   public int f_() {
      return 16;
   }

   public double P() {
      return (double)this.N * (double)0.75F - (double)0.5F;
   }

   protected boolean d_() {
      return false;
   }

   protected ia o() {
      float var1 = this.b(1.0F);
      if (var1 < 0.5F) {
         double var2 = (double)16.0F;
         return this.o.b(this, var2);
      } else {
         return null;
      }
   }

   protected String e() {
      return "mob.spider";
   }

   protected String f() {
      return "mob.spider";
   }

   protected String g() {
      return "mob.spiderdeath";
   }

   protected void a(ia var1, float var2) {
      float var3 = this.b(1.0F);
      if (var3 > 0.5F && this.Y.nextInt(100) == 0) {
         this.h = null;
      } else {
         if (var2 > 2.0F && var2 < 6.0F && this.Y.nextInt(10) == 0) {
            if (this.D) {
               double var4 = var1.s - this.s;
               double var6 = var1.u - this.u;
               float var8 = me.a(var4 * var4 + var6 * var6);
               this.v = var4 / (double)var8 * (double)0.5F * (double)0.8F + this.v * (double)0.2F;
               this.x = var6 / (double)var8 * (double)0.5F * (double)0.8F + this.x * (double)0.2F;
               this.w = (double)0.4F;
            }
         } else {
            super.a(var1, var2);
         }

      }
   }

   public void a(ik var1) {
      super.a(var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected int k() {
      return acy.J.bM;
   }

   protected void a(boolean var1, int var2) {
      super.a(var1, var2);
      if (var1 && (this.Y.nextInt(3) == 0 || this.Y.nextInt(1 + var2) > 0)) {
         this.b(acy.bt.bM, 1);
      }

   }

   public boolean ah() {
      return this.ay();
   }

   public void aa() {
   }

   public float ax() {
      return 1.0F;
   }

   public el r_() {
      return el.c;
   }

   public boolean b(s var1) {
      return var1.a() == abg.u.H ? false : super.b((s)var1);
   }

   public boolean ay() {
      return (this.ag.a(16) & 1) != 0;
   }

   public void b(boolean var1) {
      byte var2 = this.ag.a(16);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 = (byte)(var2 & -2);
      }

      this.ag.b(16, var2);
   }
}
