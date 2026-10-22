package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class afo extends al {
   private acf g;
   private acf h;
   private acf i;
   private acf j;
   private acf k;
   private acf l;
   private acf m;
   private acf n;
   private acf o;
   private acf p;
   private acf q;
   private acf r;
   private float s;

   public afo(float var1) {
      this.e = 256;
      this.f = 256;
      this.a("body.body", 0, 0);
      this.a("wing.skin", -56, 88);
      this.a("wingtip.skin", -56, 144);
      this.a("rearleg.main", 0, 0);
      this.a("rearfoot.main", 112, 0);
      this.a("rearlegtip.main", 196, 0);
      this.a("head.upperhead", 112, 30);
      this.a("wing.bone", 112, 88);
      this.a("head.upperlip", 176, 44);
      this.a("jaw.jaw", 176, 65);
      this.a("frontleg.main", 112, 104);
      this.a("wingtip.bone", 112, 136);
      this.a("frontfoot.main", 144, 104);
      this.a("neck.box", 192, 104);
      this.a("frontlegtip.main", 226, 138);
      this.a("body.scale", 220, 53);
      this.a("head.scale", 0, 0);
      this.a("neck.scale", 48, 0);
      this.a("head.nostril", 112, 0);
      float var2 = -16.0F;
      this.g = new acf(this, "head");
      this.g.a("upperlip", -6.0F, -1.0F, -8.0F + var2, 12, 5, 16);
      this.g.a("upperhead", -8.0F, -8.0F, 6.0F + var2, 16, 16, 16);
      this.g.i = true;
      this.g.a("scale", -5.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.g.a("nostril", -5.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.g.i = false;
      this.g.a("scale", 3.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.g.a("nostril", 3.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.i = new acf(this, "jaw");
      this.i.a(0.0F, 4.0F, 8.0F + var2);
      this.i.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.g.a(this.i);
      this.h = new acf(this, "neck");
      this.h.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.h.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
      this.j = new acf(this, "body");
      this.j.a(0.0F, 4.0F, 8.0F);
      this.j.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.j.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.j.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.j.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
      this.q = new acf(this, "wing");
      this.q.a(-12.0F, 5.0F, 2.0F);
      this.q.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.q.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.r = new acf(this, "wingtip");
      this.r.a(-56.0F, 0.0F, 0.0F);
      this.r.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.r.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.q.a(this.r);
      this.l = new acf(this, "frontleg");
      this.l.a(-12.0F, 20.0F, 2.0F);
      this.l.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
      this.n = new acf(this, "frontlegtip");
      this.n.a(0.0F, 20.0F, -1.0F);
      this.n.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.l.a(this.n);
      this.p = new acf(this, "frontfoot");
      this.p.a(0.0F, 23.0F, 0.0F);
      this.p.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.n.a(this.p);
      this.k = new acf(this, "rearleg");
      this.k.a(-16.0F, 16.0F, 42.0F);
      this.k.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
      this.m = new acf(this, "rearlegtip");
      this.m.a(0.0F, 32.0F, -4.0F);
      this.m.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.k.a(this.m);
      this.o = new acf(this, "rearfoot");
      this.o.a(0.0F, 31.0F, 4.0F);
      this.o.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.m.a(this.o);
   }

   public void a(nq var1, float var2, float var3, float var4) {
      this.s = var4;
   }

   public void a(ia var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      oo var8 = (oo)var1;
      float var9 = var8.bC + (var8.bD - var8.bC) * this.s;
      this.i.f = (float)(Math.sin((double)(var9 * (float)Math.PI * 2.0F)) + (double)1.0F) * 0.2F;
      float var10 = (float)(Math.sin((double)(var9 * (float)Math.PI * 2.0F - 1.0F)) + (double)1.0F);
      var10 = (var10 * var10 * 1.0F + var10 * 2.0F) * 0.05F;
      GL11.glTranslatef(0.0F, var10 - 2.0F, -3.0F);
      GL11.glRotatef(var10 * 2.0F, 1.0F, 0.0F, 0.0F);
      float var11 = -30.0F;
      float var12 = 22.0F;
      float var13 = 0.0F;
      float var14 = 1.5F;
      double[] var15 = var8.a(6, this.s);
      float var16 = this.a(var8.a(5, this.s)[0] - var8.a(10, this.s)[0]);
      float var17 = this.a(var8.a(5, this.s)[0] + (double)(var16 / 2.0F));
      var11 += 2.0F;
      float var18 = 0.0F;
      float var19 = var9 * (float)Math.PI * 2.0F;
      var11 = 20.0F;
      var12 = -12.0F;

      for(int var20 = 0; var20 < 5; ++var20) {
         double[] var21 = var8.a(5 - var20, this.s);
         var18 = (float)Math.cos((double)((float)var20 * 0.45F + var19)) * 0.15F;
         this.h.g = this.a(var21[0] - var15[0]) * (float)Math.PI / 180.0F * var14;
         this.h.f = var18 + (float)(var21[1] - var15[1]) * (float)Math.PI / 180.0F * var14 * 5.0F;
         this.h.h = -this.a(var21[0] - (double)var17) * (float)Math.PI / 180.0F * var14;
         this.h.d = var11;
         this.h.e = var12;
         this.h.c = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.h.f) * (double)10.0F);
         var12 = (float)((double)var12 - Math.cos((double)this.h.g) * Math.cos((double)this.h.f) * (double)10.0F);
         var13 = (float)((double)var13 - Math.sin((double)this.h.g) * Math.cos((double)this.h.f) * (double)10.0F);
         this.h.a(var7);
      }

      this.g.d = var11;
      this.g.e = var12;
      this.g.c = var13;
      double[] var34 = var8.a(0, this.s);
      this.g.g = this.a(var34[0] - var15[0]) * (float)Math.PI / 180.0F * 1.0F;
      this.g.h = -this.a(var34[0] - (double)var17) * (float)Math.PI / 180.0F * 1.0F;
      this.g.a(var7);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var16 * var14 * 1.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.j.h = 0.0F;
      this.j.a(var7);

      for(int var36 = 0; var36 < 2; ++var36) {
         GL11.glEnable(2884);
         float var22 = var9 * (float)Math.PI * 2.0F;
         this.q.f = 0.125F - (float)Math.cos((double)var22) * 0.2F;
         this.q.g = 0.25F;
         this.q.h = (float)(Math.sin((double)var22) + (double)0.125F) * 0.8F;
         this.r.h = -((float)(Math.sin((double)(var22 + 2.0F)) + (double)0.5F)) * 0.75F;
         this.k.f = 1.0F + var10 * 0.1F;
         this.m.f = 0.5F + var10 * 0.1F;
         this.o.f = 0.75F + var10 * 0.1F;
         this.l.f = 1.3F + var10 * 0.1F;
         this.n.f = -0.5F - var10 * 0.1F;
         this.p.f = 0.75F + var10 * 0.1F;
         this.q.a(var7);
         this.l.a(var7);
         this.k.a(var7);
         GL11.glScalef(-1.0F, 1.0F, 1.0F);
         if (var36 == 0) {
            GL11.glCullFace(1028);
         }
      }

      GL11.glPopMatrix();
      GL11.glCullFace(1029);
      GL11.glDisable(2884);
      var18 = -((float)Math.sin((double)(var9 * (float)Math.PI * 2.0F))) * 0.0F;
      var19 = var9 * (float)Math.PI * 2.0F;
      var11 = 10.0F;
      var12 = 60.0F;
      var13 = 0.0F;
      var15 = var8.a(11, this.s);

      for(int var37 = 0; var37 < 12; ++var37) {
         var34 = var8.a(12 + var37, this.s);
         var18 = (float)((double)var18 + Math.sin((double)((float)var37 * 0.45F + var19)) * (double)0.05F);
         this.h.g = (this.a(var34[0] - var15[0]) * var14 + 180.0F) * (float)Math.PI / 180.0F;
         this.h.f = var18 + (float)(var34[1] - var15[1]) * (float)Math.PI / 180.0F * var14 * 5.0F;
         this.h.h = this.a(var34[0] - (double)var17) * (float)Math.PI / 180.0F * var14;
         this.h.d = var11;
         this.h.e = var12;
         this.h.c = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.h.f) * (double)10.0F);
         var12 = (float)((double)var12 - Math.cos((double)this.h.g) * Math.cos((double)this.h.f) * (double)10.0F);
         var13 = (float)((double)var13 - Math.sin((double)this.h.g) * Math.cos((double)this.h.f) * (double)10.0F);
         this.h.a(var7);
      }

      GL11.glPopMatrix();
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   private float a(double var1) {
      while(var1 >= (double)180.0F) {
         var1 -= (double)360.0F;
      }

      while(var1 < (double)-180.0F) {
         var1 += (double)360.0F;
      }

      return (float)var1;
   }
}
