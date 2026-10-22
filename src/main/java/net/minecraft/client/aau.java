package net.minecraft.client;

public class aau extends k {
   public void b() {
      this.b = new bx(sr.j, 1.0F, 0.0F);
      this.c = true;
      this.d = true;
      this.e = true;
      this.g = -1;
   }

   public fb b(float var1, float var2) {
      return fb.b((double)0.2F, (double)0.03F, (double)0.03F);
   }

   protected void a() {
      float var1 = 0.1F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.f[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   public ej c() {
      return new jv(this.a, this.a.t());
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.a(var1, var2);
      if (var3 == yy.z.bM) {
         return false;
      } else if (var3 == 0) {
         return false;
      } else {
         return yy.m[var3];
      }
   }

   public float a(long var1, float var3) {
      return 0.5F;
   }

   public boolean d() {
      return false;
   }
}
