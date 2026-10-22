package net.minecraft.client;

public class aco extends vq {
   public aco(ry var1) {
      super(var1);
      this.aA = "/mob/cavespider.png";
      this.a(0.7F, 0.5F);
   }

   public int f_() {
      return 12;
   }

   public float ax() {
      return 0.7F;
   }

   protected boolean b(ia var1) {
      if (super.b((ia)var1)) {
         if (var1 instanceof nq) {
            byte var2 = 0;
            if (this.o.v > 1) {
               if (this.o.v == 2) {
                  var2 = 7;
               } else if (this.o.v == 3) {
                  var2 = 15;
               }
            }

            if (var2 > 0) {
               ((nq)var1).a(new s(abg.u.H, var2 * 20, 0));
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
