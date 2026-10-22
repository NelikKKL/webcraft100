package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public final class dk {
   public int a;
   public int b;
   public int c;
   public ik d;
   private int e;

   public dk(yy var1) {
      this((yy)var1, 1);
   }

   public dk(yy var1, int var2) {
      this(var1.bM, var2, 0);
   }

   public dk(yy var1, int var2, int var3) {
      this(var1.bM, var2, var3);
   }

   public dk(acy var1) {
      this(var1.bM, 1, 0);
   }

   public dk(acy var1, int var2) {
      this(var1.bM, var2, 0);
   }

   public dk(acy var1, int var2, int var3) {
      this(var1.bM, var2, var3);
   }

   public dk(int var1, int var2, int var3) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
      this.e = var3;
   }

   public static dk a(ik var0) {
      dk var1 = new dk();
      var1.c(var0);
      return var1.a() != null ? var1 : null;
   }

   private dk() {
      this.a = 0;
   }

   public dk a(int var1) {
      dk var2 = new dk(this.c, var1, this.e);
      if (this.d != null) {
         var2.d = (ik)this.d.b();
      }

      this.a -= var1;
      return var2;
   }

   public acy a() {
      return acy.d[this.c];
   }

   public int b() {
      return this.a().h(this);
   }

   public boolean a(vi var1, ry var2, int var3, int var4, int var5, int var6) {
      boolean var7 = this.a().a(this, var1, var2, var3, var4, var5, var6);
      if (var7) {
         var1.a((px)ny.E[this.c], 1);
      }

      return var7;
   }

   public float a(yy var1) {
      return this.a().a(this, var1);
   }

   public dk a(ry var1, vi var2) {
      return this.a().c(this, var1, var2);
   }

   public dk b(ry var1, vi var2) {
      return this.a().a(this, var1, var2);
   }

   public ik b(ik var1) {
      var1.a("id", (short)this.c);
      var1.a("Count", (byte)this.a);
      var1.a("Damage", (short)this.e);
      if (this.d != null) {
         var1.a("tag", (um)this.d);
      }

      return var1;
   }

   public void c(ik var1) {
      this.c = var1.d("id");
      this.a = var1.c("Count");
      this.e = var1.d("Damage");
      if (var1.b("tag")) {
         this.d = var1.k("tag");
      }

   }

   public int c() {
      return this.a().e();
   }

   public boolean d() {
      return this.c() > 1 && (!this.e() || !this.g());
   }

   public boolean e() {
      return acy.d[this.c].g() > 0;
   }

   public boolean f() {
      return acy.d[this.c].f();
   }

   public boolean g() {
      return this.e() && this.e > 0;
   }

   public int h() {
      return this.e;
   }

   public int i() {
      return this.e;
   }

   public void b(int var1) {
      this.e = var1;
   }

   public int j() {
      return acy.d[this.c].g();
   }

   public void a(int var1, nq var2) {
      if (this.e()) {
         if (var1 > 0 && var2 instanceof vi) {
            int var3 = ml.c(((vi)var2).by);
            if (var3 > 0 && var2.o.w.nextInt(var3 + 1) > 0) {
               return;
            }
         }

         this.e += var1;
         if (this.e > this.j()) {
            var2.b(this);
            if (var2 instanceof vi) {
               ((vi)var2).a((px)ny.F[this.c], 1);
            }

            --this.a;
            if (this.a < 0) {
               this.a = 0;
            }

            this.e = 0;
         }

      }
   }

   public void a(nq var1, vi var2) {
      boolean var3 = acy.d[this.c].a(this, (nq)var1, (nq)var2);
      if (var3) {
         var2.a((px)ny.E[this.c], 1);
      }

   }

   public void a(int var1, int var2, int var3, int var4, vi var5) {
      boolean var6 = acy.d[this.c].a(this, var1, var2, var3, var4, var5);
      if (var6) {
         var5.a((px)ny.E[this.c], 1);
      }

   }

   public int a(ia var1) {
      return acy.d[this.c].a(var1);
   }

   public boolean b(yy var1) {
      return acy.d[this.c].a(var1);
   }

   public void a(vi var1) {
   }

   public void a(nq var1) {
      acy.d[this.c].a(this, var1);
   }

   public dk k() {
      dk var1 = new dk(this.c, this.a, this.e);
      if (this.d != null) {
         var1.d = (ik)this.d.b();
         if (!var1.d.equals(this.d)) {
            return var1;
         }
      }

      return var1;
   }

   public static boolean a(dk var0, dk var1) {
      if (var0 == null && var1 == null) {
         return true;
      } else {
         return var0 != null && var1 != null ? var0.d(var1) : false;
      }
   }

   private boolean d(dk var1) {
      if (this.a != var1.a) {
         return false;
      } else if (this.c != var1.c) {
         return false;
      } else if (this.e != var1.e) {
         return false;
      } else if (this.d == null && var1.d != null) {
         return false;
      } else {
         return this.d == null || this.d.equals(var1.d);
      }
   }

   public boolean a(dk var1) {
      return this.c == var1.c && this.e == var1.e;
   }

   public static dk b(dk var0) {
      return var0 == null ? null : var0.k();
   }

   public String toString() {
      return this.a + "x" + acy.d[this.c].d() + "@" + this.e;
   }

   public void a(ry var1, ia var2, int var3, boolean var4) {
      if (this.b > 0) {
         --this.b;
      }

      acy.d[this.c].a(this, var1, var2, var3, var4);
   }

   public void c(ry var1, vi var2) {
      var2.a(ny.D[this.c], this.a);
      acy.d[this.c].b(this, var1, var2);
   }

   public boolean c(dk var1) {
      return this.c == var1.c && this.a == var1.a && this.e == var1.e;
   }

   public int l() {
      return this.a().b(this);
   }

   public ps m() {
      return this.a().c(this);
   }

   public void a(ry var1, vi var2, int var3) {
      this.a().a(this, var1, var2, var3);
   }

   public boolean n() {
      return this.d != null;
   }

   public ik o() {
      return this.d;
   }

   public yi p() {
      return this.d == null ? null : (yi)this.d.a("ench");
   }

   public void d(ik var1) {
      if (acy.d[this.c].e() != 1) {
         throw new IllegalArgumentException("Cannot add tag data to a stackable item");
      } else {
         this.d = var1;
      }
   }

   public List q() {
      ArrayList var1 = new ArrayList();
      acy var2 = acy.d[this.c];
      var1.add(var2.f(this));
      var2.a(this, (List)var1);
      if (this.n()) {
         yi var3 = this.p();
         if (var3 != null) {
            for(int var4 = 0; var4 < var3.c(); ++var4) {
               short var5 = ((ik)var3.a(var4)).d("id");
               short var6 = ((ik)var3.a(var4)).d("lvl");
               if (aef.b[var5] != null) {
                  var1.add(aef.b[var5].c(var6));
               }
            }
         }
      }

      return var1;
   }

   public boolean r() {
      return this.a().g(this);
   }

   public ja s() {
      return this.a().d(this);
   }

   public boolean t() {
      if (!this.a().j(this)) {
         return false;
      } else {
         return !this.u();
      }
   }

   public void a(aef var1, int var2) {
      if (this.d == null) {
         this.d(new ik());
      }

      if (!this.d.b("ench")) {
         this.d.a("ench", (um)(new yi("ench")));
      }

      yi var3 = (yi)this.d.a("ench");
      ik var4 = new ik();
      var4.a("id", (short)var1.t);
      var4.a("lvl", (short)((byte)var2));
      var3.a((um)var4);
   }

   public boolean u() {
      return this.d != null && this.d.b("ench");
   }
}
