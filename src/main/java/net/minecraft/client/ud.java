package net.minecraft.client;

import net.minecraft.client.netshim.PushbackReader;
import java.io.Reader;

final class ud implements if_ {
   private final PushbackReader a;
   private int b = 0;
   private int c = 1;
   private boolean d = false;

   public ud(Reader var1) {
      this.a = new PushbackReader(var1);
   }

   public void a(char var1) throws java.io.IOException {
      --this.b;
      if (this.b < 0) {
         this.b = 0;
      }

      this.a.unread(var1);
   }

   public void a(char[] var1) {
      this.b -= var1.length;
      if (this.b < 0) {
         this.b = 0;
      }

   }

   public int c() throws java.io.IOException {
      int var1 = this.a.read();
      this.a(var1);
      return var1;
   }

   public int b(char[] var1) throws java.io.IOException {
      int var2 = this.a.read(var1);

      for(char var6 : var1) {
         this.a((int)var6);
      }

      return var2;
   }

   private void a(int var1) {
      if (13 == var1) {
         this.b = 0;
         ++this.c;
         this.d = true;
      } else {
         if (10 == var1 && !this.d) {
            this.b = 0;
            ++this.c;
         } else {
            ++this.b;
         }

         this.d = false;
      }

   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }
}
