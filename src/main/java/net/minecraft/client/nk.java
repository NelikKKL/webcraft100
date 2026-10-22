package net.minecraft.client;

import java.util.List;
import java.util.Random;

public abstract class nk {
   protected nl e;
   protected int f;
   protected int g;

   protected nk(int var1) {
      this.g = var1;
      this.f = -1;
   }

   public void a(nk var1, List var2, Random var3) {
   }

   public abstract boolean a(ry var1, Random var2, nl var3);

   public nl a() {
      return this.e;
   }

   public int b() {
      return this.g;
   }

   public static nk a(List var0, nl var1) {
      for(nk var3 : (Iterable<nk>)(Iterable)(var0)) {
         if (var3.a() != null && var3.a().a(var1)) {
            return var3;
         }
      }

      return null;
   }

   public am c() {
      return new am(this.e.e(), this.e.f(), this.e.g());
   }

   protected boolean a(ry var1, nl var2) {
      int var3 = Math.max(this.e.a - 1, var2.a);
      int var4 = Math.max(this.e.b - 1, var2.b);
      int var5 = Math.max(this.e.c - 1, var2.c);
      int var6 = Math.min(this.e.d + 1, var2.d);
      int var7 = Math.min(this.e.e + 1, var2.e);
      int var8 = Math.min(this.e.f + 1, var2.f);

      for(int var9 = var3; var9 <= var6; ++var9) {
         for(int var10 = var5; var10 <= var8; ++var10) {
            int var11 = var1.a(var9, var4, var10);
            if (var11 > 0 && yy.k[var11].bZ.a()) {
               return true;
            }

            var11 = var1.a(var9, var7, var10);
            if (var11 > 0 && yy.k[var11].bZ.a()) {
               return true;
            }
         }
      }

      for(int var12 = var3; var12 <= var6; ++var12) {
         for(int var14 = var4; var14 <= var7; ++var14) {
            int var17 = var1.a(var12, var14, var5);
            if (var17 > 0 && yy.k[var17].bZ.a()) {
               return true;
            }

            var17 = var1.a(var12, var14, var8);
            if (var17 > 0 && yy.k[var17].bZ.a()) {
               return true;
            }
         }
      }

      for(int var13 = var5; var13 <= var8; ++var13) {
         for(int var15 = var4; var15 <= var7; ++var15) {
            int var19 = var1.a(var3, var15, var13);
            if (var19 > 0 && yy.k[var19].bZ.a()) {
               return true;
            }

            var19 = var1.a(var6, var15, var13);
            if (var19 > 0 && yy.k[var19].bZ.a()) {
               return true;
            }
         }
      }

      return false;
   }

   protected int a(int var1, int var2) {
      switch (this.f) {
         case 0:
         case 2:
            return this.e.a + var1;
         case 1:
            return this.e.d - var2;
         case 3:
            return this.e.a + var2;
         default:
            return var1;
      }
   }

   protected int b(int var1) {
      return this.f == -1 ? var1 : var1 + this.e.b;
   }

   protected int b(int var1, int var2) {
      switch (this.f) {
         case 0:
            return this.e.c + var2;
         case 1:
         case 3:
            return this.e.c + var1;
         case 2:
            return this.e.f - var2;
         default:
            return var2;
      }
   }

   protected int c(int var1, int var2) {
      if (var1 == yy.aG.bM) {
         if (this.f == 1 || this.f == 3) {
            if (var2 == 1) {
               return 0;
            }

            return 1;
         }
      } else if (var1 != yy.aE.bM && var1 != yy.aL.bM) {
         if (var1 != yy.aH.bM && var1 != yy.at.bM && var1 != yy.bC.bM && var1 != yy.bx.bM) {
            if (var1 == yy.aF.bM) {
               if (this.f == 0) {
                  if (var2 == 2) {
                     return 3;
                  }

                  if (var2 == 3) {
                     return 2;
                  }
               } else if (this.f == 1) {
                  if (var2 == 2) {
                     return 4;
                  }

                  if (var2 == 3) {
                     return 5;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 5) {
                     return 3;
                  }
               } else if (this.f == 3) {
                  if (var2 == 2) {
                     return 5;
                  }

                  if (var2 == 3) {
                     return 4;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 5) {
                     return 3;
                  }
               }
            } else if (var1 == yy.aR.bM) {
               if (this.f == 0) {
                  if (var2 == 3) {
                     return 4;
                  }

                  if (var2 == 4) {
                     return 3;
                  }
               } else if (this.f == 1) {
                  if (var2 == 3) {
                     return 1;
                  }

                  if (var2 == 4) {
                     return 2;
                  }

                  if (var2 == 2) {
                     return 3;
                  }

                  if (var2 == 1) {
                     return 4;
                  }
               } else if (this.f == 3) {
                  if (var2 == 3) {
                     return 2;
                  }

                  if (var2 == 4) {
                     return 1;
                  }

                  if (var2 == 2) {
                     return 3;
                  }

                  if (var2 == 1) {
                     return 4;
                  }
               }
            }
         } else if (this.f == 0) {
            if (var2 == 2) {
               return 3;
            }

            if (var2 == 3) {
               return 2;
            }
         } else if (this.f == 1) {
            if (var2 == 0) {
               return 2;
            }

            if (var2 == 1) {
               return 3;
            }

            if (var2 == 2) {
               return 0;
            }

            if (var2 == 3) {
               return 1;
            }
         } else if (this.f == 3) {
            if (var2 == 0) {
               return 2;
            }

            if (var2 == 1) {
               return 3;
            }

            if (var2 == 2) {
               return 1;
            }

            if (var2 == 3) {
               return 0;
            }
         }
      } else if (this.f == 0) {
         if (var2 == 0) {
            return 2;
         }

         if (var2 == 2) {
            return 0;
         }
      } else {
         if (this.f == 1) {
            return var2 + 1 & 3;
         }

         if (this.f == 3) {
            return var2 + 3 & 3;
         }
      }

      return var2;
   }

