package D;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import O.InterfaceC0331s;
import P2.C0389z;
import Q.R1;
import Q.f3;
import S0.C0545g;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import p.AbstractC1464z;
import v.AbstractC1787b;
import v.AbstractC1799h;

/* renamed from: D.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0060c implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f987c = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f989f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f990g;

    public /* synthetic */ C0060c(long j3, C0545g c0545g, S0.P p5) {
        this.f988e = j3;
        this.f989f = c0545g;
        this.f990g = p5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f987c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0070h.a((InterfaceC0331s) this.f989f, (InterfaceC1041r) this.f990g, this.f988e, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 1:
                String str = (String) this.f989f;
                l4.c cVar = (l4.c) this.f990g;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    if (str.length() > 0) {
                        c0626q.b0(2095324114);
                        boolean f6 = c0626q.f(cVar);
                        Object P5 = c0626q.P();
                        if (f6 || P5 == C0616l.a) {
                            P5 = new C0389z(cVar, 3);
                            c0626q.m0(P5);
                        }
                        R1.g((InterfaceC1193a) P5, null, false, null, null, AbstractC0874g.c(-1407371400, new R2.C(this.f988e, 1), c0626q), c0626q, 1572864, 62);
                    } else {
                        c0626q.b0(2089071011);
                    }
                    c0626q.p(false);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0545g c0545g = (C0545g) this.f989f;
                S0.P p5 = (S0.P) this.f990g;
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    float f7 = 8;
                    InterfaceC1041r r5 = AbstractC1464z.r(AbstractC1787b.y(AbstractC1464z.f(v.t0.a, this.f988e, C.e.c(S.l.f7374V, S.l.f7374V, f7, f7, 3)), 12), AbstractC1464z.q(c0626q2), false);
                    v.p0 a = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q2, 0);
                    int hashCode = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l3 = c0626q2.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, r5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, a, C0150g.f1928f);
                    T.r.G(c0626q2, l3, C0150g.f1927e);
                    T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q2, C0150g.f1930h);
                    T.r.G(c0626q2, c6, C0150g.f1926d);
                    f3.c(c0545g, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, p5, c0626q2, 0, 0, 262142);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0060c(InterfaceC0331s interfaceC0331s, InterfaceC1041r interfaceC1041r, long j3, int i6) {
        this.f989f = interfaceC0331s;
        this.f990g = interfaceC1041r;
        this.f988e = j3;
    }

    public /* synthetic */ C0060c(String str, l4.c cVar, long j3) {
        this.f989f = str;
        this.f990g = cVar;
        this.f988e = j3;
    }
}
