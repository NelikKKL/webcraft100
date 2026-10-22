package net.minecraft.client;

public abstract class aef {
   public static final aef[] b = new aef[256];
   public static final aef c = new ii(0, 10, 0);
   public static final aef d = new ii(1, 5, 1);
   public static final aef e = new ii(2, 5, 2);
   public static final aef f = new ii(3, 2, 3);
   public static final aef g = new ii(4, 5, 4);
   public static final aef h = new vu(5, 2);
   public static final aef i = new adz(6, 2);
   public static final aef j = new ap(16, 10, 0);
   public static final aef k = new ap(17, 5, 1);
   public static final aef l = new ap(18, 5, 2);
   public static final aef m = new dz(19, 5);
   public static final aef n = new aie(20, 2);
   public static final aef o;
   public static final aef p;
   public static final aef q;
   public static final aef r;
   public static final aef s;
   public final int t;
   private final int a;
   public q u;
   protected String v;

   protected aef(int var1, int var2, q var3) {
      this.t = var1;
      this.a = var2;
      this.u = var3;
      if (b[var1] != null) {
         throw new IllegalArgumentException("Duplicate enchantment id!");
      } else {
         b[var1] = this;
      }
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return 1;
   }

   public int a() {
      return 1;
   }

   public int a(int var1) {
      return 1 + var1 * 10;
   }

   public int b(int var1) {
      return this.a(var1) + 5;
   }

   public int a(int var1, pm var2) {
      return 0;
   }

   public int a(int var1, nq var2) {
      return 0;
   }

   public boolean a(aef var1) {
      return this != var1;
   }

   public aef a(String var1) {
      this.v = var1;
      return this;
   }

   public String b() {
      return "enchantment." + this.v;
   }

   public String c(int var1) {
      String var2 = hj.a(this.b());
      return var2 + " " + hj.a("enchantment.level." + var1);
   }

   static {
      o = new qn(21, 2, net.minecraft.client.q.g);
      p = new kr(32, 10);
      q = new gi(33, 1);
      r = new dq(34, 5);
      s = new qn(35, 2, net.minecraft.client.q.h);
   }
}
