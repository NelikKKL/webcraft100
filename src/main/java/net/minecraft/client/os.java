package net.minecraft.client;

import java.util.List;
import java.util.Random;

abstract class os extends nk {
   protected os(int var1) {
      super(var1);
   }

   /**
    * PATCH(1.0.0): метод не декомпилировался. Это ComponentStronghold.placeDoor — проём/дверь/решётка/
    * железная дверь в стенах крепости. Восстановлено по MCP 1.0.0.
    * var5/var6/var7 = x/y/z в локальных координатах компонента.
    * yy.bm = каменный кирпич (98), yy.aE = деревянная дверь (64), yy.aL = железная дверь (71),
    * yy.aR = каменная кнопка (77), yy.bp = железные прутья (101).
    */
   protected void a(ry var1, Random var2, nl var3, mj var4, int var5, int var6, int var7) {
      switch (var4) {
         case a:
         default:
            this.a(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, 0, 0, false);
            break;
         case b:
            this.a(var1, yy.bm.bM, 0, var5, var6, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5, var6 + 1, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5, var6 + 2, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 1, var6 + 2, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 2, var6 + 2, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 2, var6 + 1, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 2, var6, var7, var3);
            this.a(var1, yy.aE.bM, 0, var5 + 1, var6, var7, var3);
            this.a(var1, yy.aE.bM, 8, var5 + 1, var6 + 1, var7, var3);
            break;
         case c:
            this.a(var1, 0, 0, var5 + 1, var6, var7, var3);
            this.a(var1, 0, 0, var5 + 1, var6 + 1, var7, var3);
            this.a(var1, yy.bp.bM, 0, var5, var6, var7, var3);
            this.a(var1, yy.bp.bM, 0, var5, var6 + 1, var7, var3);
            this.a(var1, yy.bp.bM, 0, var5, var6 + 2, var7, var3);
            this.a(var1, yy.bp.bM, 0, var5 + 1, var6 + 2, var7, var3);
            this.a(var1, yy.bp.bM, 0, var5 + 2, var6 + 2, var7, var3);
            this.a(var1, yy.bp.bM, 0, var5 + 2, var6 + 1, var7, var3);
            this.a(var1, yy.bp.bM, 0, var5 + 2, var6, var7, var3);
            break;
         case d:
            this.a(var1, yy.bm.bM, 0, var5, var6, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5, var6 + 1, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5, var6 + 2, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 1, var6 + 2, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 2, var6 + 2, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 2, var6 + 1, var7, var3);
            this.a(var1, yy.bm.bM, 0, var5 + 2, var6, var7, var3);
            this.a(var1, yy.aL.bM, 0, var5 + 1, var6, var7, var3);
            this.a(var1, yy.aL.bM, 8, var5 + 1, var6 + 1, var7, var3);
            this.a(var1, yy.aR.bM, this.c(yy.aR.bM, 4), var5 + 2, var6 + 1, var7 + 1, var3);
            this.a(var1, yy.aR.bM, this.c(yy.aR.bM, 3), var5 + 2, var6 + 1, var7 - 1, var3);
      }
   }

   protected mj a(Random var1) {
      int var2 = var1.nextInt(5);
      switch (var2) {
         case 0:
         case 1:
         default:
            return mj.a;
         case 2:
            return mj.b;
         case 3:
            return mj.c;
         case 4:
            return mj.d;
      }
   }

   protected nk a(aeh var1, List var2, Random var3, int var4, int var5) {
      switch (this.f) {
         case 0:
            return tc.a(var1, var2, var3, this.e.a + var4, this.e.b + var5, this.e.f + 1, this.f, this.b());
         case 1:
            return tc.a(var1, var2, var3, this.e.a - 1, this.e.b + var5, this.e.c + var4, this.f, this.b());
         case 2:
            return tc.a(var1, var2, var3, this.e.a + var4, this.e.b + var5, this.e.c - 1, this.f, this.b());
         case 3:
            return tc.a(var1, var2, var3, this.e.d + 1, this.e.b + var5, this.e.c + var4, this.f, this.b());
         default:
            return null;
      }
   }

   protected nk b(aeh var1, List var2, Random var3, int var4, int var5) {
      switch (this.f) {
         case 0:
            return tc.a((aeh)var1, var2, var3, this.e.a - 1, this.e.b + var4, this.e.c + var5, 1, this.b());
         case 1:
            return tc.a((aeh)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.c - 1, 2, this.b());
         case 2:
            return tc.a((aeh)var1, var2, var3, this.e.a - 1, this.e.b + var4, this.e.c + var5, 1, this.b());
         case 3:
            return tc.a((aeh)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.c - 1, 2, this.b());
         default:
            return null;
      }
   }

   protected nk c(aeh var1, List var2, Random var3, int var4, int var5) {
      switch (this.f) {
         case 0:
            return tc.a((aeh)var1, var2, var3, this.e.d + 1, this.e.b + var4, this.e.c + var5, 3, this.b());
         case 1:
            return tc.a((aeh)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.f + 1, 0, this.b());
         case 2:
            return tc.a((aeh)var1, var2, var3, this.e.d + 1, this.e.b + var4, this.e.c + var5, 3, this.b());
         case 3:
            return tc.a((aeh)var1, var2, var3, this.e.a + var5, this.e.b + var4, this.e.f + 1, 0, this.b());
         default:
            return null;
      }
   }

   protected static boolean a(nl var0) {
      return var0 != null && var0.b > 10;
   }
}
