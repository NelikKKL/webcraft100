package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class fi extends gt {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;

   public fi() {
   }

   public fi(fk var1) {
      this.a = var1.j;
      this.b = me.c(var1.s * (double)32.0F);
      this.c = me.c(var1.t * (double)32.0F);
      this.d = me.c(var1.u * (double)32.0F);
      this.e = var1.g();
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readShort();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeShort(this.e);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 18;
   }
}
