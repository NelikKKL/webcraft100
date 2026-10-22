package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ly extends gt {
   public int a;
   public short b;
   public boolean c;

   public ly() {
   }

   public ly(int var1, short var2, boolean var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.readByte() != 0;
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeByte(this.c ? 1 : 0);
   }

   public int a() {
      return 4;
   }
}
