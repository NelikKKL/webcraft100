package net.minecraft.client;

public class wq {
   public boolean a = false;
   public boolean b = false;
   public boolean c = false;
   public boolean d = false;

   public void a(ik var1) {
      ik var2 = new ik();
      var2.a("invulnerable", this.a);
      var2.a("flying", this.a);
      var2.a("mayfly", this.c);
      var2.a("instabuild", this.d);
      var1.a("abilities", (um)var2);
   }

   public void b(ik var1) {
      if (var1.b("abilities")) {
         ik var2 = var1.k("abilities");
         this.a = var2.m("invulnerable");
         this.b = var2.m("flying");
         this.c = var2.m("mayfly");
         this.d = var2.m("instabuild");
      }

   }
}
