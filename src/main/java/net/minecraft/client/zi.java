package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class zi extends gt {
   private float a;
   private float b;
   private boolean c;
   private boolean d;
   private float e;
   private float f;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readFloat();
      this.b = var1.readFloat();
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      this.c = var1.readBoolean();
      this.d = var1.readBoolean();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeFloat(this.a);
      var1.writeFloat(this.b);
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      var1.writeBoolean(this.c);
      var1.writeBoolean(this.d);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 18;
   }
}
