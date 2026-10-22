package net.minecraft.client;

import java.net.HttpURLConnection;
import java.net.URL;
import net.minecraft.client.awtshim.ImageIO;

class cw extends Thread {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final aaj b;
   // $FF: synthetic field
   final aap c;

   cw(aap var1, String var2, aaj var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      HttpURLConnection var1 = null;

      try {
         URL var2 = new URL(this.a);
         var1 = (HttpURLConnection)var2.openConnection();
         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();
         if (var1.getResponseCode() / 100 != 4) {
            if (this.b == null) {
               this.c.a = ImageIO.read(var1.getInputStream());
            } else {
               this.c.a = this.b.a(ImageIO.read(var1.getInputStream()));
            }

            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
         return;
      } finally {
         var1.disconnect();
      }

   }
}
