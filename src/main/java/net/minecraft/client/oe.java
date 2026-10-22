package net.minecraft.client;

public class oe extends bq implements de {
   private dk[] k = new dk[3];
   public int a = 0;
   public int b = 0;
   public int j = 0;

   public int c() {
      return this.k.length;
   }

   public dk d(int var1) {
      return this.k[var1];
   }

   public dk a(int var1, int var2) {
      if (this.k[var1] != null) {
         if (this.k[var1].a <= var2) {
            dk var4 = this.k[var1];
            this.k[var1] = null;
            return var4;
         } else {
            dk var3 = this.k[var1].a(var2);
            if (this.k[var1].a == 0) {
               this.k[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      this.k[var1] = var2;
      if (var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

   }

   public String d() {
      return "Furnace";
   }

   public void b(ik var1) {
      super.b(var1);
      yi var2 = var1.l("Items");
      this.k = new dk[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         ik var4 = (ik)var2.a(var3);
         byte var5 = var4.c("Slot");
         if (var5 >= 0 && var5 < this.k.length) {
            this.k[var5] = dk.a(var4);
         }
      }

      this.a = var1.d("BurnTime");
      this.j = var1.d("CookTime");
      this.b = this.a(this.k[1]);
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("BurnTime", (short)this.a);
      var1.a("CookTime", (short)this.j);
      yi var2 = new yi();

      for(int var3 = 0; var3 < this.k.length; ++var3) {
         if (this.k[var3] != null) {
            ik var4 = new ik();
            var4.a("Slot", (byte)var3);
            this.k[var3].b(var4);
            var2.a((um)var4);
         }
      }

      var1.a("Items", (um)var2);
   }

   public int e() {
      return 64;
   }

   public int a(int var1) {
      return this.j * var1 / 200;
   }

   public int b(int var1) {
      if (this.b == 0) {
         this.b = 200;
      }

      return this.a * var1 / this.b;
   }

   public boolean a() {
      return this.a > 0;
   }

   public void b() {
      boolean var1 = this.a > 0;
      boolean var2 = false;
      if (this.a > 0) {
         --this.a;
      }

      if (!this.c.I) {
         if (this.a == 0 && this.p()) {
            this.b = this.a = this.a(this.k[1]);
            if (this.a > 0) {
               var2 = true;
               if (this.k[1] != null) {
                  --this.k[1].a;
                  if (this.k[1].a == 0) {
                     this.k[1] = null;
                  }
               }
            }
         }

         if (this.a() && this.p()) {
            ++this.j;
            if (this.j == 200) {
               this.j = 0;
               this.o();
               var2 = true;
            }
         } else {
            this.j = 0;
         }

         if (var1 != this.a > 0) {
            var2 = true;
            eu.a(this.a > 0, this.c, this.d, this.e, this.f);
         }
      }

      if (var2) {
         this.h();
      }

   }

   private boolean p() {
      if (this.k[0] == null) {
         return false;
      } else {
         dk var1 = mt.a().a(this.k[0].a().bM);
         if (var1 == null) {
            return false;
         } else if (this.k[2] == null) {
            return true;
         } else if (!this.k[2].a(var1)) {
            return false;
         } else if (this.k[2].a < this.e() && this.k[2].a < this.k[2].c()) {
            return true;
         } else {
            return this.k[2].a < var1.c();
         }
      }
   }

   public void o() {
      if (this.p()) {
         dk var1 = mt.a().a(this.k[0].a().bM);
         if (this.k[2] == null) {
            this.k[2] = var1.k();
         } else if (this.k[2].c == var1.c) {
            ++this.k[2].a;
         }

         --this.k[0].a;
         if (this.k[0].a <= 0) {
            this.k[0] = null;
         }

      }
   }

   private int a(dk var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = var1.a().bM;
         if (var2 < 256 && yy.k[var2].bZ == p.d) {
            return 300;
         } else if (var2 == acy.C.bM) {
            return 100;
         } else if (var2 == acy.l.bM) {
            return 1600;
         } else if (var2 == acy.ax.bM) {
            return 20000;
         } else if (var2 == yy.y.bM) {
            return 100;
         } else {
            return var2 == acy.bn.bM ? 2400 : 0;
         }
      }
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
}
