package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class y extends rd {
   public void a(DataInputStream var1) throws java.io.IOException {
      super.a(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      super.a(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
   }

   public int a() {
      return 7;
   }
}
