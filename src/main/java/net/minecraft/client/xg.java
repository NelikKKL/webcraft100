package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class xg extends hq {
   public xg(int var1, Random var2, nl var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public void a(nk var1, List var2, Random var3) {
      if (this.f != 2 && this.f != 3) {
         this.b((aeh)var1, var2, var3, 1, 1);
      } else {
         this.c((aeh)var1, var2, var3, 1, 1);
      }

   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, tc.b());
         this.a(var1, var2, var3, this.a, 1, 1, 0);
         if (this.f != 2 && this.f != 3) {
            this.a(var1, var3, 0, 1, 1, 0, 3, 3, 0, 0, false);
         } else {
            this.a(var1, var3, 4, 1, 1, 4, 3, 3, 0, 0, false);
         }

         return true;
      }
   }
}
