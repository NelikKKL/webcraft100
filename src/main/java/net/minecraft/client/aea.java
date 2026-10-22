package net.minecraft.client;

public class aea extends aed {
   public aea(ry var1) {
      super(var1);
      this.aA = "/mob/lava.png";
      this.af = true;
      this.aI = 0.2F;
   }

   public boolean i() {
      return this.o.v > 0 && this.o.a(this.C) && this.o.a((ia)this, (c)this.C).size() == 0 && !this.o.b(this.C);
   }

   protected int o_() {
      return this.aF() * 3;
   }

   public int a(float var1) {
      return 15728880;
   }

   public float b(float var1) {
      return 1.0F;
   }

   protected String ax() {
      return "flame";
   }

   protected aed ay() {
      return new aea(this.o);
   }

   protected int k() {
      return 0;
   }

   public boolean V() {
      return false;
   }

   protected int az() {
      return super.az() * 4;
   }

   protected void aA() {
      this.a *= 0.9F;
   }

   protected void ak() {
      this.w = (double)(0.42F + (float)this.aF() * 0.1F);
      this.ap = true;
   }

   protected void c(float var1) {
   }

   protected boolean aB() {
      return true;
   }

   protected int aC() {
      return super.aC() + 2;
   }

   protected String f() {
      return "mob.slime";
   }

   protected String g() {
      return "mob.slime";
   }

   protected String aD() {
      return this.aF() > 1 ? "mob.magmacube.big" : "mob.magmacube.small";
   }

   public boolean F() {
      return false;
   }

   protected boolean aE() {
      return true;
   }
}
