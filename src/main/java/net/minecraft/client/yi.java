package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

public class yi extends um {
   private List a = new ArrayList();
   private byte b;

   public yi() {
      super("");
   }

   public yi(String var1) {
      super(var1);
   }

   void a(DataOutput var1) throws java.io.IOException {
      if (this.a.size() > 0) {
         this.b = ((um)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      var1.writeByte(this.b);
      var1.writeInt(this.a.size());

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ((um)this.a.get(var2)).a(var1);
      }

   }

   void a(DataInput var1) throws java.io.IOException {
      this.b = var1.readByte();
      int var2 = var1.readInt();
      this.a = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         um var4 = um.a(this.b, (String)null);
         var4.a(var1);
         this.a.add(var4);
      }

   }

   public byte a() {
      return 9;
   }

   public String toString() {
      return "" + this.a.size() + " entries of type " + um.a(this.b);
   }

   public void a(um var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public um a(int var1) {
      return (um)this.a.get(var1);
   }

   public int c() {
      return this.a.size();
   }

   public um b() {
      yi var1 = new yi(this.d());
      var1.b = this.b;

      for(um var3 : (Iterable<um>)(Iterable)(this.a)) {
         um var4 = var3.b();
         var1.a.add(var4);
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         yi var2 = (yi)var1;
         if (this.b == var2.b) {
            return this.a.equals(var2.a);
         }
      }

      return false;
   }
}
