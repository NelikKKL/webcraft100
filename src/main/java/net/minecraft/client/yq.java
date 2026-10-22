package net.minecraft.client;

public class yq extends ba {
   public yq(int var1) {
      super(var1, 74, net.minecraft.client.p.d);
   }

   public int b(int var1) {
      return this.bL;
   }

   public void a(ry var1, int var2, int var3, int var4, int var5) {
      if (var5 > 0) {
         boolean var6 = var1.v(var2, var3, var4);
         nj var7 = (nj)var1.b(var2, var3, var4);
         if (var7 != null && var7.b != var6) {
            if (var6) {
               var7.a(var1, var2, var3, var4);
            }

            var7.b = var6;
         }
      }

   }

   public boolean a(ry var1, int var2, int var3, int var4, vi var5) {
      if (var1.I) {
         return true;
      } else {
         nj var6 = (nj)var1.b(var2, var3, var4);
         if (var6 != null) {
            var6.a();
            var6.a(var1, var2, var3, var4);
         }

         return true;
      }
   }

   public void b(ry var1, int var2, int var3, int var4, vi var5) {
      if (!var1.I) {
         nj var6 = (nj)var1.b(var2, var3, var4);
         if (var6 != null) {
            var6.a(var1, var2, var3, var4);
         }

      }
   }

   public bq j_() {
      return new nj();
   }

   public void a(ry var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)Math.pow((double)2.0F, (double)(var6 - 12) / (double)12.0F);
      String var8 = "harp";
      if (var5 == 1) {
         var8 = "bd";
      }

      if (var5 == 2) {
         var8 = "snare";
      }

      if (var5 == 3) {
         var8 = "hat";
      }

      if (var5 == 4) {
         var8 = "bassattack";
      }

      var1.a((double)var2 + (double)0.5F, (double)var3 + (double)0.5F, (double)var4 + (double)0.5F, "note." + var8, 3.0F, var7);
      var1.a("note", (double)var2 + (double)0.5F, (double)var3 + 1.2, (double)var4 + (double)0.5F, (double)var6 / (double)24.0F, (double)0.0F, (double)0.0F);
   }
}
