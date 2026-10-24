package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class a implements ej {
   private Random i;
   private eb j;
   private eb k;
   private eb l;
   public eb a;
   public eb b;
   private ry m;
   private double[] n;
   private sr[] o;
   double[] c;
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   int[][] h = new int[32][32];

   public a(ry var1, long var2) {
      this.m = var1;
      this.i = new net.minecraft.client.web.JRandom(var2);
      this.j = new eb(this.i, 16);
      this.k = new eb(this.i, 16);
      this.l = new eb(this.i, 8);
      this.a = new eb(this.i, 10);
      this.b = new eb(this.i, 16);
   }

   public void a(int var1, int var2, byte[] var3, sr[] var4) {
      byte var5 = 2;
      int var6 = var5 + 1;
      int var7 = this.m.c / 4 + 1;
      int var8 = var5 + 1;
      this.n = this.a(this.n, var1 * var5, 0, var2 * var5, var6, var7, var8);

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var5; ++var10) {
            for(int var11 = 0; var11 < this.m.c / 4; ++var11) {
               double var12 = (double)0.25F;
               double var14 = this.n[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.n[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.n[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.n[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.n[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.n[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.n[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.n[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 4; ++var30) {
                  double var31 = (double)0.125F;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 8; ++var41) {
                     int var42 = var41 + var9 * 8 << this.m.b | 0 + var10 * 8 << this.m.a | var11 * 4 + var30;
                     int var43 = 1 << this.m.a;
                     double var44 = (double)0.125F;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 8; ++var50) {
                        int var51 = 0;
                        if (var46 > (double)0.0F) {
                           var51 = yy.bJ.bM;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public void b(int var1, int var2, byte[] var3, sr[] var4) {
      for(int var5 = 0; var5 < 16; ++var5) {
         for(int var6 = 0; var6 < 16; ++var6) {
            byte var7 = 1;
            int var8 = -1;
            byte var9 = (byte)yy.bJ.bM;
            byte var10 = (byte)yy.bJ.bM;

            for(int var11 = this.m.d; var11 >= 0; --var11) {
               int var12 = (var6 * 16 + var5) * this.m.c + var11;
               byte var13 = var3[var12];
               if (var13 == 0) {
                  var8 = -1;
               } else if (var13 == yy.t.bM) {
                  if (var8 == -1) {
                     if (var7 <= 0) {
                        var9 = 0;
                        var10 = (byte)yy.bJ.bM;
                     }

                     var8 = var7;
                     if (var11 >= 0) {
                        var3[var12] = var9;
                     } else {
                        var3[var12] = var10;
                     }
                  } else if (var8 > 0) {
                     --var8;
                     var3[var12] = var10;
                  }
               }
            }
         }
      }

   }

   public zx a(int var1, int var2) {
      return this.b(var1, var2);
   }

   public zx b(int var1, int var2) {
      this.i.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte[16 * this.m.c * 16];
      zx var4 = new zx(this.m, var3, var1, var2);
      this.o = this.m.a().a((sr[])this.o, var1 * 16, var2 * 16, 16, 16);
      this.a(var1, var2, var3, this.o);
      this.b(var1, var2, var3, this.o);
      var4.c();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412;
      double var10 = 684.412;
      this.f = this.a.a(this.f, var2, var4, var5, var7, 1.121, 1.121, (double)0.5F);
      this.g = this.b.a(this.g, var2, var4, var5, var7, (double)200.0F, (double)200.0F, (double)0.5F);
      var8 *= (double)2.0F;
      this.c = this.l.a(this.c, var2, var3, var4, var5, var6, var7, var8 / (double)80.0F, var10 / (double)160.0F, var8 / (double)80.0F);
      this.d = this.j.a(this.d, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.e = this.k.a(this.e, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            double var16 = (this.f[var13] + (double)256.0F) / (double)512.0F;
            if (var16 > (double)1.0F) {
               var16 = (double)1.0F;
            }

            double var18 = this.g[var13] / (double)8000.0F;
            if (var18 < (double)0.0F) {
               var18 = -var18 * 0.3;
            }

            var18 = var18 * (double)3.0F - (double)2.0F;
            float var20 = (float)(var14 + var2 - 0) / 1.0F;
            float var21 = (float)(var15 + var4 - 0) / 1.0F;
            float var22 = 100.0F - me.c(var20 * var20 + var21 * var21) * 8.0F;
            if (var22 > 80.0F) {
               var22 = 80.0F;
            }

            if (var22 < -100.0F) {
               var22 = -100.0F;
            }

            if (var18 > (double)1.0F) {
               var18 = (double)1.0F;
            }

            var18 /= (double)8.0F;
            var18 = (double)0.0F;
            if (var16 < (double)0.0F) {
               var16 = (double)0.0F;
            }

            var16 += (double)0.5F;
            var18 = var18 * (double)var6 / (double)16.0F;
            ++var13;
            double var23 = (double)var6 / (double)2.0F;

            for(int var25 = 0; var25 < var6; ++var25) {
               double var26 = (double)0.0F;
               double var28 = ((double)var25 - var23) * (double)8.0F / var16;
               if (var28 < (double)0.0F) {
                  var28 *= (double)-1.0F;
               }

               double var30 = this.d[var12] / (double)512.0F;
               double var32 = this.e[var12] / (double)512.0F;
               double var34 = (this.c[var12] / (double)10.0F + (double)1.0F) / (double)2.0F;
               if (var34 < (double)0.0F) {
                  var26 = var30;
               } else if (var34 > (double)1.0F) {
                  var26 = var32;
               } else {
                  var26 = var30 + (var32 - var30) * var34;
               }

               var26 -= (double)8.0F;
               var26 += (double)var22;
               byte var36 = 2;
               if (var25 > var6 / 2 - var36) {
                  double var37 = (double)((float)(var25 - (var6 / 2 - var36)) / 64.0F);
                  if (var37 < (double)0.0F) {
                     var37 = (double)0.0F;
                  }

                  if (var37 > (double)1.0F) {
                     var37 = (double)1.0F;
                  }

                  var26 = var26 * ((double)1.0F - var37) + (double)-3000.0F * var37;
               }

               var36 = 8;
               if (var25 < var36) {
                  double var50 = (double)((float)(var36 - var25) / ((float)var36 - 1.0F));
                  var26 = var26 * ((double)1.0F - var50) + (double)-30.0F * var50;
               }

               var1[var12] = var26;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean c(int var1, int var2) {
      return true;
   }

   public void a(ej var1, int var2, int var3) {
      cj.a = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      sr var6 = this.m.a().a(var4 + 16, var5 + 16);
      var6.a(this.m, this.m.w, var4, var5);
      cj.a = false;
   }

   public boolean a(boolean var1, rz var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "RandomLevelSource";
   }

   public List a(jf var1, int var2, int var3, int var4) {
      vh var5 = this.m.a();
      if (var5 == null) {
         return null;
      } else {
         sr var6 = var5.a(new acm(var2 >> 4, var4 >> 4));
         return var6 == null ? null : var6.a(var1);
      }
   }

   public am a(ry var1, String var2, int var3, int var4, int var5) {
      return null;
   }
}
