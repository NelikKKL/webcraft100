package net.minecraft.client;

public class sa {
   public final vi a;
   public int[] b;
   public int[] c;
   private int e;
   private int f;
   // $FF: synthetic field
   final kl d;

   public sa(kl var1, vi var2) {
      this.d = var1;
      this.b = new int[128];
      this.c = new int[128];
      this.e = 0;
      this.f = 0;
      this.a = var2;

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3] = 0;
         this.c[var3] = 127;
      }

   }
}
