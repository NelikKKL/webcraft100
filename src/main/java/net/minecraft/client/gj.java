package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class gj extends mg {
   private de g;
   private de h;
   private int j = 0;

   public gj(de var1, de var2) {
      super(new ak(var1, var2));
      this.g = var1;
      this.h = var2;
      this.p = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.j = var2.c() / 9;
      this.c = var4 + this.j * 18;
   }

   protected void c() {
      this.q.b(this.h.d(), 8, 6, 4210752);
      this.q.b(this.g.d(), 8, this.c - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.l.p.b("/gui/container.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var4);
      int var5 = (this.m - this.b) / 2;
      int var6 = (this.n - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.j * 18 + 17);
      this.b(var5, var6 + this.j * 18 + 17, 0, 126, this.b, 96);
   }
}
