package net.minecraft.client;

import java.util.HashMap;
import java.util.List;

public class abk extends acy {
   private HashMap a = new HashMap();

   public abk(int var1) {
      super(var1);
      this.h(1);
      this.a(true);
      this.i(0);
   }

   public List e(dk var1) {
      return this.d(var1.i());
   }

   public List d(int var1) {
      List var2 = (List)this.a.get(var1);
      if (var2 == null) {
         var2 = pk.b(var1, false);
         this.a.put(var1, var2);
      }

      return var2;
   }

   public dk a(dk var1, ry var2, vi var3) {
      --var1.a;
      if (!var2.I) {
         List var4 = this.e(var1);
         if (var4 != null) {
            for(s var6 : (Iterable<s>)(Iterable)(var4)) {
               var3.a((s)(new s(var6)));
            }
         }
      }

      if (var1.a <= 0) {
         return new dk(acy.bs);
      } else {
         var3.by.a(new dk(acy.bs));
         return var1;
      }
   }

   public int b(dk var1) {
      return 32;
   }

   public ps c(dk var1) {
      return ps.c;
   }

   public dk c(dk var1, ry var2, vi var3) {
      if (e(var1.i())) {
         --var1.a;
         var2.a(var3, "random.bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
         if (!var2.I) {
            var2.a((ia)(new ab(var2, var3, var1.i())));
         }

         return var1;
      } else {
         var3.c(var1, this.b(var1));
         return var1;
      }
   }

   public boolean a(dk var1, vi var2, ry var3, int var4, int var5, int var6, int var7) {
      return false;
   }

   public int a(int var1) {
      return e(var1) ? 154 : 140;
   }

   public static boolean e(int var0) {
      return (var0 & 16384) != 0;
   }

   public int c(int var1) {
      return pk.a(var1, false);
   }

   public boolean f(int var1) {
      List var2 = this.d(var1);
      if (var2 != null && !var2.isEmpty()) {
         for(s var4 : (Iterable<s>)(Iterable)(var2)) {
            if (abg.a[var4.a()].a()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public String f(dk var1) {
      if (var1.i() == 0) {
         return hj.a("item.emptyPotion.name").trim();
      } else {
         String var2 = super.f(var1);
         if (e(var1.i())) {
            var2 = hj.a("potion.prefix.grenade").trim() + " " + var2;
         }

         List var3 = acy.br.e(var1);
         if (var3 != null && !var3.isEmpty()) {
            String var5 = ((s)var3.get(0)).d();
            var5 = var5 + ".postfix";
            return var2 + " " + hj.a(var5).trim();
         } else {
            String var4 = pk.b(var1.i());
            return hj.a(var4).trim() + " " + var2;
         }
      }
   }

   public void a(dk var1, List var2) {
      if (var1.i() != 0) {
         List var3 = acy.br.e(var1);
         if (var3 != null && !var3.isEmpty()) {
            for(s var5 : (Iterable<s>)(Iterable)(var3)) {
               String var6 = hj.a(var5.d()).trim();
               if (var5.c() > 0) {
                  var6 = var6 + " " + hj.a("potion.potency." + var5.c()).trim();
               }

               if (var5.b() > 20) {
                  var6 = var6 + " (" + abg.a(var5) + ")";
               }

               if (abg.a[var5.a()].f()) {
                  var2.add("§c" + var6);
               } else {
                  var2.add("§7" + var6);
               }
            }
         } else {
            String var4 = hj.a("potion.empty").trim();
            var2.add("§7" + var4);
         }

      }
   }

   public boolean g(dk var1) {
      List var2 = this.e(var1);
      return var2 != null && !var2.isEmpty();
   }
}
