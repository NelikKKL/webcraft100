package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class tp extends acq {
   protected fa a;
   protected float b;

   public tp(fa var1, float var2) {
      this(var1, var2, 1.0F);
      this.a = var1;
   }

   public tp(fa var1, float var2, float var3) {
      super(var1, var2);
      this.a = var1;
      this.b = var3;
   }

   protected void b(nq var1, float var2) {
      super.b(var1, var2);
      dk var3 = var1.s();
      if (var3 != null) {
         GL11.glPushMatrix();
         this.a.j.c(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if (var3.c < 256 && acr.a(yy.k[var3.c].c())) {
            float var7 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var7 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var7, -var7, var7);
         } else if (var3.c == acy.j.bM) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (acy.d[var3.c].a()) {
            float var5 = 0.625F;
            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            float var6 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var6, var6, var6);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.c.f.a(var1, var3, 0);
         if (var3.c == acy.br.bM) {
            this.c.f.a(var1, var3, 1);
         }

         GL11.glPopMatrix();
      }

   }
}
