package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class f {
   protected ry a;
   private List[] b = new List[4];
   private zh c;
   private Random d = new net.minecraft.client.web.JRandom();

   public f(ry var1, zh var2) {
      if (var1 != null) {
         this.a = var1;
      }

      this.c = var2;

      for(int var3 = 0; var3 < 4; ++var3) {
         this.b[var3] = new ArrayList();
      }

   }

   public void a(wc var1) {
      int var2 = var1.g();
      if (this.b[var2].size() >= 4000) {
         this.b[var2].remove(0);
      }

      this.b[var2].add(var1);
   }

   public void a() {
      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.b[var1].size(); ++var2) {
            wc var3 = (wc)this.b[var1].get(var2);
            var3.a();
            if (var3.K) {
               this.b[var1].remove(var2--);
            }
         }
      }

   }

   public void a(ia var1, float var2) {
      float var3 = abz.d;
      float var4 = abz.f;
      float var5 = abz.g;
      float var6 = abz.h;
      float var7 = abz.e;
      wc.ar = var1.R + (var1.s - var1.R) * (double)var2;
      wc.as = var1.S + (var1.t - var1.S) * (double)var2;
      wc.at = var1.T + (var1.u - var1.T) * (double)var2;

      for(int var8 = 0; var8 < 3; ++var8) {
         if (this.b[var8].size() != 0) {
            int var9 = 0;
            if (var8 == 0) {
               var9 = this.c.b("/particles.png");
            }

            if (var8 == 1) {
               var9 = this.c.b("/terrain.png");
            }

            if (var8 == 2) {
               var9 = this.c.b("/gui/items.png");
            }

            GL11.glBindTexture(3553, var9);
            cv var10 = cv.a;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var10.b();

            for(int var11 = 0; var11 < this.b[var8].size(); ++var11) {
               wc var12 = (wc)this.b[var8].get(var11);
               var10.b(var12.a(var2));
               var12.a(var10, var2, var3, var7, var4, var5, var6);
            }

            var10.a();
         }
      }

   }

   public void b(ia var1, float var2) {
      float var3 = me.b(var1.y * (float)Math.PI / 180.0F);
      float var4 = me.a(var1.y * (float)Math.PI / 180.0F);
      float var5 = -var4 * me.a(var1.z * (float)Math.PI / 180.0F);
      float var6 = var3 * me.a(var1.z * (float)Math.PI / 180.0F);
      float var7 = me.b(var1.z * (float)Math.PI / 180.0F);
      byte var8 = 3;
      if (this.b[var8].size() != 0) {
         cv var9 = cv.a;

         for(int var10 = 0; var10 < this.b[var8].size(); ++var10) {
            wc var11 = (wc)this.b[var8].get(var10);
            var9.b(var11.a(var2));
            var11.a(var9, var2, var3, var7, var4, var5, var6);
         }

      }
   }

   public void a(ry var1) {
      this.a = var1;

      for(int var2 = 0; var2 < 4; ++var2) {
         this.b[var2].clear();
      }

   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      if (var4 != 0) {
         yy var6 = yy.k[var4];
         byte var7 = 4;

         for(int var8 = 0; var8 < var7; ++var8) {
            for(int var9 = 0; var9 < var7; ++var9) {
               for(int var10 = 0; var10 < var7; ++var10) {
                  double var11 = (double)var1 + ((double)var8 + (double)0.5F) / (double)var7;
                  double var13 = (double)var2 + ((double)var9 + (double)0.5F) / (double)var7;
                  double var15 = (double)var3 + ((double)var10 + (double)0.5F) / (double)var7;
                  int var17 = this.d.nextInt(6);
                  this.a((wc)(new mp(this.a, var11, var13, var15, var11 - (double)var1 - (double)0.5F, var13 - (double)var2 - (double)0.5F, var15 - (double)var3 - (double)0.5F, var6, var17, var5)).a(var1, var2, var3));
               }
            }
         }

      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.a.a(var1, var2, var3);
      if (var5 != 0) {
         yy var6 = yy.k[var5];
         float var7 = 0.1F;
         double var8 = (double)var1 + this.d.nextDouble() * (var6.bU - var6.bR - (double)(var7 * 2.0F)) + (double)var7 + var6.bR;
         double var10 = (double)var2 + this.d.nextDouble() * (var6.bV - var6.bS - (double)(var7 * 2.0F)) + (double)var7 + var6.bS;
         double var12 = (double)var3 + this.d.nextDouble() * (var6.bW - var6.bT - (double)(var7 * 2.0F)) + (double)var7 + var6.bT;
         if (var4 == 0) {
            var10 = (double)var2 + var6.bS - (double)var7;
         }

         if (var4 == 1) {
            var10 = (double)var2 + var6.bV + (double)var7;
         }

         if (var4 == 2) {
            var12 = (double)var3 + var6.bT - (double)var7;
         }

         if (var4 == 3) {
            var12 = (double)var3 + var6.bW + (double)var7;
         }

         if (var4 == 4) {
            var8 = (double)var1 + var6.bR - (double)var7;
         }

         if (var4 == 5) {
            var8 = (double)var1 + var6.bU + (double)var7;
         }

         this.a((new mp(this.a, var8, var10, var12, (double)0.0F, (double)0.0F, (double)0.0F, var6, var4, this.a.d(var1, var2, var3))).a(var1, var2, var3).d(0.2F).e(0.6F));
      }
   }

   public String b() {
      return "" + (this.b[0].size() + this.b[1].size() + this.b[2].size());
   }
}
