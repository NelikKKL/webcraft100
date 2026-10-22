package net.minecraft.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class er implements ej {
   private zx a;
   private wv b = new wv();
   private List c = new ArrayList();
   private ry d;

   public er(ry var1) {
      this.a = new hn(var1, new byte[256 * var1.c], 0, 0);
      this.d = var1;
   }

   public boolean c(int var1, int var2) {
      return this != null ? true : this.b.b(acm.a(var1, var2));
   }

   public void d(int var1, int var2) {
      zx var3 = this.b(var1, var2);
      if (!var3.h()) {
         var3.f();
      }

      this.b.d(acm.a(var1, var2));
      this.c.remove(var3);
   }

   public zx a(int var1, int var2) {
      byte[] var3 = new byte[256 * this.d.c];
      zx var4 = new zx(this.d, var3, var1, var2);
      Arrays.fill(var4.h.a, (byte)-1);
      this.b.a(acm.a(var1, var2), var4);
      var4.e = true;
      return var4;
   }

   public zx b(int var1, int var2) {
      zx var3 = (zx)this.b.a(acm.a(var1, var2));
      return var3 == null ? this.a : var3;
   }

   public boolean a(boolean var1, rz var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(ej var1, int var2, int var3) {
   }

   public String c() {
      return "MultiplayerChunkCache: " + this.b.a();
   }

   public List a(jf var1, int var2, int var3, int var4) {
      return null;
   }

   public am a(ry var1, String var2, int var3, int var4, int var5) {
      return null;
   }
}
