package net.minecraft.client;

import java.util.List;

public class tt extends bq implements de {
   private dk[] a = new dk[4];
   private int b;
   private int j;
   private int k;

   public String d() {
      return "Brewing Stand";
   }

   public int c() {
      return this.a.length;
   }

   public void b() {
      if (this.b > 0) {
         --this.b;
         if (this.b == 0) {
            this.q();
            this.h();
         } else if (!this.p()) {
            this.b = 0;
            this.h();
         } else if (this.k != this.a[3].c) {
            this.b = 0;
            this.h();
         }
      } else if (this.p()) {
         this.b = 600;
         this.k = this.a[3].c;
      }

      int var1 = this.o();
      if (var1 != this.j) {
         this.j = var1;
         this.c.f(this.d, this.e, this.f, var1);
      }

      super.b();
   }

   public int a() {
      return this.b;
   }

   private boolean p() {
      if (this.a[3] != null && this.a[3].a > 0) {
         dk var1 = this.a[3];
         if (!acy.d[var1.c].n()) {
            return false;
         } else {
            boolean var2 = false;

            for(int var3 = 0; var3 < 3; ++var3) {
               if (this.a[var3] != null && this.a[var3].c == acy.br.bM) {
                  int var4 = this.a[var3].i();
                  int var5 = this.b(var4, var1);
                  if (!abk.e(var4) && abk.e(var5)) {
                     var2 = true;
                     break;
                  }

                  List var6 = acy.br.d(var4);
                  List var7 = acy.br.d(var5);
                  if ((var4 <= 0 || var6 != var7) && (var6 == null || !var6.equals(var7) && var7 != null) && var4 != var5) {
                     var2 = true;
                     break;
                  }
               }
            }

            return var2;
         }
      } else {
         return false;
      }
   }

   private void q() {
      if (this.p()) {
         dk var1 = this.a[3];

         for(int var2 = 0; var2 < 3; ++var2) {
            if (this.a[var2] != null && this.a[var2].c == acy.br.bM) {
               int var3 = this.a[var2].i();
               int var4 = this.b(var3, var1);
               List var5 = acy.br.d(var3);
               List var6 = acy.br.d(var4);
               if (var3 > 0 && var5 == var6 || var5 != null && (var5.equals(var6) || var6 == null)) {
                  if (!abk.e(var3) && abk.e(var4)) {
                     this.a[var2].b(var4);
                  }
               } else if (var3 != var4) {
                  this.a[var2].b(var4);
               }
            }
         }

         if (acy.d[var1.c].k()) {
            this.a[3] = new dk(acy.d[var1.c].j());
         } else {
            --this.a[3].a;
            if (this.a[3].a <= 0) {
               this.a[3] = null;
            }
         }

      }
   }

   private int b(int var1, dk var2) {
      if (var2 == null) {
         return var1;
      } else {
         return acy.d[var2.c].n() ? pk.a(var1, acy.d[var2.c].m()) : var1;
      }
   }

   public void b(ik var1) {
      super.b(var1);
      yi var2 = var1.l("Items");
      this.a = new dk[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         ik var4 = (ik)var2.a(var3);
         byte var5 = var4.c("Slot");
         if (var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = dk.a(var4);
         }
      }

      this.b = var1.d("BrewTime");
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("BrewTime", (short)this.b);
      yi var2 = new yi();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null) {
            ik var4 = new ik();
            var4.a("Slot", (byte)var3);
            this.a[var3].b(var4);
            var2.a((um)var4);
         }
      }

      var1.a("Items", (um)var2);
   }

   public dk d(int var1) {
      return var1 >= 0 && var1 < this.a.length ? this.a[var1] : null;
   }

   public dk a(int var1, int var2) {
      if (var1 >= 0 && var1 < this.a.length) {
         dk var3 = this.a[var1];
         this.a[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      if (var1 >= 0 && var1 < this.a.length) {
         this.a[var1] = var2;
      }

   }

   public int e() {
      return 1;
   }

   public boolean b_(vi var1) {
      if (this.c.b(this.d, this.e, this.f) != this) {
         return false;
      } else {
         return !(var1.f((double)this.d + (double)0.5F, (double)this.e + (double)0.5F, (double)this.f + (double)0.5F) > (double)64.0F);
      }
   }

   public void j() {
   }

   public void k() {
   }

   public void a(int var1) {
      this.b = var1;
   }

   public int o() {
      int var1 = 0;

      for(int var2 = 0; var2 < 3; ++var2) {
         if (this.a[var2] != null) {
            var1 |= 1 << var2;
         }
      }

      return var1;
   }
}
