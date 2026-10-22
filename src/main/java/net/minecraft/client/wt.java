package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class wt extends mg {
   public wt(x var1, bp var2) {
      super(new qu(var1, var2));
   }

   protected void c() {
      this.q.b("Dispenser", 60, 6, 4210752);
      this.q.b("Inventory", 8, this.c - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.l.p.b("/gui/trap.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var4);
      int var5 = (this.m - this.b) / 2;
      int var6 = (this.n - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.c);
   }
}
