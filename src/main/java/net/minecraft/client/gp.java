package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class gp extends os {
   private final mj a;
   private final boolean b;
   private final boolean c;

   public gp(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.a = this.a(var2);
      this.e = var3;
      this.b = var2.nextInt(2) == 0;
      this.c = var2.nextInt(2) == 0;
   }

   public void a(nk var1, List var2, Random var3) {
      this.a((aeh)var1, var2, var3, 1, 1);
      if (this.b) {
         this.b((aeh)var1, var2, var3, 1, 2);
      }

      if (this.c) {
         this.c((aeh)var1, var2, var3, 1, 2);
      }

   }

   public static gp a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && nk.a(var0, var7) == null ? new gp(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, tc.b());
         this.a(var1, var2, var3, this.a, 1, 1, 0);
         this.a(var1, var2, var3, mj.a, 1, 1, 6);
         this.a(var1, var3, var2, 0.1F, 1, 2, 1, yy.aq.bM, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 1, yy.aq.bM, 0);
         this.a(var1, var3, var2, 0.1F, 1, 2, 5, yy.aq.bM, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 5, yy.aq.bM, 0);
         if (this.b) {
            this.a(var1, var3, 0, 1, 2, 0, 3, 4, 0, 0, false);
         }

         if (this.c) {
            this.a(var1, var3, 4, 1, 2, 4, 3, 4, 0, 0, false);
         }

         return true;
      }
   }
}
