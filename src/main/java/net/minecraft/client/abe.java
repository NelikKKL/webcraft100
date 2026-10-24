package net.minecraft.client;

import net.minecraft.client.awtshim.BufferedImage;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.Random;
import net.minecraft.client.awtshim.ImageIO;
import org.lwjgl.opengl.GL11;

public class abe {
   private int[] d = new int[256];
   public int a = 0;
   public int b = 8;
   private int e;
   private IntBuffer f = bt.d(1024);
   public Random c = new net.minecraft.client.web.JRandom();

   public abe(ki var1, String var2, zh var3) {
      BufferedImage var4;
      try {
         var4 = ImageIO.read(net.minecraft.client.web.ResourceIO.getImageResourceAsStream(var2));
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      int var5 = var4.getWidth();
      int var6 = var4.getHeight();
      int[] var7 = new int[var5 * var6];
      var4.getRGB(0, 0, var5, var6, var7, 0, var5);

      for(int var8 = 0; var8 < 256; ++var8) {
         int var9 = var8 % 16;
         int var10 = var8 / 16;

         int var11;
         for(var11 = 7; var11 >= 0; --var11) {
            int var12 = var9 * 8 + var11;
            boolean var13 = true;

            for(int var14 = 0; var14 < 8 && var13; ++var14) {
               int var15 = (var10 * 8 + var14) * var5;
               int var16 = var7[var12 + var15] & 255;
               if (var16 > 0) {
                  var13 = false;
               }
            }

            if (!var13) {
               break;
            }
         }

         if (var8 == 32) {
            var11 = 2;
         }

         this.d[var8] = var11 + 2;
      }

      this.a = var3.a(var4);
      this.e = bt.a(288);
      cv var19 = cv.a;

      for(int var20 = 0; var20 < 256; ++var20) {
         GL11.glNewList(this.e + var20, 4864);
         var19.b();
         int var22 = var20 % 16 * 8;
         int var24 = var20 / 16 * 8;
         float var26 = 7.99F;
         float var28 = 0.0F;
         float var30 = 0.0F;
         var19.a((double)0.0F, (double)(0.0F + var26), (double)0.0F, (double)((float)var22 / 128.0F + var28), (double)(((float)var24 + var26) / 128.0F + var30));
         var19.a((double)(0.0F + var26), (double)(0.0F + var26), (double)0.0F, (double)(((float)var22 + var26) / 128.0F + var28), (double)(((float)var24 + var26) / 128.0F + var30));
         var19.a((double)(0.0F + var26), (double)0.0F, (double)0.0F, (double)(((float)var22 + var26) / 128.0F + var28), (double)((float)var24 / 128.0F + var30));
         var19.a((double)0.0F, (double)0.0F, (double)0.0F, (double)((float)var22 / 128.0F + var28), (double)((float)var24 / 128.0F + var30));
         var19.a();
         GL11.glTranslatef((float)this.d[var20], 0.0F, 0.0F);
         GL11.glEndList();
      }

      for(int var21 = 0; var21 < 32; ++var21) {
         int var23 = (var21 >> 3 & 1) * 85;
         int var25 = (var21 >> 2 & 1) * 170 + var23;
         int var27 = (var21 >> 1 & 1) * 170 + var23;
         int var29 = (var21 >> 0 & 1) * 170 + var23;
         if (var21 == 6) {
            var25 += 85;
         }

         boolean var31 = var21 >= 16;
         if (var1.g) {
            int var32 = (var25 * 30 + var27 * 59 + var29 * 11) / 100;
            int var33 = (var25 * 30 + var27 * 70) / 100;
            int var17 = (var25 * 30 + var29 * 70) / 100;
            var25 = var32;
            var27 = var33;
            var29 = var17;
         }

         if (var31) {
            var25 /= 4;
            var27 /= 4;
            var29 /= 4;
         }

         GL11.glNewList(this.e + 256 + var21, 4864);
         GL11.glColor3f((float)var25 / 255.0F, (float)var27 / 255.0F, (float)var29 / 255.0F);
         GL11.glEndList();
      }

   }

   public void a(String var1, int var2, int var3, int var4) {
      this.a(var1, var2 + 1, var3 + 1, var4, true);
      this.b(var1, var2, var3, var4);
   }

   public void b(String var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, false);
   }

