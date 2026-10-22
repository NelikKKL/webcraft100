package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wm extends gt {
   public int a;
   public int b;
   public String c;
   public int d;

   public void a(fe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readByte();
      this.b = var1.readByte();
      this.c = a(var1, 16);
      this.d = var1.readByte();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeByte(this.a);
      var1.writeByte(this.b);
      a(this.c, var1);
      var1.writeByte(this.d);
   }

   public int a() {
      return 3 + this.c.length();
   }
}
