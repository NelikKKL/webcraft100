package net.minecraft.client;

public class xv extends acy {
   public static final String[] a = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
   public static final int[] b = new int[]{1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 2651799, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};

   public xv(int var1) {
      super(var1);
      this.a(true);
      this.i(0);
   }

   public int a(int var1) {
      int var2 = me.a(var1, 0, 15);
      return this.bO + var2 % 8 * 16 + var2 / 8;
   }

   public String a(dk var1) {
      int var2 = me.a(var1.i(), 0, 15);
      return super.d() + "." + a[var2];
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      if (!var2.e(var4, var5, var6)) {
         return false;
      } else if (var1.i() == 15) {
         int var8 = var3.a(var4, var5, var6);
         if (var8 == yy.y.bM) {
            if (!var3.I) {
               ((aet)yy.y).c(var3, var4, var5, var6, var3.w);
               --var1.a;
            }

            return true;
         } else if (var8 != yy.af.bM && var8 != yy.ag.bM) {
            if (var8 != yy.bt.bM && var8 != yy.bs.bM) {
               if (var8 == yy.az.bM) {
                  if (!var3.I) {
                     ((aha)yy.az).g(var3, var4, var5, var6);
                     --var1.a;
                  }

                  return true;
               } else if (var8 == yy.u.bM) {
                  if (!var3.I) {
                     --var1.a;

                     label73:
                     for(int var9 = 0; var9 < 128; ++var9) {
                        int var10 = var4;
                        int var11 = var5 + 1;
                        int var12 = var6;

                        for(int var13 = 0; var13 < var9 / 16; ++var13) {
                           var10 += c.nextInt(3) - 1;
                           var11 += (c.nextInt(3) - 1) * c.nextInt(3) / 2;
                           var12 += c.nextInt(3) - 1;
                           if (var3.a(var10, var11 - 1, var12) != yy.u.bM || var3.g(var10, var11, var12)) {
                              continue label73;
                           }
                        }

                        if (var3.a(var10, var11, var12) == 0) {
                           if (c.nextInt(10) != 0) {
                              var3.d(var10, var11, var12, yy.X.bM, 1);
                           } else if (c.nextInt(3) != 0) {
                              var3.g(var10, var11, var12, yy.ad.bM);
                           } else {
                              var3.g(var10, var11, var12, yy.ae.bM);
                           }
                        }
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            } else {
               if (!var3.I) {
                  ((pu)yy.k[var8]).g(var3, var4, var5, var6);
                  --var1.a;
               }

               return true;
            }
         } else {
            if (!var3.I && ((js)yy.k[var8]).c(var3, var4, var5, var6, var3.w)) {
               --var1.a;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void a(dk var1, nq var2) {
      if (var2 instanceof hm) {
         hm var3 = (hm)var2;
         int var4 = fr.d_(var1.i());
         if (!var3.v_() && var3.l() != var4) {
            var3.c(var4);
            --var1.a;
         }
      }

   }
}
