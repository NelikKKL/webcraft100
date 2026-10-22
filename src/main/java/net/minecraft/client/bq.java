package net.minecraft.client;

import java.util.HashMap;
import java.util.Map;

public class bq {
   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public ry c;
   public int d;
   public int e;
   public int f;
   protected boolean g;
   public int h = -1;
   public yy i;

   private static void a(Class var0, String var1) {
      if (b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      } else {
         a.put(var1, var0);
         b.put(var0, var1);
      }
   }

   public void b(ik var1) {
      this.d = var1.e("x");
      this.e = var1.e("y");
      this.f = var1.e("z");
   }

   public void a(ik var1) {
      String var2 = (String)b.get(this.getClass());
      if (var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.a("id", var2);
         var1.a("x", this.d);
         var1.a("y", this.e);
         var1.a("z", this.f);
      }
   }

   public void b() {
   }

   public static bq c(ik var0) {
      bq var1 = null;

      try {
         Class var2 = (Class)a.get(var0.i("id"));
         if (var2 != null) {
            var1 = (bq)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if (var1 != null) {
         var1.b(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.i("id"));
      }

      return var1;
   }

   public int f() {
      if (this.h == -1) {
         this.h = this.c.d(this.d, this.e, this.f);
      }

      return this.h;
   }

   public void h() {
      if (this.c != null) {
         this.h = this.c.d(this.d, this.e, this.f);
         this.c.b(this.d, this.e, this.f, this);
      }

   }

   public double a(double var1, double var3, double var5) {
      double var7 = (double)this.d + (double)0.5F - var1;
      double var9 = (double)this.e + (double)0.5F - var3;
      double var11 = (double)this.f + (double)0.5F - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public yy g() {
      if (this.i == null) {
         this.i = yy.k[this.c.a(this.d, this.e, this.f)];
      }

      return this.i;
   }

   public boolean i() {
      return this.g;
   }

   public void l() {
      this.g = true;
   }

   public void m() {
      this.g = false;
   }

   public void b(int var1, int var2) {
   }

   public void n() {
      this.i = null;
      this.h = -1;
   }

   static {
      a(oe.class, "Furnace");
      a(tu.class, "Chest");
      a(agc.class, "RecordPlayer");
      a(bp.class, "Trap");
      a(u.class, "Sign");
      a(ze.class, "MobSpawner");
      a(nj.class, "Music");
      a(agb.class, "Piston");
      a(tt.class, "Cauldron");
      a(rq.class, "EnchantTable");
      a(yg.class, "Airportal");
   }
}
