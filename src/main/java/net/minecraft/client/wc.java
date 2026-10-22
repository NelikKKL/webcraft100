package net.minecraft.client;

public class wc extends ia {
   private int a;
   protected float b;
   protected float c;
   protected int d = 0;
   protected int e = 0;
   protected float f;
   protected float g;
   protected float h;
   protected float i;
   protected float aq;
   public static double ar;
   public static double as;
   public static double at;

   public wc(ry var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(0.2F, 0.2F);
      this.L = this.N / 2.0F;
      this.d(var2, var4, var6);
      this.h = this.i = this.aq = 1.0F;
      this.v = var8 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.4F);
      this.w = var10 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.4F);
      this.x = var12 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.4F);
      float var14 = (float)(Math.random() + Math.random() + (double)1.0F) * 0.15F;
      float var15 = me.a(this.v * this.v + this.w * this.w + this.x * this.x);
      this.v = this.v / (double)var15 * (double)var14 * (double)0.4F;
      this.w = this.w / (double)var15 * (double)var14 * (double)0.4F + (double)0.1F;
      this.x = this.x / (double)var15 * (double)var14 * (double)0.4F;
      this.b = this.Y.nextFloat() * 3.0F;
      this.c = this.Y.nextFloat() * 3.0F;
      this.f = (this.Y.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.e = (int)(4.0F / (this.Y.nextFloat() * 0.9F + 0.1F));
      this.d = 0;
   }

   public wc d(float var1) {
      this.v *= (double)var1;
      this.w = (this.w - (double)0.1F) * (double)var1 + (double)0.1F;
      this.x *= (double)var1;
      return this;
   }

   public wc e(float var1) {
      this.a(0.2F * var1, 0.2F * var1);
      this.f *= var1;
      return this;
   }

   public void b(float var1, float var2, float var3) {
      this.h = var1;
      this.i = var2;
      this.aq = var3;
   }

   public float h() {
      return this.h;
   }

   public float i() {
      return this.i;
   }

   public float j() {
      return this.aq;
   }

   protected boolean d_() {
      return false;
   }

   protected void b() {
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.d++ >= this.e) {
         this.v();
      }

      this.w -= 0.04 * (double)this.g;
      this.b(this.v, this.w, this.x);
      this.v *= (double)0.98F;
      this.w *= (double)0.98F;
      this.x *= (double)0.98F;
      if (this.D) {
         this.v *= (double)0.7F;
         this.x *= (double)0.7F;
      }

   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)(this.a % 16) / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = (float)(this.a / 16) / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.f;
      float var13 = (float)(this.p + (this.s - this.p) * (double)var2 - ar);
      float var14 = (float)(this.q + (this.t - this.q) * (double)var2 - as);
      float var15 = (float)(this.r + (this.u - this.r) * (double)var2 - at);
      float var16 = 1.0F;
      var1.a(this.h * var16, this.i * var16, this.aq * var16);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var9, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var8, (double)var11);
   }

   public int g() {
      return 0;
   }

   public void a(ik var1) {
   }

   public void b(ik var1) {
   }

   public void c(int var1) {
      this.a = var1;
   }

   public int k() {
      return this.a;
   }
}
