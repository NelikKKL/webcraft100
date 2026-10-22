package net.minecraft.client;

public class nf extends yy {
   private boolean a;

   protected nf(int var1, int var2, boolean var3) {
      super(var1, net.minecraft.client.p.y);
      this.bL = var2;
      this.b(true);
      this.a = var3;
   }

   public int a(int var1, int var2) {
      if (var1 == 1) {
         return this.bL;
      } else if (var1 == 0) {
         return this.bL;
      } else {
         int var3 = this.bL + 1 + 16;
         if (this.a) {
            ++var3;
         }

         if (var2 == 2 && var1 == 2) {
            return var3;
         } else if (var2 == 3 && var1 == 5) {
            return var3;
         } else if (var2 == 0 && var1 == 3) {
            return var3;
         } else {
            return var2 == 1 && var1 == 4 ? var3 : this.bL + 16;
         }
      }
   }

   public int b(int var1) {
      if (var1 == 1) {
         return this.bL;
      } else if (var1 == 0) {
         return this.bL;
      } else {
         return var1 == 3 ? this.bL + 1 + 16 : this.bL + 16;
      }
   }

   public void a(ry var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if (var1.a(var2, var3 - 1, var4) == yy.aU.bM && var1.a(var2, var3 - 2, var4) == yy.aU.bM) {
         if (!var1.I) {
            var1.g(var2, var3, var4, 0);
            var1.g(var2, var3 - 1, var4, 0);
            var1.g(var2, var3 - 2, var4, 0);
            ahd var5 = new ahd(var1);
            var5.c((double)var2 + (double)0.5F, (double)var3 - 1.95, (double)var4 + (double)0.5F, 0.0F, 0.0F);
            var1.a((ia)var5);
         }

         for(int var6 = 0; var6 < 120; ++var6) {
            var1.a("snowshovel", (double)var2 + var1.w.nextDouble(), (double)(var3 - 2) + var1.w.nextDouble() * (double)2.5F, (double)var4 + var1.w.nextDouble(), (double)0.0F, (double)0.0F, (double)0.0F);
         }
      }

   }

   public boolean c(ry var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return (var5 == 0 || yy.k[var5].bZ.i()) && var1.g(var2, var3 - 1, var4);
   }

   public void a(ry var1, int var2, int var3, int var4, nq var5) {
      int var6 = me.c((double)(var5.y * 4.0F / 360.0F) + (double)2.5F) & 3;
      var1.f(var2, var3, var4, var6);
   }
}
