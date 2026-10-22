package net.minecraft.client;

public abstract class afz {
   public final String i;
   private boolean a;

   public afz(String var1) {
      this.i = var1;
   }

   public abstract void a(ik var1);

   public abstract void b(ik var1);

   public void a() {
      this.a(true);
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public boolean b() {
      return this.a;
   }
}
