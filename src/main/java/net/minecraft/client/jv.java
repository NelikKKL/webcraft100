package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class jv implements ej {
   private Random i;
   private eb j;
   private eb k;
   private eb l;
   private eb m;
   private eb n;
   public eb a;
   public eb b;
   private ry o;
   private double[] p;
   public ed c = new ed();
   private double[] q = new double[256];
   private double[] r = new double[256];
   private double[] s = new double[256];
   private bz t = new cz();
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   double[] h;

   public jv(ry var1, long var2) {
      this.o = var1;
      this.i = new Random(var2);
      this.j = new eb(this.i, 16);
      this.k = new eb(this.i, 16);
      this.l = new eb(this.i, 8);
      this.m = new eb(this.i, 4);
      this.n = new eb(this.i, 4);
      this.a = new eb(this.i, 10);
      this.b = new eb(this.i, 16);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 32;
      int var6 = var4 + 1;
      int var7 = this.o.c / 8 + 1;
      int var8 = var4 + 1;
      this.p = this.a(this.p, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < this.o.c / 8; ++var11) {
               double var12 = (double)0.125F;
               double var14 = this.p[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.p[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.p[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.p[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.p[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.p[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.p[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.p[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = (double)0.25F;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     int var42 = var41 + var9 * 4 << this.o.b | 0 + var10 * 4 << this.o.a | var11 * 8 + var30;
                     int var43 = 1 << this.o.a;
                     double var44 = (double)0.25F;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 4; ++var50) {
                        int var51 = 0;
                        if (var11 * 8 + var30 < var5) {
                           var51 = yy.D.bM;
                        }

                        if (var46 > (double)0.0F) {
                           var51 = yy.bb.bM;
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

   public void b(int var1, int var2, byte[] var3) {
      int var4 = this.o.c - 64;
      double var5 = (double)0.03125F;
      this.q = this.m.a(this.q, var1 * 16, var2 * 16, 0, 16, 16, 1, var5, var5, (double)1.0F);
      this.r = this.m.a(this.r, var1 * 16, 109, var2 * 16, 16, 1, 16, var5, (double)1.0F, var5);
      this.s = this.n.a(this.s, var1 * 16, var2 * 16, 0, 16, 16, 1, var5 * (double)2.0F, var5 * (double)2.0F, var5 * (double)2.0F);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.q[var7 + var8 * 16] + this.i.nextDouble() * 0.2 > (double)0.0F;
            boolean var10 = this.r[var7 + var8 * 16] + this.i.nextDouble() * 0.2 > (double)0.0F;
            int var11 = (int)(this.s[var7 + var8 * 16] / (double)3.0F + (double)3.0F + this.i.nextDouble() * (double)0.25F);
            int var12 = -1;
            byte var13 = (byte)yy.bb.bM;
            byte var14 = (byte)yy.bb.bM;

            for(int var15 = this.o.d; var15 >= 0; --var15) {
               int var16 = (var8 * 16 + var7) * this.o.c + var15;
               if (var15 >= this.o.d - this.i.nextInt(5)) {
                  var3[var16] = (byte)yy.z.bM;
               } else if (var15 <= 0 + this.i.nextInt(5)) {
                  var3[var16] = (byte)yy.z.bM;
               } else {
                  byte var17 = var3[var16];
                  if (var17 == 0) {
                     var12 = -1;
                  } else if (var17 == yy.bb.bM) {
                     if (var12 == -1) {
                        if (var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)yy.bb.bM;
                        } else if (var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)yy.bb.bM;
                           var14 = (byte)yy.bb.bM;
                           if (var10) {
                              var13 = (byte)yy.F.bM;
                           }

                           if (var10) {
                              var14 = (byte)yy.bb.bM;
                           }

                           if (var9) {
                              var13 = (byte)yy.bc.bM;
                           }

                           if (var9) {
                              var14 = (byte)yy.bc.bM;
                           }
                        }

                        if (var15 < var4 && var13 == 0) {
                           var13 = (byte)yy.D.bM;
                        }

                        var12 = var11;
                        if (var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if (var12 > 0) {
                        --var12;
                        var3[var16] = var14;
                     }
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
      byte[] var3 = new byte[16 * this.o.c * 16];
      this.a(var1, var2, var3);
      this.b(var1, var2, var3);
      this.t.a(this, this.o, var1, var2, var3);
      this.c.a(this, this.o, var1, var2, var3);
      zx var4 = new zx(this.o, var3, var1, var2);
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412;
      double var10 = 2053.236;
      this.g = this.a.a(this.g, var2, var3, var4, var5, 1, var7, (double)1.0F, (double)0.0F, (double)1.0F);
      this.h = this.b.a(this.h, var2, var3, var4, var5, 1, var7, (double)100.0F, (double)0.0F, (double)100.0F);
      this.d = this.l.a(this.d, var2, var3, var4, var5, var6, var7, var8 / (double)80.0F, var10 / (double)60.0F, var8 / (double)80.0F);
      this.e = this.j.a(this.e, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.f = this.k.a(this.f, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;
      double[] var14 = new double[var6];

      for(int var15 = 0; var15 < var6; ++var15) {
         var14[var15] = Math.cos((double)var15 * Math.PI * (double)6.0F / (double)var6) * (double)2.0F;
         double var16 = (double)var15;
         if (var15 > var6 / 2) {
            var16 = (double)(var6 - 1 - var15);
         }

         if (var16 < (double)4.0F) {
            var16 = (double)4.0F - var16;
            var14[var15] -= var16 * var16 * var16 * (double)10.0F;
         }
      }

      for(int var36 = 0; var36 < var5; ++var36) {
         for(int var38 = 0; var38 < var7; ++var38) {
            double var17 = (this.g[var13] + (double)256.0F) / (double)512.0F;
            if (var17 > (double)1.0F) {
               var17 = (double)1.0F;
            }

            double var19 = (double)0.0F;
            double var21 = this.h[var13] / (double)8000.0F;
            if (var21 < (double)0.0F) {
               var21 = -var21;
            }

            var21 = var21 * (double)3.0F - (double)3.0F;
            if (var21 < (double)0.0F) {
               var21 /= (double)2.0F;
               if (var21 < (double)-1.0F) {
                  var21 = (double)-1.0F;
               }

               var21 /= 1.4;
               var21 /= (double)2.0F;
               var17 = (double)0.0F;
            } else {
               if (var21 > (double)1.0F) {
                  var21 = (double)1.0F;
               }

               var21 /= (double)6.0F;
            }

            var17 += (double)0.5F;
            var21 = var21 * (double)var6 / (double)16.0F;
            ++var13;

            for(int var23 = 0; var23 < var6; ++var23) {
               double var24 = (double)0.0F;
               double var26 = var14[var23];
               double var28 = this.e[var12] / (double)512.0F;
               double var30 = this.f[var12] / (double)512.0F;
               double var32 = (this.d[var12] / (double)10.0F + (double)1.0F) / (double)2.0F;
               if (var32 < (double)0.0F) {
                  var24 = var28;
               } else if (var32 > (double)1.0F) {
                  var24 = var30;
               } else {
                  var24 = var28 + (var30 - var28) * var32;
               }

               var24 -= var26;
               if (var23 > var6 - 4) {
                  double var34 = (double)((float)(var23 - (var6 - 4)) / 3.0F);
                  var24 = var24 * ((double)1.0F - var34) + (double)-10.0F * var34;
               }

               if ((double)var23 < var19) {
                  double var47 = (var19 - (double)var23) / (double)4.0F;
                  if (var47 < (double)0.0F) {
                     var47 = (double)0.0F;
                  }

                  if (var47 > (double)1.0F) {
                     var47 = (double)1.0F;
                  }

                  var24 = var24 * ((double)1.0F - var47) + (double)-10.0F * var47;
               }

               var1[var12] = var24;
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
      this.c.a(this.o, this.i, var2, var3);

      for(int var6 = 0; var6 < 8; ++var6) {
         int var7 = var4 + this.i.nextInt(16) + 8;
         int var8 = this.i.nextInt(this.o.c - 8) + 4;
         int var9 = var5 + this.i.nextInt(16) + 8;
         (new ey(yy.C.bM)).a(this.o, this.i, var7, var8, var9);
      }

      int var11 = this.i.nextInt(this.i.nextInt(10) + 1) + 1;

      for(int var13 = 0; var13 < var11; ++var13) {
         int var18 = var4 + this.i.nextInt(16) + 8;
         int var23 = this.i.nextInt(this.o.c - 8) + 4;
         int var10 = var5 + this.i.nextInt(16) + 8;
         (new pl()).a(this.o, this.i, var18, var23, var10);
      }

      var11 = this.i.nextInt(this.i.nextInt(10) + 1);

      for(int var14 = 0; var14 < var11; ++var14) {
         int var19 = var4 + this.i.nextInt(16) + 8;
         int var24 = this.i.nextInt(this.o.c - 8) + 4;
         int var28 = var5 + this.i.nextInt(16) + 8;
         (new pt()).a(this.o, this.i, var19, var24, var28);
      }

      for(int var15 = 0; var15 < 10; ++var15) {
         int var20 = var4 + this.i.nextInt(16) + 8;
         int var25 = this.i.nextInt(this.o.c);
         int var29 = var5 + this.i.nextInt(16) + 8;
         (new aew()).a(this.o, this.i, var20, var25, var29);
      }

      if (this.i.nextInt(1) == 0) {
         int var16 = var4 + this.i.nextInt(16) + 8;
         int var21 = this.i.nextInt(this.o.c);
         int var26 = var5 + this.i.nextInt(16) + 8;
         (new bu(yy.af.bM)).a(this.o, this.i, var16, var21, var26);
      }

      if (this.i.nextInt(1) == 0) {
         int var17 = var4 + this.i.nextInt(16) + 8;
         int var22 = this.i.nextInt(this.o.c);
         int var27 = var5 + this.i.nextInt(16) + 8;
         (new bu(yy.ag.bM)).a(this.o, this.i, var17, var22, var27);
      }

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
      return "HellRandomLevelSource";
   }

   public List a(jf var1, int var2, int var3, int var4) {
      if (var1 == jf.a && this.c.a(var2, var3, var4)) {
         return this.c.b();
      } else {
         vh var5 = this.o.a();
         if (var5 == null) {
            return null;
         } else {
            sr var6 = var5.a(new acm(var2 >> 4, var4 >> 4));
            return var6 == null ? null : var6.a(var1);
         }
      }
   }

   public am a(ry var1, String var2, int var3, int var4, int var5) {
      return null;
   }
}
