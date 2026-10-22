package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ec extends xf {
   private int a = -1;

   public ec(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static ec a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, 0, 0, 0, 13, 4, 9, var5);
      return a(var7) && nk.a(var0, var7) == null ? new ec(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a < 0) {
         this.a = this.b(var1, var3);
         if (this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 12, 4, 8, 0, 0, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 7, yy.aA.bM, yy.aA.bM, false);
      this.a(var1, var3, 4, 0, 1, 5, 0, 7, yy.aA.bM, yy.aA.bM, false);
      this.a(var1, var3, 7, 0, 1, 8, 0, 7, yy.aA.bM, yy.aA.bM, false);
      this.a(var1, var3, 10, 0, 1, 11, 0, 7, yy.aA.bM, yy.aA.bM, false);
      this.a(var1, var3, 0, 0, 0, 0, 0, 8, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 6, 0, 0, 6, 0, 8, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 12, 0, 0, 12, 0, 8, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 1, 0, 0, 11, 0, 0, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 1, 0, 8, 11, 0, 8, yy.J.bM, yy.J.bM, false);
      this.a(var1, var3, 3, 0, 1, 3, 0, 7, yy.A.bM, yy.A.bM, false);
      this.a(var1, var3, 9, 0, 1, 9, 0, 7, yy.A.bM, yy.A.bM, false);

      for(int var4 = 1; var4 <= 7; ++var4) {
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 1, 1, var4, var3);
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 2, 1, var4, var3);
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 4, 1, var4, var3);
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 5, 1, var4, var3);
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 7, 1, var4, var3);
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 8, 1, var4, var3);
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 10, 1, var4, var3);
         this.a(var1, yy.az.bM, me.a(var2, 2, 7), 11, 1, var4, var3);
      }

      for(int var6 = 0; var6 < 9; ++var6) {
         for(int var5 = 0; var5 < 13; ++var5) {
            this.b(var1, var5, 4, var6, var3);
            this.b(var1, yy.v.bM, 0, var5, -1, var6, var3);
         }
      }

      return true;
   }
}
