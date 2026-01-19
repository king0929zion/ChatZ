package R;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import P2.I0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.d1;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import n.u0;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public final class h0 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f6783c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f6784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0.P f6785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.e f6786g;

    public h0(u0 u0Var, long j3, S0.P p5, l4.e eVar) {
        this.f6783c = u0Var;
        this.f6784e = j3;
        this.f6785f = p5;
        this.f6786g = eVar;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
        C0626q c0626q = (C0626q) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0626q.f(interfaceC1041r) ? 4 : 2;
        }
        if (c0626q.S(intValue & 1, (intValue & 19) != 18)) {
            d1 d1Var = this.f6783c;
            boolean f6 = c0626q.f(d1Var);
            Object P5 = c0626q.P();
            if (f6 || P5 == C0616l.a) {
                P5 = new I0(d1Var, 1);
                c0626q.m0(P5);
            }
            InterfaceC1041r o5 = o0.y.o(interfaceC1041r, (l4.c) P5);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, o5);
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
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            l0.b(this.f6784e, this.f6785f, this.f6786g, c0626q, 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
