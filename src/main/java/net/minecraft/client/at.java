package net.minecraft.client;

import net.minecraft.client.awtshim.BufferedImage;
import java.io.IOException;
import net.minecraft.client.awtshim.ImageIO;
import net.minecraft.client.Minecraft;

public class at extends dt {
   private Minecraft g;
   private int[] h = new int[256];
   private int[] i = new int[256];
   private double j;
   private double k;

   public at(Minecraft var1) {
      super(acy.aR.a(0));
      this.g = var1;
      this.f = 1;

      try {
         BufferedImage var2 = ImageIO.read("/gui/items.png");
         int var3 = this.b % 16 * 16;
         int var4 = this.b / 16 * 16;
         var2.getRGB(var3, var4, 16, 16, this.h, 0, 16);
         var2 = ImageIO.read("/misc/dial.png");
         var2.getRGB(0, 0, 16, 16, this.i, 0, 16);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public void a() {
      double var1 = (double)0.0F;
      if (this.g.f != null && this.g.h != null) {
         float var3 = this.g.f.c(1.0F);
         var1 = (double)(-var3 * (float)Math.PI * 2.0F);
         if (this.g.f.y.c) {
            var1 = Math.random() * (double)(float)Math.PI * (double)2.0F;
         }
      }

      double var22;
      for(var22 = var1 - this.j; var22 < -Math.PI; var22 += (Math.PI * 2D)) {
      }

      while(var22 >= Math.PI) {
         var22 -= (Math.PI * 2D);
      }

      if (var22 < (double)-1.0F) {
         var22 = (double)-1.0F;
      }

      if (var22 > (double)1.0F) {
         var22 = (double)1.0F;
      }

      this.k += var22 * 0.1;
      this.k *= 0.8;
      this.j += this.k;
      double var5 = Math.sin(this.j);
      double var7 = Math.cos(this.j);

      for(int var9 = 0; var9 < 256; ++var9) {
         int var10 = this.h[var9] >> 24 & 255;
         int var11 = this.h[var9] >> 16 & 255;
         int var12 = this.h[var9] >> 8 & 255;
         int var13 = this.h[var9] >> 0 & 255;
         if (var11 == var13 && var12 == 0 && var13 > 0) {
            double var14 = -((double)(var9 % 16) / (double)15.0F - (double)0.5F);
            double var16 = (double)(var9 / 16) / (double)15.0F - (double)0.5F;
            int var18 = var11;
            int var19 = (int)((var14 * var7 + var16 * var5 + (double)0.5F) * (double)16.0F);
            int var20 = (int)((var16 * var7 - var14 * var5 + (double)0.5F) * (double)16.0F);
            int var21 = (var19 & 15) + (var20 & 15) * 16;
            var10 = this.i[var21] >> 24 & 255;
            var11 = (this.i[var21] >> 16 & 255) * var11 / 255;
            var12 = (this.i[var21] >> 8 & 255) * var18 / 255;
            var13 = (this.i[var21] >> 0 & 255) * var18 / 255;
         }

         if (this.c) {
            int var23 = (var11 * 30 + var12 * 59 + var13 * 11) / 100;
            int var15 = (var11 * 30 + var12 * 70) / 100;
            int var24 = (var11 * 30 + var13 * 70) / 100;
            var11 = var23;
            var12 = var15;
            var13 = var24;
         }

         this.a[var9 * 4 + 0] = (byte)var11;
         this.a[var9 * 4 + 1] = (byte)var12;
         this.a[var9 * 4 + 2] = (byte)var13;
         this.a[var9 * 4 + 3] = (byte)var10;
      }

   }
}
