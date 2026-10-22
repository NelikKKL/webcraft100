package net.minecraft.client;

class i implements un {
   public String a(int var1) {
      double var2 = (double)var1 / (double)20.0F;
      double var4 = var2 / (double)60.0F;
      double var6 = var4 / (double)60.0F;
      double var8 = var6 / (double)24.0F;
      double var10 = var8 / (double)365.0F;
      if (var10 > (double)0.5F) {
         return px.e().format(var10) + " y";
      } else if (var8 > (double)0.5F) {
         return px.e().format(var8) + " d";
      } else if (var6 > (double)0.5F) {
         return px.e().format(var6) + " h";
      } else {
         return var4 > (double)0.5F ? px.e().format(var4) + " m" : var2 + " s";
      }
   }
}
