package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class acy {
   protected static Random c = new net.minecraft.client.web.JRandom();
   public static acy[] d = new acy[32000];
   public static acy e;
   public static acy f;
   public static acy g;
   public static acy h;
   public static acy i;
   public static acy j;
   public static acy k;
   public static acy l;
   public static acy m;
   public static acy n;
   public static acy o;
   public static acy p;
   public static acy q;
   public static acy r;
   public static acy s;
   public static acy t;
   public static acy u;
   public static acy v;
   public static acy w;
   public static acy x;
   public static acy y;
   public static acy z;
   public static acy A;
   public static acy B;
   public static acy C;
   public static acy D;
   public static acy E;
   public static acy F;
   public static acy G;
   public static acy H;
   public static acy I;
   public static acy J;
   public static acy K;
   public static acy L;
   public static acy M;
   public static acy N;
   public static acy O;
   public static acy P;
   public static acy Q;
   public static acy R;
   public static acy S;
   public static acy T;
   public static acy U;
   public static acy V;
   public static acy W;
   public static acy X;
   public static acy Y;
   public static acy Z;
   public static acy aa;
   public static acy ab;
   public static acy ac;
   public static acy ad;
   public static acy ae;
   public static acy af;
   public static acy ag;
   public static acy ah;
   public static acy ai;
   public static acy aj;
   public static acy ak;
   public static acy al;
   public static acy am;
   public static acy an;
   public static acy ao;
   public static acy ap;
   public static acy aq;
   public static acy ar;
   public static acy as;
   public static acy at;
   public static acy au;
   public static acy av;
   public static acy aw;
   public static acy ax;
   public static acy ay;
   public static acy az;
   public static acy aA;
   public static acy aB;
   public static acy aC;
   public static acy aD;
   public static acy aE;
   public static acy aF;
   public static acy aG;
   public static acy aH;
   public static acy aI;
   public static acy aJ;
   public static acy aK;
   public static acy aL;
   public static acy aM;
   public static acy aN;
   public static acy aO;
   public static acy aP;
   public static acy aQ;
   public static acy aR;
   public static acy aS;
   public static acy aT;
   public static acy aU;
   public static acy aV;
   public static acy aW;
   public static acy aX;
   public static acy aY;
   public static acy aZ;
   public static acy ba;
   public static acy bb;
   public static bv bc;
   public static abo bd;
   public static acy be;
   public static acy bf;
   public static acy bg;
   public static acy bh;
   public static acy bi;
   public static acy bj;
   public static acy bk;
   public static acy bl;
   public static acy bm;
   public static acy bn;
   public static acy bo;
   public static acy bp;
   public static acy bq;
   public static abk br;
   public static acy bs;
   public static acy bt;
   public static acy bu;
   public static acy bv;
   public static acy bw;
   public static acy bx;
   public static acy by;
   public static acy bz;
   public static acy bA;
   public static acy bB;
   public static acy bC;
   public static acy bD;
   public static acy bE;
   public static acy bF;
   public static acy bG;
   public static acy bH;
   public static acy bI;
   public static acy bJ;
   public static acy bK;
   public static acy bL;
   public final int bM;
   protected int bN = 64;
   private int a = 0;
   protected int bO;
   protected boolean bP = false;
   protected boolean bQ = false;
   private acy b = null;
   private String bR = null;
   private String bS;

   protected acy(int var1) {
      this.bM = 256 + var1;
      if (d[256 + var1] != null) {
         System.out.println("CONFLICT @ " + var1);
      }

      d[256 + var1] = this;
   }

   public acy g(int var1) {
      this.bO = var1;
      return this;
   }

   public acy h(int var1) {
      this.bN = var1;
      return this;
   }

   public acy a(int var1, int var2) {
      this.bO = var1 + var2 * 16;
      return this;
   }

   public int a(int var1) {
      return this.bO;
   }

   public final int h(dk var1) {
      return this.a(var1.i());
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      return false;
   }

   public float a(dk var1, yy var2) {
      return 1.0F;
   }

   public dk c(dk var1, ry var2, vi var3) {
      return var1;
   }

   public dk a(dk var1, ry var2, vi var3) {
      return var1;
   }

   public int e() {
      return this.bN;
   }

   public int b(int var1) {
      return 0;
   }

   public boolean f() {
      return this.bQ;
   }

   protected acy a(boolean var1) {
      this.bQ = var1;
      return this;
   }

   public int g() {
      return this.a;
   }

   protected acy i(int var1) {
      this.a = var1;
      return this;
   }

   public boolean h() {
      return this.a > 0 && !this.bQ;
   }

   public boolean a(dk var1, nq var2, nq var3) {
      return false;
   }

   public boolean a(dk var1, int var2, int var3, int var4, int var5, nq var6) {
      return false;
   }

   public int a(ia var1) {
      return 1;
   }

   public boolean a(yy var1) {
      return false;
   }

   public void a(dk var1, nq var2) {
   }

   public acy i() {
      this.bP = true;
      return this;
   }

   public boolean a() {
      return this.bP;
   }

   public boolean b() {
      return false;
   }

   public acy a(String var1) {
      this.bS = "item." + var1;
      return this;
   }

   public String i(dk var1) {
      String var2 = this.a(var1);
      return var2 == null ? "" : hj.a(var2);
   }

   public String d() {
      return this.bS;
   }

   public String a(dk var1) {
      return this.bS;
   }

   public acy a(acy var1) {
      if (this.bN > 1) {
         throw new IllegalArgumentException("Max stack size must be 1 for items with crafting results");
      } else {
         this.b = var1;
         return this;
      }
   }

   public acy j() {
      return this.b;
   }

   public boolean k() {
      return this.b != null;
   }

   public String l() {
      return hj.a(this.d() + ".name");
   }

   public int c(int var1) {
      return 16777215;
   }

   public void a(dk var1, ry var2, ia var3, int var4, boolean var5) {
   }

   public void b(dk var1, ry var2, vi var3) {
   }

   public ps c(dk var1) {
      return ps.a;
   }

   public int b(dk var1) {
      return 0;
   }

   public void a(dk var1, ry var2, vi var3, int var4) {
   }

   protected acy b(String var1) {
      this.bR = var1;
      return this;
   }

   public String m() {
      return this.bR;
   }

   public boolean n() {
      return this.bR != null;
   }

   public void a(dk var1, List var2) {
   }

   public String f(dk var1) {
      String var2 = ("" + qp.a().b(this.i(var1))).trim();
      return var2;
   }

   public boolean g(dk var1) {
      return var1.u();
   }

   public ja d(dk var1) {
      return var1.u() ? ja.c : ja.a;
   }

   public boolean j(dk var1) {
      return this.e() == 1 && this.h();
   }

   protected gv a(ry var1, vi var2, boolean var3) {
      float var4 = 1.0F;
      float var5 = var2.B + (var2.z - var2.B) * var4;
      float var6 = var2.A + (var2.y - var2.A) * var4;
      double var7 = var2.p + (var2.s - var2.p) * (double)var4;
      double var9 = var2.q + (var2.t - var2.q) * (double)var4 + 1.62 - (double)var2.L;
      double var11 = var2.r + (var2.u - var2.r) * (double)var4;
      fb var13 = fb.b(var7, var9, var11);
      float var14 = me.b(-var6 * ((float)Math.PI / 180F) - (float)Math.PI);
      float var15 = me.a(-var6 * ((float)Math.PI / 180F) - (float)Math.PI);
      float var16 = -me.b(-var5 * ((float)Math.PI / 180F));
      float var17 = me.a(-var5 * ((float)Math.PI / 180F));
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = (double)5.0F;
      fb var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      gv var24 = var1.a(var13, var23, var3, !var3);
      return var24;
   }

   public int c() {
      return 0;
   }

   static {
      e = (new adb(0, nu.c)).a(2, 5).a("shovelIron");
      f = (new zu(1, nu.c)).a(2, 6).a("pickaxeIron");
      g = (new ago(2, nu.c)).a(2, 7).a("hatchetIron");
      h = (new ou(3)).a(5, 0).a("flintAndSteel");
      i = (new agu(4, 4, 0.3F, false)).a(10, 0).a("apple");
      j = (new il(5)).a(5, 1).a("bow");
      k = (new acy(6)).a(5, 2).a("arrow");
      l = (new pr(7)).a(7, 0).a("coal");
      m = (new acy(8)).a(7, 3).a("emerald");
      n = (new acy(9)).a(7, 1).a("ingotIron");
      o = (new acy(10)).a(7, 2).a("ingotGold");
      p = (new zp(11, nu.c)).a(2, 4).a("swordIron");
      q = (new zp(12, nu.a)).a(0, 4).a("swordWood");
      r = (new adb(13, nu.a)).a(0, 5).a("shovelWood");
      s = (new zu(14, nu.a)).a(0, 6).a("pickaxeWood");
      t = (new ago(15, nu.a)).a(0, 7).a("hatchetWood");
      u = (new zp(16, nu.b)).a(1, 4).a("swordStone");
      v = (new adb(17, nu.b)).a(1, 5).a("shovelStone");
      w = (new zu(18, nu.b)).a(1, 6).a("pickaxeStone");
      x = (new ago(19, nu.b)).a(1, 7).a("hatchetStone");
      y = (new zp(20, nu.d)).a(3, 4).a("swordDiamond");
      z = (new adb(21, nu.d)).a(3, 5).a("shovelDiamond");
      A = (new zu(22, nu.d)).a(3, 6).a("pickaxeDiamond");
      B = (new ago(23, nu.d)).a(3, 7).a("hatchetDiamond");
      C = (new acy(24)).a(5, 3).i().a("stick");
      D = (new acy(25)).a(7, 4).a("bowl");
      E = (new l(26, 8)).a(8, 4).a("mushroomStew");
      F = (new zp(27, nu.e)).a(4, 4).a("swordGold");
      G = (new adb(28, nu.e)).a(4, 5).a("shovelGold");
      H = (new zu(29, nu.e)).a(4, 6).a("pickaxeGold");
      I = (new ago(30, nu.e)).a(4, 7).a("hatchetGold");
      J = (new acy(31)).a(8, 0).a("string");
      K = (new acy(32)).a(8, 1).a("feather");
      L = (new acy(33)).a(8, 2).a("sulphur").b(pk.k);
      M = (new wr(34, nu.a)).a(0, 8).a("hoeWood");
      N = (new wr(35, nu.b)).a(1, 8).a("hoeStone");
      O = (new wr(36, nu.c)).a(2, 8).a("hoeIron");
      P = (new wr(37, nu.d)).a(3, 8).a("hoeDiamond");
      Q = (new wr(38, nu.e)).a(4, 8).a("hoeGold");
      R = (new adf(39, yy.az.bM, yy.aA.bM)).a(9, 0).a("seeds");
      S = (new acy(40)).a(9, 1).a("wheat");
      T = (new agu(41, 5, 0.6F, false)).a(9, 2).a("bread");
      U = (new agi(42, dj.a, 0, 0)).a(0, 0).a("helmetCloth");
      V = (new agi(43, dj.a, 0, 1)).a(0, 1).a("chestplateCloth");
      W = (new agi(44, dj.a, 0, 2)).a(0, 2).a("leggingsCloth");
      X = (new agi(45, dj.a, 0, 3)).a(0, 3).a("bootsCloth");
      Y = (new agi(46, dj.b, 1, 0)).a(1, 0).a("helmetChain");
      Z = (new agi(47, dj.b, 1, 1)).a(1, 1).a("chestplateChain");
      aa = (new agi(48, dj.b, 1, 2)).a(1, 2).a("leggingsChain");
      ab = (new agi(49, dj.b, 1, 3)).a(1, 3).a("bootsChain");
      ac = (new agi(50, dj.c, 2, 0)).a(2, 0).a("helmetIron");
      ad = (new agi(51, dj.c, 2, 1)).a(2, 1).a("chestplateIron");
      ae = (new agi(52, dj.c, 2, 2)).a(2, 2).a("leggingsIron");
      af = (new agi(53, dj.c, 2, 3)).a(2, 3).a("bootsIron");
      ag = (new agi(54, dj.e, 3, 0)).a(3, 0).a("helmetDiamond");
      ah = (new agi(55, dj.e, 3, 1)).a(3, 1).a("chestplateDiamond");
      ai = (new agi(56, dj.e, 3, 2)).a(3, 2).a("leggingsDiamond");
      aj = (new agi(57, dj.e, 3, 3)).a(3, 3).a("bootsDiamond");
      ak = (new agi(58, dj.d, 4, 0)).a(4, 0).a("helmetGold");
      al = (new agi(59, dj.d, 4, 1)).a(4, 1).a("chestplateGold");
      am = (new agi(60, dj.d, 4, 2)).a(4, 2).a("leggingsGold");
      an = (new agi(61, dj.d, 4, 3)).a(4, 3).a("bootsGold");
      ao = (new acy(62)).a(6, 0).a("flint");
      ap = (new agu(63, 3, 0.3F, true)).a(7, 5).a("porkchopRaw");
      aq = (new agu(64, 8, 0.8F, true)).a(8, 5).a("porkchopCooked");
      ar = (new ve(65)).a(10, 1).a("painting");
      as = (new afk(66, 10, 1.2F, false)).r().a(abg.l.H, 30, 0, 1.0F).a(11, 0).a("appleGold");
      at = (new my(67)).a(10, 2).a("sign");
      au = (new zg(68, net.minecraft.client.p.d)).a(11, 2).a("doorWood");
      av = (new en(69, 0)).a(10, 4).a("bucket");
      aw = (new en(70, yy.A.bM)).a(11, 4).a("bucketWater").a(av);
      ax = (new en(71, yy.C.bM)).a(12, 4).a("bucketLava").a(av);
      ay = (new aex(72, 0)).a(7, 8).a("minecart");
      az = (new acg(73)).a(8, 6).a("saddle");
      aA = (new zg(74, net.minecraft.client.p.f)).a(12, 2).a("doorIron");
      aB = (new dl(75)).a(8, 3).a("redstone").b(pk.i);
      aC = (new re(76)).a(14, 0).a("snowball");
      aD = (new abv(77)).a(8, 8).a("boat");
      aE = (new acy(78)).a(7, 6).a("leather");
      aF = (new om(79)).a(13, 4).a("milk").a(av);
      aG = (new acy(80)).a(6, 1).a("brick");
      aH = (new acy(81)).a(9, 3).a("clay");
      aI = (new to(82, yy.aX)).a(11, 1).a("reeds");
      aJ = (new acy(83)).a(10, 3).a("paper");
      aK = (new acy(84)).a(11, 3).a("book");
      aL = (new acy(85)).a(14, 1).a("slimeball");
      aM = (new aex(86, 1)).a(7, 9).a("minecartChest");
      aN = (new aex(87, 2)).a(7, 10).a("minecartFurnace");
      aO = (new sb(88)).a(12, 0).a("egg");
      aP = (new acy(89)).a(6, 3).a("compass");
      aQ = (new hd(90)).a(5, 4).a("fishingRod");
      aR = (new acy(91)).a(6, 4).a("clock");
      aS = (new acy(92)).a(9, 4).a("yellowDust").b(pk.j);
      aT = (new agu(93, 2, 0.3F, false)).a(9, 5).a("fishRaw");
      aU = (new agu(94, 5, 0.6F, false)).a(10, 5).a("fishCooked");
      aV = (new xv(95)).a(14, 4).a("dyePowder");
      aW = (new acy(96)).a(12, 1).a("bone").i();
      aX = (new acy(97)).a(13, 0).a("sugar").b(pk.b);
      aY = (new to(98, yy.bg)).h(1).a(13, 1).a("cake");
      aZ = (new kn(99)).h(1).a(13, 2).a("bed");
      ba = (new to(100, yy.bh)).a(6, 5).a("diode");
      bb = (new agu(101, 1, 0.1F, false)).a(12, 5).a("cookie");
      bc = (bv)(new bv(102)).a(12, 3).a("map");
      bd = (abo)(new abo(103)).a(13, 5).a("shears");
      be = (new agu(104, 2, 0.3F, false)).a(13, 6).a("melon");
      bf = (new adf(105, yy.bs.bM, yy.aA.bM)).a(13, 3).a("seeds_pumpkin");
      bg = (new adf(106, yy.bt.bM, yy.aA.bM)).a(14, 3).a("seeds_melon");
      bh = (new agu(107, 3, 0.3F, true)).a(9, 6).a("beefRaw");
      bi = (new agu(108, 8, 0.8F, true)).a(10, 6).a("beefCooked");
      bj = (new agu(109, 2, 0.3F, true)).a(abg.s.H, 30, 0, 0.3F).a(9, 7).a("chickenRaw");
      bk = (new agu(110, 6, 0.6F, true)).a(10, 7).a("chickenCooked");
      bl = (new agu(111, 4, 0.1F, true)).a(abg.s.H, 30, 0, 0.8F).a(11, 5).a("rottenFlesh");
      bm = (new eo(112)).a(11, 6).a("enderPearl");
      bn = (new acy(113)).a(12, 6).a("blazeRod");
      bo = (new acy(114)).a(11, 7).a("ghastTear").b(pk.c);
      bp = (new acy(115)).a(12, 7).a("goldNugget");
      bq = (new adf(116, yy.bD.bM, yy.bc.bM)).a(13, 7).a("netherStalkSeeds").b("+4");
      br = (abk)(new abk(117)).a(13, 8).a("potion");
      bs = (new qc(118)).a(12, 8).a("glassBottle");
      bt = (new agu(119, 2, 0.8F, false)).a(abg.u.H, 5, 0, 1.0F).a(11, 8).a("spiderEye").b(pk.d);
      bu = (new acy(120)).a(10, 8).a("fermentedSpiderEye").b(pk.e);
      bv = (new acy(121)).a(13, 9).a("blazePowder").b(pk.g);
      bw = (new acy(122)).a(13, 10).a("magmaCream").b(pk.h);
      bx = (new to(123, yy.bF)).a(12, 10).a("brewingStand");
      by = (new to(124, yy.bG)).a(12, 9).a("cauldron");
      bz = (new aag(125)).a(11, 9).a("eyeOfEnder");
      bA = (new acy(126)).a(9, 8).a("speckledMelon").b(pk.f);
      bB = (new pe(2000, "13")).a(0, 15).a("record");
      bC = (new pe(2001, "cat")).a(1, 15).a("record");
      bD = (new pe(2002, "blocks")).a(2, 15).a("record");
      bE = (new pe(2003, "chirp")).a(3, 15).a("record");
      bF = (new pe(2004, "far")).a(4, 15).a("record");
      bG = (new pe(2005, "mall")).a(5, 15).a("record");
      bH = (new pe(2006, "mellohi")).a(6, 15).a("record");
      bI = (new pe(2007, "stal")).a(7, 15).a("record");
      bJ = (new pe(2008, "strad")).a(8, 15).a("record");
      bK = (new pe(2009, "ward")).a(9, 15).a("record");
      bL = (new pe(2010, "11")).a(10, 15).a("record");
      ny.c();
   }
}
