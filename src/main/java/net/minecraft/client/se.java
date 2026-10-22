package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class se extends gt {
   public int a;
   private List b;

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = cr.a(var1);
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      cr.a(this.b, var1);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }

   public List c() {
      return this.b;
   }
}
