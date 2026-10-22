package net.minecraft.client;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class aak {
   private int a;
   private int b;
   private int c;
   private double d;
   private double e;
   private double f;
   private IntBuffer g = bt.d(65536);
   private boolean h = false;
   private boolean i = false;

   public void a(int var1, int var2, int var3, double var4, double var6, double var8) {
      this.h = true;
      this.g.clear();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var6;
      this.f = var8;
   }

   public boolean a(int var1, int var2, int var3) {
      if (!this.h) {
         return false;
      } else {
         return var1 == this.a && var2 == this.b && var3 == this.c;
      }
   }

   public void a(int var1) {
      this.g.put(var1);
      if (this.g.remaining() == 0) {
         this.a();
      }

   }

   public void a() {
      if (this.h) {
         if (!this.i) {
            this.g.flip();
            this.i = true;
         }

         if (this.g.remaining() > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((double)this.a - this.d), (float)((double)this.b - this.e), (float)((double)this.c - this.f));
            GL11.glCallLists(this.g);
            GL11.glPopMatrix();
         }

      }
   }

   public void b() {
      this.h = false;
      this.i = false;
   }
}
