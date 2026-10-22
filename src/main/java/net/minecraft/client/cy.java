package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class cy extends mg {
   private tt g;

   public cy(x var1, tt var2) {
      super(new ok(var1, var2));
      this.g = var2;
   }

   protected void c() {
      this.q.b("Brewing Stand", 56, 6, 4210752);
      this.q.b("Inventory", 8, this.c - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.l.p.b("/gui/alchemy.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var4);
      int var5 = (this.m - this.b) / 2;
      int var6 = (this.n - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.c);
      int var7 = this.g.a();
      if (var7 > 0) {
         int var8 = (int)(28.0F * (1.0F - (float)var7 / 600.0F));
         if (var8 > 0) {
            this.b(var5 + 97, var6 + 16, 176, 0, 9, var8);
         }

         int var9 = var7 / 2 % 7;
         switch (var9) {
            case 0:
               var8 = 29;
               break;
            case 1:
               var8 = 24;
               break;
            case 2:
               var8 = 20;
               break;
            case 3:
               var8 = 16;
               break;
            case 4:
               var8 = 11;
               break;
            case 5:
               var8 = 6;
               break;
            case 6:
               var8 = 0;
         }

         if (var8 > 0) {
            this.b(var5 + 65, var6 + 14 + 29 - var8, 185, 29 - var8, 12, var8);
         }
      }

   }
}
