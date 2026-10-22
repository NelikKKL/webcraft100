package net.minecraft.client;


public class vz {
   private String a;

   public vz(String var1) {
      this.a = var1;
   }

   /** PATCH(1.0.0): MessageDigest в TeaVM нет. Подпись файла статистики проверяется только самим портом -> FNV-1a 64. */
   public String a(String var1) {
      String var2 = this.a + var1;
      long var3 = -3750763034362895579L;

      for(int var5 = 0; var5 < var2.length(); ++var5) {
         var3 ^= (long)var2.charAt(var5);
         var3 *= 1099511628211L;
      }

      return Long.toHexString(var3);
   }
}
