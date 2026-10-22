package net.minecraft.client;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class rm implements FilenameFilter {
   public static final Pattern a = Pattern.compile("c\\.(-?[0-9a-z]+)\\.(-?[0-9a-z]+)\\.dat");

   private rm() {
   }

   public boolean accept(File var1, String var2) {
      Matcher var3 = a.matcher(var2);
      return var3.matches();
   }

   // $FF: synthetic method
   rm(te var1) {
      this();
   }
}
