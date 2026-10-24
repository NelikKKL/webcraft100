package net.minecraft.client;

import java.util.Random;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class qx extends xe {
   private static final int s;
   private static final int t;
   private static final int u;
   private static final int v;
   protected int a = 256;
   protected int b = 202;
   protected int c = 0;
   protected int d = 0;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected double j;
   protected double k;
   private int w = 0;
   private tk x;

   public qx(tk var1) {
      this.x = var1;
      short var2 = 141;
      short var3 = 141;
      this.e = this.g = this.j = (double)(ut.f.h * 24 - var2 / 2 - 12);
      this.f = this.h = this.k = (double)(ut.f.i * 24 - var3 / 2);
   }

   public void a() {
      this.o.clear();
      this.o.add(new abs(1, this.m / 2 + 24, this.n / 2 + 74, 80, 20, hj.a("gui.done")));
   }

   protected void a(ct var1) {
      if (var1.f == 1) {
         this.l.a((xe)null);
         this.l.g();
      }

      super.a(var1);
   }

   protected void a(char var1, int var2) {
      if (var2 == this.l.A.s.d) {
         this.l.a((xe)null);
         this.l.g();
      } else {
         super.a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3) {
      if (Mouse.isButtonDown(0)) {
         int var4 = (this.m - this.a) / 2;
         int var5 = (this.n - this.b) / 2;
         int var6 = var4 + 8;
         int var7 = var5 + 17;
         if ((this.w == 0 || this.w == 1) && var1 >= var6 && var1 < var6 + 224 && var2 >= var7 && var2 < var7 + 155) {
            if (this.w == 0) {
               this.w = 1;
            } else {
               this.g -= (double)(var1 - this.c);
               this.h -= (double)(var2 - this.d);
               this.j = this.e = this.g;
               this.k = this.f = this.h;
            }

            this.c = var1;
            this.d = var2;
         }

         if (this.j < (double)s) {
            this.j = (double)s;
         }

         if (this.k < (double)t) {
            this.k = (double)t;
         }

         if (this.j >= (double)u) {
            this.j = (double)(u - 1);
         }

         if (this.k >= (double)v) {
            this.k = (double)(v - 1);
         }
      } else {
         this.w = 0;
      }

      this.j();
      this.b(var1, var2, var3);
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.e();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
   }

   public void s_() {
      this.e = this.g;
      this.f = this.h;
      double var1 = this.j - this.g;
      double var3 = this.k - this.h;
      if (var1 * var1 + var3 * var3 < (double)4.0F) {
         this.g += var1;
         this.h += var3;
      } else {
         this.g += var1 * 0.85;
         this.h += var3 * 0.85;
      }

   }

   protected void e() {
      int var1 = (this.m - this.a) / 2;
      int var2 = (this.n - this.b) / 2;
      this.q.b("Achievements", var1 + 15, var2 + 5, 4210752);
   }

   protected void b(int var1, int var2, float var3) {
      int var4 = me.c(this.e + (this.g - this.e) * (double)var3);
      int var5 = me.c(this.f + (this.h - this.f) * (double)var3);
      if (var4 < s) {
         var4 = s;
      }

      if (var5 < t) {
         var5 = t;
      }

      if (var4 >= u) {
         var4 = u - 1;
      }

      if (var5 >= v) {
         var5 = v - 1;
      }

      int var6 = this.l.p.b("/terrain.png");
      int var7 = this.l.p.b("/achievement/bg.png");
      int var8 = (this.m - this.a) / 2;
      int var9 = (this.n - this.b) / 2;
      int var10 = var8 + 16;
      int var11 = var9 + 17;
      this.i = 0.0F;
      GL11.glDepthFunc(518);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      GL11.glEnable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(32826);
      GL11.glEnable(2903);
      this.l.p.b(var6);
      int var12 = var4 + 288 >> 4;
      int var13 = var5 + 288 >> 4;
      int var14 = (var4 + 288) % 16;
      int var15 = (var5 + 288) % 16;
      Random var21 = new net.minecraft.client.web.JRandom();

      for(int var22 = 0; var22 * 16 - var15 < 155; ++var22) {
         float var23 = 0.6F - (float)(var13 + var22) / 25.0F * 0.3F;
         GL11.glColor4f(var23, var23, var23, 1.0F);

         for(int var24 = 0; var24 * 16 - var14 < 224; ++var24) {
            var21.setSeed((long)(1234 + var12 + var24));
            var21.nextInt();
            int var25 = var21.nextInt(1 + var13 + var22) + (var13 + var22) / 2;
            int var26 = yy.E.bL;
            if (var25 <= 37 && var13 + var22 != 35) {
               if (var25 == 22) {
                  if (var21.nextInt(2) == 0) {
                     var26 = yy.aw.bL;
                  } else {
                     var26 = yy.aN.bL;
                  }
               } else if (var25 == 10) {
                  var26 = yy.H.bL;
               } else if (var25 == 8) {
                  var26 = yy.I.bL;
               } else if (var25 > 4) {
                  var26 = yy.t.bL;
               } else if (var25 > 0) {
                  var26 = yy.v.bL;
               }
            } else {
               var26 = yy.z.bL;
            }

            this.b(var10 + var24 * 16 - var14, var11 + var22 * 16 - var15, var26 % 16 << 4, var26 >> 4 << 4, 16, 16);
         }
      }

      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glDisable(3553);

      for(int var27 = 0; var27 < ut.e.size(); ++var27) {
         ws var29 = (ws)ut.e.get(var27);
         if (var29.j != null) {
            var14 = var29.h * 24 - var4 + 11 + var10;
            var15 = var29.i * 24 - var5 + 11 + var11;
            int var16 = var29.j.h * 24 - var4 + 11 + var10;
            int var17 = var29.j.i * 24 - var5 + 11 + var11;
            int var18 = 0;
            boolean var19 = this.x.a(var29);
            boolean var20 = this.x.b(var29);
            int var52 = Math.sin((double)(System.currentTimeMillis() % 600L) / (double)600.0F * Math.PI * (double)2.0F) > 0.6 ? 255 : 130;
            if (var19) {
               var18 = -9408400;
            } else if (var20) {
               var18 = '\uff00' + (var52 << 24);
            } else {
               var18 = -16777216;
            }

            this.a(var14, var16, var15, var18);
            this.b(var16, var15, var17, var18);
         }
      }

      ws var28 = null;
      iw var30 = new iw();
      rt.c();
      GL11.glDisable(2896);
      GL11.glEnable(32826);
      GL11.glEnable(2903);

      for(int var32 = 0; var32 < ut.e.size(); ++var32) {
         ws var34 = (ws)ut.e.get(var32);
         int var36 = var34.h * 24 - var4;
         int var38 = var34.i * 24 - var5;
         if (var36 >= -24 && var38 >= -24 && var36 <= 224 && var38 <= 155) {
            if (this.x.a(var34)) {
               float var41 = 1.0F;
               GL11.glColor4f(var41, var41, var41, 1.0F);
            } else if (this.x.b(var34)) {
               float var42 = Math.sin((double)(System.currentTimeMillis() % 600L) / (double)600.0F * Math.PI * (double)2.0F) < 0.6 ? 0.6F : 0.8F;
               GL11.glColor4f(var42, var42, var42, 1.0F);
            } else {
               float var43 = 0.3F;
               GL11.glColor4f(var43, var43, var43, 1.0F);
            }

            this.l.p.b(var7);
            int var44 = var10 + var36;
            int var46 = var11 + var38;
            if (var34.j()) {
               this.b(var44 - 2, var46 - 2, 26, 202, 26, 26);
            } else {
               this.b(var44 - 2, var46 - 2, 0, 202, 26, 26);
            }

            if (!this.x.b(var34)) {
               float var49 = 0.1F;
               GL11.glColor4f(var49, var49, var49, 1.0F);
               var30.a = false;
            }

            GL11.glEnable(2896);
            GL11.glEnable(2884);
            var30.a(this.l.q, this.l.p, var34.k, var44 + 3, var46 + 3);
            GL11.glDisable(2896);
            if (!this.x.b(var34)) {
               var30.a = true;
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if (var1 >= var10 && var2 >= var11 && var1 < var10 + 224 && var2 < var11 + 155 && var1 >= var44 && var1 <= var44 + 22 && var2 >= var46 && var2 <= var46 + 22) {
               var28 = var34;
            }
         }
      }

      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var7);
      this.b(var8, var9, 0, 0, this.a, this.b);
      GL11.glPopMatrix();
      this.i = 0.0F;
      GL11.glDepthFunc(515);
      GL11.glDisable(2929);
      GL11.glEnable(3553);
      super.a(var1, var2, var3);
      if (var28 != null) {
         String var35 = var28.b;
         String var37 = var28.i();
         int var39 = var1 + 12;
         int var45 = var2 - 4;
         if (this.x.b(var28)) {
            int var47 = Math.max(this.q.a(var35), 120);
            int var50 = this.q.a(var37, var47);
            if (this.x.a(var28)) {
               var50 += 12;
            }

            this.a(var39 - 3, var45 - 3, var39 + var47 + 3, var45 + var50 + 3 + 12, -1073741824, -1073741824);
            this.q.a(var37, var39, var45 + 12, var47, -6250336);
            if (this.x.a(var28)) {
               this.q.a(hj.a("achievement.taken"), var39, var45 + var50 + 4, -7302913);
            }
         } else {
            int var48 = Math.max(this.q.a(var35), 120);
            String var51 = hj.a("achievement.requires", var28.j.b);
            int var53 = this.q.a(var51, var48);
            this.a(var39 - 3, var45 - 3, var39 + var48 + 3, var45 + var53 + 12 + 3, -1073741824, -1073741824);
            this.q.a(var51, var39, var45 + 12, var48, -9416624);
         }

         this.q.a(var35, var39, var45, this.x.b(var28) ? (var28.j() ? -128 : -1) : (var28.j() ? -8355776 : -8355712));
      }

      GL11.glEnable(2929);
      GL11.glEnable(2896);
      rt.a();
   }

   public boolean b() {
      return true;
   }

   static {
      s = ut.a * 24 - 112;
      t = ut.b * 24 - 112;
      u = ut.c * 24 - 77;
      v = ut.d * 24 - 77;
   }
}
