package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ts extends gt {
   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;
   public byte g;
   public int h;
   public int i;
   public int m;

   public ts() {
   }

   public ts(ih var1) {
      this.a = var1.j;
      this.h = var1.a.c;
      this.i = var1.a.a;
      this.m = var1.a.i();
      this.b = me.c(var1.s * (double)32.0F);
      this.c = me.c(var1.t * (double)32.0F);
      this.d = me.c(var1.u * (double)32.0F);
      this.e = (byte)((int)(var1.v * (double)128.0F));
      this.f = (byte)((int)(var1.w * (double)128.0F));
      this.g = (byte)((int)(var1.x * (double)128.0F));
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.h = var1.readShort();
      this.i = var1.readByte();
      this.m = var1.readShort();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readByte();
      this.f = var1.readByte();
      this.g = var1.readByte();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.h);
      var1.writeByte(this.i);
      var1.writeShort(this.m);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 24;
   }
}
