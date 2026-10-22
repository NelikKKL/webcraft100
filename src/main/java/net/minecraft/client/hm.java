package net.minecraft.client;

import java.util.Random;

public class hm extends fx {
   public static final float[][] a = new float[][]{{1.0F, 1.0F, 1.0F}, {0.95F, 0.7F, 0.2F}, {0.9F, 0.5F, 0.85F}, {0.6F, 0.7F, 0.95F}, {0.9F, 0.9F, 0.2F}, {0.5F, 0.8F, 0.1F}, {0.95F, 0.7F, 0.8F}, {0.3F, 0.3F, 0.3F}, {0.6F, 0.6F, 0.6F}, {0.3F, 0.6F, 0.7F}, {0.7F, 0.4F, 0.9F}, {0.2F, 0.4F, 0.8F}, {0.5F, 0.4F, 0.3F}, {0.4F, 0.5F, 0.2F}, {0.8F, 0.3F, 0.3F}, {0.1F, 0.1F, 0.1F}};

   public hm(ry var1) {
      super(var1);
      this.aA = "/mob/sheep.png";
      this.a(0.9F, 1.3F);
   }

   public int f_() {
      return 8;
   }

   protected void b() {
      super.b();
      this.ag.a(16, new Byte((byte)0));
   }

   protected void a(boolean var1, int var2) {
      if (!this.v_()) {
         this.a(new dk(yy.ab.bM, 1, this.l()), 0.0F);
      }

   }

   protected int k() {
      return yy.ab.bM;
   }

   public boolean c(vi var1) {
      dk var2 = var1.by.a();
      if (var2 != null && var2.c == acy.bd.bM && !this.v_()) {
         if (!this.o.I) {
            this.b(true);
            int var3 = 2 + this.Y.nextInt(3);

            for(int var4 = 0; var4 < var3; ++var4) {
               ih var5 = this.a(new dk(yy.ab.bM, 1, this.l()), 1.0F);
               var5.w += (double)(this.Y.nextFloat() * 0.05F);
               var5.v += (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
               var5.x += (double)((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
            }
         }

         var2.a(1, var1);
      }

      return super.c(var1);
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("Sheared", this.v_());
      var1.a("Color", (byte)this.l());
   }

   public void b(ik var1) {
      super.b(var1);
      this.b(var1.m("Sheared"));
      this.c(var1.c("Color"));
   }

   protected String e() {
      return "mob.sheep";
   }

   protected String f() {
      return "mob.sheep";
   }

   protected String g() {
      return "mob.sheep";
   }

   public int l() {
      return this.ag.a(16) & 15;
   }

   public void c(int var1) {
      byte var2 = this.ag.a(16);
      this.ag.b(16, (byte)(var2 & 240 | var1 & 15));
   }

   public boolean v_() {
      return (this.ag.a(16) & 16) != 0;
   }

   public void b(boolean var1) {
      byte var2 = this.ag.a(16);
      if (var1) {
         this.ag.b(16, (byte)(var2 | 16));
      } else {
         this.ag.b(16, (byte)(var2 & -17));
      }

   }

   public static int a(Random var0) {
      int var1 = var0.nextInt(100);
      if (var1 < 5) {
         return 15;
      } else if (var1 < 10) {
         return 7;
      } else if (var1 < 15) {
         return 8;
      } else if (var1 < 18) {
         return 12;
      } else {
         return var0.nextInt(500) == 0 ? 6 : 0;
      }
   }

   protected fx a(fx var1) {
      hm var2 = (hm)var1;
      hm var3 = new hm(this.o);
      if (this.Y.nextBoolean()) {
         var3.c(this.l());
      } else {
         var3.c(var2.l());
      }

      return var3;
   }
}
