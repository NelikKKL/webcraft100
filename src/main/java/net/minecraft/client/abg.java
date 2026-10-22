package net.minecraft.client;

public class abg {
   public static final abg[] a = new abg[32];
   public static final abg b = null;
   public static final abg c = (new abg(1, false, 8171462)).a("potion.moveSpeed").b(0, 0);
   public static final abg d = (new abg(2, true, 5926017)).a("potion.moveSlowdown").b(1, 0);
   public static final abg e = (new abg(3, false, 14270531)).a("potion.digSpeed").b(2, 0).a((double)1.5F);
   public static final abg f = (new abg(4, true, 4866583)).a("potion.digSlowDown").b(3, 0);
   public static final abg g = (new abg(5, false, 9643043)).a("potion.damageBoost").b(4, 0);
   public static final abg h = (new py(6, false, 16262179)).a("potion.heal");
   public static final abg i = (new py(7, true, 4393481)).a("potion.harm");
   public static final abg j = (new abg(8, false, 7889559)).a("potion.jump").b(2, 1);
   public static final abg k = (new abg(9, true, 5578058)).a("potion.confusion").b(3, 1).a((double)0.25F);
   public static final abg l = (new abg(10, false, 13458603)).a("potion.regeneration").b(7, 0).a((double)0.25F);
   public static final abg m = (new abg(11, false, 10044730)).a("potion.resistance").b(6, 1);
   public static final abg n = (new abg(12, false, 14981690)).a("potion.fireResistance").b(7, 1);
   public static final abg o = (new abg(13, false, 3035801)).a("potion.waterBreathing").b(0, 2);
   public static final abg p = (new abg(14, false, 8356754)).a("potion.invisibility").b(0, 1).h();
   public static final abg q = (new abg(15, true, 2039587)).a("potion.blindness").b(5, 1).a((double)0.25F);
   public static final abg r = (new abg(16, false, 2039713)).a("potion.nightVision").b(4, 1).h();
   public static final abg s = (new abg(17, true, 5797459)).a("potion.hunger").b(1, 1);
   public static final abg t = (new abg(18, true, 4738376)).a("potion.weakness").b(5, 0);
   public static final abg u = (new abg(19, true, 5149489)).a("potion.poison").b(6, 0).a((double)0.25F);
   public static final abg v = null;
   public static final abg w = null;
   public static final abg x = null;
   public static final abg y = null;
   public static final abg z = null;
   public static final abg A = null;
   public static final abg B = null;
   public static final abg C = null;
   public static final abg D = null;
   public static final abg E = null;
   public static final abg F = null;
   public static final abg G = null;
   public final int H;
   private String I = "";
   private int J = -1;
   private final boolean K;
   private double L;
   private boolean M;
   private final int N;

   protected abg(int var1, boolean var2, int var3) {
      this.H = var1;
      a[var1] = this;
      this.K = var2;
      if (var2) {
         this.L = (double)0.5F;
      } else {
         this.L = (double)1.0F;
      }

      this.N = var3;
   }

   protected abg b(int var1, int var2) {
      this.J = var1 + var2 * 8;
      return this;
   }

   public int b() {
      return this.H;
   }

   public void a(nq var1, int var2) {
      if (this.H == l.H) {
         if (var1.ag() < var1.f_()) {
            var1.a_(1);
         }
      } else if (this.H == u.H) {
         if (var1.ag() > 1) {
            var1.a((pm)pm.l, 1);
         }
      } else if (this.H == s.H && var1 instanceof vi) {
         ((vi)var1).g(0.025F * (float)(var2 + 1));
      } else if ((this.H != h.H || var1.av()) && (this.H != i.H || !var1.av())) {
         if (this.H == i.H && !var1.av() || this.H == h.H && var1.av()) {
            var1.a(pm.l, 6 << var2);
         }
      } else {
         var1.a_(6 << var2);
      }

   }

   public void a(nq var1, nq var2, int var3, double var4) {
      if ((this.H != h.H || var2.av()) && (this.H != i.H || !var2.av())) {
         if (this.H == i.H && !var2.av() || this.H == h.H && var2.av()) {
            int var7 = (int)(var4 * (double)(6 << var3) + (double)0.5F);
            if (var1 == null) {
               var2.a(pm.l, var7);
            } else {
               var2.a(pm.b(var2, var1), var7);
            }
         }
      } else {
         int var6 = (int)(var4 * (double)(6 << var3) + (double)0.5F);
         var2.a_(var6);
      }

   }

   public boolean a() {
      return false;
   }

   public boolean a(int var1, int var2) {
      if (this.H != l.H && this.H != u.H) {
         return this.H == s.H;
      } else {
         int var3 = 25 >> var2;
         if (var3 > 0) {
            return var1 % var3 == 0;
         } else {
            return true;
         }
      }
   }

   public abg a(String var1) {
      this.I = var1;
      return this;
   }

   public String c() {
      return this.I;
   }

   public boolean d() {
      return this.J >= 0;
   }

   public int e() {
      return this.J;
   }

   public boolean f() {
      return this.K;
   }

   public static String a(s var0) {
      int var1 = var0.b();
      int var2 = var1 / 20;
      int var3 = var2 / 60;
      var2 %= 60;
      return var2 < 10 ? var3 + ":0" + var2 : var3 + ":" + var2;
   }

   protected abg a(double var1) {
      this.L = var1;
      return this;
   }

   public double g() {
      return this.L;
   }

   public abg h() {
      this.M = true;
      return this;
   }

   public boolean i() {
      return this.M;
   }

   public int j() {
      return this.N;
   }
}
