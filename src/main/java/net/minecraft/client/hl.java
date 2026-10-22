package net.minecraft.client;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public abstract class hl extends bz {
   protected HashMap d = new HashMap();

   public void a(ej var1, ry var2, int var3, int var4, byte[] var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   protected void a(ry var1, int var2, int var3, int var4, int var5, byte[] var6) {
      if (!this.d.containsKey(acm.a(var2, var3))) {
         this.b.nextInt();
         if (this.a(var2, var3)) {
            oa var7 = this.b(var2, var3);
            this.d.put(acm.a(var2, var3), var7);
         }

      }
   }

   public boolean a(ry var1, Random var2, int var3, int var4) {
      int var5 = (var3 << 4) + 8;
      int var6 = (var4 << 4) + 8;
      boolean var7 = false;

      for(oa var9 : (Iterable<oa>)(Iterable)(this.d.values())) {
         if (var9.d() && var9.a().a(var5, var6, var5 + 15, var6 + 15)) {
            var9.a(var1, var2, new nl(var5, var6, var5 + 15, var6 + 15));
            var7 = true;
         }
      }

      return var7;
   }

   public boolean a(int var1, int var2, int var3) {
      for(oa var5 : (Iterable<oa>)(Iterable)(this.d.values())) {
         if (var5.d() && var5.a().a(var1, var3, var1, var3)) {
            for(nk var7 : (Iterable<nk>)(Iterable)(var5.b())) {
               if (var7.a().b(var1, var2, var3)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public am a(ry var1, int var2, int var3, int var4) {
      this.c = var1;
      this.b.setSeed(var1.t());
      long var5 = this.b.nextLong();
      long var7 = this.b.nextLong();
      long var9 = (long)(var2 >> 4) * var5;
      long var11 = (long)(var4 >> 4) * var7;
      this.b.setSeed(var9 ^ var11 ^ var1.t());
      this.a(var1, var2 >> 4, var4 >> 4, 0, 0, (byte[])null);
      double var13 = Double.MAX_VALUE;
      am var15 = null;

      for(oa var17 : (Iterable<oa>)(Iterable)(this.d.values())) {
         if (var17.d()) {
            nk var18 = (nk)var17.b().get(0);
            am var19 = var18.c();
            int var20 = var19.a - var2;
            int var21 = var19.b - var3;
            int var22 = var19.c - var4;
            double var23 = (double)(var20 + var20 * var21 * var21 + var22 * var22);
            if (var23 < var13) {
               var13 = var23;
               var15 = var19;
            }
         }
      }

      if (var15 != null) {
         return var15;
      } else {
         List var25 = this.a();
         if (var25 != null) {
            am var26 = null;

            for(am var28 : (Iterable<am>)(Iterable)(var25)) {
               int var29 = var28.a - var2;
               int var30 = var28.b - var3;
               int var31 = var28.c - var4;
               double var32 = (double)(var29 + var29 * var30 * var30 + var31 * var31);
               if (var32 < var13) {
                  var13 = var32;
                  var26 = var28;
               }
            }

            return var26;
         } else {
            return null;
         }
      }
   }

   protected List a() {
      return null;
   }

   protected abstract boolean a(int var1, int var2);

   protected abstract oa b(int var1, int var2);
}
