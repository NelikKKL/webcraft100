package net.minecraft.client;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ik extends um {
   private Map a = new HashMap();

   public ik() {
      super("");
   }

   public ik(String var1) {
      super(var1);
   }

   void a(DataOutput var1) throws java.io.IOException {
      for(um var3 : (Iterable<um>)(Iterable)(this.a.values())) {
         um.a(var3, var1);
      }

      var1.writeByte(0);
   }

   void a(DataInput var1) throws java.io.IOException {
      this.a.clear();

      um var2;
      while((var2 = um.b(var1)).a() != 0) {
         this.a.put(var2.d(), var2);
      }

   }

   public Collection c() {
      return this.a.values();
   }

   public byte a() {
      return 10;
   }

   public void a(String var1, um var2) {
      this.a.put(var1, var2.n(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, new xq(var1, var2));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, new cg(var1, var2));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, new hx(var1, var2));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, new vw(var1, var2));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, new vd(var1, var2));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, new fg(var1, var2));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, new yt(var1, var2));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, new ca(var1, var2));
   }

   public void a(String var1, ik var2) {
      this.a.put(var1, var2.n(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2 ? 1 : 0));
   }

   public um a(String var1) {
      return (um)this.a.get(var1);
   }

   public boolean b(String var1) {
      return this.a.containsKey(var1);
   }

   public byte c(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((xq)this.a.get(var1)).a;
   }

   public short d(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((cg)this.a.get(var1)).a;
   }

   public int e(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((hx)this.a.get(var1)).a;
   }

   public long f(String var1) {
      return !this.a.containsKey(var1) ? 0L : ((vw)this.a.get(var1)).a;
   }

   public float g(String var1) {
      return !this.a.containsKey(var1) ? 0.0F : ((vd)this.a.get(var1)).a;
   }

   public double h(String var1) {
      return !this.a.containsKey(var1) ? (double)0.0F : ((fg)this.a.get(var1)).a;
   }

   public String i(String var1) {
      return !this.a.containsKey(var1) ? "" : ((yt)this.a.get(var1)).a;
   }

   public byte[] j(String var1) {
      return !this.a.containsKey(var1) ? new byte[0] : ((ca)this.a.get(var1)).a;
   }

   public ik k(String var1) {
      return !this.a.containsKey(var1) ? new ik(var1) : (ik)this.a.get(var1);
   }

   public yi l(String var1) {
      return !this.a.containsKey(var1) ? new yi(var1) : (yi)this.a.get(var1);
   }

   public boolean m(String var1) {
      return this.c(var1) != 0;
   }

   public String toString() {
      return "" + this.a.size() + " entries";
   }

   public um b() {
      ik var1 = new ik(this.d());

      for(String var3 : (Iterable<String>)(Iterable)(this.a.keySet())) {
         var1.a(var3, ((um)this.a.get(var3)).b());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         ik var2 = (ik)var1;
         return this.a.entrySet().equals(var2.a.entrySet());
      } else {
         return false;
      }
   }
}
