package net.minecraft.client;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class aae extends acq {
   private ta a;
   private Random b = new net.minecraft.client.web.JRandom();

   public aae() {
      super(new ta(), 0.5F);
      this.a = (ta)super.g;
      this.a(this.a);
   }

   public void a(aii var1, double var2, double var4, double var6, float var8, float var9) {
      this.a.t = var1.ay() > 0;
      this.a.u = var1.b;
      if (var1.b) {
         double var10 = 0.02;
         var2 += this.b.nextGaussian() * var10;
         var6 += this.b.nextGaussian() * var10;
      }

      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected void a(aii var1, float var2) {
      super.b(var1, var2);
      if (var1.ay() > 0) {
         GL11.glEnable(32826);
         GL11.glPushMatrix();
         float var3 = 0.5F;
         GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
         var3 *= 1.0F;
         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(var3, -var3, var3);
         int var4 = var1.a(var2);
         int var5 = var4 % 65536;
         int var6 = var4 / 65536;
         adx.a(adx.b, (float)var5 / 1.0F, (float)var6 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.a("/terrain.png");
         this.d.a(yy.k[var1.ay()], var1.aD(), 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable(32826);
      }

   }

   protected int a(aii var1, int var2, float var3) {
      if (var2 != 0) {
         return -1;
      } else {
         this.a("/mob/enderman_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
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

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   public void a(nq v0, double v1, double v2, double v3, float v4, float v5) { this.a((aii)v0, v1, v2, v3, v4, v5); }

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected void b(nq v0, float v1) { this.a((aii)v0, v1); } // PATCH(bridge3): bridge к методу с ДРУГИМ именем (a<->b), прежний bridge2 был привязан к одноимённому и вызывал не то

   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)
   protected int a(nq v0, int v1, float v2) { return this.a((aii)v0, v1, v2); }
}
