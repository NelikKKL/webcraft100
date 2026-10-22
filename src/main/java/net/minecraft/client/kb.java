package net.minecraft.client;

import java.util.Random;

public class kb extends cj {
   public kb(int var1, int var2) {
      super(var1, var2);
   }

   public int a(int var1, Random var2, int var3) {
      return var2.nextInt(10 - var3 * 3) == 0 ? acy.ao.bM : this.bM;
   }
}
