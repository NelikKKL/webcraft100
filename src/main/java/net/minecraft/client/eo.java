package net.minecraft.client;

public class eo extends acy {
   public eo(int var1) {
      super(var1);
      this.bN = 16;
   }

   public dk c(dk var1, ry var2, vi var3) {
      if (var3.cc.d) {
         return var1;
      } else {
         --var1.a;
         var2.a(var3, "random.bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
         if (!var2.I) {
            var2.a((ia)(new tm(var2, var3)));
         }

         return var1;
      }
   }
}
