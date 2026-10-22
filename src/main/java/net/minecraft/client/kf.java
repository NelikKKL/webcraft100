package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class kf extends rh {
   private boolean a;

   public kf(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static kf a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -2, 0, 0, 7, 8, 9, var5);
      return a(var7) && nk.a(var0, var7) == null ? new kf(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      this.a(var1, var3, 0, 2, 0, 6, 7, 7, 0, 0, false);
      this.a(var1, var3, 1, 0, 0, 5, 1, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 2, 1, 5, 2, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 3, 2, 5, 3, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 4, 3, 5, 4, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 2, 0, 1, 4, 2, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 5, 2, 0, 5, 4, 2, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 5, 2, 1, 5, 3, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 5, 5, 2, 5, 5, 3, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 5, 3, 0, 5, 8, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 6, 5, 3, 6, 5, 8, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 1, 5, 8, 5, 5, 8, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, yy.bB.bM, 0, 1, 6, 3, var3);
      this.a(var1, yy.bB.bM, 0, 5, 6, 3, var3);
      this.a(var1, var3, 0, 6, 3, 0, 6, 8, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 6, 6, 3, 6, 6, 8, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 1, 6, 8, 5, 7, 8, yy.bB.bM, yy.bB.bM, false);
      this.a(var1, var3, 2, 8, 8, 4, 8, 8, yy.bB.bM, yy.bB.bM, false);
      if (!this.a) {
         int var4 = this.b(5);
         int var5 = this.a(3, 5);
         int var6 = this.b(3, 5);
         if (var3.b(var5, var4, var6)) {
            this.a = true;
            var1.g(var5, var4, var6, yy.as.bM);
            ze var7 = (ze)var1.b(var5, var4, var6);
            if (var7 != null) {
               var7.a("Blaze");
            }
         }
      }

      for(int var8 = 0; var8 <= 6; ++var8) {
         for(int var9 = 0; var9 <= 6; ++var9) {
            this.b(var1, yy.bA.bM, 0, var8, -1, var9, var3);
         }
      }

      return true;
   }
}
