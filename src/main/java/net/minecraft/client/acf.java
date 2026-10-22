package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class acf {
   public float a;
   public float b;
   private int o;
   private int p;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h;
   private boolean q;
   private int r;
   public boolean i;
   public boolean j;
   public boolean k;
   public List l;
   public List m;
   public final String n;
   private al s;

   public acf(al var1, String var2) {
      this.a = 64.0F;
      this.b = 32.0F;
      this.q = false;
      this.r = 0;
      this.i = false;
      this.j = true;
      this.k = false;
      this.l = new ArrayList();
      this.s = var1;
      var1.c.add(this);
      this.n = var2;
      this.b(var1.e, var1.f);
   }

   public acf(al var1) {
      this(var1, (String)null);
   }

   public acf(al var1, int var2, int var3) {
      this(var1);
      this.a(var2, var3);
   }

   public void a(acf var1) {
      if (this.m == null) {
         this.m = new ArrayList();
      }

      this.m.add(var1);
   }

   public acf a(int var1, int var2) {
      this.o = var1;
      this.p = var2;
      return this;
   }

   public acf a(String var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      var1 = this.n + "." + var1;
      sx var8 = this.s.a(var1);
      this.a(var8.a, var8.b);
      this.l.add((new ad(this, this.o, this.p, var2, var3, var4, var5, var6, var7, 0.0F)).a(var1));
      return this;
   }

   public acf a(float var1, float var2, float var3, int var4, int var5, int var6) {
      this.l.add(new ad(this, this.o, this.p, var1, var2, var3, var4, var5, var6, 0.0F));
      return this;
   }

   public void a(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.l.add(new ad(this, this.o, this.p, var1, var2, var3, var4, var5, var6, var7));
   }

   public void a(float var1, float var2, float var3) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
   }

   public void a(float var1) {
      if (!this.k) {
         if (this.j) {
            if (!this.q) {
               this.d(var1);
            }

            if (this.f == 0.0F && this.g == 0.0F && this.h == 0.0F) {
               if (this.c == 0.0F && this.d == 0.0F && this.e == 0.0F) {
                  GL11.glCallList(this.r);
                  if (this.m != null) {
                     for(int var4 = 0; var4 < this.m.size(); ++var4) {
                        ((acf)this.m.get(var4)).a(var1);
                     }
                  }
               } else {
                  GL11.glTranslatef(this.c * var1, this.d * var1, this.e * var1);
                  GL11.glCallList(this.r);
                  if (this.m != null) {
                     for(int var3 = 0; var3 < this.m.size(); ++var3) {
                        ((acf)this.m.get(var3)).a(var1);
                     }
                  }

                  GL11.glTranslatef(-this.c * var1, -this.d * var1, -this.e * var1);
               }
            } else {
               GL11.glPushMatrix();
               GL11.glTranslatef(this.c * var1, this.d * var1, this.e * var1);
               if (this.h != 0.0F) {
                  GL11.glRotatef(this.h * (180F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
               }

               if (this.g != 0.0F) {
                  GL11.glRotatef(this.g * (180F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
               }

               if (this.f != 0.0F) {
                  GL11.glRotatef(this.f * (180F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
               }

               GL11.glCallList(this.r);
               if (this.m != null) {
                  for(int var2 = 0; var2 < this.m.size(); ++var2) {
                     ((acf)this.m.get(var2)).a(var1);
                  }
               }

               GL11.glPopMatrix();
            }

         }
      }
   }

   public void b(float var1) {
      if (!this.k) {
         if (this.j) {
            if (!this.q) {
               this.d(var1);
            }

            GL11.glPushMatrix();
            GL11.glTranslatef(this.c * var1, this.d * var1, this.e * var1);
            if (this.g != 0.0F) {
               GL11.glRotatef(this.g * (180F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
            }

            if (this.f != 0.0F) {
               GL11.glRotatef(this.f * (180F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }

            if (this.h != 0.0F) {
               GL11.glRotatef(this.h * (180F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
            }

            GL11.glCallList(this.r);
            GL11.glPopMatrix();
         }
      }
   }

   public void c(float var1) {
      if (!this.k) {
         if (this.j) {
            if (!this.q) {
               this.d(var1);
            }

            if (this.f == 0.0F && this.g == 0.0F && this.h == 0.0F) {
               if (this.c != 0.0F || this.d != 0.0F || this.e != 0.0F) {
                  GL11.glTranslatef(this.c * var1, this.d * var1, this.e * var1);
               }
            } else {
               GL11.glTranslatef(this.c * var1, this.d * var1, this.e * var1);
               if (this.h != 0.0F) {
                  GL11.glRotatef(this.h * (180F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
               }

               if (this.g != 0.0F) {
                  GL11.glRotatef(this.g * (180F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
               }

               if (this.f != 0.0F) {
                  GL11.glRotatef(this.f * (180F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
               }
            }

         }
      }
   }

   private void d(float var1) {
      this.r = bt.a(1);
      GL11.glNewList(this.r, 4864);
      cv var2 = cv.a;

      for(int var3 = 0; var3 < this.l.size(); ++var3) {
         ((ad)this.l.get(var3)).a(var2, var1);
      }

      GL11.glEndList();
      this.q = true;
   }

   public acf b(int var1, int var2) {
      this.a = (float)var1;
      this.b = (float)var2;
      return this;
   }
}
