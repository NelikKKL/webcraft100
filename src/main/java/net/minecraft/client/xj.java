package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class xj implements ej {
   private Random n;
   private eb o;
   private eb p;
   private eb q;
   private eb r;
   public eb a;
   public eb b;
   public eb c;
   private ry s;
   private final boolean t;
   private double[] u;
   private double[] v = new double[256];
   private bz w = new ln();
   public dc d = new dc();
   public xn e = new xn();
   public kd f = new kd();
   private bz x = new rf();
   private sr[] y;
   double[] g;
   double[] h;
   double[] i;
   double[] j;
   double[] k;
   float[] l;
   int[][] m = new int[32][32];

   public xj(ry var1, long var2, boolean var4) {
      this.s = var1;
      this.t = var4;
      this.n = new Random(var2);
      this.o = new eb(this.n, 16);
      this.p = new eb(this.n, 16);
      this.q = new eb(this.n, 8);
      this.r = new eb(this.n, 4);
      this.a = new eb(this.n, 10);
      this.b = new eb(this.n, 16);
      this.c = new eb(this.n, 8);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      int var5 = this.s.c / 8;
      int var6 = this.s.e;
      int var7 = var4 + 1;
      int var8 = this.s.c / 8 + 1;
      int var9 = var4 + 1;
      this.y = this.s.a().b(this.y, var1 * 4 - 2, var2 * 4 - 2, var7 + 5, var9 + 5);
      this.u = this.a(this.u, var1 * var4, 0, var2 * var4, var7, var8, var9);

      for(int var10 = 0; var10 < var4; ++var10) {
         for(int var11 = 0; var11 < var4; ++var11) {
            for(int var12 = 0; var12 < var5; ++var12) {
               double var13 = (double)0.125F;
               double var15 = this.u[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
               double var17 = this.u[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
               double var19 = this.u[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
               double var21 = this.u[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
               double var23 = (this.u[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
               double var25 = (this.u[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
               double var27 = (this.u[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
               double var29 = (this.u[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;

               for(int var31 = 0; var31 < 8; ++var31) {
                  double var32 = (double)0.25F;
                  double var34 = var15;
                  double var36 = var17;
                  double var38 = (var19 - var15) * var32;
                  double var40 = (var21 - var17) * var32;

                  for(int var42 = 0; var42 < 4; ++var42) {
                     int var43 = var42 + var10 * 4 << this.s.b | 0 + var11 * 4 << this.s.a | var12 * 8 + var31;
                     int var44 = 1 << this.s.a;
                     var43 -= var44;
                     double var45 = (double)0.25F;
                     double var49 = (var36 - var34) * var45;
                     double var47 = var34 - var49;

                     for(int var51 = 0; var51 < 4; ++var51) {
                        if ((var47 += var49) > (double)0.0F) {
                           var3[var43 += var44] = (byte)yy.t.bM;
                        } else if (var12 * 8 + var31 < var6) {
                           var3[var43 += var44] = (byte)yy.B.bM;
                        } else {
                           var3[var43 += var44] = 0;
                        }
                     }

                     var34 += var38;
                     var36 += var40;
                  }

                  var15 += var23;
                  var17 += var25;
                  var19 += var27;
                  var21 += var29;
               }
            }
         }
      }

   }

   public void a(int var1, int var2, byte[] var3, sr[] var4) {
      int var5 = this.s.e;
      double var6 = (double)0.03125F;
      this.v = this.r.a(this.v, var1 * 16, var2 * 16, 0, 16, 16, 1, var6 * (double)2.0F, var6 * (double)2.0F, var6 * (double)2.0F);
      float[] var8 = this.s.a().b(var1 * 16, var2 * 16, 16, 16);

      for(int var9 = 0; var9 < 16; ++var9) {
         for(int var10 = 0; var10 < 16; ++var10) {
            float var11 = var8[var10 + var9 * 16];
            sr var12 = var4[var10 + var9 * 16];
            int var13 = (int)(this.v[var9 + var10 * 16] / (double)3.0F + (double)3.0F + this.n.nextDouble() * (double)0.25F);
            int var14 = -1;
            byte var15 = var12.t;
            byte var16 = var12.u;

            for(int var17 = this.s.d; var17 >= 0; --var17) {
               int var18 = (var10 * 16 + var9) * this.s.c + var17;
               if (var17 <= 0 + this.n.nextInt(5)) {
                  var3[var18] = (byte)yy.z.bM;
               } else {
                  byte var19 = var3[var18];
                  if (var19 == 0) {
                     var14 = -1;
                  } else if (var19 == yy.t.bM) {
                     if (var14 == -1) {
                        if (var13 <= 0) {
                           var15 = 0;
                           var16 = (byte)yy.t.bM;
                        } else if (var17 >= var5 - 4 && var17 <= var5 + 1) {
                           var15 = var12.t;
                           var16 = var12.u;
                        }

                        if (var17 < var5 && var15 == 0) {
                           if (var11 < 0.15F) {
                              var15 = (byte)yy.aT.bM;
                           } else {
                              var15 = (byte)yy.B.bM;
                           }
                        }

                        var14 = var13;
                        if (var17 >= var5 - 1) {
                           var3[var18] = var15;
                        } else {
                           var3[var18] = var16;
                        }
                     } else if (var14 > 0) {
                        --var14;
                        var3[var18] = var16;
                        if (var14 == 0 && var16 == yy.E.bM) {
                           var14 = this.n.nextInt(4);
                           var16 = (byte)yy.Q.bM;
                        }
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
      this.n.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte[16 * this.s.c * 16];
      zx var4 = new zx(this.s, var3, var1, var2);
      this.a(var1, var2, var3);
      this.y = this.s.a().a((sr[])this.y, var1 * 16, var2 * 16, 16, 16);
      this.a(var1, var2, var3, this.y);
      this.w.a(this, this.s, var1, var2, var3);
      this.x.a(this, this.s, var1, var2, var3);
      if (this.t) {
         this.f.a(this, this.s, var1, var2, var3);
         this.e.a(this, this.s, var1, var2, var3);
         this.d.a(this, this.s, var1, var2, var3);
      }

      var4.c();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      if (this.l == null) {
         this.l = new float[25];

         for(int var8 = -2; var8 <= 2; ++var8) {
            for(int var9 = -2; var9 <= 2; ++var9) {
               float var10 = 10.0F / me.c((float)(var8 * var8 + var9 * var9) + 0.2F);
               this.l[var8 + 2 + (var9 + 2) * 5] = var10;
            }
         }
      }

      double var44 = 684.412;
      double var45 = 684.412;
      this.j = this.a.a(this.j, var2, var4, var5, var7, 1.121, 1.121, (double)0.5F);
      this.k = this.b.a(this.k, var2, var4, var5, var7, (double)200.0F, (double)200.0F, (double)0.5F);
      this.g = this.q.a(this.g, var2, var3, var4, var5, var6, var7, var44 / (double)80.0F, var45 / (double)160.0F, var44 / (double)80.0F);
      this.h = this.o.a(this.h, var2, var3, var4, var5, var6, var7, var44, var45, var44);
      this.i = this.p.a(this.i, var2, var3, var4, var5, var6, var7, var44, var45, var44);
      var4 = 0;
      var2 = 0;
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;
            byte var19 = 2;
            sr var20 = this.y[var14 + 2 + (var15 + 2) * (var5 + 5)];

            for(int var21 = -var19; var21 <= var19; ++var21) {
               for(int var22 = -var19; var22 <= var19; ++var22) {
                  sr var23 = this.y[var14 + var21 + 2 + (var15 + var22 + 2) * (var5 + 5)];
                  float var24 = this.l[var21 + 2 + (var22 + 2) * 5] / (var23.w + 2.0F);
                  if (var23.w > var20.w) {
                     var24 /= 2.0F;
                  }

                  var16 += var23.x * var24;
                  var17 += var23.w * var24;
                  var18 += var24;
               }
            }

            var16 /= var18;
            var17 /= var18;
            var16 = var16 * 0.9F + 0.1F;
            var17 = (var17 * 4.0F - 1.0F) / 8.0F;
            double var50 = this.k[var13] / (double)8000.0F;
            if (var50 < (double)0.0F) {
               var50 = -var50 * 0.3;
            }

            var50 = var50 * (double)3.0F - (double)2.0F;
            if (var50 < (double)0.0F) {
               var50 /= (double)2.0F;
               if (var50 < (double)-1.0F) {
                  var50 = (double)-1.0F;
               }

               var50 /= 1.4;
               var50 /= (double)2.0F;
            } else {
               if (var50 > (double)1.0F) {
                  var50 = (double)1.0F;
               }

               var50 /= (double)8.0F;
            }

            ++var13;

            for(int var55 = 0; var55 < var6; ++var55) {
               double var56 = (double)var17;
               double var26 = (double)var16;
               var56 += var50 * 0.2;
               var56 = var56 * (double)var6 / (double)16.0F;
               double var28 = (double)var6 / (double)2.0F + var56 * (double)4.0F;
               double var30 = (double)0.0F;
               double var32 = ((double)var55 - var28) * (double)12.0F * (double)128.0F / (double)this.s.c / var26;
               if (var32 < (double)0.0F) {
                  var32 *= (double)4.0F;
               }

               double var34 = this.h[var12] / (double)512.0F;
               double var36 = this.i[var12] / (double)512.0F;
               double var38 = (this.g[var12] / (double)10.0F + (double)1.0F) / (double)2.0F;
               if (var38 < (double)0.0F) {
                  var30 = var34;
               } else if (var38 > (double)1.0F) {
                  var30 = var36;
               } else {
                  var30 = var34 + (var36 - var34) * var38;
               }

               var30 -= var32;
               if (var55 > var6 - 4) {
                  double var40 = (double)((float)(var55 - (var6 - 4)) / 3.0F);
                  var30 = var30 * ((double)1.0F - var40) + (double)-10.0F * var40;
               }

               var1[var12] = var30;
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
      sr var6 = this.s.a().a(var4 + 16, var5 + 16);
      this.n.setSeed(this.s.t());
      long var7 = this.n.nextLong() / 2L * 2L + 1L;
      long var9 = this.n.nextLong() / 2L * 2L + 1L;
      this.n.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.s.t());
      boolean var11 = false;
      if (this.t) {
         this.f.a(this.s, this.n, var2, var3);
         var11 = this.e.a(this.s, this.n, var2, var3);
         this.d.a(this.s, this.n, var2, var3);
      }

      if (!var11 && this.n.nextInt(4) == 0) {
         int var12 = var4 + this.n.nextInt(16) + 8;
         int var13 = this.n.nextInt(this.s.c);
         int var14 = var5 + this.n.nextInt(16) + 8;
         (new qv(yy.B.bM)).a(this.s, this.n, var12, var13, var14);
      }

      if (!var11 && this.n.nextInt(8) == 0) {
         int var18 = var4 + this.n.nextInt(16) + 8;
         int var21 = this.n.nextInt(this.n.nextInt(this.s.c - 8) + 8);
         int var24 = var5 + this.n.nextInt(16) + 8;
         if (var21 < this.s.e || this.n.nextInt(10) == 0) {
            (new qv(yy.D.bM)).a(this.s, this.n, var18, var21, var24);
         }
      }

      for(int var19 = 0; var19 < 8; ++var19) {
         int var22 = var4 + this.n.nextInt(16) + 8;
         int var25 = this.n.nextInt(this.s.c);
         int var15 = var5 + this.n.nextInt(16) + 8;
         if ((new acj()).a(this.s, this.n, var22, var25, var15)) {
         }
      }

      var6.a(this.s, this.n, var4, var5);
      we.a(this.s, var6, var4 + 8, var5 + 8, 16, 16, this.n);
      var4 += 8;
      var5 += 8;

      for(int var20 = 0; var20 < 16; ++var20) {
         for(int var23 = 0; var23 < 16; ++var23) {
            int var26 = this.s.e(var4 + var20, var5 + var23);
            if (this.s.p(var20 + var4, var26 - 1, var23 + var5)) {
               this.s.g(var20 + var4, var26 - 1, var23 + var5, yy.aT.bM);
            }

            if (this.s.r(var20 + var4, var26, var23 + var5)) {
               this.s.g(var20 + var4, var26, var23 + var5, yy.aS.bM);
            }
         }
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
      return "RandomLevelSource";
   }

   public List a(jf var1, int var2, int var3, int var4) {
      vh var5 = this.s.a();
      if (var5 == null) {
         return null;
      } else {
         sr var6 = var5.a(new acm(var2 >> 4, var4 >> 4));
         return var6 == null ? null : var6.a(var1);
      }
   }

   public am a(ry var1, String var2, int var3, int var4, int var5) {
      return "Stronghold".equals(var2) && this.d != null ? this.d.a(var1, var3, var4, var5) : null;
   }
}
