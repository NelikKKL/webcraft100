package net.minecraft.client;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ma extends ry {
   private LinkedList J = new LinkedList();
   private abp K;
   private er L;
   private ob M = new ob();
   private Set N = new HashSet();
   private Set O = new HashSet();

   public ma(abp var1, yw var2, int var3, int var4) {
      super(new bi(), "MpServer", (k)net.minecraft.client.k.a(var3), (yw)var2);
      this.K = var1;
      this.v = var4;
      this.a(new dh(8, 64, 8));
      this.E = var1.b;
   }

   public void c() {
      this.a(this.u() + 1L);

      for(int var1 = 0; var1 < 10 && !this.O.isEmpty(); ++var1) {
         ia var2 = (ia)this.O.iterator().next();
         if (!this.g.contains(var2)) {
            this.a(var2);
         }
      }

      this.K.b();

      for(int var3 = 0; var3 < this.J.size(); ++var3) {
         agf var4 = (agf)this.J.get(var3);
         if (--var4.d == 0) {
            super.b(var4.a, var4.b, var4.c, var4.e, var4.f);
            super.j(var4.a, var4.b, var4.c);
            this.J.remove(var3--);
         }
      }

   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.J.size(); ++var7) {
         agf var8 = (agf)this.J.get(var7);
         if (var8.a >= var1 && var8.b >= var2 && var8.c >= var3 && var8.a <= var4 && var8.b <= var5 && var8.c <= var6) {
            this.J.remove(var7--);
         }
      }

   }

   protected ej d() {
      this.L = new er(this);
      return this.L;
   }

   public void e() {
      this.a(new dh(8, 64, 8));
   }

   protected void f() {
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
   }

   public boolean a(boolean var1) {
      return false;
   }

   public void a(int var1, int var2, boolean var3) {
      if (var3) {
         this.L.a(var1, var2);
      } else {
         this.L.d(var1, var2);
      }

      if (!var3) {
         this.c(var1 * 16, 0, var2 * 16, var1 * 16 + 15, this.c, var2 * 16 + 15);
      }

   }

   public boolean a(ia var1) {
      boolean var2 = super.a(var1);
      this.N.add(var1);
      if (!var2) {
         this.O.add(var1);
      }

      return var2;
   }

   public void b(ia var1) {
      super.b(var1);
      this.N.remove(var1);
   }

   protected void c(ia var1) {
      super.c(var1);
      if (this.O.contains(var1)) {
         this.O.remove(var1);
      }

   }

   protected void d(ia var1) {
      super.d(var1);
      if (this.N.contains(var1)) {
         this.O.add(var1);
      }

   }

   public void a(int var1, ia var2) {
      ia var3 = this.a(var1);
      if (var3 != null) {
         this.b(var3);
      }

      this.N.add(var2);
      var2.j = var1;
      if (!this.a(var2)) {
         this.O.add(var2);
      }

      this.M.a(var1, var2);
   }

   public ia a(int var1) {
      return (ia)this.M.a(var1);
   }

   public ia b(int var1) {
      ia var2 = (ia)this.M.d(var1);
      if (var2 != null) {
         this.N.remove(var2);
         this.b(var2);
      }

      return var2;
   }

   public boolean c(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.d(var1, var2, var3);
      if (super.c(var1, var2, var3, var4)) {
         this.J.add(new agf(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a(var1, var2, var3);
      int var7 = this.d(var1, var2, var3);
      if (super.b(var1, var2, var3, var4, var5)) {
         this.J.add(new agf(this, var1, var2, var3, var6, var7));
         return true;
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.d(var1, var2, var3);
      if (super.d(var1, var2, var3, var4)) {
         this.J.add(new agf(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean c(int var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var1, var2, var3);
      if (super.b(var1, var2, var3, var4, var5)) {
         this.h(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void g() {
      this.K.b(new sw("Quitting"));
   }

   protected void h() {
      if (!this.y.e) {
         if (this.r > 0) {
            --this.r;
         }

         this.n = this.o;
         if (this.C.o()) {
            this.o = (float)((double)this.o + 0.01);
         } else {
            this.o = (float)((double)this.o - 0.01);
         }

         if (this.o < 0.0F) {
            this.o = 0.0F;
         }

         if (this.o > 1.0F) {
            this.o = 1.0F;
         }

         this.p = this.q;
         if (this.C.m()) {
            this.q = (float)((double)this.q + 0.01);
         } else {
            this.q = (float)((double)this.q - 0.01);
         }

         if (this.q < 0.0F) {
            this.q = 0.0F;
         }

         if (this.q > 1.0F) {
            this.q = 1.0F;
         }

      }
   }
}
