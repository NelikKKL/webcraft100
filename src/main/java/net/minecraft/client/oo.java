package net.minecraft.client;

import java.util.List;

public class oo extends adh {
   public double a;
   public double b;
   public double c;
   public double[][] d = new double[64][3];
   public int e = -1;
   public vc[] f;
   public vc g;
   public vc h;
   public vc i;
   public vc by;
   public vc bz;
   public vc bA;
   public vc bB;
   public float bC = 0.0F;
   public float bD = 0.0F;
   public boolean bE = false;
   public boolean bF = false;
   private ia bJ;
   public int bG = 0;
   public sf bH = null;

   public oo(ry var1) {
      super(var1);
      this.f = new vc[]{this.g = new vc(this, "head", 6.0F, 6.0F), this.h = new vc(this, "body", 8.0F, 8.0F), this.i = new vc(this, "tail", 4.0F, 4.0F), this.by = new vc(this, "tail", 4.0F, 4.0F), this.bz = new vc(this, "tail", 4.0F, 4.0F), this.bA = new vc(this, "wing", 4.0F, 4.0F), this.bB = new vc(this, "wing", 4.0F, 4.0F)};
      this.bI = 200;
      this.h(this.bI);
      this.aA = "/mob/enderdragon/ender.png";
      this.a(16.0F, 8.0F);
      this.W = true;
      this.af = true;
      this.b = (double)100.0F;
      this.ao = true;
   }

   protected void b() {
      super.b();
      this.ag.a(16, new Integer(this.bI));
   }

