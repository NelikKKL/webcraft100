package net.minecraft.client;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class fl extends xe {
   protected String a = "Edit sign message:";
   private u b;
   private int c;
   private int d = 0;
   private static final String e;

   public fl(u var1) {
      this.b = var1;
   }

   public void a() {
      this.o.clear();
      Keyboard.enableRepeatEvents(true);
      this.o.add(new ct(0, this.m / 2 - 100, this.n / 4 + 120, "Done"));
   }

   public void d() {
      Keyboard.enableRepeatEvents(false);
      if (this.l.f.I) {
         this.l.q().c(new hy(this.b.d, this.b.e, this.b.f, this.b.a));
      }

   }

   public void s_() {
      ++this.c;
   }

   protected void a(ct var1) {
      if (var1.g) {
         if (var1.f == 0) {
            this.b.h();
            this.l.a((xe)null);
         }

      }
   }

   protected void a(char var1, int var2) {
      if (var2 == 200) {
         this.d = this.d - 1 & 3;
      }

      if (var2 == 208 || var2 == 28) {
         this.d = this.d + 1 & 3;
      }

      if (var2 == 14 && this.b.a[this.d].length() > 0) {
         this.b.a[this.d] = this.b.a[this.d].substring(0, this.b.a[this.d].length() - 1);
      }

      if (e.indexOf(var1) >= 0 && this.b.a[this.d].length() < 15) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10002 = this.b.a;
         int var10004 = this.d;
         var10002[var10004] = var10000.append(var10002[var10004]).append(var1).toString();
      }

   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, this.a, this.m / 2, 40, 16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.m / 2), 0.0F, 50.0F);
      float var4 = 93.75F;
      GL11.glScalef(-var4, -var4, -var4);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      yy var5 = this.b.g();
      if (var5 == yy.aD) {
         float var6 = (float)(this.b.f() * 360) / 16.0F;
         GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      } else {
         int var8 = this.b.f();
         float var7 = 0.0F;
         if (var8 == 2) {
            var7 = 180.0F;
         }

         if (var8 == 4) {
            var7 = 90.0F;
         }

         if (var8 == 5) {
            var7 = -90.0F;
         }

         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      }

      if (this.c / 6 % 2 == 0) {
         this.b.b = this.d;
      }

      ah.a.a(this.b, (double)-0.5F, (double)-0.75F, (double)-0.5F, 0.0F);
      this.b.b = -1;
      GL11.glPopMatrix();
      super.a(var1, var2, var3);
   }

   static {
      e = age.a;
   }
}
