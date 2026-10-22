package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ack extends gt {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;

   public ack() {
      this.l = true;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.read();
      this.c = var1.readInt();
      this.d = var1.read();
      this.e = var1.read();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.write(this.b);
      var1.writeInt(this.c);
      var1.write(this.d);
      var1.write(this.e);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 11;
   }
}
