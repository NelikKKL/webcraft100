package net.minecraft.client;

import net.minecraft.client.awtshim.Color;
import net.minecraft.client.awtshim.Graphics;
import net.minecraft.client.awtshim.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.awtshim.ImageIO;
import org.lwjgl.opengl.GL11;

public class zh {
   public static boolean a = false;
   private HashMap d = new HashMap();
   private HashMap e = new HashMap();
   private ob f = new ob();
   private IntBuffer g = bt.d(1);
   private ByteBuffer h = bt.c(16777216);
   private List i = new ArrayList();
   private Map j = new HashMap();
   private ki k;
   public boolean b = false;
   public boolean c = false;
   private adk l;
   private BufferedImage m = new BufferedImage(64, 64, 2);

   public zh(adk var1, ki var2) {
      this.l = var1;
      this.k = var2;
      Graphics var3 = this.m.getGraphics();
      var3.setColor(Color.WHITE);
      var3.fillRect(0, 0, 64, 64);
      var3.setColor(Color.BLACK);
      var3.drawString("missingtex", 1, 10);
      var3.dispose();
   }

   public int[] a(String var1) {
      afs var2 = this.l.a;
      int[] var3 = (int[])this.e.get(var1);
      if (var3 != null) {
         return var3;
      } else {
         try {
            var3 = null;
            if (var1.startsWith("##")) {
               var3 = this.b(this.c(this.a(var2.a(var1.substring(2)))));
            } else if (var1.startsWith("%clamp%")) {
               this.b = true;
               var3 = this.b(this.a(var2.a(var1.substring(7))));
               this.b = false;
            } else if (var1.startsWith("%blur%")) {
               this.c = true;
               this.b = true;
               var3 = this.b(this.a(var2.a(var1.substring(6))));
               this.b = false;
               this.c = false;
            } else {
               InputStream var8 = var2.a(var1);
               if (var8 == null) {
                  var3 = this.b(this.m);
               } else {
                  var3 = this.b(this.a(var8));
               }
            }

            this.e.put(var1, var3);
            return var3;
         } catch (IOException var5) {
            var5.printStackTrace();
            int[] var4 = this.b(this.m);
            this.e.put(var1, var4);
            return var4;
         }
      }
   }

   private int[] b(BufferedImage var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      int[] var4 = new int[var2 * var3];
      var1.getRGB(0, 0, var2, var3, var4, 0, var2);
      return var4;
   }

   private int[] a(BufferedImage var1, int[] var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      var1.getRGB(0, 0, var3, var4, var2, 0, var3);
      return var2;
   }

   public int b(String var1) {
      afs var2 = this.l.a;
      Integer var3 = (Integer)this.d.get(var1);
      if (var3 != null) {
         return var3;
      } else {
         try {
            this.g.clear();
            bt.a(this.g);
            int var6 = this.g.get(0);
            if (var1.startsWith("##")) {
               this.a(this.c(this.a(var2.a(var1.substring(2)))), var6);
            } else if (var1.startsWith("%clamp%")) {
               this.b = true;
               this.a(this.a(var2.a(var1.substring(7))), var6);
               this.b = false;
            } else if (var1.startsWith("%blur%")) {
               this.c = true;
               this.a(this.a(var2.a(var1.substring(6))), var6);
               this.c = false;
            } else if (var1.startsWith("%blurclamp%")) {
               this.c = true;
               this.b = true;
               this.a(this.a(var2.a(var1.substring(11))), var6);
               this.c = false;
               this.b = false;
            } else {
               InputStream var7 = var2.a(var1);
               if (var7 == null) {
                  this.a(this.m, var6);
               } else {
                  this.a(this.a(var7), var6);
               }
            }

            this.d.put(var1, var6);
            return var6;
         } catch (Exception var5) {
            var5.printStackTrace();
            bt.a(this.g);
            int var4 = this.g.get(0);
            this.a(this.m, var4);
            this.d.put(var1, var4);
            return var4;
         }
      }
   }

   private BufferedImage c(BufferedImage var1) {
      int var2 = var1.getWidth() / 16;
      BufferedImage var3 = new BufferedImage(16, var1.getHeight() * var2, 2);
      Graphics var4 = var3.getGraphics();

      for(int var5 = 0; var5 < var2; ++var5) {
         var4.drawImage(var1, -var5 * 16, var5 * var1.getHeight(), null);
      }

      var4.dispose();
      return var3;
   }

   public int a(BufferedImage var1) {
      this.g.clear();
      bt.a(this.g);
      int var2 = this.g.get(0);
      this.a(var1, var2);
      this.f.a(var2, var1);
      return var2;
   }

