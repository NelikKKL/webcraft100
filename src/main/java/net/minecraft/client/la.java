package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class la extends acq {
   public la(al var1, float var2) {
      super(var1, var2);
   }

   public void a(tb var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }

   protected void a(tb var1, float var2) {
      super.b(var1, var2);
      if (!var1.q_()) {
         this.a("/terrain.png");
         GL11.glEnable(2884);
         GL11.glPushMatrix();
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.2F, 0.4F, 0.5F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.d.a(yy.ag, 0, 1.0F);
         GL11.glTranslatef(0.1F, 0.0F, -0.6F);
         GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
         this.d.a(yy.ag, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         ((fh)this.g).g.c(0.0625F);
         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glTranslatef(0.0F, 0.75F, -0.2F);
         GL11.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
         this.d.a(yy.ag, 0, 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable(2884);
      }
   }
}
