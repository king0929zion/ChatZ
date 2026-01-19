package Q;

import F0.C0125m;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.C0873f;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import p.AbstractC1464z;
import p.C1417G;
import t.C1682j;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public final class W2 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5573c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0.L f5574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f5576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1417G f5577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1682j f5578i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5579j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f5580k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0873f f5582m;

    public W2(InterfaceC1041r interfaceC1041r, o0.L l3, long j3, float f6, C1417G c1417g, C1682j c1682j, boolean z5, InterfaceC1193a interfaceC1193a, float f7, C0873f c0873f) {
        this.f5573c = interfaceC1041r;
        this.f5574e = l3;
        this.f5575f = j3;
        this.f5576g = f6;
        this.f5577h = c1417g;
        this.f5578i = c1682j;
        this.f5579j = z5;
        this.f5580k = interfaceC1193a;
        this.f5581l = f7;
        this.f5582m = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            C0125m c0125m = D0.a;
            InterfaceC1041r c6 = AbstractC1464z.j(X2.c(this.f5573c.c(L0.a), this.f5574e, X2.d(this.f5575f, this.f5576g, c0626q), this.f5577h, ((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).e0(this.f5581l)), this.f5578i, S1.a(S.l.f7374V, 7, 0L, false), this.f5579j, null, this.f5580k, 24).c(new R.J(new P2.D0(7)));
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, true);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, c6);
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
            T.r.G(c0626q, c7, C0150g.f1926d);
            this.f5582m.m(c0626q, 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
