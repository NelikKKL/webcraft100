package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class acq extends rg {
   protected al g;
   protected al h;

   public acq(al var1, float var2) {
      this.g = var1;
      this.e = var2;
   }

   public void a(al var1) {
      this.h = var1;
   }

   public void a(nq var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      this.g.a = this.d(var1, var9);
      if (this.h != null) {
         this.h.a = this.g.a;
      }

      this.g.b = var1.W();
      if (this.h != null) {
         this.h.b = this.g.b;
      }

      this.g.d = var1.q_();
      if (this.h != null) {
         this.h.d = this.g.d;
      }

      try {
         float var10 = var1.au + (var1.at - var1.au) * var9;
         float var11 = var1.A + (var1.y - var1.A) * var9;
         float var12 = var1.B + (var1.z - var1.B) * var9;
         this.b(var1, var2, var4, var6);
         float var13 = this.c(var1, var9);
         this.a(var1, var13, var10, var9);
         float var14 = 0.0625F;
         GL11.glEnable(32826);
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.a(var1, var9);
         GL11.glTranslatef(0.0F, -24.0F * var14 - 0.0078125F, 0.0F);
         float var15 = var1.ba + (var1.bb - var1.ba) * var9;
         float var16 = var1.bc - var1.bb * (1.0F - var9);
         if (var1.q_()) {
            var16 *= 3.0F;
         }

         if (var15 > 1.0F) {
            var15 = 1.0F;
         }

         GL11.glEnable(3008);
         this.g.a(var1, var16, var15, var9);
         this.a(var1, var16, var15, var13, var11 - var10, var12, var14);

         for(int var17 = 0; var17 < 4; ++var17) {
            int var18 = this.a(var1, var17, var9);
            if (var18 > 0) {
               this.h.a(var1, var16, var15, var13, var11 - var10, var12, var14);
               if (var18 == 15) {
                  float var19 = (float)var1.Z + var9;
                  this.a((String)"%blur%/misc/glint.png");
                  GL11.glEnable(3042);
                  float var20 = 0.5F;
                  GL11.glColor4f(var20, var20, var20, 1.0F);
                  GL11.glDepthFunc(514);
                  GL11.glDepthMask(false);

                  for(int var21 = 0; var21 < 2; ++var21) {
                     GL11.glDisable(2896);
                     float var22 = 0.76F;
                     GL11.glColor4f(0.5F * var22, 0.25F * var22, 0.8F * var22, 1.0F);
                     GL11.glBlendFunc(768, 1);
                     GL11.glMatrixMode(5890);
                     GL11.glLoadIdentity();
                     float var23 = var19 * (0.001F + (float)var21 * 0.003F) * 20.0F;
                     float var24 = 0.33333334F;
                     GL11.glScalef(var24, var24, var24);
                     GL11.glRotatef(30.0F - (float)var21 * 60.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef(0.0F, var23, 0.0F);
                     GL11.glMatrixMode(5888);
                     this.h.a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }

                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  GL11.glMatrixMode(5890);
                  GL11.glDepthMask(true);
                  GL11.glLoadIdentity();
                  GL11.glMatrixMode(5888);
                  GL11.glEnable(2896);
                  GL11.glDisable(3042);
                  GL11.glDepthFunc(515);
               }

               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }

         this.b(var1, var9);
         float var26 = var1.b(var9);
         int var27 = this.a(var1, var26, var9);
         adx.a(adx.b);
         GL11.glDisable(3553);
         adx.a(adx.a);
         if ((var27 >> 24 & 255) > 0 || var1.aP > 0 || var1.aS > 0) {
            GL11.glDisable(3553);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthFunc(514);
            if (var1.aP > 0 || var1.aS > 0) {
               GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
               this.g.a(var1, var16, var15, var13, var11 - var10, var12, var14);

               for(int var28 = 0; var28 < 4; ++var28) {
                  if (this.b(var1, var28, var9) >= 0) {
                     GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
                     this.h.a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            if ((var27 >> 24 & 255) > 0) {
               float var29 = (float)(var27 >> 16 & 255) / 255.0F;
               float var30 = (float)(var27 >> 8 & 255) / 255.0F;
               float var31 = (float)(var27 & 255) / 255.0F;
               float var32 = (float)(var27 >> 24 & 255) / 255.0F;
               GL11.glColor4f(var29, var30, var31, var32);
               this.g.a(var1, var16, var15, var13, var11 - var10, var12, var14);

               for(int var33 = 0; var33 < 4; ++var33) {
                  if (this.b(var1, var33, var9) >= 0) {
                     GL11.glColor4f(var29, var30, var31, var32);
                     this.h.a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(3553);
         }

         GL11.glDisable(32826);
      } catch (Exception var25) {
         var25.printStackTrace();
      }

      adx.a(adx.b);
      GL11.glEnable(3553);
      adx.a(adx.a);
      GL11.glEnable(2884);
      GL11.glPopMatrix();
      this.a(var1, var2, var4, var6);
   }

   protected void a(nq var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var1.ad, var1.I());
      this.g.a(var1, var2, var3, var4, var5, var6, var7);
   }

   protected void b(nq var1, double var2, double var4, double var6) {
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
   }

   protected void a(nq var1, float var2, float var3, float var4) {
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      if (var1.aS > 0) {
         float var5 = ((float)var1.aS + var4 - 1.0F) / 20.0F * 1.6F;
         var5 = me.c(var5);
         if (var5 > 1.0F) {
            var5 = 1.0F;
         }

         GL11.glRotatef(var5 * this.a(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected float d(nq var1, float var2) {
      return var1.d(var2);
   }

   protected float c(nq var1, float var2) {
      return (float)var1.Z + var2;
   }

   protected void b(nq var1, float var2) {
   }

   protected int b(nq var1, int var2, float var3) {
      return this.a(var1, var2, var3);
   }

   protected int a(nq var1, int var2, float var3) {
      return -1;
   }

   protected float a(nq var1) {
      return 90.0F;
   }

   protected int a(nq var1, float var2, float var3) {
      return 0;
   }

   protected void a(nq var1, float var2) {
   }

   protected void a(nq var1, double var2, double var4, double var6) {
      if (Minecraft.u()) {
      }

   }

   protected void a(nq var1, String var2, double var3, double var5, double var7, int var9) {
      float var10 = var1.c(this.c.h);
      if (!(var10 > (float)var9)) {
         abe var11 = this.a();
         float var12 = 1.6F;
         float var13 = 0.016666668F * var12;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var3 + 0.0F, (float)var5 + 2.3F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-this.c.i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.c.j, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var13, -var13, var13);
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         cv var14 = cv.a;
         byte var15 = 0;
         if (var2.equals("deadmau5")) {
            var15 = -10;
         }

         GL11.glDisable(3553);
         var14.b();
         int var16 = var11.a(var2) / 2;
         var14.a(0.0F, 0.0F, 0.0F, 0.25F);
         var14.a((double)(-var16 - 1), (double)(-1 + var15), (double)0.0F);
         var14.a((double)(-var16 - 1), (double)(8 + var15), (double)0.0F);
         var14.a((double)(var16 + 1), (double)(8 + var15), (double)0.0F);
         var14.a((double)(var16 + 1), (double)(-1 + var15), (double)0.0F);
         var14.a();
         GL11.glEnable(3553);
         var11.b(var2, -var11.a(var2) / 2, var15, 553648127);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         var11.b(var2, -var11.a(var2) / 2, var15, -1);
         GL11.glEnable(2896);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
      }
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(ia v0, double v1, double v2, double v3, float v4, float v5) { this.a((nq)v0, v1, v2, v3, v4, v5); }
}
