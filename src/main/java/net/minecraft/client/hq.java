package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class hq extends os {
   protected final mj a;

   public hq(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.a = this.a(var2);
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      if (this.f != 2 && this.f != 3) {
         this.c((aeh)var1, var2, var3, 1, 1);
      } else {
         this.b((aeh)var1, var2, var3, 1, 1);
      }

   }

   public static hq a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return a(var7) && nk.a(var0, var7) == null ? new hq(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, tc.b());
         this.a(var1, var2, var3, this.a, 1, 1, 0);
         if (this.f != 2 && this.f != 3) {
            this.a(var1, var3, 4, 1, 1, 4, 3, 3, 0, 0, false);
         } else {
            this.a(var1, var3, 0, 1, 1, 0, 3, 3, 0, 0, false);
         }

         return true;
      }
   }
}
