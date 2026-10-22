package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class ir extends os {
   private boolean a;

   public ir(int var1, Random var2, nl var3, int var4) {
      super(var1);
      this.f = var4;
      this.e = var3;
   }

   public void a(nk var1, List var2, Random var3) {
      if (var1 != null) {
         ((aeh)var1).b = this;
      }

   }

   public static ir a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      nl var7 = nl.a(var2, var3, var4, -4, -1, 0, 11, 8, 16, var5);
      return a(var7) && nk.a(var0, var7) == null ? new ir(var6, var1, var7, var5) : null;
   }

   public boolean a(ry var1, Random var2, nl var3) {
      this.a(var1, var3, 0, 0, 0, 10, 7, 15, false, var2, tc.b());
      this.a(var1, var2, var3, mj.c, 4, 1, 0);
      int var4 = 6;
      this.a(var1, var3, 1, var4, 1, 1, var4, 14, false, var2, tc.b());
      this.a(var1, var3, 9, var4, 1, 9, var4, 14, false, var2, tc.b());
      this.a(var1, var3, 2, var4, 1, 8, var4, 2, false, var2, tc.b());
      this.a(var1, var3, 2, var4, 14, 8, var4, 14, false, var2, tc.b());
      this.a(var1, var3, 1, 1, 1, 2, 1, 4, false, var2, tc.b());
      this.a(var1, var3, 8, 1, 1, 9, 1, 4, false, var2, tc.b());
      this.a(var1, var3, 1, 1, 1, 1, 1, 3, yy.C.bM, yy.C.bM, false);
      this.a(var1, var3, 9, 1, 1, 9, 1, 3, yy.C.bM, yy.C.bM, false);
      this.a(var1, var3, 3, 1, 8, 7, 1, 12, false, var2, tc.b());
      this.a(var1, var3, 4, 1, 9, 6, 1, 11, yy.C.bM, yy.C.bM, false);

      for(int var5 = 3; var5 < 14; var5 += 2) {
         this.a(var1, var3, 0, 3, var5, 0, 4, var5, yy.bp.bM, yy.bp.bM, false);
         this.a(var1, var3, 10, 3, var5, 10, 4, var5, yy.bp.bM, yy.bp.bM, false);
      }

      for(int var14 = 2; var14 < 9; var14 += 2) {
         this.a(var1, var3, var14, 3, 15, var14, 4, 15, yy.bp.bM, yy.bp.bM, false);
      }

      int var15 = this.c(yy.bx.bM, 3);
      this.a(var1, var3, 4, 1, 5, 6, 1, 7, false, var2, tc.b());
      this.a(var1, var3, 4, 2, 6, 6, 2, 7, false, var2, tc.b());
      this.a(var1, var3, 4, 3, 7, 6, 3, 7, false, var2, tc.b());

      for(int var6 = 4; var6 <= 6; ++var6) {
         this.a(var1, yy.bx.bM, var15, var6, 1, 4, var3);
         this.a(var1, yy.bx.bM, var15, var6, 2, 5, var3);
         this.a(var1, yy.bx.bM, var15, var6, 3, 6, var3);
      }

      byte var16 = 2;
      byte var7 = 0;
      byte var8 = 3;
      byte var9 = 1;
      switch (this.f) {
         case 0:
            var16 = 0;
            var7 = 2;
            break;
         case 1:
            var16 = 1;
            var7 = 3;
            var8 = 0;
            var9 = 2;
         case 2:
         default:
            break;
         case 3:
            var16 = 3;
            var7 = 1;
            var8 = 0;
            var9 = 2;
      }

      this.a(var1, yy.bI.bM, var16 + (var2.nextFloat() > 0.9F ? 4 : 0), 4, 3, 8, var3);
      this.a(var1, yy.bI.bM, var16 + (var2.nextFloat() > 0.9F ? 4 : 0), 5, 3, 8, var3);
      this.a(var1, yy.bI.bM, var16 + (var2.nextFloat() > 0.9F ? 4 : 0), 6, 3, 8, var3);
      this.a(var1, yy.bI.bM, var7 + (var2.nextFloat() > 0.9F ? 4 : 0), 4, 3, 12, var3);
      this.a(var1, yy.bI.bM, var7 + (var2.nextFloat() > 0.9F ? 4 : 0), 5, 3, 12, var3);
      this.a(var1, yy.bI.bM, var7 + (var2.nextFloat() > 0.9F ? 4 : 0), 6, 3, 12, var3);
      this.a(var1, yy.bI.bM, var8 + (var2.nextFloat() > 0.9F ? 4 : 0), 3, 3, 9, var3);
      this.a(var1, yy.bI.bM, var8 + (var2.nextFloat() > 0.9F ? 4 : 0), 3, 3, 10, var3);
      this.a(var1, yy.bI.bM, var8 + (var2.nextFloat() > 0.9F ? 4 : 0), 3, 3, 11, var3);
      this.a(var1, yy.bI.bM, var9 + (var2.nextFloat() > 0.9F ? 4 : 0), 7, 3, 9, var3);
      this.a(var1, yy.bI.bM, var9 + (var2.nextFloat() > 0.9F ? 4 : 0), 7, 3, 10, var3);
      this.a(var1, yy.bI.bM, var9 + (var2.nextFloat() > 0.9F ? 4 : 0), 7, 3, 11, var3);
      if (!this.a) {
         var4 = this.b(3);
         int var10 = this.a(5, 6);
         int var11 = this.b(5, 6);
         if (var3.b(var10, var4, var11)) {
            this.a = true;
            var1.g(var10, var4, var11, yy.as.bM);
            ze var12 = (ze)var1.b(var10, var4, var11);
            if (var12 != null) {
               var12.a("Silverfish");
            }
         }
      }

      return true;
   }
}
