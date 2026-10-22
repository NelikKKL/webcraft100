package net.minecraft.client;

public class qc extends acy {
   public qc(int var1) {
      super(var1);
   }

   public dk c(dk var1, ry var2, vi var3) {
      gv var4 = this.a(var2, var3, true);
      if (var4 == null) {
         return var1;
      } else {
         if (var4.a == net.minecraft.client.bo.a) {
            int var5 = var4.b;
            int var6 = var4.c;
            int var7 = var4.d;
            if (!var2.a(var3, var5, var6, var7)) {
               return var1;
            }

            if (!var3.e(var5, var6, var7)) {
               return var1;
            }

            if (var2.e(var5, var6, var7) == net.minecraft.client.p.g) {
               --var1.a;
               if (var1.a <= 0) {
                  return new dk(acy.br);
               }

               if (!var3.by.a(new dk(acy.br))) {
                  var3.a(new dk(acy.br.bM, 1, 0));
               }
            }
         }

         return var1;
      }
   }
}
