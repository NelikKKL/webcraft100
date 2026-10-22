package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class aaw extends mg {
   private oe g;

   public aaw(x var1, oe var2) {
      super(new eg(var1, var2));
      this.g = var2;
   }

   protected void c() {
      this.q.b("Furnace", 60, 6, 4210752);
      this.q.b("Inventory", 8, this.c - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.l.p.b("/gui/furnace.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var4);
      int var5 = (this.m - this.b) / 2;
      int var6 = (this.n - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.c);
      if (this.g.a()) {
         int var7 = this.g.b(12);
         this.b(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
      }

      int var8 = this.g.a(24);
      this.b(var5 + 79, var6 + 34, 176, 14, var8 + 1, 16);
   }
}
