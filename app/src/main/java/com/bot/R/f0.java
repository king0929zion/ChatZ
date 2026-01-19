package R;

import D.C0091s;
import F0.AbstractC0137z;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.D1;
import Q.d3;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.C0873f;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1027d;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import m4.AbstractC1282q;
import v.AbstractC1806l;
import v.InterfaceC1802i0;

/* loaded from: classes.dex */
public final class f0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T.X f6770c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d3 f6771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1802i0 f6772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0873f f6773g;

    public f0(T.X x5, d3 d3Var, InterfaceC1802i0 interfaceC1802i0, C0873f c0873f) {
        this.f6770c = x5;
        this.f6771e = d3Var;
        this.f6772f = interfaceC1802i0;
        this.f6773g = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            InterfaceC1041r l3 = AbstractC0137z.l(C1038o.a, "Container");
            AbstractC1282q abstractC1282q = new AbstractC1282q(this.f6770c, T.X.class, "value", "getValue()Ljava/lang/Object;", 0);
            InterfaceC1027d d6 = l0.d(this.f6771e);
            float f6 = D1.a;
            InterfaceC1041r g3 = l0.h.g(l3, new C0091s(abstractC1282q, this.f6772f, d6, 13));
            F0.V d7 = AbstractC1806l.d(C1026c.f11786c, true);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, g3);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, C0150g.f1928f);
            T.r.G(c0626q, l5, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            this.f6773g.m(c0626q, 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
