package net.minecraft.client;

import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class zw extends mg {
   private static uj w = new uj();
   private Random x = new Random();
   private ahk y;
   public int g;
   public float h;
   public float j;
   public float k;
   public float s;
   public float t;
   public float u;
   dk v;

   public zw(x var1, ry var2, int var3, int var4, int var5) {
      super(new ahk(var1, var2, var3, var4, var5));
      this.y = (ahk)this.d;
   }

   public void d() {
      super.d();
   }

   protected void c() {
      this.q.b("Enchant", 12, 6, 4210752);
      this.q.b("Inventory", 8, this.c - 96 + 2, 4210752);
   }

   public void s_() {
      super.s_();
      this.e();
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      int var4 = (this.m - this.b) / 2;
      int var5 = (this.n - this.c) / 2;

      for(int var6 = 0; var6 < 3; ++var6) {
         int var7 = var1 - (var4 + 60);
         int var8 = var2 - (var5 + 14 + 19 * var6);
         if (var7 >= 0 && var8 >= 0 && var7 < 108 && var8 < 19 && this.y.a(this.l.h, var6)) {
            this.l.c.a(this.y.f, var6);
         }
      }

   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.l.p.b("/gui/enchant.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var4);
      int var5 = (this.m - this.b) / 2;
      int var6 = (this.n - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.c);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      ef var7 = new ef(this.l.A, this.l.d, this.l.e);
      GL11.glViewport((var7.a() - 320) / 2 * var7.c, (var7.b() - 240) / 2 * var7.c, 320 * var7.c, 240 * var7.c);
      GL11.glTranslatef(-0.34F, 0.23F, 0.0F);
      GLU.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
      float var8 = 1.0F;
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      rt.b();
      GL11.glTranslatef(0.0F, 3.3F, -16.0F);
      GL11.glScalef(var8, var8, var8);
      float var9 = 5.0F;
      GL11.glScalef(var9, var9, var9);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      this.l.p.b(this.l.p.b("/item/book.png"));
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      float var10 = this.u + (this.t - this.u) * var1;
      GL11.glTranslatef((1.0F - var10) * 0.2F, (1.0F - var10) * 0.1F, (1.0F - var10) * 0.25F);
      GL11.glRotatef(-(1.0F - var10) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      float var11 = this.j + (this.h - this.j) * var1 + 0.25F;
      float var12 = this.j + (this.h - this.j) * var1 + 0.75F;
      var11 = (var11 - (float)me.b((double)var11)) * 1.6F - 0.3F;
      var12 = (var12 - (float)me.b((double)var12)) * 1.6F - 0.3F;
      if (var11 < 0.0F) {
         var11 = 0.0F;
      }

      if (var12 < 0.0F) {
         var12 = 0.0F;
      }

      if (var11 > 1.0F) {
         var11 = 1.0F;
      }

      if (var12 > 1.0F) {
         var12 = 1.0F;
      }

      GL11.glEnable(32826);
      w.a((ia)null, 0.0F, var11, var12, var10, 0.0F, 0.0625F);
      GL11.glDisable(32826);
      rt.a();
      GL11.glMatrixMode(5889);
      GL11.glViewport(0, 0, this.l.d, this.l.e);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      rt.a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.l.p.b(var4);
      ea.a.a(this.y.b);

      for(int var13 = 0; var13 < 3; ++var13) {
         String var14 = ea.a.a();
         this.i = 0.0F;
         this.l.p.b(var4);
         int var15 = this.y.c[var13];
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         if (var15 == 0) {
            this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
         } else {
            String var16 = "" + var15;
            abe var17 = this.l.r;
            int var18 = 6839882;
            if (this.l.h.cd < var15) {
               this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
               var17.a(var14, var5 + 62, var6 + 16 + 19 * var13, 104, (var18 & 16711422) >> 1);
               var17 = this.l.q;
               var18 = 4226832;
               var17.a(var16, var5 + 62 + 104 - var17.a(var16), var6 + 16 + 19 * var13 + 7, var18);
            } else {
               int var19 = var2 - (var5 + 60);
               int var20 = var3 - (var6 + 14 + 19 * var13);
               if (var19 >= 0 && var20 >= 0 && var19 < 108 && var20 < 19) {
                  this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 204, 108, 19);
                  var18 = 16777088;
               } else {
                  this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 166, 108, 19);
               }

               var17.a(var14, var5 + 62, var6 + 16 + 19 * var13, 104, var18);
               var17 = this.l.q;
               var18 = 8453920;
               var17.a(var16, var5 + 62 + 104 - var17.a(var16), var6 + 16 + 19 * var13 + 7, var18);
            }
         }
      }

   }

   public void e() {
      dk var1 = this.d.b((int)0).b();
      if (!dk.a(var1, this.v)) {
         this.v = var1;

         do {
            this.k += (float)(this.x.nextInt(4) - this.x.nextInt(4));
         } while(this.h <= this.k + 1.0F && this.h >= this.k - 1.0F);
      }

      ++this.g;
      this.j = this.h;
      this.u = this.t;
      boolean var2 = false;

      for(int var3 = 0; var3 < 3; ++var3) {
         if (this.y.c[var3] != 0) {
            var2 = true;
         }
      }

      if (var2) {
         this.t += 0.2F;
      } else {
         this.t -= 0.2F;
      }

      if (this.t < 0.0F) {
         this.t = 0.0F;
      }

      if (this.t > 1.0F) {
         this.t = 1.0F;
      }

      float var5 = (this.k - this.h) * 0.4F;
      float var4 = 0.2F;
      if (var5 < -var4) {
         var5 = -var4;
      }

      if (var5 > var4) {
         var5 = var4;
      }

      this.s += (var5 - this.s) * 0.9F;
      this.h += this.s;
   }
}
