package net.minecraft.client;

class jg implements un {
   public String a(int var1) {
      double var3 = (double)var1 / (double)100.0F;
      double var5 = var3 / (double)1000.0F;
      if (var5 > (double)0.5F) {
         return px.e().format(var5) + " km";
      } else {
         return var3 > (double)0.5F ? px.e().format(var3) + " m" : var1 + " cm";
      }
   }
}
