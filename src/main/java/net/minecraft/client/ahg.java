package net.minecraft.client;

import java.io.ByteArrayOutputStream;

class ahg extends ByteArrayOutputStream {
   private int b;
   private int c;
   // $FF: synthetic field
   final as a;

   public ahg(as var1, int var2, int var3) {
      super(8096);
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void close() {
      this.a.a(this.b, this.c, this.buf, this.count);
   }
}
