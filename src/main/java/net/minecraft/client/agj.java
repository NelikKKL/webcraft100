package net.minecraft.client;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class agj implements FileFilter {
   public static final Pattern a = Pattern.compile("[0-9a-z]|([0-9a-z][0-9a-z])");

   private agj() {
   }

   public boolean accept(File var1) {
      if (var1.isDirectory()) {
         Matcher var2 = a.matcher(var1.getName());
         return var2.matches();
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   agj(te var1) {
      this();
   }
}
