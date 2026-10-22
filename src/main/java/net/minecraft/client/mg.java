package net.minecraft.client;

import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class mg extends xe {
   protected static iw a = new iw();
   protected int b = 176;
   protected int c = 166;
   public pj d;
   protected int e;
   protected int f;

   public mg(pj var1) {
      this.d = var1;
   }

   public void a() {
      super.a();
      this.l.h.bA = this.d;
      this.e = (this.m - this.b) / 2;
      this.f = (this.n - this.c) / 2;
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      int var4 = this.e;
      int var5 = this.f;
      this.a(var3, var1, var2);
      rt.c();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var4, (float)var5, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(32826);
      vv var6 = null;
      short var7 = 240;
      short var8 = 240;
      adx.a(adx.b, (float)var7 / 1.0F, (float)var8 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

      for(int var20 = 0; var20 < this.d.e.size(); ++var20) {
         vv var22 = (vv)this.d.e.get(var20);
         this.a(var22);
         if (this.a(var22, var1, var2)) {
            var6 = var22;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int var9 = var22.e;
            int var10 = var22.f;
            this.a(var9, var10, var9 + 16, var10 + 16, -2130706433, -2130706433);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }
      }

      x var21 = this.l.h.by;
      if (var21.i() != null) {
         GL11.glTranslatef(0.0F, 0.0F, 32.0F);
         this.i = 200.0F;
         a.b = 200.0F;
         a.a(this.q, this.l.p, var21.i(), var1 - var4 - 8, var2 - var5 - 8);
         a.b(this.q, this.l.p, var21.i(), var1 - var4 - 8, var2 - var5 - 8);
         this.i = 0.0F;
         a.b = 0.0F;
      }

      GL11.glDisable(32826);
      rt.a();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.c();
      if (var21.i() == null && var6 != null && var6.c()) {
         dk var23 = var6.b();
         List var24 = var23.q();
         if (var24.size() > 0) {
            int var25 = 0;

            for(int var11 = 0; var11 < var24.size(); ++var11) {
               int var12 = this.q.a((String)var24.get(var11));
               if (var12 > var25) {
                  var25 = var12;
               }
            }

            int var26 = var1 - var4 + 12;
            int var27 = var2 - var5 - 12;
            int var14 = 8;
            if (var24.size() > 1) {
               var14 += 2 + (var24.size() - 1) * 10;
            }

            this.i = 300.0F;
            a.b = 300.0F;
            int var15 = -267386864;
            this.a(var26 - 3, var27 - 4, var26 + var25 + 3, var27 - 3, var15, var15);
            this.a(var26 - 3, var27 + var14 + 3, var26 + var25 + 3, var27 + var14 + 4, var15, var15);
            this.a(var26 - 3, var27 - 3, var26 + var25 + 3, var27 + var14 + 3, var15, var15);
            this.a(var26 - 4, var27 - 3, var26 - 3, var27 + var14 + 3, var15, var15);
            this.a(var26 + var25 + 3, var27 - 3, var26 + var25 + 4, var27 + var14 + 3, var15, var15);
            int var16 = 1347420415;
            int var17 = (var16 & 16711422) >> 1 | var16 & -16777216;
            this.a(var26 - 3, var27 - 3 + 1, var26 - 3 + 1, var27 + var14 + 3 - 1, var16, var17);
            this.a(var26 + var25 + 2, var27 - 3 + 1, var26 + var25 + 3, var27 + var14 + 3 - 1, var16, var17);
            this.a(var26 - 3, var27 - 3, var26 + var25 + 3, var27 - 3 + 1, var16, var16);
            this.a(var26 - 3, var27 + var14 + 2, var26 + var25 + 3, var27 + var14 + 3, var17, var17);

            for(int var18 = 0; var18 < var24.size(); ++var18) {
               String var19 = (String)var24.get(var18);
               if (var18 == 0) {
                  var19 = "§" + Integer.toHexString(var23.s().e) + var19;
               } else {
                  var19 = "§7" + var19;
               }

               this.q.a(var19, var26, var27, -1);
               if (var18 == 0) {
                  var27 += 2;
               }

               var27 += 10;
            }

            this.i = 0.0F;
            a.b = 0.0F;
         }
      }

      GL11.glPopMatrix();
      super.a(var1, var2, var3);
      GL11.glEnable(2896);
      GL11.glEnable(2929);
   }

   protected void c() {
   }

   protected abstract void a(float var1, int var2, int var3);

   private void a(vv var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      dk var4 = var1.b();
      boolean var5 = false;
      this.i = 100.0F;
      a.b = 100.0F;
      if (var4 == null) {
         int var8 = var1.e();
         if (var8 >= 0) {
            GL11.glDisable(2896);
            this.l.p.b(this.l.p.b("/gui/items.png"));
            this.b(var2, var3, var8 % 16 * 16, var8 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
            var5 = true;
         }
      }

      if (!var5) {
         a.a(this.q, this.l.p, var4, var2, var3);
         a.b(this.q, this.l.p, var4, var2, var3);
      }

      a.b = 0.0F;
      this.i = 0.0F;
      if (this == null) {
         this.i = 100.0F;
         a.b = 100.0F;
         if (var4 == null) {
            int var6 = var1.e();
            if (var6 >= 0) {
               GL11.glDisable(2896);
               this.l.p.b(this.l.p.b("/gui/items.png"));
               this.b(var2, var3, var6 % 16 * 16, var6 / 16 * 16, 16, 16);
               GL11.glEnable(2896);
               var5 = true;
            }
         }

         if (!var5) {
            a.a(this.q, this.l.p, var4, var2, var3);
            a.b(this.q, this.l.p, var4, var2, var3);
         }

         a.b = 0.0F;
         this.i = 0.0F;
      }

   }

   private vv a(int var1, int var2) {
      for(int var3 = 0; var3 < this.d.e.size(); ++var3) {
         vv var4 = (vv)this.d.e.get(var3);
         if (this.a(var4, var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var3 == 0 || var3 == 1) {
         vv var4 = this.a(var1, var2);
         int var5 = this.e;
         int var6 = this.f;
         boolean var7 = var1 < var5 || var2 < var6 || var1 >= var5 + this.b || var2 >= var6 + this.c;
         int var8 = -1;
         if (var4 != null) {
            var8 = var4.d;
         }

         if (var7) {
            var8 = -999;
         }

         if (var8 != -1) {
            boolean var9 = var8 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
            this.a(var4, var8, var3, var9);
         }
      }

   }

   private boolean a(vv var1, int var2, int var3) {
      int var4 = this.e;
      int var5 = this.f;
      var2 -= var4;
      var3 -= var5;
      return var2 >= var1.e - 1 && var2 < var1.e + 16 + 1 && var3 >= var1.f - 1 && var3 < var1.f + 16 + 1;
   }

   protected void a(vv var1, int var2, int var3, boolean var4) {
      if (var1 != null) {
         var2 = var1.d;
      }

      this.l.c.a(this.d.f, var2, var3, var4, this.l.h);
   }

   protected void b(int var1, int var2, int var3) {
      if (var3 == 0) {
      }

   }

   protected void a(char var1, int var2) {
      if (var2 == 1 || var2 == this.l.A.s.d) {
         this.l.h.m();
      }

   }

   public void d() {
      if (this.l.h != null) {
         this.d.b(this.l.h);
         this.l.c.a(this.d.f, this.l.h);
      }
   }

   public boolean b() {
      return false;
   }

   public void s_() {
      super.s_();
      if (!this.l.h.K() || this.l.h.K) {
         this.l.h.m();
      }

   }
}
