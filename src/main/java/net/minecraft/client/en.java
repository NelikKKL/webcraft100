package net.minecraft.client;

public class en extends acy {
   private int a;

   public en(int var1, int var2) {
      super(var1);
      this.bN = 1;
      this.a = var2;
   }

   public dk c(dk var1, ry var2, vi var3) {
      float var4 = 1.0F;
      double var5 = var3.p + (var3.s - var3.p) * (double)var4;
      double var7 = var3.q + (var3.t - var3.q) * (double)var4 + 1.62 - (double)var3.L;
      double var9 = var3.r + (var3.u - var3.r) * (double)var4;
      boolean var11 = this.a == 0;
      gv var12 = this.a(var2, var3, var11);
      if (var12 == null) {
         return var1;
      } else {
         if (var12.a == net.minecraft.client.bo.a) {
            int var13 = var12.b;
            int var14 = var12.c;
            int var15 = var12.d;
            if (!var2.a(var3, var13, var14, var15)) {
               return var1;
            }

            if (this.a == 0) {
               if (!var3.e(var13, var14, var15)) {
                  return var1;
               }

               if (var2.e(var13, var14, var15) == net.minecraft.client.p.g && var2.d(var13, var14, var15) == 0) {
                  var2.g(var13, var14, var15, 0);
                  if (var3.cc.d) {
                     return var1;
                  }

                  return new dk(acy.aw);
               }

               if (var2.e(var13, var14, var15) == net.minecraft.client.p.h && var2.d(var13, var14, var15) == 0) {
                  var2.g(var13, var14, var15, 0);
                  if (var3.cc.d) {
                     return var1;
                  }

                  return new dk(acy.ax);
               }
            } else {
               if (this.a < 0) {
                  return new dk(acy.av);
               }

               if (var12.e == 0) {
                  --var14;
               }

               if (var12.e == 1) {
                  ++var14;
               }

               if (var12.e == 2) {
                  --var15;
               }

               if (var12.e == 3) {
                  ++var15;
               }

               if (var12.e == 4) {
                  --var13;
               }

               if (var12.e == 5) {
                  ++var13;
               }

               if (!var3.e(var13, var14, var15)) {
                  return var1;
               }

               if (var2.h(var13, var14, var15) || !var2.e(var13, var14, var15).b()) {
                  if (var2.y.d && this.a == yy.A.bM) {
                     var2.a(var5 + (double)0.5F, var7 + (double)0.5F, var9 + (double)0.5F, "random.fizz", 0.5F, 2.6F + (var2.w.nextFloat() - var2.w.nextFloat()) * 0.8F);

                     for(int var16 = 0; var16 < 8; ++var16) {
                        var2.a("largesmoke", (double)var13 + Math.random(), (double)var14 + Math.random(), (double)var15 + Math.random(), (double)0.0F, (double)0.0F, (double)0.0F);
                     }
                  } else {
                     var2.d(var13, var14, var15, this.a, 0);
                  }

                  if (var3.cc.d) {
                     return var1;
                  }

                  return new dk(acy.av);
               }
            }
         } else if (this.a == 0 && var12.g instanceof adr) {
            return new dk(acy.aF);
         }

         return var1;
      }
   }
}
