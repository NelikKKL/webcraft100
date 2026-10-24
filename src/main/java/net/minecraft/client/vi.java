package net.minecraft.client;

import java.util.List;

public abstract class vi extends nq {
   public x by = new x(this);
   public pj bz;
   public pj bA;
   protected eq bB = new eq();
   protected int bC = 0;
   public byte bD = 0;
   public int bE = 0;
   public float bF;
   public float bG;
   public boolean bH = false;
   public int bI = 0;
   public String bJ;
   public int bK;
   public String bL;
   public int bM = 0;
   public double bN;
   public double bO;
   public double bP;
   public double bQ;
   public double bR;
   public double bS;
   protected boolean bT;
   public dh bU;
   private int a;
   public float bV;
   public float bW;
   public float bX;
   private dh b;
   private dh c;
   public int bY = 20;
   protected boolean bZ = false;
   public float ca;
   public float cb;
   public wq cc = new wq();
   public int cd;
   public int ce;
   public float cf;
   private dk d;
   private int e;
   protected float cg = 0.1F;
   protected float ch = 0.02F;
   public ael ci = null;

   public vi(ry var1) {
      super(var1);
      this.bz = new gd(this.by, !var1.I);
      this.bA = this.bz;
      this.L = 1.62F;
      dh var2 = var1.v();
      this.c((double)var2.a + (double)0.5F, (double)(var2.b + 1), (double)var2.c + (double)0.5F, 0.0F, 0.0F);
      this.aD = "humanoid";
      this.aC = 180.0F;
      this.aa = 20;
      this.aA = "/mob/char.png";
   }

   public int f_() {
      return 20;
   }

   protected void b() {
      super.b();
      this.ag.a(16, (byte)0);
      this.ag.a(17, (byte)0);
   }

   public dk ax() {
      return this.d;
   }

   public int ay() {
      return this.e;
   }

   public boolean az() {
      return this.d != null;
   }

   public int aA() {
      return this.az() ? this.d.l() - this.e : 0;
   }

   public void aB() {
      if (this.d != null) {
         this.d.a(this.o, this, this.e);
      }

      this.aC();
   }

   public void aC() {
      this.d = null;
      this.e = 0;
      if (!this.o.I) {
         this.c(false);
      }

   }

   public boolean aj() {
      return this.az() && acy.d[this.d.c].c(this.d) == ps.d;
   }

   public void a() {
      if (this.d != null) {
         dk var1 = this.by.a();
         if (var1 != this.d) {
            this.aC();
         } else {
            if (this.e <= 25 && this.e % 4 == 0) {
               this.b((dk)var1, 5);
            }

            if (--this.e == 0 && !this.o.I) {
               this.aD();
            }
         }
      }

      if (this.bM > 0) {
         --this.bM;
      }

      if (this.ar()) {
         ++this.a;
         if (this.a > 100) {
            this.a = 100;
         }

         if (!this.o.I) {
            if (!this.aR()) {
               this.a(true, true, false);
            } else if (this.o.l()) {
               this.a(false, true, true);
            }
         }
      } else if (this.a > 0) {
         ++this.a;
         if (this.a >= 110) {
            this.a = 0;
         }
      }

      super.a();
      if (!this.o.I && this.bA != null && !this.bA.a(this)) {
         this.m();
         this.bA = this.bz;
      }

      if (this.cc.b) {
         for(int var9 = 0; var9 < 8; ++var9) {
         }
      }

      if (this.V() && this.cc.a) {
         this.y();
      }

      this.bN = this.bQ;
      this.bO = this.bR;
      this.bP = this.bS;
      double var10 = this.s - this.bQ;
      double var3 = this.t - this.bR;
      double var5 = this.u - this.bS;
      double var7 = (double)10.0F;
      if (var10 > var7) {
         this.bN = this.bQ = this.s;
      }

      if (var5 > var7) {
         this.bP = this.bS = this.u;
      }

      if (var3 > var7) {
         this.bO = this.bR = this.t;
      }

      if (var10 < -var7) {
         this.bN = this.bQ = this.s;
      }

      if (var5 < -var7) {
         this.bP = this.bS = this.u;
      }

      if (var3 < -var7) {
         this.bO = this.bR = this.t;
      }

      this.bQ += var10 * (double)0.25F;
      this.bS += var5 * (double)0.25F;
      this.bR += var3 * (double)0.25F;
      this.a((px)ny.k, 1);
      if (this.n == null) {
         this.c = null;
      }

      if (!this.o.I) {
         this.bB.a(this);
      }

   }

