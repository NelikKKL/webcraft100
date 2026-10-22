package net.minecraft.client;

public enum jf {
   a(aey.class, 70, p.a, false),
   b(fx.class, 15, p.a, true),
   c(dn.class, 5, p.g, true);

   private final Class d;
   private final int e;
   private final p f;
   private final boolean g;

   private jf(Class var3, int var4, p var5, boolean var6) {
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
   }

   public Class a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public p c() {
      return this.f;
   }

   public boolean d() {
      return this.g;
   }
}
