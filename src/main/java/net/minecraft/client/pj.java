package net.minecraft.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class pj {
   public List d = new ArrayList();
   public List e = new ArrayList();
   public int f = 0;
   private short a = 0;
   protected List g = new ArrayList();
   private Set b = new HashSet();

   protected void a(vv var1) {
      var1.d = this.e.size();
      this.e.add(var1);
      this.d.add((Object)null);
   }

   public void a() {
      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         dk var2 = ((vv)this.e.get(var1)).b();
         dk var3 = (dk)this.d.get(var1);
         if (!dk.a(var3, var2)) {
            var3 = var2 == null ? null : var2.k();
            this.d.set(var1, var3);

            for(int var4 = 0; var4 < this.g.size(); ++var4) {
               ((abd)this.g.get(var4)).a(this, var1, var3);
            }
         }
      }

   }

   public boolean a(vi var1, int var2) {
      return false;
   }

   public vv b(int var1) {
      return (vv)this.e.get(var1);
   }

   public dk a(int var1) {
      vv var2 = (vv)this.e.get(var1);
      return var2 != null ? var2.b() : null;
   }

   public dk a(int var1, int var2, boolean var3, vi var4) {
      dk var5 = null;
      if (var2 > 1) {
         return null;
      } else {
         if (var2 == 0 || var2 == 1) {
            x var6 = var4.by;
            if (var1 == -999) {
               if (var6.i() != null && var1 == -999) {
                  if (var2 == 0) {
                     var4.a(var6.i());
                     var6.b((dk)null);
                  }

                  if (var2 == 1) {
                     var4.a(var6.i().a(1));
                     if (var6.i().a == 0) {
                        var6.b((dk)null);
                     }
                  }
               }
            } else if (var3) {
               dk var7 = this.a(var1);
               if (var7 != null) {
                  int var8 = var7.c;
                  var5 = var7.k();
                  vv var9 = (vv)this.e.get(var1);
                  if (var9 != null && var9.b() != null && var9.b().c == var8) {
                     this.b(var1, var2, var3, var4);
                  }
               }
            } else {
               if (var1 < 0) {
                  return null;
               }

               vv var12 = (vv)this.e.get(var1);
               if (var12 != null) {
                  var12.d();
                  dk var13 = var12.b();
                  dk var14 = var6.i();
                  if (var13 != null) {
                     var5 = var13.k();
                  }

                  if (var13 == null) {
                     if (var14 != null && var12.a(var14)) {
                        int var10 = var2 == 0 ? var14.a : 1;
                        if (var10 > var12.a()) {
                           var10 = var12.a();
                        }

                        var12.c(var14.a(var10));
                        if (var14.a == 0) {
                           var6.b((dk)null);
                        }
                     }
                  } else if (var14 == null) {
                     int var15 = var2 == 0 ? var13.a : (var13.a + 1) / 2;
                     dk var11 = var12.a(var15);
                     var6.b(var11);
                     if (var13.a == 0) {
                        var12.c((dk)null);
                     }

                     var12.b(var6.i());
                  } else if (var12.a(var14)) {
                     if (var13.c != var14.c || var13.f() && var13.i() != var14.i()) {
                        if (var14.a <= var12.a()) {
                           var12.c(var14);
                           var6.b(var13);
                        }
                     } else {
                        int var16 = var2 == 0 ? var14.a : 1;
                        if (var16 > var12.a() - var13.a) {
                           var16 = var12.a() - var13.a;
                        }

                        if (var16 > var14.c() - var13.a) {
                           var16 = var14.c() - var13.a;
                        }

                        var14.a(var16);
                        if (var14.a == 0) {
                           var6.b((dk)null);
                        }

                        var13.a += var16;
                     }
                  } else if (var13.c == var14.c && var14.c() > 1 && (!var13.f() || var13.i() == var14.i())) {
                     int var17 = var13.a;
                     if (var17 > 0 && var17 + var14.a <= var14.c()) {
                        var14.a += var17;
                        var13.a(var17);
                        if (var13.a == 0) {
                           var12.c((dk)null);
                        }

                        var12.b(var6.i());
                     }
                  }
               }
            }
         }

         return var5;
      }
   }

   protected void b(int var1, int var2, boolean var3, vi var4) {
      this.a(var1, var2, var3, var4);
   }

   public void b(vi var1) {
      x var2 = var1.by;
      if (var2.i() != null) {
         var1.a(var2.i());
         var2.b((dk)null);
      }

   }

   public void a(de var1) {
      this.a();
   }

   public void a(int var1, dk var2) {
      this.b(var1).c(var2);
   }

   public void a(dk[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.b(var2).c(var1[var2]);
      }

   }

   public void a(int var1, int var2) {
   }

   public short a(x var1) {
      ++this.a;
      return this.a;
   }

   public void a(short var1) {
   }

   public void b(short var1) {
   }

   public abstract boolean a(vi var1);

   protected boolean a(dk var1, int var2, int var3, boolean var4) {
      boolean var5 = false;
      int var6 = var2;
      if (var4) {
         var6 = var3 - 1;
      }

      if (var1.d()) {
         while(var1.a > 0 && (!var4 && var6 < var3 || var4 && var6 >= var2)) {
            vv var7 = (vv)this.e.get(var6);
            dk var8 = var7.b();
            if (var8 != null && var8.c == var1.c && (!var1.f() || var1.i() == var8.i())) {
               int var9 = var8.a + var1.a;
               if (var9 <= var1.c()) {
                  var1.a = 0;
                  var8.a = var9;
                  var7.d();
                  var5 = true;
               } else if (var8.a < var1.c()) {
                  var1.a -= var1.c() - var8.a;
                  var8.a = var1.c();
                  var7.d();
                  var5 = true;
               }
            }

            if (var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      if (var1.a > 0) {
         if (var4) {
            var6 = var3 - 1;
         } else {
            var6 = var2;
         }

         while(!var4 && var6 < var3 || var4 && var6 >= var2) {
            vv var11 = (vv)this.e.get(var6);
            dk var12 = var11.b();
            if (var12 == null) {
               var11.c(var1.k());
               var11.d();
               var1.a = 0;
               var5 = true;
               break;
            }

            if (var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      return var5;
   }
}
