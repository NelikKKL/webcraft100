package net.minecraft.client;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class uk extends nk {
   private LinkedList a = new LinkedList();

   public uk(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.e = new nl(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public void a(nk var1, List var2, Random var3) {
      int var4 = this.b();
      int var6 = this.e.c() - 3 - 1;
      if (var6 <= 0) {
         var6 = 1;
      }

      int var9;
      for(var9 = 0; var9 < this.e.b(); var9 += 4) {
         var9 += var3.nextInt(this.e.b());
         if (var9 + 3 > this.e.b()) {
            break;
         }

         nk var7 = aez.a(var1, var2, var3, this.e.a + var9, this.e.b + var3.nextInt(var6) + 1, this.e.c - 1, 2, var4);
         if (var7 != null) {
            nl var8 = var7.a();
            this.a.add(new nl(var8.a, var8.b, this.e.c, var8.d, var8.e, this.e.c + 1));
         }
      }

      for(var9 = 0; var9 < this.e.b(); var9 += 4) {
         var9 += var3.nextInt(this.e.b());
         if (var9 + 3 > this.e.b()) {
            break;
         }

         nk var16 = aez.a(var1, var2, var3, this.e.a + var9, this.e.b + var3.nextInt(var6) + 1, this.e.f + 1, 0, var4);
         if (var16 != null) {
            nl var19 = var16.a();
            this.a.add(new nl(var19.a, var19.b, this.e.f - 1, var19.d, var19.e, this.e.f));
         }
      }

      for(var9 = 0; var9 < this.e.d(); var9 += 4) {
         var9 += var3.nextInt(this.e.d());
         if (var9 + 3 > this.e.d()) {
            break;
         }

         nk var17 = aez.a(var1, var2, var3, this.e.a - 1, this.e.b + var3.nextInt(var6) + 1, this.e.c + var9, 1, var4);
         if (var17 != null) {
            nl var20 = var17.a();
            this.a.add(new nl(this.e.a, var20.b, var20.c, this.e.a + 1, var20.e, var20.f));
         }
      }

      for(var9 = 0; var9 < this.e.d(); var9 += 4) {
         var9 += var3.nextInt(this.e.d());
         if (var9 + 3 > this.e.d()) {
            break;
         }

         nk var18 = aez.a(var1, var2, var3, this.e.d + 1, this.e.b + var3.nextInt(var6) + 1, this.e.c + var9, 3, var4);
         if (var18 != null) {
            nl var21 = var18.a();
            this.a.add(new nl(this.e.d - 1, var21.b, var21.c, this.e.d, var21.e, var21.f));
         }
      }

   }

   public boolean a(ry var1, Random var2, nl var3) {
      if (this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, this.e.a, this.e.b, this.e.c, this.e.d, this.e.b, this.e.f, yy.v.bM, 0, true);
         this.a(var1, var3, this.e.a, this.e.b + 1, this.e.c, this.e.d, Math.min(this.e.b + 3, this.e.e), this.e.f, 0, 0, false);

         for(nl var5 : (Iterable<nl>)(Iterable)(this.a)) {
            this.a(var1, var3, var5.a, var5.e - 2, var5.c, var5.d, var5.e, var5.f, 0, 0, false);
         }

         this.a(var1, var3, this.e.a, this.e.b + 4, this.e.c, this.e.d, this.e.e, this.e.f, 0, false);
         return true;
      }
   }
}
