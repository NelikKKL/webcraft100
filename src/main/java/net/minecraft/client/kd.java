package net.minecraft.client;

public class kd extends hl {
   protected boolean a(int var1, int var2) {
      return this.b.nextInt(100) == 0 && this.b.nextInt(80) < Math.max(Math.abs(var1), Math.abs(var2));
   }

   protected oa b(int var1, int var2) {
      return new ns(this.c, this.b, var1, var2);
   }
}
