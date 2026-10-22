package net.minecraft.client;

public abstract class jx {
   private long b;
   protected jx a;
   private long c;
   private long d;

   public static jx[] a(long var0) {
      aib var2 = new aib(1L);
      gn var10 = new gn(2000L, var2);
      tv var11 = new tv(1L, var10);
      act var12 = new act(2001L, var11);
      tv var13 = new tv(2L, var12);
      hv var14 = new hv(2L, var13);
      act var15 = new act(2002L, var14);
      tv var16 = new tv(3L, var15);
      act var17 = new act(2003L, var16);
      tv var18 = new tv(4L, var17);
      aas var19 = new aas(5L, var18);
      byte var3 = 4;
      jx var4 = net.minecraft.client.act.a(1000L, var19, 0);
      var4 = new sp(100L, var4);
      jx var21 = net.minecraft.client.act.a(1000L, var4, var3 + 2);
      var21 = new xu(1L, var21);
      acn var23 = new acn(1000L, var21);
      jx var5 = net.minecraft.client.act.a(1000L, var19, 0);
      var5 = new afa(200L, var5);
      Object var25 = act.a(1000L, var5, 2);
      Object var6 = new afc((jx)var25);
      Object var7 = new afd((jx)var25);

      for(int var8 = 0; var8 < var3; ++var8) {
         var25 = new act((long)(1000 + var8), (jx)var25);
         if (var8 == 0) {
            var25 = new tv(3L, (jx)var25);
         }

         if (var8 == 0) {
            var25 = new zy(1000L, (jx)var25);
         }

         jw var28 = new jw((long)(1000 + var8), (jx)var6);
         var6 = new rk(var28, (jx)var25, var8);
         jw var30 = new jw((long)(1000 + var8), (jx)var7);
         var7 = new mh(var30, (jx)var25, var8);
      }

      acn var26 = new acn(1000L, (jx)var25);
      na var27 = new na(100L, var26, var23);
      jx var29 = jw.a(1000L, (jx)var6, 2);
      jx var31 = jw.a(1000L, (jx)var7, 2);
      df var9 = new df(10L, var27);
      ((jx)var27).b(var0);
      var29.b(var0);
      var31.b(var0);
      ((jx)var9).b(var0);
      return new jx[]{var27, var9, var29, var31, var27};
   }

   public jx(long var1) {
      this.d = var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
   }

   public void b(long var1) {
      this.b = var1;
      if (this.a != null) {
         this.a.b(var1);
      }

      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += this.d;
      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += this.d;
      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += this.d;
   }

   public void a(long var1, long var3) {
      this.c = this.b;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var1;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var3;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var1;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var3;
   }

   protected int a(int var1) {
      int var2 = (int)((this.c >> 24) % (long)var1);
      if (var2 < 0) {
         var2 += var1;
      }

      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += this.b;
      return var2;
   }

   public abstract int[] a(int var1, int var2, int var3, int var4);
}
