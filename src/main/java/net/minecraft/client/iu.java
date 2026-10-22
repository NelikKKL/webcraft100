package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class iu extends gt {
   public int a;
   public int b;
   public dk c;

   public void a(fe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = this.b(var1);
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      this.a(this.c, var1);
   }

   public int a() {
      return 8;
   }
}
