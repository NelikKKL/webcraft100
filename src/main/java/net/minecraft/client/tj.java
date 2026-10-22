package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class tj extends ia {
   private int f;
   public int a;
   public int b;
   public int c;
   public int d;
   public sv e;

   public tj(ry var1) {
      super(var1);
      this.f = 0;
      this.a = 0;
      this.L = 0.0F;
      this.a(0.5F, 0.5F);
   }

   public tj(ry var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
      ArrayList var6 = new ArrayList();

      for(sv var10 : sv.values()) {
         this.e = var10;
         this.b(var5);
         if (this.g()) {
            var6.add(var10);
         }
      }

      if (var6.size() > 0) {
         this.e = (sv)var6.get(this.Y.nextInt(var6.size()));
      }

      this.b(var5);
   }

   public tj(ry var1, int var2, int var3, int var4, int var5, String var6) {
      this(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;

      for(sv var10 : sv.values()) {
         if (var10.A.equals(var6)) {
            this.e = var10;
            break;
         }
      }

      this.b(var5);
   }

   protected void b() {
   }

   public void b(int var1) {
      this.a = var1;
      this.A = this.y = (float)(var1 * 90);
      float var2 = (float)this.e.B;
      float var3 = (float)this.e.C;
      float var4 = (float)this.e.B;
      if (var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.b + 0.5F;
      float var6 = (float)this.c + 0.5F;
      float var7 = (float)this.d + 0.5F;
      float var8 = 0.5625F;
      if (var1 == 0) {
         var7 -= var8;
      }

      if (var1 == 1) {
         var5 -= var8;
      }

      if (var1 == 2) {
         var7 += var8;
      }

      if (var1 == 3) {
         var5 += var8;
      }

      if (var1 == 0) {
         var5 -= this.c(this.e.B);
      }

      if (var1 == 1) {
         var7 += this.c(this.e.B);
      }

      if (var1 == 2) {
         var5 += this.c(this.e.B);
      }

      if (var1 == 3) {
         var7 -= this.c(this.e.B);
      }

      var6 += this.c(this.e.C);
      this.d((double)var5, (double)var6, (double)var7);
      float var9 = -0.00625F;
      this.C.c((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float c(int var1) {
      if (var1 == 32) {
         return 0.5F;
      } else {
         return var1 == 64 ? 0.5F : 0.0F;
      }
   }

   public void a() {
      if (this.f++ == 100 && !this.o.I) {
         this.f = 0;
         if (!this.g()) {
            this.v();
            this.o.a((ia)(new ih(this.o, this.s, this.t, this.u, new dk(acy.ar))));
         }
      }

   }

   public boolean g() {
      if (this.o.a((ia)this, (c)this.C).size() > 0) {
         return false;
      } else {
         int var1 = this.e.B / 16;
         int var2 = this.e.C / 16;
         int var3 = this.b;
         int var4 = this.c;
         int var5 = this.d;
         if (this.a == 0) {
            var3 = me.c(this.s - (double)((float)this.e.B / 32.0F));
         }

         if (this.a == 1) {
            var5 = me.c(this.u - (double)((float)this.e.B / 32.0F));
         }

         if (this.a == 2) {
            var3 = me.c(this.s - (double)((float)this.e.B / 32.0F));
         }

         if (this.a == 3) {
            var5 = me.c(this.u - (double)((float)this.e.B / 32.0F));
         }

         var4 = me.c(this.t - (double)((float)this.e.C / 32.0F));

         for(int var6 = 0; var6 < var1; ++var6) {
            for(int var7 = 0; var7 < var2; ++var7) {
               p var8;
               if (this.a != 0 && this.a != 2) {
                  var8 = this.o.e(this.b, var4 + var7, var5 + var6);
               } else {
                  var8 = this.o.e(var3 + var6, var4 + var7, this.d);
               }

               if (!var8.b()) {
                  return false;
               }
            }
         }

         List var10 = this.o.b((ia)this, (c)this.C);

         for(int var11 = 0; var11 < var10.size(); ++var11) {
            if (var10.get(var11) instanceof tj) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean e_() {
      return true;
   }

   public boolean a(pm var1, int var2) {
      if (!this.K && !this.o.I) {
         this.v();
         this.G();
         this.o.a((ia)(new ih(this.o, this.s, this.t, this.u, new dk(acy.ar))));
      }

      return true;
   }

   public void a(ik var1) {
      var1.a("Dir", (byte)this.a);
      var1.a("Motive", this.e.A);
      var1.a("TileX", this.b);
      var1.a("TileY", this.c);
      var1.a("TileZ", this.d);
   }

   public void b(ik var1) {
      this.a = var1.c("Dir");
      this.b = var1.e("TileX");
      this.c = var1.e("TileY");
      this.d = var1.e("TileZ");
      String var2 = var1.i("Motive");

      for(sv var6 : sv.values()) {
         if (var6.A.equals(var2)) {
            this.e = var6;
         }
      }

      if (this.e == null) {
         this.e = sv.a;
      }

      this.b(this.a);
   }

   public void b(double var1, double var3, double var5) {
      if (!this.o.I && var1 * var1 + var3 * var3 + var5 * var5 > (double)0.0F) {
         this.v();
         this.o.a((ia)(new ih(this.o, this.s, this.t, this.u, new dk(acy.ar))));
      }

   }

   public void h(double var1, double var3, double var5) {
      if (!this.o.I && var1 * var1 + var3 * var3 + var5 * var5 > (double)0.0F) {
         this.v();
         this.o.a((ia)(new ih(this.o, this.s, this.t, this.u, new dk(acy.ar))));
      }

   }
}
