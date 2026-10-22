package net.minecraft.client;

import java.util.HashMap;
import java.util.Map;

public class mt {
   private static final mt a = new mt();
   private Map b = new HashMap();

   public static final mt a() {
      return a;
   }

   private mt() {
      this.a(yy.H.bM, new dk(acy.n));
      this.a(yy.G.bM, new dk(acy.o));
      this.a(yy.aw.bM, new dk(acy.m));
      this.a(yy.E.bM, new dk(yy.M));
      this.a(acy.ap.bM, new dk(acy.aq));
      this.a(acy.bh.bM, new dk(acy.bi));
      this.a(acy.bj.bM, new dk(acy.bk));
      this.a(acy.aT.bM, new dk(acy.aU));
      this.a(yy.w.bM, new dk(yy.t));
      this.a(acy.aH.bM, new dk(acy.aG));
      this.a(yy.aV.bM, new dk(acy.aV, 1, 2));
      this.a(yy.J.bM, new dk(acy.l, 1, 1));
      this.a(yy.I.bM, new dk(acy.l));
      this.a(yy.aN.bM, new dk(acy.aB));
      this.a(yy.N.bM, new dk(acy.aV, 1, 4));
   }

   public void a(int var1, dk var2) {
      this.b.put(var1, var2);
   }

   public dk a(int var1) {
      return (dk)this.b.get(var1);
   }

   public Map b() {
      return this.b;
   }
}
