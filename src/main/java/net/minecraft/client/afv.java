package net.minecraft.client;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class afv implements bd {
   public List a = new ArrayList();
   private ry i;
   private zh j;
   private List k = new ArrayList();
   private ge[] l;
   private ge[] m;
   private int n;
   private int o;
   private int p;
   private int q;
   private Minecraft r;
   private acr s;
   private IntBuffer t;
   private boolean u = false;
   private int v = 0;
   private int w;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F = -1;
   private int G = 2;
   private int H;
   private int I;
   private int J;
   int[] b = new int['썐'];
   IntBuffer c = bt.d(64);
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private List R = new ArrayList();
   private aak[] S = new aak[]{new aak(), new aak(), new aak(), new aak()};
   double d = (double)-9999.0F;
   double e = (double)-9999.0F;
   double f = (double)-9999.0F;
   public float g;
   int h = 0;

   public afv(Minecraft var1, zh var2) {
      this.r = var1;
      this.j = var2;
      byte var3 = 34;
      byte var4 = 8;
      this.q = bt.a(var3 * var3 * var4 * 3);
      this.u = mm.a();
      if (this.u) {
         this.c.clear();
         this.t = bt.d(var3 * var3 * var4);
         this.t.clear();
         this.t.position(0);
         this.t.limit(var3 * var3 * var4);
         ARBOcclusionQuery.glGenQueriesARB(this.t);
      }

      this.w = bt.a(3);
      GL11.glPushMatrix();
      GL11.glNewList(this.w, 4864);
      this.f();
      GL11.glEndList();
      GL11.glPopMatrix();
      cv var5 = cv.a;
      this.x = this.w + 1;
      GL11.glNewList(this.x, 4864);
      byte var7 = 64;
      int var8 = 256 / var7 + 2;
      float var6 = 16.0F;

      for(int var9 = -var7 * var8; var9 <= var7 * var8; var9 += var7) {
         for(int var10 = -var7 * var8; var10 <= var7 * var8; var10 += var7) {
            var5.b();
            var5.a((double)(var9 + 0), (double)var6, (double)(var10 + 0));
            var5.a((double)(var9 + var7), (double)var6, (double)(var10 + 0));
            var5.a((double)(var9 + var7), (double)var6, (double)(var10 + var7));
            var5.a((double)(var9 + 0), (double)var6, (double)(var10 + var7));
            var5.a();
         }
      }

      GL11.glEndList();
      this.y = this.w + 2;
      GL11.glNewList(this.y, 4864);
      var6 = -16.0F;
      var5.b();

      for(int var12 = -var7 * var8; var12 <= var7 * var8; var12 += var7) {
         for(int var13 = -var7 * var8; var13 <= var7 * var8; var13 += var7) {
            var5.a((double)(var12 + var7), (double)var6, (double)(var13 + 0));
            var5.a((double)(var12 + 0), (double)var6, (double)(var13 + 0));
            var5.a((double)(var12 + 0), (double)var6, (double)(var13 + var7));
            var5.a((double)(var12 + var7), (double)var6, (double)(var13 + var7));
         }
      }

      var5.a();
      GL11.glEndList();
   }

   private void f() {
      Random var1 = new Random(10842L);
      cv var2 = cv.a;
      var2.b();

      for(int var3 = 0; var3 < 1500; ++var3) {
         double var4 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.25F + var1.nextFloat() * 0.25F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < (double)1.0F && var12 > 0.01) {
            var12 = (double)1.0F / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * (double)100.0F;
            double var16 = var6 * (double)100.0F;
            double var18 = var8 * (double)100.0F;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var1.nextDouble() * Math.PI * (double)2.0F;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for(int var38 = 0; var38 < 4; ++var38) {
               double var39 = (double)0.0F;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var53 = var47 * var28 + var39 * var30;
               double var55 = var39 * var28 - var47 * var30;
               double var57 = var55 * var22 - var49 * var24;
               double var61 = var49 * var22 + var55 * var24;
               var2.a(var14 + var57, var16 + var53, var18 + var61);
            }
         }
      }

      var2.a();
   }

   public void a(ry var1) {
      if (this.i != null) {
         this.i.b((bd)this);
      }

      this.d = (double)-9999.0F;
      this.e = (double)-9999.0F;
      this.f = (double)-9999.0F;
      wb.a.a(var1);
      this.i = var1;
      this.s = new acr(var1);
      if (var1 != null) {
         var1.a((bd)this);
         this.a();
      }

   }

   public void a() {
      if (this.i != null) {
         yy.K.a(this.r.A.j);
         this.F = this.r.A.e;
         if (this.m != null) {
            for(int var1 = 0; var1 < this.m.length; ++var1) {
               this.m[var1].c();
            }
         }

         int var7 = 64 << 3 - this.F;
         if (var7 > 400) {
            var7 = 400;
         }

         this.n = var7 / 16 + 1;
         this.o = this.i.c / 16;
         this.p = var7 / 16 + 1;
         this.m = new ge[this.n * this.o * this.p];
         this.l = new ge[this.n * this.o * this.p];
         int var2 = 0;
         int var3 = 0;
         this.z = 0;
         this.A = 0;
         this.B = 0;
         this.C = this.n;
         this.D = this.o;
         this.E = this.p;

         for(int var4 = 0; var4 < this.k.size(); ++var4) {
            ((ge)this.k.get(var4)).u = false;
         }

         this.k.clear();
         this.a.clear();

         for(int var8 = 0; var8 < this.n; ++var8) {
            for(int var5 = 0; var5 < this.o; ++var5) {
               for(int var6 = 0; var6 < this.p; ++var6) {
                  this.m[(var6 * this.o + var5) * this.n + var8] = new ge(this.i, this.a, var8 * 16, var5 * 16, var6 * 16, 16, this.q + var2);
                  if (this.u) {
                     this.m[(var6 * this.o + var5) * this.n + var8].z = this.t.get(var3);
                  }

                  this.m[(var6 * this.o + var5) * this.n + var8].y = false;
                  this.m[(var6 * this.o + var5) * this.n + var8].x = true;
                  this.m[(var6 * this.o + var5) * this.n + var8].o = true;
                  this.m[(var6 * this.o + var5) * this.n + var8].w = var3++;
                  this.m[(var6 * this.o + var5) * this.n + var8].f();
                  this.l[(var6 * this.o + var5) * this.n + var8] = this.m[(var6 * this.o + var5) * this.n + var8];
                  this.k.add(this.m[(var6 * this.o + var5) * this.n + var8]);
                  var2 += 3;
               }
            }
         }

         if (this.i != null) {
            nq var9 = this.r.i;
            if (var9 != null) {
               this.b(me.c(var9.s), me.c(var9.t), me.c(var9.u));
               Arrays.sort(this.l, new oy(var9));
            }
         }

         this.G = 2;
      }
   }

   public void a(fb var1, fn var2, float var3) {
      if (this.G > 0) {
         --this.G;
      } else {
         pf.a("prepare");
         ah.a.a(this.i, this.j, this.r.q, this.r.i, var3);
         wb.a.a(this.i, this.j, this.r.q, this.r.i, this.r.A, var3);
         ah.a.a();
         this.H = 0;
         this.I = 0;
         this.J = 0;
         nq var4 = this.r.i;
         wb.b = var4.R + (var4.s - var4.R) * (double)var3;
         wb.c = var4.S + (var4.t - var4.S) * (double)var3;
         wb.d = var4.T + (var4.u - var4.T) * (double)var3;
         ah.b = var4.R + (var4.s - var4.R) * (double)var3;
         ah.c = var4.S + (var4.t - var4.S) * (double)var3;
         ah.d = var4.T + (var4.u - var4.T) * (double)var3;
         this.r.u.b((double)var3);
         pf.c("global");
         List var5 = this.i.q();
         this.H = var5.size();

         for(int var6 = 0; var6 < this.i.j.size(); ++var6) {
            ia var7 = (ia)this.i.j.get(var6);
            ++this.I;
            if (var7.a(var1)) {
               wb.a.a(var7, var3);
            }
         }

         pf.c("entities");

         for(int var9 = 0; var9 < var5.size(); ++var9) {
            ia var11 = (ia)var5.get(var9);
            if (var11.a(var1) && (var11.ao || var2.a(var11.C)) && (var11 != this.r.i || this.r.A.E != 0 || this.r.i.ar())) {
               int var8 = me.c(var11.t);
               if (var8 < 0) {
                  var8 = 0;
               }

               if (var8 >= this.i.c) {
                  var8 = this.i.c - 1;
               }

               if (this.i.i(me.c(var11.s), var8, me.c(var11.u))) {
                  ++this.I;
                  wb.a.a(var11, var3);
               }
            }
         }

         pf.c("tileentities");
         rt.b();

         for(int var10 = 0; var10 < this.a.size(); ++var10) {
            ah.a.a((bq)this.a.get(var10), var3);
         }

         this.r.u.a((double)var3);
         pf.b();
      }
   }

   public String b() {
      return "C: " + this.N + "/" + this.K + ". F: " + this.L + ", O: " + this.M + ", E: " + this.O;
   }

   public String c() {
      return "E: " + this.I + "/" + this.H + ". B: " + this.J + ", I: " + (this.H - this.J - this.I);
   }

   private void b(int var1, int var2, int var3) {
      var1 -= 8;
      var2 -= 8;
      var3 -= 8;
      this.z = Integer.MAX_VALUE;
      this.A = Integer.MAX_VALUE;
      this.B = Integer.MAX_VALUE;
      this.C = Integer.MIN_VALUE;
      this.D = Integer.MIN_VALUE;
      this.E = Integer.MIN_VALUE;
      int var4 = this.n * 16;
      int var5 = var4 / 2;

      for(int var6 = 0; var6 < this.n; ++var6) {
         int var7 = var6 * 16;
         int var8 = var7 + var5 - var1;
         if (var8 < 0) {
            var8 -= var4 - 1;
         }

         var8 /= var4;
         var7 -= var8 * var4;
         if (var7 < this.z) {
            this.z = var7;
         }

         if (var7 > this.C) {
            this.C = var7;
         }

         for(int var9 = 0; var9 < this.p; ++var9) {
            int var10 = var9 * 16;
            int var11 = var10 + var5 - var3;
            if (var11 < 0) {
               var11 -= var4 - 1;
            }

            var11 /= var4;
            var10 -= var11 * var4;
            if (var10 < this.B) {
               this.B = var10;
            }

            if (var10 > this.E) {
               this.E = var10;
            }

            for(int var12 = 0; var12 < this.o; ++var12) {
               int var13 = var12 * 16;
               if (var13 < this.A) {
                  this.A = var13;
               }

               if (var13 > this.D) {
                  this.D = var13;
               }

               ge var14 = this.m[(var9 * this.o + var12) * this.n + var6];
               boolean var15 = var14.u;
               var14.a(var7, var13, var10);
               if (!var15 && var14.u) {
                  this.k.add(var14);
               }
            }
         }
      }

   }

   public int a(nq var1, int var2, double var3) {
      pf.a("sortchunks");

      for(int var5 = 0; var5 < 10; ++var5) {
         this.Q = (this.Q + 1) % this.m.length;
         ge var6 = this.m[this.Q];
         if (var6.u && !this.k.contains(var6)) {
            this.k.add(var6);
         }
      }

      if (this.r.A.e != this.F) {
         this.a();
      }

      if (var2 == 0) {
         this.K = 0;
         this.P = 0;
         this.L = 0;
         this.M = 0;
         this.N = 0;
         this.O = 0;
      }

      double var33 = var1.R + (var1.s - var1.R) * var3;
      double var7 = var1.S + (var1.t - var1.S) * var3;
      double var9 = var1.T + (var1.u - var1.T) * var3;
      double var11 = var1.s - this.d;
      double var13 = var1.t - this.e;
      double var15 = var1.u - this.f;
      if (var11 * var11 + var13 * var13 + var15 * var15 > (double)16.0F) {
         this.d = var1.s;
         this.e = var1.t;
         this.f = var1.u;
         this.b(me.c(var1.s), me.c(var1.t), me.c(var1.u));
         Arrays.sort(this.l, new oy(var1));
      }

      rt.a();
      int var17 = 0;
      if (this.u && this.r.A.h && !this.r.A.g && var2 == 0) {
         int var18 = 0;
         int var19 = 16;
         this.a(var18, var19);

         for(int var20 = var18; var20 < var19; ++var20) {
            this.l[var20].x = true;
         }

         pf.c("render");
         var17 += this.a(var18, var19, var2, var3);

         do {
            pf.c("occ");
            var18 = var19;
            var19 *= 2;
            if (var19 > this.l.length) {
               var19 = this.l.length;
            }

            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(3008);
            GL11.glDisable(2912);
            GL11.glColorMask(false, false, false, false);
            GL11.glDepthMask(false);
            pf.a("check");
            this.a(var18, var19);
            pf.b();
            GL11.glPushMatrix();
            float var36 = 0.0F;
            float var21 = 0.0F;
            float var22 = 0.0F;

            for(int var23 = var18; var23 < var19; ++var23) {
               if (this.l[var23].e()) {
                  this.l[var23].o = false;
               } else {
                  if (!this.l[var23].o) {
                     this.l[var23].x = true;
                  }

                  if (this.l[var23].o && !this.l[var23].y) {
                     float var24 = me.c(this.l[var23].a((ia)var1));
                     int var25 = (int)(1.0F + var24 / 128.0F);
                     if (this.v % var25 == var23 % var25) {
                        ge var26 = this.l[var23];
                        float var27 = (float)((double)var26.i - var33);
                        float var28 = (float)((double)var26.j - var7);
                        float var29 = (float)((double)var26.k - var9);
                        float var30 = var27 - var36;
                        float var31 = var28 - var21;
                        float var32 = var29 - var22;
                        if (var30 != 0.0F || var31 != 0.0F || var32 != 0.0F) {
                           GL11.glTranslatef(var30, var31, var32);
                           var36 += var30;
                           var21 += var31;
                           var22 += var32;
                        }

                        pf.a("bb");
                        ARBOcclusionQuery.glBeginQueryARB(35092, this.l[var23].z);
                        this.l[var23].d();
                        ARBOcclusionQuery.glEndQueryARB(35092);
                        pf.b();
                        this.l[var23].y = true;
                     }
                  }
               }
            }

            GL11.glPopMatrix();
            if (this.r.A.g) {
               if (adt.b == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            pf.c("render");
            var17 += this.a(var18, var19, var2, var3);
         } while(var19 < this.l.length);
      } else {
         pf.c("render");
         var17 += this.a(0, this.l.length, var2, var3);
      }

      pf.b();
      return var17;
   }

   private void a(int var1, int var2) {
      for(int var3 = var1; var3 < var2; ++var3) {
         if (this.l[var3].y) {
            this.c.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.l[var3].z, 34919, this.c);
            if (this.c.get(0) != 0) {
               this.l[var3].y = false;
               this.c.clear();
               ARBOcclusionQuery.glGetQueryObjectuARB(this.l[var3].z, 34918, this.c);
               this.l[var3].x = this.c.get(0) != 0;
            }
         }
      }

   }

   private int a(int var1, int var2, int var3, double var4) {
      this.R.clear();
      int var6 = 0;

      for(int var7 = var1; var7 < var2; ++var7) {
         if (var3 == 0) {
            ++this.K;
            if (this.l[var7].p[var3]) {
               ++this.O;
            } else if (!this.l[var7].o) {
               ++this.L;
            } else if (this.u && !this.l[var7].x) {
               ++this.M;
            } else {
               ++this.N;
            }
         }

         if (!this.l[var7].p[var3] && this.l[var7].o && (!this.u || this.l[var7].x)) {
            int var8 = this.l[var7].a(var3);
            if (var8 >= 0) {
               this.R.add(this.l[var7]);
               ++var6;
            }
         }
      }

      nq var19 = this.r.i;
      double var20 = var19.R + (var19.s - var19.R) * var4;
      double var10 = var19.S + (var19.t - var19.S) * var4;
      double var12 = var19.T + (var19.u - var19.T) * var4;
      int var14 = 0;

      for(int var15 = 0; var15 < this.S.length; ++var15) {
         this.S[var15].b();
      }

      for(int var21 = 0; var21 < this.R.size(); ++var21) {
         ge var16 = (ge)this.R.get(var21);
         int var17 = -1;

         for(int var18 = 0; var18 < var14; ++var18) {
            if (this.S[var18].a(var16.i, var16.j, var16.k)) {
               var17 = var18;
            }
         }

         if (var17 < 0) {
            var17 = var14++;
            this.S[var17].a(var16.i, var16.j, var16.k, var20, var10, var12);
         }

         this.S[var17].a(var16.a(var3));
      }

      this.a(var3, var4);
      return var6;
   }

   public void a(int var1, double var2) {
      this.r.u.b(var2);

      for(int var4 = 0; var4 < this.S.length; ++var4) {
         this.S[var4].a();
      }

      this.r.u.a(var2);
   }

   public void d() {
      ++this.v;
   }

   public void a(float var1) {
      if (this.r.f.y.g == 1) {
         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         rt.a();
         GL11.glDepthMask(false);
         this.j.b(this.j.b("/misc/tunnel.png"));
         cv var19 = cv.a;

         for(int var20 = 0; var20 < 6; ++var20) {
            GL11.glPushMatrix();
            if (var20 == 1) {
               GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var20 == 2) {
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var20 == 3) {
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var20 == 4) {
               GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            }

            if (var20 == 5) {
               GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            }

            var19.b();
            var19.c(1579032);
            var19.a((double)-100.0F, (double)-100.0F, (double)-100.0F, (double)0.0F, (double)0.0F);
            var19.a((double)-100.0F, (double)-100.0F, (double)100.0F, (double)0.0F, (double)16.0F);
            var19.a((double)100.0F, (double)-100.0F, (double)100.0F, (double)16.0F, (double)16.0F);
            var19.a((double)100.0F, (double)-100.0F, (double)-100.0F, (double)16.0F, (double)0.0F);
            var19.a();
            GL11.glPopMatrix();
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
      } else if (!this.r.f.y.c) {
         GL11.glDisable(3553);
         fb var2 = this.i.a(this.r.i, var1);
         float var3 = (float)var2.a;
         float var4 = (float)var2.b;
         float var5 = (float)var2.c;
         if (this.r.A.g) {
            float var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            float var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
            float var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         GL11.glColor3f(var3, var4, var5);
         cv var21 = cv.a;
         GL11.glDepthMask(false);
         GL11.glEnable(2912);
         GL11.glColor3f(var3, var4, var5);
         GL11.glCallList(this.x);
         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         rt.a();
         float[] var22 = this.i.y.a(this.i.c(var1), var1);
         if (var22 != null) {
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(me.a(this.i.e(var1)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            float var25 = var22[0];
            float var9 = var22[1];
            float var10 = var22[2];
            if (this.r.A.g) {
               float var11 = (var25 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
               float var12 = (var25 * 30.0F + var9 * 70.0F) / 100.0F;
               float var13 = (var25 * 30.0F + var10 * 70.0F) / 100.0F;
               var25 = var11;
               var9 = var12;
               var10 = var13;
            }

            var21.a(6);
            var21.a(var25, var9, var10, var22[3]);
            var21.a((double)0.0F, (double)100.0F, (double)0.0F);
            byte var31 = 16;
            var21.a(var22[0], var22[1], var22[2], 0.0F);

            for(int var35 = 0; var35 <= var31; ++var35) {
               float var38 = (float)var35 * (float)Math.PI * 2.0F / (float)var31;
               float var14 = me.a(var38);
               float var15 = me.b(var38);
               var21.a((double)(var14 * 120.0F), (double)(var15 * 120.0F), (double)(-var15 * 40.0F * var22[3]));
            }

            var21.a();
            GL11.glPopMatrix();
            GL11.glShadeModel(7424);
         }

         GL11.glEnable(3553);
         GL11.glBlendFunc(770, 1);
         GL11.glPushMatrix();
         float var23 = 1.0F - this.i.j(var1);
         float var26 = 0.0F;
         float var27 = 0.0F;
         float var29 = 0.0F;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var23);
         GL11.glTranslatef(var26, var27, var29);
         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.i.c(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
         float var32 = 30.0F;
         GL11.glBindTexture(3553, this.j.b("/terrain/sun.png"));
         var21.b();
         var21.a((double)(-var32), (double)100.0F, (double)(-var32), (double)0.0F, (double)0.0F);
         var21.a((double)var32, (double)100.0F, (double)(-var32), (double)1.0F, (double)0.0F);
         var21.a((double)var32, (double)100.0F, (double)var32, (double)1.0F, (double)1.0F);
         var21.a((double)(-var32), (double)100.0F, (double)var32, (double)0.0F, (double)1.0F);
         var21.a();
         var32 = 20.0F;
         GL11.glBindTexture(3553, this.j.b("/terrain/moon_phases.png"));
         int var36 = this.i.d(var1);
         int var39 = var36 % 4;
         int var40 = var36 / 4 % 2;
         float var41 = (float)(var39 + 0) / 4.0F;
         float var16 = (float)(var40 + 0) / 2.0F;
         float var17 = (float)(var39 + 1) / 4.0F;
         float var18 = (float)(var40 + 1) / 2.0F;
         var21.b();
         var21.a((double)(-var32), (double)-100.0F, (double)var32, (double)var17, (double)var18);
         var21.a((double)var32, (double)-100.0F, (double)var32, (double)var41, (double)var18);
         var21.a((double)var32, (double)-100.0F, (double)(-var32), (double)var41, (double)var16);
         var21.a((double)(-var32), (double)-100.0F, (double)(-var32), (double)var17, (double)var16);
         var21.a();
         GL11.glDisable(3553);
         float var37 = this.i.h(var1) * var23;
         if (var37 > 0.0F) {
            GL11.glColor4f(var37, var37, var37, var37);
            GL11.glCallList(this.w);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(3008);
         GL11.glEnable(2912);
         GL11.glPopMatrix();
         GL11.glDisable(3553);
         GL11.glColor3f(0.0F, 0.0F, 0.0F);
         double var24 = this.r.h.e(var1).b - (double)63.0F;
         if (var24 < (double)0.0F) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 12.0F, 0.0F);
            GL11.glCallList(this.y);
            GL11.glPopMatrix();
            var27 = 1.0F;
            var29 = -((float)(var24 + (double)65.0F));
            var32 = -var27;
            var21.b();
            var21.a(0, 255);
            var21.a((double)(-var27), (double)var29, (double)var27);
            var21.a((double)var27, (double)var29, (double)var27);
            var21.a((double)var27, (double)var32, (double)var27);
            var21.a((double)(-var27), (double)var32, (double)var27);
            var21.a((double)(-var27), (double)var32, (double)(-var27));
            var21.a((double)var27, (double)var32, (double)(-var27));
            var21.a((double)var27, (double)var29, (double)(-var27));
            var21.a((double)(-var27), (double)var29, (double)(-var27));
            var21.a((double)var27, (double)var32, (double)(-var27));
            var21.a((double)var27, (double)var32, (double)var27);
            var21.a((double)var27, (double)var29, (double)var27);
            var21.a((double)var27, (double)var29, (double)(-var27));
            var21.a((double)(-var27), (double)var29, (double)(-var27));
            var21.a((double)(-var27), (double)var29, (double)var27);
            var21.a((double)(-var27), (double)var32, (double)var27);
            var21.a((double)(-var27), (double)var32, (double)(-var27));
            var21.a((double)(-var27), (double)var32, (double)(-var27));
            var21.a((double)(-var27), (double)var32, (double)var27);
            var21.a((double)var27, (double)var32, (double)var27);
            var21.a((double)var27, (double)var32, (double)(-var27));
            var21.a();
         }

         if (this.i.y.f()) {
            GL11.glColor3f(var3 * 0.2F + 0.04F, var4 * 0.2F + 0.04F, var5 * 0.6F + 0.1F);
         } else {
            GL11.glColor3f(var3, var4, var5);
         }

         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, -((float)(var24 - (double)16.0F)), 0.0F);
         GL11.glCallList(this.y);
         GL11.glPopMatrix();
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
      }
   }

   public void b(float var1) {
      if (!this.r.f.y.c) {
         if (this.r.A.j) {
            this.c(var1);
         } else {
            GL11.glDisable(2884);
            float var2 = (float)(this.r.i.S + (this.r.i.t - this.r.i.S) * (double)var1);
            byte var3 = 32;
            int var4 = 256 / var3;
            cv var5 = cv.a;
            GL11.glBindTexture(3553, this.j.b("/environment/clouds.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            fb var6 = this.i.f(var1);
            float var7 = (float)var6.a;
            float var8 = (float)var6.b;
            float var9 = (float)var6.c;
            if (this.r.A.g) {
               float var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
               float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
               float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
               var7 = var10;
               var8 = var11;
               var9 = var12;
            }

            float var24 = 4.8828125E-4F;
            double var25 = (double)((float)this.v + var1);
            double var13 = this.r.i.p + (this.r.i.s - this.r.i.p) * (double)var1 + var25 * (double)0.03F;
            double var15 = this.r.i.r + (this.r.i.u - this.r.i.r) * (double)var1;
            int var17 = me.c(var13 / (double)2048.0F);
            int var18 = me.c(var15 / (double)2048.0F);
            var13 -= (double)(var17 * 2048);
            var15 -= (double)(var18 * 2048);
            float var19 = this.i.y.e() - var2 + 0.33F;
            float var20 = (float)(var13 * (double)var24);
            float var21 = (float)(var15 * (double)var24);
            var5.b();
            var5.a(var7, var8, var9, 0.8F);

            for(int var22 = -var3 * var4; var22 < var3 * var4; var22 += var3) {
               for(int var23 = -var3 * var4; var23 < var3 * var4; var23 += var3) {
                  var5.a((double)(var22 + 0), (double)var19, (double)(var23 + var3), (double)((float)(var22 + 0) * var24 + var20), (double)((float)(var23 + var3) * var24 + var21));
                  var5.a((double)(var22 + var3), (double)var19, (double)(var23 + var3), (double)((float)(var22 + var3) * var24 + var20), (double)((float)(var23 + var3) * var24 + var21));
                  var5.a((double)(var22 + var3), (double)var19, (double)(var23 + 0), (double)((float)(var22 + var3) * var24 + var20), (double)((float)(var23 + 0) * var24 + var21));
                  var5.a((double)(var22 + 0), (double)var19, (double)(var23 + 0), (double)((float)(var22 + 0) * var24 + var20), (double)((float)(var23 + 0) * var24 + var21));
               }
            }

            var5.a();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3042);
            GL11.glEnable(2884);
         }
      }
   }

   public boolean a(double var1, double var3, double var5, float var7) {
      return false;
   }

   public void c(float var1) {
      GL11.glDisable(2884);
      float var2 = (float)(this.r.i.S + (this.r.i.t - this.r.i.S) * (double)var1);
      cv var3 = cv.a;
      float var4 = 12.0F;
      float var5 = 4.0F;
      double var6 = (double)((float)this.v + var1);
      double var8 = (this.r.i.p + (this.r.i.s - this.r.i.p) * (double)var1 + var6 * (double)0.03F) / (double)var4;
      double var10 = (this.r.i.r + (this.r.i.u - this.r.i.r) * (double)var1) / (double)var4 + (double)0.33F;
      float var12 = this.i.y.e() - var2 + 0.33F;
      int var13 = me.c(var8 / (double)2048.0F);
      int var14 = me.c(var10 / (double)2048.0F);
      var8 -= (double)(var13 * 2048);
      var10 -= (double)(var14 * 2048);
      GL11.glBindTexture(3553, this.j.b("/environment/clouds.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      fb var15 = this.i.f(var1);
      float var16 = (float)var15.a;
      float var17 = (float)var15.b;
      float var18 = (float)var15.c;
      if (this.r.A.g) {
         float var19 = (var16 * 30.0F + var17 * 59.0F + var18 * 11.0F) / 100.0F;
         float var20 = (var16 * 30.0F + var17 * 70.0F) / 100.0F;
         float var21 = (var16 * 30.0F + var18 * 70.0F) / 100.0F;
         var16 = var19;
         var17 = var20;
         var18 = var21;
      }

      float var37 = (float)(var8 * (double)0.0F);
      float var39 = (float)(var10 * (double)0.0F);
      float var41 = 0.00390625F;
      var37 = (float)me.c(var8) * var41;
      var39 = (float)me.c(var10) * var41;
      float var22 = (float)(var8 - (double)me.c(var8));
      float var23 = (float)(var10 - (double)me.c(var10));
      byte var24 = 8;
      byte var25 = 4;
      float var26 = 9.765625E-4F;
      GL11.glScalef(var4, 1.0F, var4);

      for(int var27 = 0; var27 < 2; ++var27) {
         if (var27 == 0) {
            GL11.glColorMask(false, false, false, false);
         } else if (this.r.A.g) {
            if (adt.b == 0) {
               GL11.glColorMask(false, true, true, true);
            } else {
               GL11.glColorMask(true, false, false, true);
            }
         } else {
            GL11.glColorMask(true, true, true, true);
         }

         for(int var28 = -var25 + 1; var28 <= var25; ++var28) {
            for(int var29 = -var25 + 1; var29 <= var25; ++var29) {
               var3.b();
               float var30 = (float)(var28 * var24);
               float var31 = (float)(var29 * var24);
               float var32 = var30 - var22;
               float var33 = var31 - var23;
               if (var12 > -var5 - 1.0F) {
                  var3.a(var16 * 0.7F, var17 * 0.7F, var18 * 0.7F, 0.8F);
                  var3.b(0.0F, -1.0F, 0.0F);
                  var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
                  var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
               }

               if (var12 <= var5 + 1.0F) {
                  var3.a(var16, var17, var18, 0.8F);
                  var3.b(0.0F, 1.0F, 0.0F);
                  var3.a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
                  var3.a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
               }

               var3.a(var16 * 0.9F, var17 * 0.9F, var18 * 0.9F, 0.8F);
               if (var28 > -1) {
                  var3.b(-1.0F, 0.0F, 0.0F);

                  for(int var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
                  }
               }

               if (var28 <= 1) {
                  var3.b(1.0F, 0.0F, 0.0F);

                  for(int var42 = 0; var42 < var24; ++var42) {
                     var3.a((double)(var32 + (float)var42 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var42 + 0.5F) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                     var3.a((double)(var32 + (float)var42 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var42 + 0.5F) * var41 + var37), (double)((var31 + (float)var24) * var41 + var39));
                     var3.a((double)(var32 + (float)var42 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var42 + 0.5F) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
                     var3.a((double)(var32 + (float)var42 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var42 + 0.5F) * var41 + var37), (double)((var31 + 0.0F) * var41 + var39));
                  }
               }

               var3.a(var16 * 0.8F, var17 * 0.8F, var18 * 0.8F, 0.8F);
               if (var29 > -1) {
                  var3.b(0.0F, 0.0F, -1.0F);

                  for(int var43 = 0; var43 < var24; ++var43) {
                     var3.a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var43 + 0.0F), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + (float)var43 + 0.5F) * var41 + var39));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var43 + 0.0F), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + (float)var43 + 0.5F) * var41 + var39));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var43 + 0.0F), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + (float)var43 + 0.5F) * var41 + var39));
                     var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var43 + 0.0F), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + (float)var43 + 0.5F) * var41 + var39));
                  }
               }

               if (var29 <= 1) {
                  var3.b(0.0F, 0.0F, 1.0F);

                  for(int var44 = 0; var44 < var24; ++var44) {
                     var3.a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var44 + 1.0F - var26), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + (float)var44 + 0.5F) * var41 + var39));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var44 + 1.0F - var26), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + (float)var44 + 0.5F) * var41 + var39));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var44 + 1.0F - var26), (double)((var30 + (float)var24) * var41 + var37), (double)((var31 + (float)var44 + 0.5F) * var41 + var39));
                     var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var44 + 1.0F - var26), (double)((var30 + 0.0F) * var41 + var37), (double)((var31 + (float)var44 + 0.5F) * var41 + var39));
                  }
               }

               var3.a();
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2884);
   }

   public boolean a(nq var1, boolean var2) {
      boolean var3 = false;
      if (var3) {
         Collections.sort(this.k, new jy(var1));
         int var17 = this.k.size() - 1;
         int var18 = this.k.size();

         for(int var19 = 0; var19 < var18; ++var19) {
            ge var20 = (ge)this.k.get(var17 - var19);
            if (!var2) {
               if (var20.a((ia)var1) > 256.0F) {
                  if (var20.o) {
                     if (var19 >= 30) {
                        return false;
                     }
                  } else if (var19 >= 1) {
                     return false;
                  }
               }
            } else if (!var20.o) {
               continue;
            }

            var20.a();
            this.k.remove(var20);
            var20.u = false;
         }

         return this.k.size() == 0;
      } else {
         byte var4 = 2;
         jy var5 = new jy(var1);
         ge[] var6 = new ge[var4];
         ArrayList var7 = null;
         int var8 = this.k.size();
         int var9 = 0;

         label170:
         for(int var10 = 0; var10 < var8; ++var10) {
            ge var11 = (ge)this.k.get(var10);
            if (!var2) {
               if (var11.a((ia)var1) > 256.0F) {
                  int var12;
                  for(var12 = 0; var12 < var4 && (var6[var12] == null || var5.a(var6[var12], var11) <= 0); ++var12) {
                  }

                  --var12;
                  if (var12 <= 0) {
                     continue;
                  }

                  int var13 = var12;

                  while(true) {
                     --var13;
                     if (var13 == 0) {
                        var6[var12] = var11;
                        continue label170;
                     }

                     var6[var13 - 1] = var6[var13];
                  }
               }
            } else if (!var11.o) {
               continue;
            }

            if (var7 == null) {
               var7 = new ArrayList();
            }

            ++var9;
            var7.add(var11);
            this.k.set(var10, (Object)null);
         }

         if (var7 != null) {
            if (var7.size() > 1) {
               Collections.sort(var7, var5);
            }

            for(int var21 = var7.size() - 1; var21 >= 0; --var21) {
               ge var23 = (ge)var7.get(var21);
               var23.a();
               var23.u = false;
            }
         }

         int var22 = 0;

         for(int var24 = var4 - 1; var24 >= 0; --var24) {
            ge var27 = var6[var24];
            if (var27 != null) {
               if (!var27.o && var24 != var4 - 1) {
                  var6[var24] = null;
                  var6[0] = null;
                  break;
               }

               var6[var24].a();
               var6[var24].u = false;
               ++var22;
            }
         }

         int var25 = 0;
         int var28 = 0;

         for(int var29 = this.k.size(); var25 != var29; ++var25) {
            ge var14 = (ge)this.k.get(var25);
            if (var14 != null) {
               boolean var15 = false;

               for(int var16 = 0; var16 < var4 && !var15; ++var16) {
                  if (var14 == var6[var16]) {
                     var15 = true;
                  }
               }

               if (!var15) {
                  if (var28 != var25) {
                     this.k.set(var28, var14);
                  }

                  ++var28;
               }
            }
         }

         while(true) {
            --var25;
            if (var25 < var28) {
               return var8 == var9 + var22;
            }

            this.k.remove(var25);
         }
      }
   }

   public void a(vi var1, gv var2, int var3, dk var4, float var5) {
      cv var6 = cv.a;
      GL11.glEnable(3042);
      GL11.glEnable(3008);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (me.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
      if (var3 == 0) {
         if (this.g > 0.0F) {
            GL11.glBlendFunc(774, 768);
            int var7 = this.j.b("/terrain.png");
            GL11.glBindTexture(3553, var7);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
            GL11.glPushMatrix();
            int var8 = this.i.a(var2.b, var2.c, var2.d);
            yy var9 = var8 > 0 ? yy.k[var8] : null;
            GL11.glDisable(3008);
            GL11.glPolygonOffset(-3.0F, -3.0F);
            GL11.glEnable(32823);
            double var10 = var1.R + (var1.s - var1.R) * (double)var5;
            double var12 = var1.S + (var1.t - var1.S) * (double)var5;
            double var14 = var1.T + (var1.u - var1.T) * (double)var5;
            if (var9 == null) {
               var9 = yy.t;
            }

            GL11.glEnable(3008);
            var6.b();
            var6.b(-var10, -var12, -var14);
            var6.c();
            this.s.a(var9, var2.b, var2.c, var2.d, 240 + (int)(this.g * 10.0F));
            var6.a();
            var6.b((double)0.0F, (double)0.0F, (double)0.0F);
            GL11.glDisable(3008);
            GL11.glPolygonOffset(0.0F, 0.0F);
            GL11.glDisable(32823);
            GL11.glEnable(3008);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
         }
      } else if (var4 != null) {
         GL11.glBlendFunc(770, 771);
         float var16 = me.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
         GL11.glColor4f(var16, var16, var16, me.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
         int var17 = this.j.b("/terrain.png");
         GL11.glBindTexture(3553, var17);
         int var18 = var2.b;
         int var20 = var2.c;
         int var11 = var2.d;
         if (var2.e == 0) {
            --var20;
         }

         if (var2.e == 1) {
            ++var20;
         }

         if (var2.e == 2) {
            --var11;
         }

         if (var2.e == 3) {
            ++var11;
         }

         if (var2.e == 4) {
            --var18;
         }

         if (var2.e == 5) {
            ++var18;
         }
      }

      GL11.glDisable(3042);
      GL11.glDisable(3008);
   }

   public void b(vi var1, gv var2, int var3, dk var4, float var5) {
      if (var3 == 0 && var2.a == bo.a) {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         float var6 = 0.002F;
         int var7 = this.i.a(var2.b, var2.c, var2.d);
         if (var7 > 0) {
            yy.k[var7].b((kq)this.i, var2.b, var2.c, var2.d);
            double var8 = var1.R + (var1.s - var1.R) * (double)var5;
            double var10 = var1.S + (var1.t - var1.S) * (double)var5;
            double var12 = var1.T + (var1.u - var1.T) * (double)var5;
            this.a(yy.k[var7].c_(this.i, var2.b, var2.c, var2.d).b((double)var6, (double)var6, (double)var6).c(-var8, -var10, -var12));
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
      }

   }

   private void a(c var1) {
      cv var2 = cv.a;
      var2.a(3);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.c);
      var2.a();
      var2.a(3);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.c);
      var2.a();
      var2.a(1);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a();
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = me.a(var1, 16);
      int var8 = me.a(var2, 16);
      int var9 = me.a(var3, 16);
      int var10 = me.a(var4, 16);
      int var11 = me.a(var5, 16);
      int var12 = me.a(var6, 16);

      for(int var13 = var7; var13 <= var10; ++var13) {
         int var14 = var13 % this.n;
         if (var14 < 0) {
            var14 += this.n;
         }

         for(int var15 = var8; var15 <= var11; ++var15) {
            int var16 = var15 % this.o;
            if (var16 < 0) {
               var16 += this.o;
            }

            for(int var17 = var9; var17 <= var12; ++var17) {
               int var18 = var17 % this.p;
               if (var18 < 0) {
                  var18 += this.p;
               }

               int var19 = (var18 * this.o + var16) * this.n + var14;
               ge var20 = this.m[var19];
               if (!var20.u) {
                  this.k.add(var20);
                  var20.f();
               }
            }
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      this.b(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.b(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   public void a(fn var1, float var2) {
      for(int var3 = 0; var3 < this.m.length; ++var3) {
         if (!this.m[var3].e() && (!this.m[var3].o || (var3 + this.h & 15) == 0)) {
            this.m[var3].a(var1);
         }
      }

      ++this.h;
   }

   public void a(String var1, int var2, int var3, int var4) {
      if (var1 != null) {
         this.r.w.b("C418 - " + var1);
      }

      this.r.C.a(var1, (float)var2, (float)var3, (float)var4, 1.0F, 1.0F);
   }

   public void a(String var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 16.0F;
      if (var8 > 1.0F) {
         var10 *= var8;
      }

      if (this.r.i.f(var2, var4, var6) < (double)(var10 * var10)) {
         this.r.C.b(var1, (float)var2, (float)var4, (float)var6, var8, var9);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.b(var1, var2, var4, var6, var8, var10, var12);
   }

   public wc b(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      if (this.r != null && this.r.i != null && this.r.j != null) {
         int var14 = this.r.A.P;
         if (var14 == 1 && this.i.w.nextInt(3) == 0) {
            var14 = 2;
         }

         double var15 = this.r.i.s - var2;
         double var17 = this.r.i.t - var4;
         double var19 = this.r.i.u - var6;
         Object var21 = null;
         if (var1.equals("hugeexplosion")) {
            this.r.j.a((wc)(var21 = new adc(this.i, var2, var4, var6, var8, var10, var12)));
         } else if (var1.equals("largeexplode")) {
            this.r.j.a((wc)(var21 = new ail(this.j, this.i, var2, var4, var6, var8, var10, var12)));
         }

         if (var21 != null) {
            return (wc)var21;
         } else {
            double var22 = (double)16.0F;
            if (var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22) {
               return null;
            } else if (var14 > 1) {
               return null;
            } else {
               if (var1.equals("bubble")) {
                  var21 = new pq(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("suspended")) {
                  var21 = new jd(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("depthsuspend")) {
                  var21 = new cn(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("townaura")) {
                  var21 = new cn(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("crit")) {
                  var21 = new afj(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("magicCrit")) {
                  var21 = new afj(this.i, var2, var4, var6, var8, var10, var12);
                  ((wc)var21).b(((wc)var21).h() * 0.3F, ((wc)var21).i() * 0.8F, ((wc)var21).j());
                  ((wc)var21).c(((wc)var21).k() + 1);
               } else if (var1.equals("smoke")) {
                  var21 = new aca(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("mobSpell")) {
                  var21 = new sq(this.i, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
                  ((wc)var21).b((float)var8, (float)var10, (float)var12);
               } else if (var1.equals("spell")) {
                  var21 = new sq(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("instantSpell")) {
                  var21 = new sq(this.i, var2, var4, var6, var8, var10, var12);
                  ((sq)var21).b(144);
               } else if (var1.equals("note")) {
                  var21 = new ae(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("portal")) {
                  var21 = new afy(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("enchantmenttable")) {
                  var21 = new afn(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("explode")) {
                  var21 = new nr(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("flame")) {
                  var21 = new o(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("lava")) {
                  var21 = new aw(this.i, var2, var4, var6);
               } else if (var1.equals("footstep")) {
                  var21 = new nb(this.j, this.i, var2, var4, var6);
               } else if (var1.equals("splash")) {
                  var21 = new adi(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("largesmoke")) {
                  var21 = new aca(this.i, var2, var4, var6, var8, var10, var12, 2.5F);
               } else if (var1.equals("cloud")) {
                  var21 = new kz(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("reddust")) {
                  var21 = new aao(this.i, var2, var4, var6, (float)var8, (float)var10, (float)var12);
               } else if (var1.equals("snowballpoof")) {
                  var21 = new ug(this.i, var2, var4, var6, acy.aC);
               } else if (var1.equals("dripWater")) {
                  var21 = new st(this.i, var2, var4, var6, net.minecraft.client.p.g);
               } else if (var1.equals("dripLava")) {
                  var21 = new st(this.i, var2, var4, var6, net.minecraft.client.p.h);
               } else if (var1.equals("snowshovel")) {
                  var21 = new zj(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.equals("slime")) {
                  var21 = new ug(this.i, var2, var4, var6, acy.aL);
               } else if (var1.equals("heart")) {
                  var21 = new ff(this.i, var2, var4, var6, var8, var10, var12);
               } else if (var1.startsWith("iconcrack_")) {
                  int var24 = Integer.parseInt(var1.substring(var1.indexOf("_") + 1));
                  var21 = new ug(this.i, var2, var4, var6, var8, var10, var12, acy.d[var24]);
               } else if (var1.startsWith("tilecrack_")) {
                  int var25 = Integer.parseInt(var1.substring(var1.indexOf("_") + 1));
                  var21 = new mp(this.i, var2, var4, var6, var8, var10, var12, yy.k[var25], 0, 0);
               }

               if (var21 != null) {
                  this.r.j.a((wc)var21);
               }

               return (wc)var21;
            }
         }
      } else {
         return null;
      }
   }

   public void a(ia var1) {
      var1.U();
      if (var1.ad != null) {
         this.j.a((String)var1.ad, (aaj)(new vt()));
      }

      if (var1.ae != null) {
         this.j.a((String)var1.ae, (aaj)(new vt()));
      }

   }

   public void b(ia var1) {
      if (var1.ad != null) {
         this.j.c(var1.ad);
      }

      if (var1.ae != null) {
         this.j.c(var1.ae);
      }

   }

   public void a(int var1, int var2, int var3, bq var4) {
   }

   public void e() {
      bt.b(this.q);
   }

   public void a(vi var1, int var2, int var3, int var4, int var5, int var6) {
      Random var7 = this.i.w;
      switch (var2) {
         case 1000:
            this.i.a((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.0F);
            break;
         case 1001:
            this.i.a((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.2F);
            break;
         case 1002:
            this.i.a((double)var3, (double)var4, (double)var5, "random.bow", 1.0F, 1.2F);
            break;
         case 1003:
            if (Math.random() < (double)0.5F) {
               this.i.a((double)var3 + (double)0.5F, (double)var4 + (double)0.5F, (double)var5 + (double)0.5F, "random.door_open", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
            } else {
               this.i.a((double)var3 + (double)0.5F, (double)var4 + (double)0.5F, (double)var5 + (double)0.5F, "random.door_close", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
            }
            break;
         case 1004:
            this.i.a((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.fizz", 0.5F, 2.6F + (var7.nextFloat() - var7.nextFloat()) * 0.8F);
            break;
         case 1005:
            if (acy.d[var6] instanceof pe) {
               this.i.a(((pe)acy.d[var6]).a, var3, var4, var5);
            } else {
               this.i.a((String)null, var3, var4, var5);
            }
            break;
         case 1007:
            this.i.a((double)var3 + (double)0.5F, (double)var4 + (double)0.5F, (double)var5 + (double)0.5F, "mob.ghast.charge", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
            break;
         case 1008:
            this.i.a((double)var3 + (double)0.5F, (double)var4 + (double)0.5F, (double)var5 + (double)0.5F, "mob.ghast.fireball", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
            break;
         case 1009:
            this.i.a((double)var3 + (double)0.5F, (double)var4 + (double)0.5F, (double)var5 + (double)0.5F, "mob.ghast.fireball", 1.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
            break;
         case 2000:
            int var36 = var6 % 3 - 1;
            int var38 = var6 / 3 % 3 - 1;
            double var40 = (double)var3 + (double)var36 * 0.6 + (double)0.5F;
            double var42 = (double)var4 + (double)0.5F;
            double var44 = (double)var5 + (double)var38 * 0.6 + (double)0.5F;

            for(int var48 = 0; var48 < 10; ++var48) {
               double var49 = var7.nextDouble() * 0.2 + 0.01;
               double var50 = var40 + (double)var36 * 0.01 + (var7.nextDouble() - (double)0.5F) * (double)var38 * (double)0.5F;
               double var51 = var42 + (var7.nextDouble() - (double)0.5F) * (double)0.5F;
               double var52 = var44 + (double)var38 * 0.01 + (var7.nextDouble() - (double)0.5F) * (double)var36 * (double)0.5F;
               double var53 = (double)var36 * var49 + var7.nextGaussian() * 0.01;
               double var54 = -0.03 + var7.nextGaussian() * 0.01;
               double var55 = (double)var38 * var49 + var7.nextGaussian() * 0.01;
               this.a("smoke", var50, var51, var52, var53, var54, var55);
            }
            break;
         case 2001:
            int var35 = var6 & 255;
            if (var35 > 0) {
               yy var37 = yy.k[var35];
               this.r.C.b(var37.bX.a(), (float)var3 + 0.5F, (float)var4 + 0.5F, (float)var5 + 0.5F, (var37.bX.b() + 1.0F) / 2.0F, var37.bX.c() * 0.8F);
            }

            this.r.j.a(var3, var4, var5, var6 & 255, var6 >> 8 & 255);
            break;
         case 2002:
            double var34 = (double)var3;
            double var39 = (double)var4;
            double var41 = (double)var5;
            String var43 = "iconcrack_" + acy.br.bM;

            for(int var46 = 0; var46 < 8; ++var46) {
               this.a(var43, var34, var39, var41, var7.nextGaussian() * 0.15, var7.nextDouble() * 0.2, var7.nextGaussian() * 0.15);
            }

            int var47 = acy.br.c(var6);
            float var16 = (float)(var47 >> 16 & 255) / 255.0F;
            float var17 = (float)(var47 >> 8 & 255) / 255.0F;
            float var18 = (float)(var47 >> 0 & 255) / 255.0F;
            String var19 = "spell";
            if (acy.br.f(var6)) {
               var19 = "instantSpell";
            }

            for(int var20 = 0; var20 < 100; ++var20) {
               double var21 = var7.nextDouble() * (double)4.0F;
               double var23 = var7.nextDouble() * Math.PI * (double)2.0F;
               double var25 = Math.cos(var23) * var21;
               double var27 = 0.01 + var7.nextDouble() * (double)0.5F;
               double var29 = Math.sin(var23) * var21;
               wc var31 = this.b(var19, var34 + var25 * 0.1, var39 + 0.3, var41 + var29 * 0.1, var25, var27, var29);
               if (var31 != null) {
                  float var32 = 0.75F + var7.nextFloat() * 0.25F;
                  var31.b(var16 * var32, var17 * var32, var18 * var32);
                  var31.d((float)var21);
               }
            }

            this.i.a((double)var3 + (double)0.5F, (double)var4 + (double)0.5F, (double)var5 + (double)0.5F, "random.glass", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
            break;
         case 2003:
            double var33 = (double)var3 + (double)0.5F;
            double var10 = (double)var4;
            double var12 = (double)var5 + (double)0.5F;
            String var14 = "iconcrack_" + acy.bz.bM;

            for(int var15 = 0; var15 < 8; ++var15) {
               this.a(var14, var33, var10, var12, var7.nextGaussian() * 0.15, var7.nextDouble() * 0.2, var7.nextGaussian() * 0.15);
            }

            for(double var45 = (double)0.0F; var45 < (Math.PI * 2D); var45 += 0.15707963267948966) {
               this.a("portal", var33 + Math.cos(var45) * (double)5.0F, var10 - 0.4, var12 + Math.sin(var45) * (double)5.0F, Math.cos(var45) * (double)-5.0F, (double)0.0F, Math.sin(var45) * (double)-5.0F);
               this.a("portal", var33 + Math.cos(var45) * (double)5.0F, var10 - 0.4, var12 + Math.sin(var45) * (double)5.0F, Math.cos(var45) * (double)-7.0F, (double)0.0F, Math.sin(var45) * (double)-7.0F);
            }
            break;
         case 2004:
            for(int var8 = 0; var8 < 20; ++var8) {
               double var9 = (double)var3 + (double)0.5F + ((double)this.i.w.nextFloat() - (double)0.5F) * (double)2.0F;
               double var11 = (double)var4 + (double)0.5F + ((double)this.i.w.nextFloat() - (double)0.5F) * (double)2.0F;
               double var13 = (double)var5 + (double)0.5F + ((double)this.i.w.nextFloat() - (double)0.5F) * (double)2.0F;
               this.i.a("smoke", var9, var11, var13, (double)0.0F, (double)0.0F, (double)0.0F);
               this.i.a("flame", var9, var11, var13, (double)0.0F, (double)0.0F, (double)0.0F);
            }
      }

   }
}
