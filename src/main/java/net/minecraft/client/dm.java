package net.minecraft.client;

import net.minecraft.client.Minecraft;

public class dm extends aes {
   private int c = -1;
   private int d = -1;
   private int e = -1;
   private float f = 0.0F;
   private float g = 0.0F;
   private float h = 0.0F;
   private int i = 0;

   public dm(Minecraft var1) {
      super(var1);
   }

   public void a(vi var1) {
      var1.y = -180.0F;
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      int var5 = this.a.f.a(var1, var2, var3);
      int var6 = this.a.f.d(var1, var2, var3);
      boolean var7 = super.a(var1, var2, var3, var4);
      dk var8 = this.a.h.aH();
      boolean var9 = this.a.h.b((yy)yy.k[var5]);
      if (var8 != null) {
         var8.a(var5, var1, var2, var3, this.a.h);
         if (var8.a == 0) {
            var8.a((vi)this.a.h);
            this.a.h.aI();
         }
      }

      if (var7 && var9) {
         yy.k[var5].a(this.a.f, this.a.h, var1, var2, var3, var6);
      }

      return var7;
   }

   public void b(int var1, int var2, int var3, int var4) {
      if (this.a.h.e(var1, var2, var3)) {
         this.a.f.a((vi)this.a.h, var1, var2, var3, var4);
         int var5 = this.a.f.a(var1, var2, var3);
         if (var5 > 0 && this.f == 0.0F) {
            yy.k[var5].b(this.a.f, var1, var2, var3, (vi)this.a.h);
         }

         if (var5 > 0 && yy.k[var5].a((vi)this.a.h) >= 1.0F) {
            this.a(var1, var2, var3, var4);
         }

      }
   }

   public void b() {
      this.f = 0.0F;
      this.i = 0;
   }

   public void c(int var1, int var2, int var3, int var4) {
      if (this.i > 0) {
         --this.i;
      } else {
         if (var1 == this.c && var2 == this.d && var3 == this.e) {
            int var5 = this.a.f.a(var1, var2, var3);
            if (!this.a.h.e(var1, var2, var3)) {
               return;
            }

            if (var5 == 0) {
               return;
            }

            yy var6 = yy.k[var5];
            this.f += var6.a((vi)this.a.h);
            if (this.h % 4.0F == 0.0F && var6 != null) {
               this.a.C.b(var6.bX.d(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.bX.b() + 1.0F) / 8.0F, var6.bX.c() * 0.5F);
            }

            ++this.h;
            if (this.f >= 1.0F) {
               this.a(var1, var2, var3, var4);
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 0.0F;
               this.i = 5;
            }
         } else {
            this.f = 0.0F;
            this.g = 0.0F;
            this.h = 0.0F;
            this.c = var1;
            this.d = var2;
            this.e = var3;
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
      return 4.0F;
   }

   public void a(ry var1) {
      super.a(var1);
   }

   public vi b(ry var1) {
      vi var2 = super.b(var1);
      return var2;
   }

   public void d() {
      this.g = this.f;
      this.a.C.c();
   }

   public boolean a(vi var1, ry var2, dk var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.a(var4, var5, var6);
      if (var8 > 0 && yy.k[var8].a(var2, var4, var5, var6, var1)) {
         return true;
      } else {
         return var3 == null ? false : var3.a(var1, var2, var4, var5, var6, var7);
      }
   }

   public boolean e() {
      return true;
   }
}
