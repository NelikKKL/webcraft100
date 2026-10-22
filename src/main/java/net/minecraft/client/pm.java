package net.minecraft.client;

public class pm {
   public static pm a = (new pm("inFire")).j();
   public static pm b = (new pm("onFire")).h().j();
   public static pm c = (new pm("lava")).j();
   public static pm d = (new pm("inWall")).h();
   public static pm e = (new pm("drown")).h();
   public static pm f = (new pm("starve")).h();
   public static pm g = new pm("cactus");
   public static pm h = (new pm("fall")).h();
   public static pm i = (new pm("outOfWorld")).h().i();
   public static pm j = (new pm("generic")).h();
   public static pm k = new pm("explosion");
   public static pm l = (new pm("magic")).h();
   private boolean n = false;
   private boolean o = false;
   private float p = 0.3F;
   private boolean q;
   private boolean r;
   public String m;

   public static pm a(nq var0) {
      return new fq("mob", var0);
   }

   public static pm a(vi var0) {
      return new fq("player", var0);
   }

   public static pm a(ro var0, ia var1) {
      return (new qq("arrow", var0, var1)).c();
   }

   public static pm a(aad var0, ia var1) {
      return (new qq("fireball", var0, var1)).j().c();
   }

   public static pm a(ia var0, ia var1) {
      return (new qq("thrown", var0, var1)).c();
   }

   public static pm b(ia var0, ia var1) {
      return (new qq("indirectMagic", var0, var1)).h();
   }

   public boolean b() {
      return this.r;
   }

   public pm c() {
      this.r = true;
      return this;
   }

   public boolean d() {
      return this.n;
   }

   public float e() {
      return this.p;
   }

   public boolean f() {
      return this.o;
   }

   protected pm(String var1) {
      this.m = var1;
   }

   public ia g() {
      return this.a();
   }

   public ia a() {
      return null;
   }

   protected pm h() {
      this.n = true;
      this.p = 0.0F;
      return this;
   }

   protected pm i() {
      this.o = true;
      return this;
   }

   protected pm j() {
      this.q = true;
      return this;
   }

   public boolean k() {
      return this.q;
   }

   public String l() {
      return this.m;
   }
}
