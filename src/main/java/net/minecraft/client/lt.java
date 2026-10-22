package net.minecraft.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class lt extends xe {
   private int a = 0;
   private List b;
   private int[] c;
   private int d = 0;
   private float e = 0.5F;

   public void s_() {
      ++this.a;
      float var1 = (float)(this.d + this.n + this.n + 24) / this.e;
      if ((float)this.a > var1) {
         this.e();
      }

   }

   protected void a(char var1, int var2) {
      if (var2 == 1) {
         this.e();
      }

   }

   private void e() {
      if (this.l.f.I) {
         cx var1 = (cx)this.l.h;
         var1.j();
         var1.a.c(new aep((byte)var1.bK, (byte)this.l.f.v, this.l.f.t(), this.l.f.c, 0));
      } else {
         this.l.a((xe)null);
         this.l.a(this.l.f.I, 0, true);
      }

   }

   public boolean b() {
      return true;
   }

   public void a() {
      if (this.b == null) {
         this.b = new ArrayList();

         try {
            String var1 = "";
            String var2 = "§f§k§a§b";
            BufferedReader var3 = new BufferedReader(new InputStreamReader(net.minecraft.client.web.ResourceIO.getTextResourceAsStream("/title/win.txt"), Charset.forName("UTF-8")));

            for(Random var4 = new Random(8124371L); (var1 = var3.readLine()) != null; this.b.add(var1)) {
               String var6;
               String var7;
               for(var1 = var1.replaceAll("PLAYERNAME", this.l.k.b); var1.indexOf(var2) >= 0; var1 = var6 + "§f§k" + "XXXXXXXX".substring(0, var4.nextInt(4) + 3) + var7) {
                  int var5 = var1.indexOf(var2);
                  var6 = var1.substring(0, var5);
                  var7 = var1.substring(var5 + var2.length());
               }

               if (var1.length() == 0) {
                  this.b.add(var1);
               }
            }

            for(int var15 = 0; var15 < 16; ++var15) {
               this.b.add("");
            }

            for(BufferedReader var14 = new BufferedReader(new InputStreamReader(net.minecraft.client.web.ResourceIO.getTextResourceAsStream("/title/credits.txt"), Charset.forName("UTF-8"))); (var1 = var14.readLine()) != null; this.b.add(var1)) {
               var1 = var1.replaceAll("PLAYERNAME", this.l.k.b);
               var1 = var1.replaceAll("\t", "    ");
               if (var1.length() == 0) {
                  this.b.add(var1);
               }
            }

            this.c = new int[this.b.size()];
            short var16 = 274;
            this.q.b = 12;

            for(int var17 = 0; var17 < this.b.size(); ++var17) {
               this.d += this.c[var17] = this.q.a((String)this.b.get(var17), var16);
            }

            this.q.b = 8;
         } catch (Exception var8) {
            var8.printStackTrace();
         }

      }
   }

   protected void a(ct var1) {
   }

   private void b(int var1, int var2, float var3) {
      cv var4 = cv.a;
      GL11.glBindTexture(3553, this.l.p.b("%blur%/gui/background.png"));
      var4.b();
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = this.m;
      float var6 = 0.0F - ((float)this.a + var3) * 0.5F * this.e;
      float var7 = (float)this.n - ((float)this.a + var3) * 0.5F * this.e;
      float var8 = 0.015625F;
      float var9 = ((float)this.a + var3 - 0.0F) * 0.02F;
      float var10 = (float)(this.d + this.n + this.n + 24) / this.e;
      float var11 = (var10 - 20.0F - ((float)this.a + var3)) * 0.005F;
      if (var11 < var9) {
         var9 = var11;
      }

      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= var9;
      var9 = var9 * 96.0F / 255.0F;
      var4.a(var9, var9, var9);
      var4.a((double)0.0F, (double)this.n, (double)this.i, (double)0.0F, (double)(var6 * var8));
      var4.a((double)var5, (double)this.n, (double)this.i, (double)((float)var5 * var8), (double)(var6 * var8));
      var4.a((double)var5, (double)0.0F, (double)this.i, (double)((float)var5 * var8), (double)(var7 * var8));
      var4.a((double)0.0F, (double)0.0F, (double)this.i, (double)0.0F, (double)(var7 * var8));
      var4.a();
   }

   public void a(int var1, int var2, float var3) {
      this.b(var1, var2, var3);
      cv var4 = cv.a;
      short var5 = 274;
      int var6 = this.m / 2 - var5 / 2;
      int var7 = this.n + 50;
      float var8 = -((float)this.a + var3) * this.e;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, var8, 0.0F);
      GL11.glBindTexture(3553, this.l.p.b("/title/mclogo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b(var6 + 0, var7 + 0, 0, 0, 155, 44);
      this.b(var6 + 155, var7 + 0, 0, 45, 155, 44);
      var4.c(16777215);
      this.q.b = 12;
      int var9 = var7 + 200;

      for(int var10 = 0; var10 < this.b.size(); ++var10) {
         int var11 = this.c[var10];
         if (var10 == this.b.size() - 1) {
            float var12 = (float)var9 + var8 - (float)(this.n / 2 - var11 / 2);
            if (var12 < 0.0F) {
               GL11.glTranslatef(0.0F, -var12, 0.0F);
            }
         }

         if ((float)var9 + var8 + (float)var11 + 8.0F > 0.0F && (float)var9 + var8 < (float)this.n) {
            String var15 = (String)this.b.get(var10);
            if (var15.startsWith("[C]")) {
               this.q.a(var15.substring(3), var6 + (var5 - this.q.a(var15.substring(3))) / 2, var9, 16777215);
            } else {
               this.q.c.setSeed((long)var10 * 4238972211L + (long)(this.a / 4));
               this.q.a(var15, var6 + 1, var9 + 1, var5, 16777215, true);
               this.q.c.setSeed((long)var10 * 4238972211L + (long)(this.a / 4));
               this.q.a(var15, var6, var9, var5, 16777215, false);
            }
         }

         var9 += var11;
      }

      this.q.b = 8;
      GL11.glPopMatrix();
      GL11.glBindTexture(3553, this.l.p.b("%blur%/misc/vignette.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(0, 769);
      var4.b();
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      int var13 = this.m;
      int var14 = this.n;
      var4.a((double)0.0F, (double)var14, (double)this.i, (double)0.0F, (double)1.0F);
      var4.a((double)var13, (double)var14, (double)this.i, (double)1.0F, (double)1.0F);
      var4.a((double)var13, (double)0.0F, (double)this.i, (double)1.0F, (double)0.0F);
      var4.a((double)0.0F, (double)0.0F, (double)this.i, (double)0.0F, (double)0.0F);
      var4.a();
      GL11.glDisable(3042);
      super.a(var1, var2, var3);
   }
}
