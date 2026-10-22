package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

public class bc implements ue {
   private final dk a;
   private final List b;

   public bc(dk var1, List var2) {
      this.a = var1;
      this.b = var2;
   }

   public dk a() {
      return this.a;
   }

   public boolean a(lm var1) {
      ArrayList var2 = new ArrayList(this.b);

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 3; ++var4) {
            dk var5 = var1.b(var4, var3);
            if (var5 != null) {
               boolean var6 = false;

               for(dk var8 : (Iterable<dk>)(Iterable)(var2)) {
                  if (var5.c == var8.c && (var8.i() == -1 || var5.i() == var8.i())) {
                     var6 = true;
                     var2.remove(var8);
                     break;
                  }
               }

               if (!var6) {
                  return false;
               }
            }
         }
      }

      return var2.isEmpty();
   }

   public dk b(lm var1) {
      return this.a.k();
   }

   public int b() {
      return this.b.size();
   }
}
