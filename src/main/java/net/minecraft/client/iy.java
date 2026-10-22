package net.minecraft.client;

public class iy implements de {
   private dk[] a = new dk[1];

   public int c() {
      return 1;
   }

   public dk d(int var1) {
      return this.a[var1];
   }

   public String d() {
      return "Result";
   }

   public dk a(int var1, int var2) {
      if (this.a[var1] != null) {
         dk var3 = this.a[var1];
         this.a[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public void a(int var1, dk var2) {
      this.a[var1] = var2;
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
