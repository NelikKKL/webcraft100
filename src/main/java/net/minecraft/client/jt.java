package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class jt extends os {
   private static final agq[] c;
   protected final mj a;
   protected final int b;

   public jt(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.a = this.a(var2);
      this.e = var3;
      this.b = var2.nextInt(5);
   }

   public void a(nk var1, List var2, Random var3) {
      this.a((aeh)var1, var2, var3, 4, 1);
      this.b((aeh)var1, var2, var3, 1, 4);
      this.c((aeh)var1, var2, var3, 1, 4);
   }

   public static jt a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return a(var7) && nk.a(var0, var7) == null ? new jt(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 10, 6, 10, true, var2, tc.b());
         this.a(var1, var2, var3, this.a, 4, 1, 0);
         this.a(var1, var3, 4, 1, 10, 6, 3, 10, 0, 0, false);
         this.a(var1, var3, 0, 1, 4, 0, 3, 6, 0, 0, false);
         this.a(var1, var3, 10, 1, 4, 10, 3, 6, 0, 0, false);
         switch (this.b) {
            case 0:
               this.a(var1, yy.bm.bM, 0, 5, 1, 5, var3);
               this.a(var1, yy.bm.bM, 0, 5, 2, 5, var3);
               this.a(var1, yy.bm.bM, 0, 5, 3, 5, var3);
               this.a(var1, yy.aq.bM, 0, 4, 3, 5, var3);
               this.a(var1, yy.aq.bM, 0, 6, 3, 5, var3);
               this.a(var1, yy.aq.bM, 0, 5, 3, 4, var3);
               this.a(var1, yy.aq.bM, 0, 5, 3, 6, var3);
               this.a(var1, yy.ak.bM, 0, 4, 1, 4, var3);
               this.a(var1, yy.ak.bM, 0, 4, 1, 5, var3);
               this.a(var1, yy.ak.bM, 0, 4, 1, 6, var3);
               this.a(var1, yy.ak.bM, 0, 6, 1, 4, var3);
               this.a(var1, yy.ak.bM, 0, 6, 1, 5, var3);
               this.a(var1, yy.ak.bM, 0, 6, 1, 6, var3);
               this.a(var1, yy.ak.bM, 0, 5, 1, 4, var3);
               this.a(var1, yy.ak.bM, 0, 5, 1, 6, var3);
               break;
            case 1:
               for(int var8 = 0; var8 < 5; ++var8) {
                  this.a(var1, yy.bm.bM, 0, 3, 1, 3 + var8, var3);
                  this.a(var1, yy.bm.bM, 0, 7, 1, 3 + var8, var3);
                  this.a(var1, yy.bm.bM, 0, 3 + var8, 1, 3, var3);
                  this.a(var1, yy.bm.bM, 0, 3 + var8, 1, 7, var3);
               }

               this.a(var1, yy.bm.bM, 0, 5, 1, 5, var3);
               this.a(var1, yy.bm.bM, 0, 5, 2, 5, var3);
               this.a(var1, yy.bm.bM, 0, 5, 3, 5, var3);
               this.a(var1, yy.A.bM, 0, 5, 4, 5, var3);
               break;
            case 2:
               for(int var4 = 1; var4 <= 9; ++var4) {
                  this.a(var1, yy.w.bM, 0, 1, 3, var4, var3);
                  this.a(var1, yy.w.bM, 0, 9, 3, var4, var3);
               }

               for(int var5 = 1; var5 <= 9; ++var5) {
                  this.a(var1, yy.w.bM, 0, var5, 3, 1, var3);
                  this.a(var1, yy.w.bM, 0, var5, 3, 9, var3);
               }

               this.a(var1, yy.w.bM, 0, 5, 1, 4, var3);
               this.a(var1, yy.w.bM, 0, 5, 1, 6, var3);
               this.a(var1, yy.w.bM, 0, 5, 3, 4, var3);
               this.a(var1, yy.w.bM, 0, 5, 3, 6, var3);
               this.a(var1, yy.w.bM, 0, 4, 1, 5, var3);
               this.a(var1, yy.w.bM, 0, 6, 1, 5, var3);
               this.a(var1, yy.w.bM, 0, 4, 3, 5, var3);
               this.a(var1, yy.w.bM, 0, 6, 3, 5, var3);

               for(int var6 = 1; var6 <= 3; ++var6) {
                  this.a(var1, yy.w.bM, 0, 4, var6, 4, var3);
                  this.a(var1, yy.w.bM, 0, 6, var6, 4, var3);
                  this.a(var1, yy.w.bM, 0, 4, var6, 6, var3);
                  this.a(var1, yy.w.bM, 0, 6, var6, 6, var3);
               }

               this.a(var1, yy.aq.bM, 0, 5, 3, 5, var3);

               for(int var7 = 2; var7 <= 8; ++var7) {
                  this.a(var1, yy.x.bM, 0, 2, 3, var7, var3);
                  this.a(var1, yy.x.bM, 0, 3, 3, var7, var3);
                  if (var7 <= 3 || var7 >= 7) {
                     this.a(var1, yy.x.bM, 0, 4, 3, var7, var3);
                     this.a(var1, yy.x.bM, 0, 5, 3, var7, var3);
                     this.a(var1, yy.x.bM, 0, 6, 3, var7, var3);
                  }

                  this.a(var1, yy.x.bM, 0, 7, 3, var7, var3);
                  this.a(var1, yy.x.bM, 0, 8, 3, var7, var3);
               }

               this.a(var1, yy.aF.bM, this.c(yy.aF.bM, 4), 9, 1, 3, var3);
               this.a(var1, yy.aF.bM, this.c(yy.aF.bM, 4), 9, 2, 3, var3);
               this.a(var1, yy.aF.bM, this.c(yy.aF.bM, 4), 9, 3, 3, var3);
               this.a(var1, var3, var2, 3, 4, 8, c, 1 + var2.nextInt(4));
         }

         return true;
      }
   }

   static {
      c = new agq[]{new agq(acy.n.bM, 0, 1, 5, 10), new agq(acy.o.bM, 0, 1, 3, 5), new agq(acy.aB.bM, 0, 4, 9, 5), new agq(acy.l.bM, 0, 3, 8, 10), new agq(acy.T.bM, 0, 1, 3, 15), new agq(acy.i.bM, 0, 1, 3, 15), new agq(acy.f.bM, 0, 1, 1, 1)};
   }
}
