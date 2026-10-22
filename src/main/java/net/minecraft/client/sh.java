package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class sh extends gt {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readByte();
      this.e = var1.readInt();
      this.b = var1.readInt();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.c);
      var1.writeByte(this.d);
      var1.writeInt(this.e);
      var1.writeInt(this.b);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 20;
   }
}
