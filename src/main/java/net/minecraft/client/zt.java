package net.minecraft.client;

public class zt extends yy {
   protected boolean cb;

   protected zt(int var1, int var2, p var3, boolean var4) {
      super(var1, var2, var3);
      this.cb = var4;
   }

   public boolean a() {
      return false;
   }

   public boolean a_(kq var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.a(var2, var3, var4);
      return !this.cb && var6 == this.bM ? false : super.a_(var1, var2, var3, var4, var5);
   }
}
