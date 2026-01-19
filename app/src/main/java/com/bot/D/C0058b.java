package D;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0626q;
import T.InterfaceC0617l0;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import p.AbstractC1464z;
import v.AbstractC1806l;

/* renamed from: D.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0058b implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f981c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f983f;

    public /* synthetic */ C0058b(long j3, InterfaceC1041r interfaceC1041r) {
        this.f982e = j3;
        this.f983f = interfaceC1041r;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f981c) {
            case 0:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) this.f983f;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    long j3 = this.f982e;
                    if (j3 != 9205357640488583168L) {
                        c0626q.b0(-1244013944);
                        InterfaceC1041r i6 = v.t0.i(interfaceC1041r, e1.h.b(j3), e1.h.a(j3), S.l.f7374V, S.l.f7374V, 12);
                        F0.V d6 = AbstractC1806l.d(C1026c.f11787e, false);
                        int hashCode = Long.hashCode(c0626q.f8164T);
                        InterfaceC0617l0 l3 = c0626q.l();
                        InterfaceC1041r c6 = AbstractC1024a.c(c0626q, i6);
                        InterfaceC0152h.a.getClass();
                        C0148f c0148f = C0150g.f1924b;
                        c0626q.f0();
                        if (c0626q.f8163S) {
                            c0626q.k(c0148f);
                        } else {
                            c0626q.p0();
                        }
                        T.r.G(c0626q, d6, C0150g.f1928f);
                        T.r.G(c0626q, l3, C0150g.f1927e);
                        T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                        T.r.C(c0626q, C0150g.f1930h);
                        T.r.G(c0626q, c6, C0150g.f1926d);
                        AbstractC0070h.b(null, c0626q, 0, 1);
                        c0626q.p(true);
                        c0626q.p(false);
                    } else {
                        c0626q.b0(-1243644858);
                        AbstractC0070h.b(interfaceC1041r, c0626q, 0, 0);
                        c0626q.p(false);
                    }
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                ((Integer) obj2).getClass();
                R.l0.c(this.f982e, (l4.e) this.f983f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            default:
                C.d dVar = (C.d) this.f983f;
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC1806l.a(AbstractC1464z.f(l0.h.c(C1038o.a, dVar), this.f982e, o0.y.f13496b), c0626q2, 0);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0058b(long j3, l4.e eVar, int i6) {
        this.f982e = j3;
        this.f983f = eVar;
    }

    public /* synthetic */ C0058b(C.d dVar, long j3) {
        this.f983f = dVar;
        this.f982e = j3;
    }
}
