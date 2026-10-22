package net.minecraft.client;

import net.minecraft.client.awtshim.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class sr {
   public static final sr[] a = new sr[256];
   public static final sr b = (new aeq(0)).b(112).a("Ocean").b(-1.0F, 0.4F);
   public static final sr c = (new ym(1)).b(9286496).a("Plains").a(0.8F, 0.4F);
   public static final sr d = (new ada(2)).b(16421912).a("Desert").g().a(2.0F, 0.0F).b(0.1F, 0.2F);
   public static final sr e = (new az(3)).b(6316128).a("Extreme Hills").b(0.2F, 1.8F).a(0.2F, 0.3F);
   public static final sr f = (new fo(4)).b(353825).a("Forest").a(5159473).a(0.7F, 0.8F);
   public static final sr g = (new qk(5)).b(747097).a("Taiga").a(5159473).a(0.3F, 0.8F).b(0.1F, 0.4F);
   public static final sr h = (new mk(6)).b(522674).a("Swampland").a(9154376).b(-0.2F, 0.1F).a(0.8F, 0.9F);
   public static final sr i = (new lq(7)).b(255).a("River").b(-0.5F, 0.0F);
   public static final sr j = (new av(8)).b(16711680).a("Hell").g().a(2.0F, 0.0F);
   public static final sr k = (new gu(9)).b(8421631).a("Sky").g();
   public static final sr l = (new aeq(10)).b(9474208).a("FrozenOcean").b(-1.0F, 0.5F).a(0.0F, 0.5F);
   public static final sr m = (new lq(11)).b(10526975).a("FrozenRiver").b(-0.5F, 0.0F).a(0.0F, 0.5F);
   public static final sr n = (new ce(12)).b(16777215).a("Ice Plains").a(0.0F, 0.5F);
   public static final sr o = (new ce(13)).b(10526880).a("Ice Mountains").b(0.2F, 1.8F).a(0.0F, 0.5F);
   public static final sr p = (new aev(14)).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).b(0.2F, 1.0F);
   public static final sr q = (new aev(15)).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).b(-1.0F, 0.1F);
   public String r;
   public int s;
   public byte t;
   public byte u;
   public int v;
   public float w;
   public float x;
   public float y;
   public float z;
   public int A;
   public ql B;
   protected List C;
   protected List D;
   protected List E;
   private boolean K;
   private boolean L;
   public final int F;
   protected gq G;
   protected yd H;
   protected jp I;
   protected qj J;

   protected sr(int var1) {
      this.t = (byte)yy.u.bM;
      this.u = (byte)yy.v.bM;
      this.v = 5169201;
      this.w = 0.1F;
      this.x = 0.3F;
      this.y = 0.5F;
      this.z = 0.5F;
      this.A = 16777215;
      this.C = new ArrayList();
      this.D = new ArrayList();
      this.E = new ArrayList();
      this.L = true;
      this.G = new gq(false);
      this.H = new yd(false);
      this.I = new jp(false);
      this.J = new qj();
      this.F = var1;
      a[var1] = this;
      this.B = this.a();
      this.D.add(new yx(hm.class, 12, 4, 4));
      this.D.add(new yx(fd.class, 10, 4, 4));
      this.D.add(new yx(qh.class, 10, 4, 4));
      this.D.add(new yx(adr.class, 8, 4, 4));
      this.C.add(new yx(vq.class, 10, 4, 4));
      this.C.add(new yx(gr.class, 10, 4, 4));
      this.C.add(new yx(it.class, 10, 4, 4));
      this.C.add(new yx(abh.class, 10, 4, 4));
      this.C.add(new yx(aed.class, 10, 4, 4));
      this.C.add(new yx(aii.class, 1, 1, 4));
      this.E.add(new yx(yv.class, 10, 4, 4));
   }

   protected ql a() {
      return new ql(this);
   }

   private sr a(float var1, float var2) {
      if (var1 > 0.1F && var1 < 0.2F) {
         throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
      } else {
         this.y = var1;
         this.z = var2;
         return this;
      }
   }

   private sr b(float var1, float var2) {
      this.w = var1;
      this.x = var2;
      return this;
   }

   private sr g() {
      this.L = false;
      return this;
   }

   public ig a(Random var1) {
      return (ig)(var1.nextInt(10) == 0 ? this.H : this.G);
   }

   protected sr a(String var1) {
      this.r = var1;
      return this;
   }

   protected sr a(int var1) {
      this.v = var1;
      return this;
   }

   protected sr b(int var1) {
      this.s = var1;
      return this;
   }

   public int a(float var1) {
      var1 /= 3.0F;
      if (var1 < -1.0F) {
         var1 = -1.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return Color.getHSBColor(0.62222224F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F).getRGB();
   }

   public List a(jf var1) {
      if (var1 == jf.a) {
         return this.C;
      } else if (var1 == jf.b) {
         return this.D;
      } else {
         return var1 == jf.c ? this.E : null;
      }
   }

   public boolean b() {
      return this.K;
   }

   public boolean c() {
      return this.K ? false : this.L;
   }

   public float d() {
      return 0.1F;
   }

   public final int e() {
      return (int)(this.z * 65536.0F);
   }

   public final int f() {
      return (int)(this.y * 65536.0F);
   }

   public void a(ry var1, Random var2, int var3, int var4) {
      this.B.a(var1, var2, var3, var4);
   }

   public int a(kq var1, int var2, int var3, int var4) {
      double var5 = (double)var1.a().a(var2, var3, var4);
      double var7 = (double)var1.a().b(var2, var4);
      return ha.a(var5, var7);
   }

   public int b(kq var1, int var2, int var3, int var4) {
      double var5 = (double)var1.a().a(var2, var3, var4);
      double var7 = (double)var1.a().b(var2, var4);
      return db.a(var5, var7);
   }
}
