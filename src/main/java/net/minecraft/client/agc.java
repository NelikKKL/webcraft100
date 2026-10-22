package net.minecraft.client;

public class agc extends bq {
   public int a;

   public void b(ik var1) {
      super.b(var1);
      this.a = var1.e("Record");
   }

   public void a(ik var1) {
      super.a(var1);
      if (this.a > 0) {
         var1.a("Record", this.a);
      }

   }
}
