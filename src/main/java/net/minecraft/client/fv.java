package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class fv extends du {
   private xl b = new xl();
   private xl c = new vk();

   public void a(tu var1, double var2, double var4, double var6, float var8) {
      int var9;
      if (var1.c == null) {
         var9 = 0;
      } else {
         yy var10 = var1.g();
         var9 = var1.f();
         if (var10 != null && var9 == 0) {
            ((au)var10).a_(var1.c, var1.d, var1.e, var1.f);
            var9 = var1.f();
         }

         var1.a();
      }

      if (var1.b == null && var1.k == null) {
         xl var14;
         if (var1.j == null && var1.l == null) {
            var14 = this.b;
            this.a("/item/chest.png");
         } else {
            var14 = this.c;
            this.a("/item/largechest.png");
         }

         GL11.glPushMatrix();
         GL11.glEnable(32826);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         short var11 = 0;
         if (var9 == 2) {
            var11 = 180;
         }

         if (var9 == 3) {
            var11 = 0;
         }

         if (var9 == 4) {
            var11 = 90;
         }

         if (var9 == 5) {
            var11 = -90;
         }

         if (var9 == 2 && var1.j != null) {
            GL11.glTranslatef(1.0F, 0.0F, 0.0F);
         }

         if (var9 == 5 && var1.l != null) {
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
         }

         GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var12 = var1.n + (var1.m - var1.n) * var8;
         if (var1.b != null) {
            float var13 = var1.b.n + (var1.b.m - var1.b.n) * var8;
            if (var13 > var12) {
               var12 = var13;
            }
         }

         if (var1.k != null) {
            float var17 = var1.k.n + (var1.k.m - var1.k.n) * var8;
            if (var17 > var12) {
               var12 = var17;
            }
         }

         var12 = 1.0F - var12;
         var12 = 1.0F - var12 * var12 * var12;
         var14.g.f = -(var12 * (float)Math.PI / 2.0F);
         var14.a();
         GL11.glDisable(32826);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   // PATCH(bridge): синтетический bridge-метод, потерянный декомпилятором
   public void a(bq v0, double v1, double v2, double v3, float v4) { this.a((tu)v0, v1, v2, v3, v4); }
}
