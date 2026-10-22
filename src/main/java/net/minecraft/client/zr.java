package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class zr extends acq {
   private fa a;
   private fa b;
   private fa i;
   private static final String[] j = new String[]{"cloth", "chain", "iron", "diamond", "gold"};

   public zr() {
      super(new fa(0.0F), 0.5F);
      this.a = (fa)this.g;
      this.b = new fa(1.0F);
      this.i = new fa(0.5F);
   }

   protected int a(vi var1, int var2, float var3) {
      dk var4 = var1.by.e(3 - var2);
      if (var4 != null) {
         acy var5 = var4.a();
         if (var5 instanceof agi) {
            agi var6 = (agi)var5;
            this.a("/armor/" + j[var6.bR] + "_" + (var2 == 2 ? 2 : 1) + ".png");
            fa var7 = var2 == 2 ? this.i : this.b;
            var7.g.j = var2 == 0;
            var7.h.j = var2 == 0;
            var7.i.j = var2 == 1 || var2 == 2;
            var7.j.j = var2 == 1;
            var7.k.j = var2 == 1;
            var7.l.j = var2 == 2 || var2 == 3;
            var7.m.j = var2 == 2 || var2 == 3;
            this.a(var7);
            if (var4.u()) {
               return 15;
            }

            return 1;
         }
      }

      return -1;
   }

   public void a(vi var1, double var2, double var4, double var6, float var8, float var9) {
      dk var10 = var1.by.a();
      this.b.q = this.i.q = this.a.q = var10 != null ? 1 : 0;
      if (var10 != null && var1.ay() > 0) {
         ps var11 = var10.m();
         if (var11 == ps.d) {
            this.b.q = this.i.q = this.a.q = 3;
         } else if (var11 == ps.e) {
            this.b.s = this.i.s = this.a.s = true;
         }
      }

      this.b.r = this.i.r = this.a.r = var1.q();
      double var13 = var4 - (double)var1.L;
      if (var1.q() && !(var1 instanceof di)) {
         var13 -= (double)0.125F;
      }

      super.a((nq)var1, var2, var13, var6, var8, var9);
      this.b.s = this.i.s = this.a.s = false;
      this.b.r = this.i.r = this.a.r = false;
      this.b.q = this.i.q = this.a.q = 0;
   }

   protected void a(vi var1, double var2, double var4, double var6) {
      if (Minecraft.r() && var1 != this.c.h) {
         float var8 = 1.6F;
         float var9 = 0.016666668F * var8;
         float var10 = var1.c(this.c.h);
         float var11 = var1.q() ? 32.0F : 64.0F;
         if (var10 < var11) {
            String var12 = var1.bJ;
            if (!var1.q()) {
               if (var1.ar()) {
                  this.a(var1, var12, var2, var4 - (double)1.5F, var6, 64);
               } else {
                  this.a(var1, var12, var2, var4, var6, 64);
               }
            } else {
               abe var13 = this.a();
               GL11.glPushMatrix();
               GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 2.3F, (float)var6);
               GL11.glNormal3f(0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-this.c.i, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(this.c.j, 1.0F, 0.0F, 0.0F);
               GL11.glScalef(-var9, -var9, var9);
               GL11.glDisable(2896);
               GL11.glTranslatef(0.0F, 0.25F / var9, 0.0F);
               GL11.glDepthMask(false);
               GL11.glEnable(3042);
               GL11.glBlendFunc(770, 771);
               cv var14 = cv.a;
               GL11.glDisable(3553);
               var14.b();
               int var15 = var13.a(var12) / 2;
               var14.a(0.0F, 0.0F, 0.0F, 0.25F);
               var14.a((double)(-var15 - 1), (double)-1.0F, (double)0.0F);
               var14.a((double)(-var15 - 1), (double)8.0F, (double)0.0F);
               var14.a((double)(var15 + 1), (double)8.0F, (double)0.0F);
               var14.a((double)(var15 + 1), (double)-1.0F, (double)0.0F);
               var14.a();
               GL11.glEnable(3553);
               GL11.glDepthMask(true);
               var13.b(var12, -var13.a(var12) / 2, 0, 553648127);
               GL11.glEnable(2896);
               GL11.glDisable(3042);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glPopMatrix();
            }
         }
      }

   }

   protected void a(vi var1, float var2) {
      super.b(var1, var2);
      dk var3 = var1.by.e(3);
      if (var3 != null && var3.a().bM < 256) {
         GL11.glPushMatrix();
         this.a.g.c(0.0625F);
         if (acr.a(yy.k[var3.c].c())) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, -0.25F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         }

         this.c.f.a(var1, var3, 0);
         GL11.glPopMatrix();
      }

      if (var1.bJ.equals("deadmau5") && this.a(var1.ad, (String)null)) {
         for(int var19 = 0; var19 < 2; ++var19) {
            float var5 = var1.A + (var1.y - var1.A) * var2 - (var1.au + (var1.at - var1.au) * var2);
            float var6 = var1.B + (var1.z - var1.B) * var2;
            GL11.glPushMatrix();
            GL11.glRotatef(var5, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.375F * (float)(var19 * 2 - 1), 0.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.375F, 0.0F);
            GL11.glRotatef(-var6, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-var5, 0.0F, 1.0F, 0.0F);
            float var7 = 1.3333334F;
            GL11.glScalef(var7, var7, var7);
            this.a.a(0.0625F);
            GL11.glPopMatrix();
         }
      }

      if (this.a(var1.bL, (String)null)) {
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 0.0F, 0.125F);
         double var20 = var1.bN + (var1.bQ - var1.bN) * (double)var2 - (var1.p + (var1.s - var1.p) * (double)var2);
         double var23 = var1.bO + (var1.bR - var1.bO) * (double)var2 - (var1.q + (var1.t - var1.q) * (double)var2);
         double var8 = var1.bP + (var1.bS - var1.bP) * (double)var2 - (var1.r + (var1.u - var1.r) * (double)var2);
         float var10 = var1.au + (var1.at - var1.au) * var2;
         double var11 = (double)me.a(var10 * (float)Math.PI / 180.0F);
         double var13 = (double)(-me.b(var10 * (float)Math.PI / 180.0F));
         float var15 = (float)var23 * 10.0F;
         if (var15 < -6.0F) {
            var15 = -6.0F;
         }

         if (var15 > 32.0F) {
            var15 = 32.0F;
         }

         float var16 = (float)(var20 * var11 + var8 * var13) * 100.0F;
         float var17 = (float)(var20 * var13 - var8 * var11) * 100.0F;
         if (var16 < 0.0F) {
            var16 = 0.0F;
         }

         float var18 = var1.bF + (var1.bG - var1.bF) * var2;
         var15 += me.a((var1.O + (var1.P - var1.O) * var2) * 6.0F) * 32.0F * var18;
         if (var1.q()) {
            var15 += 25.0F;
         }

         GL11.glRotatef(6.0F + var16 / 2.0F + var15, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var17 / 2.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var17 / 2.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         this.a.b(0.0625F);
         GL11.glPopMatrix();
      }

      dk var21 = var1.by.a();
      if (var21 != null) {
         GL11.glPushMatrix();
         this.a.j.c(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if (var1.ci != null) {
            var21 = new dk(acy.C);
         }

         ps var22 = null;
         if (var1.ay() > 0) {
            var22 = var21.m();
         }

         if (var21.c < 256 && acr.a(yy.k[var21.c].c())) {
            float var27 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var27 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var27, -var27, var27);
         } else if (var21.c == acy.j.bM) {
            float var24 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var24, -var24, var24);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (acy.d[var21.c].a()) {
            float var25 = 0.625F;
            if (acy.d[var21.c].b()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            if (var1.ay() > 0 && var22 == ps.d) {
               GL11.glTranslatef(0.05F, 0.0F, -0.1F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var25, -var25, var25);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            float var26 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var26, var26, var26);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         if (var21.c == acy.br.bM) {
            int var29 = var21.a().c(var21.i());
            float var30 = (float)(var29 >> 16 & 255) / 255.0F;
            float var31 = (float)(var29 >> 8 & 255) / 255.0F;
            float var9 = (float)(var29 & 255) / 255.0F;
            GL11.glColor4f(var30, var31, var9, 1.0F);
            this.c.f.a(var1, var21, 0);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.c.f.a(var1, var21, 1);
         } else {
            this.c.f.a(var1, var21, 0);
         }

         GL11.glPopMatrix();
      }

   }

   protected void b(vi var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   public void b() {
      this.a.a = 0.0F;
      this.a.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      this.a.j.a(0.0625F);
   }

   protected void b(vi var1, double var2, double var4, double var6) {
      if (var1.K() && var1.ar()) {
         super.b(var1, var2 + (double)var1.bV, var4 + (double)var1.bW, var6 + (double)var1.bX);
      } else {
         super.b(var1, var2, var4, var6);
      }

   }

   protected void a(vi var1, float var2, float var3, float var4) {
      if (var1.K() && var1.ar()) {
         GL11.glRotatef(var1.aJ(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.a(var1), 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
      } else {
         super.a(var1, var2, var3, var4);
      }

   }
}
