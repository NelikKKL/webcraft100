package net.minecraft.client;

import net.minecraft.client.Minecraft;

public class zn extends aes {
   private int c = -1;
   private int d = -1;
   private int e = -1;
   private float f = 0.0F;
   private float g = 0.0F;
   private float h = 0.0F;
   private int i = 0;
   private boolean j = false;
   private boolean k;
   private abp l;
   private int m = 0;

   public zn(Minecraft var1, abp var2) {
      super(var1);
      this.l = var2;
   }

   public void a(boolean var1) {
      this.k = var1;
      if (this.k) {
         uq.b(this.a.h);
      } else {
         uq.c(this.a.h);
      }

   }

   public void a(vi var1) {
      var1.y = -180.0F;
   }

   public boolean a() {
      return !this.k;
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      if (this.k) {
         return super.a(var1, var2, var3, var4);
      } else {
         int var5 = this.a.f.a(var1, var2, var3);
         boolean var6 = super.a(var1, var2, var3, var4);
         dk var7 = this.a.h.aH();
         if (var7 != null) {
            var7.a(var5, var1, var2, var3, this.a.h);
            if (var7.a == 0) {
               var7.a((vi)this.a.h);
               this.a.h.aI();
            }
         }

         return var6;
      }
   }

   public void b(int var1, int var2, int var3, int var4) {
      if (this.k) {
         this.l.c(new sm(0, var1, var2, var3, var4));
         uq.a(this.a, this, var1, var2, var3, var4);
         this.i = 5;
      } else if (!this.j || var1 != this.c || var2 != this.d || var3 != this.e) {
         this.l.c(new sm(0, var1, var2, var3, var4));
         int var5 = this.a.f.a(var1, var2, var3);
         if (var5 > 0 && this.f == 0.0F) {
            yy.k[var5].b(this.a.f, var1, var2, var3, (vi)this.a.h);
         }

         if (var5 > 0 && yy.k[var5].a((vi)this.a.h) >= 1.0F) {
            this.a(var1, var2, var3, var4);
         } else {
            this.j = true;
            this.c = var1;
            this.d = var2;
            this.e = var3;
            this.f = 0.0F;
            this.g = 0.0F;
            this.h = 0.0F;
         }
      }

   }

   public void b() {
      this.f = 0.0F;
      this.j = false;
   }

   public void c(int var1, int var2, int var3, int var4) {
      this.j();
      if (this.i > 0) {
         --this.i;
      } else if (this.k) {
         this.i = 5;
         this.l.c(new sm(0, var1, var2, var3, var4));
         uq.a(this.a, this, var1, var2, var3, var4);
      } else {
         if (var1 == this.c && var2 == this.d && var3 == this.e) {
            int var5 = this.a.f.a(var1, var2, var3);
            if (var5 == 0) {
               this.j = false;
               return;
            }

            yy var6 = yy.k[var5];
            this.f += var6.a((vi)this.a.h);
            if (this.h % 4.0F == 0.0F && var6 != null) {
               this.a.C.b(var6.bX.d(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.bX.b() + 1.0F) / 8.0F, var6.bX.c() * 0.5F);
            }

            ++this.h;
            if (this.f >= 1.0F) {
               this.j = false;
               this.l.c(new sm(2, var1, var2, var3, var4));
               this.a(var1, var2, var3, var4);
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 0.0F;
               this.i = 5;
            }
         } else {
            this.b(var1, var2, var3, var4);
         }

      }
   }

   public void a(float var1) {
      if (this.f <= 0.0F) {
         this.a.w.b = 0.0F;
         this.a.g.g = 0.0F;
      } else {
         float var2 = this.g + (this.f - this.g) * var1;
         this.a.w.b = var2;
         this.a.g.g = var2;
      }

   }

   public float c() {
      return this.k ? 5.0F : 4.5F;
   }

   public void a(ry var1) {
      super.a(var1);
   }

   public void d() {
      this.j();
      this.g = this.f;
      this.a.C.c();
   }

   private void j() {
      int var1 = this.a.h.by.c;
      if (var1 != this.m) {
         this.m = var1;
         this.l.c(new aio(this.m));
      }

   }

   public boolean a(vi var1, ry var2, dk var3, int var4, int var5, int var6, int var7) {
      this.j();
      this.l.c(new em(var4, var5, var6, var7, var1.by.a()));
      int var8 = var2.a(var4, var5, var6);
      if (var8 > 0 && yy.k[var8].a(var2, var4, var5, var6, var1)) {
         return true;
      } else if (var3 == null) {
         return false;
      } else if (this.k) {
         int var9 = var3.i();
         int var10 = var3.a;
         boolean var11 = var3.a(var1, var2, var4, var5, var6, var7);
         var3.b(var9);
         var3.a = var10;
         return var11;
      } else {
         return var3.a(var1, var2, var4, var5, var6, var7);
      }
   }

   public boolean a(vi var1, ry var2, dk var3) {
      this.j();
      this.l.c(new em(-1, -1, -1, 255, var1.by.a()));
      boolean var4 = super.a(var1, var2, var3);
      return var4;
   }

   public vi b(ry var1) {
      return new cx(this.a, var1, this.a.k, this.l);
   }

   public void a(vi var1, ia var2) {
      this.j();
      this.l.c(new zm(var1.j, var2.j, 1));
      var1.k(var2);
   }

   public void b(vi var1, ia var2) {
      this.j();
      this.l.c(new zm(var1.j, var2.j, 0));
      var1.j(var2);
   }

   public dk a(int var1, int var2, int var3, boolean var4, vi var5) {
      short var6 = var5.bA.a(var5.by);
      dk var7 = super.a(var1, var2, var3, var4, var5);
      this.l.c(new aa(var1, var2, var3, var4, var7, var6));
      return var7;
   }

   public void a(int var1, int var2) {
      this.l.c(new acv(var1, var2));
   }

   public void a(dk var1, int var2) {
      if (this.k) {
         this.l.c(new dg(var2, var1));
      }

   }

   public void a(dk var1) {
      if (this.k && var1 != null) {
         this.l.c(new dg(-1, var1));
      }

   }

   public void a(int var1, vi var2) {
      if (var1 != -9999) {
         ;
      }
   }

   public void a_(vi var1) {
      this.j();
      this.l.c(new sm(5, 0, 0, 0, 255));
      super.a_(var1);
   }

   public boolean e() {
      return true;
   }

   public boolean f() {
      return !this.k;
   }

   public boolean g() {
      return this.k;
   }

   public boolean h() {
      return this.k;
   }
}
