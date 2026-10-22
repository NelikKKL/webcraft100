package net.minecraft.client;

import net.minecraft.client.awtshim.BufferedImage;
import java.io.IOException;
import net.minecraft.client.awtshim.ImageIO;
import net.minecraft.client.Minecraft;

public class aih extends dt {
   private Minecraft g;
   private int[] h = new int[256];
   private double i;
   private double j;

   public aih(Minecraft var1) {
      super(acy.aP.a(0));
      this.g = var1;
      this.f = 1;

      try {
         BufferedImage var2 = ImageIO.read("/gui/items.png");
         int var3 = this.b % 16 * 16;
         int var4 = this.b / 16 * 16;
         var2.getRGB(var3, var4, 16, 16, this.h, 0, 16);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public void a() {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.h[var1] >> 24 & 255;
         int var3 = this.h[var1] >> 16 & 255;
         int var4 = this.h[var1] >> 8 & 255;
         int var5 = this.h[var1] >> 0 & 255;
         if (this.c) {
            int var6 = (var3 * 30 + var4 * 59 + var5 * 11) / 100;
            int var7 = (var3 * 30 + var4 * 70) / 100;
            int var8 = (var3 * 30 + var5 * 70) / 100;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         this.a[var1 * 4 + 0] = (byte)var3;
         this.a[var1 * 4 + 1] = (byte)var4;
         this.a[var1 * 4 + 2] = (byte)var5;
         this.a[var1 * 4 + 3] = (byte)var2;
      }

      double var20 = (double)0.0F;
      if (this.g.f != null && this.g.h != null) {
         dh var21 = this.g.f.v();
         double var23 = (double)var21.a - this.g.h.s;
         double var25 = (double)var21.c - this.g.h.u;
         var20 = (double)(this.g.h.y - 90.0F) * Math.PI / (double)180.0F - Math.atan2(var25, var23);
         if (this.g.f.y.c) {
            var20 = Math.random() * (double)(float)Math.PI * (double)2.0F;
         }
      }

      double var22;
      for(var22 = var20 - this.i; var22 < -Math.PI; var22 += (Math.PI * 2D)) {
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

      this.j += var22 * 0.1;
      this.j *= 0.8;
      this.i += this.j;
      double var24 = Math.sin(this.i);
      double var26 = Math.cos(this.i);

      for(int var9 = -4; var9 <= 4; ++var9) {
         int var10 = (int)((double)8.5F + var26 * (double)var9 * 0.3);
         int var11 = (int)((double)7.5F - var24 * (double)var9 * 0.3 * (double)0.5F);
         int var12 = var11 * 16 + var10;
         int var13 = 100;
         int var14 = 100;
         int var15 = 100;
         short var16 = 255;
         if (this.c) {
            int var17 = (var13 * 30 + var14 * 59 + var15 * 11) / 100;
            int var18 = (var13 * 30 + var14 * 70) / 100;
            int var19 = (var13 * 30 + var15 * 70) / 100;
            var13 = var17;
            var14 = var18;
            var15 = var19;
         }

         this.a[var12 * 4 + 0] = (byte)var13;
         this.a[var12 * 4 + 1] = (byte)var14;
         this.a[var12 * 4 + 2] = (byte)var15;
         this.a[var12 * 4 + 3] = (byte)var16;
      }

      for(int var27 = -8; var27 <= 16; ++var27) {
         int var28 = (int)((double)8.5F + var24 * (double)var27 * 0.3);
         int var29 = (int)((double)7.5F + var26 * (double)var27 * 0.3 * (double)0.5F);
         int var30 = var29 * 16 + var28;
         int var31 = var27 >= 0 ? 255 : 100;
         int var32 = var27 >= 0 ? 20 : 100;
         int var33 = var27 >= 0 ? 20 : 100;
         short var34 = 255;
         if (this.c) {
            int var35 = (var31 * 30 + var32 * 59 + var33 * 11) / 100;
            int var36 = (var31 * 30 + var32 * 70) / 100;
            int var37 = (var31 * 30 + var33 * 70) / 100;
            var31 = var35;
            var32 = var36;
            var33 = var37;
         }

         this.a[var30 * 4 + 0] = (byte)var31;
         this.a[var30 * 4 + 1] = (byte)var32;
         this.a[var30 * 4 + 2] = (byte)var33;
         this.a[var30 * 4 + 3] = (byte)var34;
      }

   }
}
