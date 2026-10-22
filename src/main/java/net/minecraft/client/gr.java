package net.minecraft.client;

public class gr extends zo {
   public gr(ry var1) {
      super(var1);
      this.aA = "/mob/zombie.png";
      this.bw = 0.5F;
      this.a = 4;
   }

   public int f_() {
      return 20;
   }

   protected int o_() {
      return 2;
   }

   public void c() {
      if (this.o.l() && !this.o.I) {
         float var1 = this.b(1.0F);
         if (var1 > 0.5F && this.o.l(me.c(this.s), me.c(this.t), me.c(this.u)) && this.Y.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.e(8);
         }
      }

      super.c();
   }

   protected String e() {
      return "mob.zombie";
   }

   protected String f() {
      return "mob.zombiehurt";
   }

   protected String g() {
      return "mob.zombiedeath";
   }

   protected int k() {
      return acy.bl.bM;
   }

   public el r_() {
      return el.b;
   }
}
