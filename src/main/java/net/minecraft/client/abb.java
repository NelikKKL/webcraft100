package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class abb extends gt {
   public String a;

   public abb() {
   }

   public abb(String var1) {
      if (var1.length() > 119) {
         var1 = var1.substring(0, 119);
      }

      this.a = var1;
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = a(var1, 119);
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      a(this.a, var1);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length();
   }
}
