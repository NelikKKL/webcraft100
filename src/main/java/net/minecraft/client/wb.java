package net.minecraft.client;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class wb {
   private Map o = new HashMap();
   public static wb a = new wb();
   private abe p;
   public static double b;
   public static double c;
   public static double d;
   public zh e;
   public n f;
   public ry g;
   public nq h;
   public float i;
   public float j;
   public ki k;
   public double l;
   public double m;
   public double n;

   private wb() {
      this.o.put(vq.class, new abw());
      this.o.put(aco.class, new abw());
      this.o.put(fd.class, new yf(new je(), new je(0.5F), 0.7F));
      this.o.put(hm.class, new ahr(new gg(), new od(), 0.7F));
      this.o.put(adr.class, new lj(new agg(), 0.7F));
      this.o.put(tb.class, new la(new agg(), 0.7F));
      this.o.put(aik.class, new acb(new ei(), 0.5F));
      this.o.put(qh.class, new dp(new adq(), 0.3F));
      this.o.put(gl.class, new xt());
      this.o.put(abh.class, new hb());
      this.o.put(aii.class, new aae());
      this.o.put(ahd.class, new bh());
      this.o.put(it.class, new tp(new afg(), 0.5F));
      this.o.put(qf.class, new aq());
      this.o.put(gr.class, new tp(new le(), 0.5F));
      this.o.put(aed.class, new xm(new fy(16), new fy(0), 0.25F));
      this.o.put(aea.class, new m());
      this.o.put(vi.class, new zr());
      this.o.put(abc.class, new ahi(new le(), 0.5F, 6.0F));
      this.o.put(is.class, new im());
      this.o.put(yv.class, new aic(new op(), 0.7F));
      this.o.put(ai.class, new ch());
      this.o.put(nq.class, new acq(new fa(), 0.5F));
      this.o.put(oo.class, new ado());
      this.o.put(sf.class, new ti());
      this.o.put(ia.class, new wy());
      this.o.put(tj.class, new zv());
      this.o.put(ro.class, new ahs());
      this.o.put(aah.class, new cd(acy.aC.a(0)));
      this.o.put(tm.class, new cd(acy.bm.a(0)));
      this.o.put(bs.class, new cd(acy.bz.a(0)));
      this.o.put(qw.class, new cd(acy.aO.a(0)));
      this.o.put(ab.class, new cd(154));
      this.o.put(aad.class, new ke(2.0F));
      this.o.put(yn.class, new ke(0.5F));
      this.o.put(ih.class, new iw());
      this.o.put(fk.class, new pw());
      this.o.put(dd.class, new nt());
      this.o.put(uo.class, new agh());
      this.o.put(vm.class, new pg());
      this.o.put(no.class, new ru());
      this.o.put(ael.class, new ls());
      this.o.put(su.class, new adu());

      for(rg var2 : (Iterable<rg>)(Iterable)(this.o.values())) {
         var2.a(this);
      }

   }

   public rg a(Class var1) {
      rg var2 = (rg)this.o.get(var1);
      if (var2 == null && var1 != ia.class) {
         var2 = this.a(var1.getSuperclass());
         this.o.put(var1, var2);
      }

      return var2;
   }

   public rg a(ia var1) {
      return this.a(var1.getClass());
   }

   public void a(ry var1, zh var2, abe var3, nq var4, ki var5, float var6) {
      this.g = var1;
      this.e = var2;
      this.k = var5;
      this.h = var4;
      this.p = var3;
      if (var4.ar()) {
         int var7 = var1.a(me.c(var4.s), me.c(var4.t), me.c(var4.u));
         if (var7 == yy.S.bM) {
            int var8 = var1.d(me.c(var4.s), me.c(var4.t), me.c(var4.u));
            int var9 = var8 & 3;
            this.i = (float)(var9 * 90 + 180);
            this.j = 0.0F;
         }
      } else {
         this.i = var4.A + (var4.y - var4.A) * var6;
         this.j = var4.B + (var4.z - var4.B) * var6;
      }

      if (var5.E == 2) {
         this.i += 180.0F;
      }

      this.l = var4.R + (var4.s - var4.R) * (double)var6;
      this.m = var4.S + (var4.t - var4.S) * (double)var6;
      this.n = var4.T + (var4.u - var4.T) * (double)var6;
   }

   public void a(ia var1, float var2) {
      double var3 = var1.R + (var1.s - var1.R) * (double)var2;
      double var5 = var1.S + (var1.t - var1.S) * (double)var2;
      double var7 = var1.T + (var1.u - var1.T) * (double)var2;
      float var9 = var1.A + (var1.y - var1.A) * var2;
      int var10 = var1.a(var2);
      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      adx.a(adx.b, (float)var11 / 1.0F, (float)var12 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.a(var1, var3 - b, var5 - c, var7 - d, var9, var2);
   }

   public void a(ia var1, double var2, double var4, double var6, float var8, float var9) {
      rg var10 = this.a(var1);
      if (var10 != null) {
         var10.a(var1, var2, var4, var6, var8, var9);
         var10.b(var1, var2, var4, var6, var8, var9);
      }

   }

   public void a(ry var1) {
      this.g = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.l;
      double var9 = var3 - this.m;
      double var11 = var5 - this.n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public abe a() {
      return this.p;
   }
}
