package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gh extends gt {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.h = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.i = var1.readInt();
      if (this.i > 0) {
         this.e = var1.readShort();
         this.f = var1.readShort();
         this.g = var1.readShort();
      }

   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.h);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.i);
      if (this.i > 0) {
         var1.writeShort(this.e);
         var1.writeShort(this.f);
         var1.writeShort(this.g);
      }

   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 21 + this.i > 0 ? 6 : 0;
   }
}
