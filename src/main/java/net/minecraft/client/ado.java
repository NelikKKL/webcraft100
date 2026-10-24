package net.minecraft.client;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class ado extends acq {
   public static oo a;
   private static int i = 0;
   protected afo b;

   public ado() {
      super(new afo(0.0F), 0.5F);
      this.b = (afo)this.g;
      this.a(this.g);
   }

   protected void a(oo var1, float var2, float var3, float var4) {
      float var5 = (float)var1.a(7, var4)[0];
      float var6 = (float)(var1.a(5, var4)[1] - var1.a(10, var4)[1]);
      GL11.glRotatef(-var5, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var6 * 10.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 1.0F);
      if (var1.aS > 0) {
         float var7 = ((float)var1.aS + var4 - 1.0F) / 20.0F * 1.6F;
         var7 = me.c(var7);
         if (var7 > 1.0F) {
            var7 = 1.0F;
         }

         GL11.glRotatef(var7 * this.a(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected void a(oo var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1.bG > 0) {
         float var8 = (float)var1.bG / 200.0F;
         GL11.glDepthFunc(515);
         GL11.glEnable(3008);
         GL11.glAlphaFunc(516, var8);
         this.a(var1.ad, "/mob/enderdragon/shuffle.png");
         this.g.a(var1, var2, var3, var4, var5, var6, var7);
         GL11.glAlphaFunc(516, 0.1F);
         GL11.glDepthFunc(514);
      }

      this.a(var1.ad, var1.I());
      this.g.a(var1, var2, var3, var4, var5, var6, var7);
      if (var1.aP > 0) {
         GL11.glDepthFunc(514);
         GL11.glDisable(3553);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
         this.g.a(var1, var2, var3, var4, var5, var6, var7);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDepthFunc(515);
      }

   }

   public void a(oo var1, double var2, double var4, double var6, float var8, float var9) {
      a = var1;
      if (i != 4) {
         this.g = new afo(0.0F);
         i = 4;
      }

      super.a((nq)var1, var2, var4, var6, var8, var9);
      if (var1.bH != null) {
         float var10 = (float)var1.bH.a + var9;
         float var11 = me.a(var10 * 0.2F) / 2.0F + 0.5F;
         var11 = (var11 * var11 + var11) * 0.2F;
         float var12 = (float)(var1.bH.s - var1.s - (var1.p - var1.s) * (double)(1.0F - var9));
         float var13 = (float)((double)var11 + var1.bH.t - (double)1.0F - var1.t - (var1.q - var1.t) * (double)(1.0F - var9));
         float var14 = (float)(var1.bH.u - var1.u - (var1.r - var1.u) * (double)(1.0F - var9));
         float var15 = me.c(var12 * var12 + var14 * var14);
         float var16 = me.c(var12 * var12 + var13 * var13 + var14 * var14);
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4 + 2.0F, (float)var6);
         GL11.glRotatef((float)(-Math.atan2((double)var14, (double)var12)) * 180.0F / (float)Math.PI - 90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)(-Math.atan2((double)var15, (double)var13)) * 180.0F / (float)Math.PI - 90.0F, 1.0F, 0.0F, 0.0F);
         cv var17 = cv.a;
         rt.a();
         GL11.glDisable(2884);
         this.a("/mob/enderdragon/beam.png");
         GL11.glShadeModel(7425);
         float var18 = 0.0F - ((float)var1.Z + var9) * 0.01F;
         float var19 = me.c(var12 * var12 + var13 * var13 + var14 * var14) / 32.0F - ((float)var1.Z + var9) * 0.01F;
         var17.a(5);
         byte var20 = 8;

         for(int var21 = 0; var21 <= var20; ++var21) {
            float var22 = me.a((float)(var21 % var20) * (float)Math.PI * 2.0F / (float)var20) * 0.75F;
            float var23 = me.b((float)(var21 % var20) * (float)Math.PI * 2.0F / (float)var20) * 0.75F;
            float var24 = (float)(var21 % var20) * 1.0F / (float)var20;
            var17.c(0);
            var17.a((double)(var22 * 0.2F), (double)(var23 * 0.2F), (double)0.0F, (double)var24, (double)var19);
            var17.c(16777215);
            var17.a((double)var22, (double)var23, (double)var16, (double)var24, (double)var18);
         }

         var17.a();
         GL11.glEnable(2884);
         GL11.glShadeModel(7424);
         rt.b();
         GL11.glPopMatrix();
      }

   }

   protected void a(oo var1, float var2) {
      super.b(var1, var2);
      cv var3 = cv.a;
      if (var1.bG > 0) {
         rt.a();
         float var4 = ((float)var1.bG + var2) / 200.0F;
         float var5 = 0.0F;
         if (var4 > 0.8F) {
            var5 = (var4 - 0.8F) / 0.2F;
         }

         Random var6 = new net.minecraft.client.web.JRandom(432L);
         GL11.glDisable(3553);
         GL11.glShadeModel(7425);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 1);
         GL11.glDisable(3008);
         GL11.glEnable(2884);
         GL11.glDepthMask(false);
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, -1.0F, -2.0F);

         for(int var7 = 0; (float)var7 < (var4 + var4 * var4) / 2.0F * 60.0F; ++var7) {
            GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F + var4 * 90.0F, 0.0F, 0.0F, 1.0F);
            var3.a(6);
            float var8 = var6.nextFloat() * 20.0F + 5.0F + var5 * 10.0F;
            float var9 = var6.nextFloat() * 2.0F + 1.0F + var5 * 2.0F;
            var3.a(16777215, (int)(255.0F * (1.0F - var5)));
            var3.a((double)0.0F, (double)0.0F, (double)0.0F);
            var3.a(16711935, 0);
            var3.a(-0.866 * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.a(0.866 * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.a((double)0.0F, (double)var8, (double)(1.0F * var9));
            var3.a(-0.866 * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.a();
         }

         GL11.glPopMatrix();
         GL11.glDepthMask(true);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glShadeModel(7424);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
         rt.b();
      }

   }

   protected int a(oo var1, int var2, float var3) {
      if (var2 == 1) {
         GL11.glDepthFunc(515);
      }

      if (var2 != 0) {
         return -1;
      } else {
         this.a("/mob/enderdragon/ender_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
         GL11.glDepthFunc(514);
         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         adx.a(adx.b, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(2896);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }
}
