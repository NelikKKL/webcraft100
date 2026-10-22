package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class n {
   private Minecraft a;
   private dk b = null;
   private float c = 0.0F;
   private float d = 0.0F;
   private acr e = new acr();
   private sg f;
   private int g = -1;

   public n(Minecraft var1) {
      this.a = var1;
      this.f = new sg(var1.q, var1.A, var1.p);
   }

   public void a(nq var1, dk var2, int var3) {
      GL11.glPushMatrix();
      if (var2.c < 256 && acr.a(yy.k[var2.c].c())) {
         GL11.glBindTexture(3553, this.a.p.b("/terrain.png"));
         this.e.a(yy.k[var2.c], var2.i(), 1.0F);
      } else {
         if (var2.c < 256) {
            GL11.glBindTexture(3553, this.a.p.b("/terrain.png"));
         } else {
            GL11.glBindTexture(3553, this.a.p.b("/gui/items.png"));
         }

         cv var4 = cv.a;
         int var5 = var1.a(var2, var3);
         float var6 = ((float)(var5 % 16 * 16) + 0.0F) / 256.0F;
         float var7 = ((float)(var5 % 16 * 16) + 15.99F) / 256.0F;
         float var8 = ((float)(var5 / 16 * 16) + 0.0F) / 256.0F;
         float var9 = ((float)(var5 / 16 * 16) + 15.99F) / 256.0F;
         float var10 = 0.0F;
         float var11 = 0.3F;
         GL11.glEnable(32826);
         GL11.glTranslatef(-var10, -var11, 0.0F);
         float var12 = 1.5F;
         GL11.glScalef(var12, var12, var12);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         this.a(var4, var7, var8, var6, var9);
         if (var2 != null && var2.r() && var3 == 0) {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            this.a.p.b(this.a.p.b("%blur%/misc/glint.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
            float var13 = 0.76F;
            GL11.glColor4f(0.5F * var13, 0.25F * var13, 0.8F * var13, 1.0F);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            float var14 = 0.125F;
            GL11.glScalef(var14, var14, var14);
            float var15 = (float)(System.currentTimeMillis() % 3000L) / 3000.0F * 8.0F;
            GL11.glTranslatef(var15, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            this.a(var4, 0.0F, 0.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(var14, var14, var14);
            var15 = (float)(System.currentTimeMillis() % 4873L) / 4873.0F * 8.0F;
            GL11.glTranslatef(-var15, 0.0F, 0.0F);
            GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
            this.a(var4, 0.0F, 0.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

         GL11.glDisable(32826);
      }

      GL11.glPopMatrix();
   }

   private void a(cv var1, float var2, float var3, float var4, float var5) {
      float var6 = 1.0F;
      float var7 = 0.0625F;
      var1.b();
      var1.b(0.0F, 0.0F, 1.0F);
      var1.a((double)0.0F, (double)0.0F, (double)0.0F, (double)var2, (double)var5);
      var1.a((double)var6, (double)0.0F, (double)0.0F, (double)var4, (double)var5);
      var1.a((double)var6, (double)1.0F, (double)0.0F, (double)var4, (double)var3);
      var1.a((double)0.0F, (double)1.0F, (double)0.0F, (double)var2, (double)var3);
      var1.a();
      var1.b();
      var1.b(0.0F, 0.0F, -1.0F);
      var1.a((double)0.0F, (double)1.0F, (double)(0.0F - var7), (double)var2, (double)var3);
      var1.a((double)var6, (double)1.0F, (double)(0.0F - var7), (double)var4, (double)var3);
      var1.a((double)var6, (double)0.0F, (double)(0.0F - var7), (double)var4, (double)var5);
      var1.a((double)0.0F, (double)0.0F, (double)(0.0F - var7), (double)var2, (double)var5);
      var1.a();
      var1.b();
      var1.b(-1.0F, 0.0F, 0.0F);

      for(int var8 = 0; var8 < 16; ++var8) {
         float var9 = (float)var8 / 16.0F;
         float var10 = var2 + (var4 - var2) * var9 - 0.001953125F;
         float var11 = var6 * var9;
         var1.a((double)var11, (double)0.0F, (double)(0.0F - var7), (double)var10, (double)var5);
         var1.a((double)var11, (double)0.0F, (double)0.0F, (double)var10, (double)var5);
         var1.a((double)var11, (double)1.0F, (double)0.0F, (double)var10, (double)var3);
         var1.a((double)var11, (double)1.0F, (double)(0.0F - var7), (double)var10, (double)var3);
      }

      var1.a();
      var1.b();
      var1.b(1.0F, 0.0F, 0.0F);

      for(int var12 = 0; var12 < 16; ++var12) {
         float var15 = (float)var12 / 16.0F;
         float var18 = var2 + (var4 - var2) * var15 - 0.001953125F;
         float var21 = var6 * var15 + 0.0625F;
         var1.a((double)var21, (double)1.0F, (double)(0.0F - var7), (double)var18, (double)var3);
         var1.a((double)var21, (double)1.0F, (double)0.0F, (double)var18, (double)var3);
         var1.a((double)var21, (double)0.0F, (double)0.0F, (double)var18, (double)var5);
         var1.a((double)var21, (double)0.0F, (double)(0.0F - var7), (double)var18, (double)var5);
      }

      var1.a();
      var1.b();
      var1.b(0.0F, 1.0F, 0.0F);

      for(int var13 = 0; var13 < 16; ++var13) {
         float var16 = (float)var13 / 16.0F;
         float var19 = var5 + (var3 - var5) * var16 - 0.001953125F;
         float var22 = var6 * var16 + 0.0625F;
         var1.a((double)0.0F, (double)var22, (double)0.0F, (double)var2, (double)var19);
         var1.a((double)var6, (double)var22, (double)0.0F, (double)var4, (double)var19);
         var1.a((double)var6, (double)var22, (double)(0.0F - var7), (double)var4, (double)var19);
         var1.a((double)0.0F, (double)var22, (double)(0.0F - var7), (double)var2, (double)var19);
      }

      var1.a();
      var1.b();
      var1.b(0.0F, -1.0F, 0.0F);

      for(int var14 = 0; var14 < 16; ++var14) {
         float var17 = (float)var14 / 16.0F;
         float var20 = var5 + (var3 - var5) * var17 - 0.001953125F;
         float var23 = var6 * var17;
         var1.a((double)var6, (double)var23, (double)0.0F, (double)var4, (double)var20);
         var1.a((double)0.0F, (double)var23, (double)0.0F, (double)var2, (double)var20);
         var1.a((double)0.0F, (double)var23, (double)(0.0F - var7), (double)var2, (double)var20);
         var1.a((double)var6, (double)var23, (double)(0.0F - var7), (double)var4, (double)var20);
      }

      var1.a();
   }

   public void a(float var1) {
      float var2 = this.d + (this.c - this.d) * var1;
      di var3 = this.a.h;
      float var4 = var3.B + (var3.z - var3.B) * var1;
      GL11.glPushMatrix();
      GL11.glRotatef(var4, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.A + (var3.y - var3.A) * var1, 0.0F, 1.0F, 0.0F);
      rt.b();
      GL11.glPopMatrix();
      if (var3 instanceof di) {
         di var5 = var3;
         float var6 = var5.i + (var5.g - var5.i) * var1;
         float var7 = var5.h + (var5.f - var5.h) * var1;
         GL11.glRotatef((var3.z - var6) * 0.1F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef((var3.y - var7) * 0.1F, 0.0F, 1.0F, 0.0F);
      }

      dk var14 = this.b;
      float var15 = this.a.f.c(me.c(var3.s), me.c(var3.t), me.c(var3.u));
      var15 = 1.0F;
      int var17 = this.a.f.a(me.c(var3.s), me.c(var3.t), me.c(var3.u), 0);
      int var8 = var17 % 65536;
      int var9 = var17 / 65536;
      adx.a(adx.b, (float)var8 / 1.0F, (float)var9 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (var14 != null) {
         var17 = acy.d[var14.c].c(var14.i());
         float var22 = (float)(var17 >> 16 & 255) / 255.0F;
         float var33 = (float)(var17 >> 8 & 255) / 255.0F;
         float var10 = (float)(var17 & 255) / 255.0F;
         GL11.glColor4f(var15 * var22, var15 * var33, var15 * var10, 1.0F);
      } else {
         GL11.glColor4f(var15, var15, var15, 1.0F);
      }

      if (var14 != null && var14.c == acy.bc.bM) {
         GL11.glPushMatrix();
         float var21 = 0.8F;
         float var30 = ((vi)var3).d(var1);
         float var41 = me.a(var30 * (float)Math.PI);
         float var52 = me.a(me.c(var30) * (float)Math.PI);
         GL11.glTranslatef(-var52 * 0.4F, me.a(me.c(var30) * (float)Math.PI * 2.0F) * 0.2F, -var41 * 0.2F);
         var30 = 1.0F - var4 / 45.0F + 0.1F;
         if (var30 < 0.0F) {
            var30 = 0.0F;
         }

         if (var30 > 1.0F) {
            var30 = 1.0F;
         }

         var30 = -me.b(var30 * (float)Math.PI) * 0.5F + 0.5F;
         GL11.glTranslatef(0.0F, 0.0F * var21 - (1.0F - var2) * 1.2F - var30 * 0.5F + 0.04F, -0.9F * var21);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var30 * -85.0F, 0.0F, 0.0F, 1.0F);
         GL11.glEnable(32826);
         GL11.glBindTexture(3553, this.a.p.a(this.a.h.ad, this.a.h.I()));

         for(int var42 = 0; var42 < 2; ++var42) {
            int var53 = var42 * 2 - 1;
            GL11.glPushMatrix();
            GL11.glTranslatef(-0.0F, -0.6F, 1.1F * (float)var53);
            GL11.glRotatef((float)(-45 * var53), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef((float)(-65 * var53), 0.0F, 1.0F, 0.0F);
            rg var57 = wb.a.a((ia)this.a.h);
            zr var64 = (zr)var57;
            float var66 = 1.0F;
            GL11.glScalef(var66, var66, var66);
            var64.b();
            GL11.glPopMatrix();
         }

         var41 = ((vi)var3).d(var1);
         var52 = me.a(var41 * var41 * (float)Math.PI);
         float var58 = me.a(me.c(var41) * (float)Math.PI);
         GL11.glRotatef(-var52 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var58 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var58 * 80.0F, 1.0F, 0.0F, 0.0F);
         var41 = 0.38F;
         GL11.glScalef(var41, var41, var41);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
         var52 = 0.015625F;
         GL11.glScalef(var52, var52, var52);
         this.a.p.b(this.a.p.b("/misc/mapbg.png"));
         cv var59 = cv.a;
         GL11.glNormal3f(0.0F, 0.0F, -1.0F);
         var59.b();
         byte var65 = 7;
         var59.a((double)(0 - var65), (double)(128 + var65), (double)0.0F, (double)0.0F, (double)1.0F);
         var59.a((double)(128 + var65), (double)(128 + var65), (double)0.0F, (double)1.0F, (double)1.0F);
         var59.a((double)(128 + var65), (double)(0 - var65), (double)0.0F, (double)1.0F, (double)0.0F);
         var59.a((double)(0 - var65), (double)(0 - var65), (double)0.0F, (double)0.0F, (double)0.0F);
         var59.a();
         kl var67 = acy.bc.a(var14, this.a.f);
         this.f.a(this.a.h, this.a.p, var67);
         GL11.glPopMatrix();
      } else if (var14 != null) {
         GL11.glPushMatrix();
         float var19 = 0.8F;
         if (((vi)var3).ay() > 0) {
            ps var24 = var14.m();
            if (var24 == ps.b || var24 == ps.c) {
               float var35 = (float)((vi)var3).ay() - var1 + 1.0F;
               float var46 = 1.0F - var35 / (float)var14.l();
               float var12 = 1.0F - var46;
               var12 = var12 * var12 * var12;
               var12 = var12 * var12 * var12;
               var12 = var12 * var12 * var12;
               float var13 = 1.0F - var12;
               GL11.glTranslatef(0.0F, me.e(me.b(var35 / 4.0F * (float)Math.PI) * 0.1F) * (float)((double)var46 > 0.2 ? 1 : 0), 0.0F);
               GL11.glTranslatef(var13 * 0.6F, -var13 * 0.5F, 0.0F);
               GL11.glRotatef(var13 * 90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(var13 * 10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(var13 * 30.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            float var23 = ((vi)var3).d(var1);
            float var34 = me.a(var23 * (float)Math.PI);
            float var45 = me.a(me.c(var23) * (float)Math.PI);
            GL11.glTranslatef(-var45 * 0.4F, me.a(me.c(var23) * (float)Math.PI * 2.0F) * 0.2F, -var34 * 0.2F);
         }

         GL11.glTranslatef(0.7F * var19, -0.65F * var19 - (1.0F - var2) * 0.6F, -0.9F * var19);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         float var25 = ((vi)var3).d(var1);
         float var36 = me.a(var25 * var25 * (float)Math.PI);
         float var47 = me.a(me.c(var25) * (float)Math.PI);
         GL11.glRotatef(-var36 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var47 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var47 * 80.0F, 1.0F, 0.0F, 0.0F);
         var25 = 0.4F;
         GL11.glScalef(var25, var25, var25);
         if (((vi)var3).ay() > 0) {
            ps var37 = var14.m();
            if (var37 == ps.d) {
               GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
               GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
            } else if (var37 == ps.e) {
               GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
               GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
               var47 = (float)var14.l() - ((float)((vi)var3).ay() - var1 + 1.0F);
               float var11 = var47 / 20.0F;
               var11 = (var11 * var11 + var11 * 2.0F) / 3.0F;
               if (var11 > 1.0F) {
                  var11 = 1.0F;
               }

               if (var11 > 0.1F) {
                  GL11.glTranslatef(0.0F, me.a((var47 - 0.1F) * 1.3F) * 0.01F * (var11 - 0.1F), 0.0F);
               }

               GL11.glTranslatef(0.0F, 0.0F, var11 * 0.1F);
               GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glTranslatef(0.0F, 0.5F, 0.0F);
               float var63 = 1.0F + var11 * 0.2F;
               GL11.glScalef(1.0F, 1.0F, var63);
               GL11.glTranslatef(0.0F, -0.5F, 0.0F);
               GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            }
         }

         if (var14.a().b()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if (var14.c == acy.br.bM) {
            this.a(var3, var14, 0);
            GL11.glColor4f(var15, var15, var15, 1.0F);
            this.a(var3, var14, 1);
         } else {
            this.a(var3, var14, 0);
         }

         GL11.glPopMatrix();
      } else {
         GL11.glPushMatrix();
         float var20 = 0.8F;
         float var27 = ((vi)var3).d(var1);
         float var38 = me.a(var27 * (float)Math.PI);
         float var49 = me.a(me.c(var27) * (float)Math.PI);
         GL11.glTranslatef(-var49 * 0.3F, me.a(me.c(var27) * (float)Math.PI * 2.0F) * 0.4F, -var38 * 0.4F);
         GL11.glTranslatef(0.8F * var20, -0.75F * var20 - (1.0F - var2) * 0.6F, -0.9F * var20);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         var27 = ((vi)var3).d(var1);
         var38 = me.a(var27 * var27 * (float)Math.PI);
         var49 = me.a(me.c(var27) * (float)Math.PI);
         GL11.glRotatef(var49 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var38 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.a.p.a(this.a.h.ad, this.a.h.I()));
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         rg var29 = wb.a.a((ia)this.a.h);
         zr var40 = (zr)var29;
         var49 = 1.0F;
         GL11.glScalef(var49, var49, var49);
         var40.b();
         GL11.glPopMatrix();
      }

      GL11.glDisable(32826);
      rt.a();
   }

   public void b(float var1) {
      GL11.glDisable(3008);
      if (this.a.h.V()) {
         int var2 = this.a.p.b("/terrain.png");
         GL11.glBindTexture(3553, var2);
         this.d(var1);
      }

      if (this.a.h.L()) {
         int var14 = me.c(this.a.h.s);
         int var3 = me.c(this.a.h.t);
         int var4 = me.c(this.a.h.u);
         int var5 = this.a.p.b("/terrain.png");
         GL11.glBindTexture(3553, var5);
         int var6 = this.a.f.a(var14, var3, var4);
         if (this.a.f.g(var14, var3, var4)) {
            this.a(var1, yy.k[var6].b(2));
         } else {
            for(int var7 = 0; var7 < 8; ++var7) {
               float var8 = ((float)((var7 >> 0) % 2) - 0.5F) * this.a.h.M * 0.9F;
               float var9 = ((float)((var7 >> 1) % 2) - 0.5F) * this.a.h.N * 0.2F;
               float var10 = ((float)((var7 >> 2) % 2) - 0.5F) * this.a.h.M * 0.9F;
               int var11 = me.d((float)var14 + var8);
               int var12 = me.d((float)var3 + var9);
               int var13 = me.d((float)var4 + var10);
               if (this.a.f.g(var11, var12, var13)) {
                  var6 = this.a.f.a(var11, var12, var13);
               }
            }
         }

         if (yy.k[var6] != null) {
            this.a(var1, yy.k[var6].b(2));
         }
      }

      if (this.a.h.a((p)p.g)) {
         int var15 = this.a.p.b("/misc/water.png");
         GL11.glBindTexture(3553, var15);
         this.c(var1);
      }

      GL11.glEnable(3008);
   }

   private void a(float var1, int var2) {
      cv var3 = cv.a;
      this.a.h.b(var1);
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = 0.0078125F;
      float var11 = (float)(var2 % 16) / 256.0F - var10;
      float var12 = ((float)(var2 % 16) + 15.99F) / 256.0F + var10;
      float var13 = (float)(var2 / 16) / 256.0F - var10;
      float var14 = ((float)(var2 / 16) + 15.99F) / 256.0F + var10;
      var3.b();
      var3.a((double)var5, (double)var7, (double)var9, (double)var12, (double)var14);
      var3.a((double)var6, (double)var7, (double)var9, (double)var11, (double)var14);
      var3.a((double)var6, (double)var8, (double)var9, (double)var11, (double)var13);
      var3.a((double)var5, (double)var8, (double)var9, (double)var12, (double)var13);
      var3.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void c(float var1) {
      cv var2 = cv.a;
      float var3 = this.a.h.b(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.a.h.y / 64.0F;
      float var11 = this.a.h.z / 64.0F;
      var2.b();
      var2.a((double)var5, (double)var7, (double)var9, (double)(var4 + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var7, (double)var9, (double)(0.0F + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var8, (double)var9, (double)(0.0F + var10), (double)(0.0F + var11));
      var2.a((double)var5, (double)var8, (double)var9, (double)(var4 + var10), (double)(0.0F + var11));
      var2.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void d(float var1) {
      cv var2 = cv.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for(int var4 = 0; var4 < 2; ++var4) {
         GL11.glPushMatrix();
         int var5 = yy.ar.bL + var4 * 16;
         int var6 = (var5 & 15) << 4;
         int var7 = var5 & 240;
         float var8 = (float)var6 / 256.0F;
         float var9 = ((float)var6 + 15.99F) / 256.0F;
         float var10 = (float)var7 / 256.0F;
         float var11 = ((float)var7 + 15.99F) / 256.0F;
         float var12 = (0.0F - var3) / 2.0F;
         float var13 = var12 + var3;
         float var14 = 0.0F - var3 / 2.0F;
         float var15 = var14 + var3;
         float var16 = -0.5F;
         GL11.glTranslatef((float)(-(var4 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((float)(var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.b();
         var2.a((double)var12, (double)var14, (double)var16, (double)var9, (double)var11);
         var2.a((double)var13, (double)var14, (double)var16, (double)var8, (double)var11);
         var2.a((double)var13, (double)var15, (double)var16, (double)var8, (double)var10);
         var2.a((double)var12, (double)var15, (double)var16, (double)var9, (double)var10);
         var2.a();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void a() {
      this.d = this.c;
      di var1 = this.a.h;
      dk var2 = var1.by.a();
      boolean var4 = this.g == var1.by.c && var2 == this.b;
      if (this.b == null && var2 == null) {
         var4 = true;
      }

      if (var2 != null && this.b != null && var2 != this.b && var2.c == this.b.c && var2.i() == this.b.i()) {
         this.b = var2;
         var4 = true;
      }

      float var5 = 0.4F;
      float var6 = var4 ? 1.0F : 0.0F;
      float var7 = var6 - this.c;
      if (var7 < -var5) {
         var7 = -var5;
      }

      if (var7 > var5) {
         var7 = var5;
      }

      this.c += var7;
      if (this.c < 0.1F) {
         this.b = var2;
         this.g = var1.by.c;
      }

   }

   public void b() {
      this.c = 0.0F;
   }

   public void c() {
      this.c = 0.0F;
   }
}
