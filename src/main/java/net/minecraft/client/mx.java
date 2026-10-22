package net.minecraft.client;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class mx extends jn {
   protected int g;
   protected List h;
   protected Comparator i;
   protected int j;
   protected int k;
   // $FF: synthetic field
   final in l;

   protected mx(in var1) {
      super(in.f(var1), var1.m, var1.n, 32, var1.n - 64, 20);
      this.l = var1;
      this.g = -1;
      this.j = -1;
      this.k = 0;
      this.a(false);
      this.a(true, 20);
   }

   protected void a(int var1, boolean var2) {
   }

   protected boolean a(int var1) {
      return false;
   }

   protected void c() {
      this.l.j();
   }

   protected void a(int var1, int var2, cv var3) {
      if (!Mouse.isButtonDown(0)) {
         this.g = -1;
      }

      if (this.g == 0) {
         in.a(this.l, var1 + 115 - 18, var2 + 1, 0, 0);
      } else {
         in.a(this.l, var1 + 115 - 18, var2 + 1, 0, 18);
      }

      if (this.g == 1) {
         in.a(this.l, var1 + 165 - 18, var2 + 1, 0, 0);
      } else {
         in.a(this.l, var1 + 165 - 18, var2 + 1, 0, 18);
      }

      if (this.g == 2) {
         in.a(this.l, var1 + 215 - 18, var2 + 1, 0, 0);
      } else {
         in.a(this.l, var1 + 215 - 18, var2 + 1, 0, 18);
      }

      if (this.j != -1) {
         short var4 = 79;
         byte var5 = 18;
         if (this.j == 1) {
            var4 = 129;
         } else if (this.j == 2) {
            var4 = 179;
         }

         if (this.k == 1) {
            var5 = 36;
         }

         in.a(this.l, var1 + var4, var2 + 1, var5, 0);
      }

   }

   protected void a(int var1, int var2) {
      this.g = -1;
      if (var1 >= 79 && var1 < 115) {
         this.g = 0;
      } else if (var1 >= 129 && var1 < 165) {
         this.g = 1;
      } else if (var1 >= 179 && var1 < 215) {
         this.g = 2;
      }

      if (this.g >= 0) {
         this.d(this.g);
         in.g(this.l).C.a("random.click", 1.0F, 1.0F);
      }

   }

   protected final int a() {
      return this.h.size();
   }

   protected final yl c(int var1) {
      return (yl)this.h.get(var1);
   }

   protected abstract String b(int var1);

   protected void a(yl var1, int var2, int var3, boolean var4) {
      if (var1 != null) {
         String var5 = var1.a(in.c(this.l).a((px)var1));
         this.l.b(in.h(this.l), var5, var2 - in.i(this.l).a(var5), var3 + 5, var4 ? 16777215 : 9474192);
      } else {
         String var6 = "-";
         this.l.b(in.j(this.l), var6, var2 - in.k(this.l).a(var6), var3 + 5, var4 ? 16777215 : 9474192);
      }

   }

   protected void b(int var1, int var2) {
      if (var2 >= this.b && var2 <= this.c) {
         int var3 = this.c(var1, var2);
         int var4 = this.l.m / 2 - 92 - 16;
         if (var3 >= 0) {
            if (var1 < var4 + 40 || var1 > var4 + 40 + 20) {
               return;
            }

            yl var11 = this.c(var3);
            this.a(var11, var1, var2);
         } else {
            String var5 = "";
            if (var1 >= var4 + 115 - 18 && var1 <= var4 + 115) {
               var5 = this.b(0);
            } else if (var1 >= var4 + 165 - 18 && var1 <= var4 + 165) {
               var5 = this.b(1);
            } else {
               if (var1 < var4 + 215 - 18 || var1 > var4 + 215) {
                  return;
               }

               var5 = this.b(2);
            }

            var5 = ("" + qp.a().a(var5)).trim();
            if (var5.length() > 0) {
               int var6 = var1 + 12;
               int var7 = var2 - 12;
               int var8 = in.l(this.l).a(var5);
               in.a(this.l, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
               in.m(this.l).a(var5, var6, var7, -1);
            }
         }

      }
   }

   protected void a(yl var1, int var2, int var3) {
      if (var1 != null) {
         acy var4 = acy.d[var1.f()];
         String var5 = ("" + qp.a().b(var4.d())).trim();
         if (var5.length() > 0) {
            int var6 = var2 + 12;
            int var7 = var3 - 12;
            int var8 = in.n(this.l).a(var5);
            in.b(this.l, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
            in.o(this.l).a(var5, var6, var7, -1);
         }

      }
   }

   protected void d(int var1) {
      if (var1 != this.j) {
         this.j = var1;
         this.k = -1;
      } else if (this.k == -1) {
         this.k = 1;
      } else {
         this.j = -1;
         this.k = 0;
      }

      Collections.sort(this.h, this.i);
   }
}
