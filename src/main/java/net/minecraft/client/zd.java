package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class zd extends ct {
   public float j = 1.0F;
   public boolean k = false;
   private lp l = null;

   public zd(int var1, int var2, int var3, lp var4, String var5, float var6) {
      super(var1, var2, var3, 150, 20, var5);
      this.l = var4;
      this.j = var6;
   }

   protected int a(boolean var1) {
      return 0;
   }

   protected void b(Minecraft var1, int var2, int var3) {
      if (this.h) {
         if (this.k) {
            this.j = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
            if (this.j < 0.0F) {
               this.j = 0.0F;
            }

            if (this.j > 1.0F) {
               this.j = 1.0F;
            }

            var1.A.a(this.l, this.j);
            this.e = var1.A.c(this.l);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.b(this.c + (int)(this.j * (float)(this.a - 8)), this.d, 0, 66, 4, 20);
         this.b(this.c + (int)(this.j * (float)(this.a - 8)) + 4, this.d, 196, 66, 4, 20);
      }
   }

   public boolean c(Minecraft var1, int var2, int var3) {
      if (super.c(var1, var2, var3)) {
         this.j = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
         if (this.j < 0.0F) {
            this.j = 0.0F;
         }

         if (this.j > 1.0F) {
            this.j = 1.0F;
         }

         var1.A.a(this.l, this.j);
         this.e = var1.A.c(this.l);
         this.k = true;
         return true;
      } else {
         return false;
      }
   }

   public void a(int var1, int var2) {
      this.k = false;
   }
}
