package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ph extends gt {
   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public int h;

   public ph() {
   }

   public ph(vi var1) {
      this.a = var1.j;
      this.b = var1.bJ;
      this.c = me.c(var1.s * (double)32.0F);
      this.d = me.c(var1.t * (double)32.0F);
      this.e = me.c(var1.u * (double)32.0F);
      this.f = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.z * 256.0F / 360.0F));
      dk var2 = var1.by.a();
      this.h = var2 == null ? 0 : var2.c;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = a(var1, 16);
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      a(this.b, var1);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 28;
   }
}
