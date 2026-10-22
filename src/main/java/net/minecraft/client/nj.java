package net.minecraft.client;

public class nj extends bq {
   public byte a = 0;
   public boolean b = false;

   public void a(ik var1) {
      super.a(var1);
      var1.a("note", this.a);
   }

   public void b(ik var1) {
      super.b(var1);
      this.a = var1.c("note");
      if (this.a < 0) {
         this.a = 0;
      }

      if (this.a > 24) {
         this.a = 24;
      }

   }

   public void a() {
      this.a = (byte)((this.a + 1) % 25);
      this.h();
   }

   public void a(ry var1, int var2, int var3, int var4) {
      if (var1.e(var2, var3 + 1, var4) == p.a) {
         p var5 = var1.e(var2, var3 - 1, var4);
         byte var6 = 0;
         if (var5 == p.e) {
            var6 = 1;
         }

         if (var5 == p.o) {
            var6 = 2;
         }

         if (var5 == p.q) {
            var6 = 3;
         }

         if (var5 == p.d) {
            var6 = 4;
         }

         var1.f(var2, var3, var4, var6, this.a);
      }
   }
}
