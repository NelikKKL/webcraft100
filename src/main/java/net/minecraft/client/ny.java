package net.minecraft.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ny {
   protected static Map a = new HashMap();
   public static List b = new ArrayList();
   public static List c = new ArrayList();
   public static List d = new ArrayList();
   public static List e = new ArrayList();
   public static px f = (new cl(1000, hj.a("stat.startGame"))).b().a();
   public static px g = (new cl(1001, hj.a("stat.createWorld"))).b().a();
   public static px h = (new cl(1002, hj.a("stat.loadWorld"))).b().a();
   public static px i = (new cl(1003, hj.a("stat.joinMultiplayer"))).b().a();
   public static px j = (new cl(1004, hj.a("stat.leaveGame"))).b().a();
   public static px k;
   public static px l;
   public static px m;
   public static px n;
   public static px o;
   public static px p;
   public static px q;
   public static px r;
   public static px s;
   public static px t;
   public static px u;
   public static px v;
   public static px w;
   public static px x;
   public static px y;
   public static px z;
   public static px A;
   public static px B;
   public static px[] C;
   public static px[] D;
   public static px[] E;
   public static px[] F;
   private static boolean G;
   private static boolean H;

   public static void a() {
   }

   public static void b() {
      E = a(E, "stat.useItem", 16908288, 0, yy.k.length);
      F = b(F, "stat.breakItem", 16973824, 0, yy.k.length);
      G = true;
      d();
   }

   public static void c() {
      E = a(E, "stat.useItem", 16908288, yy.k.length, 32000);
      F = b(F, "stat.breakItem", 16973824, yy.k.length, 32000);
      H = true;
      d();
   }

   public static void d() {
      if (G && H) {
         HashSet var0 = new HashSet();

         for(ue var2 : (Iterable<ue>)(Iterable)(sl.a().b())) {
            var0.add(var2.a().c);
         }

         for(dk var6 : (Iterable<dk>)(Iterable)(mt.a().b().values())) {
            var0.add(var6.c);
         }

         D = new px[32000];

         for(Integer var7 : (Iterable<Integer>)(Iterable)(var0)) {
            if (acy.d[var7] != null) {
               String var3 = hj.a("stat.craftItem", acy.d[var7].l());
               D[var7] = (new yl(16842752 + var7, var3, var7)).a();
            }
         }

         a(D);
      }
   }

   private static px[] a(String var0, int var1) {
      px[] var2 = new px[256];

      for(int var3 = 0; var3 < 256; ++var3) {
         if (yy.k[var3] != null && yy.k[var3].q()) {
            String var4 = hj.a(var0, yy.k[var3].o());
            var2[var3] = (new yl(var1 + var3, var4, var3)).a();
            e.add((yl)var2[var3]);
         }
      }

      a(var2);
      return var2;
   }

   private static px[] a(px[] var0, String var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0 = new px[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if (acy.d[var5] != null) {
            String var6 = hj.a(var1, acy.d[var5].l());
            var0[var5] = (new yl(var2 + var5, var6, var5)).a();
            if (var5 >= yy.k.length) {
               d.add((yl)var0[var5]);
            }
         }
      }

      a(var0);
      return var0;
   }

   private static px[] b(px[] var0, String var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0 = new px[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if (acy.d[var5] != null && acy.d[var5].h()) {
            String var6 = hj.a(var1, acy.d[var5].l());
            var0[var5] = (new yl(var2 + var5, var6, var5)).a();
         }
      }

      a(var0);
      return var0;
   }

   private static void a(px[] var0) {
      a(var0, yy.B.bM, yy.A.bM);
      a(var0, yy.D.bM, yy.D.bM);
      a(var0, yy.bf.bM, yy.ba.bM);
      a(var0, yy.aC.bM, yy.aB.bM);
      a(var0, yy.aO.bM, yy.aN.bM);
      a(var0, yy.bi.bM, yy.bh.bM);
      a(var0, yy.aQ.bM, yy.aP.bM);
      a(var0, yy.ag.bM, yy.af.bM);
      a(var0, yy.aj.bM, yy.ak.bM);
      a(var0, yy.u.bM, yy.v.bM);
      a(var0, yy.aA.bM, yy.v.bM);
   }

   private static void a(px[] var0, int var1, int var2) {
      if (var0[var1] != null && var0[var2] == null) {
         var0[var2] = var0[var1];
      } else {
         b.remove(var0[var1]);
         e.remove(var0[var1]);
         c.remove(var0[var1]);
         var0[var1] = var0[var2];
      }
   }

   public static px a(int var0) {
      return (px)a.get(var0);
   }

   static {
      k = (new cl(1100, hj.a("stat.playOneMinute"), px.f)).b().a();
      l = (new cl(2000, hj.a("stat.walkOneCm"), px.g)).b().a();
      m = (new cl(2001, hj.a("stat.swimOneCm"), px.g)).b().a();
      n = (new cl(2002, hj.a("stat.fallOneCm"), px.g)).b().a();
      o = (new cl(2003, hj.a("stat.climbOneCm"), px.g)).b().a();
      p = (new cl(2004, hj.a("stat.flyOneCm"), px.g)).b().a();
      q = (new cl(2005, hj.a("stat.diveOneCm"), px.g)).b().a();
      r = (new cl(2006, hj.a("stat.minecartOneCm"), px.g)).b().a();
      s = (new cl(2007, hj.a("stat.boatOneCm"), px.g)).b().a();
      t = (new cl(2008, hj.a("stat.pigOneCm"), px.g)).b().a();
      u = (new cl(2010, hj.a("stat.jump"))).b().a();
      v = (new cl(2011, hj.a("stat.drop"))).b().a();
      w = (new cl(2020, hj.a("stat.damageDealt"))).a();
      x = (new cl(2021, hj.a("stat.damageTaken"))).a();
      y = (new cl(2022, hj.a("stat.deaths"))).a();
      z = (new cl(2023, hj.a("stat.mobKills"))).a();
      A = (new cl(2024, hj.a("stat.playerKills"))).a();
      B = (new cl(2025, hj.a("stat.fishCaught"))).a();
      C = a("stat.mineBlock", 16777216);
      ut.a();
      G = false;
      H = false;
   }
}
