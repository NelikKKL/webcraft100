package net.minecraft.client;

public class hd extends acy {
   public hd(int var1) {
      super(var1);
      this.i(64);
      this.h(1);
   }

   public boolean a() {
      return true;
   }

   public boolean b() {
      return true;
   }

   public dk c(dk var1, ry var2, vi var3) {
      if (var3.ci != null) {
         int var4 = var3.ci.g();
         var1.a(var4, var3);
         var3.m_();
      } else {
         var2.a(var3, "random.bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
         if (!var2.I) {
            var2.a((ia)(new ael(var2, var3)));
         }

         var3.m_();
      }

      return var1;
   }
}
