package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ail extends wc {
   private int a = 0;
   private int au = 0;
   private zh av;
   private float aw;

   public ail(zh var1, ry var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super(var2, var3, var5, var7, (double)0.0F, (double)0.0F, (double)0.0F);
      this.av = var1;
      this.au = 6 + this.Y.nextInt(4);
      this.h = this.i = this.aq = this.Y.nextFloat() * 0.6F + 0.4F;
      this.aw = 1.0F - (float)var9 * 0.5F;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = (int)(((float)this.a + var2) * 15.0F / (float)this.au);
      if (var8 <= 15) {
         this.av.b(this.av.b("/misc/explosion.png"));
         float var9 = (float)(var8 % 4) / 4.0F;
         float var10 = var9 + 0.24975F;
         float var11 = (float)(var8 / 4) / 4.0F;
         float var12 = var11 + 0.24975F;
         float var13 = 2.0F * this.aw;
         float var14 = (float)(this.p + (this.s - this.p) * (double)var2 - ar);
         float var15 = (float)(this.q + (this.t - this.q) * (double)var2 - as);
         float var16 = (float)(this.r + (this.u - this.r) * (double)var2 - at);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(2896);
         rt.a();
         var1.b();
         var1.a(this.h, this.i, this.aq, 1.0F);
         var1.b(0.0F, 1.0F, 0.0F);
         var1.b(240);
         var1.a((double)(var14 - var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 - var5 * var13 - var7 * var13), (double)var10, (double)var12);
         var1.a((double)(var14 - var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 - var5 * var13 + var7 * var13), (double)var10, (double)var11);
         var1.a((double)(var14 + var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 + var5 * var13 + var7 * var13), (double)var9, (double)var11);
         var1.a((double)(var14 + var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 + var5 * var13 - var7 * var13), (double)var9, (double)var12);
         var1.a();
         GL11.glPolygonOffset(0.0F, 0.0F);
         GL11.glEnable(2896);
      }
   }

   public int a(float var1) {
      return 61680;
   }

   public void a() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      ++this.a;
      if (this.a == this.au) {
         this.v();
      }

   }

   public int g() {
      return 3;
   }
}
