package net.minecraft.client;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class aec extends mg {
   private static bb g = new bb("tmp", 72);
   private float h = 0.0F;
   private boolean j = false;
   private boolean k;

   public aec(vi var1) {
      super(new afp(var1));
      var1.bA = this.d;
      this.p = true;
      var1.a((px)ut.f, 1);
      this.c = 208;
   }

   public void s_() {
      if (!this.l.c.g()) {
         this.l.a((xe)(new hw(this.l.h)));
      }

   }

   protected void a(vv var1, int var2, int var3, boolean var4) {
      if (var1 != null) {
         if (var1.c == g) {
            x var5 = this.l.h.by;
            dk var6 = var5.i();
            dk var7 = var1.b();
            if (var6 != null && var7 != null && var6.c == var7.c) {
               if (var3 == 0) {
                  if (var4) {
                     var6.a = var6.c();
                  } else if (var6.a < var6.c()) {
                     ++var6.a;
                  }
               } else if (var6.a <= 1) {
                  var5.b((dk)null);
               } else {
                  --var6.a;
               }
            } else if (var6 != null) {
               var5.b((dk)null);
            } else if (var7 == null) {
               var5.b((dk)null);
            } else if (var6 == null || var6.c != var7.c) {
               var5.b(dk.b(var7));
               var6 = var5.i();
               if (var4) {
                  var6.a = var6.c();
               }
            }
         } else {
            this.d.a(var1.d, var3, var4, this.l.h);
            dk var8 = this.d.b(var1.d).b();
            this.l.c.a(var8, var1.d - this.d.e.size() + 9 + 36);
         }
      } else {
         x var9 = this.l.h.by;
         if (var9.i() != null) {
            if (var3 == 0) {
               this.l.h.a((dk)var9.i());
               this.l.c.a(var9.i());
               var9.b((dk)null);
            }

            if (var3 == 1) {
               dk var11 = var9.i().a(1);
               this.l.h.a((dk)var11);
               this.l.c.a(var11);
               if (var9.i().a == 0) {
                  var9.b((dk)null);
               }
            }
         }
      }

   }

   public void a() {
      if (!this.l.c.g()) {
         this.l.a((xe)(new hw(this.l.h)));
      } else {
         super.a();
         this.o.clear();
      }

   }

   protected void c() {
      this.q.b("Item selection", 8, 6, 4210752);
   }

   public void h() {
      super.h();
      int var1 = Mouse.getEventDWheel();
      if (var1 != 0) {
         int var2 = ((afp)this.d).a.size() / 8 - 8 + 1;
         if (var1 > 0) {
            var1 = 1;
         }

         if (var1 < 0) {
            var1 = -1;
         }

         this.h = (float)((double)this.h - (double)var1 / (double)var2);
         if (this.h < 0.0F) {
            this.h = 0.0F;
         }

         if (this.h > 1.0F) {
            this.h = 1.0F;
         }

         ((afp)this.d).a(this.h);
      }

   }

   public void a(int var1, int var2, float var3) {
      boolean var4 = Mouse.isButtonDown(0);
      int var5 = this.e;
      int var6 = this.f;
      int var7 = var5 + 155;
      int var8 = var6 + 17;
      int var9 = var7 + 14;
      int var10 = var8 + 160 + 2;
      if (!this.k && var4 && var1 >= var7 && var2 >= var8 && var1 < var9 && var2 < var10) {
         this.j = true;
      }

      if (!var4) {
         this.j = false;
      }

      this.k = var4;
      if (this.j) {
         this.h = (float)(var2 - (var8 + 8)) / ((float)(var10 - var8) - 16.0F);
         if (this.h < 0.0F) {
            this.h = 0.0F;
         }

         if (this.h > 1.0F) {
            this.h = 1.0F;
         }

         ((afp)this.d).a(this.h);
      }

      super.a(var1, var2, var3);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
   }

   protected void a(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var4 = this.l.p.b("/gui/allitems.png");
      this.l.p.b(var4);
      int var5 = this.e;
      int var6 = this.f;
      this.b(var5, var6, 0, 0, this.b, this.c);
      int var7 = var5 + 155;
      int var8 = var6 + 17;
      int var9 = var8 + 160 + 2;
      this.b(var5 + 154, var6 + 17 + (int)((float)(var9 - var8 - 17) * this.h), 0, 208, 16, 16);
   }

   protected void a(ct var1) {
      if (var1.f == 0) {
         this.l.a((xe)(new qx(this.l.K)));
      }

      if (var1.f == 1) {
         this.l.a((xe)(new in(this, this.l.K)));
      }

   }

   // $FF: synthetic method
   static bb e() {
      return g;
   }
}