   protected void b(dk var1, int var2) {
      if (var1.m() == ps.c) {
         this.o.a(this, "random.drink", 0.5F, this.o.w.nextFloat() * 0.1F + 0.9F);
      }

      if (var1.m() == ps.b) {
         for(int var3 = 0; var3 < var2; ++var3) {
            fb var4 = fb.b(((double)this.Y.nextFloat() - (double)0.5F) * 0.1, Math.random() * 0.1 + 0.1, (double)0.0F);
            var4.a(-this.z * (float)Math.PI / 180.0F);
            var4.b(-this.y * (float)Math.PI / 180.0F);
            fb var5 = fb.b(((double)this.Y.nextFloat() - (double)0.5F) * 0.3, (double)(-this.Y.nextFloat()) * 0.6 - 0.3, 0.6);
            var5.a(-this.z * (float)Math.PI / 180.0F);
            var5.b(-this.y * (float)Math.PI / 180.0F);
            var5 = var5.c(this.s, this.t + (double)this.E(), this.u);
            this.o.a("iconcrack_" + var1.a().bM, var5.a, var5.b, var5.c, var4.a, var4.b + 0.05, var4.c);
         }

         this.o.a(this, "random.eat", 0.5F + 0.5F * (float)this.Y.nextInt(2), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
      }

   }

   protected void aD() {
      if (this.d != null) {
         this.b((dk)this.d, 16);
         int var1 = this.d.a;
         dk var2 = this.d.b(this.o, this);
         if (var2 != this.d || var2 != null && var2.a != var1) {
            this.by.a[this.by.c] = var2;
            if (var2.a == 0) {
               this.by.a[this.by.c] = null;
            }
         }

         this.aC();
      }

   }

   public void a(byte var1) {
      if (var1 == 9) {
         this.aD();
      } else {
         super.a(var1);
      }

   }

   protected boolean ai() {
      return this.ag() <= 0 || this.ar();
   }

   protected void m() {
      this.bA = this.bz;
   }

   public void U() {
      this.bL = "http://s3.amazonaws.com/MinecraftCloaks/" + this.bJ + ".png";
      this.ae = this.bL;
   }

   public void M() {
      double var1 = this.s;
      double var3 = this.t;
      double var5 = this.u;
      super.M();
      this.bF = this.bG;
      this.bG = 0.0F;
      this.k(this.s - var1, this.t - var3, this.u - var5);
   }

   public void u() {
      this.L = 1.62F;
      this.a(0.6F, 1.8F);
      super.u();
      this.h(this.f_());
      this.aS = 0;
   }

   private int aQ() {
      if (this.a((abg)abg.e)) {
         return 6 - (1 + this.b((abg)abg.e).c()) * 1;
      } else {
         return this.a((abg)abg.f) ? 6 + (1 + this.b((abg)abg.f).c()) * 2 : 6;
      }
   }

   protected void n() {
      int var1 = this.aQ();
      if (this.bH) {
         ++this.bI;
         if (this.bI >= var1) {
            this.bI = 0;
            this.bH = false;
         }
      } else {
         this.bI = 0;
      }

      this.aL = (float)this.bI / (float)var1;
   }

   public void c() {
      if (this.bC > 0) {
         --this.bC;
      }

      if (this.o.v == 0 && this.ag() < this.f_() && this.Z % 20 * 12 == 0) {
         this.a_(1);
      }

      this.by.b();
      this.bF = this.bG;
      super.c();
      this.aI = this.cg;
      this.aJ = this.ch;
      if (this.X()) {
         this.aI = (float)((double)this.aI + (double)this.cg * 0.3);
         this.aJ = (float)((double)this.aJ + (double)this.ch * 0.3);
      }

      float var1 = me.a(this.v * this.v + this.x * this.x);
      float var2 = (float)Math.atan(-this.w * (double)0.2F) * 15.0F;
      if (var1 > 0.1F) {
         var1 = 0.1F;
      }

      if (!this.D || this.ag() <= 0) {
         var1 = 0.0F;
      }

      if (this.D || this.ag() <= 0) {
         var2 = 0.0F;
      }

      this.bG += (var1 - this.bG) * 0.4F;
      this.aV += (var2 - this.aV) * 0.8F;
      if (this.ag() > 0) {
         List var3 = this.o.b((ia)this, (c)this.C.b((double)1.0F, (double)0.0F, (double)1.0F));
         if (var3 != null) {
            for(int var4 = 0; var4 < var3.size(); ++var4) {
               ia var5 = (ia)var3.get(var4);
               if (!var5.K) {
                  this.l(var5);
               }
            }
         }
      }

   }

   private void l(ia var1) {
      var1.a(this);
   }

   public int aE() {
      return this.bE;
   }

   public void a(pm var1) {
      super.a(var1);
      this.a(0.2F, 0.2F);
      this.d(this.s, this.t, this.u);
      this.w = (double)0.1F;
      if (this.bJ.equals("Notch")) {
         this.a(new dk(acy.i, 1), true);
      }

      this.by.g();
      if (var1 != null) {
         this.v = (double)(-me.b((this.aR + this.y) * (float)Math.PI / 180.0F) * 0.1F);
         this.x = (double)(-me.a((this.aR + this.y) * (float)Math.PI / 180.0F) * 0.1F);
      } else {
         this.v = this.x = (double)0.0F;
      }

      this.L = 0.1F;
      this.a((px)ny.y, 1);
   }

   public void b(ia var1, int var2) {
      this.bE += var2;
      if (var1 instanceof vi) {
         this.a((px)ny.A, 1);
      } else {
         this.a((px)ny.z, 1);
      }

   }

   protected int d(int var1) {
      int var2 = ml.a(this.by);
      return var2 > 0 && this.Y.nextInt(var2 + 1) > 0 ? var1 : super.d(var1);
   }

   public void l_() {
      this.a(this.by.a(this.by.c, 1), false);
   }

   public void a(dk var1) {
      this.a(var1, false);
   }

   public void a(dk var1, boolean var2) {
      if (var1 != null) {
         ih var3 = new ih(this.o, this.s, this.t - (double)0.3F + (double)this.E(), this.u, var1);
         var3.c = 40;
         float var4 = 0.1F;
         if (var2) {
            float var5 = this.Y.nextFloat() * 0.5F;
            float var6 = this.Y.nextFloat() * (float)Math.PI * 2.0F;
            var3.v = (double)(-me.a(var6) * var5);
            var3.x = (double)(me.b(var6) * var5);
            var3.w = (double)0.2F;
         } else {
            var4 = 0.3F;
            var3.v = (double)(-me.a(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI) * var4);
            var3.x = (double)(me.b(this.y / 180.0F * (float)Math.PI) * me.b(this.z / 180.0F * (float)Math.PI) * var4);
            var3.w = (double)(-me.a(this.z / 180.0F * (float)Math.PI) * var4 + 0.1F);
            var4 = 0.02F;
            float var10 = this.Y.nextFloat() * (float)Math.PI * 2.0F;
            var4 *= this.Y.nextFloat();
            var3.v += Math.cos((double)var10) * (double)var4;
            var3.w += (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
            var3.x += Math.sin((double)var10) * (double)var4;
         }

         this.a(var3);
         this.a((px)ny.v, 1);
      }
   }

   protected void a(ih var1) {
      this.o.a((ia)var1);
   }

   public float a(yy var1) {
      float var2 = this.by.a(var1);
      float var3 = var2;
      int var4 = ml.b(this.by);
      if (var4 > 0 && this.by.b(var1)) {
         var3 = var2 + (float)(var4 * var4 + 1);
      }

      if (this.a((abg)abg.e)) {
         var3 *= 1.0F + (float)(this.b((abg)abg.e).c() + 1) * 0.2F;
      }

      if (this.a((abg)abg.f)) {
         var3 *= 1.0F - (float)(this.b((abg)abg.f).c() + 1) * 0.2F;
      }

      if (this.a((p)net.minecraft.client.p.g) && !net.minecraft.client.ml.g(this.by)) {
         var3 /= 5.0F;
      }

      if (!this.D) {
         var3 /= 5.0F;
      }

      return var3;
   }

   public boolean b(yy var1) {
      return this.by.b(var1);
   }

   public void b(ik var1) {
      super.b(var1);
      yi var2 = var1.l("Inventory");
      this.by.b(var2);
      this.bK = var1.e("Dimension");
      this.bT = var1.m("Sleeping");
      this.a = var1.d("SleepTimer");
      this.cf = var1.g("XpP");
      this.cd = var1.e("XpLevel");
      this.ce = var1.e("XpTotal");
      if (this.bT) {
         this.bU = new dh(me.c(this.s), me.c(this.t), me.c(this.u));
         this.a(true, true, false);
      }

      if (var1.b("SpawnX") && var1.b("SpawnY") && var1.b("SpawnZ")) {
         this.b = new dh(var1.e("SpawnX"), var1.e("SpawnY"), var1.e("SpawnZ"));
      }

      this.bB.a(var1);
      this.cc.b(var1);
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("Inventory", (um)this.by.a(new yi()));
      var1.a("Dimension", this.bK);
      var1.a("Sleeping", this.bT);
      var1.a("SleepTimer", (short)this.a);
      var1.a("XpP", this.cf);
      var1.a("XpLevel", this.cd);
      var1.a("XpTotal", this.ce);
      if (this.b != null) {
         var1.a("SpawnX", this.b.a);
         var1.a("SpawnY", this.b.b);
         var1.a("SpawnZ", this.b.c);
      }

      this.bB.b(var1);
      this.cc.a(var1);
   }

   public void a(de var1) {
   }

   public void b(int var1, int var2, int var3) {
   }

   public void a(int var1, int var2, int var3) {
   }

   public void a(ia var1, int var2) {
   }

   public float E() {
      return 0.12F;
   }

   protected void aF() {
      this.L = 1.62F;
   }

   public boolean a(pm var1, int var2) {
      if (this.cc.a && !var1.f()) {
         return false;
      } else {
         this.bq = 0;
         if (this.ag() <= 0) {
            return false;
         } else {
            if (this.ar() && !this.o.I) {
               this.a(true, true, false);
            }

            ia var3 = var1.a();
            if (var3 instanceof zo || var3 instanceof ro) {
               if (this.o.v == 0) {
                  var2 = 0;
               }

               if (this.o.v == 1) {
                  var2 = var2 / 2 + 1;
               }

               if (this.o.v == 3) {
                  var2 = var2 * 3 / 2;
               }
            }

            if (var2 == 0) {
               return false;
            } else {
               ia var4 = var3;
               if (var3 instanceof ro && ((ro)var3).c != null) {
                  var4 = ((ro)var3).c;
               }

               if (var4 instanceof nq) {
                  this.a((nq)var4, false);
               }

               this.a(ny.x, var2);
               return super.a(var1, var2);
            }
         }
      }
   }

   protected int d(pm var1, int var2) {
      int var3 = super.d(var1, var2);
      if (var3 <= 0) {
         return 0;
      } else {
         int var4 = ml.a(this.by, var1);
         if (var4 > 20) {
            var4 = 20;
         }

         if (var4 > 0 && var4 <= 20) {
            int var5 = 25 - var4;
            int var6 = var3 * var5 + this.aO;
            var3 = var6 / 25;
            this.aO = var6 % 25;
         }

         return var3;
      }
   }

   protected boolean aG() {
      return false;
   }

   protected void a(nq var1, boolean var2) {
      if (!(var1 instanceof abh) && !(var1 instanceof is)) {
         if (var1 instanceof aik) {
            aik var3 = (aik)var1;
            if (var3.aG() && this.bJ.equals(var3.aD())) {
               return;
            }
         }

         if (!(var1 instanceof vi) || this.aG()) {
            for(ia var5 : (Iterable<ia>)(Iterable)(this.o.a(aik.class, net.minecraft.client.c.b(this.s, this.t, this.u, this.s + (double)1.0F, this.t + (double)1.0F, this.u + (double)1.0F).b((double)16.0F, (double)4.0F, (double)16.0F)))) {
               aik var6 = (aik)var5;
               if (var6.aG() && var6.aC() == null && this.bJ.equals(var6.aD()) && (!var2 || !var6.aE())) {
                  var6.d(false);
                  var6.a((ia)var1);
               }
            }

         }
      }
   }

   protected void i(int var1) {
      this.by.f(var1);
   }

   protected int o_() {
      return this.by.f();
   }

   protected void b(pm var1, int var2) {
      if (!var1.d() && this.aj()) {
         var2 = 1 + var2 >> 1;
      }

      var2 = this.c(var1, var2);
      var2 = this.d(var1, var2);
      this.g(var1.e());
      super.b(var1, var2);
   }

   public void a(oe var1) {
   }

   public void a(bp var1) {
   }

   public void a(u var1) {
   }

   public void a(tt var1) {
   }

   public void j(ia var1) {
      if (!var1.c(this)) {
         dk var2 = this.aH();
         if (var2 != null && var1 instanceof nq) {
            var2.a((nq)var1);
            if (var2.a <= 0) {
               var2.a(this);
               this.aI();
            }
         }

      }
   }

   public dk aH() {
      return this.by.a();
   }

   public void aI() {
      this.by.a(this.by.c, (dk)null);
   }

   public double O() {
      return (double)(this.L - 0.5F);
   }

   public void m_() {
      if (!this.bH || this.bI >= this.aQ() / 2 || this.bI < 0) {
         this.bI = -1;
         this.bH = true;
      }

   }

   public void k(ia var1) {
      int var2 = this.by.a(var1);
      if (this.a((abg)abg.g)) {
         var2 += 3 << this.b((abg)abg.g).c();
      }

      if (this.a((abg)abg.t)) {
         var2 -= 2 << this.b((abg)abg.t).c();
      }

      int var3 = 0;
      int var4 = 0;
      if (var1 instanceof nq) {
         var4 = ml.a(this.by, (nq)var1);
         var3 += ml.b(this.by, (nq)var1);
      }

      if (this.X()) {
         ++var3;
      }

      if (var2 > 0 || var4 > 0) {
         boolean var5 = this.Q > 0.0F && !this.D && !this.ah() && !this.D() && !this.a((abg)abg.q) && this.n == null && var1 instanceof nq;
         if (var5) {
            var2 += this.Y.nextInt(var2 / 2 + 2);
         }

         var2 += var4;
         boolean var6 = var1.a(pm.a(this), var2);
         if (var6) {
            if (var3 > 0) {
               var1.h((double)(-me.a(this.y * (float)Math.PI / 180.0F) * (float)var3 * 0.5F), 0.1, (double)(me.b(this.y * (float)Math.PI / 180.0F) * (float)var3 * 0.5F));
               this.v *= 0.6;
               this.x *= 0.6;
               this.a(false);
            }

            if (var5) {
               this.a(var1);
            }

            if (var4 > 0) {
               this.b(var1);
            }

            if (var2 >= 18) {
               this.a((px)ut.E);
            }
         }

         dk var7 = this.aH();
         if (var7 != null && var1 instanceof nq) {
            var7.a((nq)var1, this);
            if (var7.a <= 0) {
               var7.a(this);
               this.aI();
            }
         }

         if (var1 instanceof nq) {
            if (var1.K()) {
               this.a((nq)var1, true);
            }

            this.a(ny.w, var2);
            int var8 = ml.c(this.by, (nq)var1);
            if (var8 > 0) {
               var1.e(var8 * 4);
            }
         }

         this.g(0.3F);
      }

   }

   public void a(ia var1) {
   }

   public void b(ia var1) {
   }

   public void n_() {
   }

   public abstract void r();

   public void c(dk var1) {
   }

   public void v() {
      super.v();
      this.bz.b(this);
      if (this.bA != null) {
         this.bA.b(this);
      }

   }

   public boolean L() {
      return !this.bT && super.L();
   }

   public qy d(int var1, int var2, int var3) {
      if (!this.o.I) {
         if (this.ar() || !this.K()) {
            return qy.e;
         }

         if (this.o.y.c) {
            return qy.b;
         }

         if (this.o.l()) {
            return qy.c;
         }

         if (Math.abs(this.s - (double)var1) > (double)3.0F || Math.abs(this.t - (double)var2) > (double)2.0F || Math.abs(this.u - (double)var3) > (double)3.0F) {
            return qy.d;
         }

         double var4 = (double)8.0F;
         double var6 = (double)5.0F;
         List var8 = this.o.a(zo.class, net.minecraft.client.c.b((double)var1 - var4, (double)var2 - var6, (double)var3 - var4, (double)var1 + var4, (double)var2 + var6, (double)var3 + var4));
         if (!var8.isEmpty()) {
            return qy.f;
         }
      }

      this.a(0.2F, 0.2F);
      this.L = 0.2F;
      if (this.o.i(var1, var2, var3)) {
         int var9 = this.o.d(var1, var2, var3);
         int var5 = aab.e(var9);
         float var10 = 0.5F;
         float var7 = 0.5F;
         switch (var5) {
            case 0:
               var7 = 0.9F;
               break;
            case 1:
               var10 = 0.1F;
               break;
            case 2:
               var7 = 0.1F;
               break;
            case 3:
               var10 = 0.9F;
         }

         this.b(var5);
         this.d((double)((float)var1 + var10), (double)((float)var2 + 0.9375F), (double)((float)var3 + var7));
      } else {
         this.d((double)((float)var1 + 0.5F), (double)((float)var2 + 0.9375F), (double)((float)var3 + 0.5F));
      }

      this.bT = true;
      this.a = 0;
      this.bU = new dh(var1, var2, var3);
      this.v = this.x = this.w = (double)0.0F;
      if (!this.o.I) {
         this.o.A();
      }

      return qy.a;
   }

   private void b(int var1) {
      this.bV = 0.0F;
      this.bX = 0.0F;
      switch (var1) {
         case 0:
            this.bX = -1.8F;
            break;
         case 1:
            this.bV = 1.8F;
            break;
         case 2:
            this.bX = 1.8F;
            break;
         case 3:
            this.bV = -1.8F;
      }

   }

   public void a(boolean var1, boolean var2, boolean var3) {
      this.a(0.6F, 1.8F);
      this.aF();
      dh var4 = this.bU;
      dh var5 = this.bU;
      if (var4 != null && this.o.a(var4.a, var4.b, var4.c) == yy.S.bM) {
         aab.a(this.o, var4.a, var4.b, var4.c, false);
         var5 = aab.f(this.o, var4.a, var4.b, var4.c, 0);
         if (var5 == null) {
            var5 = new dh(var4.a, var4.b + 1, var4.c);
         }

         this.d((double)((float)var5.a + 0.5F), (double)((float)var5.b + this.L + 0.1F), (double)((float)var5.c + 0.5F));
      }

      this.bT = false;
      if (!this.o.I && var2) {
         this.o.A();
      }

      if (var1) {
         this.a = 0;
      } else {
         this.a = 100;
      }

      if (var3) {
         this.a(this.bU);
      }

   }

   private boolean aR() {
      return this.o.a(this.bU.a, this.bU.b, this.bU.c) == yy.S.bM;
   }

   public static dh a(ry var0, dh var1) {
      ej var2 = var0.x();
      var2.a(var1.a - 3 >> 4, var1.c - 3 >> 4);
      var2.a(var1.a + 3 >> 4, var1.c - 3 >> 4);
      var2.a(var1.a - 3 >> 4, var1.c + 3 >> 4);
      var2.a(var1.a + 3 >> 4, var1.c + 3 >> 4);
      if (var0.a(var1.a, var1.b, var1.c) != yy.S.bM) {
         return null;
      } else {
         dh var3 = aab.f(var0, var1.a, var1.b, var1.c, 0);
         return var3;
      }
   }

   public float aJ() {
      if (this.bU != null) {
         int var1 = this.o.d(this.bU.a, this.bU.b, this.bU.c);
         int var2 = aab.e(var1);
         switch (var2) {
            case 0:
               return 90.0F;
            case 1:
               return 0.0F;
            case 2:
               return 270.0F;
            case 3:
               return 180.0F;
         }
      }

      return 0.0F;
   }

   public boolean ar() {
      return this.bT;
   }

   public boolean aK() {
      return this.bT && this.a >= 100;
   }

   public int aL() {
      return this.a;
   }

   public void b(String var1) {
   }

   public dh aM() {
      return this.b;
   }

   public void a(dh var1) {
      if (var1 != null) {
         this.b = new dh(var1);
      } else {
         this.b = null;
      }

   }

   public void a(px var1) {
      this.a((px)var1, 1);
   }

   public void a(px var1, int var2) {
   }

   protected void ak() {
      super.ak();
      this.a((px)ny.u, 1);
      if (this.X()) {
         this.g(0.8F);
      } else {
         this.g(0.2F);
      }

   }

   public void d(float var1, float var2) {
      double var3 = this.s;
      double var5 = this.t;
      double var7 = this.u;
      if (this.cc.b) {
         double var9 = this.w;
         float var11 = this.aJ;
         this.aJ = 0.05F;
         super.d(var1, var2);
         this.w = var9 * 0.6;
         this.aJ = var11;
      } else {
         super.d(var1, var2);
      }

      this.j(this.s - var3, this.t - var5, this.u - var7);
   }

   public void j(double var1, double var3, double var5) {
      if (this.n == null) {
         if (this.a((p)net.minecraft.client.p.g)) {
            int var7 = net.minecraft.client.web.JMath.round(me.a(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var7 > 0) {
               this.a(ny.q, var7);
               this.g(0.015F * (float)var7 * 0.01F);
            }
         } else if (this.D()) {
            int var8 = net.minecraft.client.web.JMath.round(me.a(var1 * var1 + var5 * var5) * 100.0F);
            if (var8 > 0) {
               this.a(ny.m, var8);
               this.g(0.015F * (float)var8 * 0.01F);
            }
         } else if (this.ah()) {
            if (var3 > (double)0.0F) {
               this.a(ny.o, (int)net.minecraft.client.web.JMath.round(var3 * (double)100.0F));
            }
         } else if (this.D) {
            int var9 = net.minecraft.client.web.JMath.round(me.a(var1 * var1 + var5 * var5) * 100.0F);
            if (var9 > 0) {
               this.a(ny.l, var9);
               if (this.X()) {
                  this.g(0.099999994F * (float)var9 * 0.01F);
               } else {
                  this.g(0.01F * (float)var9 * 0.01F);
               }
            }
         } else {
            int var10 = net.minecraft.client.web.JMath.round(me.a(var1 * var1 + var5 * var5) * 100.0F);
            if (var10 > 25) {
               this.a(ny.p, var10);
            }
         }

      }
   }

   private void k(double var1, double var3, double var5) {
      if (this.n != null) {
         int var7 = net.minecraft.client.web.JMath.round(me.a(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if (var7 > 0) {
            if (this.n instanceof vm) {
               this.a(ny.r, var7);
               if (this.c == null) {
                  this.c = new dh(me.c(this.s), me.c(this.t), me.c(this.u));
               } else if (this.c.a(me.c(this.s), me.c(this.t), me.c(this.u)) >= (double)1000.0F) {
                  this.a((px)ut.q, 1);
               }
            } else if (this.n instanceof no) {
               this.a(ny.s, var7);
            } else if (this.n instanceof fd) {
               this.a(ny.t, var7);
            }
         }
      }

   }

   protected void c(float var1) {
      if (!this.cc.c) {
         if (var1 >= 2.0F) {
            this.a(ny.n, (int)net.minecraft.client.web.JMath.round((double)var1 * (double)100.0F));
         }

         super.c(var1);
      }
   }

   public void a(nq var1) {
      if (var1 instanceof zo) {
         this.a((px)ut.s);
      }

   }

   public int a(dk var1, int var2) {
      int var3 = super.a(var1, var2);
      if (var1.c == acy.aQ.bM && this.ci != null) {
         var3 = var1.b() + 16;
      } else {
         if (var1.c == acy.br.bM) {
            if (var2 == 1) {
               return var1.b();
            }

            return 141;
         }

         if (this.d != null && var1.c == acy.j.bM) {
            int var4 = var1.l() - this.e;
            if (var4 >= 18) {
               return 133;
            }

            if (var4 > 13) {
               return 117;
            }

            if (var4 > 0) {
               return 101;
            }
         }
      }

      return var3;
   }

   public void S() {
      if (this.bY > 0) {
         this.bY = 10;
      } else {
         this.bZ = true;
      }
   }

   public void k(int var1) {
      this.bE += var1;
      this.cf += (float)var1 / (float)this.aN();
      this.ce += var1;

      while(this.cf >= 1.0F) {
         --this.cf;
         this.aS();
      }

   }

   public void l(int var1) {
      this.cd -= var1;
      if (this.cd < 0) {
         this.cd = 0;
      }

   }

   public int aN() {
      return 7 + (this.cd * 7 >> 1);
   }

   private void aS() {
      ++this.cd;
   }

   public void g(float var1) {
      if (!this.cc.a) {
         if (!this.o.I) {
            this.bB.a(var1);
         }

      }
   }

   public eq aO() {
      return this.bB;
   }

   public boolean b(boolean var1) {
      return (var1 || this.bB.c()) && !this.cc.a;
   }

   public boolean aP() {
      return this.ag() > 0 && this.ag() < this.f_();
   }

   public void c(dk var1, int var2) {
      if (var1 != this.d) {
         this.d = var1;
         this.e = var2;
         if (!this.o.I) {
            this.c(true);
         }

      }
   }

   public boolean e(int var1, int var2, int var3) {
      return true;
   }

   protected int b(vi var1) {
      int var2 = this.cd * 7;
      return var2 > 100 ? 100 : var2;
   }

   protected boolean ae() {
      return true;
   }

   public void c(int var1) {
   }

   public void d(vi var1) {
      this.by.a(var1.by);
      this.aM = var1.aM;
      this.bB = var1.bB;
      this.cd = var1.cd;
      this.ce = var1.ce;
      this.cf = var1.cf;
      this.bE = var1.bE;
   }
}