   public void a(BufferedImage var1, int var2) {
      GL11.glBindTexture(3553, var2);
      if (a) {
         GL11.glTexParameteri(3553, 10241, 9986);
         GL11.glTexParameteri(3553, 10240, 9728);
      } else {
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
      }

      if (this.c) {
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      if (this.b) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      int[] var5 = new int[var3 * var4];
      byte[] var6 = new byte[var3 * var4 * 4];
      var1.getRGB(0, 0, var3, var4, var5, 0, var3);

      for(int var7 = 0; var7 < var5.length; ++var7) {
         int var8 = var5[var7] >> 24 & 255;
         int var9 = var5[var7] >> 16 & 255;
         int var10 = var5[var7] >> 8 & 255;
         int var11 = var5[var7] & 255;
         if (this.k != null && this.k.g) {
            int var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
            int var13 = (var9 * 30 + var10 * 70) / 100;
            int var14 = (var9 * 30 + var11 * 70) / 100;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var6[var7 * 4 + 0] = (byte)var9;
         var6[var7 * 4 + 1] = (byte)var10;
         var6[var7 * 4 + 2] = (byte)var11;
         var6[var7 * 4 + 3] = (byte)var8;
      }

      this.h.clear();
      this.h.put(var6);
      this.h.position(0).limit(var6.length);
      GL11.glTexImage2D(3553, 0, 6408, var3, var4, 0, 6408, 5121, this.h);
      if (a) {
         for(int var18 = 1; var18 <= 4; ++var18) {
            int var19 = var3 >> var18 - 1;
            int var20 = var3 >> var18;
            int var21 = var4 >> var18;

            for(int var22 = 0; var22 < var20; ++var22) {
               for(int var23 = 0; var23 < var21; ++var23) {
                  int var24 = this.h.getInt((var22 * 2 + 0 + (var23 * 2 + 0) * var19) * 4);
                  int var25 = this.h.getInt((var22 * 2 + 1 + (var23 * 2 + 0) * var19) * 4);
                  int var15 = this.h.getInt((var22 * 2 + 1 + (var23 * 2 + 1) * var19) * 4);
                  int var16 = this.h.getInt((var22 * 2 + 0 + (var23 * 2 + 1) * var19) * 4);
                  int var17 = this.a(this.a(var24, var25), this.a(var15, var16));
                  this.h.putInt((var22 + var23 * var20) * 4, var17);
               }
            }

            GL11.glTexImage2D(3553, var18, 6408, var20, var21, 0, 6408, 5121, this.h);
         }
      }

   }

   public void a(int[] var1, int var2, int var3, int var4) {
      GL11.glBindTexture(3553, var4);
      if (a) {
         GL11.glTexParameteri(3553, 10241, 9986);
         GL11.glTexParameteri(3553, 10240, 9728);
      } else {
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
      }

      if (this.c) {
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      if (this.b) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      byte[] var5 = new byte[var2 * var3 * 4];

      for(int var6 = 0; var6 < var1.length; ++var6) {
         int var7 = var1[var6] >> 24 & 255;
         int var8 = var1[var6] >> 16 & 255;
         int var9 = var1[var6] >> 8 & 255;
         int var10 = var1[var6] & 255;
         if (this.k != null && this.k.g) {
            int var11 = (var8 * 30 + var9 * 59 + var10 * 11) / 100;
            int var12 = (var8 * 30 + var9 * 70) / 100;
            int var13 = (var8 * 30 + var10 * 70) / 100;
            var8 = var11;
            var9 = var12;
            var10 = var13;
         }

         var5[var6 * 4 + 0] = (byte)var8;
         var5[var6 * 4 + 1] = (byte)var9;
         var5[var6 * 4 + 2] = (byte)var10;
         var5[var6 * 4 + 3] = (byte)var7;
      }

      this.h.clear();
      this.h.put(var5);
      this.h.position(0).limit(var5.length);
      GL11.glTexSubImage2D(3553, 0, 0, 0, var2, var3, 6408, 5121, this.h);
   }

   public void a(int var1) {
      this.f.d(var1);
      this.g.clear();
      this.g.put(var1);
      this.g.flip();
      GL11.glDeleteTextures(this.g);
   }

   public int a(String var1, String var2) {
      aap var3 = (aap)this.j.get(var1);
      if (var3 != null && var3.a != null && !var3.d) {
         if (var3.c < 0) {
            var3.c = this.a(var3.a);
         } else {
            this.a(var3.a, var3.c);
         }

         var3.d = true;
      }

      if (var3 != null && var3.c >= 0) {
         return var3.c;
      } else {
         return var2 == null ? -1 : this.b(var2);
      }
   }

   public aap a(String var1, aaj var2) {
      aap var3 = (aap)this.j.get(var1);
      if (var3 == null) {
         this.j.put(var1, new aap(var1, var2));
      } else {
         ++var3.b;
      }

      return var3;
   }

   public void c(String var1) {
      aap var2 = (aap)this.j.get(var1);
      if (var2 != null) {
         --var2.b;
         if (var2.b == 0) {
            if (var2.c >= 0) {
               this.a(var2.c);
            }

            this.j.remove(var1);
         }
      }

   }

   public void a(dt var1) {
      this.i.add(var1);
      var1.a();
   }

   public void a() {
      int var1 = -1;

      for(int var2 = 0; var2 < this.i.size(); ++var2) {
         dt var3 = (dt)this.i.get(var2);
         var3.c = this.k.g;
         var3.a();
         this.h.clear();
         this.h.put(var3.a);
         this.h.position(0).limit(var3.a.length);
         if (var3.b != var1) {
            var3.a(this);
            var1 = var3.b;
         }

         for(int var4 = 0; var4 < var3.e; ++var4) {
            for(int var5 = 0; var5 < var3.e; ++var5) {
               GL11.glTexSubImage2D(3553, 0, var3.b % 16 * 16 + var4 * 16, var3.b / 16 * 16 + var5 * 16, 16, 16, 6408, 5121, this.h);
            }
         }
      }

   }

   private int a(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      short var5 = 255;
      if (var3 + var4 == 0) {
         var3 = 1;
         var4 = 1;
         var5 = 0;
      }

      int var6 = (var1 >> 16 & 255) * var3;
      int var7 = (var1 >> 8 & 255) * var3;
      int var8 = (var1 & 255) * var3;
      int var9 = (var2 >> 16 & 255) * var4;
      int var10 = (var2 >> 8 & 255) * var4;
      int var11 = (var2 & 255) * var4;
      int var12 = (var6 + var9) / (var3 + var4);
      int var13 = (var7 + var10) / (var3 + var4);
      int var14 = (var8 + var11) / (var3 + var4);
      return var5 << 24 | var12 << 16 | var13 << 8 | var14;
   }

   public void b() {
      afs var1 = this.l.a;

      for(Integer var3 : (Iterable<Integer>)(Iterable)(this.f.b())) {
         BufferedImage var4 = (BufferedImage)this.f.a(var3);
         this.a(var4, var3);
      }

      for(aap var11 : (Iterable<aap>)(Iterable)(this.j.values())) {
         var11.d = false;
      }

      for(String var12 : (Iterable<String>)(Iterable)(this.d.keySet())) {
         try {
            BufferedImage var14;
            if (var12.startsWith("##")) {
               var14 = this.c(this.a(var1.a(var12.substring(2))));
            } else if (var12.startsWith("%clamp%")) {
               this.b = true;
               var14 = this.a(var1.a(var12.substring(7)));
            } else if (var12.startsWith("%blur%")) {
               this.c = true;
               var14 = this.a(var1.a(var12.substring(6)));
            } else if (var12.startsWith("%blurclamp%")) {
               this.c = true;
               this.b = true;
               var14 = this.a(var1.a(var12.substring(11)));
            } else {
               var14 = this.a(var1.a(var12));
            }

            int var5 = (Integer)this.d.get(var12);
            this.a(var14, var5);
            this.c = false;
            this.b = false;
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }

      for(String var13 : (Iterable<String>)(Iterable)(this.e.keySet())) {
         try {
            BufferedImage var15;
            if (var13.startsWith("##")) {
               var15 = this.c(this.a(var1.a(var13.substring(2))));
            } else if (var13.startsWith("%clamp%")) {
               this.b = true;
               var15 = this.a(var1.a(var13.substring(7)));
            } else if (var13.startsWith("%blur%")) {
               this.c = true;
               var15 = this.a(var1.a(var13.substring(6)));
            } else {
               var15 = this.a(var1.a(var13));
            }

            this.a(var15, (int[])this.e.get(var13));
            this.c = false;
            this.b = false;
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

   }

   private BufferedImage a(InputStream var1) throws java.io.IOException {
      BufferedImage var2 = ImageIO.read(var1);
      var1.close();
      return var2;
   }

   public void b(int var1) {
      if (var1 >= 0) {
         GL11.glBindTexture(3553, var1);
      }
   }
}
