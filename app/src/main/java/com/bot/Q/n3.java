package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0625p0;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.C0873f;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public final class n3 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f6016c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f6017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f6018f;

    public n3(float f6, long j3, C0873f c0873f) {
        this.f6016c = f6;
        this.f6017e = j3;
        this.f6018f = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            InterfaceC1041r x5 = AbstractC1787b.x(v.t0.m(C1038o.a, o3.f6028c, o3.f6027b, this.f6016c, 8), o3.f6029d);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, x5);
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
            T.r.b(new C0625p0[]{U.a.a(new o0.s(this.f6017e)), f3.a.a(u3.a(S.l.f7370R, c0626q))}, this.f6018f, c0626q, 8);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
