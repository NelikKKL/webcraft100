package net.minecraft.client;

public class agi extends acy {
   private static final int[] bS = new int[]{11, 16, 15, 13};
   public final int a;
   public final int b;
   public final int bR;
   private final dj bT;

   public agi(int var1, dj var2, int var3, int var4) {
      super(var1);
      this.bT = var2;
      this.a = var4;
      this.bR = var3;
      this.b = var2.b(var4);
      this.i(var2.a(var4));
      this.bN = 1;
   }

   public int c() {
      return this.bT.a();
   }

   // $FF: synthetic method
   static int[] o() {
      return bS;
   }
}
