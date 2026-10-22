package net.minecraft.client;

public class uw extends acy {
   private int a;

   public uw(int var1) {
      super(var1);
      this.a = var1 + 256;
      this.g(yy.k[var1 + 256].b(2));
   }

   public int a_() {
      return this.a;
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      if (var8 == yy.aS.bM) {
         var7 = 0;
      } else if (var8 != yy.bu.bM) {
         if (var7 == 0) {
            --var5;
         }

         if (var7 == 1) {
            ++var5;
         }

         if (var7 == 2) {
            --var6;
         }

         if (var7 == 3) {
            ++var6;
         }

         if (var7 == 4) {
            --var4;
         }

         if (var7 == 5) {
            ++var4;
         }
      }

      if (var1.a == 0) {
         return false;
      } else if (!var2.e(var4, var5, var6)) {
         return false;
      } else if (var5 == var3.c - 1 && yy.k[this.a].bZ.b()) {
         return false;
      } else if (var3.a(this.a, var4, var5, var6, false, var7)) {
         yy var9 = yy.k[this.a];
         if (var3.d(var4, var5, var6, this.a, this.b(var1.i()))) {
            if (var3.a(var4, var5, var6) == this.a) {
               yy.k[this.a].b(var3, var4, var5, var6, var7);
               yy.k[this.a].a(var3, var4, var5, var6, (nq)var2);
            }

            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var9.bX.d(), (var9.bX.b() + 1.0F) / 2.0F, var9.bX.c() * 0.8F);
            --var1.a;
         }

         return true;
      } else {
         return false;
      }
   }

   public String a(dk var1) {
      return yy.k[this.a].p();
   }

   public String d() {
      return yy.k[this.a].p();
   }
}
