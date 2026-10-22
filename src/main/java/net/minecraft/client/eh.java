package net.minecraft.client;

import net.minecraft.client.awtshim.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class eh extends xe {
   private static final Random a = new Random();
   private float b = 0.0F;
   private String c = "missingno";
   private ct d;
   private int e = 0;
   private int f;

   public eh() {
      try {
         ArrayList var1 = new ArrayList();
         BufferedReader var2 = new BufferedReader(new InputStreamReader(net.minecraft.client.web.ResourceIO.getTextResourceAsStream("/title/splashes.txt"), Charset.forName("UTF-8")));
         String var3 = "";

         while((var3 = var2.readLine()) != null) {
            var3 = var3.trim();
            if (var3.length() > 0) {
               var1.add(var3);
            }
         }

         do {
            this.c = (String)var1.get(a.nextInt(var1.size()));
         } while(this.c.hashCode() == 125780783);
      } catch (Exception var4) {
      }

      this.b = a.nextFloat();
   }

   public void s_() {
      ++this.e;
   }

   public boolean b() {
      return false;
   }

   protected void a(char var1, int var2) {
   }

   public void a() {
      this.f = this.l.p.a(new BufferedImage(256, 256, 2));
      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      if (var1.get(2) + 1 == 11 && var1.get(5) == 9) {
         this.c = "Happy birthday, ez!";
      } else if (var1.get(2) + 1 == 6 && var1.get(5) == 1) {
         this.c = "Happy birthday, Notch!";
      } else if (var1.get(2) + 1 == 12 && var1.get(5) == 24) {
         this.c = "Merry X-mas!";
      } else if (var1.get(2) + 1 == 1 && var1.get(5) == 1) {
         this.c = "Happy new year!";
      }

      qp var2 = qp.a();
      int var4 = this.n / 4 + 48;
      this.o.add(new ct(1, this.m / 2 - 100, var4, var2.a("menu.singleplayer")));
      this.o.add(this.d = new ct(2, this.m / 2 - 100, var4 + 24, var2.a("menu.multiplayer")));
      this.o.add(new ct(3, this.m / 2 - 100, var4 + 48, var2.a("menu.mods")));
      if (this.l.n) {
         this.o.add(new ct(0, this.m / 2 - 100, var4 + 72, var2.a("menu.options")));
      } else {
         this.o.add(new ct(0, this.m / 2 - 100, var4 + 72 + 12, 98, 20, var2.a("menu.options")));
         this.o.add(new ct(4, this.m / 2 + 2, var4 + 72 + 12, 98, 20, var2.a("menu.quit")));
      }

      if (this.l.k == null) {
         this.d.g = false;
      }

   }

   protected void a(ct var1) {
      if (var1.f == 0) {
         this.l.a((xe)(new ex(this, this.l.A)));
      }

      if (var1.f == 1) {
         this.l.a((xe)(new xz(this)));
      }

      if (var1.f == 2) {
         this.l.a((xe)(new xi(this)));
      }

      if (var1.f == 3) {
         this.l.a((xe)(new lb(this)));
      }

      if (var1.f == 4) {
         this.l.f();
      }

   }

   private void b(int var1, int var2, float var3) {
      cv var4 = cv.a;
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GLU.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glDisable(2884);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      byte var5 = 8;

      for(int var6 = 0; var6 < var5 * var5; ++var6) {
         GL11.glPushMatrix();
         float var7 = ((float)(var6 % var5) / (float)var5 - 0.5F) / 64.0F;
         float var8 = ((float)(var6 / var5) / (float)var5 - 0.5F) / 64.0F;
         float var9 = 0.0F;
         GL11.glTranslatef(var7, var8, var9);
         GL11.glRotatef(me.a(((float)this.e + var3) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-((float)this.e + var3) * 0.1F, 0.0F, 1.0F, 0.0F);

         for(int var10 = 0; var10 < 6; ++var10) {
            GL11.glPushMatrix();
            if (var10 == 1) {
               GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var10 == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var10 == 3) {
               GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var10 == 4) {
               GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var10 == 5) {
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            GL11.glBindTexture(3553, this.l.p.b("/title/bg/panorama" + var10 + ".png"));
            var4.b();
            var4.a(16777215, 255 / (var6 + 1));
            float var11 = 0.0F;
            var4.a((double)-1.0F, (double)-1.0F, (double)1.0F, (double)(0.0F + var11), (double)(0.0F + var11));
            var4.a((double)1.0F, (double)-1.0F, (double)1.0F, (double)(1.0F - var11), (double)(0.0F + var11));
            var4.a((double)1.0F, (double)1.0F, (double)1.0F, (double)(1.0F - var11), (double)(1.0F - var11));
            var4.a((double)-1.0F, (double)1.0F, (double)1.0F, (double)(0.0F + var11), (double)(1.0F - var11));
            var4.a();
            GL11.glPopMatrix();
         }

         GL11.glPopMatrix();
         GL11.glColorMask(true, true, true, false);
      }

      var4.b((double)0.0F, (double)0.0F, (double)0.0F);
      GL11.glColorMask(true, true, true, true);
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
      GL11.glEnable(2884);
      GL11.glEnable(3008);
      GL11.glEnable(2929);
   }

   private void a(float var1) {
      GL11.glBindTexture(3553, this.f);
      GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColorMask(true, true, true, false);
      cv var2 = cv.a;
      var2.b();
      byte var3 = 3;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.a(1.0F, 1.0F, 1.0F, 1.0F / (float)(var4 + 1));
         int var5 = this.m;
         int var6 = this.n;
         float var7 = (float)(var4 - var3 / 2) / 256.0F;
         var2.a((double)var5, (double)var6, (double)this.i, (double)(0.0F + var7), (double)0.0F);
         var2.a((double)var5, (double)0.0F, (double)this.i, (double)(1.0F + var7), (double)0.0F);
         var2.a((double)0.0F, (double)0.0F, (double)this.i, (double)(1.0F + var7), (double)1.0F);
         var2.a((double)0.0F, (double)var6, (double)this.i, (double)(0.0F + var7), (double)1.0F);
      }

      var2.a();
      GL11.glColorMask(true, true, true, true);
   }

   private void c(int var1, int var2, float var3) {
      GL11.glViewport(0, 0, 256, 256);
      this.b(var1, var2, var3);
      GL11.glDisable(3553);
      GL11.glEnable(3553);
      this.a(var3);
      this.a(var3);
      this.a(var3);
      this.a(var3);
      this.a(var3);
      this.a(var3);
      this.a(var3);
      this.a(var3);
      GL11.glViewport(0, 0, this.l.d, this.l.e);
      cv var4 = cv.a;
      var4.b();
      float var5 = this.m > this.n ? 120.0F / (float)this.m : 120.0F / (float)this.n;
      float var6 = (float)this.n * var5 / 256.0F;
      float var7 = (float)this.m * var5 / 256.0F;
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      int var8 = this.m;
      int var9 = this.n;
      var4.a((double)0.0F, (double)var9, (double)this.i, (double)(0.5F - var6), (double)(0.5F + var7));
      var4.a((double)var8, (double)var9, (double)this.i, (double)(0.5F - var6), (double)(0.5F - var7));
      var4.a((double)var8, (double)0.0F, (double)this.i, (double)(0.5F + var6), (double)(0.5F - var7));
      var4.a((double)0.0F, (double)0.0F, (double)this.i, (double)(0.5F + var6), (double)(0.5F + var7));
      var4.a();
   }

   public void a(int var1, int var2, float var3) {
      this.c(var1, var2, var3);
      cv var4 = cv.a;
      short var5 = 274;
      int var6 = this.m / 2 - var5 / 2;
      byte var7 = 30;
      this.a(0, 0, this.m, this.n, -2130706433, 16777215);
      this.a(0, 0, this.m, this.n, 0, Integer.MIN_VALUE);
      GL11.glBindTexture(3553, this.l.p.b("/title/mclogo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if ((double)this.b < 1.0E-4) {
         this.b(var6 + 0, var7 + 0, 0, 0, 99, 44);
         this.b(var6 + 99, var7 + 0, 129, 0, 27, 44);
         this.b(var6 + 99 + 26, var7 + 0, 126, 0, 3, 44);
         this.b(var6 + 99 + 26 + 3, var7 + 0, 99, 0, 26, 44);
         this.b(var6 + 155, var7 + 0, 0, 45, 155, 44);
      } else {
         this.b(var6 + 0, var7 + 0, 0, 0, 155, 44);
         this.b(var6 + 155, var7 + 0, 0, 45, 155, 44);
      }

      var4.c(16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.m / 2 + 90), 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      float var8 = 1.8F - me.e(me.a((float)(System.currentTimeMillis() % 1000L) / 1000.0F * (float)Math.PI * 2.0F) * 0.1F);
      var8 = var8 * 100.0F / (float)(this.q.a(this.c) + 32);
      GL11.glScalef(var8, var8, var8);
      this.a(this.q, this.c, 0, -8, 16776960);
      GL11.glPopMatrix();
      this.b(this.q, "Minecraft 1.0.0", 2, this.n - 10, 16777215);
      String var9 = "Copyright Mojang AB. Do not distribute!";
      this.b(this.q, var9, this.m - this.q.a(var9) - 2, this.n - 10, 16777215);
      super.a(var1, var2, var3);
   }
}
