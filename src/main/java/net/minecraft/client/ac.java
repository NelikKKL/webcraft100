package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ac extends rh {
   public ac(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      this.a((gc)var1, var2, var3, 1, 3, false);
   }

   public static ac a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return a(var7) && nk.a(var0, var7) == null ? new ac(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      this.a(var1, var3, 0, 3, 0, 4, 4, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 5, 0, 3, 7, 18, 0, 0, false);
      this.a(var1, var3, 0, 5, 0, 0, 5, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 4, 5, 0, 4, 5, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 2, 0, 4, 2, 5, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 2, 13, 4, 2, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 0, 0, 4, 1, 3, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 0, 15, 4, 1, 18, yy.bA.bM, yy.bA.bM, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 2; ++var5) {
            this.b(var1, yy.bA.bM, 0, var4, -1, var5, var3);
            this.b(var1, yy.bA.bM, 0, var4, -1, 18 - var5, var3);
         }
      }

      this.a(var1, var3, 0, 1, 1, 0, 4, 1, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 0, 3, 4, 0, 4, 4, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 0, 3, 14, 0, 4, 14, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 0, 1, 17, 0, 4, 17, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 4, 1, 1, 4, 4, 1, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 4, 3, 4, 4, 4, 4, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 4, 3, 14, 4, 4, 14, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 4, 1, 17, 4, 4, 17, yy.bB.bM, yy.bB.bM, false);
      return true;
   }
}
