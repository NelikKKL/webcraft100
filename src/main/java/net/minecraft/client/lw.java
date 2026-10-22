package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class lw extends gt {
   public int a;
   public int b;
   public int c;
   public int d;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readShort();
      this.d = var1.readShort();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeShort(this.c);
      var1.writeShort(this.d);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
