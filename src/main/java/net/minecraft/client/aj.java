package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aj extends gt {
   public int a;
   public String b;
   public long c;
   public int d;
   public byte e;
   public byte f;
   public byte g;
   public byte h;

   public aj() {
   }

   public aj(String var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = a(var1, 16);
      this.c = var1.readLong();
      this.d = var1.readInt();
      this.e = var1.readByte();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readByte();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      a(this.b, var1);
      var1.writeLong(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeByte(this.h);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 4 + this.b.length() + 4 + 7 + 4;
   }
}
