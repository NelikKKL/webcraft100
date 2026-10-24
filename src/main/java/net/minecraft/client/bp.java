package net.minecraft.client;

import java.util.Random;

public class bp extends bq implements de {
   private dk[] a = new dk[9];
   private Random b = new net.minecraft.client.web.JRandom();

   public int c() {
      return 9;
   }

   public dk d(int var1) {
      return this.a[var1];
   }

   public dk a(int var1, int var2) {
      if (this.a[var1] != null) {
         if (this.a[var1].a <= var2) {
            dk var4 = this.a[var1];
            this.a[var1] = null;
            this.h();
            return var4;
         } else {
            dk var3 = this.a[var1].a(var2);
            if (this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.h();
            return var3;
         }
      } else {
         return null;
      }
   }

   public dk a() {
      int var1 = -1;
      int var2 = 1;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null && this.b.nextInt(var2++) == 0) {
            var1 = var3;
         }
      }

      if (var1 >= 0) {
         return this.a(var1, 1);
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      this.a[var1] = var2;
      if (var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

      this.h();
   }

   public String d() {
      return "Trap";
   }

   public void b(ik var1) {
      super.b(var1);
      yi var2 = var1.l("Items");
      this.a = new dk[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         ik var4 = (ik)var2.a(var3);
         int var5 = var4.c("Slot") & 255;
         if (var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = dk.a(var4);
         }
      }

   }

   public void a(ik var1) {
      super.a(var1);
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

   public int e() {
      return 64;
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
