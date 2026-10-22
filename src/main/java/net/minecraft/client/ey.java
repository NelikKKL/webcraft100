package net.minecraft.client;

import java.util.Random;

public class ey extends ig {
   private int a;

   public ey(int var1) {
      this.a = var1;
   }

   public boolean a(ry var1, Random var2, int var3, int var4, int var5) {
      if (var1.a(var3, var4 + 1, var5) != yy.bb.bM) {
         return false;
      } else if (var1.a(var3, var4, var5) != 0 && var1.a(var3, var4, var5) != yy.bb.bM) {
         return false;
      } else {
         int var6 = 0;
         if (var1.a(var3 - 1, var4, var5) == yy.bb.bM) {
            ++var6;
         }

         if (var1.a(var3 + 1, var4, var5) == yy.bb.bM) {
            ++var6;
         }

         if (var1.a(var3, var4, var5 - 1) == yy.bb.bM) {
            ++var6;
         }

         if (var1.a(var3, var4, var5 + 1) == yy.bb.bM) {
            ++var6;
         }

         if (var1.a(var3, var4 - 1, var5) == yy.bb.bM) {
            ++var6;
         }

         int var7 = 0;
         if (var1.h(var3 - 1, var4, var5)) {
            ++var7;
         }

         if (var1.h(var3 + 1, var4, var5)) {
            ++var7;
         }

         if (var1.h(var3, var4, var5 - 1)) {
            ++var7;
         }

         if (var1.h(var3, var4, var5 + 1)) {
            ++var7;
         }

         if (var1.h(var3, var4 - 1, var5)) {
            ++var7;
         }

         if (var6 == 4 && var7 == 1) {
            var1.g(var3, var4, var5, this.a);
            var1.f = true;
            yy.k[this.a].a(var1, var3, var4, var5, var2);
            var1.f = false;
         }

         return true;
      }
   }
}
