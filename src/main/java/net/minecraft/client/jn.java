package net.minecraft.client;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class jn {
   private final Minecraft a;
   private final int g;
   private final int h;
   protected final int b;
   protected final int c;
   private final int i;
   private final int j;
   protected final int d;
   private int k;
   private int l;
   protected int e;
   protected int f;
   private float m = -2.0F;
   private float n;
   private float o;
   private int p = -1;
   private long q = 0L;
   private boolean r = true;
   private boolean s;
   private int t;

   public jn(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.g = var2;
      this.h = var3;
      this.b = var4;
      this.c = var5;
      this.d = var6;
      this.j = 0;
      this.i = var2;
   }

   public void a(boolean var1) {
      this.r = var1;
   }

   protected void a(boolean var1, int var2) {
      this.s = var1;
      this.t = var2;
      if (!var1) {
         this.t = 0;
      }

   }

   protected abstract int a();

   protected abstract void a(int var1, boolean var2);

   protected abstract boolean a(int var1);

   protected int b() {
      return this.a() * this.d + this.t;
   }

   protected abstract void c();

   protected abstract void a(int var1, int var2, int var3, int var4, cv var5);

   protected void a(int var1, int var2, cv var3) {
   }

   protected void a(int var1, int var2) {
   }

   protected void b(int var1, int var2) {
   }

   public int c(int var1, int var2) {
      int var3 = this.g / 2 - 110;
      int var4 = this.g / 2 + 110;
      int var5 = var2 - this.b - this.t + (int)this.o - 4;
      int var6 = var5 / this.d;
      return var1 >= var3 && var1 <= var4 && var6 >= 0 && var5 >= 0 && var6 < this.a() ? var6 : -1;
   }

   public void a(List var1, int var2, int var3) {
      this.k = var2;
      this.l = var3;
   }

   private void d() {
      int var1 = this.b() - (this.c - this.b - 4);
      if (var1 < 0) {
         var1 /= 2;
      }

      if (this.o < 0.0F) {
         this.o = 0.0F;
      }

      if (this.o > (float)var1) {
         this.o = (float)var1;
      }

   }

   public void a(ct var1) {
      if (var1.g) {
         if (var1.f == this.k) {
            this.o -= (float)(this.d * 2 / 3);
            this.m = -2.0F;
            this.d();
         } else if (var1.f == this.l) {
            this.o += (float)(this.d * 2 / 3);
            this.m = -2.0F;
            this.d();
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.e = var1;
      this.f = var2;
      this.c();
      int var4 = this.a();
      int var5 = this.g / 2 + 124;
      int var6 = var5 + 6;
      if (Mouse.isButtonDown(0)) {
         if (this.m == -1.0F) {
            boolean var16 = true;
            if (var2 >= this.b && var2 <= this.c) {
               int var8 = this.g / 2 - 110;
               int var9 = this.g / 2 + 110;
               int var10 = var2 - this.b - this.t + (int)this.o - 4;
               int var11 = var10 / this.d;
               if (var1 >= var8 && var1 <= var9 && var11 >= 0 && var10 >= 0 && var11 < var4) {
                  boolean var12 = var11 == this.p && System.currentTimeMillis() - this.q < 250L;
                  this.a(var11, var12);
                  this.p = var11;
                  this.q = System.currentTimeMillis();
               } else if (var1 >= var8 && var1 <= var9 && var10 < 0) {
                  this.a(var1 - var8, var2 - this.b + (int)this.o - 4);
                  var16 = false;
               }

               if (var1 >= var5 && var1 <= var6) {
                  this.n = -1.0F;
                  int var23 = this.b() - (this.c - this.b - 4);
                  if (var23 < 1) {
                     var23 = 1;
                  }

                  int var13 = (int)((float)((this.c - this.b) * (this.c - this.b)) / (float)this.b());
                  if (var13 < 32) {
                     var13 = 32;
                  }

                  if (var13 > this.c - this.b - 8) {
                     var13 = this.c - this.b - 8;
                  }

                  this.n /= (float)(this.c - this.b - var13) / (float)var23;
               } else {
                  this.n = 1.0F;
               }

               if (var16) {
                  this.m = (float)var2;
               } else {
                  this.m = -2.0F;
               }
            } else {
               this.m = -2.0F;
            }
         } else if (this.m >= 0.0F) {
            this.o -= ((float)var2 - this.m) * this.n;
            this.m = (float)var2;
         }
      } else {
         while(Mouse.next()) {
            int var7 = Mouse.getEventDWheel();
            if (var7 != 0) {
               if (var7 > 0) {
                  var7 = -1;
               } else if (var7 < 0) {
                  var7 = 1;
               }

               this.o += (float)(var7 * this.d / 2);
            }
         }

         this.m = -1.0F;
      }

      this.d();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      cv var17 = cv.a;
      GL11.glBindTexture(3553, this.a.p.b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var18 = 32.0F;
      var17.b();
      var17.c(2105376);
      var17.a((double)this.j, (double)this.c, (double)0.0F, (double)((float)this.j / var18), (double)((float)(this.c + (int)this.o) / var18));
      var17.a((double)this.i, (double)this.c, (double)0.0F, (double)((float)this.i / var18), (double)((float)(this.c + (int)this.o) / var18));
      var17.a((double)this.i, (double)this.b, (double)0.0F, (double)((float)this.i / var18), (double)((float)(this.b + (int)this.o) / var18));
      var17.a((double)this.j, (double)this.b, (double)0.0F, (double)((float)this.j / var18), (double)((float)(this.b + (int)this.o) / var18));
      var17.a();
      int var19 = this.g / 2 - 92 - 16;
      int var20 = this.b + 4 - (int)this.o;
      if (this.s) {
         this.a(var19, var20, var17);
      }

      for(int var21 = 0; var21 < var4; ++var21) {
         int var24 = var20 + var21 * this.d + this.t;
         int var26 = this.d - 4;
         if (var24 <= this.c && var24 + var26 >= this.b) {
            if (this.r && this.a(var21)) {
               int var14 = this.g / 2 - 110;
               int var15 = this.g / 2 + 110;
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glDisable(3553);
               var17.b();
               var17.c(8421504);
               var17.a((double)var14, (double)(var24 + var26 + 2), (double)0.0F, (double)0.0F, (double)1.0F);
               var17.a((double)var15, (double)(var24 + var26 + 2), (double)0.0F, (double)1.0F, (double)1.0F);
               var17.a((double)var15, (double)(var24 - 2), (double)0.0F, (double)1.0F, (double)0.0F);
               var17.a((double)var14, (double)(var24 - 2), (double)0.0F, (double)0.0F, (double)0.0F);
               var17.c(0);
               var17.a((double)(var14 + 1), (double)(var24 + var26 + 1), (double)0.0F, (double)0.0F, (double)1.0F);
               var17.a((double)(var15 - 1), (double)(var24 + var26 + 1), (double)0.0F, (double)1.0F, (double)1.0F);
               var17.a((double)(var15 - 1), (double)(var24 - 1), (double)0.0F, (double)1.0F, (double)0.0F);
               var17.a((double)(var14 + 1), (double)(var24 - 1), (double)0.0F, (double)0.0F, (double)0.0F);
               var17.a();
               GL11.glEnable(3553);
            }

            this.a(var21, var19, var24, var26, var17);
         }
      }

      GL11.glDisable(2929);
      byte var22 = 4;
      this.a(0, this.b, 255, 255);
      this.a(this.c, this.h, 255, 255);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      var17.b();
      var17.a(0, 0);
      var17.a((double)this.j, (double)(this.b + var22), (double)0.0F, (double)0.0F, (double)1.0F);
      var17.a((double)this.i, (double)(this.b + var22), (double)0.0F, (double)1.0F, (double)1.0F);
      var17.a(0, 255);
      var17.a((double)this.i, (double)this.b, (double)0.0F, (double)1.0F, (double)0.0F);
      var17.a((double)this.j, (double)this.b, (double)0.0F, (double)0.0F, (double)0.0F);
      var17.a();
      var17.b();
      var17.a(0, 255);
      var17.a((double)this.j, (double)this.c, (double)0.0F, (double)0.0F, (double)1.0F);
      var17.a((double)this.i, (double)this.c, (double)0.0F, (double)1.0F, (double)1.0F);
      var17.a(0, 0);
      var17.a((double)this.i, (double)(this.c - var22), (double)0.0F, (double)1.0F, (double)0.0F);
      var17.a((double)this.j, (double)(this.c - var22), (double)0.0F, (double)0.0F, (double)0.0F);
      var17.a();
      int var25 = this.b() - (this.c - this.b - 4);
      if (var25 > 0) {
         int var27 = (this.c - this.b) * (this.c - this.b) / this.b();
         if (var27 < 32) {
            var27 = 32;
         }

         if (var27 > this.c - this.b - 8) {
            var27 = this.c - this.b - 8;
         }

         int var28 = (int)this.o * (this.c - this.b - var27) / var25 + this.b;
         if (var28 < this.b) {
            var28 = this.b;
         }

         var17.b();
         var17.a(0, 255);
         var17.a((double)var5, (double)this.c, (double)0.0F, (double)0.0F, (double)1.0F);
         var17.a((double)var6, (double)this.c, (double)0.0F, (double)1.0F, (double)1.0F);
         var17.a((double)var6, (double)this.b, (double)0.0F, (double)1.0F, (double)0.0F);
         var17.a((double)var5, (double)this.b, (double)0.0F, (double)0.0F, (double)0.0F);
         var17.a();
         var17.b();
         var17.a(8421504, 255);
         var17.a((double)var5, (double)(var28 + var27), (double)0.0F, (double)0.0F, (double)1.0F);
         var17.a((double)var6, (double)(var28 + var27), (double)0.0F, (double)1.0F, (double)1.0F);
         var17.a((double)var6, (double)var28, (double)0.0F, (double)1.0F, (double)0.0F);
         var17.a((double)var5, (double)var28, (double)0.0F, (double)0.0F, (double)0.0F);
         var17.a();
         var17.b();
         var17.a(12632256, 255);
         var17.a((double)var5, (double)(var28 + var27 - 1), (double)0.0F, (double)0.0F, (double)1.0F);
         var17.a((double)(var6 - 1), (double)(var28 + var27 - 1), (double)0.0F, (double)1.0F, (double)1.0F);
         var17.a((double)(var6 - 1), (double)var28, (double)0.0F, (double)1.0F, (double)0.0F);
         var17.a((double)var5, (double)var28, (double)0.0F, (double)0.0F, (double)0.0F);
         var17.a();
      }

      this.b(var1, var2);
      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   private void a(int var1, int var2, int var3, int var4) {
      cv var5 = cv.a;
      GL11.glBindTexture(3553, this.a.p.b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.b();
      var5.a(4210752, var4);
      var5.a((double)0.0F, (double)var2, (double)0.0F, (double)0.0F, (double)((float)var2 / var6));
      var5.a((double)this.g, (double)var2, (double)0.0F, (double)((float)this.g / var6), (double)((float)var2 / var6));
      var5.a(4210752, var3);
      var5.a((double)this.g, (double)var1, (double)0.0F, (double)((float)this.g / var6), (double)((float)var1 / var6));
      var5.a((double)0.0F, (double)var1, (double)0.0F, (double)0.0F, (double)((float)var1 / var6));
      var5.a();
   }
}
