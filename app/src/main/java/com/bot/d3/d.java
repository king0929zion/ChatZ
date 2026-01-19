package d3;

import I.m;
import Q.E0;
import Q.N;
import Q.O;
import Q.Q1;
import Q.S1;
import T.C0626q;
import T.C0627q0;
import T.e1;
import T.r;
import X3.y;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import o0.s;

/* loaded from: classes.dex */
public abstract class d {
    public static final N a;

    /* renamed from: b, reason: collision with root package name */
    public static final N f11432b;

    static {
        long j3 = s.f13477d;
        long j4 = s.f13475b;
        long j5 = AbstractC0940a.f11408g;
        long j6 = AbstractC0940a.f11406e;
        long j7 = AbstractC0940a.f11405d;
        long j8 = AbstractC0940a.a;
        long j9 = AbstractC0940a.f11403b;
        long j10 = AbstractC0940a.f11404c;
        long j11 = AbstractC0940a.f11407f;
        long j12 = AbstractC0940a.f11411j;
        long j13 = AbstractC0940a.f11412k;
        long j14 = AbstractC0940a.f11413l;
        long j15 = AbstractC0940a.f11414m;
        long j16 = AbstractC0940a.f11409h;
        long j17 = AbstractC0940a.f11410i;
        e1 e1Var = O.a;
        a = new N(j3, j4, j5, j3, j3, j6, j7, j6, j7, j8, j3, j6, j7, j9, j7, j10, j7, j11, j7, j3, j8, j3, j12, j13, j14, j15, j16, j17, j4, j5, j10, j6, j6, j11, j10, j9, j3, j3, j4, j4, j6, j6, j7, j7, j8, j8, j3, j3);
        long j18 = AbstractC0940a.f11418q;
        long j19 = AbstractC0940a.f11417p;
        long j20 = AbstractC0940a.f11419r;
        long j21 = AbstractC0940a.f11421t;
        long j22 = AbstractC0940a.f11415n;
        long j23 = AbstractC0940a.f11416o;
        f11432b = new N(j8, j3, j18, j19, j8, j20, j19, j20, j19, j8, j3, j21, j19, j22, j19, j23, j19, AbstractC0940a.f11420s, j19, j8, j3, j4, AbstractC0940a.f11424w, AbstractC0940a.f11425x, AbstractC0940a.f11426y, AbstractC0940a.f11427z, AbstractC0940a.f11422u, AbstractC0940a.f11423v, j4, j23, j21, j20, j21, j21, j20, j23, j8, j8, j3, j3, j20, j20, j19, j19, j8, j8, j3, j3);
    }

    public static final void a(G2.d dVar, C0873f c0873f, C0626q c0626q, int i6) {
        final C0873f c0873f2;
        N n3;
        c0626q.d0(-59298257);
        int i7 = (c0626q.h(dVar) ? 4 : 2) | i6 | 48;
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            boolean z5 = (((Configuration) c0626q.j(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
            int ordinal = ((G2.e) Y4.d.r(dVar.f1655d, c0626q).getValue()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    z5 = false;
                } else {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                    z5 = true;
                }
            }
            if (z5) {
                c0626q.b0(-1151025666);
                c0626q.p(false);
                n3 = a;
            } else {
                c0626q.b0(-1151024641);
                c0626q.p(false);
                n3 = f11432b;
            }
            final N n5 = n3;
            final long j3 = z5 ? AbstractC0940a.a : s.f13477d;
            final long j4 = z5 ? s.f13477d : s.f13475b;
            c0873f2 = c0873f;
            r.a(S1.a.a(z5 ? new Q1(new P.b(0.2f, 0.16f, 0.12f, 0.24f), 1) : new Q1(null, 3)), AbstractC0874g.c(1430246127, new l4.e() { // from class: d3.c
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    C0626q c0626q2 = (C0626q) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c0626q2.S(intValue & 1, (intValue & 3) != 2)) {
                        N n6 = N.this;
                        E0.b(new N(n6.a, n6.f5405b, n6.f5407c, n6.f5409d, n6.f5411e, n6.f5413f, n6.f5415g, n6.f5417h, n6.f5419i, n6.f5420j, n6.f5421k, n6.f5422l, n6.f5423m, n6.f5424n, n6.f5425o, n6.f5426p, n6.f5427q, n6.f5428r, n6.f5429s, n6.f5430t, j3, j4, n6.f5433w, n6.f5434x, n6.f5435y, n6.f5436z, n6.f5378A, n6.f5379B, n6.f5380C, n6.f5381D, n6.f5382E, n6.f5383F, n6.f5384G, n6.f5385H, n6.f5386I, n6.f5387J, n6.f5388K, n6.f5389L, n6.f5390M, n6.f5391N, n6.f5392O, n6.f5393P, n6.f5394Q, n6.f5395R, n6.f5396S, n6.f5397T, n6.f5398U, n6.f5399V), null, e.a, c0873f2, c0626q2, 384);
                    } else {
                        c0626q2.V();
                    }
                    return y.a;
                }
            }, c0626q), c0626q, 56);
        } else {
            c0873f2 = c0873f;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new m(i6, 20, dVar, c0873f2);
        }
    }
}
