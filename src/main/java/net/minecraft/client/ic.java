package net.minecraft.client;

import java.util.ArrayList;
import java.util.Random;

public class ic extends yy {
   public ic(int var1) {
      super(var1, net.minecraft.client.p.f);
      this.bL = 154;
   }

   public int a(int var1, int var2) {
      if (var1 == 1) {
         return 138;
      } else {
         return var1 == 0 ? 155 : 154;
      }
   }

   public void a(ry var1, int var2, int var3, int var4, c var5, ArrayList var6) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      float var7 = 0.125F;
      this.a(0.0F, 0.0F, 0.0F, var7, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var7);
      super.a(var1, var2, var3, var4, var5, var6);
      this.a(1.0F - var7, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.a(0.0F, 0.0F, 1.0F - var7, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.e();
   }

   public void e() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean a() {
      return false;
   }

   public int c() {
      return 24;
   }

   public boolean b() {
      return false;
   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         dk var6 = var5.by.a();
         if (var6 == null) {
            return true;
         } else {
            int var7 = var1.d(var2, var3, var4);
            if (var6.c == acy.aw.bM) {
               if (var7 < 3) {
                  if (!var5.cc.d) {
                     var5.by.a(var5.by.c, new dk(acy.av));
                  }

                  var1.f(var2, var3, var4, 3);
               }

               return true;
            } else {
               if (var6.c == acy.bs.bM && var7 > 0) {
                  dk var8 = new dk(acy.br, 1, 0);
                  if (!var5.by.a(var8)) {
                     var1.a((ia)(new ih(var1, (double)var2 + (double)0.5F, (double)var3 + (double)1.5F, (double)var4 + (double)0.5F, var8)));
                  }

                  --var6.a;
                  if (var6.a <= 0) {
                     var5.by.a(var5.by.c, (dk)null);
                  }

                  var1.f(var2, var3, var4, var7 - 1);
               }

               return true;
            }
         }
      }
   }

   public int a(int var1, Random var2, int var3) {
      return acy.by.bM;
   }
}
