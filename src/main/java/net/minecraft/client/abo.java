package net.minecraft.client;

public class abo extends acy {
   public abo(int var1) {
      super(var1);
      this.h(1);
      this.i(238);
   }

   public boolean a(dk var1, int var2, int var3, int var4, int var5, nq var6) {
      if (var2 != yy.K.bM && var2 != yy.W.bM && var2 != yy.X.bM && var2 != yy.bu.bM) {
         return super.a(var1, var2, var3, var4, var5, var6);
      } else {
         var1.a(1, var6);
         return true;
      }
   }

   public boolean a(yy var1) {
      return var1.bM == yy.W.bM;
   }

   public float a(dk var1, yy var2) {
      if (var2.bM != yy.W.bM && var2.bM != yy.K.bM) {
         return var2.bM == yy.ab.bM ? 5.0F : super.a(var1, var2);
      } else {
         return 15.0F;
      }
   }
}
