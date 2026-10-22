package net.minecraft.client;

public class x implements de {
   public dk[] a = new dk[36];
   public dk[] b = new dk[4];
   public int c = 0;
   public vi d;
   private dk f;
   public boolean e = false;

   public x(vi var1) {
      this.d = var1;
   }

   public dk a() {
      return this.c < 9 && this.c >= 0 ? this.a[this.c] : null;
   }

   private int g(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] != null && this.a[var2].c == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int b(int var1, int var2) {
      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null && this.a[var3].c == var1 && this.a[var3].i() == var2) {
            return var3;
         }
      }

      return -1;
   }

   private int d(dk var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] != null && this.a[var2].c == var1.c && this.a[var2].d() && this.a[var2].a < this.a[var2].c() && this.a[var2].a < this.e() && (!this.a[var2].f() || this.a[var2].i() == var1.i())) {
            return var2;
         }
      }

      return -1;
   }

   private int l() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if (this.a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public void a(int var1, int var2, boolean var3, boolean var4) {
      int var5 = -1;
      if (var3) {
         var5 = this.b(var1, var2);
      } else {
         var5 = this.g(var1);
      }

      if (var5 >= 0 && var5 < 9) {
         this.c = var5;
      }
   }

   public void a(int var1) {
      if (var1 > 0) {
         var1 = 1;
      }

      if (var1 < 0) {
         var1 = -1;
      }

      for(this.c -= var1; this.c < 0; this.c += 9) {
      }

      while(this.c >= 9) {
         this.c -= 9;
      }

   }

   private int e(dk var1) {
      int var2 = var1.c;
      int var3 = var1.a;
      if (var1.c() == 1) {
         int var7 = this.l();
         if (var7 < 0) {
            return var3;
         } else {
            if (this.a[var7] == null) {
               this.a[var7] = dk.b(var1);
            }

            return 0;
         }
      } else {
         int var4 = this.d(var1);
         if (var4 < 0) {
            var4 = this.l();
         }

         if (var4 < 0) {
            return var3;
         } else {
            if (this.a[var4] == null) {
               this.a[var4] = new dk(var2, 0, var1.i());
            }

            int var5 = var3;
            if (var3 > this.a[var4].c() - this.a[var4].a) {
               var5 = this.a[var4].c() - this.a[var4].a;
            }

            if (var5 > this.e() - this.a[var4].a) {
               var5 = this.e() - this.a[var4].a;
            }

            if (var5 == 0) {
               return var3;
            } else {
               var3 -= var5;
               dk var10000 = this.a[var4];
               var10000.a += var5;
               this.a[var4].b = 5;
               return var3;
            }
         }
      }
   }

   public void b() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if (this.a[var1] != null) {
            this.a[var1].a(this.d.o, this.d, var1, this.c == var1);
         }
      }

   }

   public boolean b(int var1) {
      int var2 = this.g(var1);
      if (var2 < 0) {
         return false;
      } else {
         if (--this.a[var2].a <= 0) {
            this.a[var2] = null;
         }

         return true;
      }
   }

   public boolean c(int var1) {
      int var2 = this.g(var1);
      return var2 >= 0;
   }

   public boolean a(dk var1) {
      if (var1.g()) {
         int var3 = this.l();
         if (var3 >= 0) {
            this.a[var3] = dk.b(var1);
            this.a[var3].b = 5;
            var1.a = 0;
            return true;
         } else if (this.d.cc.d) {
            var1.a = 0;
            return true;
         } else {
            return false;
         }
      } else {
         int var2;
         do {
            var2 = var1.a;
            var1.a = this.e(var1);
         } while(var1.a > 0 && var1.a < var2);

         if (var1.a == var2 && this.d.cc.d) {
            var1.a = 0;
            return true;
         } else {
            return var1.a < var2;
         }
      }
   }

   public dk a(int var1, int var2) {
      dk[] var3 = this.a;
      if (var1 >= this.a.length) {
         var3 = this.b;
         var1 -= this.a.length;
      }

      if (var3[var1] != null) {
         if (var3[var1].a <= var2) {
            dk var5 = var3[var1];
            var3[var1] = null;
            return var5;
         } else {
            dk var4 = var3[var1].a(var2);
            if (var3[var1].a == 0) {
               var3[var1] = null;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      dk[] var3 = this.a;
      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.b;
      }

      var3[var1] = var2;
   }

   public float a(yy var1) {
      float var2 = 1.0F;
      if (this.a[this.c] != null) {
         var2 *= this.a[this.c].a(var1);
      }

      return var2;
   }

   public yi a(yi var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2] != null) {
            ik var3 = new ik();
            var3.a("Slot", (byte)var2);
            this.a[var2].b(var3);
            var1.a((um)var3);
         }
      }

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         if (this.b[var4] != null) {
            ik var5 = new ik();
            var5.a("Slot", (byte)(var4 + 100));
            this.b[var4].b(var5);
            var1.a((um)var5);
         }
      }

      return var1;
   }

   public void b(yi var1) {
      this.a = new dk[36];
      this.b = new dk[4];

      for(int var2 = 0; var2 < var1.c(); ++var2) {
         ik var3 = (ik)var1.a(var2);
         int var4 = var3.c("Slot") & 255;
         dk var5 = dk.a(var3);
         if (var5 != null) {
            if (var4 >= 0 && var4 < this.a.length) {
               this.a[var4] = var5;
            }

            if (var4 >= 100 && var4 < this.b.length + 100) {
               this.b[var4 - 100] = var5;
            }
         }
      }

   }

   public int c() {
      return this.a.length + 4;
   }

   public dk d(int var1) {
      dk[] var2 = this.a;
      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.b;
      }

      return var2[var1];
   }

   public String d() {
      return "Inventory";
   }

   public int e() {
      return 64;
   }

   public int a(ia var1) {
      dk var2 = this.d(this.c);
      return var2 != null ? var2.a(var1) : 1;
   }

   public boolean b(yy var1) {
      if (var1.bZ.k()) {
         return true;
      } else {
         dk var2 = this.d(this.c);
         return var2 != null ? var2.b(var1) : false;
      }
   }

   public dk e(int var1) {
      return this.b[var1];
   }

   public int f() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (this.b[var2] != null && this.b[var2].a() instanceof agi) {
            int var3 = ((agi)this.b[var2].a()).b;
            var1 += var3;
         }
      }

      return var1;
   }

   public void f(int var1) {
      var1 /= 4;
      if (var1 < 1) {
         var1 = 1;
      }

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (this.b[var2] != null && this.b[var2].a() instanceof agi) {
            this.b[var2].a(var1, this.d);
            if (this.b[var2].a == 0) {
               this.b[var2].a(this.d);
               this.b[var2] = null;
            }
         }
      }

   }

   public void g() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if (this.a[var1] != null) {
            this.d.a(this.a[var1], true);
            this.a[var1] = null;
         }
      }

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (this.b[var2] != null) {
            this.d.a(this.b[var2], true);
            this.b[var2] = null;
         }
      }

   }

   public void h() {
      this.e = true;
   }

   public void b(dk var1) {
      this.f = var1;
      this.d.c(var1);
   }

   public dk i() {
      return this.f;
   }

   public boolean b_(vi var1) {
      if (this.d.K) {
         return false;
      } else {
         return !(var1.d((ia)this.d) > (double)64.0F);
      }
   }

   public boolean c(dk var1) {
      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (this.b[var2] != null && this.b[var2].c(var1)) {
            return true;
         }
      }

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null && this.a[var3].c(var1)) {
            return true;
         }
      }

      return false;
   }

   public void j() {
   }

   public void k() {
   }

   public void a(x var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = dk.b(var1.a[var2]);
      }

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3] = dk.b(var1.b[var3]);
      }

   }
}
