package net.minecraft.client;

import java.util.List;

public class si {
   private long a;
   private int b;
   private int c;
   private int d;
   private long e;
   private long f;
   private long g;
   private ik h;
   private int i;
   private String j;
   private int k;
   private boolean l;
   private int m;
   private boolean n;
   private int o;
   private int p;
   private boolean q;
   private boolean r = false;

   public si(ik var1) {
      this.a = var1.f("RandomSeed");
      this.p = var1.e("GameType");
      if (var1.b("MapFeatures")) {
         this.q = var1.m("MapFeatures");
      } else {
         this.q = true;
      }

      this.b = var1.e("SpawnX");
      this.c = var1.e("SpawnY");
      this.d = var1.e("SpawnZ");
      this.e = var1.f("Time");
      this.f = var1.f("LastPlayed");
      this.g = var1.f("SizeOnDisk");
      this.j = var1.i("LevelName");
      this.k = var1.e("version");
      this.m = var1.e("rainTime");
      this.l = var1.m("raining");
      this.o = var1.e("thunderTime");
      this.n = var1.m("thundering");
      this.r = var1.m("hardcore");
      if (var1.b("Player")) {
         this.h = var1.k("Player");
         this.i = this.h.e("Dimension");
      }

   }

   public si(yw var1, String var2) {
      this.a = var1.a();
      this.p = var1.b();
      this.q = var1.d();
      this.j = var2;
      this.r = var1.c();
   }

   public si(si var1) {
      this.a = var1.a;
      this.p = var1.p;
      this.q = var1.q;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.m = var1.m;
      this.l = var1.l;
      this.o = var1.o;
      this.n = var1.n;
      this.r = var1.r;
   }

   public ik a() {
      ik var1 = new ik();
      this.a(var1, this.h);
      return var1;
   }

   public ik a(List var1) {
      ik var2 = new ik();
      vi var3 = null;
      ik var4 = null;
      if (var1.size() > 0) {
         var3 = (vi)var1.get(0);
      }

      if (var3 != null) {
         var4 = new ik();
         var3.d(var4);
      }

      this.a(var2, var4);
      return var2;
   }

   private void a(ik var1, ik var2) {
      var1.a("RandomSeed", this.a);
      var1.a("GameType", this.p);
      var1.a("MapFeatures", this.q);
      var1.a("SpawnX", this.b);
      var1.a("SpawnY", this.c);
      var1.a("SpawnZ", this.d);
      var1.a("Time", this.e);
      var1.a("SizeOnDisk", this.g);
      var1.a("LastPlayed", System.currentTimeMillis());
      var1.a("LevelName", this.j);
      var1.a("version", this.k);
      var1.a("rainTime", this.m);
      var1.a("raining", this.l);
      var1.a("thunderTime", this.o);
      var1.a("thundering", this.n);
      var1.a("hardcore", this.r);
      if (var2 != null) {
         var1.a("Player", var2);
      }

   }

   public long b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public long f() {
      return this.e;
   }

   public long g() {
      return this.g;
   }

   public ik h() {
      return this.h;
   }

   public int i() {
      return this.i;
   }

   public void a(int var1) {
      this.b = var1;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public void c(int var1) {
      this.d = var1;
   }

   public void a(long var1) {
      this.e = var1;
   }

   public void b(long var1) {
      this.g = var1;
   }

   public void a(ik var1) {
      this.h = var1;
   }

   public void a(int var1, int var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public String j() {
      return this.j;
   }

   public void a(String var1) {
      this.j = var1;
   }

   public int k() {
      return this.k;
   }

   public void d(int var1) {
      this.k = var1;
   }

   public long l() {
      return this.f;
   }

   public boolean m() {
      return this.n;
   }

   public void a(boolean var1) {
      this.n = var1;
   }

   public int n() {
      return this.o;
   }

   public void e(int var1) {
      this.o = var1;
   }

   public boolean o() {
      return this.l;
   }

   public void b(boolean var1) {
      this.l = var1;
   }

   public int p() {
      return this.m;
   }

   public void f(int var1) {
      this.m = var1;
   }

   public int q() {
      return this.p;
   }

   public boolean r() {
      return this.q;
   }

   public boolean s() {
      return this.r;
   }
}
