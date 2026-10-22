package net.minecraft.client;

public class adr extends fx {
   public adr(ry var1) {
      super(var1);
      this.aA = "/mob/cow.png";
      this.a(0.9F, 1.3F);
   }

   public int f_() {
      return 10;
   }

   public void a(ik var1) {
      super.a(var1);
   }

   public void b(ik var1) {
      super.b(var1);
   }

   protected String e() {
      return "mob.cow";
   }

   protected String f() {
      return "mob.cowhurt";
   }

   protected String g() {
      return "mob.cowhurt";
   }

   protected float w_() {
      return 0.4F;
   }

   protected int k() {
      return acy.aE.bM;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.Y.nextInt(3) + this.Y.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(acy.aE.bM, 1);
      }

      var3 = this.Y.nextInt(3) + 1 + this.Y.nextInt(1 + var2);

      for(int var6 = 0; var6 < var3; ++var6) {
         if (this.V()) {
            this.b(acy.bi.bM, 1);
         } else {
            this.b(acy.bh.bM, 1);
         }
      }

   }

   public boolean c(vi var1) {
      dk var2 = var1.by.a();
      if (var2 != null && var2.c == acy.av.bM) {
         var1.by.a(var1.by.c, new dk(acy.aF));
         return true;
      } else {
         return super.c(var1);
      }
   }

   protected fx a(fx var1) {
      return new adr(this.o);
   }
}
