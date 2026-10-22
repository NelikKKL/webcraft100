package net.minecraft.client;

import java.util.Random;

public class mk extends sr {
   protected mk(int var1) {
      super(var1);
      this.B.z = 2;
      this.B.A = -999;
      this.B.C = 1;
      this.B.D = 8;
      this.B.E = 10;
      this.B.I = 1;
      this.B.y = 4;
      this.A = 14745456;
   }

   public ig a(Random var1) {
      return this.J;
   }

   public int a(kq var1, int var2, int var3, int var4) {
      double var5 = (double)var1.a().a(var2, var3, var4);
      double var7 = (double)var1.a().b(var2, var4);
      return ((ha.a(var5, var7) & 16711422) + 5115470) / 2;
   }

   public int b(kq var1, int var2, int var3, int var4) {
      double var5 = (double)var1.a().a(var2, var3, var4);
      double var7 = (double)var1.a().b(var2, var4);
      return ((db.a(var5, var7) & 16711422) + 5115470) / 2;
   }
}
