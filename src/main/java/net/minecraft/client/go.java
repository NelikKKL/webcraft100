package net.minecraft.client;

public class go extends xe {
   private xe a;
   private String b;
   private String c;
   private String d;
   private String e;
   private int f;

   public go(xe var1, String var2, String var3, String var4, String var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public void a() {
      this.o.add(new abs(0, this.m / 2 - 155 + 0, this.n / 6 + 96, this.d));
      this.o.add(new abs(1, this.m / 2 - 155 + 160, this.n / 6 + 96, this.e));
   }

   protected void a(ct var1) {
      this.a.a(var1.f == 0, this.f);
   }

   public void a(int var1, int var2, float var3) {
      this.j();
      this.a(this.q, this.b, this.m / 2, 70, 16777215);
      this.a(this.q, this.c, this.m / 2, 90, 16777215);
      super.a(var1, var2, var3);
   }
}
