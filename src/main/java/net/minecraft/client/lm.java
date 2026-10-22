package net.minecraft.client;

public class lm implements de {
   private dk[] a;
   private int b;
   private pj c;

   public lm(pj var1, int var2, int var3) {
      int var4 = var2 * var3;
      this.a = new dk[var4];
      this.c = var1;
      this.b = var2;
   }

   public int c() {
      return this.a.length;
   }

   public dk d(int var1) {
      return var1 >= this.c() ? null : this.a[var1];
   }

   public dk b(int var1, int var2) {
      if (var1 >= 0 && var1 < this.b) {
         int var3 = var1 + var2 * this.b;
         return this.d(var3);
      } else {
         return null;
      }
   }

   public String d() {
      return "Crafting";
   }

   public dk a(int var1, int var2) {
      if (this.a[var1] != null) {
         if (this.a[var1].a <= var2) {
            dk var4 = this.a[var1];
            this.a[var1] = null;
            this.c.a((de)this);
            return var4;
         } else {
            dk var3 = this.a[var1].a(var2);
            if (this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.c.a((de)this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      this.a[var1] = var2;
      this.c.a((de)this);
   }

   public int e() {
      return 64;
   }

   public void h() {
   }

   public boolean b_(vi var1) {
      return true;
   }

   public void j() {
   }

   public void k() {
   }
}
