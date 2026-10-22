package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class yr extends gt {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public String f;

   public yr() {
   }

   public yr(tj var1) {
      this.a = var1.j;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.a;
      this.f = var1.e.A;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.f = a(var1, sv.z);
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      a(this.f, var1);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 24;
   }
}
