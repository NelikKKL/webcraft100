package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ahr extends acq {
   public ahr(al var1, al var2, float var3) {
      super(var1, var3);
      this.a(var2);
   }

   protected int a(hm var1, int var2, float var3) {
      if (var2 == 0 && !var1.v_()) {
         this.a("/mob/sheep_fur.png");
         float var4 = 1.0F;
         int var5 = var1.l();
         GL11.glColor3f(var4 * hm.a[var5][0], var4 * hm.a[var5][1], var4 * hm.a[var5][2]);
         return 1;
      } else {
         return -1;
      }
   }

   public void a(hm var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((nq)var1, var2, var4, var6, var8, var9);
   }
}
