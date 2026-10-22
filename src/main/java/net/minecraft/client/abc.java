package net.minecraft.client;

public class abc extends zo {
   public abc(ry var1) {
      super(var1);
      this.aA = "/mob/zombie.png";
      this.bw = 0.5F;
      this.a = 50;
      this.L *= 6.0F;
      this.a(this.M * 6.0F, this.N * 6.0F);
   }

   public int f_() {
      return 100;
   }

   protected float a(int var1, int var2, int var3) {
      return this.o.c(var1, var2, var3) - 0.5F;
   }
}