   protected void a(ry var1, int var2, int var3, int var4, int var5, int var6, nl var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.b(var5);
      int var10 = this.b(var4, var6);
      if (var7.b(var8, var9, var10)) {
         var1.b(var8, var9, var10, var2, var3);
      }
   }

   protected int a(ry var1, int var2, int var3, int var4, nl var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.b(var3);
      int var8 = this.b(var2, var4);
      return !var5.b(var6, var7, var8) ? 0 : var1.a(var6, var7, var8);
   }

   protected void a(ry var1, nl var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if (!var11 || this.a(var1, var13, var12, var14, var2) != 0) {
                  if (var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.a(var1, var10, 0, var13, var12, var14, var2);
                  } else {
                     this.a(var1, var9, 0, var13, var12, var14, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(ry var1, nl var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, ox var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if (!var9 || this.a(var1, var13, var12, var14, var2) != 0) {
                  var11.a(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.a(var1, var11.a(), var11.b(), var13, var12, var14, var2);
               }
            }
         }
      }

   }

   protected void a(ry var1, nl var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      for(int var14 = var6; var14 <= var9; ++var14) {
         for(int var15 = var5; var15 <= var8; ++var15) {
            for(int var16 = var7; var16 <= var10; ++var16) {
               if (!(var3.nextFloat() > var4) && (!var13 || this.a(var1, var15, var14, var16, var2) != 0)) {
                  if (var14 != var6 && var14 != var9 && var15 != var5 && var15 != var8 && var16 != var7 && var16 != var10) {
                     this.a(var1, var12, 0, var15, var14, var16, var2);
                  } else {
                     this.a(var1, var11, 0, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(ry var1, nl var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      if (var3.nextFloat() < var4) {
         this.a(var1, var8, var9, var5, var6, var7, var2);
      }

   }

   protected void a(ry var1, nl var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for(int var16 = var4; var16 <= var7; ++var16) {
         float var17 = (float)(var16 - var4) / var12;

         for(int var18 = var3; var18 <= var6; ++var18) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for(int var20 = var5; var20 <= var8; ++var20) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if (!var10 || this.a(var1, var18, var16, var20, var2) != 0) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if (var22 <= 1.05F) {
                     this.a(var1, var9, 0, var18, var16, var20, var2);
                  }
               }
            }
         }
      }

   }

   protected void b(ry var1, int var2, int var3, int var4, nl var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.b(var3);
      int var8 = this.b(var2, var4);
      if (var5.b(var6, var7, var8)) {
         while(!var1.h(var6, var7, var8) && var7 < var1.d) {
            var1.b(var6, var7, var8, 0, 0);
            ++var7;
         }

      }
   }

   protected void b(ry var1, int var2, int var3, int var4, int var5, int var6, nl var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.b(var5);
      int var10 = this.b(var4, var6);
      if (var7.b(var8, var9, var10)) {
         while((var1.h(var8, var9, var10) || var1.e(var8, var9, var10).a()) && var9 > 1) {
            var1.b(var8, var9, var10, var2, var3);
            --var9;
         }

      }
   }

   protected void a(ry var1, nl var2, Random var3, int var4, int var5, int var6, agq[] var7, int var8) {
      int var9 = this.a(var4, var6);
      int var10 = this.b(var5);
      int var11 = this.b(var4, var6);
      if (var2.b(var9, var10, var11) && var1.a(var9, var10, var11) != yy.au.bM) {
         var1.g(var9, var10, var11, yy.au.bM);
         tu var12 = (tu)var1.b(var9, var10, var11);
         if (var12 != null) {
            a(var3, var7, var12, var8);
         }
      }

   }

   private static void a(Random var0, agq[] var1, tu var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         agq var5 = (agq)nc.a(var0, (abt[])var1);
         int var6 = var5.c + var0.nextInt(var5.e - var5.c + 1);
         if (acy.d[var5.a].e() >= var6) {
            var2.a(var0.nextInt(var2.c()), new dk(var5.a, var6, var5.b));
         } else {
            for(int var7 = 0; var7 < var6; ++var7) {
               var2.a(var0.nextInt(var2.c()), new dk(var5.a, 1, var5.b));
            }
         }
      }

   }

   protected void a(ry var1, nl var2, Random var3, int var4, int var5, int var6, int var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.b(var5);
      int var10 = this.b(var4, var6);
      if (var2.b(var8, var9, var10)) {
         zg.a(var1, var8, var9, var10, var7, yy.aE);
      }

   }
}
