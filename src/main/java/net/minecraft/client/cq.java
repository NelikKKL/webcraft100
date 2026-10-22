package net.minecraft.client;

public class cq {
   public float[] a;
   public float[] b;
   public sr[] c;
   public int d;
   public int e;
   public long f;
   // $FF: synthetic field
   final agl g;

   public cq(agl var1, int var2, int var3) {
      this.g = var1;
      this.a = new float[256];
      this.b = new float[256];
      this.c = new sr[256];
      this.d = var2;
      this.e = var3;
      agl.a(var1).a((float[])this.a, var2 << 4, var3 << 4, 16, 16);
      agl.a(var1).b((float[])this.b, var2 << 4, var3 << 4, 16, 16);
      agl.a(var1).a(this.c, var2 << 4, var3 << 4, 16, 16, false);
   }

   public sr a(int var1, int var2) {
      return this.c[var1 & 15 | (var2 & 15) << 4];
   }

   public float b(int var1, int var2) {
      return this.a[var1 & 15 | (var2 & 15) << 4];
   }

   public float c(int var1, int var2) {
      return this.b[var1 & 15 | (var2 & 15) << 4];
   }
}
