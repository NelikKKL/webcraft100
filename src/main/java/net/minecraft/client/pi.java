package net.minecraft.client;

class pi extends vv {
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final gd b;

   pi(gd var1, de var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5);
      this.b = var1;
      this.a = var6;
   }

   public int a() {
      return 1;
   }

   public boolean a(dk var1) {
      if (var1.a() instanceof agi) {
         return ((agi)var1.a()).a == this.a;
      } else if (var1.a().bM == yy.ba.bM) {
         return this.a == 0;
      } else {
         return false;
      }
   }
}
