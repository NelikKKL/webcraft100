package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class xw implements rz {
   private String a = "";
   private Minecraft b;
   private String c = "";
   private long d = System.currentTimeMillis();
   private boolean e = false;

   public xw(Minecraft var1) {
      this.b = var1;
   }

   public void c(String var1) {
      this.e = false;
      this.d(var1);
   }

   public void a(String var1) {
      this.e = true;
      this.d(this.c);
   }

   public void d(String var1) {
      if (!this.b.L) {
         if (!this.e) {
            throw new adj();
         }
      } else {
         this.c = var1;
         ef var2 = new ef(this.b.A, this.b.d, this.b.e);
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         GL11.glOrtho((double)0.0F, var2.a, var2.b, (double)0.0F, (double)100.0F, (double)300.0F);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      }
   }

   public void b(String var1) {
      if (!this.b.L) {
         if (!this.e) {
            throw new adj();
         }
      } else {
         this.d = 0L;
         this.a = var1;
         this.a(-1);
         this.d = 0L;
      }
   }

   public void a(int var1) {
      if (!this.b.L) {
         if (!this.e) {
            throw new adj();
         }
      } else {
         long var2 = System.currentTimeMillis();
         if (var2 - this.d >= 20L) {
            this.d = var2;
            ef var4 = new ef(this.b.A, this.b.d, this.b.e);
            int var5 = var4.a();
            int var6 = var4.b();
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0F, var4.a, var4.b, (double)0.0F, (double)100.0F, (double)300.0F);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -200.0F);
            GL11.glClear(16640);
            cv var7 = cv.a;
            int var8 = this.b.p.b("/gui/background.png");
            GL11.glBindTexture(3553, var8);
            float var9 = 32.0F;
            var7.b();
            var7.c(4210752);
            var7.a((double)0.0F, (double)var6, (double)0.0F, (double)0.0F, (double)((float)var6 / var9));
            var7.a((double)var5, (double)var6, (double)0.0F, (double)((float)var5 / var9), (double)((float)var6 / var9));
            var7.a((double)var5, (double)0.0F, (double)0.0F, (double)((float)var5 / var9), (double)0.0F);
            var7.a((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F);
            var7.a();
            if (var1 >= 0) {
               byte var10 = 100;
               byte var11 = 2;
               int var12 = var5 / 2 - var10 / 2;
               int var13 = var6 / 2 + 16;
               GL11.glDisable(3553);
               var7.b();
               var7.c(8421504);
               var7.a((double)var12, (double)var13, (double)0.0F);
               var7.a((double)var12, (double)(var13 + var11), (double)0.0F);
               var7.a((double)(var12 + var10), (double)(var13 + var11), (double)0.0F);
               var7.a((double)(var12 + var10), (double)var13, (double)0.0F);
               var7.c(8454016);
               var7.a((double)var12, (double)var13, (double)0.0F);
               var7.a((double)var12, (double)(var13 + var11), (double)0.0F);
               var7.a((double)(var12 + var1), (double)(var13 + var11), (double)0.0F);
               var7.a((double)(var12 + var1), (double)var13, (double)0.0F);
               var7.a();
               GL11.glEnable(3553);
            }

            this.b.q.a(this.c, (var5 - this.b.q.a(this.c)) / 2, var6 / 2 - 4 - 16, 16777215);
            this.b.q.a(this.a, (var5 - this.b.q.a(this.a)) / 2, var6 / 2 - 4 + 8, 16777215);
            Display.update();

            try {
               Thread.yield();
            } catch (Exception var14) {
            }

         }
      }
   }
}
