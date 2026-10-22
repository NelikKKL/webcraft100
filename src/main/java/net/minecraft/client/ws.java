package net.minecraft.client;

public class ws extends px {
   public final int h;
   public final int i;
   public final ws j;
   private final String l;
   private aal m;
   public final dk k;
   private boolean n;

   public ws(int var1, String var2, int var3, int var4, acy var5, ws var6) {
      this(var1, var2, var3, var4, new dk(var5), var6);
   }

   public ws(int var1, String var2, int var3, int var4, yy var5, ws var6) {
      this(var1, var2, var3, var4, new dk(var5), var6);
   }

   public ws(int var1, String var2, int var3, int var4, dk var5, ws var6) {
      super(5242880 + var1, hj.a("achievement." + var2));
      this.k = var5;
      this.l = hj.a("achievement." + var2 + ".desc");
      this.h = var3;
      this.i = var4;
      if (var3 < ut.a) {
         ut.a = var3;
      }

      if (var4 < ut.b) {
         ut.b = var4;
      }

      if (var3 > ut.c) {
         ut.c = var3;
      }

      if (var4 > ut.d) {
         ut.d = var4;
      }

      this.j = var6;
   }

   public ws f() {
      this.c = true;
      return this;
   }

   public ws g() {
      this.n = true;
      return this;
   }

   public ws h() {
      super.a();
      ut.e.add(this);
      return this;
   }

   public boolean c() {
      return true;
   }

   public String i() {
      return this.m != null ? this.m.a(this.l) : this.l;
   }

   public ws a(aal var1) {
      this.m = var1;
      return this;
   }

   public boolean j() {
      return this.n;
   }
}
