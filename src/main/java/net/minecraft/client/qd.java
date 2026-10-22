package net.minecraft.client;

import net.minecraft.client.awtshim.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class qd extends ht {
   private static iw d = new iw();
   private List e = new ArrayList();
   private Random f = new Random();
   private Minecraft g;
   public String a = null;
   private int h = 0;
   private String j = "";
   private int k = 0;
   private boolean l = false;
   public float b;
   float c = 1.0F;

   public qd(Minecraft var1) {
      this.g = var1;
   }

   public void a(float var1, boolean var2, int var3, int var4) {
      ef var5 = new ef(this.g.A, this.g.d, this.g.e);
      int var6 = var5.a();
      int var7 = var5.b();
      abe var8 = this.g.q;
      this.g.u.b();
      GL11.glEnable(3042);
      if (Minecraft.s()) {
         this.a(this.g.h.b(var1), var6, var7);
      } else {
         GL11.glBlendFunc(770, 771);
      }

      dk var9 = this.g.h.by.e(3);
      if (this.g.A.E == 0 && var9 != null && var9.c == yy.ba.bM) {
         this.a(var6, var7);
      }

      if (!this.g.h.a((abg)abg.k)) {
         float var10 = this.g.h.cb + (this.g.h.ca - this.g.h.cb) * var1;
         if (var10 > 0.0F) {
            this.b(var10, var6, var7);
         }
      }

      if (!this.g.c.i()) {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glBindTexture(3553, this.g.p.b("/gui/gui.png"));
         x var31 = this.g.h.by;
         this.i = -90.0F;
         this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
         this.b(var6 / 2 - 91 - 1 + var31.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
         GL11.glBindTexture(3553, this.g.p.b("/gui/icons.png"));
         GL11.glEnable(3042);
         GL11.glBlendFunc(775, 769);
         this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
         GL11.glDisable(3042);
         boolean var11 = this.g.h.ac / 3 % 2 == 1;
         if (this.g.h.ac < 10) {
            var11 = false;
         }

         int var12 = this.g.h.ag();
         int var13 = this.g.h.aN;
         this.f.setSeed((long)(this.h * 312871));
         boolean var14 = false;
         eq var15 = this.g.h.aO();
         int var16 = var15.a();
         int var17 = var15.b();
         this.c();
         if (this.g.c.a()) {
            int var18 = var6 / 2 - 91;
            int var19 = var6 / 2 + 91;
            int var20 = this.g.h.aN();
            if (var20 > 0) {
               short var21 = 182;
               int var22 = (int)(this.g.h.cf * (float)(var21 + 1));
               int var23 = var7 - 32 + 3;
               this.b(var18, var23, 0, 64, var21, 5);
               if (var22 > 0) {
                  this.b(var18, var23, 0, 69, var22, 5);
               }
            }

            int var72 = var7 - 39;
            int var74 = var72 - 10;
            int var76 = this.g.h.p();
            int var24 = -1;
            if (this.g.h.a((abg)abg.l)) {
               var24 = this.h % 25;
            }

            for(int var25 = 0; var25 < 10; ++var25) {
               if (var76 > 0) {
                  int var26 = var18 + var25 * 8;
                  if (var25 * 2 + 1 < var76) {
                     this.b(var26, var74, 34, 9, 9, 9);
                  }

                  if (var25 * 2 + 1 == var76) {
                     this.b(var26, var74, 25, 9, 9, 9);
                  }

                  if (var25 * 2 + 1 > var76) {
                     this.b(var26, var74, 16, 9, 9, 9);
                  }
               }

               int var85 = 16;
               if (this.g.h.a((abg)abg.u)) {
                  var85 += 36;
               }

               byte var27 = 0;
               if (var11) {
                  var27 = 1;
               }

               int var28 = var18 + var25 * 8;
               int var29 = var72;
               if (var12 <= 4) {
                  var29 = var72 + this.f.nextInt(2);
               }

               if (var25 == var24) {
                  var29 -= 2;
               }

               byte var30 = 0;
               if (this.g.f.z().s()) {
                  var30 = 5;
               }

               this.b(var28, var29, 16 + var27 * 9, 9 * var30, 9, 9);
               if (var11) {
                  if (var25 * 2 + 1 < var13) {
                     this.b(var28, var29, var85 + 54, 9 * var30, 9, 9);
                  }

                  if (var25 * 2 + 1 == var13) {
                     this.b(var28, var29, var85 + 63, 9 * var30, 9, 9);
                  }
               }

               if (var25 * 2 + 1 < var12) {
                  this.b(var28, var29, var85 + 36, 9 * var30, 9, 9);
               }

               if (var25 * 2 + 1 == var12) {
                  this.b(var28, var29, var85 + 45, 9 * var30, 9, 9);
               }
            }

            for(int var80 = 0; var80 < 10; ++var80) {
               int var86 = var72;
               int var88 = 16;
               byte var90 = 0;
               if (this.g.h.a((abg)abg.s)) {
                  var88 += 36;
                  var90 = 13;
               }

               if (this.g.h.aO().d() <= 0.0F && this.h % (var16 * 3 + 1) == 0) {
                  var86 = var72 + (this.f.nextInt(3) - 1);
               }

               if (var14) {
                  var90 = 1;
               }

               int var91 = var19 - var80 * 8 - 9;
               this.b(var91, var86, 16 + var90 * 9, 27, 9, 9);
               if (var14) {
                  if (var80 * 2 + 1 < var17) {
                     this.b(var91, var86, var88 + 54, 27, 9, 9);
                  }

                  if (var80 * 2 + 1 == var17) {
                     this.b(var91, var86, var88 + 63, 27, 9, 9);
                  }
               }

               if (var80 * 2 + 1 < var16) {
                  this.b(var91, var86, var88 + 36, 27, 9, 9);
               }

               if (var80 * 2 + 1 == var16) {
                  this.b(var91, var86, var88 + 45, 27, 9, 9);
               }
            }

            if (this.g.h.a((p)p.g)) {
               int var81 = (int)Math.ceil((double)(this.g.h.Z() - 2) * (double)10.0F / (double)300.0F);
               int var87 = (int)Math.ceil((double)this.g.h.Z() * (double)10.0F / (double)300.0F) - var81;

               for(int var89 = 0; var89 < var81 + var87; ++var89) {
                  if (var89 < var81) {
                     this.b(var19 - var89 * 8 - 9, var74, 16, 18, 9, 9);
                  } else {
                     this.b(var19 - var89 * 8 - 9, var74, 25, 18, 9, 9);
                  }
               }
            }
         }

         GL11.glDisable(3042);
         GL11.glEnable(32826);
         rt.c();

         for(int var63 = 0; var63 < 9; ++var63) {
            int var68 = var6 / 2 - 90 + var63 * 20 + 2;
            int var70 = var7 - 16 - 3;
            this.a(var63, var68, var70, var1);
         }

         rt.a();
         GL11.glDisable(32826);
      }

      if (this.g.h.aL() > 0) {
         GL11.glDisable(2929);
         GL11.glDisable(3008);
         int var32 = this.g.h.aL();
         float var37 = (float)var32 / 100.0F;
         if (var37 > 1.0F) {
            var37 = 1.0F - (float)(var32 - 100) / 10.0F;
         }

         int var41 = (int)(220.0F * var37) << 24 | 1052704;
         this.a(0, 0, var6, var7, var41);
         GL11.glEnable(3008);
         GL11.glEnable(2929);
      }

      if (this.g.c.e() && this.g.h.cd > 0) {
         boolean var33 = false;
         int var38 = var33 ? 16777215 : 8453920;
         String var42 = "" + this.g.h.cd;
         int var47 = (var6 - var8.a(var42)) / 2;
         int var53 = var7 - 31 - 4;
         var8.b(var42, var47 + 1, var53, 0);
         var8.b(var42, var47 - 1, var53, 0);
         var8.b(var42, var47, var53 + 1, 0);
         var8.b(var42, var47, var53 - 1, 0);
         var8.b(var42, var47, var53, var38);
      }

      if (this.g.A.F) {
         GL11.glPushMatrix();
         if (Minecraft.J > 0L) {
            GL11.glTranslatef(0.0F, 32.0F, 0.0F);
         }

         var8.a("Minecraft 1.0.0 (" + this.g.M + ")", 2, 2, 16777215);
         var8.a(this.g.m(), 2, 12, 16777215);
         var8.a(this.g.n(), 2, 22, 16777215);
         var8.a(this.g.p(), 2, 32, 16777215);
         var8.a(this.g.o(), 2, 42, 16777215);
         long var34 = Runtime.getRuntime().maxMemory();
         long var43 = Runtime.getRuntime().totalMemory();
         long var54 = Runtime.getRuntime().freeMemory();
         long var58 = var43 - var54;
         String var64 = "Used memory: " + var58 * 100L / var34 + "% (" + var58 / 1024L / 1024L + "MB) of " + var34 / 1024L / 1024L + "MB";
         this.b(var8, var64, var6 - var8.a(var64) - 2, 2, 14737632);
         var64 = "Allocated memory: " + var43 * 100L / var34 + "% (" + var43 / 1024L / 1024L + "MB)";
         this.b(var8, var64, var6 - var8.a(var64) - 2, 12, 14737632);
         this.b(var8, "x: " + this.g.h.s, 2, 64, 14737632);
         this.b(var8, "y: " + this.g.h.t, 2, 72, 14737632);
         this.b(var8, "z: " + this.g.h.u, 2, 80, 14737632);
         this.b(var8, "f: " + (me.c((double)(this.g.h.y * 4.0F / 360.0F) + (double)0.5F) & 3), 2, 88, 14737632);
         this.b(var8, "Seed: " + this.g.f.t(), 2, 104, 14737632);
         GL11.glPopMatrix();
      }

      if (this.k > 0) {
         float var35 = (float)this.k - var1;
         int var39 = (int)(var35 * 256.0F / 20.0F);
         if (var39 > 255) {
            var39 = 255;
         }

         if (var39 > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            int var44 = 16777215;
            if (this.l) {
               var44 = Color.HSBtoRGB(var35 / 50.0F, 0.7F, 0.6F) & 16777215;
            }

            var8.b(this.j, -var8.a(this.j) / 2, -4, var44 + (var39 << 24));
            GL11.glDisable(3042);
            GL11.glPopMatrix();
         }
      }

      byte var36 = 10;
      boolean var40 = false;
      if (this.g.s instanceof gx) {
         var36 = 20;
         var40 = true;
      }

      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);

      for(int var45 = 0; var45 < this.e.size() && var45 < var36; ++var45) {
         if (((ahe)this.e.get(var45)).b < 200 || var40) {
            double var48 = (double)((ahe)this.e.get(var45)).b / (double)200.0F;
            var48 = (double)1.0F - var48;
            var48 *= (double)10.0F;
            if (var48 < (double)0.0F) {
               var48 = (double)0.0F;
            }

            if (var48 > (double)1.0F) {
               var48 = (double)1.0F;
            }

            var48 *= var48;
            int var56 = (int)((double)255.0F * var48);
            if (var40) {
               var56 = 255;
            }

            if (var56 > 0) {
               byte var59 = 2;
               int var61 = -var45 * 9;
               String var66 = ((ahe)this.e.get(var45)).a;
               this.a(var59, var61 - 1, var59 + 320, var61 + 8, var56 / 2 << 24);
               GL11.glEnable(3042);
               var8.a(var66, var59, var61, 16777215 + (var56 << 24));
            }
         }
      }

      GL11.glPopMatrix();
      if (this.g.h instanceof cx && this.g.A.y.e) {
         abp var46 = ((cx)this.g.h).a;
         List var52 = var46.c;
         int var55 = var46.d;
         int var57 = var55;

         int var60;
         for(var60 = 1; var57 > 20; var57 = (var55 + var60 - 1) / var60) {
            ++var60;
         }

         int var62 = 300 / var60;
         if (var62 > 150) {
            var62 = 150;
         }

         int var67 = (var6 - var60 * var62) / 2;
         byte var69 = 10;
         this.a(var67 - 1, var69 - 1, var67 + var62 * var60, var69 + 9 * var57, Integer.MIN_VALUE);

         for(int var71 = 0; var71 < var55; ++var71) {
            int var73 = var67 + var71 % var60 * var62;
            int var75 = var69 + var71 / var60 * 9;
            this.a(var73, var75, var73 + var62 - 1, var75 + 8, 553648127);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3008);
            if (var71 < var52.size()) {
               ao var77 = (ao)var52.get(var71);
               var8.a(var77.a, var73, var75, 16777215);
               this.g.p.b(this.g.p.b("/gui/icons.png"));
               byte var78 = 0;
               byte var82 = 0;
               var78 = 0;
               var82 = 0;
               if (var77.b < 0) {
                  var82 = 5;
               } else if (var77.b < 150) {
                  var82 = 0;
               } else if (var77.b < 300) {
                  var82 = 1;
               } else if (var77.b < 600) {
                  var82 = 2;
               } else if (var77.b < 1000) {
                  var82 = 3;
               } else {
                  var82 = 4;
               }

               this.i += 100.0F;
               this.b(var73 + var62 - 12, var75, 0 + var78 * 10, 176 + var82 * 8, 10, 8);
               this.i -= 100.0F;
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3008);
   }

   private void c() {
      if (ado.a != null) {
         oo var1 = ado.a;
         ado.a = null;
         abe var2 = this.g.q;
         ef var3 = new ef(this.g.A, this.g.d, this.g.e);
         int var4 = var3.a();
         short var5 = 182;
         int var6 = var4 / 2 - var5 / 2;
         int var7 = (int)((float)var1.ax() / (float)var1.f_() * (float)(var5 + 1));
         byte var8 = 12;
         this.b(var6, var8, 0, 74, var5, 5);
         this.b(var6, var8, 0, 74, var5, 5);
         if (var7 > 0) {
            this.b(var6, var8, 0, 79, var7, 5);
         }

         String var9 = "Boss health";
         var2.a(var9, var4 / 2 - var2.a(var9) / 2, var8 - 10, 16711935);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glBindTexture(3553, this.g.p.b("/gui/icons.png"));
      }
   }

   private void a(int var1, int var2) {
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3008);
      GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/pumpkinblur.png"));
      cv var3 = cv.a;
      var3.b();
      var3.a((double)0.0F, (double)var2, (double)-90.0F, (double)0.0F, (double)1.0F);
      var3.a((double)var1, (double)var2, (double)-90.0F, (double)1.0F, (double)1.0F);
      var3.a((double)var1, (double)0.0F, (double)-90.0F, (double)1.0F, (double)0.0F);
      var3.a((double)0.0F, (double)0.0F, (double)-90.0F, (double)0.0F, (double)0.0F);
      var3.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.c = (float)((double)this.c + (double)(var1 - this.c) * 0.01);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(0, 769);
      GL11.glColor4f(this.c, this.c, this.c, 1.0F);
      GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/vignette.png"));
      cv var4 = cv.a;
      var4.b();
      var4.a((double)0.0F, (double)var3, (double)-90.0F, (double)0.0F, (double)1.0F);
      var4.a((double)var2, (double)var3, (double)-90.0F, (double)1.0F, (double)1.0F);
      var4.a((double)var2, (double)0.0F, (double)-90.0F, (double)1.0F, (double)0.0F);
      var4.a((double)0.0F, (double)0.0F, (double)-90.0F, (double)0.0F, (double)0.0F);
      var4.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBlendFunc(770, 771);
   }

   private void b(float var1, int var2, int var3) {
      if (var1 < 1.0F) {
         var1 *= var1;
         var1 *= var1;
         var1 = var1 * 0.8F + 0.2F;
      }

      GL11.glDisable(3008);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
      GL11.glBindTexture(3553, this.g.p.b("/terrain.png"));
      float var4 = (float)(yy.be.bL % 16) / 16.0F;
      float var5 = (float)(yy.be.bL / 16) / 16.0F;
      float var6 = (float)(yy.be.bL % 16 + 1) / 16.0F;
      float var7 = (float)(yy.be.bL / 16 + 1) / 16.0F;
      cv var8 = cv.a;
      var8.b();
      var8.a((double)0.0F, (double)var3, (double)-90.0F, (double)var4, (double)var7);
      var8.a((double)var2, (double)var3, (double)-90.0F, (double)var6, (double)var7);
      var8.a((double)var2, (double)0.0F, (double)-90.0F, (double)var6, (double)var5);
      var8.a((double)0.0F, (double)0.0F, (double)-90.0F, (double)var4, (double)var5);
      var8.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(int var1, int var2, int var3, float var4) {
      dk var5 = this.g.h.by.a[var1];
      if (var5 != null) {
         float var6 = (float)var5.b - var4;
         if (var6 > 0.0F) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
         }

         d.a(this.g.q, this.g.p, var5, var2, var3);
         if (var6 > 0.0F) {
            GL11.glPopMatrix();
         }

         d.b(this.g.q, this.g.p, var5, var2, var3);
      }
   }

   public void a() {
      if (this.k > 0) {
         --this.k;
      }

      ++this.h;

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         ++((ahe)this.e.get(var1)).b;
      }

   }

   public void b() {
      this.e.clear();
   }

   public void a(String var1) {
      while(this.g.q.a(var1) > 320) {
         int var2;
         for(var2 = 1; var2 < var1.length() && this.g.q.a(var1.substring(0, var2 + 1)) <= 320; ++var2) {
         }

         this.a(var1.substring(0, var2));
         var1 = var1.substring(var2);
      }

      this.e.add(0, new ahe(var1));

      while(this.e.size() > 50) {
         this.e.remove(this.e.size() - 1);
      }

   }

   public void b(String var1) {
      this.j = "Now playing: " + var1;
      this.k = 60;
      this.l = true;
   }

   public void c(String var1) {
      qp var2 = qp.a();
      String var3 = var2.a(var1);
      this.a(var3);
   }
}
