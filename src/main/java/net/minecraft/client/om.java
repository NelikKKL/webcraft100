package net.minecraft.client;

public class om extends acy {
   public om(int var1) {
      super(var1);
      this.h(1);
   }

   public dk a(dk var1, ry var2, vi var3) {
      --var1.a;
      if (!var2.I) {
         var3.at();
      }

      return var1.a <= 0 ? new dk(acy.av) : var1;
   }

   public int b(dk var1) {
      return 32;
   }

   public ps c(dk var1) {
      return ps.c;
   }

   public dk c(dk var1, ry var2, vi var3) {
      var3.c(var1, this.b(var1));
      return var1;
   }
}
