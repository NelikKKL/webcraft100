package net.minecraft.client;

import java.util.Random;

public class qk extends sr {
   public qk(int var1) {
      super(var1);
      this.D.add(new yx(aik.class, 8, 4, 4));
      this.B.z = 10;
      this.B.B = 1;
   }

   public ig a(Random var1) {
      return (ig)(var1.nextInt(3) == 0 ? new us() : new ty(false));
   }
}
