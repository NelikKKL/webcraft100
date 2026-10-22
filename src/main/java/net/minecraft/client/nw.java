package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class nw extends gt {
   public float a;
   public int b;
   public int c;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readFloat();
      this.c = var1.readShort();
      this.b = var1.readShort();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeFloat(this.a);
      var1.writeShort(this.c);
      var1.writeShort(this.b);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
