package net.minecraft.client;

import net.minecraft.client.awtshim.BufferedImage;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class adt {
   public static boolean a = false;
   public static int b;
   private Minecraft r;
   private float s = 0.0F;
   public n c;
   private int t;
   private ia u = null;
   private ne v = new ne();
   private ne w = new ne();
   private ne x = new ne();
   private ne y = new ne();
   private ne z = new ne();
   private ne A = new ne();
   private float B = 4.0F;
   private float C = 4.0F;
   private float D = 0.0F;
   private float E = 0.0F;
   private float F = 0.0F;
   private float G = 0.0F;
   private float H;
   private float I;
   private float J;
   private float K;
   private float L;
   private float M = 0.0F;
   private float N = 0.0F;
   private float O = 0.0F;
   private float P = 0.0F;
   public int d;
   private int[] Q;
   private float R;
   private float S;
   private float T;
   private boolean U = false;
   private double V = (double)1.0F;
   private double W = (double)0.0F;
   private double X = (double)0.0F;
   private long Y = System.currentTimeMillis();
   private long Z = 0L;
   private boolean aa = false;
   float e = 0.0F;
   float f = 0.0F;
   float g = 0.0F;
   float h = 0.0F;
   private Random ab = new Random();
   private int ac = 0;
   float[] i;
   float[] j;
   volatile int k = 0;
   volatile int l = 0;
   FloatBuffer m = bt.e(16);
   float n;
   float o;
   float p;
   private float ad;
   private float ae;
   public int q;

   public adt(Minecraft var1) {
      this.r = var1;
      this.c = new n(var1);
      this.d = var1.p.a(new BufferedImage(16, 16, 1));
      this.Q = new int[256];
   }

   public void a() {
      this.c();
      this.d();
      this.ad = this.ae;
      this.C = this.B;
      this.E = this.D;
      this.G = this.F;
      this.N = this.M;
      this.P = this.O;
      if (this.r.A.I) {
         float var1 = this.r.A.c * 0.6F + 0.2F;
         float var2 = var1 * var1 * var1 * 8.0F;
         this.J = this.v.a(this.H, 0.05F * var2);
         this.K = this.w.a(this.I, 0.05F * var2);
         this.L = 0.0F;
         this.H = 0.0F;
         this.I = 0.0F;
      }

      if (this.r.i == null) {
         this.r.i = this.r.h;
      }

      float var4 = this.r.f.c(me.c(this.r.i.s), me.c(this.r.i.t), me.c(this.r.i.u));
      float var5 = (float)(3 - this.r.A.e) / 3.0F;
      float var3 = var4 * (1.0F - var5) + var5;
      this.ae += (var3 - this.ae) * 0.1F;
      ++this.t;
      this.c.a();
      this.f();
   }

   public void a(float var1) {
      if (this.r.i != null) {
         if (this.r.f != null) {
            double var2 = (double)this.r.c.c();
            this.r.z = this.r.i.a(var2, var1);
            double var4 = var2;
            fb var6 = this.r.i.e(var1);
            if (this.r.z != null) {
               var4 = this.r.z.f.d(var6);
            }

            if (this.r.c.h()) {
               var2 = (double)6.0F;
               var4 = (double)6.0F;
            } else {
               if (var4 > (double)3.0F) {
                  var4 = (double)3.0F;
               }

               var2 = var4;
            }

            fb var7 = this.r.i.f(var1);
            fb var8 = var6.c(var7.a * var2, var7.b * var2, var7.c * var2);
            this.u = null;
            float var9 = 1.0F;
            List var10 = this.r.f.b((ia)this.r.i, (c)this.r.i.C.a(var7.a * var2, var7.b * var2, var7.c * var2).b((double)var9, (double)var9, (double)var9));
            double var11 = (double)0.0F;

            for(int var13 = 0; var13 < var10.size(); ++var13) {
               ia var14 = (ia)var10.get(var13);
               if (var14.e_()) {
                  float var15 = var14.Q();
                  c var16 = var14.C.b((double)var15, (double)var15, (double)var15);
                  gv var17 = var16.a(var6, var8);
                  if (var16.a(var6)) {
                     if ((double)0.0F < var11 || var11 == (double)0.0F) {
                        this.u = var14;
                        var11 = (double)0.0F;
                     }
                  } else if (var17 != null) {
                     double var18 = var6.d(var17.f);
                     if (var18 < var11 || var11 == (double)0.0F) {
                        this.u = var14;
                        var11 = var18;
                     }
                  }
               }
            }

            if (this.u != null) {
               this.r.z = new gv(this.u);
            }

         }
      }
   }

   private void c() {
      di var1 = (di)this.r.i;
      this.T = var1.o();
      this.S = this.R;
      this.R += (this.T - this.R) * 0.5F;
   }

   private float a(float var1, boolean var2) {
      if (this.q > 0) {
         return 90.0F;
      } else {
         vi var3 = (vi)this.r.i;
         float var4 = 70.0F;
         if (var2) {
            var4 += this.r.A.M * 40.0F;
            var4 *= this.S + (this.R - this.S) * var1;
         }

         if (var3.ag() <= 0) {
            float var5 = (float)var3.aS + var1;
            var4 /= (1.0F - 500.0F / (var5 + 500.0F)) * 2.0F + 1.0F;
         }

         int var7 = abz.a(this.r.f, var3, var1);
         if (var7 != 0 && net.minecraft.client.yy.k[var7].bZ == net.minecraft.client.p.g) {
            var4 = var4 * 60.0F / 70.0F;
         }

         return var4 + this.N + (this.M - this.N) * var1;
      }
   }

   private void d(float var1) {
      nq var2 = this.r.i;
      float var3 = (float)var2.aP - var1;
      if (var2.ag() <= 0) {
         float var4 = (float)var2.aS + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if (!(var3 < 0.0F)) {
         var3 /= (float)var2.aQ;
         var3 = me.a(var3 * var3 * var3 * var3 * (float)Math.PI);
         float var7 = var2.aR;
         GL11.glRotatef(-var7, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
      }
   }

   private void e(float var1) {
      if (this.r.i instanceof vi) {
         vi var2 = (vi)this.r.i;
         float var3 = var2.P - var2.O;
         float var4 = -(var2.P + var3 * var1);
         float var5 = var2.bF + (var2.bG - var2.bF) * var1;
         float var6 = var2.aU + (var2.aV - var2.aU) * var1;
         GL11.glTranslatef(me.a(var4 * (float)Math.PI) * var5 * 0.5F, -Math.abs(me.b(var4 * (float)Math.PI) * var5), 0.0F);
         GL11.glRotatef(me.a(var4 * (float)Math.PI) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(me.b(var4 * (float)Math.PI - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }
   }

   private void f(float var1) {
      nq var2 = this.r.i;
      float var3 = var2.L - 1.62F;
      double var4 = var2.p + (var2.s - var2.p) * (double)var1;
      double var6 = var2.q + (var2.t - var2.q) * (double)var1 - (double)var3;
      double var8 = var2.r + (var2.u - var2.r) * (double)var1;
      GL11.glRotatef(this.P + (this.O - this.P) * var1, 0.0F, 0.0F, 1.0F);
      if (var2.ar()) {
         var3 = (float)((double)var3 + (double)1.0F);
         GL11.glTranslatef(0.0F, 0.3F, 0.0F);
         if (!this.r.A.J) {
            int var10 = this.r.f.a(me.c(var2.s), me.c(var2.t), me.c(var2.u));
            if (var10 == yy.S.bM) {
               int var11 = this.r.f.d(me.c(var2.s), me.c(var2.t), me.c(var2.u));
               int var12 = var11 & 3;
               GL11.glRotatef((float)(var12 * 90), 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.A + (var2.y - var2.A) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
            GL11.glRotatef(var2.B + (var2.z - var2.B) * var1, -1.0F, 0.0F, 0.0F);
         }
      } else if (this.r.A.E > 0) {
         double var30 = (double)(this.C + (this.B - this.C) * var1);
         if (this.r.A.J) {
            float var31 = this.E + (this.D - this.E) * var1;
            float var13 = this.G + (this.F - this.G) * var1;
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var30));
            GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var31, 0.0F, 1.0F, 0.0F);
         } else {
            float var32 = var2.y;
            float var33 = var2.z;
            if (this.r.A.E == 2) {
               var33 += 180.0F;
            }

            double var14 = (double)(-me.a(var32 / 180.0F * (float)Math.PI) * me.b(var33 / 180.0F * (float)Math.PI)) * var30;
            double var16 = (double)(me.b(var32 / 180.0F * (float)Math.PI) * me.b(var33 / 180.0F * (float)Math.PI)) * var30;
            double var18 = (double)(-me.a(var33 / 180.0F * (float)Math.PI)) * var30;

            for(int var20 = 0; var20 < 8; ++var20) {
               float var21 = (float)((var20 & 1) * 2 - 1);
               float var22 = (float)((var20 >> 1 & 1) * 2 - 1);
               float var23 = (float)((var20 >> 2 & 1) * 2 - 1);
               var21 *= 0.1F;
               var22 *= 0.1F;
               var23 *= 0.1F;
               gv var24 = this.r.f.a(fb.b(var4 + (double)var21, var6 + (double)var22, var8 + (double)var23), fb.b(var4 - var14 + (double)var21 + (double)var23, var6 - var18 + (double)var22, var8 - var16 + (double)var23));
               if (var24 != null) {
                  double var25 = var24.f.d(fb.b(var4, var6, var8));
                  if (var25 < var30) {
                     var30 = var25;
                  }
               }
            }

            if (this.r.A.E == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.z - var33, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var2.y - var32, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var30));
            GL11.glRotatef(var32 - var2.y, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var33 - var2.z, 1.0F, 0.0F, 0.0F);
         }
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      if (!this.r.A.J) {
         GL11.glRotatef(var2.B + (var2.z - var2.B) * var1, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.A + (var2.y - var2.A) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
      }

      GL11.glTranslatef(0.0F, var3, 0.0F);
      var4 = var2.p + (var2.s - var2.p) * (double)var1;
      var6 = var2.q + (var2.t - var2.q) * (double)var1 - (double)var3;
      var8 = var2.r + (var2.u - var2.r) * (double)var1;
      this.U = this.r.g.a(var4, var6, var8, var1);
   }

   private void a(float var1, int var2) {
      this.s = (float)(256 >> this.r.A.e);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if (this.r.A.g) {
         GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
      }

      if (this.V != (double)1.0F) {
         GL11.glTranslatef((float)this.W, (float)(-this.X), 0.0F);
         GL11.glScaled(this.V, this.V, (double)1.0F);
         GLU.gluPerspective(this.a(var1, true), (float)this.r.d / (float)this.r.e, 0.05F, this.s * 2.0F);
      } else {
         GLU.gluPerspective(this.a(var1, true), (float)this.r.d / (float)this.r.e, 0.05F, this.s * 2.0F);
      }

      if (this.r.c.i()) {
         float var4 = 0.6666667F;
         GL11.glScalef(1.0F, var4, 1.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if (this.r.A.g) {
         GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.d(var1);
      if (this.r.A.f) {
         this.e(var1);
      }

      float var7 = this.r.h.cb + (this.r.h.ca - this.r.h.cb) * var1;
      if (var7 > 0.0F) {
         byte var5 = 20;
         if (this.r.h.a((abg)abg.k)) {
            var5 = 7;
         }

         float var6 = 5.0F / (var7 * var7 + 5.0F) - var7 * 0.04F;
         var6 *= var6;
         GL11.glRotatef(((float)this.t + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
         GL11.glScalef(1.0F / var6, 1.0F, 1.0F);
         GL11.glRotatef(-((float)this.t + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
      }

      this.f(var1);
      if (this.q > 0) {
         int var8 = this.q - 1;
         if (var8 == 1) {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var8 == 2) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var8 == 3) {
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var8 == 4) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         }

         if (var8 == 5) {
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         }
      }

   }

   private void b(float var1, int var2) {
      if (this.q <= 0) {
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         float var3 = 0.07F;
         if (this.r.A.g) {
            GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
         }

         if (this.V != (double)1.0F) {
            GL11.glTranslatef((float)this.W, (float)(-this.X), 0.0F);
            GL11.glScaled(this.V, this.V, (double)1.0F);
            GLU.gluPerspective(this.a(var1, false), (float)this.r.d / (float)this.r.e, 0.05F, this.s * 2.0F);
         } else {
            GLU.gluPerspective(this.a(var1, false), (float)this.r.d / (float)this.r.e, 0.05F, this.s * 2.0F);
         }

         if (this.r.c.i()) {
            float var4 = 0.6666667F;
            GL11.glScalef(1.0F, var4, 1.0F);
         }

         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         if (this.r.A.g) {
            GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
         }

         GL11.glPushMatrix();
         this.d(var1);
         if (this.r.A.f) {
            this.e(var1);
         }

         if (this.r.A.E == 0 && !this.r.i.ar() && !this.r.A.D && !this.r.c.i()) {
            this.b((double)var1);
            this.c.a(var1);
            this.a((double)var1);
         }

         GL11.glPopMatrix();
         if (this.r.A.E == 0 && !this.r.i.ar()) {
            this.c.b(var1);
            this.d(var1);
         }

         if (this.r.A.f) {
            this.e(var1);
         }

      }
   }

   public void a(double var1) {
      adx.a(adx.b);
      GL11.glDisable(3553);
      adx.a(adx.a);
   }

   public void b(double var1) {
      adx.a(adx.b);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      float var3 = 0.00390625F;
      GL11.glScalef(var3, var3, var3);
      GL11.glTranslatef(8.0F, 8.0F, 8.0F);
      GL11.glMatrixMode(5888);
      this.r.p.b(this.d);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      adx.a(adx.a);
   }

   private void d() {
      this.f = (float)((double)this.f + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.h = (float)((double)this.h + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.f = (float)((double)this.f * 0.9);
      this.h = (float)((double)this.h * 0.9);
      this.e += (this.f - this.e) * 1.0F;
      this.g += (this.h - this.g) * 1.0F;
      this.aa = true;
   }

   private void e() {
      ry var1 = this.r.f;
      if (var1 != null) {
         for(int var2 = 0; var2 < 256; ++var2) {
            float var3 = var1.b(1.0F) * 0.95F + 0.05F;
            float var4 = var1.y.f[var2 / 16] * var3;
            float var5 = var1.y.f[var2 % 16] * (this.e * 0.1F + 1.5F);
            if (var1.s > 0) {
               var4 = var1.y.f[var2 / 16];
            }

            float var6 = var4 * (var1.b(1.0F) * 0.65F + 0.35F);
            float var7 = var4 * (var1.b(1.0F) * 0.65F + 0.35F);
            float var10 = var5 * ((var5 * 0.6F + 0.4F) * 0.6F + 0.4F);
            float var11 = var5 * (var5 * var5 * 0.6F + 0.4F);
            float var12 = var6 + var5;
            float var13 = var7 + var10;
            float var14 = var4 + var11;
            var12 = var12 * 0.96F + 0.03F;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            if (var1.y.g == 1) {
               var12 = 0.22F + var5 * 0.75F;
               var13 = 0.28F + var10 * 0.75F;
               var14 = 0.25F + var11 * 0.75F;
            }

            float var15 = this.r.A.N;
            if (var12 > 1.0F) {
               var12 = 1.0F;
            }

            if (var13 > 1.0F) {
               var13 = 1.0F;
            }

            if (var14 > 1.0F) {
               var14 = 1.0F;
            }

            float var16 = 1.0F - var12;
            float var17 = 1.0F - var13;
            float var18 = 1.0F - var14;
            var16 = 1.0F - var16 * var16 * var16 * var16;
            var17 = 1.0F - var17 * var17 * var17 * var17;
            var18 = 1.0F - var18 * var18 * var18 * var18;
            var12 = var12 * (1.0F - var15) + var16 * var15;
            var13 = var13 * (1.0F - var15) + var17 * var15;
            var14 = var14 * (1.0F - var15) + var18 * var15;
            var12 = var12 * 0.96F + 0.03F;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            if (var12 > 1.0F) {
               var12 = 1.0F;
            }

            if (var13 > 1.0F) {
               var13 = 1.0F;
            }

            if (var14 > 1.0F) {
               var14 = 1.0F;
            }

            if (var12 < 0.0F) {
               var12 = 0.0F;
            }

            if (var13 < 0.0F) {
               var13 = 0.0F;
            }

            if (var14 < 0.0F) {
               var14 = 0.0F;
            }

            short var19 = 255;
            int var20 = (int)(var12 * 255.0F);
            int var21 = (int)(var13 * 255.0F);
            int var22 = (int)(var14 * 255.0F);
            this.Q[var2] = var19 << 24 | var20 << 16 | var21 << 8 | var22;
         }

         this.r.p.a(this.Q, 16, 16, this.d);
      }
   }

   public void b(float var1) {
      pf.a("lightTex");
      if (this.aa) {
         this.e();
      }

      pf.b();
      if (!Display.isActive()) {
         if (System.currentTimeMillis() - this.Y > 500L) {
            this.r.i();
         }
      } else {
         this.Y = System.currentTimeMillis();
      }

      pf.a("mouse");
      if (this.r.R) {
         this.r.D.c();
         float var2 = this.r.A.c * 0.6F + 0.2F;
         float var3 = var2 * var2 * var2 * 8.0F;
         float var4 = (float)this.r.D.a * var3;
         float var5 = (float)this.r.D.b * var3;
         byte var6 = 1;
         if (this.r.A.d) {
            var6 = -1;
         }

         if (this.r.A.I) {
            this.H += var4;
            this.I += var5;
            float var7 = var1 - this.L;
            this.L = var1;
            var4 = this.J * var7;
            var5 = this.K * var7;
            this.r.h.c(var4, var5 * (float)var6);
         } else {
            this.r.h.c(var4, var5 * (float)var6);
         }
      }

      pf.b();
      if (!this.r.x) {
         a = this.r.A.g;
         ef var13 = new ef(this.r.A, this.r.d, this.r.e);
         int var14 = var13.a();
         int var16 = var13.b();
         int var18 = Mouse.getX() * var14 / this.r.d;
         int var19 = var16 - Mouse.getY() * var16 / this.r.e - 1;
         short var20 = 200;
         if (this.r.A.i == 1) {
            var20 = 120;
         }

         if (this.r.A.i == 2) {
            var20 = 40;
         }

         if (this.r.f != null) {
            pf.a("level");
            if (this.r.A.i == 0) {
               this.a(var1, 0L);
            } else {
               this.a(var1, this.Z + (long)(1000000000 / var20));
            }

            pf.c("sleep");
            if (this.r.A.i == 2) {
               long var8 = (this.Z + (long)(1000000000 / var20) - System.nanoTime()) / 1000000L;
               if (var8 > 0L && var8 < 500L) {
                  try {
                     net.minecraft.client.web.Threads.sleep(var8);
                  } catch (InterruptedException var12) {
                     var12.printStackTrace();
                  }
               }
            }

            this.Z = System.nanoTime();
            pf.c("gui");
            if (!this.r.A.D || this.r.s != null) {
               this.r.w.a(var1, this.r.s != null, var18, var19);
            }

            pf.b();
         } else {
            GL11.glViewport(0, 0, this.r.d, this.r.e);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.b();
            if (this.r.A.i == 2) {
               long var21 = (this.Z + (long)(1000000000 / var20) - System.nanoTime()) / 1000000L;
               if (var21 < 0L) {
                  var21 += 10L;
               }

               if (var21 > 0L && var21 < 500L) {
                  try {
                     net.minecraft.client.web.Threads.sleep(var21);
                  } catch (InterruptedException var11) {
                     var11.printStackTrace();
                  }
               }
            }

            this.Z = System.nanoTime();
         }

         if (this.r.s != null) {
            GL11.glClear(256);
            this.r.s.a(var18, var19, var1);
            if (this.r.s != null && this.r.s.r != null) {
               this.r.s.r.a(var1);
            }
         }

      }
   }

   public void a(float var1, long var2) {
      pf.a("lightTex");
      if (this.aa) {
         this.e();
      }

      GL11.glEnable(2884);
      GL11.glEnable(2929);
      if (this.r.i == null) {
         this.r.i = this.r.h;
      }

      pf.c("pick");
      this.a(var1);
      nq var4 = this.r.i;
      afv var5 = this.r.g;
      f var6 = this.r.j;
      double var7 = var4.R + (var4.s - var4.R) * (double)var1;
      double var9 = var4.S + (var4.t - var4.S) * (double)var1;
      double var11 = var4.T + (var4.u - var4.T) * (double)var1;
      pf.c("center");
      ej var13 = this.r.f.x();
      if (var13 instanceof mv) {
         mv var14 = (mv)var13;
         int var15 = me.d((float)((int)var7)) >> 4;
         int var16 = me.d((float)((int)var11)) >> 4;
         var14.d(var15, var16);
      }

      for(int var18 = 0; var18 < 2; ++var18) {
         if (this.r.A.g) {
            b = var18;
            if (b == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         pf.c("clear");
         GL11.glViewport(0, 0, this.r.d, this.r.e);
         this.g(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         pf.c("camera");
         this.a(var1, var18);
         abz.a(this.r.h, this.r.A.E == 2);
         pf.c("frustrum");
         qs.a();
         if (this.r.A.e < 2) {
            this.a(-1, var1);
            pf.c("sky");
            var5.a(var1);
         }

         GL11.glEnable(2912);
         this.a(1, var1);
         if (this.r.A.k) {
            GL11.glShadeModel(7425);
         }

         pf.c("culling");
         ev var19 = new ev();
         var19.a(var7, var9, var11);
         this.r.g.a(var19, var1);
         if (var18 == 0) {
            pf.c("updatechunks");

            while(!this.r.g.a(var4, false) && var2 != 0L) {
               long var20 = var2 - System.nanoTime();
               if (var20 < 0L || var20 > 1000000000L) {
                  break;
               }
            }
         }

         this.a(0, var1);
         GL11.glEnable(2912);
         GL11.glBindTexture(3553, this.r.p.b("/terrain.png"));
         rt.a();
         pf.c("terrain");
         var5.a(var4, 0, (double)var1);
         GL11.glShadeModel(7424);
         if (this.q == 0) {
            rt.b();
            pf.c("entities");
            var5.a(var4.e(var1), var19, var1);
            this.b((double)var1);
            pf.c("litParticles");
            var6.b(var4, var1);
            rt.a();
            this.a(0, var1);
            pf.c("particles");
            var6.a(var4, var1);
            this.a((double)var1);
            if (this.r.z != null && var4.a((p)net.minecraft.client.p.g) && var4 instanceof vi) {
               vi var21 = (vi)var4;
               GL11.glDisable(3008);
               pf.c("outline");
               var5.a(var21, this.r.z, 0, var21.by.a(), var1);
               var5.b(var21, this.r.z, 0, var21.by.a(), var1);
               GL11.glEnable(3008);
            }
         }

         GL11.glDisable(3042);
         GL11.glEnable(2884);
         GL11.glBlendFunc(770, 771);
         GL11.glDepthMask(true);
         this.a(0, var1);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         GL11.glBindTexture(3553, this.r.p.b("/terrain.png"));
         if (this.r.A.j) {
            pf.c("water");
            if (this.r.A.k) {
               GL11.glShadeModel(7425);
            }

            GL11.glColorMask(false, false, false, false);
            int var22 = var5.a(var4, 1, (double)var1);
            if (this.r.A.g) {
               if (b == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            if (var22 > 0) {
               var5.a(1, (double)var1);
            }

            GL11.glShadeModel(7424);
         } else {
            pf.c("water");
            var5.a(var4, 1, (double)var1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         if (this.V == (double)1.0F && var4 instanceof vi && this.r.z != null && !var4.a((p)net.minecraft.client.p.g)) {
            vi var23 = (vi)var4;
            GL11.glDisable(3008);
            pf.c("outline");
            var5.a(var23, this.r.z, 0, var23.by.a(), var1);
            var5.b(var23, this.r.z, 0, var23.by.a(), var1);
            GL11.glEnable(3008);
         }

         pf.c("weather");
         this.c(var1);
         GL11.glDisable(2912);
         if (this.u != null) {
         }

         if (this.r.A.c()) {
            pf.c("clouds");
            GL11.glPushMatrix();
            this.a(0, var1);
            GL11.glEnable(2912);
            var5.b(var1);
            GL11.glDisable(2912);
            this.a(1, var1);
            GL11.glPopMatrix();
         }

         pf.c("hand");
         if (this.V == (double)1.0F) {
            GL11.glClear(256);
            this.b(var1, var18);
         }

         if (!this.r.A.g) {
            pf.b();
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
      pf.b();
   }

   private void f() {
      float var1 = this.r.f.j(1.0F);
      if (!this.r.A.j) {
         var1 /= 2.0F;
      }

      if (var1 != 0.0F) {
         this.ab.setSeed((long)this.t * 312987231L);
         nq var2 = this.r.i;
         ry var3 = this.r.f;
         int var4 = me.c(var2.s);
         int var5 = me.c(var2.t);
         int var6 = me.c(var2.u);
         byte var7 = 10;
         double var8 = (double)0.0F;
         double var10 = (double)0.0F;
         double var12 = (double)0.0F;
         int var14 = 0;
         int var15 = (int)(100.0F * var1 * var1);
         if (this.r.A.P == 1) {
            var15 >>= 1;
         } else if (this.r.A.P == 2) {
            var15 = 0;
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            int var17 = var4 + this.ab.nextInt(var7) - this.ab.nextInt(var7);
            int var18 = var6 + this.ab.nextInt(var7) - this.ab.nextInt(var7);
            int var19 = var3.e(var17, var18);
            int var20 = var3.a(var17, var19 - 1, var18);
            if (var19 <= var5 + var7 && var19 >= var5 - var7 && var3.a().a(var17, var18).c() && var3.a().a(var17, var19, var18) > 0.2F) {
               float var21 = this.ab.nextFloat();
               float var22 = this.ab.nextFloat();
               if (var20 > 0) {
                  if (net.minecraft.client.yy.k[var20].bZ == net.minecraft.client.p.h) {
                     this.r.j.a((wc)(new aca(var3, (double)((float)var17 + var21), (double)((float)var19 + 0.1F) - yy.k[var20].bS, (double)((float)var18 + var22), (double)0.0F, (double)0.0F, (double)0.0F)));
                  } else {
                     ++var14;
                     if (this.ab.nextInt(var14) == 0) {
                        var8 = (double)((float)var17 + var21);
                        var10 = (double)((float)var19 + 0.1F) - yy.k[var20].bS;
                        var12 = (double)((float)var18 + var22);
                     }

                     this.r.j.a((wc)(new ub(var3, (double)((float)var17 + var21), (double)((float)var19 + 0.1F) - yy.k[var20].bS, (double)((float)var18 + var22))));
                  }
               }
            }
         }

         if (var14 > 0 && this.ab.nextInt(3) < this.ac++) {
            this.ac = 0;
            if (var10 > var2.t + (double)1.0F && var3.e(me.c(var2.s), me.c(var2.u)) > me.c(var2.t)) {
               this.r.f.a(var8, var10, var12, "ambient.weather.rain", 0.1F, 0.5F);
            } else {
               this.r.f.a(var8, var10, var12, "ambient.weather.rain", 0.2F, 1.0F);
            }
         }

      }
   }

   protected void c(float var1) {
      float var2 = this.r.f.j(var1);
      if (!(var2 <= 0.0F)) {
         this.b((double)var1);
         if (this.i == null) {
            this.i = new float[1024];
            this.j = new float[1024];

            for(int var3 = 0; var3 < 32; ++var3) {
               for(int var4 = 0; var4 < 32; ++var4) {
                  float var5 = (float)(var4 - 16);
                  float var6 = (float)(var3 - 16);
                  float var7 = me.c(var5 * var5 + var6 * var6);
                  this.i[var3 << 5 | var4] = -var6 / var7;
                  this.j[var3 << 5 | var4] = var5 / var7;
               }
            }
         }

         nq var43 = this.r.i;
         ry var44 = this.r.f;
         int var45 = me.c(var43.s);
         int var46 = me.c(var43.t);
         int var47 = me.c(var43.u);
         cv var8 = cv.a;
         GL11.glDisable(2884);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glAlphaFunc(516, 0.01F);
         GL11.glBindTexture(3553, this.r.p.b("/environment/snow.png"));
         double var9 = var43.R + (var43.s - var43.R) * (double)var1;
         double var11 = var43.S + (var43.t - var43.S) * (double)var1;
         double var13 = var43.T + (var43.u - var43.T) * (double)var1;
         int var15 = me.c(var11);
         byte var16 = 5;
         if (this.r.A.j) {
            var16 = 10;
         }

         sr[] var17 = var44.a().a(var45 - var16, var47 - var16, var16 * 2 + 1, var16 * 2 + 1);
         float[] var18 = var44.a().b(var45 - var16, var47 - var16, var16 * 2 + 1, var16 * 2 + 1);
         int var19 = 0;
         byte var20 = -1;
         float var21 = (float)this.t + var1;
         if (this.r.A.j) {
            var16 = 10;
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var19 = 0;

         for(int var22 = var47 - var16; var22 <= var47 + var16; ++var22) {
            for(int var23 = var45 - var16; var23 <= var45 + var16; ++var23) {
               int var24 = (var22 - var47 + 16) * 32 + var23 - var45 + 16;
               float var25 = this.i[var24] * 0.5F;
               float var26 = this.j[var24] * 0.5F;
               sr var27 = var17[var19++];
               if (var27.c() || var27.b()) {
                  int var28 = var44.e(var23, var22);
                  int var29 = var46 - var16;
                  int var30 = var46 + var16;
                  if (var29 < var28) {
                     var29 = var28;
                  }

                  if (var30 < var28) {
                     var30 = var28;
                  }

                  float var31 = 1.0F;
                  int var32 = var28;
                  if (var28 < var15) {
                     var32 = var15;
                  }

                  if (var29 != var30) {
                     this.ab.setSeed((long)(var23 * var23 * 3121 + var23 * 45238971 ^ var22 * var22 * 418711 + var22 * 13761));
                     float var33 = var18[var19 - 1];
                     if (var44.a().a(var33, var28) >= 0.15F) {
                        if (var20 != 0) {
                           if (var20 >= 0) {
                              var8.a();
                           }

                           var20 = 0;
                           GL11.glBindTexture(3553, this.r.p.b("/environment/rain.png"));
                           var8.b();
                        }

                        float var34 = ((float)(this.t + var23 * var23 * 3121 + var23 * 45238971 + var22 * var22 * 418711 + var22 * 13761 & 31) + var1) / 32.0F * (3.0F + this.ab.nextFloat());
                        double var35 = (double)((float)var23 + 0.5F) - var43.s;
                        double var37 = (double)((float)var22 + 0.5F) - var43.u;
                        float var39 = me.a(var35 * var35 + var37 * var37) / (float)var16;
                        float var40 = 1.0F;
                        var8.b(var44.a(var23, var32, var22, 0));
                        var8.a(var40, var40, var40, ((1.0F - var39 * var39) * 0.5F + 0.5F) * var2);
                        var8.b(-var9 * (double)1.0F, -var11 * (double)1.0F, -var13 * (double)1.0F);
                        var8.a((double)((float)var23 - var25) + (double)0.5F, (double)var29, (double)((float)var22 - var26) + (double)0.5F, (double)(0.0F * var31), (double)((float)var29 * var31 / 4.0F + var34 * var31));
                        var8.a((double)((float)var23 + var25) + (double)0.5F, (double)var29, (double)((float)var22 + var26) + (double)0.5F, (double)(1.0F * var31), (double)((float)var29 * var31 / 4.0F + var34 * var31));
                        var8.a((double)((float)var23 + var25) + (double)0.5F, (double)var30, (double)((float)var22 + var26) + (double)0.5F, (double)(1.0F * var31), (double)((float)var30 * var31 / 4.0F + var34 * var31));
                        var8.a((double)((float)var23 - var25) + (double)0.5F, (double)var30, (double)((float)var22 - var26) + (double)0.5F, (double)(0.0F * var31), (double)((float)var30 * var31 / 4.0F + var34 * var31));
                        var8.b((double)0.0F, (double)0.0F, (double)0.0F);
                     } else {
                        if (var20 != 1) {
                           if (var20 >= 0) {
                              var8.a();
                           }

                           var20 = 1;
                           GL11.glBindTexture(3553, this.r.p.b("/environment/snow.png"));
                           var8.b();
                        }

                        float var49 = ((float)(this.t & 511) + var1) / 512.0F;
                        float var50 = this.ab.nextFloat() + var21 * 0.01F * (float)this.ab.nextGaussian();
                        float var36 = this.ab.nextFloat() + var21 * (float)this.ab.nextGaussian() * 0.001F;
                        double var51 = (double)((float)var23 + 0.5F) - var43.s;
                        double var52 = (double)((float)var22 + 0.5F) - var43.u;
                        float var41 = me.a(var51 * var51 + var52 * var52) / (float)var16;
                        float var42 = 1.0F;
                        var8.b((var44.a(var23, var32, var22, 0) * 3 + 15728880) / 4);
                        var8.a(var42, var42, var42, ((1.0F - var41 * var41) * 0.3F + 0.5F) * var2);
                        var8.b(-var9 * (double)1.0F, -var11 * (double)1.0F, -var13 * (double)1.0F);
                        var8.a((double)((float)var23 - var25) + (double)0.5F, (double)var29, (double)((float)var22 - var26) + (double)0.5F, (double)(0.0F * var31 + var50), (double)((float)var29 * var31 / 4.0F + var49 * var31 + var36));
                        var8.a((double)((float)var23 + var25) + (double)0.5F, (double)var29, (double)((float)var22 + var26) + (double)0.5F, (double)(1.0F * var31 + var50), (double)((float)var29 * var31 / 4.0F + var49 * var31 + var36));
                        var8.a((double)((float)var23 + var25) + (double)0.5F, (double)var30, (double)((float)var22 + var26) + (double)0.5F, (double)(1.0F * var31 + var50), (double)((float)var30 * var31 / 4.0F + var49 * var31 + var36));
                        var8.a((double)((float)var23 - var25) + (double)0.5F, (double)var30, (double)((float)var22 - var26) + (double)0.5F, (double)(0.0F * var31 + var50), (double)((float)var30 * var31 / 4.0F + var49 * var31 + var36));
                        var8.b((double)0.0F, (double)0.0F, (double)0.0F);
                     }
                  }
               }
            }
         }

         if (var20 >= 0) {
            var8.a();
         }

         GL11.glEnable(2884);
         GL11.glDisable(3042);
         GL11.glAlphaFunc(516, 0.1F);
         this.a((double)var1);
      }
   }

   public void b() {
      ef var1 = new ef(this.r.A, this.r.d, this.r.e);
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho((double)0.0F, var1.a, var1.b, (double)0.0F, (double)1000.0F, (double)3000.0F);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void g(float var1) {
      ry var2 = this.r.f;
      nq var3 = this.r.i;
      float var4 = 1.0F / (float)(4 - this.r.A.e);
      var4 = 1.0F - (float)Math.pow((double)var4, (double)0.25F);
      fb var5 = var2.a(this.r.i, var1);
      float var6 = (float)var5.a;
      float var7 = (float)var5.b;
      float var8 = (float)var5.c;
      fb var9 = var2.g(var1);
      this.n = (float)var9.a;
      this.o = (float)var9.b;
      this.p = (float)var9.c;
      if (this.r.A.e < 2) {
         fb var10 = me.a(var2.e(var1)) > 0.0F ? fb.b((double)-1.0F, (double)0.0F, (double)0.0F) : fb.b((double)1.0F, (double)0.0F, (double)0.0F);
         float var11 = (float)var3.f(var1).b(var10);
         if (var11 < 0.0F) {
            var11 = 0.0F;
         }

         if (var11 > 0.0F) {
            float[] var12 = var2.y.a(var2.c(var1), var1);
            if (var12 != null) {
               var11 *= var12[3];
               this.n = this.n * (1.0F - var11) + var12[0] * var11;
               this.o = this.o * (1.0F - var11) + var12[1] * var11;
               this.p = this.p * (1.0F - var11) + var12[2] * var11;
            }
         }
      }

      this.n += (var6 - this.n) * var4;
      this.o += (var7 - this.o) * var4;
      this.p += (var8 - this.p) * var4;
      float var20 = var2.j(var1);
      if (var20 > 0.0F) {
         float var22 = 1.0F - var20 * 0.5F;
         float var24 = 1.0F - var20 * 0.4F;
         this.n *= var22;
         this.o *= var22;
         this.p *= var24;
      }

      float var23 = var2.i(var1);
      if (var23 > 0.0F) {
         float var25 = 1.0F - var23 * 0.5F;
         this.n *= var25;
         this.o *= var25;
         this.p *= var25;
      }

      int var26 = abz.a(this.r.f, var3, var1);
      if (this.U) {
         fb var13 = var2.f(var1);
         this.n = (float)var13.a;
         this.o = (float)var13.b;
         this.p = (float)var13.c;
      } else if (var26 != 0 && net.minecraft.client.yy.k[var26].bZ == net.minecraft.client.p.g) {
         this.n = 0.02F;
         this.o = 0.02F;
         this.p = 0.2F;
      } else if (var26 != 0 && net.minecraft.client.yy.k[var26].bZ == net.minecraft.client.p.h) {
         this.n = 0.6F;
         this.o = 0.1F;
         this.p = 0.0F;
      }

      float var27 = this.ad + (this.ae - this.ad) * var1;
      this.n *= var27;
      this.o *= var27;
      this.p *= var27;
      double var14 = (var3.S + (var3.t - var3.S) * (double)var1) / (double)32.0F;
      if (var3.a(abg.q)) {
         int var16 = var3.b(abg.q).b();
         if (var16 < 20) {
            var14 *= (double)(1.0F - (float)var16 / 20.0F);
         } else {
            var14 = (double)0.0F;
         }
      }

      if (var14 < (double)1.0F) {
         if (var14 < (double)0.0F) {
            var14 = (double)0.0F;
         }

         var14 *= var14;
         this.n = (float)((double)this.n * var14);
         this.o = (float)((double)this.o * var14);
         this.p = (float)((double)this.p * var14);
      }

      if (this.r.A.g) {
         float var29 = (this.n * 30.0F + this.o * 59.0F + this.p * 11.0F) / 100.0F;
         float var17 = (this.n * 30.0F + this.o * 70.0F) / 100.0F;
         float var18 = (this.n * 30.0F + this.p * 70.0F) / 100.0F;
         this.n = var29;
         this.o = var17;
         this.p = var18;
      }

      GL11.glClearColor(this.n, this.o, this.p, 0.0F);
   }

   private void a(int var1, float var2) {
      nq var3 = this.r.i;
      if (var1 == 999) {
         GL11.glFog(2918, this.a(0.0F, 0.0F, 0.0F, 1.0F));
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, 0.0F);
         GL11.glFogf(2916, 8.0F);
         if (GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi(34138, 34139);
         }

         GL11.glFogf(2915, 0.0F);
      } else {
         GL11.glFog(2918, this.a(this.n, this.o, this.p, 1.0F));
         GL11.glNormal3f(0.0F, -1.0F, 0.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var4 = abz.a(this.r.f, var3, var2);
         if (var3.a(abg.q)) {
            float var5 = 5.0F;
            int var6 = var3.b(abg.q).b();
            if (var6 < 20) {
               var5 = 5.0F + (this.s - 5.0F) * (1.0F - (float)var6 / 20.0F);
            }

            GL11.glFogi(2917, 9729);
            if (var1 < 0) {
               GL11.glFogf(2915, 0.0F);
               GL11.glFogf(2916, var5 * 0.8F);
            } else {
               GL11.glFogf(2915, var5 * 0.25F);
               GL11.glFogf(2916, var5);
            }

            if (GLContext.getCapabilities().GL_NV_fog_distance) {
               GL11.glFogi(34138, 34139);
            }
         } else if (this.U) {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 0.1F);
            float var11 = 1.0F;
            float var15 = 1.0F;
            float var7 = 1.0F;
            if (this.r.A.g) {
               float var8 = (var11 * 30.0F + var15 * 59.0F + var7 * 11.0F) / 100.0F;
               float var9 = (var11 * 30.0F + var15 * 70.0F) / 100.0F;
               float var10 = (var11 * 30.0F + var7 * 70.0F) / 100.0F;
            }
         } else if (var4 > 0 && net.minecraft.client.yy.k[var4].bZ == net.minecraft.client.p.g) {
            GL11.glFogi(2917, 2048);
            if (!var3.a(abg.o)) {
               GL11.glFogf(2914, 0.1F);
            } else {
               GL11.glFogf(2914, 0.05F);
            }

            float var14 = 0.4F;
            float var19 = 0.4F;
            float var21 = 0.9F;
            if (this.r.A.g) {
               float var24 = (var14 * 30.0F + var19 * 59.0F + var21 * 11.0F) / 100.0F;
               float var26 = (var14 * 30.0F + var19 * 70.0F) / 100.0F;
               float var28 = (var14 * 30.0F + var21 * 70.0F) / 100.0F;
            }
         } else if (var4 > 0 && net.minecraft.client.yy.k[var4].bZ == net.minecraft.client.p.h) {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 2.0F);
            float var13 = 0.4F;
            float var18 = 0.3F;
            float var20 = 0.3F;
            if (this.r.A.g) {
               float var23 = (var13 * 30.0F + var18 * 59.0F + var20 * 11.0F) / 100.0F;
               float var25 = (var13 * 30.0F + var18 * 70.0F) / 100.0F;
               float var27 = (var13 * 30.0F + var20 * 70.0F) / 100.0F;
            }
         } else {
            float var12 = this.s;
            if (!this.r.f.y.e) {
               double var16 = (double)((var3.a(var2) & 15728640) >> 20) / (double)16.0F + (var3.S + (var3.t - var3.S) * (double)var2 + (double)4.0F) / (double)32.0F;
               if (var16 < (double)1.0F) {
                  if (var16 < (double)0.0F) {
                     var16 = (double)0.0F;
                  }

                  var16 *= var16;
                  float var22 = 100.0F * (float)var16;
                  if (var22 < 5.0F) {
                     var22 = 5.0F;
                  }

                  if (var12 > var22) {
                     var12 = var22;
                  }
               }
            }

            GL11.glFogi(2917, 9729);
            if (var1 < 0) {
               GL11.glFogf(2915, 0.0F);
               GL11.glFogf(2916, var12 * 0.8F);
            } else {
               GL11.glFogf(2915, var12 * 0.25F);
               GL11.glFogf(2916, var12);
            }

            if (GLContext.getCapabilities().GL_NV_fog_distance) {
               GL11.glFogi(34138, 34139);
            }

            if (this.r.f.y.c) {
               GL11.glFogf(2915, 0.0F);
            }
         }

         GL11.glEnable(2903);
         GL11.glColorMaterial(1028, 4608);
      }
   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      this.m.clear();
      this.m.put(var1).put(var2).put(var3).put(var4);
      this.m.flip();
      return this.m;
   }
}
