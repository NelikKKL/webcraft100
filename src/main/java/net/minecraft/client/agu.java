package net.minecraft.client;

public class agu extends acy {
   public final int a;
   private final int b;
   private final float bR;
   private final boolean bS;
   private boolean bT;
   private int bU;
   private int bV;
   private int bW;
   private float bX;

   public agu(int var1, int var2, float var3, boolean var4) {
      super(var1);
      this.a = 32;
      this.b = var2;
      this.bS = var4;
      this.bR = var3;
   }

   public agu(int var1, int var2, boolean var3) {
      this(var1, var2, 0.6F, var3);
   }

   public dk a(dk var1, ry var2, vi var3) {
      --var1.a;
      var3.aO().a(this);
      var2.a(var3, "random.burp", 0.5F, var2.w.nextFloat() * 0.1F + 0.9F);
      if (!var2.I && this.bU > 0 && var2.w.nextFloat() < this.bX) {
         var3.a((s)(new s(this.bU, this.bV * 20, this.bW)));
      }

      return var1;
   }

   public int b(dk var1) {
      return 32;
   }

   public ps c(dk var1) {
      return ps.b;
   }

   public dk c(dk var1, ry var2, vi var3) {
      if (var3.b(this.bT)) {
         var3.c(var1, this.b(var1));
      }

      return var1;
   }

   public int o() {
      return this.b;
   }

   public float p() {
      return this.bR;
   }

   public boolean q() {
      return this.bS;
   }

   public agu a(int var1, int var2, int var3, float var4) {
      this.bU = var1;
      this.bV = var2;
      this.bW = var3;
      this.bX = var4;
      return this;
   }

   public agu r() {
      this.bT = true;
      return this;
   }

   public acy a(String var1) {
      return super.a(var1);
   }
}
