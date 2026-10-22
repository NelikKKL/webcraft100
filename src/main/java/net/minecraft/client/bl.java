package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class bl extends rh {
   public bl(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      this.c((gc)var1, var2, var3, 6, 2, false);
   }

   public static bl a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -2, 0, 0, 7, 11, 7, var5);
      return a(var7) && nk.a(var0, var7) == null ? new bl(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      this.a(var1, var3, 0, 0, 0, 6, 1, 6, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 2, 0, 6, 10, 6, 0, 0, false);
      this.a(var1, var3, 0, 2, 0, 1, 8, 0, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 5, 2, 0, 6, 8, 0, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 2, 1, 0, 8, 6, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 6, 2, 1, 6, 8, 6, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 2, 6, 5, 8, 6, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 3, 2, 0, 5, 4, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 6, 3, 2, 6, 5, 2, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 6, 3, 4, 6, 5, 4, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, yy.bA.bM, 0, 5, 2, 5, var3);
      this.a(var1, var3, 4, 2, 5, 4, 3, 5, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 3, 2, 5, 3, 4, 5, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 2, 2, 5, 2, 5, 5, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 2, 5, 1, 6, 5, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 7, 1, 5, 7, 4, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 6, 8, 2, 6, 8, 4, 0, 0, false);
      this.a(var1, var3, 2, 6, 0, 4, 8, 0, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 2, 5, 0, 4, 5, 0, yy.bB.bM, yy.bB.bM, false);

      for(int var4 = 0; var4 <= 6; ++var4) {
         for(int var5 = 0; var5 <= 6; ++var5) {
            this.b(var1, yy.bA.bM, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
