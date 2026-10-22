package net.minecraft.client;

public class afh {
   private final int a;
   private final int b;
   private Object c;
   private boolean d;

   public afh(int var1, int var2, Object var3) {
      this.b = var2;
      this.c = var3;
      this.a = var1;
      this.d = true;
   }

   public int a() {
      return this.b;
   }

   public void a(Object var1) {
      this.c = var1;
   }

   public Object b() {
      return this.c;
   }

   public int c() {
      return this.a;
   }

   public void a(boolean var1) {
      this.d = var1;
   }
}
