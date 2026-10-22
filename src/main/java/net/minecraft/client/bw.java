package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class bw extends rh {
   public bw(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   protected bw(Random var1, int var2, int var3) {
      super(0);
      this.f = var1.nextInt(4);
      switch (this.f) {
         case 0:
         case 2:
            this.e = new nl(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
            break;
         default:
            this.e = new nl(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      }

   }

   public void a(nk var1, List var2, Random var3) {
      this.a((gc)var1, var2, var3, 8, 3, false);
      this.b((gc)var1, var2, var3, 3, 8, false);
      this.c((gc)var1, var2, var3, 3, 8, false);
   }

   public static bw a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -8, -3, 0, 19, 10, 19, var5);
      return a(var7) && nk.a(var0, var7) == null ? new bw(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      this.a(var1, var3, 7, 3, 0, 11, 4, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 3, 7, 18, 4, 11, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 8, 5, 0, 10, 7, 18, 0, 0, false);
      this.a(var1, var3, 0, 5, 8, 18, 7, 10, 0, 0, false);
      this.a(var1, var3, 7, 5, 0, 7, 5, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 7, 5, 11, 7, 5, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 11, 5, 0, 11, 5, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 11, 5, 11, 11, 5, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 5, 7, 7, 5, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 11, 5, 7, 18, 5, 7, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 5, 11, 7, 5, 11, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 11, 5, 11, 18, 5, 11, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 7, 2, 0, 11, 2, 5, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 7, 2, 13, 11, 2, 18, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 7, 0, 0, 11, 1, 3, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 7, 0, 15, 11, 1, 18, yy.bA.bM, yy.bA.bM, false);

      for(int var4 = 7; var4 <= 11; ++var4) {
         for(int var5 = 0; var5 <= 2; ++var5) {
            this.b(var1, yy.bA.bM, 0, var4, -1, var5, var3);
            this.b(var1, yy.bA.bM, 0, var4, -1, 18 - var5, var3);
         }
      }

      this.a(var1, var3, 0, 2, 7, 5, 2, 11, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 13, 2, 7, 18, 2, 11, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 0, 0, 7, 3, 1, 11, yy.bA.bM, yy.bA.bM, false);
      this.a(var1, var3, 15, 0, 7, 18, 1, 11, yy.bA.bM, yy.bA.bM, false);

      for(int var6 = 0; var6 <= 2; ++var6) {
         for(int var7 = 7; var7 <= 11; ++var7) {
            this.b(var1, yy.bA.bM, 0, var6, -1, var7, var3);
            this.b(var1, yy.bA.bM, 0, 18 - var6, -1, var7, var3);
         }
      }

      return true;
   }
}
