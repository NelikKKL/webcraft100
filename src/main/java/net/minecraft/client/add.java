package net.minecraft.client;

import java.util.Random;

public class add extends agw {
   protected add(int var1, p var2) {
      super(var1, var2);
      this.b(false);
      if (var2 == net.minecraft.client.p.h) {
         this.b(true);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      if (var1.a(var2, var3, var4) == this.bM) {
         this.j(var1, var2, var3, var4);
      }

   }

   private void j(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      var1.t = true;
      var1.b(var2, var3, var4, this.bM - 1, var5);
      var1.c(var2, var3, var4, var2, var3, var4);
      var1.a(var2, var3, var4, this.bM - 1, this.d());
      var1.t = false;
   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (this.bZ == net.minecraft.client.p.h) {
         int var6 = var5.nextInt(3);

         for(int var7 = 0; var7 < var6; ++var7) {
            var2 += var5.nextInt(3) - 1;
            ++var3;
            var4 += var5.nextInt(3) - 1;
            int var8 = var1.a(var2, var3, var4);
            if (var8 == 0) {
               if (this.k(var1, var2 - 1, var3, var4) || this.k(var1, var2 + 1, var3, var4) || this.k(var1, var2, var3, var4 - 1) || this.k(var1, var2, var3, var4 + 1) || this.k(var1, var2, var3 - 1, var4) || this.k(var1, var2, var3 + 1, var4)) {
                  var1.g(var2, var3, var4, yy.ar.bM);
                  return;
               }
            } else if (yy.k[var8].bZ.d()) {
               return;
            }
         }
      }

   }

   private boolean k(ry var1, int var2, int var3, int var4) {
      return var1.e(var2, var3, var4).g();
   }
}
