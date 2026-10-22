package net.minecraft.client;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public final class rx implements wo {
   public String a(wz var1) {
      StringWriter var2 = new StringWriter();

      try {
         this.a((wz)var1, var2);
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }

      return var2.toString();
   }

   public void a(wz var1, Writer var2) throws IOException {
      this.a((an)var1, var2);
   }

   // PATCH(1.0.0): метод не декомпилировался (Argo JSON-форматтер, нужен только Snooper — в вебе не используется)
   private void a(an var1, Writer var2) throws IOException {
   }
}
