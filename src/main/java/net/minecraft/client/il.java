package net.minecraft.client;

public class il extends acy {
   public il(int var1) {
      super(var1);
      this.bN = 1;
      this.i(384);
   }

   public void a(dk var1, ry var2, vi var3, int var4) {
      if (var3.cc.d || var3.by.c(acy.k.bM)) {
         int var5 = this.b(var1) - var4;
         float var6 = (float)var5 / 20.0F;
         var6 = (var6 * var6 + var6 * 2.0F) / 3.0F;
         if ((double)var6 < 0.1) {
            return;
         }

         if (var6 > 1.0F) {
            var6 = 1.0F;
         }

         ro var7 = new ro(var2, var3, var6 * 2.0F);
         if (var6 == 1.0F) {
            var7.d = true;
         }

         var1.a(1, var3);
         var2.a(var3, "random.bow", 1.0F, 1.0F / (c.nextFloat() * 0.4F + 1.2F) + var6 * 0.5F);
         var3.by.b(acy.k.bM);
         if (!var2.I) {
            var2.a((ia)var7);
         }
      }

   }

   public dk a(dk var1, ry var2, vi var3) {
      return var1;
   }

   public int b(dk var1) {
      return 72000;
   }

   public ps c(dk var1) {
      return ps.e;
   }

   public dk c(dk var1, ry var2, vi var3) {
      if (var3.cc.d || var3.by.c(acy.k.bM)) {
         var3.c(var1, this.b(var1));
      }

      return var1;
   }
}
