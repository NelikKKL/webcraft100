package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aep extends gt {
   public long a;
   public int b;
   public int c;
   public int d;
   public int e;

   public aep() {
   }

   public aep(byte var1, byte var2, long var3, int var5, int var6) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
      this.d = var5;
      this.e = var6;
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.e = var1.readByte();
      this.d = var1.readShort();
      this.a = var1.readLong();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.e);
      var1.writeShort(this.d);
      var1.writeLong(this.a);
   }

   public int a() {
      return 13;
   }
}
