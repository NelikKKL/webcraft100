package net.minecraft.client;

import java.util.List;
import java.util.Random;

public class aia extends xf {
   private final boolean a = true;
   private int b = -1;

   public aia(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.f = var2.nextInt(4);
      switch (this.f) {
         case 0:
         case 2:
            this.e = new nl(var3, 64, var4, var3 + 6 - 1, 78, var4 + 6 - 1);
            break;
         default:
            this.e = new nl(var3, 64, var4, var3 + 6 - 1, 78, var4 + 6 - 1);
      }

   }

   public void a(nk var1, List var2, Random var3) {
      xy.b((yp)var1, var2, var3, this.e.a - 1, this.e.e - 4, this.e.c + 1, 1, this.b());
      xy.b((yp)var1, var2, var3, this.e.d + 1, this.e.e - 4, this.e.c + 1, 3, this.b());
      xy.b((yp)var1, var2, var3, this.e.a + 1, this.e.e - 4, this.e.c - 1, 2, this.b());
      xy.b((yp)var1, var2, var3, this.e.a + 1, this.e.e - 4, this.e.f + 1, 0, this.b());
   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.b < 0) {
         this.b = this.b(var1, var3);
         if (this.b < 0) {
            return true;
         }

         this.e.a(0, this.b - this.e.e + 3, 0);
      }

      if (this.a) {
      }

      this.a(var1, var3, 1, 0, 1, 4, 12, 4, yy.w.bM, yy.A.bM, false);
      this.a(var1, 0, 0, 2, 12, 2, var3);
      this.a(var1, 0, 0, 3, 12, 2, var3);
      this.a(var1, 0, 0, 2, 12, 3, var3);
      this.a(var1, 0, 0, 3, 12, 3, var3);
      this.a(var1, yy.aZ.bM, 0, 1, 13, 1, var3);
      this.a(var1, yy.aZ.bM, 0, 1, 14, 1, var3);
      this.a(var1, yy.aZ.bM, 0, 4, 13, 1, var3);
      this.a(var1, yy.aZ.bM, 0, 4, 14, 1, var3);
      this.a(var1, yy.aZ.bM, 0, 1, 13, 4, var3);
      this.a(var1, yy.aZ.bM, 0, 1, 14, 4, var3);
      this.a(var1, yy.aZ.bM, 0, 4, 13, 4, var3);
      this.a(var1, yy.aZ.bM, 0, 4, 14, 4, var3);
      this.a(var1, var3, 1, 15, 1, 4, 15, 4, yy.w.bM, yy.w.bM, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 5; ++var5) {
            if (var5 == 0 || var5 == 5 || var4 == 0 || var4 == 5) {
               this.a(var1, yy.F.bM, 0, var5, 11, var4, var3);
               this.b(var1, var5, 12, var4, var3);
            }
         }
      }

      return true;
   }
}
