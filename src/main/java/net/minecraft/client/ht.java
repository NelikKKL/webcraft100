package net.minecraft.client;

import org.lwjgl.opengl.GL11;

public class ht {
   protected float i = 0.0F;

   protected void a(int var1, int var2, int var3, int var4) {
      if (var2 < var1) {
         int var5 = var1;
         var1 = var2;
         var2 = var5;
      }

      this.a(var1, var3, var2 + 1, var3 + 1, var4);
   }

   protected void b(int var1, int var2, int var3, int var4) {
      if (var3 < var2) {
         int var5 = var2;
         var2 = var3;
         var3 = var5;
      }

      this.a(var1, var2 + 1, var1 + 1, var3, var4);
   }

   protected void a(int var1, int var2, int var3, int var4, int var5) {
      if (var1 < var3) {
         int var6 = var1;
         var1 = var3;
         var3 = var6;
      }

      if (var2 < var4) {
         int var11 = var2;
         var2 = var4;
         var4 = var11;
      }

      float var12 = (float)(var5 >> 24 & 255) / 255.0F;
      float var7 = (float)(var5 >> 16 & 255) / 255.0F;
      float var8 = (float)(var5 >> 8 & 255) / 255.0F;
      float var9 = (float)(var5 & 255) / 255.0F;
      cv var10 = cv.a;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var7, var8, var9, var12);
      var10.b();
      var10.a((double)var1, (double)var4, (double)0.0F);
      var10.a((double)var3, (double)var4, (double)0.0F);
      var10.a((double)var3, (double)var2, (double)0.0F);
      var10.a((double)var1, (double)var2, (double)0.0F);
      var10.a();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   protected void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 255) / 255.0F;
      float var8 = (float)(var5 >> 16 & 255) / 255.0F;
      float var9 = (float)(var5 >> 8 & 255) / 255.0F;
      float var10 = (float)(var5 & 255) / 255.0F;
      float var11 = (float)(var6 >> 24 & 255) / 255.0F;
      float var12 = (float)(var6 >> 16 & 255) / 255.0F;
      float var13 = (float)(var6 >> 8 & 255) / 255.0F;
      float var14 = (float)(var6 & 255) / 255.0F;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      cv var15 = cv.a;
      var15.b();
      var15.a(var8, var9, var10, var7);
      var15.a((double)var3, (double)var2, (double)this.i);
      var15.a((double)var1, (double)var2, (double)this.i);
      var15.a(var12, var13, var14, var11);
      var15.a((double)var1, (double)var4, (double)this.i);
      var15.a((double)var3, (double)var4, (double)this.i);
      var15.a();
      GL11.glShadeModel(7424);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(3553);
   }

   public void a(abe var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3 - var1.a(var2) / 2, var4, var5);
   }

   public void b(abe var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, var5);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      cv var9 = cv.a;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), (double)this.i, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), (double)this.i, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), (double)this.i, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.i, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }
}
