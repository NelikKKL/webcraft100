package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ys extends os {
   private static final agq[] a;
   private final mj b;
   private boolean c;

   public ys(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.b = this.a(var2);
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      this.a((aeh)var1, var2, var3, 1, 1);
   }

   public static ys a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && nk.a(var0, var7) == null ? new ys(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, tc.b());
         this.a(var1, var2, var3, this.b, 1, 1, 0);
         this.a(var1, var2, var3, mj.a, 1, 1, 6);
         this.a(var1, var3, 3, 1, 2, 3, 1, 4, yy.bm.bM, yy.bm.bM, false);
         this.a(var1, yy.ak.bM, 5, 3, 1, 1, var3);
         this.a(var1, yy.ak.bM, 5, 3, 1, 5, var3);
         this.a(var1, yy.ak.bM, 5, 3, 2, 2, var3);
         this.a(var1, yy.ak.bM, 5, 3, 2, 4, var3);

         for(int var4 = 2; var4 <= 4; ++var4) {
            this.a(var1, yy.ak.bM, 5, 2, 1, var4, var3);
         }

         if (!this.c) {
            int var7 = this.b(2);
            int var5 = this.a(3, 3);
            int var6 = this.b(3, 3);
            if (var3.b(var5, var7, var6)) {
               this.c = true;
               this.a(var1, var3, var2, 3, 2, 3, a, 2 + var2.nextInt(2));
            }
         }

         return true;
      }
   }

   static {
      a = new agq[]{new agq(acy.bm.bM, 0, 1, 1, 10), new agq(acy.m.bM, 0, 1, 3, 3), new agq(acy.n.bM, 0, 1, 5, 10), new agq(acy.o.bM, 0, 1, 3, 5), new agq(acy.aB.bM, 0, 4, 9, 5), new agq(acy.T.bM, 0, 1, 3, 15), new agq(acy.i.bM, 0, 1, 3, 15), new agq(acy.f.bM, 0, 1, 1, 5), new agq(acy.p.bM, 0, 1, 1, 5), new agq(acy.ad.bM, 0, 1, 1, 5), new agq(acy.ac.bM, 0, 1, 1, 5), new agq(acy.ae.bM, 0, 1, 1, 5), new agq(acy.af.bM, 0, 1, 1, 5), new agq(acy.as.bM, 0, 1, 1, 1)};
   }
}