   public double[] a(int var1, float var2) {
      if (this.aM <= 0) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.e - var1 * 1 & 63;
      int var4 = this.e - var1 * 1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.d[var3][0];

      double var8;
      for(var8 = this.d[var4][0] - var6; var8 < (double)-180.0F; var8 += (double)360.0F) {
      }

      while(var8 >= (double)180.0F) {
         var8 -= (double)360.0F;
      }

      var5[0] = var6 + var8 * (double)var2;
      var6 = this.d[var3][1];
      var8 = this.d[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = this.d[var3][2] + (this.d[var4][2] - this.d[var3][2]) * (double)var2;
      return var5;
   }

   public void c() {
      this.bC = this.bD;
      if (!this.o.I) {
         this.ag.b(16, this.aM);
      }

      if (this.aM <= 0) {
         float var26 = (this.Y.nextFloat() - 0.5F) * 8.0F;
         float var30 = (this.Y.nextFloat() - 0.5F) * 4.0F;
         float var31 = (this.Y.nextFloat() - 0.5F) * 8.0F;
         this.o.a("largeexplode", this.s + (double)var26, this.t + (double)2.0F + (double)var30, this.u + (double)var31, (double)0.0F, (double)0.0F, (double)0.0F);
      } else {
         this.ay();
         float var1 = 0.2F / (me.a(this.v * this.v + this.x * this.x) * 10.0F + 1.0F);
         var1 *= (float)Math.pow((double)2.0F, this.w);
         if (this.bF) {
            this.bD += var1 * 0.5F;
         } else {
            this.bD += var1;
         }

         while(this.y >= 180.0F) {
            this.y -= 360.0F;
         }

         while(this.y < -180.0F) {
            this.y += 360.0F;
         }

         if (this.e < 0) {
            for(int var2 = 0; var2 < this.d.length; ++var2) {
               this.d[var2][0] = (double)this.y;
               this.d[var2][1] = this.t;
            }
         }

         if (++this.e == this.d.length) {
            this.e = 0;
         }

         this.d[this.e][0] = (double)this.y;
         this.d[this.e][1] = this.t;
         if (this.o.I) {
            if (this.bi > 0) {
               double var27 = this.s + (this.bj - this.s) / (double)this.bi;
               double var4 = this.t + (this.bk - this.t) / (double)this.bi;
               double var6 = this.u + (this.bl - this.u) / (double)this.bi;

               double var8;
               for(var8 = this.bm - (double)this.y; var8 < (double)-180.0F; var8 += (double)360.0F) {
               }

               while(var8 >= (double)180.0F) {
                  var8 -= (double)360.0F;
               }

               this.y = (float)((double)this.y + var8 / (double)this.bi);
               this.z = (float)((double)this.z + (this.bn - (double)this.z) / (double)this.bi);
               --this.bi;
               this.d(var27, var4, var6);
               this.b(this.y, this.z);
            }
         } else {
            double var28 = this.a - this.s;
            double var32 = this.b - this.t;
            double var35 = this.c - this.u;
            double var37 = var28 * var28 + var32 * var32 + var35 * var35;
            if (this.bJ != null) {
               this.a = this.bJ.s;
               this.c = this.bJ.u;
               double var10 = this.a - this.s;
               double var12 = this.c - this.u;
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               double var16 = (double)0.4F + var14 / (double)80.0F - (double)1.0F;
               if (var16 > (double)10.0F) {
                  var16 = (double)10.0F;
               }

               this.b = this.bJ.C.b + var16;
            } else {
               this.a += this.Y.nextGaussian() * (double)2.0F;
               this.c += this.Y.nextGaussian() * (double)2.0F;
            }

            if (this.bE || var37 < (double)100.0F || var37 > (double)22500.0F || this.E || this.F) {
               this.aA();
            }

            var32 /= (double)me.a(var28 * var28 + var35 * var35);
            float var40 = 0.6F;
            if (var32 < (double)(-var40)) {
               var32 = (double)(-var40);
            }

            if (var32 > (double)var40) {
               var32 = (double)var40;
            }

            for(this.w += var32 * (double)0.1F; this.y < -180.0F; this.y += 360.0F) {
            }

            while(this.y >= 180.0F) {
               this.y -= 360.0F;
            }

            double var11 = (double)180.0F - Math.atan2(var28, var35) * (double)180.0F / (double)(float)Math.PI;

            double var13;
            for(var13 = var11 - (double)this.y; var13 < (double)-180.0F; var13 += (double)360.0F) {
            }

            while(var13 >= (double)180.0F) {
               var13 -= (double)360.0F;
            }

            if (var13 > (double)50.0F) {
               var13 = (double)50.0F;
            }

            if (var13 < (double)-50.0F) {
               var13 = (double)-50.0F;
            }

            fb var15 = fb.b(this.a - this.s, this.b - this.t, this.c - this.u).c();
            fb var49 = fb.b((double)me.a(this.y * (float)Math.PI / 180.0F), this.w, (double)(-me.b(this.y * (float)Math.PI / 180.0F))).c();
            float var17 = (float)(var49.b(var15) + (double)0.5F) / 1.5F;
            if (var17 < 0.0F) {
               var17 = 0.0F;
            }

            this.bt *= 0.8F;
            float var18 = me.a(this.v * this.v + this.x * this.x) * 1.0F + 1.0F;
            double var19 = Math.sqrt(this.v * this.v + this.x * this.x) * (double)1.0F + (double)1.0F;
            if (var19 > (double)40.0F) {
               var19 = (double)40.0F;
            }

            this.bt = (float)((double)this.bt + var13 * ((double)0.7F / var19 / (double)var18));
            this.y += this.bt * 0.1F;
            float var21 = (float)((double)2.0F / (var19 + (double)1.0F));
            float var22 = 0.06F;
            this.a(0.0F, -1.0F, var22 * (var17 * var21 + (1.0F - var21)));
            if (this.bF) {
               this.b(this.v * (double)0.8F, this.w * (double)0.8F, this.x * (double)0.8F);
            } else {
               this.b(this.v, this.w, this.x);
            }

            fb var23 = fb.b(this.v, this.w, this.x).c();
            float var24 = (float)(var23.b(var49) + (double)1.0F) / 2.0F;
            var24 = 0.8F + 0.15F * var24;
            this.v *= (double)var24;
            this.x *= (double)var24;
            this.w *= (double)0.91F;
         }

         this.at = this.y;
         this.g.M = this.g.N = 3.0F;
         this.i.M = this.i.N = 2.0F;
         this.by.M = this.by.N = 2.0F;
         this.bz.M = this.bz.N = 2.0F;
         this.h.N = 3.0F;
         this.h.M = 5.0F;
         this.bA.N = 2.0F;
         this.bA.M = 4.0F;
         this.bB.N = 3.0F;
         this.bB.M = 4.0F;
         float var29 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F / 180.0F * (float)Math.PI;
         float var3 = me.b(var29);
         float var34 = -me.a(var29);
         float var5 = this.y * (float)Math.PI / 180.0F;
         float var36 = me.a(var5);
         float var7 = me.b(var5);
         this.h.a();
         this.h.c(this.s + (double)(var36 * 0.5F), this.t, this.u - (double)(var7 * 0.5F), 0.0F, 0.0F);
         this.bA.a();
         this.bA.c(this.s + (double)(var7 * 4.5F), this.t + (double)2.0F, this.u + (double)(var36 * 4.5F), 0.0F, 0.0F);
         this.bB.a();
         this.bB.c(this.s - (double)(var7 * 4.5F), this.t + (double)2.0F, this.u - (double)(var36 * 4.5F), 0.0F, 0.0F);
         if (!this.o.I) {
            this.az();
         }

         if (!this.o.I && this.aQ == 0) {
            this.a(this.o.b((ia)this, (c)this.bA.C.b((double)4.0F, (double)2.0F, (double)4.0F).d((double)0.0F, (double)-2.0F, (double)0.0F)));
            this.a(this.o.b((ia)this, (c)this.bB.C.b((double)4.0F, (double)2.0F, (double)4.0F).d((double)0.0F, (double)-2.0F, (double)0.0F)));
            this.b(this.o.b((ia)this, (c)this.g.C.b((double)1.0F, (double)1.0F, (double)1.0F)));
         }

         double[] var38 = this.a(5, 1.0F);
         double[] var9 = this.a(0, 1.0F);
         float var41 = me.a(this.y * (float)Math.PI / 180.0F - this.bt * 0.01F);
         float var43 = me.b(this.y * (float)Math.PI / 180.0F - this.bt * 0.01F);
         this.g.a();
         this.g.c(this.s + (double)(var41 * 5.5F * var3), this.t + (var9[1] - var38[1]) * (double)1.0F + (double)(var34 * 5.5F), this.u - (double)(var43 * 5.5F * var3), 0.0F, 0.0F);

         for(int var39 = 0; var39 < 3; ++var39) {
            vc var42 = null;
            if (var39 == 0) {
               var42 = this.i;
            }

            if (var39 == 1) {
               var42 = this.by;
            }

            if (var39 == 2) {
               var42 = this.bz;
            }

            double[] var44 = this.a(12 + var39 * 2, 1.0F);
            float var45 = this.y * (float)Math.PI / 180.0F + this.b(var44[0] - var38[0]) * (float)Math.PI / 180.0F * 1.0F;
            float var46 = me.a(var45);
            float var47 = me.b(var45);
            float var48 = 1.5F;
            float var50 = (float)(var39 + 1) * 2.0F;
            var42.a();
            var42.c(this.s - (double)((var36 * var48 + var46 * var50) * var3), this.t + (var44[1] - var38[1]) * (double)1.0F - (double)((var50 + var48) * var34) + (double)1.5F, this.u + (double)((var7 * var48 + var47 * var50) * var3), 0.0F, 0.0F);
         }

         if (!this.o.I) {
            this.bF = this.a(this.g.C) | this.a(this.h.C);
         }

      }
   }

   private void ay() {
      if (this.bH != null) {
         if (this.bH.K) {
            if (!this.o.I) {
               this.a(this.g, pm.k, 10);
            }

            this.bH = null;
         } else if (this.Z % 10 == 0 && this.aM < this.bI) {
            ++this.aM;
         }
      }

      if (this.Y.nextInt(10) == 0) {
         float var1 = 32.0F;
         List var2 = this.o.a(sf.class, this.C.b((double)var1, (double)var1, (double)var1));
         sf var3 = null;
         double var4 = Double.MAX_VALUE;

         for(ia var7 : (Iterable<ia>)(Iterable)(var2)) {
            double var8 = var7.d((ia)this);
            if (var8 < var4) {
               var4 = var8;
               var3 = (sf)var7;
            }
         }

         this.bH = var3;
      }

   }

   private void az() {
      if (this.Z % 20 == 0) {
         fb var1 = this.f(1.0F);
         double var2 = (double)0.0F;
         double var4 = (double)-1.0F;
         double var6 = (double)0.0F;
      }

   }

   private void a(List var1) {
      double var2 = (this.h.C.a + this.h.C.d) / (double)2.0F;
      double var4 = (this.h.C.c + this.h.C.f) / (double)2.0F;

      for(ia var7 : (Iterable<ia>)(Iterable)(var1)) {
         if (var7 instanceof nq) {
            double var8 = var7.s - var2;
            double var10 = var7.u - var4;
            double var12 = var8 * var8 + var10 * var10;
            var7.h(var8 / var12 * (double)4.0F, (double)0.2F, var10 / var12 * (double)4.0F);
         }
      }

   }

   private void b(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         ia var3 = (ia)var1.get(var2);
         if (var3 instanceof nq) {
            var3.a(pm.a((nq)this), 10);
         }
      }

   }

