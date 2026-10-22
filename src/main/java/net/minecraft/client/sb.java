package net.minecraft.client;

public class sb extends acy {
   public sb(int var1) {
      super(var1);
      this.bN = 16;
   }

   public dk c(dk var1, ry var2, vi var3) {
      if (!var3.cc.d) {
         --var1.a;
      }

      var2.a(var3, "random.bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
      if (!var2.I) {
         var2.a((ia)(new qw(var2, var3)));
      }

      return var1;
   }
}
