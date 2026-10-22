package net.minecraft.client;

public class aga implements ue {
   private int b;
   private int c;
   private dk[] d;
   private dk e;
   public final int a;

   public aga(int var1, int var2, dk[] var3, dk var4) {
      this.a = var4.c;
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public dk a() {
      return this.e;
   }

   public boolean a(lm var1) {
      for(int var2 = 0; var2 <= 3 - this.b; ++var2) {
         for(int var3 = 0; var3 <= 3 - this.c; ++var3) {
            if (this.a(var1, var2, var3, true)) {
               return true;
            }

            if (this.a(var1, var2, var3, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(lm var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 3; ++var6) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            dk var9 = null;
            if (var7 >= 0 && var8 >= 0 && var7 < this.b && var8 < this.c) {
               if (var4) {
                  var9 = this.d[this.b - var7 - 1 + var8 * this.b];
               } else {
                  var9 = this.d[var7 + var8 * this.b];
               }
            }

            dk var10 = var1.b(var5, var6);
            if (var10 != null || var9 != null) {
               if (var10 == null && var9 != null || var10 != null && var9 == null) {
                  return false;
               }

               if (var9.c != var10.c) {
                  return false;
               }

               if (var9.i() != -1 && var9.i() != var10.i()) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public dk b(lm var1) {
      return new dk(this.e.c, this.e.a, this.e.i());
   }

   public int b() {
      return this.b * this.c;
   }
}
