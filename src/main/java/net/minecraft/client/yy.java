package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class yy {
   public static final wu b = new wu("stone", 1.0F, 1.0F);
   public static final wu c = new wu("wood", 1.0F, 1.0F);
   public static final wu d = new wu("gravel", 1.0F, 1.0F);
   public static final wu e = new wu("grass", 1.0F, 1.0F);
   public static final wu f = new wu("stone", 1.0F, 1.0F);
   public static final wu g = new wu("stone", 1.0F, 1.5F);
   public static final wu h = new bj("stone", 1.0F, 1.0F);
   public static final wu i = new wu("cloth", 1.0F, 1.0F);
   public static final wu j = new aeg("sand", 1.0F, 1.0F);
   public static final yy[] k = new yy[256];
   public static final boolean[] l = new boolean[256];
   public static final boolean[] m = new boolean[256];
   public static final boolean[] n = new boolean[256];
   public static final int[] o = new int[256];
   public static final boolean[] p = new boolean[256];
   public static final int[] q = new int[256];
   public static final boolean[] r = new boolean[256];
   public static boolean[] s = new boolean[256];
   public static final yy t;
   public static final jb u;
   public static final yy v;
   public static final yy w;
   public static final yy x;
   public static final yy y;
   public static final yy z;
   public static final yy A;
   public static final yy B;
   public static final yy C;
   public static final yy D;
   public static final yy E;
   public static final yy F;
   public static final yy G;
   public static final yy H;
   public static final yy I;
   public static final yy J;
   public static final qo K;
   public static final yy L;
   public static final yy M;
   public static final yy N;
   public static final yy O;
   public static final yy P;
   public static final yy Q;
   public static final yy R;
   public static final yy S;
   public static final yy T;
   public static final yy U;
   public static final yy V;
   public static final yy W;
   public static final kv X;
   public static final jl Y;
   public static final yy Z;
   public static final acu aa;
   public static final yy ab;
   public static final qz ac;
   public static final wg ad;
   public static final wg ae;
   public static final wg af;
   public static final wg ag;
   public static final yy ah;
   public static final yy ai;
   public static final yy aj;
   public static final yy ak;
   public static final yy al;
   public static final yy am;
   public static final yy an;
   public static final yy ao;
   public static final yy ap;
   public static final yy aq;
   public static final wj ar;
   public static final yy as;
   public static final yy at;
   public static final yy au;
   public static final yy av;
   public static final yy aw;
   public static final yy ax;
   public static final yy ay;
   public static final yy az;
   public static final yy aA;
   public static final yy aB;
   public static final yy aC;
   public static final yy aD;
   public static final yy aE;
   public static final yy aF;
   public static final yy aG;
   public static final yy aH;
   public static final yy aI;
   public static final yy aJ;
   public static final yy aK;
   public static final yy aL;
   public static final yy aM;
   public static final yy aN;
   public static final yy aO;
   public static final yy aP;
   public static final yy aQ;
   public static final yy aR;
   public static final yy aS;
   public static final yy aT;
   public static final yy aU;
   public static final yy aV;
   public static final yy aW;
   public static final yy aX;
   public static final yy aY;
   public static final yy aZ;
   public static final yy ba;
   public static final yy bb;
   public static final yy bc;
   public static final yy bd;
   public static final sc be;
   public static final yy bf;
   public static final yy bg;
   public static final yy bh;
   public static final yy bi;
   public static final yy bj;
   public static final yy bk;
   public static final yy bl;
   public static final yy bm;
   public static final yy bn;
   public static final yy bo;
   public static final yy bp;
   public static final yy bq;
   public static final yy br;
   public static final yy bs;
   public static final yy bt;
   public static final yy bu;
   public static final yy bv;
   public static final yy bw;
   public static final yy bx;
   public static final ez by;
   public static final yy bz;
   public static final yy bA;
   public static final yy bB;
   public static final yy bC;
   public static final yy bD;
   public static final yy bE;
   public static final yy bF;
   public static final yy bG;
   public static final yy bH;
   public static final yy bI;
   public static final yy bJ;
   public static final yy bK;
   public int bL;
   public final int bM;
   protected float bN;
   protected float bO;
   protected boolean bP;
   protected boolean bQ;
   public double bR;
   public double bS;
   public double bT;
   public double bU;
   public double bV;
   public double bW;
   public wu bX;
   public float bY;
   public final p bZ;
   public float ca;
   private String a;

   protected yy(int var1, p var2) {
      this.bP = true;
      this.bQ = true;
      this.bX = b;
      this.bY = 1.0F;
      this.ca = 0.6F;
      if (k[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + k[var1] + " when adding " + this);
      } else {
         this.bZ = var2;
         k[var1] = this;
         this.bM = var1;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         m[var1] = this.a();
         o[var1] = this.a() ? 255 : 0;
         p[var1] = !var2.c();
         n[var1] = false;
      }
   }

   protected yy l() {
      r[this.bM] = true;
      return this;
   }

   protected void x_() {
   }

   protected yy(int var1, int var2, p var3) {
      this(var1, var3);
      this.bL = var2;
   }

   protected yy a(wu var1) {
      this.bX = var1;
      return this;
   }

   protected yy h(int var1) {
      o[this.bM] = var1;
      return this;
   }

   protected yy a(float var1) {
      q[this.bM] = (int)(15.0F * var1);
      return this;
   }

   protected yy b(float var1) {
      this.bO = var1 * 3.0F;
      return this;
   }

   public boolean b() {
      return true;
   }

   public int c() {
      return 0;
   }

   protected yy c(float var1) {
      this.bN = var1;
      if (this.bO < var1 * 5.0F) {
         this.bO = var1 * 5.0F;
      }

      return this;
   }

   protected yy m() {
      this.c(-1.0F);
      return this;
   }

   public float n() {
      return this.bN;
   }

   protected yy b(boolean var1) {
      l[this.bM] = var1;
      return this;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.bR = (double)var1;
      this.bS = (double)var2;
      this.bT = (double)var3;
      this.bU = (double)var4;
      this.bV = (double)var5;
      this.bW = (double)var6;
   }

   public float d(kq var1, int var2, int var3, int var4) {
      return var1.b(var2, var3, var4, q[this.bM]);
   }

   public int e(kq var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4, q[this.bM]);
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0 && this.bS > (double)0.0F) {
         return true;
      } else if (var5 == 1 && this.bV < (double)1.0F) {
         return true;
      } else if (var5 == 2 && this.bT > (double)0.0F) {
         return true;
      } else if (var5 == 3 && this.bW < (double)1.0F) {
         return true;
      } else if (var5 == 4 && this.bR > (double)0.0F) {
         return true;
      } else if (var5 == 5 && this.bU < (double)1.0F) {
         return true;
      } else {
         return !var1.f(var2, var3, var4);
      }
   }

   public boolean e(kq var1, int var2, int var3, int var4, int var5) {
      return var1.e(var2, var3, var4).b();
   }

   public int a(kq var1, int var2, int var3, int var4, int var5) {
      return this.a(var5, var1.d(var2, var3, var4));
   }

   public int a(int var1, int var2) {
      return this.b(var1);
   }

   public int b(int var1) {
      return this.bL;
   }

   public c c_(ry var1, int var2, int var3, int var4) {
      return net.minecraft.client.c.b((double)var2 + this.bR, (double)var3 + this.bS, (double)var4 + this.bT, (double)var2 + this.bU, (double)var3 + this.bV, (double)var4 + this.bW);
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      c var7 = this.b(var1, var2, var3, var4);
      if (var7 != null && var5.a(var7)) {
         var6.add(var7);
      }

   }

   public c b(ry var1, int var2, int var3, int var4) {
      return net.minecraft.client.c.b((double)var2 + this.bR, (double)var3 + this.bS, (double)var4 + this.bT, (double)var2 + this.bU, (double)var3 + this.bV, (double)var4 + this.bW);
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.k();
   }

   public boolean k() {
      return true;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
   }

   public void b(ry var1, int var2, int var3, int var4, Random var5) {
   }

   public void e(ry var1, int var2, int var3, int var4, int var5) {
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
   }

   public int d() {
      return 10;
   }

   public void a(ry var1, int var2, int var3, int var4) {
   }

   public void d(ry var1, int var2, int var3, int var4) {
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2, int var3) {
      return this.bM;
   }

   public float a(vi var1) {
      if (this.bN < 0.0F) {
         return 0.0F;
      } else {
         return !var1.b(this) ? 1.0F / this.bN / 100.0F : var1.a(this) / this.bN / 30.0F;
      }
   }

   public final void b(ry var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, 1.0F, var6);
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if (!var1.I) {
         int var8 = this.a(var7, var1.w);

         for(int var9 = 0; var9 < var8; ++var9) {
            if (!(var1.w.nextFloat() > var6)) {
               int var10 = this.a(var5, var1.w, var7);
               if (var10 > 0) {
                  this.a(var1, var2, var3, var4, new dk(var10, 1, this.a(var5)));
               }
            }
         }

      }
   }

   protected void a(ry var1, int var2, int var3, int var4, dk var5) {
      if (!var1.I) {
         float var6 = 0.7F;
         double var7 = (double)(var1.w.nextFloat() * var6) + (double)(1.0F - var6) * (double)0.5F;
         double var9 = (double)(var1.w.nextFloat() * var6) + (double)(1.0F - var6) * (double)0.5F;
         double var11 = (double)(var1.w.nextFloat() * var6) + (double)(1.0F - var6) * (double)0.5F;
         ih var13 = new ih(var1, (double)var2 + var7, (double)var3 + var9, (double)var4 + var11, var5);
         var13.c = 10;
         var1.a((ia)var13);
      }
   }

   protected int a(int var1) {
      return 0;
   }

   public float a(ia var1) {
      return this.bO / 5.0F;
   }

   public gv a(ry var1, int var2, int var3, int var4, fb var5, fb var6) {
      this.b((kq)var1, var2, var3, var4);
      var5 = var5.c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.c((double)(-var2), (double)(-var3), (double)(-var4));
      fb var7 = var5.a(var6, this.bR);
      fb var8 = var5.a(var6, this.bU);
      fb var9 = var5.b(var6, this.bS);
      fb var10 = var5.b(var6, this.bV);
      fb var11 = var5.c(var6, this.bT);
      fb var12 = var5.c(var6, this.bW);
      if (!this.a(var7)) {
         var7 = null;
      }

      if (!this.a(var8)) {
         var8 = null;
      }

      if (!this.b(var9)) {
         var9 = null;
      }

      if (!this.b(var10)) {
         var10 = null;
      }

      if (!this.c(var11)) {
         var11 = null;
      }

      if (!this.c(var12)) {
         var12 = null;
      }

      fb var13 = null;
      if (var7 != null && (var13 == null || var5.d(var7) < var5.d(var13))) {
         var13 = var7;
      }

      if (var8 != null && (var13 == null || var5.d(var8) < var5.d(var13))) {
         var13 = var8;
      }

      if (var9 != null && (var13 == null || var5.d(var9) < var5.d(var13))) {
         var13 = var9;
      }

      if (var10 != null && (var13 == null || var5.d(var10) < var5.d(var13))) {
         var13 = var10;
      }

      if (var11 != null && (var13 == null || var5.d(var11) < var5.d(var13))) {
         var13 = var11;
      }

      if (var12 != null && (var13 == null || var5.d(var12) < var5.d(var13))) {
         var13 = var12;
      }

      if (var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if (var13 == var7) {
            var14 = 4;
         }

         if (var13 == var8) {
            var14 = 5;
         }

         if (var13 == var9) {
            var14 = 0;
         }

         if (var13 == var10) {
            var14 = 1;
         }

         if (var13 == var11) {
            var14 = 2;
         }

         if (var13 == var12) {
            var14 = 3;
         }

         return new gv(var2, var3, var4, var14, var13.c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean a(fb var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.b >= this.bS && var1.b <= this.bV && var1.c >= this.bT && var1.c <= this.bW;
      }
   }

   private boolean b(fb var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.a >= this.bR && var1.a <= this.bU && var1.c >= this.bT && var1.c <= this.bW;
      }
   }

   private boolean c(fb var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.a >= this.bR && var1.a <= this.bU && var1.b >= this.bS && var1.b <= this.bV;
      }
   }

   public void i(ry var1, int var2, int var3, int var4) {
   }

   public int h() {
      return 0;
   }

   public boolean d(ry var1, int var2, int var3, int var4, int var5) {
      return this.c(var1, var2, var3, var4);
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 || k[var5].bZ.i();
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      return false;
   }

   public void b(ry var1, int var2, int var3, int var4, ia var5) {
   }

   public void b(ry var1, int var2, int var3, int var4, int var5) {
   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5, fb var6) {
   }

   public void b(kq var1, int var2, int var3, int var4) {
   }

   public int f() {
      return 16777215;
   }

   public int c(int var1) {
      return 16777215;
   }

   public int a(kq var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean b(kq var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean g() {
      return false;
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5) {
   }

   public boolean c(ry var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void e() {
   }

   public void a(ry var1, vi var2, int var3, int var4, int var5, int var6) {
      var2.a((px)ny.C[this.bM], 1);
      var2.g(0.025F);
      if (this.b() && !n[this.bM] && ml.d(var2.by)) {
         dk var8 = this.c_(var6);
         if (var8 != null) {
            this.a(var1, var3, var4, var5, var8);
         }
      } else {
         int var7 = ml.e(var2.by);
         this.b(var1, var3, var4, var5, var6, var7);
      }

   }

   protected dk c_(int var1) {
      int var2 = 0;
      if (this.bM >= 0 && this.bM < acy.d.length && acy.d[this.bM].f()) {
         var2 = var1;
      }

      return new dk(this.bM, 1, var2);
   }

   public int a(int var1, Random var2) {
      return this.a(var2);
   }

   public boolean e(ry var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
   }

   public yy a(String var1) {
      this.a = "tile." + var1;
      return this;
   }

   public String o() {
      return hj.a(this.p() + ".name");
   }

   public String p() {
      return this.a;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public boolean q() {
      return this.bQ;
   }

   protected yy r() {
      this.bQ = false;
      return this;
   }

   public int i() {
      return this.bZ.l();
   }

   public float f(kq var1, int var2, int var3, int var4) {
      return var1.g(var2, var3, var4) ? 0.2F : 1.0F;
   }

   static {
      t = (new gm(1, 1)).c(1.5F).b(10.0F).a(f).a("stone");
      u = (jb)(new jb(2)).c(0.6F).a(e).a("grass");
      v = (new agd(3, 2)).c(0.5F).a(d).a("dirt");
      w = (new yy(4, 16, net.minecraft.client.p.e)).c(2.0F).b(10.0F).a(f).a("stonebrick");
      x = (new yy(5, 4, net.minecraft.client.p.d)).c(2.0F).b(5.0F).a(c).a("wood").l();
      y = (new aet(6, 15)).c(0.0F).a(e).a("sapling").l();
      z = (new yy(7, 17, net.minecraft.client.p.e)).m().b(6000000.0F).a(f).a("bedrock").r();
      A = (new ahx(8, net.minecraft.client.p.g)).c(100.0F).h(3).a("water").r().l();
      B = (new add(9, net.minecraft.client.p.g)).c(100.0F).h(3).a("water").r().l();
      C = (new ahx(10, net.minecraft.client.p.h)).c(0.0F).a(1.0F).h(255).a("lava").r().l();
      D = (new add(11, net.minecraft.client.p.h)).c(100.0F).a(1.0F).h(255).a("lava").r().l();
      E = (new cj(12, 18)).c(0.5F).a(j).a("sand");
      F = (new kb(13, 19)).c(0.6F).a(d).a("gravel");
      G = (new v(14, 32)).c(3.0F).b(5.0F).a(f).a("oreGold");
      H = (new v(15, 33)).c(3.0F).b(5.0F).a(f).a("oreIron");
      I = (new v(16, 34)).c(3.0F).b(5.0F).a(f).a("oreCoal");
      J = (new aip(17)).c(2.0F).a(c).a("log").l();
      K = (qo)(new qo(18, 52)).c(0.2F).h(1).a(e).a("leaves").l();
      L = (new wh(19)).c(0.6F).a(e).a("sponge");
      M = (new aho(20, 49, net.minecraft.client.p.q, false)).c(0.3F).a(h).a("glass");
      N = (new v(21, 160)).c(3.0F).b(5.0F).a(f).a("oreLapis");
      O = (new yy(22, 144, net.minecraft.client.p.e)).c(3.0F).b(5.0F).a(f).a("blockLapis");
      P = (new cu(23)).c(3.5F).a(f).a("dispenser").l();
      Q = (new aat(24)).a(f).c(0.8F).a("sandStone");
      R = (new yq(25)).c(0.8F).a("musicBlock").l();
      S = (new aab(26)).c(0.2F).a("bed").r().l();
      T = (new afr(27, 179, true)).c(0.7F).a(g).a("goldenRail").l();
      U = (new ags(28, 195)).c(0.7F).a(g).a("detectorRail").l();
      V = (new abr(29, 106, true)).a("pistonStickyBase").l();
      W = (new kc(30, 11)).h(1).c(4.0F).a("web");
      X = (kv)(new kv(31, 39)).c(0.0F).a(e).a("tallgrass");
      Y = (jl)(new jl(32, 55)).c(0.0F).a(e).a("deadbush");
      Z = (new abr(33, 107, false)).a("pistonBase").l();
      aa = (acu)(new acu(34, 107)).l();
      ab = (new fr()).c(0.8F).a(i).a("cloth").l();
      ac = new qz(36);
      ad = (wg)(new wg(37, 13)).c(0.0F).a(e).a("flower");
      ae = (wg)(new wg(38, 12)).c(0.0F).a(e).a("rose");
      af = (wg)(new js(39, 29)).c(0.0F).a(e).a(0.125F).a("mushroom");
      ag = (wg)(new js(40, 28)).c(0.0F).a(e).a("mushroom");
      ah = (new rs(41, 23)).c(3.0F).b(10.0F).a(g).a("blockGold");
      ai = (new rs(42, 22)).c(5.0F).b(10.0F).a(g).a("blockIron");
      aj = (new xs(43, true)).c(2.0F).b(10.0F).a(f).a("stoneSlab");
      ak = (new xs(44, false)).c(2.0F).b(10.0F).a(f).a("stoneSlab");
      al = (new yy(45, 7, net.minecraft.client.p.e)).c(2.0F).b(10.0F).a(f).a("brick");
      am = (new abm(46, 8)).c(0.0F).a(e).a("tnt");
      an = (new ay(47, 35)).c(1.5F).a(c).a("bookshelf");
      ao = (new yy(48, 36, net.minecraft.client.p.e)).c(2.0F).b(10.0F).a(f).a("stoneMoss");
      ap = (new ain(49, 37)).c(50.0F).b(2000.0F).a(f).a("obsidian");
      aq = (new bg(50, 80)).c(0.0F).a(0.9375F).a(c).a("torch").l();
      ar = (wj)(new wj(51, 31)).c(0.0F).a(1.0F).a(c).a("fire").r();
      as = (new kk(52, 65)).c(5.0F).a(g).a("mobSpawner").r();
      at = (new ahh(53, x)).a("stairsWood").l();
      au = (new au(54)).c(2.5F).a(c).a("chest").l();
      av = (new kw(55, 164)).c(0.0F).a(b).a("redstoneDust").r().l();
      aw = (new v(56, 50)).c(3.0F).b(5.0F).a(f).a("oreDiamond");
      ax = (new rs(57, 24)).c(5.0F).b(10.0F).a(g).a("blockDiamond");
      ay = (new rn(58)).c(2.5F).a(c).a("workbench");
      az = (new aha(59, 88)).c(0.0F).a(e).a("crops").r().l();
      aA = (new ni(60)).c(0.6F).a(d).a("farmland").l();
      aB = (new eu(61, false)).c(3.5F).a(f).a("furnace").l();
      aC = (new eu(62, true)).c(3.5F).a(f).a(0.875F).a("furnace").l();
      aD = (new mr(63, u.class, true)).c(1.0F).a(c).a("sign").r().l();
      aE = (new uc(64, net.minecraft.client.p.d)).c(3.0F).a(c).a("doorWood").r().l();
      aF = (new afu(65, 83)).c(0.4F).a(c).a("ladder").l();
      aG = (new afr(66, 128, false)).c(0.7F).a(g).a("rail").l();
      aH = (new ahh(67, w)).a("stairsStone").l();
      aI = (new mr(68, u.class, false)).c(1.0F).a(c).a("sign").r().l();
      aJ = (new aaa(69, 96)).c(0.5F).a(c).a("lever").l();
      aK = (new wx(70, t.bL, xb.b, net.minecraft.client.p.e)).c(0.5F).a(f).a("pressurePlate").l();
      aL = (new uc(71, net.minecraft.client.p.f)).c(5.0F).a(g).a("doorIron").r().l();
      aM = (new wx(72, x.bL, xb.a, net.minecraft.client.p.d)).c(0.5F).a(c).a("pressurePlate").l();
      aN = (new oc(73, 51, false)).c(3.0F).b(5.0F).a(f).a("oreRedstone").l();
      aO = (new oc(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(f).a("oreRedstone").l();
      aP = (new ku(75, 115, false)).c(0.0F).a(c).a("notGate").l();
      aQ = (new ku(76, 99, true)).c(0.0F).a(0.5F).a(c).a("notGate").l();
      aR = (new ahv(77, t.bL)).c(0.5F).a(f).a("button").l();
      aS = (new aif(78, 66)).c(0.1F).a(i).a("snow").h(0);
      aT = (new ahq(79, 67)).c(0.5F).h(3).a(h).a("ice");
      aU = (new jk(80, 66)).c(0.2F).a(i).a("snow");
      aV = (new ow(81, 70)).c(0.4F).a(i).a("cactus");
      aW = (new pc(82, 72)).c(0.6F).a(d).a("clay");
      aX = (new md(83, 73)).c(0.0F).a(e).a("reeds").r();
      aY = (new abl(84, 74)).c(2.0F).b(10.0F).a(f).a("jukebox").l();
      aZ = (new nz(85, 4)).c(2.0F).b(5.0F).a(c).a("fence");
      ba = (new nf(86, 102, false)).c(1.0F).a(c).a("pumpkin").l();
      bb = (new et(87, 103)).c(0.4F).a(f).a("hellrock");
      bc = (new mq(88, 104)).c(0.5F).a(j).a("hellsand");
      bd = (new sk(89, 105, net.minecraft.client.p.q)).c(0.3F).a(h).a(1.0F).a("lightgem");
      be = (sc)(new sc(90, 14)).c(-1.0F).a(h).a(0.75F).a("portal");
      bf = (new nf(91, 102, true)).c(1.0F).a(c).a(1.0F).a("litpumpkin").l();
      bg = (new aem(92, 121)).c(0.5F).a(i).a("cake").r().l();
      bh = (new mz(93, false)).c(0.0F).a(c).a("diode").r().l();
      bi = (new mz(94, true)).c(0.0F).a(0.625F).a(c).a("diode").r().l();
      bj = (new vj(95)).c(0.0F).a(1.0F).a(c).a("lockedchest").b(true).l();
      bk = (new mf(96, net.minecraft.client.p.d)).c(3.0F).a(c).a("trapdoor").r().l();
      bl = (new vf(97)).c(0.75F);
      bm = (new jh(98)).c(1.5F).b(10.0F).a(f).a("stonebricksmooth");
      bn = (new wd(99, net.minecraft.client.p.d, 142, 0)).c(0.2F).a(c).a("mushroom").l();
      bo = (new wd(100, net.minecraft.client.p.d, 142, 1)).c(0.2F).a(c).a("mushroom").l();
      bp = (new uh(101, 85, 85, net.minecraft.client.p.f, true)).c(5.0F).b(10.0F).a(g).a("fenceIron");
      bq = (new uh(102, 49, 148, net.minecraft.client.p.q, false)).c(0.3F).a(h).a("thinGlass");
      br = (new of(103)).c(1.0F).a(c).a("melon");
      bs = (new pu(104, ba)).c(0.0F).a(c).a("pumpkinStem").l();
      bt = (new pu(105, br)).c(0.0F).a(c).a("pumpkinStem").l();
      bu = (new ahl(106)).c(0.2F).a(e).a("vine").l();
      bv = (new fp(107, 4)).c(2.0F).b(5.0F).a(c).a("fenceGate").l();
      bw = (new ahh(108, al)).a("stairsBrick").l();
      bx = (new ahh(109, bm)).a("stairsStoneBrickSmooth").l();
      by = (ez)(new ez(110)).c(0.6F).a(e).a("mycel");
      bz = (new qi(111, 76)).c(0.0F).a(e).a("waterlily");
      bA = (new yy(112, 224, net.minecraft.client.p.e)).c(2.0F).b(10.0F).a(f).a("netherBrick");
      bB = (new nz(113, 224, net.minecraft.client.p.e)).c(2.0F).b(10.0F).a(f).a("netherFence");
      bC = (new ahh(114, bA)).a("stairsNetherBrick").l();
      bD = (new vy(115)).a("netherStalk").l();
      bE = (new sy(116)).c(5.0F).b(2000.0F).a("enchantmentTable");
      bF = (new ahp(117)).c(0.5F).a(0.125F).a("brewingStand").l();
      bG = (new ic(118)).c(2.0F).a("cauldron").l();
      bH = (new aid(119, net.minecraft.client.p.A)).c(-1.0F).b(6000000.0F);
      bI = (new rl(120)).a(h).a(0.125F).c(-1.0F).a("endPortalFrame").l().b(6000000.0F);
      bJ = (new yy(121, 175, net.minecraft.client.p.e)).c(3.0F).b(15.0F).a(f).a("whiteStone");
      bK = (new aci(122, 167)).c(3.0F).b(15.0F).a(f).a(0.125F).a("dragonEgg");
      acy.d[ab.bM] = (new ahb(ab.bM - 256)).a("cloth");
      acy.d[J.bM] = (new afm(J.bM - 256, J)).a("log");
      acy.d[bm.bM] = (new afm(bm.bM - 256, bm)).a("stonebricksmooth");
      acy.d[ak.bM] = (new r(ak.bM - 256)).a("stoneSlab");
      acy.d[y.bM] = (new z(y.bM - 256)).a("sapling");
      acy.d[K.bM] = (new og(K.bM - 256)).a("leaves");
      acy.d[bu.bM] = new hf(bu.bM - 256, false);
      acy.d[X.bM] = (new hf(X.bM - 256, true)).a(new String[]{"shrub", "grass", "fern"});
      acy.d[bz.bM] = new pd(bz.bM - 256);
      acy.d[Z.bM] = new afi(Z.bM - 256);
      acy.d[V.bM] = new afi(V.bM - 256);

      for(int var0 = 0; var0 < 256; ++var0) {
         if (k[var0] != null) {
            if (acy.d[var0] == null) {
               acy.d[var0] = new uw(var0 - 256);
               k[var0].x_();
            }

            boolean var1 = false;
            if (var0 > 0 && k[var0].c() == 10) {
               var1 = true;
            }

            if (var0 > 0 && k[var0] instanceof xs) {
               var1 = true;
            }

            if (var0 == aA.bM) {
               var1 = true;
            }

            s[var0] = var1;
         }
      }

      p[0] = true;
      ny.b();
   }
}
