package net.minecraft.client;

import java.util.Random;

public class fo extends sr {
   public fo(int var1) {
      super(var1);
      this.D.add(new yx(aik.class, 5, 4, 4));
      this.B.z = 10;
      this.B.B = 2;
   }

   public ig a(Random var1) {
      if (var1.nextInt(5) == 0) {
         return this.I;
      } else {
         return (ig)(var1.nextInt(10) == 0 ? this.H : this.G);
      }
   }
}
