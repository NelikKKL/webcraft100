package net.minecraft.client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class nq extends ia {
   public int aq = 20;
   public float ar;
   public float as;
   public float at = 0.0F;
   public float au = 0.0F;
   protected float av;
   protected float aw;
   protected float ax;
   protected float ay;
   protected boolean az = true;
   protected String aA = "/mob/char.png";
   protected boolean aB = true;
   protected float aC = 0.0F;
   protected String aD = null;
   protected float aE = 1.0F;
   protected int aF = 0;
   protected float aG = 0.0F;
   public boolean aH = false;
   public float aI = 0.1F;
   public float aJ = 0.02F;
   public float aK;
   public float aL;
   protected int aM = this.f_();
   public int aN;
   protected int aO;
   private int a;
   public int aP;
   public int aQ;
   public float aR = 0.0F;
   public int aS = 0;
   public int aT = 0;
   public float aU;
   public float aV;
   protected boolean aW = false;
   protected int aX;
   public int aY = -1;
   public float aZ = (float)(Math.random() * (double)0.9F + (double)0.1F);
   public float ba;
   public float bb;
   public float bc;
   protected vi bd = null;
   protected int be = 0;
   public int bf = 0;
   public int bg = 0;
   protected HashMap bh = new HashMap();
   private boolean b = true;
   private int c;
   protected int bi;
   protected double bj;
   protected double bk;
   protected double bl;
   protected double bm;
   protected double bn;
   float bo = 0.0F;
   protected int bp = 0;
   protected int bq = 0;
   protected float br;
   protected float bs;
   protected float bt;
   protected boolean bu = false;
   protected float bv = 0.0F;
   protected float bw = 0.7F;
   private int d = 0;
   private ia e;
   protected int bx = 0;

   public nq(ry var1) {
      super(var1);
      this.l = true;
      this.as = (float)(Math.random() + (double)1.0F) * 0.01F;
      this.d(this.s, this.t, this.u);
      this.ar = (float)Math.random() * 12398.0F;
      this.y = (float)(Math.random() * (double)(float)Math.PI * (double)2.0F);
      this.V = 0.5F;
   }

   protected void b() {
      this.ag.a(8, this.c);
   }

   public boolean i(ia var1) {
      return this.o.a(fb.b(this.s, this.t + (double)this.E(), this.u), fb.b(var1.s, var1.t + (double)var1.E(), var1.u)) == null;
   }

   public String I() {
      return this.aA;
   }

   public boolean e_() {
      return !this.K;
   }

   public boolean H() {
      return !this.K;
   }

   public float E() {
      return this.N * 0.85F;
   }

   public int p_() {
      return 80;
   }

   public void ac() {
      String var1 = this.e();
      if (var1 != null) {
         this.o.a(this, var1, this.w_(), this.ax());
      }

   }

   public void w() {
      this.aK = this.aL;
      super.w();
      pf.a("mobBaseTick");
      if (this.Y.nextInt(1000) < this.a++) {
         this.a = -this.p_();
         this.ac();
      }

      if (this.K() && this.L() && this.a((pm)pm.d, 1)) {
      }

      if (this.B() || this.o.I) {
         this.y();
      }

      if (this.K() && this.a((p)net.minecraft.client.p.g) && !this.h() && !this.bh.containsKey(net.minecraft.client.abg.o.H)) {
         this.g(this.d(this.Z()));
         if (this.Z() == -20) {
            this.g(0);

            for(int var1 = 0; var1 < 8; ++var1) {
               float var2 = this.Y.nextFloat() - this.Y.nextFloat();
               float var3 = this.Y.nextFloat() - this.Y.nextFloat();
               float var4 = this.Y.nextFloat() - this.Y.nextFloat();
               this.o.a("bubble", this.s + (double)var2, this.t + (double)var3, this.u + (double)var4, this.v, this.w, this.x);
            }

            this.a((pm)pm.e, 2);
         }

         this.y();
      } else {
         this.g(300);
      }

      this.aU = this.aV;
      if (this.aT > 0) {
         --this.aT;
      }

      if (this.aP > 0) {
         --this.aP;
      }

      if (this.ac > 0) {
         --this.ac;
      }

      if (this.aM <= 0) {
         this.ad();
      }

      if (this.be > 0) {
         --this.be;
      } else {
         this.bd = null;
      }

      this.as();
      this.ay = this.ax;
      this.au = this.at;
      this.A = this.y;
      this.B = this.z;
      pf.b();
   }

   protected void ad() {
      ++this.aS;
      if (this.aS == 20) {
         if (!this.o.I && (this.be > 0 || this.ae()) && !this.q_()) {
            int var1 = this.b(this.bd);

            while(var1 > 0) {
               int var2 = fk.b(var1);
               var1 -= var2;
               this.o.a((ia)(new fk(this.o, this.s, this.t, this.u, var2)));
            }
         }

         this.ap();
         this.v();

         for(int var8 = 0; var8 < 20; ++var8) {
            double var9 = this.Y.nextGaussian() * 0.02;
            double var4 = this.Y.nextGaussian() * 0.02;
            double var6 = this.Y.nextGaussian() * 0.02;
            this.o.a("explode", this.s + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, this.t + (double)(this.Y.nextFloat() * this.N), this.u + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M, var9, var4, var6);
         }
      }

   }

   protected int d(int var1) {
      return var1 - 1;
   }

   protected int b(vi var1) {
      return this.aX;
   }

   protected boolean ae() {
      return false;
   }

   public void af() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.Y.nextGaussian() * 0.02;
         double var4 = this.Y.nextGaussian() * 0.02;
         double var6 = this.Y.nextGaussian() * 0.02;
         double var8 = (double)10.0F;
         this.o.a("explode", this.s + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M - var2 * var8, this.t + (double)(this.Y.nextFloat() * this.N) - var4 * var8, this.u + (double)(this.Y.nextFloat() * this.M * 2.0F) - (double)this.M - var6 * var8, var2, var4, var6);
      }

   }

   public void M() {
      super.M();
      this.av = this.aw;
      this.aw = 0.0F;
      this.Q = 0.0F;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.L = 0.0F;
      this.bj = var1;
      this.bk = var3;
      this.bl = var5;
      this.bm = (double)var7;
      this.bn = (double)var8;
      this.bi = var9;
   }

   public void a() {
      super.a();
      if (this.bf > 0) {
         if (this.bg <= 0) {
            this.bg = 60;
         }

         --this.bg;
         if (this.bg <= 0) {
            --this.bf;
         }
      }

      this.c();
      double var1 = this.s - this.p;
      double var3 = this.u - this.r;
      float var5 = me.a(var1 * var1 + var3 * var3);
      float var6 = this.at;
      float var7 = 0.0F;
      this.av = this.aw;
      float var8 = 0.0F;
      if (!(var5 <= 0.05F)) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / (float)Math.PI - 90.0F;
      }

      if (this.aL > 0.0F) {
         var6 = this.y;
      }

      if (!this.D) {
         var8 = 0.0F;
      }

      this.aw += (var8 - this.aw) * 0.3F;

      float var9;
      for(var9 = var6 - this.at; var9 < -180.0F; var9 += 360.0F) {
      }

      while(var9 >= 180.0F) {
         var9 -= 360.0F;
      }

      this.at += var9 * 0.3F;

      float var10;
      for(var10 = this.y - this.at; var10 < -180.0F; var10 += 360.0F) {
      }

      while(var10 >= 180.0F) {
         var10 -= 360.0F;
      }

      boolean var11 = var10 < -90.0F || var10 >= 90.0F;
      if (var10 < -75.0F) {
         var10 = -75.0F;
      }

      if (var10 >= 75.0F) {
         var10 = 75.0F;
      }

      this.at = this.y - var10;
      if (var10 * var10 > 2500.0F) {
         this.at += var10 * 0.2F;
      }

      if (var11) {
         var7 *= -1.0F;
      }

      while(this.y - this.A < -180.0F) {
         this.A -= 360.0F;
      }

      while(this.y - this.A >= 180.0F) {
         this.A += 360.0F;
      }

      while(this.at - this.au < -180.0F) {
         this.au -= 360.0F;
      }

      while(this.at - this.au >= 180.0F) {
         this.au += 360.0F;
      }

      while(this.z - this.B < -180.0F) {
         this.B -= 360.0F;
      }

      while(this.z - this.B >= 180.0F) {
         this.B += 360.0F;
      }

      this.ax += var7;
   }

   protected void a(float var1, float var2) {
      super.a(var1, var2);
   }

   public void a_(int var1) {
      if (this.aM > 0) {
         this.aM += var1;
         if (this.aM > this.f_()) {
            this.aM = this.f_();
         }

         this.ac = this.aq / 2;
      }
   }

   public abstract int f_();

   public int ag() {
      return this.aM;
   }

   public void h(int var1) {
      this.aM = var1;
      if (var1 > this.f_()) {
         var1 = this.f_();
      }

   }

   public boolean a(pm var1, int var2) {
      if (this.o.I) {
         return false;
      } else {
         this.bq = 0;
         if (this.aM <= 0) {
            return false;
         } else if (var1.k() && this.a(abg.n)) {
            return false;
         } else {
            this.bb = 1.5F;
            boolean var3 = true;
            if ((float)this.ac > (float)this.aq / 2.0F) {
               if (var2 <= this.bp) {
                  return false;
               }

               this.b(var1, var2 - this.bp);
               this.bp = var2;
               var3 = false;
            } else {
               this.bp = var2;
               this.aN = this.aM;
               this.ac = this.aq;
               this.b(var1, var2);
               this.aP = this.aQ = 10;
            }

            this.aR = 0.0F;
            ia var4 = var1.a();
            if (var4 != null) {
               if (var4 instanceof vi) {
                  this.be = 60;
                  this.bd = (vi)var4;
               } else if (var4 instanceof aik) {
                  aik var5 = (aik)var4;
                  if (var5.aG()) {
                     this.be = 60;
                     this.bd = null;
                  }
               }
            }

            if (var3) {
               this.o.a(this, (byte)2);
               this.G();
               if (var4 != null) {
                  double var9 = var4.s - this.s;

                  double var7;
                  for(var7 = var4.u - this.u; var9 * var9 + var7 * var7 < 1.0E-4; var7 = (Math.random() - Math.random()) * 0.01) {
                     var9 = (Math.random() - Math.random()) * 0.01;
                  }

                  this.aR = (float)(Math.atan2(var7, var9) * (double)180.0F / (double)(float)Math.PI) - this.y;
                  this.a(var4, var2, var9, var7);
               } else {
                  this.aR = (float)((int)(Math.random() * (double)2.0F) * 180);
               }
            }

            if (this.aM <= 0) {
               if (var3) {
                  this.o.a(this, this.g(), this.w_(), this.ax());
               }

               this.a(var1);
            } else if (var3) {
               this.o.a(this, this.f(), this.w_(), this.ax());
            }

            return true;
         }
      }
   }

   private float ax() {
      return this.q_() ? (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.5F : (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F;
   }

   public void T() {
      this.aP = this.aQ = 10;
      this.aR = 0.0F;
   }

   protected int o_() {
      return 0;
   }

   protected void i(int var1) {
   }

   protected int c(pm var1, int var2) {
      if (!var1.d()) {
         int var3 = 25 - this.o_();
         int var4 = var2 * var3 + this.aO;
         this.i(var2);
         var2 = var4 / 25;
         this.aO = var4 % 25;
      }

      return var2;
   }

   protected int d(pm var1, int var2) {
      if (this.a(abg.m)) {
         int var3 = (this.b(abg.m).c() + 1) * 5;
         int var4 = 25 - var3;
         int var5 = var2 * var4 + this.aO;
         var2 = var5 / 25;
         this.aO = var5 % 25;
      }

      return var2;
   }

   protected void b(pm var1, int var2) {
      var2 = this.c(var1, var2);
      var2 = this.d(var1, var2);
      this.aM -= var2;
   }

   protected float w_() {
      return 1.0F;
   }

   protected String e() {
      return null;
   }

   protected String f() {
      return "damage.hurtflesh";
   }

   protected String g() {
      return "damage.hurtflesh";
   }

   public void a(ia var1, int var2, double var3, double var5) {
      this.ap = true;
      float var7 = me.a(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.v /= (double)2.0F;
      this.w /= (double)2.0F;
      this.x /= (double)2.0F;
      this.v -= var3 / (double)var7 * (double)var8;
      this.w += (double)0.4F;
      this.x -= var5 / (double)var7 * (double)var8;
      if (this.w > (double)0.4F) {
         this.w = (double)0.4F;
      }

   }

   public void a(pm var1) {
      ia var2 = var1.a();
      if (this.aF >= 0 && var2 != null) {
         var2.b(this, this.aF);
      }

      if (var2 != null) {
         var2.a(this);
      }

      this.aW = true;
      if (!this.o.I) {
         int var3 = 0;
         if (var2 instanceof vi) {
            var3 = ml.f(((vi)var2).by);
         }

         if (!this.q_()) {
            this.a(this.be > 0, var3);
         }
      }

      this.o.a(this, (byte)3);
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.k();
      if (var3 > 0) {
         int var4 = this.Y.nextInt(3);
         if (var2 > 0) {
            var4 += this.Y.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.b(var3, 1);
         }
      }

   }

   protected int k() {
      return 0;
   }

   protected void c(float var1) {
      super.c(var1);
      int var2 = (int)Math.ceil((double)(var1 - 3.0F));
      if (var2 > 0) {
         if (var2 > 4) {
            this.o.a(this, "damage.fallbig", 1.0F, 1.0F);
         } else {
            this.o.a(this, "damage.fallsmall", 1.0F, 1.0F);
         }

         this.a(pm.h, var2);
         int var3 = this.o.a(me.c(this.s), me.c(this.t - (double)0.2F - (double)this.L), me.c(this.u));
         if (var3 > 0) {
            wu var4 = yy.k[var3].bX;
            this.o.a(this, var4.d(), var4.b() * 0.5F, var4.c() * 0.75F);
         }
      }

   }

   public void d(float var1, float var2) {
      if (this.D()) {
         double var3 = this.t;
         this.a(var1, var2, 0.02F);
         this.b(this.v, this.w, this.x);
         this.v *= (double)0.8F;
         this.w *= (double)0.8F;
         this.x *= (double)0.8F;
         this.w -= 0.02;
         if (this.E && this.e(this.v, this.w + (double)0.6F - this.t + var3, this.x)) {
            this.w = (double)0.3F;
         }
      } else if (this.F()) {
         double var8 = this.t;
         this.a(var1, var2, 0.02F);
         this.b(this.v, this.w, this.x);
         this.v *= (double)0.5F;
         this.w *= (double)0.5F;
         this.x *= (double)0.5F;
         this.w -= 0.02;
         if (this.E && this.e(this.v, this.w + (double)0.6F - this.t + var8, this.x)) {
            this.w = (double)0.3F;
         }
      } else {
         float var9 = 0.91F;
         if (this.D) {
            var9 = 0.54600006F;
            int var4 = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
            if (var4 > 0) {
               var9 = yy.k[var4].ca * 0.91F;
            }
         }

         float var12 = 0.16277136F / (var9 * var9 * var9);
         float var5 = this.D ? this.aI * var12 : this.aJ;
         this.a(var1, var2, var5);
         var9 = 0.91F;
         if (this.D) {
            var9 = 0.54600006F;
            int var6 = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
            if (var6 > 0) {
               var9 = yy.k[var6].ca * 0.91F;
            }
         }

         if (this.ah()) {
            float var14 = 0.15F;
            if (this.v < (double)(-var14)) {
               this.v = (double)(-var14);
            }

            if (this.v > (double)var14) {
               this.v = (double)var14;
            }

            if (this.x < (double)(-var14)) {
               this.x = (double)(-var14);
            }

            if (this.x > (double)var14) {
               this.x = (double)var14;
            }

            this.Q = 0.0F;
            if (this.w < -0.15) {
               this.w = -0.15;
            }

            if (this.q() && this.w < (double)0.0F) {
               this.w = (double)0.0F;
            }
         }

         this.b(this.v, this.w, this.x);
         if (this.E && this.ah()) {
            this.w = 0.2;
         }

         this.w -= 0.08;
         this.w *= (double)0.98F;
         this.v *= (double)var9;
         this.x *= (double)var9;
      }

      this.ba = this.bb;
      double var11 = this.s - this.p;
      double var13 = this.u - this.r;
      float var7 = me.a(var11 * var11 + var13 * var13) * 4.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.bb += (var7 - this.bb) * 0.4F;
      this.bc += this.bb;
   }

   public boolean ah() {
      int var1 = me.c(this.s);
      int var2 = me.c(this.C.b);
      int var3 = me.c(this.u);
      return this.o.a(var1, var2, var3) == yy.aF.bM;
   }

   public void a(ik var1) {
      var1.a("Health", (short)this.aM);
      var1.a("HurtTime", (short)this.aP);
      var1.a("DeathTime", (short)this.aS);
      var1.a("AttackTime", (short)this.aT);
      if (!this.bh.isEmpty()) {
         yi var2 = new yi();

         for(s var4 : (Iterable<s>)(Iterable)(this.bh.values())) {
            ik var5 = new ik();
            var5.a("Id", (byte)var4.a());
            var5.a("Amplifier", (byte)var4.c());
            var5.a("Duration", var4.b());
            var2.a((um)var5);
         }

         var1.a("ActiveEffects", (um)var2);
      }

   }

   public void b(ik var1) {
      this.aM = var1.d("Health");
      if (!var1.b("Health")) {
         this.aM = this.f_();
      }

      this.aP = var1.d("HurtTime");
      this.aS = var1.d("DeathTime");
      this.aT = var1.d("AttackTime");
      if (var1.b("ActiveEffects")) {
         yi var2 = var1.l("ActiveEffects");

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            ik var4 = (ik)var2.a(var3);
            byte var5 = var4.c("Id");
            byte var6 = var4.c("Amplifier");
            int var7 = var4.e("Duration");
            this.bh.put(var5, new s(var5, var7, var6));
         }
      }

   }

   public boolean K() {
      return !this.K && this.aM > 0;
   }

   public boolean h() {
      return false;
   }

   public void c() {
      if (this.d > 0) {
         --this.d;
      }

      if (this.bi > 0) {
         double var1 = this.s + (this.bj - this.s) / (double)this.bi;
         double var3 = this.t + (this.bk - this.t) / (double)this.bi;
         double var5 = this.u + (this.bl - this.u) / (double)this.bi;

         double var7;
         for(var7 = this.bm - (double)this.y; var7 < (double)-180.0F; var7 += (double)360.0F) {
         }

         while(var7 >= (double)180.0F) {
            var7 -= (double)360.0F;
         }

         this.y = (float)((double)this.y + var7 / (double)this.bi);
         this.z = (float)((double)this.z + (this.bn - (double)this.z) / (double)this.bi);
         --this.bi;
         this.d(var1, var3, var5);
         this.b(this.y, this.z);
         List var9 = this.o.a((ia)this, (c)this.C.e((double)0.03125F, (double)0.0F, (double)0.03125F));
         if (var9.size() > 0) {
            double var10 = (double)0.0F;

            for(int var12 = 0; var12 < var9.size(); ++var12) {
               c var13 = (c)var9.get(var12);
               if (var13.e > var10) {
                  var10 = var13.e;
               }
            }

            var3 += var10 - this.C.b;
            this.d(var1, var3, var5);
         }
      }

      pf.a("ai");
      if (this.ai()) {
         this.bu = false;
         this.br = 0.0F;
         this.bs = 0.0F;
         this.bt = 0.0F;
      } else if (!this.aH) {
         this.n();
      }

      pf.b();
      boolean var14 = this.D();
      boolean var2 = this.F();
      if (this.bu) {
         if (var14) {
            this.w += (double)0.04F;
         } else if (var2) {
            this.w += (double)0.04F;
         } else if (this.D && this.d == 0) {
            this.ak();
            this.d = 10;
         }
      } else {
         this.d = 0;
      }

      this.br *= 0.98F;
      this.bs *= 0.98F;
      this.bt *= 0.9F;
      float var16 = this.aI;
      this.aI *= this.aw();
      this.d(this.br, this.bs);
      this.aI = var16;
      pf.a("push");
      List var4 = this.o.b((ia)this, (c)this.C.b((double)0.2F, (double)0.0F, (double)0.2F));
      if (var4 != null && var4.size() > 0) {
         for(int var17 = 0; var17 < var4.size(); ++var17) {
            ia var6 = (ia)var4.get(var17);
            if (var6.H()) {
               var6.e((ia)this);
            }
         }
      }

      pf.b();
   }

   protected boolean ai() {
      return this.aM <= 0;
   }

   public boolean aj() {
      return false;
   }

   protected void ak() {
      this.w = (double)0.42F;
      if (this.a(abg.j)) {
         this.w += (double)((float)(this.b(abg.j).c() + 1) * 0.1F);
      }

      if (this.X()) {
         float var1 = this.y * ((float)Math.PI / 180F);
         this.v -= (double)(me.a(var1) * 0.2F);
         this.x += (double)(me.b(var1) * 0.2F);
      }

      this.ap = true;
   }

   protected boolean d() {
      return true;
   }

   protected void al() {
      vi var1 = this.o.a(this, (double)-1.0F);
      if (var1 != null) {
         double var2 = var1.s - this.s;
         double var4 = var1.t - this.t;
         double var6 = var1.u - this.u;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if (this.d() && var8 > (double)16384.0F) {
            this.v();
         }

         if (this.bq > 600 && this.Y.nextInt(800) == 0 && var8 > (double)1024.0F && this.d()) {
            this.v();
         } else if (var8 < (double)1024.0F) {
            this.bq = 0;
         }
      }

   }

   protected void n() {
      ++this.bq;
      vi var1 = this.o.a(this, (double)-1.0F);
      this.al();
      this.br = 0.0F;
      this.bs = 0.0F;
      float var2 = 8.0F;
      if (this.Y.nextFloat() < 0.02F) {
         var1 = this.o.a(this, (double)var2);
         if (var1 != null) {
            this.e = var1;
            this.bx = 10 + this.Y.nextInt(20);
         } else {
            this.bt = (this.Y.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if (this.e != null) {
         this.a(this.e, 10.0F, (float)this.am());
         if (this.bx-- <= 0 || this.e.K || this.e.d((ia)this) > (double)(var2 * var2)) {
            this.e = null;
         }
      } else {
         if (this.Y.nextFloat() < 0.05F) {
            this.bt = (this.Y.nextFloat() - 0.5F) * 20.0F;
         }

         this.y += this.bt;
         this.z = this.bv;
      }

      boolean var3 = this.D();
      boolean var4 = this.F();
      if (var3 || var4) {
         this.bu = this.Y.nextFloat() < 0.8F;
      }

   }

   protected int am() {
      return 40;
   }

   public void a(ia var1, float var2, float var3) {
      double var4 = var1.s - this.s;
      double var8 = var1.u - this.u;
      double var6;
      if (var1 instanceof nq) {
         nq var10 = (nq)var1;
         var6 = this.t + (double)this.E() - (var10.t + (double)var10.E());
      } else {
         var6 = (var1.C.b + var1.C.e) / (double)2.0F - (this.t + (double)this.E());
      }

      double var14 = (double)me.a(var4 * var4 + var8 * var8);
      float var12 = (float)(Math.atan2(var8, var4) * (double)180.0F / (double)(float)Math.PI) - 90.0F;
      float var13 = (float)(-(Math.atan2(var6, var14) * (double)180.0F / (double)(float)Math.PI));
      this.z = -this.b(this.z, var13, var3);
      this.y = this.b(this.y, var12, var2);
   }

   public boolean an() {
      return this.e != null;
   }

   public ia ao() {
      return this.e;
   }

   private float b(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public void ap() {
   }

   public boolean i() {
      return this.o.a(this.C) && this.o.a((ia)this, (c)this.C).size() == 0 && !this.o.b(this.C);
   }

   protected void z() {
      this.a((pm)pm.i, 4);
   }

   public float d(float var1) {
      float var2 = this.aL - this.aK;
      if (var2 < 0.0F) {
         ++var2;
      }

      return this.aK + var2 * var1;
   }

   public fb e(float var1) {
      if (var1 == 1.0F) {
         return fb.b(this.s, this.t, this.u);
      } else {
         double var2 = this.p + (this.s - this.p) * (double)var1;
         double var4 = this.q + (this.t - this.q) * (double)var1;
         double var6 = this.r + (this.u - this.r) * (double)var1;
         return fb.b(var2, var4, var6);
      }
   }

   public fb R() {
      return this.f(1.0F);
   }

   public fb f(float var1) {
      if (var1 == 1.0F) {
         float var8 = me.b(-this.y * ((float)Math.PI / 180F) - (float)Math.PI);
         float var9 = me.a(-this.y * ((float)Math.PI / 180F) - (float)Math.PI);
         float var10 = -me.b(-this.z * ((float)Math.PI / 180F));
         float var11 = me.a(-this.z * ((float)Math.PI / 180F));
         return fb.b((double)(var9 * var10), (double)var11, (double)(var8 * var10));
      } else {
         float var2 = this.B + (this.z - this.B) * var1;
         float var3 = this.A + (this.y - this.A) * var1;
         float var4 = me.b(-var3 * ((float)Math.PI / 180F) - (float)Math.PI);
         float var5 = me.a(-var3 * ((float)Math.PI / 180F) - (float)Math.PI);
         float var6 = -me.b(-var2 * ((float)Math.PI / 180F));
         float var7 = me.a(-var2 * ((float)Math.PI / 180F));
         return fb.b((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public float aq() {
      return 1.0F;
   }

   public gv a(double var1, float var3) {
      fb var4 = this.e(var3);
      fb var5 = this.f(var3);
      fb var6 = var4.c(var5.a * var1, var5.b * var1, var5.c * var1);
      return this.o.a(var4, var6);
   }

   public int g_() {
      return 4;
   }

   public dk s() {
      return null;
   }

   public void a(byte var1) {
      if (var1 == 2) {
         this.bb = 1.5F;
         this.ac = this.aq;
         this.aP = this.aQ = 10;
         this.aR = 0.0F;
         this.o.a(this, this.f(), this.w_(), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
         this.a((pm)pm.j, 0);
      } else if (var1 == 3) {
         this.o.a(this, this.g(), this.w_(), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
         this.aM = 0;
         this.a(pm.j);
      } else {
         super.a(var1);
      }

   }

   public boolean ar() {
      return false;
   }

   public int a(dk var1, int var2) {
      return var1.b();
   }

   protected void as() {
      Iterator var1 = this.bh.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         s var3 = (s)this.bh.get(var2);
         if (!var3.a(this) && !this.o.I) {
            var1.remove();
            this.e(var3);
         }
      }

      if (this.b) {
         if (!this.o.I) {
            if (!this.bh.isEmpty()) {
               int var9 = pk.a(this.bh.values());
               this.ag.b(8, var9);
            } else {
               this.ag.b(8, 0);
            }
         }

         this.b = false;
      }

      if (this.Y.nextBoolean()) {
         int var10 = this.ag.c(8);
         if (var10 > 0) {
            double var11 = (double)(var10 >> 16 & 255) / (double)255.0F;
            double var5 = (double)(var10 >> 8 & 255) / (double)255.0F;
            double var7 = (double)(var10 >> 0 & 255) / (double)255.0F;
            this.o.a("mobSpell", this.s + (this.Y.nextDouble() - (double)0.5F) * (double)this.M, this.t + this.Y.nextDouble() * (double)this.N - (double)this.L, this.u + (this.Y.nextDouble() - (double)0.5F) * (double)this.M, var11, var5, var7);
         }
      }

   }

   public void at() {
      Iterator var1 = this.bh.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         s var3 = (s)this.bh.get(var2);
         if (!this.o.I) {
            var1.remove();
            this.e(var3);
         }
      }

   }

   public Collection au() {
      return this.bh.values();
   }

   public boolean a(abg var1) {
      return this.bh.containsKey(var1.H);
   }

   public s b(abg var1) {
      return (s)this.bh.get(var1.H);
   }

   public void a(s var1) {
      if (this.b(var1)) {
         if (this.bh.containsKey(var1.a())) {
            ((s)this.bh.get(var1.a())).a(var1);
            this.d((s)this.bh.get(var1.a()));
         } else {
            this.bh.put(var1.a(), var1);
            this.c(var1);
         }

      }
   }

   public boolean b(s var1) {
      if (this.r_() == el.b) {
         int var2 = var1.a();
         if (var2 == abg.l.H || var2 == abg.u.H) {
            return false;
         }
      }

      return true;
   }

   public boolean av() {
      return this.r_() == el.b;
   }

   public void j(int var1) {
      this.bh.remove(var1);
   }

   protected void c(s var1) {
      this.b = true;
   }

   protected void d(s var1) {
      this.b = true;
   }

   protected void e(s var1) {
      this.b = true;
   }

   protected float aw() {
      float var1 = 1.0F;
      if (this.a(abg.c)) {
         var1 *= 1.0F + 0.2F * (float)(this.b(abg.c).c() + 1);
      }

      if (this.a(abg.d)) {
         var1 *= 1.0F - 0.15F * (float)(this.b(abg.d).c() + 1);
      }

      return var1;
   }

   public void i(double var1, double var3, double var5) {
      this.c(var1, var3, var5, this.y, this.z);
   }

   public boolean q_() {
      return false;
   }

   public el r_() {
      return el.a;
   }

   public void b(dk var1) {
      this.o.a(this, "random.break", 0.8F, 0.8F + this.o.w.nextFloat() * 0.4F);

      for(int var2 = 0; var2 < 5; ++var2) {
         fb var3 = fb.b(((double)this.Y.nextFloat() - (double)0.5F) * 0.1, Math.random() * 0.1 + 0.1, (double)0.0F);
         var3.a(-this.z * (float)Math.PI / 180.0F);
         var3.b(-this.y * (float)Math.PI / 180.0F);
         fb var4 = fb.b(((double)this.Y.nextFloat() - (double)0.5F) * 0.3, (double)(-this.Y.nextFloat()) * 0.6 - 0.3, 0.6);
         var4.a(-this.z * (float)Math.PI / 180.0F);
         var4.b(-this.y * (float)Math.PI / 180.0F);
         var4 = var4.c(this.s, this.t + (double)this.E(), this.u);
         this.o.a("iconcrack_" + var1.a().bM, var4.a, var4.b, var4.c, var3.a, var3.b + 0.05, var3.c);
      }

   }
}
