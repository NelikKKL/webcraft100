package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class vl extends os {
   private final boolean a;
   private final mj b;

   public vl(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.a = true;
      this.f = var2.nextInt(4);
      this.b = mj.a;
      switch (this.f) {
         case 0:
         case 2:
            this.e = new nl(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
            break;
         default:
            this.e = new nl(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
      }

   }

   public vl(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.a = false;
      this.f = var4;
      this.b = this.a(var2);
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      if (this.a) {
         tc.a(kt.class);
      }

      this.a((aeh)var1, var2, var3, 1, 1);
   }

   public static vl a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return a(var7) && nk.a(var0, var7) == null ? new vl(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         if (this.a) {
         }

         this.a(var1, var3, 0, 0, 0, 4, 10, 4, true, var2, tc.b());
         this.a(var1, var2, var3, this.b, 1, 7, 0);
         this.a(var1, var2, var3, mj.a, 1, 1, 4);
         this.a(var1, yy.bm.bM, 0, 2, 6, 1, var3);
         this.a(var1, yy.bm.bM, 0, 1, 5, 1, var3);
         this.a(var1, yy.ak.bM, 0, 1, 6, 1, var3);
         this.a(var1, yy.bm.bM, 0, 1, 5, 2, var3);
         this.a(var1, yy.bm.bM, 0, 1, 4, 3, var3);
         this.a(var1, yy.ak.bM, 0, 1, 5, 3, var3);
         this.a(var1, yy.bm.bM, 0, 2, 4, 3, var3);
         this.a(var1, yy.bm.bM, 0, 3, 3, 3, var3);
         this.a(var1, yy.ak.bM, 0, 3, 4, 3, var3);
         this.a(var1, yy.bm.bM, 0, 3, 3, 2, var3);
         this.a(var1, yy.bm.bM, 0, 3, 2, 1, var3);
         this.a(var1, yy.ak.bM, 0, 3, 3, 1, var3);
         this.a(var1, yy.bm.bM, 0, 2, 2, 1, var3);
         this.a(var1, yy.bm.bM, 0, 1, 1, 1, var3);
         this.a(var1, yy.ak.bM, 0, 1, 2, 1, var3);
         this.a(var1, yy.bm.bM, 0, 1, 1, 2, var3);
         this.a(var1, yy.ak.bM, 0, 1, 1, 3, var3);
         return true;
      }
   }
}
