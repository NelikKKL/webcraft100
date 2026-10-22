package net.minecraft.client;

public class abs extends ct {
   private final lp j;

   public abs(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, (lp)null, var4);
   }

   public abs(int var1, int var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.j = null;
   }

   public abs(int var1, int var2, int var3, lp var4, String var5) {
      super(var1, var2, var3, 150, 20, var5);
      this.j = var4;
   }

   public lp a() {
      return this.j;
   }
}
