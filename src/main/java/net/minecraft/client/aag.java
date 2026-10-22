package net.minecraft.client;

public class aag extends acy {
   public aag(int var1) {
      super(var1);
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      int var9 = var3.d(var4, var5, var6);
      if (var2.e(var4, var5, var6) && var8 == yy.bI.bM && !rl.e(var9)) {
         if (var3.I) {
            return true;
         } else {
            var3.f(var4, var5, var6, var9 + 4);
            --var1.a;

            for(int var10 = 0; var10 < 16; ++var10) {
               double var11 = (double)((float)var4 + (5.0F + c.nextFloat() * 6.0F) / 16.0F);
               double var13 = (double)((float)var5 + 0.8125F);
               double var15 = (double)((float)var6 + (5.0F + c.nextFloat() * 6.0F) / 16.0F);
               double var17 = (double)0.0F;
               double var19 = (double)0.0F;
               double var21 = (double)0.0F;
               var3.a("smoke", var11, var13, var15, var17, var19, var21);
            }

            int var23 = var9 & 3;
            int var24 = 0;
            int var12 = 0;
            boolean var25 = false;
            boolean var14 = true;
            int var26 = lz.f[var23];

            for(int var16 = -2; var16 <= 2; ++var16) {
               int var30 = var4 + lz.a[var26] * var16;
               int var18 = var6 + lz.b[var26] * var16;
               int var41 = var3.a(var30, var5, var18);
               if (var41 == yy.bI.bM) {
                  int var20 = var3.d(var30, var5, var18);
                  if (!rl.e(var20)) {
                     var14 = false;
                     break;
                  }

                  if (!var25) {
                     var24 = var16;
                     var12 = var16;
                     var25 = true;
                  } else {
                     var12 = var16;
                  }
               }
            }

            if (var14 && var12 == var24 + 2) {
               for(int var27 = var24; var27 <= var12; ++var27) {
                  int var31 = var4 + lz.a[var26] * var27;
                  int var35 = var6 + lz.b[var26] * var27;
                  var31 += lz.a[var23] * 4;
                  var35 += lz.b[var23] * 4;
                  int var42 = var3.a(var31, var5, var35);
                  int var47 = var3.d(var31, var5, var35);
                  if (var42 != yy.bI.bM || !rl.e(var47)) {
                     var14 = false;
                     break;
                  }
               }

               for(int var28 = var24 - 1; var28 <= var12 + 1; var28 += 4) {
                  for(int var33 = 1; var33 <= 3; ++var33) {
                     int var37 = var4 + lz.a[var26] * var28;
                     int var43 = var6 + lz.b[var26] * var28;
                     var37 += lz.a[var23] * var33;
                     var43 += lz.b[var23] * var33;
                     int var48 = var3.a(var37, var5, var43);
                     int var49 = var3.d(var37, var5, var43);
                     if (var48 != yy.bI.bM || !rl.e(var49)) {
                        var14 = false;
                        break;
                     }
                  }
               }

               if (var14) {
                  for(int var29 = var24; var29 <= var12; ++var29) {
                     for(int var34 = 1; var34 <= 3; ++var34) {
                        int var39 = var4 + lz.a[var26] * var29;
                        int var45 = var6 + lz.b[var26] * var29;
                        var39 += lz.a[var23] * var34;
                        var45 += lz.b[var23] * var34;
                        var3.g(var39, var5, var45, yy.bH.bM);
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public dk c(dk var1, ry var2, vi var3) {
      gv var4 = this.a(var2, var3, false);
      if (var4 != null && var4.a == net.minecraft.client.bo.a) {
         int var5 = var2.a(var4.b, var4.c, var4.d);
         if (var5 == yy.bI.bM) {
            return var1;
         }
      }

      if (!var2.I) {
         am var7 = var2.b("Stronghold", (int)var3.s, (int)var3.t, (int)var3.u);
         if (var7 != null) {
            bs var6 = new bs(var2, var3.s, var3.t + 1.62 - (double)var3.L, var3.u);
            var6.a((double)var7.a, var7.b, (double)var7.c);
            var2.a((ia)var6);
            var2.a(var3, "random.bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
            var2.a((vi)null, 1002, (int)var3.s, (int)var3.t, (int)var3.u, 0);
            if (!var3.cc.d) {
               --var1.a;
            }
         }
      }

      return var1;
   }
}
