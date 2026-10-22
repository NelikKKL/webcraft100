package net.minecraft.client;

import java.util.List;
import java.util.Map;

public abstract class an {
   an() {
   }

   public abstract pp b();

   public abstract String c();

   public abstract Map a();

   public abstract List d();

   public final String a(Object... var1) {
      return (String)this.a(ek.a(var1), this, var1);
   }

   public final List b(Object... var1) {
      return (List)this.a(ek.b(var1), this, var1);
   }

   private Object a(dx var1, an var2, Object[] var3) {
      try {
         return var1.b(var2);
      } catch (he var5) {
         throw xo.a(var5, var3, ahf.a(var2));
      }
   }
}
