package net.minecraft.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class qm extends gt {
   public int a;
   public int b;
   public int c;
   public int d;

   public qm() {
   }

   public qm(ia var1) {
      this(var1.j, var1.v, var1.w, var1.x);
   }

   public qm(int var1, double var2, double var4, double var6) {
      this.a = var1;
      double var8 = 3.9;
      if (var2 < -var8) {
         var2 = -var8;
      }

      if (var4 < -var8) {
         var4 = -var8;
      }

      if (var6 < -var8) {
         var6 = -var8;
      }

      if (var2 > var8) {
         var2 = var8;
      }

      if (var4 > var8) {
         var4 = var8;
      }

      if (var6 > var8) {
         var6 = var8;
      }

      this.b = (int)(var2 * (double)8000.0F);
      this.c = (int)(var4 * (double)8000.0F);
      this.d = (int)(var6 * (double)8000.0F);
   }

   public void a(DataInputStream var1) throws java.io.IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readShort();
      this.d = var1.readShort();
   }

   public void a(DataOutputStream var1) throws java.io.IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeShort(this.c);
      var1.writeShort(this.d);
   }

   public void a(fe var1) {
      var1.a(this);
   }

   public int a() {
      return 10;
   }
}