   public void a(String var1, int var2, int var3, int var4, boolean var5) {
      if (var1 != null) {
         boolean var6 = false;
         if (var5) {
            int var7 = var4 & -16777216;
            var4 = (var4 & 16579836) >> 2;
            var4 += var7;
         }

         GL11.glBindTexture(3553, this.a);
         float var12 = (float)(var4 >> 16 & 255) / 255.0F;
         float var8 = (float)(var4 >> 8 & 255) / 255.0F;
         float var9 = (float)(var4 & 255) / 255.0F;
         float var10 = (float)(var4 >> 24 & 255) / 255.0F;
         if (var10 == 0.0F) {
            var10 = 1.0F;
         }

         GL11.glColor4f(var12, var8, var9, var10);
         this.f.clear();
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var3, 0.0F);

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            for(; var1.length() > var13 + 1 && var1.charAt(var13) == 167; var13 += 2) {
               char var14 = var1.toLowerCase().charAt(var13 + 1);
               if (var14 == 'k') {
                  var6 = true;
               } else {
                  var6 = false;
                  int var16 = "0123456789abcdef".indexOf(var14);
                  if (var16 < 0 || var16 > 15) {
                     var16 = 15;
                  }

                  this.f.put(this.e + 256 + var16 + (var5 ? 16 : 0));
                  if (this.f.remaining() == 0) {
                     this.f.flip();
                     GL11.glCallLists(this.f);
                     this.f.clear();
                  }
               }
            }

            if (var13 < var1.length()) {
               int var15 = age.a.indexOf(var1.charAt(var13));
               if (var15 >= 0) {
                  if (!var6) {
                     this.f.put(this.e + var15 + 32);
                  } else {
                     int var17 = 0;

                     do {
                        var17 = this.c.nextInt(age.a.length());
                     } while(this.d[var15 + 32] != this.d[var17 + 32]);

                     this.f.put(this.e + 256 + this.c.nextInt(2) + 8 + (var5 ? 16 : 0));
                     this.f.put(this.e + var17 + 32);
                  }
               }
            }

            if (this.f.remaining() == 0) {
               this.f.flip();
               GL11.glCallLists(this.f);
               this.f.clear();
            }
         }

         this.f.flip();
         GL11.glCallLists(this.f);
         GL11.glPopMatrix();
      }
   }

   public int a(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (var1.charAt(var3) == 167) {
               ++var3;
            } else {
               int var4 = age.a.indexOf(var1.charAt(var3));
               if (var4 >= 0) {
                  var2 += this.d[var4 + 32];
               }
            }
         }

         return var2;
      }
   }

   public void a(String var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, false);
   }

   public void a(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      String[] var7 = var1.split("\n");
      if (var7.length > 1) {
         for(int var14 = 0; var14 < var7.length; ++var14) {
            this.a(var7[var14], var2, var3, var4, var5);
            var3 += this.a(var7[var14], var4);
         }

      } else {
         String[] var8 = var1.split(" ");
         int var9 = 0;
         String var10 = "";

         while(var9 < var8.length) {
            String var11;
            for(var11 = var10 + var8[var9++] + " "; var9 < var8.length && this.a(var11 + var8[var9]) < var4; var11 = var11 + var8[var9++] + " ") {
            }

            int var12;
            for(; this.a(var11) > var4; var11 = var10 + var11.substring(var12)) {
               for(var12 = 0; this.a(var11.substring(0, var12 + 1)) <= var4; ++var12) {
               }

               if (var11.substring(0, var12).trim().length() > 0) {
                  String var13 = var11.substring(0, var12);
                  if (var13.lastIndexOf("§") >= 0) {
                     var10 = "§" + var13.charAt(var13.lastIndexOf("§") + 1);
                  }

                  this.a(var13, var2, var3, var5, var6);
                  var3 += this.b;
               }
            }

            if (this.a(var11.trim()) > 0) {
               if (var11.lastIndexOf("§") >= 0) {
                  var10 = "§" + var11.charAt(var11.lastIndexOf("§") + 1);
               }

               this.a(var11, var2, var3, var5, var6);
               var3 += this.b;
            }
         }

      }
   }

   public int a(String var1, int var2) {
      String[] var3 = var1.split("\n");
      if (var3.length > 1) {
         int var9 = 0;

         for(int var10 = 0; var10 < var3.length; ++var10) {
            var9 += this.a(var3[var10], var2);
         }

         return var9;
      } else {
         String[] var4 = var1.split(" ");
         int var5 = 0;
         int var6 = 0;

         while(var5 < var4.length) {
            String var7;
            for(var7 = var4[var5++] + " "; var5 < var4.length && this.a(var7 + var4[var5]) < var2; var7 = var7 + var4[var5++] + " ") {
            }

            int var8;
            for(; this.a(var7) > var2; var7 = var7.substring(var8)) {
               for(var8 = 0; this.a(var7.substring(0, var8 + 1)) <= var2; ++var8) {
               }

               if (var7.substring(0, var8).trim().length() > 0) {
                  var6 += this.b;
               }
            }

            if (var7.trim().length() > 0) {
               var6 += this.b;
            }
         }

         if (var6 < this.b) {
            var6 += this.b;
         }

         return var6;
      }
   }
}
