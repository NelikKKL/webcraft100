package net.minecraft.client;

import java.util.ArrayList;
import java.util.List;

class afp extends pj {
   public List a = new ArrayList();

   public afp(vi var1) {
      yy[] var2 = new yy[]{yy.w, yy.t, yy.aw, yy.G, yy.H, yy.I, yy.N, yy.aN, yy.bm, yy.bm, yy.bm, yy.aW, yy.ax, yy.ah, yy.ai, yy.z, yy.O, yy.al, yy.ao, yy.ak, yy.ak, yy.ak, yy.ak, yy.ak, yy.ak, yy.ap, yy.bb, yy.bc, yy.bd, yy.J, yy.J, yy.J, yy.K, yy.K, yy.K, yy.v, yy.u, yy.E, yy.Q, yy.F, yy.W, yy.x, yy.y, yy.y, yy.y, yy.Y, yy.L, yy.aT, yy.aU, yy.ad, yy.ae, yy.af, yy.ag, yy.aV, yy.br, yy.ba, yy.bf, yy.bu, yy.bp, yy.bq, yy.bA, yy.bB, yy.bC, yy.bJ, yy.by, yy.bz, yy.X, yy.X, yy.au, yy.ay, yy.M, yy.am, yy.an, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.ab, yy.P, yy.aB, yy.R, yy.aY, yy.V, yy.Z, yy.aZ, yy.bv, yy.aF, yy.aG, yy.T, yy.U, yy.aq, yy.at, yy.aH, yy.bw, yy.bx, yy.aJ, yy.aK, yy.aM, yy.aQ, yy.aR, yy.bk, yy.bE};
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 1;

      for(int var10 = 0; var10 < var2.length; ++var10) {
         int var11 = 0;
         if (var2[var10] == yy.ab) {
            var11 = var3++;
         } else if (var2[var10] == yy.ak) {
            var11 = var4++;
         } else if (var2[var10] == yy.J) {
            var11 = var5++;
         } else if (var2[var10] == yy.y) {
            var11 = var6++;
         } else if (var2[var10] == yy.bm) {
            var11 = var7++;
         } else if (var2[var10] == yy.X) {
            var11 = var9++;
         } else if (var2[var10] == yy.K) {
            var11 = var8++;
         }

         this.a.add(new dk(var2[var10], 1, var11));
      }

      for(int var13 = 256; var13 < acy.d.length; ++var13) {
         if (acy.d[var13] != null && acy.d[var13].bM != acy.br.bM) {
            this.a.add(new dk(acy.d[var13]));
         }
      }

      for(int var14 = 1; var14 < 16; ++var14) {
         this.a.add(new dk(acy.aV.bM, 1, var14));
      }

      x var15 = var1.by;

      for(int var16 = 0; var16 < 9; ++var16) {
         for(int var12 = 0; var12 < 8; ++var12) {
            this.a(new vv(aec.e(), var12 + var16 * 8, 8 + var12 * 18, 18 + var16 * 18));
         }
      }

      for(int var17 = 0; var17 < 9; ++var17) {
         this.a(new vv(var15, var17, 8 + var17 * 18, 184));
      }

      this.a(0.0F);
   }

   public boolean a(vi var1) {
      return true;
   }

   public void a(float var1) {
      int var2 = this.a.size() / 8 - 8 + 1;
      int var3 = (int)((double)(var1 * (float)var2) + (double)0.5F);
      if (var3 < 0) {
         var3 = 0;
      }

      for(int var4 = 0; var4 < 9; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            int var6 = var5 + (var4 + var3) * 8;
            if (var6 >= 0 && var6 < this.a.size()) {
               aec.e().a(var5 + var4 * 8, (dk)this.a.get(var6));
            } else {
               aec.e().a(var5 + var4 * 8, (dk)null);
            }
         }
      }

   }

   protected void b(int var1, int var2, boolean var3, vi var4) {
   }
}
