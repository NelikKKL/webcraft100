package net.minecraft.client;

public class ai extends ww {
   private int a;

   public ai(ry var1) {
      this(var1, 0);
   }

   public ai(ry var1, int var2) {
      super(var1);
      this.a = var2;
      this.ax();
      this.bw = 0.5F;
   }

   public int f_() {
      return 20;
   }

   public void c() {
      super.c();
   }

   public void a(ik var1) {
      super.a((ik)var1);
      var1.a("Profession", this.a);
   }

   public void b(ik var1) {
      super.b(var1);
      this.a = var1.e("Profession");
      this.ax();
   }

   private void ax() {
      this.aA = "/mob/villager/villager.png";
      if (this.a == 0) {
         this.aA = "/mob/villager/farmer.png";
      }

      if (this.a == 1) {
         this.aA = "/mob/villager/librarian.png";
      }

      if (this.a == 2) {
         this.aA = "/mob/villager/priest.png";
      }

      if (this.a == 3) {
         this.aA = "/mob/villager/smith.png";
      }

      if (this.a == 4) {
         this.aA = "/mob/villager/butcher.png";
      }

   }

   protected boolean d() {
      return false;
   }

   protected String e() {
      return "mob.villager.default";
   }

   protected String f() {
      return "mob.villager.defaulthurt";
   }

   protected String g() {
      return "mob.villager.defaultdeath";
   }
}