   private void aA() {
      this.bE = false;
      if (this.Y.nextInt(2) == 0 && this.o.i.size() > 0) {
         this.bJ = (ia)this.o.i.get(this.Y.nextInt(this.o.i.size()));
      } else {
         boolean var1 = false;

         do {
            this.a = (double)0.0F;
            this.b = (double)(70.0F + this.Y.nextFloat() * 50.0F);
            this.c = (double)0.0F;
            this.a += (double)(this.Y.nextFloat() * 120.0F - 60.0F);
            this.c += (double)(this.Y.nextFloat() * 120.0F - 60.0F);
            double var2 = this.s - this.a;
            double var4 = this.t - this.b;
            double var6 = this.u - this.c;
            var1 = var2 * var2 + var4 * var4 + var6 * var6 > (double)100.0F;
         } while(!var1);

         this.bJ = null;
      }

   }

   private float b(double var1) {
      while(var1 >= (double)180.0F) {
         var1 -= (double)360.0F;
      }

      while(var1 < (double)-180.0F) {
         var1 += (double)360.0F;
      }

      return (float)var1;
   }

   private boolean a(c var1) {
      int var2 = me.c(var1.a);
      int var3 = me.c(var1.b);
      int var4 = me.c(var1.c);
      int var5 = me.c(var1.d);
      int var6 = me.c(var1.e);
      int var7 = me.c(var1.f);
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var2; var10 <= var5; ++var10) {
         for(int var11 = var3; var11 <= var6; ++var11) {
            for(int var12 = var4; var12 <= var7; ++var12) {
               int var13 = this.o.a(var10, var11, var12);
               if (var13 != 0) {
                  if (var13 != yy.ap.bM && var13 != yy.bJ.bM && var13 != yy.z.bM) {
                     var9 = true;
                     this.o.g(var10, var11, var12, 0);
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if (var9) {
         double var16 = var1.a + (var1.d - var1.a) * (double)this.Y.nextFloat();
         double var17 = var1.b + (var1.e - var1.b) * (double)this.Y.nextFloat();
         double var14 = var1.c + (var1.f - var1.c) * (double)this.Y.nextFloat();
         this.o.a("largeexplode", var16, var17, var14, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      return var8;
   }

   public boolean a(vc var1, pm var2, int var3) {
      if (var1 != this.g) {
         var3 = var3 / 4 + 1;
      }

      float var4 = this.y * (float)Math.PI / 180.0F;
      float var5 = me.a(var4);
      float var6 = me.b(var4);
      this.a = this.s + (double)(var5 * 5.0F) + (double)((this.Y.nextFloat() - 0.5F) * 2.0F);
      this.b = this.t + (double)(this.Y.nextFloat() * 3.0F) + (double)1.0F;
      this.c = this.u - (double)(var6 * 5.0F) + (double)((this.Y.nextFloat() - 0.5F) * 2.0F);
      this.bJ = null;
      if (var2.g() instanceof vi || var2 == pm.k) {
         this.e(var2, var3);
      }

      return true;
   }

   protected void ad() {
      ++this.bG;
      if (this.bG >= 180 && this.bG <= 200) {
         float var1 = (this.Y.nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.Y.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.Y.nextFloat() - 0.5F) * 8.0F;
         this.o.a("hugeexplosion", this.s + (double)var1, this.t + (double)2.0F + (double)var2, this.u + (double)var3, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      if (!this.o.I && this.bG > 150 && this.bG % 5 == 0) {
         int var4 = 1000;

         while(var4 > 0) {
            int var6 = fk.b(var4);
            var4 -= var6;
            this.o.a((ia)(new fk(this.o, this.s, this.t, this.u, var6)));
         }
      }

      this.b((double)0.0F, (double)0.1F, (double)0.0F);
      this.at = this.y += 20.0F;
      if (this.bG == 200) {
         int var5 = 10000;

         while(var5 > 0) {
            int var7 = fk.b(var5);
            var5 -= var7;
            this.o.a((ia)(new fk(this.o, this.s, this.t, this.u, var7)));
         }

         int var8 = 5 + this.Y.nextInt(2) * 2 - 1;
         int var10 = 5 + this.Y.nextInt(2) * 2 - 1;
         if (this.Y.nextInt(2) == 0) {
            var8 = 0;
         } else {
            var10 = 0;
         }

         this.a(me.c(this.s), me.c(this.u));
         this.ap();
         this.v();
      }

   }

   private void a(int var1, int var2) {
      int var3 = this.o.c / 2;
      aid.a = true;
      byte var4 = 4;

      for(int var5 = var3 - 1; var5 <= var3 + 32; ++var5) {
         for(int var6 = var1 - var4; var6 <= var1 + var4; ++var6) {
            for(int var7 = var2 - var4; var7 <= var2 + var4; ++var7) {
               double var8 = (double)(var6 - var1);
               double var10 = (double)(var7 - var2);
               double var12 = (double)me.a(var8 * var8 + var10 * var10);
               if (var12 <= (double)var4 - (double)0.5F) {
                  if (var5 < var3) {
                     if (!(var12 > (double)(var4 - 1) - (double)0.5F)) {
                        this.o.g(var6, var5, var7, yy.z.bM);
                     }
                  } else if (var5 > var3) {
                     this.o.g(var6, var5, var7, 0);
                  } else if (var12 > (double)(var4 - 1) - (double)0.5F) {
                     this.o.g(var6, var5, var7, yy.z.bM);
                  } else {
                     this.o.g(var6, var5, var7, yy.bH.bM);
                  }
               }
            }
         }
      }

      this.o.g(var1, var3 + 0, var2, yy.z.bM);
      this.o.g(var1, var3 + 1, var2, yy.z.bM);
      this.o.g(var1, var3 + 2, var2, yy.z.bM);
      this.o.g(var1 - 1, var3 + 2, var2, yy.aq.bM);
      this.o.g(var1 + 1, var3 + 2, var2, yy.aq.bM);
      this.o.g(var1, var3 + 2, var2 - 1, yy.aq.bM);
      this.o.g(var1, var3 + 2, var2 + 1, yy.aq.bM);
      this.o.g(var1, var3 + 3, var2, yy.z.bM);
      this.o.g(var1, var3 + 4, var2, yy.bK.bM);
      aid.a = false;
   }

   protected void al() {
   }

   public ia[] ab() {
      return this.f;
   }

   public boolean e_() {
      return false;
   }

   public int ax() {
      return this.ag.c(16);
   }
}
