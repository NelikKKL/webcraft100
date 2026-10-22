package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class vn extends os {
   private final int a;

   public vn(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
      this.a = var4 != 2 && var4 != 0 ? var3.b() : var3.d();
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static nl a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      nl var7 = nl.a(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      nk var8 = nk.a(var0, var7);
      if (var8 == null) {
         return null;
      } else {
         if (var8.a().b == var7.b) {
            for(int var9 = 3; var9 >= 1; --var9) {
               var7 = nl.a(var2, var3, var4, -1, -1, 0, 5, 5, var9 - 1, var5);
               if (!var8.a().a(var7)) {
                  return nl.a(var2, var3, var4, -1, -1, 0, 5, 5, var9, var5);
               }
            }
         }

         return null;
      }
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         for(int var4 = 0; var4 < this.a; ++var4) {
            this.a(var1, yy.bm.bM, 0, 0, 0, var4, var3);
            this.a(var1, yy.bm.bM, 0, 1, 0, var4, var3);
            this.a(var1, yy.bm.bM, 0, 2, 0, var4, var3);
            this.a(var1, yy.bm.bM, 0, 3, 0, var4, var3);
            this.a(var1, yy.bm.bM, 0, 4, 0, var4, var3);

            for(int var5 = 1; var5 <= 3; ++var5) {
               this.a(var1, yy.bm.bM, 0, 0, var5, var4, var3);
               this.a(var1, 0, 0, 1, var5, var4, var3);
               this.a(var1, 0, 0, 2, var5, var4, var3);
               this.a(var1, 0, 0, 3, var5, var4, var3);
               this.a(var1, yy.bm.bM, 0, 4, var5, var4, var3);
            }

            this.a(var1, yy.bm.bM, 0, 0, 4, var4, var3);
            this.a(var1, yy.bm.bM, 0, 1, 4, var4, var3);
            this.a(var1, yy.bm.bM, 0, 2, 4, var4, var3);
            this.a(var1, yy.bm.bM, 0, 3, 4, var4, var3);
            this.a(var1, yy.bm.bM, 0, 4, 4, var4, var3);
         }

         return true;
      }
   }
}
