package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class wx extends yy {
   private xb a;

   protected wx(int var1, int var2, xb var3, p var4) {
      super(var1, var2, var4);
      this.a = var3;
      this.b(true);
      float var5 = 0.0625F;
      this.a(var5, 0.0F, var5, 1.0F - var5, 0.03125F, 1.0F - var5);
   }

   public int d() {
      return 20;
   }

   public c b(ry var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4) || var1.a(var2, var3 - 1, var4) == yy.aZ.bM;
   }

   public void a(ry var1, int var2, int var3, int var4) {
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (!var1.g(var2, var3 - 1, var4) && var1.a(var2, var3 - 1, var4) != yy.aZ.bM) {
         var6 = true;
      }

      if (var6) {
         this.b(var1, var2, var3, var4, var1.d(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public void a(ry var1, int var2, int var3, int var4, Random var5) {
      if (!var1.I) {
         if (var1.d(var2, var3, var4) != 0) {
            this.g(var1, var2, var3, var4);
         }
      }
   }

   public void a(ry var1, int var2, int var3, int var4, ia var5) {
      if (!var1.I) {
         if (var1.d(var2, var3, var4) != 1) {
            this.g(var1, var2, var3, var4);
         }
      }
   }

   private void g(ry var1, int var2, int var3, int var4) {
      boolean var5 = var1.d(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if (this.a == xb.a) {
         var8 = var1.b((ia)null, (c)net.minecraft.client.c.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + (double)0.25F, (double)((float)(var4 + 1) - var7)));
      }

      if (this.a == xb.b) {
         var8 = var1.a(net.minecraft.client.nq.class, net.minecraft.client.c.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + (double)0.25F, (double)((float)(var4 + 1) - var7)));
      }

      if (this.a == xb.c) {
         var8 = var1.a(net.minecraft.client.vi.class, net.minecraft.client.c.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + (double)0.25F, (double)((float)(var4 + 1) - var7)));
      }

      if (var8.size() > 0) {
         var6 = true;
      }

      if (var6 && !var5) {
         var1.f(var2, var3, var4, 1);
         var1.j(var2, var3, var4, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + (double)0.5F, (double)var3 + 0.1, (double)var4 + (double)0.5F, "random.click", 0.3F, 0.6F);
      }

      if (!var6 && var5) {
         var1.f(var2, var3, var4, 0);
         var1.j(var2, var3, var4, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + (double)0.5F, (double)var3 + 0.1, (double)var4 + (double)0.5F, "random.click", 0.3F, 0.5F);
      }

      if (var6) {
         var1.a(var2, var3, var4, this.bM, this.d());
      }

   }

   public void d(ry var1, int var2, int var3, int var4) {
      int var5 = var1.d(var2, var3, var4);
      if (var5 > 0) {
         var1.j(var2, var3, var4, this.bM);
         var1.j(var2, var3 - 1, var4, this.bM);
      }

      super.d(var1, var2, var3, var4);
   }

   public void b(kq var1, int var2, int var3, int var4) {
      boolean var5 = var1.d(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if (var5) {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }

   }

   public boolean b(kq var1, int var2, int var3, int var4, int var5) {
      return var1.d(var2, var3, var4) > 0;
   }

   public boolean c(ry var1, int var2, int var3, int var4, int var5) {
      if (var1.d(var2, var3, var4) == 0) {
         return false;
      } else {
         return var5 == 1;
      }
   }

   public boolean g() {
      return true;
   }

   public void e() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public int i() {
      return 1;
   }
}
