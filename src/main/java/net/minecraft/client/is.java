package net.minecraft.client;

public class is extends wk implements aey {
   public int a = 0;
   public double b;
   public double c;
   public double d;
   private ia g = null;
   private int h = 0;
   public int e = 0;
   public int f = 0;

   public is(ry var1) {
      super(var1);
      this.aA = "/mob/ghast.png";
      this.a(4.0F, 4.0F);
      this.af = true;
      this.aX = 5;
   }

   public boolean a(pm var1, int var2) {
      if ("fireball".equals(var1.l()) && var1.a() instanceof vi) {
         super.a(var1, 1000);
         ((vi)var1.a()).a((px)ut.y);
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   protected void b() {
      super.b();
      this.ag.a(16, (byte)0);
   }

   public int f_() {
      return 10;
   }

   public void a() {
      super.a();
      byte var1 = this.ag.a(16);
      this.aA = var1 == 1 ? "/mob/ghast_fire.png" : "/mob/ghast.png";
   }

   protected void n() {
      if (!this.o.I && this.o.v == 0) {
         this.v();
      }

      this.al();
      this.e = this.f;
      double var1 = this.b - this.s;
      double var3 = this.c - this.t;
      double var5 = this.d - this.u;
      double var7 = (double)me.a(var1 * var1 + var3 * var3 + var5 * var5);
      if (var7 < (double)1.0F || var7 > (double)60.0F) {
         this.b = this.s + (double)((this.Y.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.c = this.t + (double)((this.Y.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.d = this.u + (double)((this.Y.nextFloat() * 2.0F - 1.0F) * 16.0F);
      }

      if (this.a-- <= 0) {
         this.a += this.Y.nextInt(5) + 2;
         if (this.a(this.b, this.c, this.d, var7)) {
            this.v += var1 / var7 * 0.1;
            this.w += var3 / var7 * 0.1;
            this.x += var5 / var7 * 0.1;
         } else {
            this.b = this.s;
            this.c = this.t;
            this.d = this.u;
         }
      }

      if (this.g != null && this.g.K) {
         this.g = null;
      }

      if (this.g == null || this.h-- <= 0) {
         this.g = this.o.b(this, (double)100.0F);
         if (this.g != null) {
            this.h = 20;
         }
      }

      double var9 = (double)64.0F;
      if (this.g != null && this.g.d((ia)this) < var9 * var9) {
         double var11 = this.g.s - this.s;
         double var13 = this.g.C.b + (double)(this.g.N / 2.0F) - (this.t + (double)(this.N / 2.0F));
         double var15 = this.g.u - this.u;
         this.at = this.y = -((float)Math.atan2(var11, var15)) * 180.0F / (float)Math.PI;
         if (this.i(this.g)) {
            if (this.f == 10) {
               this.o.a((vi)null, 1007, (int)this.s, (int)this.t, (int)this.u, 0);
            }

            ++this.f;
            if (this.f == 20) {
               this.o.a((vi)null, 1008, (int)this.s, (int)this.t, (int)this.u, 0);
               aad var17 = new aad(this.o, this, var11, var13, var15);
               double var18 = (double)4.0F;
               fb var20 = this.f(1.0F);
               var17.s = this.s + var20.a * var18;
               var17.t = this.t + (double)(this.N / 2.0F) + (double)0.5F;
               var17.u = this.u + var20.c * var18;
               this.o.a((ia)var17);
               this.f = -40;
            }
         } else if (this.f > 0) {
            --this.f;
         }
      } else {
         this.at = this.y = -((float)Math.atan2(this.v, this.x)) * 180.0F / (float)Math.PI;
         if (this.f > 0) {
            --this.f;
         }
      }

      if (!this.o.I) {
         byte var21 = this.ag.a(16);
         byte var12 = (byte)(this.f > 10 ? 1 : 0);
         if (var21 != var12) {
            this.ag.b(16, var12);
         }
      }

   }

   private boolean a(double var1, double var3, double var5, double var7) {
      double var9 = (this.b - this.s) / var7;
      double var11 = (this.c - this.t) / var7;
      double var13 = (this.d - this.u) / var7;
      c var15 = this.C.d();

      for(int var16 = 1; (double)var16 < var7; ++var16) {
         var15.d(var9, var11, var13);
         if (this.o.a((ia)this, (c)var15).size() > 0) {
            return false;
         }
      }

      return true;
   }

   protected String e() {
      return "mob.ghast.moan";
   }

   protected String f() {
      return "mob.ghast.scream";
   }

   protected String g() {
      return "mob.ghast.death";
   }

   protected int k() {
      return acy.L.bM;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.Y.nextInt(2) + this.Y.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(acy.bo.bM, 1);
      }

      var3 = this.Y.nextInt(3) + this.Y.nextInt(1 + var2);

      for(int var6 = 0; var6 < var3; ++var6) {
         this.b(acy.L.bM, 1);
      }

   }

   protected float w_() {
      return 10.0F;
   }

   public boolean i() {
      return this.Y.nextInt(20) == 0 && super.i() && this.o.v > 0;
   }

   public int g_() {
      return 1;
   }
}
