package net.minecraft.client;

import java.util.Collection;
import org.lwjgl.opengl.GL11;

public class hw extends mg {
   private float g;
   private float h;

   public hw(vi var1) {
      super(var1.bz);
      this.p = true;
      var1.a((px)ut.f, 1);
   }

   public void s_() {
      if (this.l.c.g()) {
         this.l.a((xe)(new aec(this.l.h)));
      }

   }

   public void a() {
      this.o.clear();
      if (this.l.c.g()) {
         this.l.a((xe)(new aec(this.l.h)));
      } else {
         super.a();
         if (!this.l.h.au().isEmpty()) {
            this.e = 160 + (this.m - this.b - 200) / 2;
         }
      }

   }

   protected void c() {
      this.q.b("Crafting", 86, 16, 4210752);
   }

   public void a(int var1, int var2, float var3) {
      super.a(var1, var2, var3);
      this.g = (float)var1;
      this.h = (float)var2;
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.l.p.b("/gui/inventory.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var4);
      int var5 = this.e;
      int var6 = this.f;
      this.b(var5, var6, 0, 0, this.b, this.c);
      this.e();
      GL11.glEnable(32826);
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var5 + 51), (float)(var6 + 75), 50.0F);
      float var7 = 30.0F;
      GL11.glScalef(-var7, var7, var7);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var8 = this.l.h.at;
      float var9 = this.l.h.y;
      float var10 = this.l.h.z;
      float var11 = (float)(var5 + 51) - this.g;
      float var12 = (float)(var6 + 75 - 50) - this.h;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      rt.b();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(var12 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      this.l.h.at = (float)Math.atan((double)(var11 / 40.0F)) * 20.0F;
      this.l.h.y = (float)Math.atan((double)(var11 / 40.0F)) * 40.0F;
      this.l.h.z = -((float)Math.atan((double)(var12 / 40.0F))) * 20.0F;
      GL11.glTranslatef(0.0F, this.l.h.L, 0.0F);
      wb.a.i = 180.0F;
      wb.a.a(this.l.h, (double)0.0F, (double)0.0F, (double)0.0F, 0.0F, 1.0F);
      this.l.h.at = var8;
      this.l.h.y = var9;
      this.l.h.z = var10;
      GL11.glPopMatrix();
      rt.a();
      GL11.glDisable(32826);
   }

   protected void a(ct var1) {
      if (var1.f == 0) {
         this.l.a((xe)(new qx(this.l.K)));
      }

      if (var1.f == 1) {
         this.l.a((xe)(new in(this, this.l.K)));
      }

   }

   private void e() {
      int var1 = this.e - 124;
      int var2 = this.f;
      int var3 = this.l.p.b("/gui/inventory.png");
      Collection var4 = this.l.h.au();
      if (!var4.isEmpty()) {
         int var5 = 33;
         if (var4.size() > 5) {
            var5 = 132 / (var4.size() - 1);
         }

         for(s var7 : (Iterable<s>)(Iterable)(this.l.h.au())) {
            abg var8 = abg.a[var7.a()];
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.l.p.b(var3);
            this.b(var1, var2, 0, this.c, 140, 32);
            if (var8.d()) {
               int var9 = var8.e();
               this.b(var1 + 6, var2 + 7, 0 + var9 % 8 * 18, this.c + 32 + var9 / 8 * 18, 18, 18);
            }

            String var11 = hj.a(var8.c());
            if (var7.c() > 0) {
               var11 = var11 + " " + hj.a("potion.potency." + var7.c());
            }

            this.q.a(var11, var1 + 10 + 18, var2 + 6, 16777215);
            String var10 = abg.a(var7);
            this.q.a(var10, var1 + 10 + 18, var2 + 6 + 10, 8355711);
            var2 += var5;
         }

      }
   }
}
