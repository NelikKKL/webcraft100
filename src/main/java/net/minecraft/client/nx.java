package net.minecraft.client;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class nx {
   public wz a(Reader var1) throws zz, java.io.IOException {
      es var2 = new es();
      (new oi()).a((Reader)var1, var2);
      return var2.a();
   }

   public wz a(String var1) throws zz {
      try {
         wz var2 = this.a((Reader)(new StringReader(var1)));
         return var2;
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }
   }
}
