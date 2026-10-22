package net.minecraft.client;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class px {
   public final int a;
   public final String b;
   public boolean c;
   public String d;
   private final un h;
   private static NumberFormat i;
   public static un e;
   private static DecimalFormat j;
   public static un f;
   public static un g;

   public px(int var1, String var2, un var3) {
      this.c = false;
      this.a = var1;
      this.b = var2;
      this.h = var3;
   }

   public px(int var1, String var2) {
      this(var1, var2, e);
   }

   public px b() {
      this.c = true;
      return this;
   }

   public px a() {
      if (ny.a.containsKey(this.a)) {
         throw new RuntimeException("Duplicate stat id: \"" + ((px)ny.a.get(this.a)).b + "\" and \"" + this.b + "\" at id " + this.a);
      } else {
         ny.b.add(this);
         ny.a.put(this.a, this);
         this.d = kp.a(this.a);
         return this;
      }
   }

   public boolean c() {
      return false;
   }

   public String a(int var1) {
      return this.h.a(var1);
   }

   public String toString() {
      return this.b;
   }

   // $FF: synthetic method
   static NumberFormat d() {
      return i;
   }

   // $FF: synthetic method
   static DecimalFormat e() {
      return j;
   }

   static {
      i = NumberFormat.getIntegerInstance(Locale.US);
      e = new acc();
      j = new DecimalFormat("########0.00");
      f = new i();
      g = new jg();
   }
}
