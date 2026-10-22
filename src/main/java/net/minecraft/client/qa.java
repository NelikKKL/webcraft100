package net.minecraft.client;

import java.util.Random;

class qa extends ox {
   private qa() {
   }

   public void a(Random var1, int var2, int var3, int var4, boolean var5) {
      if (!var5) {
         this.a = 0;
         this.b = 0;
      } else {
         this.a = yy.bm.bM;
         float var6 = var1.nextFloat();
         if (var6 < 0.2F) {
            this.b = 2;
         } else if (var6 < 0.5F) {
            this.b = 1;
         } else if (var6 < 0.55F) {
            this.a = yy.bl.bM;
            this.b = 2;
         } else {
            this.b = 0;
         }
      }

   }

   // $FF: synthetic method
   qa(iz var1) {
      this();
   }
}
