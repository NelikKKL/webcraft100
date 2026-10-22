package net.minecraft.client;

public class wa extends agn {
   private ki f;

   public wa(ki var1) {
      this.f = var1;
   }

   public void a(vi var1) {
      this.a = 0.0F;
      this.b = 0.0F;
      if (this.f.n.e) {
         ++this.b;
      }

      if (this.f.p.e) {
         --this.b;
      }

      if (this.f.o.e) {
         ++this.a;
      }

      if (this.f.q.e) {
         --this.a;
      }

      this.d = this.f.r.e;
      this.e = this.f.v.e;
      if (this.e) {
         this.a = (float)((double)this.a * 0.3);
         this.b = (float)((double)this.b * 0.3);
      }

   }
}
