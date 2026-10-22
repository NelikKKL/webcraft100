package net.minecraft.client;

public final class zz extends Exception {
   private final int a;
   private final int b;

   zz(String var1, if_ var2) {
      super("At line " + var2.b() + ", column " + var2.a() + ":  " + var1);
      this.a = var2.a();
      this.b = var2.b();
   }

   zz(String var1, Throwable var2, if_ var3) {
      super("At line " + var3.b() + ", column " + var3.a() + ":  " + var1, var2);
      this.a = var3.a();
      this.b = var3.b();
   }
}
