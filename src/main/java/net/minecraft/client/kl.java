package net.minecraft.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kl extends afz {
   public int a;
   public int b;
   public byte c;
   public byte d;
   public byte[] e = new byte[16384];
   public int f;
   public List g = new ArrayList();
   private Map j = new HashMap();
   public List h = new ArrayList();

   public kl(String var1) {
      super(var1);
   }

   public void a(ik var1) {
      this.c = var1.c("dimension");
      this.a = var1.e("xCenter");
      this.b = var1.e("zCenter");
      this.d = var1.c("scale");
      if (this.d < 0) {
         this.d = 0;
      }

      if (this.d > 4) {
         this.d = 4;
      }

      short var2 = var1.d("width");
      short var3 = var1.d("height");
      if (var2 == 128 && var3 == 128) {
         this.e = var1.j("colors");
      } else {
         byte[] var4 = var1.j("colors");
         this.e = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = var7 + var6;
            if (var8 >= 0 || var8 < 128) {
               for(int var9 = 0; var9 < var2; ++var9) {
                  int var10 = var9 + var5;
                  if (var10 >= 0 || var10 < 128) {
                     this.e[var10 + var8 * 128] = var4[var9 + var7 * var2];
                  }
               }
            }
         }
      }

   }

   public void b(ik var1) {
      var1.a("dimension", this.c);
      var1.a("xCenter", this.a);
      var1.a("zCenter", this.b);
      var1.a("scale", this.d);
      var1.a("width", (short)128);
      var1.a("height", (short)128);
      var1.a("colors", this.e);
   }

   public void a(vi var1, dk var2) {
      if (!this.j.containsKey(var1)) {
         sa var3 = new sa(this, var1);
         this.j.put(var1, var3);
         this.g.add(var3);
      }

      this.h.clear();

      for(int var14 = 0; var14 < this.g.size(); ++var14) {
         sa var4 = (sa)this.g.get(var14);
         if (!var4.a.K && var4.a.by.c(var2)) {
            float var5 = (float)(var4.a.s - (double)this.a) / (float)(1 << this.d);
            float var6 = (float)(var4.a.u - (double)this.b) / (float)(1 << this.d);
            byte var7 = 64;
            byte var8 = 64;
            if (var5 >= (float)(-var7) && var6 >= (float)(-var8) && var5 <= (float)var7 && var6 <= (float)var8) {
               byte var9 = 0;
               byte var10 = (byte)((int)((double)(var5 * 2.0F) + (double)0.5F));
               byte var11 = (byte)((int)((double)(var6 * 2.0F) + (double)0.5F));
               byte var12 = (byte)((int)((double)(var1.y * 16.0F / 360.0F) + (double)0.5F));
               if (this.c < 0) {
                  int var13 = this.f / 10;
                  var12 = (byte)(var13 * var13 * 34187121 + var13 * 121 >> 15 & 15);
               }

               if (var4.a.bK == this.c) {
                  this.h.add(new aar(this, var9, var10, var11, var12));
               }
            }
         } else {
            this.j.remove(var4.a);
            this.g.remove(var4);
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      super.a();

      for(int var4 = 0; var4 < this.g.size(); ++var4) {
         sa var5 = (sa)this.g.get(var4);
         if (var5.b[var1] < 0 || var5.b[var1] > var2) {
            var5.b[var1] = var2;
         }

         if (var5.c[var1] < 0 || var5.c[var1] < var3) {
            var5.c[var1] = var3;
         }
      }

   }

   public void a(byte[] var1) {
      if (var1[0] == 0) {
         int var2 = var1[1] & 255;
         int var3 = var1[2] & 255;

         for(int var4 = 0; var4 < var1.length - 3; ++var4) {
            this.e[(var4 + var3) * 128 + var2] = var1[var4 + 3];
         }

         this.a();
      } else if (var1[0] == 1) {
         this.h.clear();

         for(int var7 = 0; var7 < (var1.length - 1) / 3; ++var7) {
            byte var8 = (byte)(var1[var7 * 3 + 1] % 16);
            byte var9 = var1[var7 * 3 + 2];
            byte var5 = var1[var7 * 3 + 3];
            byte var6 = (byte)(var1[var7 * 3 + 1] / 16);
            this.h.add(new aar(this, var8, var9, var5, var6));
         }
      }

   }
}
