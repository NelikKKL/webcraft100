package net.minecraft.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class lk extends ht {
   private Minecraft a;
   private int b;
   private int c;
   private String d;
   private String e;
   private ws f;
   private long g;
   private iw h;
   private boolean j;

   public lk(Minecraft var1) {
      this.a = var1;
      this.h = new iw();
   }

   public void a(ws var1) {
      this.d = hj.a("achievement.get");
      this.e = var1.b;
      this.g = System.currentTimeMillis();
      this.f = var1;
      this.j = false;
   }

   public void b(ws var1) {
      this.d = var1.b;
      this.e = var1.i();
      this.g = System.currentTimeMillis() - 2500L;
      this.f = var1;
      this.j = true;
   }

   private void b() {
      GL11.glViewport(0, 0, this.a.d, this.a.e);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      this.b = this.a.d;
      this.c = this.a.e;
      ef var1 = new ef(this.a.A, this.a.d, this.a.e);
      this.b = var1.a();
      this.c = var1.b();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho((double)0.0F, (double)this.b, (double)this.c, (double)0.0F, (double)1000.0F, (double)3000.0F);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   public void a() {
      if (this.f != null && this.g != 0L) {
         double var1 = (double)(System.currentTimeMillis() - this.g) / (double)3000.0F;
         if (this.j || this.j || !(var1 < (double)0.0F) && !(var1 > (double)1.0F)) {
            this.b();
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            double var3 = var1 * (double)2.0F;
            if (var3 > (double)1.0F) {
               var3 = (double)2.0F - var3;
            }

            var3 *= (double)4.0F;
            var3 = (double)1.0F - var3;
            if (var3 < (double)0.0F) {
               var3 = (double)0.0F;
            }

            var3 *= var3;
            var3 *= var3;
            int var5 = this.b - 160;
            int var6 = 0 - (int)(var3 * (double)36.0F);
            int var7 = this.a.p.b("/achievement/bg.png");
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3553);
            GL11.glBindTexture(3553, var7);
            GL11.glDisable(2896);
            this.b(var5, var6, 96, 202, 160, 32);
            if (this.j) {
               this.a.q.a(this.e, var5 + 30, var6 + 7, 120, -1);
            } else {
               this.a.q.b(this.d, var5 + 30, var6 + 7, -256);
               this.a.q.b(this.e, var5 + 30, var6 + 18, -1);
            }

            rt.c();
            GL11.glDisable(2896);
            GL11.glEnable(32826);
            GL11.glEnable(2903);
            GL11.glEnable(2896);
            this.h.a(this.a.q, this.a.p, this.f.k, var5 + 8, var6 + 8);
            GL11.glDisable(2896);
            GL11.glDepthMask(true);
            GL11.glEnable(2929);
         } else {
            this.g = 0L;
         }
      }
   }
}
