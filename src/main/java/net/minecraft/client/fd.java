package net.minecraft.client;

public class fd extends fx {
   public fd(ry var1) {
      super(var1);
      this.aA = "/mob/pig.png";
      this.a(0.9F, 0.9F);
   }

   public int f_() {
      return 10;
   }

   protected void b() {
      super.b();
      this.ag.a(16, (byte)0);
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("Saddle", this.t_());
   }

   public void b(ik var1) {
      super.b(var1);
      this.b(var1.m("Saddle"));
   }

   protected String e() {
      return "mob.pig";
   }

   protected String f() {
      return "mob.pig";
   }

   protected String g() {
      return "mob.pigdeath";
   }

   public boolean c(vi var1) {
      if (super.c(var1)) {
         return true;
      } else if (!this.t_() || this.o.I || this.m != null && this.m != var1) {
         return false;
      } else {
         var1.g(this);
         return true;
      }
   }

   protected int k() {
      return this.V() ? acy.aq.bM : acy.ap.bM;
   }

   public boolean t_() {
      return (this.ag.a(16) & 1) != 0;
   }

   public void b(boolean var1) {
      if (var1) {
         this.ag.b(16, (byte)1);
      } else {
         this.ag.b(16, (byte)0);
      }

   }

   public void a(su var1) {
      if (!this.o.I) {
         jm var2 = new jm(this.o);
         var2.c(this.s, this.t, this.u, this.y, this.z);
         this.o.a((ia)var2);
         this.v();
      }
   }

   protected void c(float var1) {
      super.c(var1);
      if (var1 > 5.0F && this.m instanceof vi) {
         ((vi)this.m).a((px)ut.u);
      }

   }

   protected fx a(fx var1) {
      return new fd(this.o);
   }
}
