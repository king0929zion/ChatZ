package O;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import I0.X0;
import Q.M1;
import Q.R1;
import T.C0602e;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import v.AbstractC1787b;
import v.C1810p;

/* renamed from: O.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0300c implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4080c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4084h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4085i;

    public /* synthetic */ C0300c(X0 x02, long j3, boolean z5, InterfaceC1041r interfaceC1041r, InterfaceC0331s interfaceC0331s) {
        this.f4083g = x02;
        this.f4082f = j3;
        this.f4081e = z5;
        this.f4084h = interfaceC1041r;
        this.f4085i = interfaceC0331s;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f4080c) {
            case 0:
                X0 x02 = (X0) this.f4083g;
                final InterfaceC1041r interfaceC1041r = (InterfaceC1041r) this.f4084h;
                final InterfaceC0331s interfaceC0331s = (InterfaceC0331s) this.f4085i;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    C0625p0 a = AbstractC0204q0.f2369s.a(x02);
                    final long j3 = this.f4082f;
                    final boolean z5 = this.f4081e;
                    T.r.a(a, AbstractC0874g.c(1260045569, new l4.e() { // from class: O.e
                        @Override // l4.e
                        public final Object m(Object obj3, Object obj4) {
                            C0626q c0626q2 = (C0626q) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                long j4 = j3;
                                boolean z6 = z5;
                                InterfaceC1041r interfaceC1041r2 = interfaceC1041r;
                                final InterfaceC0331s interfaceC0331s2 = interfaceC0331s;
                                C0602e c0602e = C0616l.a;
                                if (j4 != 9205357640488583168L) {
                                    c0626q2.b0(3458246);
                                    C1810p c1810p = z6 ? AbstractC1787b.f15285b : AbstractC1787b.a;
                                    InterfaceC1041r i6 = v.t0.i(interfaceC1041r2, e1.h.b(j4), e1.h.a(j4), S.l.f7374V, S.l.f7374V, 12);
                                    v.p0 a6 = v.o0.a(c1810p, C1026c.f11795m, c0626q2, 0);
                                    int hashCode = Long.hashCode(c0626q2.f8164T);
                                    InterfaceC0617l0 l3 = c0626q2.l();
                                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, i6);
                                    InterfaceC0152h.a.getClass();
                                    C0148f c0148f = C0150g.f1924b;
                                    c0626q2.f0();
                                    if (c0626q2.f8163S) {
                                        c0626q2.k(c0148f);
                                    } else {
                                        c0626q2.p0();
                                    }
                                    T.r.G(c0626q2, a6, C0150g.f1928f);
                                    T.r.G(c0626q2, l3, C0150g.f1927e);
                                    T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                                    T.r.C(c0626q2, C0150g.f1930h);
                                    T.r.G(c0626q2, c6, C0150g.f1926d);
                                    boolean h3 = c0626q2.h(interfaceC0331s2);
                                    Object P5 = c0626q2.P();
                                    if (h3 || P5 == c0602e) {
                                        final int i7 = 0;
                                        P5 = new InterfaceC1193a() { // from class: O.f
                                            @Override // l4.InterfaceC1193a
                                            public final Object b() {
                                                switch (i7) {
                                                    case 0:
                                                        return Boolean.valueOf((interfaceC0331s2.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    default:
                                                        return Boolean.valueOf((interfaceC0331s2.a() & 9223372034707292159L) != 9205357640488583168L);
                                                }
                                            }
                                        };
                                        c0626q2.m0(P5);
                                    }
                                    AbstractC0336u0.e(C1038o.a, (InterfaceC1193a) P5, z6, c0626q2, 6);
                                    c0626q2.p(true);
                                    c0626q2.p(false);
                                } else {
                                    c0626q2.b0(4389176);
                                    boolean h6 = c0626q2.h(interfaceC0331s2);
                                    Object P6 = c0626q2.P();
                                    if (h6 || P6 == c0602e) {
                                        final int i8 = 1;
                                        P6 = new InterfaceC1193a() { // from class: O.f
                                            @Override // l4.InterfaceC1193a
                                            public final Object b() {
                                                switch (i8) {
                                                    case 0:
                                                        return Boolean.valueOf((interfaceC0331s2.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    default:
                                                        return Boolean.valueOf((interfaceC0331s2.a() & 9223372034707292159L) != 9205357640488583168L);
                                                }
                                            }
                                        };
                                        c0626q2.m0(P6);
                                    }
                                    AbstractC0336u0.e(interfaceC1041r2, (InterfaceC1193a) P6, z6, c0626q2, 0);
                                    c0626q2.p(false);
                                }
                            } else {
                                c0626q2.V();
                            }
                            return X3.y.a;
                        }
                    }, c0626q), c0626q, 56);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                R2.A a6 = (R2.A) this.f4083g;
                m0.n nVar = (m0.n) this.f4084h;
                l4.c cVar = (l4.c) this.f4085i;
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    R2.A a7 = R2.A.f6855e;
                    long j4 = this.f4082f;
                    if (a6 == a7) {
                        c0626q2.b0(-245411598);
                        boolean h3 = c0626q2.h(nVar) | c0626q2.f(cVar);
                        Object P5 = c0626q2.P();
                        if (h3 || P5 == C0616l.a) {
                            P5 = new D.r(22, nVar, cVar);
                            c0626q2.m0(P5);
                        }
                        R1.g((InterfaceC1193a) P5, null, false, null, null, AbstractC0874g.c(-231117961, new R2.C(j4, 0), c0626q2), c0626q2, 1572864, 62);
                        c0626q2.p(false);
                    } else if (this.f4081e) {
                        c0626q2.b0(-244677394);
                        M1.a(v.t0.j(C1038o.a, 20), ((Q.N) c0626q2.j(Q.O.a)).a, 2, 0L, 0, S.l.f7374V, c0626q2, 390, 56);
                        c0626q2.p(false);
                    } else {
                        c0626q2.b0(-244316461);
                        Q.A0.a(Y3.C.L(R.drawable.search, 0, c0626q2), null, null, j4, c0626q2, 56, 4);
                        c0626q2.p(false);
                    }
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0300c(R2.A a, m0.n nVar, l4.c cVar, boolean z5, long j3) {
        this.f4083g = a;
        this.f4084h = nVar;
        this.f4085i = cVar;
        this.f4081e = z5;
        this.f4082f = j3;
    }
}
