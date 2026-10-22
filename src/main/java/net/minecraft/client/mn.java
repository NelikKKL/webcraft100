package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class mn extends gt {
   public int a;
   public byte b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   private cr h;
   private List i;

   public mn() {
   }

   public mn(nq var1) {
      this.a = var1.j;
      this.b = (byte)afw.a(var1);
      this.c = me.c(var1.s * (double)32.0F);
      this.d = me.c(var1.t * (double)32.0F);
      this.e = me.c(var1.u * (double)32.0F);
      this.f = (byte)((int)(var1.y * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.z * 256.0F / 360.0F));
      this.h = var1.t();
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readByte();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.i = cr.a(var1);
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      this.h.a(var1);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 20;
   }

   public List c() {
      return this.i;
   }
}
