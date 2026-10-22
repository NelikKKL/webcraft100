package net.minecraft.client;

class b extends jn {
   // $FF: synthetic field
   final in a;

   public b(in var1) {
      super(in.a(var1), var1.m, var1.n, 32, var1.n - 64, 10);
      this.a = var1;
      this.a(false);
   }

   protected int a() {
      return ny.c.size();
   }

   protected void a(int var1, boolean var2) {
   }

   protected boolean a(int var1) {
      return false;
   }

   protected int b() {
      return this.a() * 10;
   }

   protected void c() {
      this.a.j();
   }

   protected void a(int var1, int var2, int var3, int var4, cv var5) {
      px var6 = (px)ny.c.get(var1);
      this.a.b(in.b(this.a), var6.b, var2 + 2, var3 + 1, var1 % 2 == 0 ? 16777215 : 9474192);
      String var7 = var6.a(in.c(this.a).a(var6));
      this.a.b(in.d(this.a), var7, var2 + 2 + 213 - in.e(this.a).a(var7), var3 + 1, var1 % 2 == 0 ? 16777215 : 9474192);
   }
}
