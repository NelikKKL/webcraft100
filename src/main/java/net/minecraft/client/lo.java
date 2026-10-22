package net.minecraft.client;

public class lo {
   public String a;
   public String b;
   public String c;
   public String d;
   public long e;
   public boolean f = false;

   public lo(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public ik a() {
      ik var1 = new ik();
      var1.a("name", this.a);
      var1.a("ip", this.b);
      return var1;
   }

   public static lo a(ik var0) {
      return new lo(var0.i("name"), var0.i("ip"));
   }
}
