package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class nb extends wc {
   private int a = 0;
   private int au = 0;
   private zh av;

   public nb(zh var1, ry var2, double var3, double var5, double var7) {
      super(var2, var3, var5, var7, (double)0.0F, (double)0.0F, (double)0.0F);
      this.av = var1;
      this.v = this.w = this.x = (double)0.0F;
      this.au = 200;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.a + var2) / (float)this.au;
      var8 *= var8;
      float var9 = 2.0F - var8 * 2.0F;
      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= 0.2F;
      GL11.glDisable(2896);
      float var10 = 0.125F;
      float var11 = (float)(this.s - ar);
      float var12 = (float)(this.t - as);
      float var13 = (float)(this.u - at);
      float var14 = this.o.c(me.c(this.s), me.c(this.t), me.c(this.u));
      this.av.b(this.av.b("/misc/footprint.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      var1.b();
      var1.a(var14, var14, var14, var9);
      var1.a((double)(var11 - var10), (double)var12, (double)(var13 + var10), (double)0.0F, (double)1.0F);
      var1.a((double)(var11 + var10), (double)var12, (double)(var13 + var10), (double)1.0F, (double)1.0F);
      var1.a((double)(var11 + var10), (double)var12, (double)(var13 - var10), (double)1.0F, (double)0.0F);
      var1.a((double)(var11 - var10), (double)var12, (double)(var13 - var10), (double)0.0F, (double)0.0F);
      var1.a();
      GL11.glDisable(3042);
      GL11.glEnable(2896);
   }

   public void a() {
      ++this.a;
      if (this.a == this.au) {
         this.v();
      }

   }

   public int g() {
      return 3;
   }
}
