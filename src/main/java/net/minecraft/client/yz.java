package net.minecraft.client;

abstract class yz implements gz {
   public final Object c(Object var1) {
      if (!this.b(var1)) {
         throw he.a((gz)this);
      } else {
         return this.a(var1);
      }
   }

   protected abstract Object a(Object var1);
}
