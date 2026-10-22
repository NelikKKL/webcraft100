package net.minecraft.client;

import java.util.List;

public class jm extends gr {
   private int b = 0;
   private int c = 0;
   private static final dk d;

   public jm(ry var1) {
      super(var1);
      this.aA = "/mob/pigzombie.png";
      this.bw = 0.5F;
      this.a = 5;
      this.af = true;
   }

   public void a() {
      this.bw = this.h != null ? 0.95F : 0.5F;
      if (this.c > 0 && --this.c == 0) {
         this.o.a(this, "mob.zombiepig.zpigangry", this.w_() * 2.0F, ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      super.a();
   }

   public boolean i() {
      return this.o.v > 0 && this.o.a(this.C) && this.o.a((ia)this, (c)this.C).size() == 0 && !this.o.b(this.C);
   }

   public void a(ik var1) {
      super.a(var1);
      var1.a("Anger", (short)this.b);
   }

   public void b(ik var1) {
      super.b(var1);
      this.b = var1.d("Anger");
   }

   protected ia o() {
      return this.b == 0 ? null : super.o();
   }

   public void c() {
      super.c();
   }

   public boolean a(pm var1, int var2) {
      ia var3 = var1.a();
      if (var3 instanceof vi) {
         List var4 = this.o.b((ia)this, (c)this.C.b((double)32.0F, (double)32.0F, (double)32.0F));

         for(int var5 = 0; var5 < var4.size(); ++var5) {
            ia var6 = (ia)var4.get(var5);
            if (var6 instanceof jm) {
               jm var7 = (jm)var6;
               var7.j(var3);
            }
         }

         this.j(var3);
      }

      return super.a(var1, var2);
   }

   private void j(ia var1) {
      this.h = var1;
      this.b = 400 + this.Y.nextInt(400);
      this.c = this.Y.nextInt(40);
   }

   protected String e() {
      return "mob.zombiepig.zpig";
   }

   protected String f() {
      return "mob.zombiepig.zpighurt";
   }

   protected String g() {
      return "mob.zombiepig.zpigdeath";
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.Y.nextInt(2 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(acy.bl.bM, 1);
      }

      var3 = this.Y.nextInt(2 + var2);

      for(int var6 = 0; var6 < var3; ++var6) {
         this.b(acy.bp.bM, 1);
      }

   }

   protected int k() {
      return acy.bl.bM;
   }

   public dk s() {
      return d;
   }

   static {
      d = new dk(acy.F, 1);
   }
}
