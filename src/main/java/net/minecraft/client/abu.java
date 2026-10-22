package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class abu extends gt {
   public int a;
   public int b;

   public abu() {
   }

   public abu(ia var1, int var2) {
      this.a = var1.j;
      this.b = var2;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
