package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class zc extends os {
   private static final agq[] b;
   protected final mj a;
   private final boolean c;

   public zc(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.a = this.a(var2);
      this.e = var3;
      this.c = var3.c() > 6;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public static zc a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if (!a(var7) || nk.a(var0, var7) != null) {
         var7 = nl.a(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if (!a(var7) || nk.a(var0, var7) != null) {
            return null;
         }
      }

      return new zc(var6, var1, var7, var5);
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         byte var4 = 11;
         if (!this.c) {
            var4 = 6;
         }

         this.a(var1, var3, 0, 0, 0, 13, var4 - 1, 14, true, var2, tc.b());
         this.a(var1, var2, var3, this.a, 4, 1, 0);
         this.a(var1, var3, var2, 0.07F, 2, 1, 1, 11, 4, 13, yy.W.bM, yy.W.bM, false);

         for(int var7 = 1; var7 <= 13; ++var7) {
            if ((var7 - 1) % 4 == 0) {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, yy.x.bM, yy.x.bM, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, yy.x.bM, yy.x.bM, false);
               this.a(var1, yy.aq.bM, 0, 2, 3, var7, var3);
               this.a(var1, yy.aq.bM, 0, 11, 3, var7, var3);
               if (this.c) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, yy.x.bM, yy.x.bM, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, yy.x.bM, yy.x.bM, false);
               }
            } else {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, yy.an.bM, yy.an.bM, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, yy.an.bM, yy.an.bM, false);
               if (this.c) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, yy.an.bM, yy.an.bM, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, yy.an.bM, yy.an.bM, false);
               }
            }
         }

         for(int var10 = 3; var10 < 12; var10 += 2) {
            this.a(var1, var3, 3, 1, var10, 4, 3, var10, yy.an.bM, yy.an.bM, false);
            this.a(var1, var3, 6, 1, var10, 7, 3, var10, yy.an.bM, yy.an.bM, false);
            this.a(var1, var3, 9, 1, var10, 10, 3, var10, yy.an.bM, yy.an.bM, false);
         }

         if (this.c) {
            this.a(var1, var3, 1, 5, 1, 3, 5, 13, yy.x.bM, yy.x.bM, false);
            this.a(var1, var3, 10, 5, 1, 12, 5, 13, yy.x.bM, yy.x.bM, false);
            this.a(var1, var3, 4, 5, 1, 9, 5, 2, yy.x.bM, yy.x.bM, false);
            this.a(var1, var3, 4, 5, 12, 9, 5, 13, yy.x.bM, yy.x.bM, false);
            this.a(var1, yy.x.bM, 0, 9, 5, 11, var3);
            this.a(var1, yy.x.bM, 0, 8, 5, 11, var3);
            this.a(var1, yy.x.bM, 0, 9, 5, 10, var3);
            this.a(var1, var3, 3, 6, 2, 3, 6, 12, yy.aZ.bM, yy.aZ.bM, false);
            this.a(var1, var3, 10, 6, 2, 10, 6, 10, yy.aZ.bM, yy.aZ.bM, false);
            this.a(var1, var3, 4, 6, 2, 9, 6, 2, yy.aZ.bM, yy.aZ.bM, false);
            this.a(var1, var3, 4, 6, 12, 8, 6, 12, yy.aZ.bM, yy.aZ.bM, false);
            this.a(var1, yy.aZ.bM, 0, 9, 6, 11, var3);
            this.a(var1, yy.aZ.bM, 0, 8, 6, 11, var3);
            this.a(var1, yy.aZ.bM, 0, 9, 6, 10, var3);
            int var11 = this.c(yy.aF.bM, 3);
            this.a(var1, yy.aF.bM, var11, 10, 1, 13, var3);
            this.a(var1, yy.aF.bM, var11, 10, 2, 13, var3);
            this.a(var1, yy.aF.bM, var11, 10, 3, 13, var3);
            this.a(var1, yy.aF.bM, var11, 10, 4, 13, var3);
            this.a(var1, yy.aF.bM, var11, 10, 5, 13, var3);
            this.a(var1, yy.aF.bM, var11, 10, 6, 13, var3);
            this.a(var1, yy.aF.bM, var11, 10, 7, 13, var3);
            byte var8 = 7;
            byte var9 = 7;
            this.a(var1, yy.aZ.bM, 0, var8 - 1, 9, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8, 9, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8 - 1, 8, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8, 8, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8 - 1, 7, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8, 7, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8 - 2, 7, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8 + 1, 7, var9, var3);
            this.a(var1, yy.aZ.bM, 0, var8 - 1, 7, var9 - 1, var3);
            this.a(var1, yy.aZ.bM, 0, var8 - 1, 7, var9 + 1, var3);
            this.a(var1, yy.aZ.bM, 0, var8, 7, var9 - 1, var3);
            this.a(var1, yy.aZ.bM, 0, var8, 7, var9 + 1, var3);
            this.a(var1, yy.aq.bM, 0, var8 - 2, 8, var9, var3);
            this.a(var1, yy.aq.bM, 0, var8 + 1, 8, var9, var3);
            this.a(var1, yy.aq.bM, 0, var8 - 1, 8, var9 - 1, var3);
            this.a(var1, yy.aq.bM, 0, var8 - 1, 8, var9 + 1, var3);
            this.a(var1, yy.aq.bM, 0, var8, 8, var9 - 1, var3);
            this.a(var1, yy.aq.bM, 0, var8, 8, var9 + 1, var3);
         }

         this.a(var1, var3, var2, 3, 3, 5, b, 1 + var2.nextInt(4));
         if (this.c) {
            this.a(var1, 0, 0, 12, 9, 1, var3);
            this.a(var1, var3, var2, 12, 8, 1, b, 1 + var2.nextInt(4));
         }

         return true;
      }
   }

   static {
      b = new agq[]{new agq(acy.aK.bM, 0, 1, 3, 20), new agq(acy.aJ.bM, 0, 2, 7, 20), new agq(acy.bc.bM, 0, 1, 1, 1), new agq(acy.aP.bM, 0, 1, 1, 1)};
   }
}
