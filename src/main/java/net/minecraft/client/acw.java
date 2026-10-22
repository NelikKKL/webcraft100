package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class acw extends wc {
   private ia a;
   private ia au;
   private int av = 0;
   private int aw = 0;
   private float ax;

   public acw(ry var1, ia var2, ia var3, float var4) {
      super(var1, var2.s, var2.t, var2.u, var2.v, var2.w, var2.x);
      this.a = var2;
      this.au = var3;
      this.aw = 3;
      this.ax = var4;
   }

   public void a(cv var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.av + var2) / (float)this.aw;
      var8 *= var8;
      double var9 = this.a.s;
      double var11 = this.a.t;
      double var13 = this.a.u;
      double var15 = this.au.R + (this.au.s - this.au.R) * (double)var2;
      double var17 = this.au.S + (this.au.t - this.au.S) * (double)var2 + (double)this.ax;
      double var19 = this.au.T + (this.au.u - this.au.T) * (double)var2;
      double var21 = var9 + (var15 - var9) * (double)var8;
      double var23 = var11 + (var17 - var11) * (double)var8;
      double var25 = var13 + (var19 - var13) * (double)var8;
      int var27 = me.c(var21);
      int var28 = me.c(var23 + (double)(this.L / 2.0F));
      int var29 = me.c(var25);
      int var30 = this.a(var2);
      int var31 = var30 % 65536;
      int var32 = var30 / 65536;
      adx.a(adx.b, (float)var31 / 1.0F, (float)var32 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var21 -= ar;
      var23 -= as;
      var25 -= at;
      wb.a.a(this.a, (double)((float)var21), (double)((float)var23), (double)((float)var25), this.a.y, var2);
   }

   public void a() {
      ++this.av;
      if (this.av == this.aw) {
         this.v();
      }

   }

   public int g() {
      return 3;
   }
}
