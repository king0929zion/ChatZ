package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.C0873f;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.C1316c;
import v.AbstractC1787b;
import v.AbstractC1806l;
import x4.InterfaceC1942y;

/* renamed from: Q.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404d1 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5748c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f5749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0405d2 f5750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0456q1 f5751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1316c f5752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f5753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.c f5754j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5755k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5756l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o0.L f5758n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5759o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f5760p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f5761q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l4.e f5762r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l4.e f5763s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0873f f5764t;

    public C0404d1(long j3, InterfaceC1193a interfaceC1193a, C0405d2 c0405d2, C0456q1 c0456q1, C1316c c1316c, InterfaceC1942y interfaceC1942y, l4.c cVar, InterfaceC1041r interfaceC1041r, float f6, boolean z5, o0.L l3, long j4, long j5, float f7, l4.e eVar, l4.e eVar2, C0873f c0873f) {
        this.f5748c = j3;
        this.f5749e = interfaceC1193a;
        this.f5750f = c0405d2;
        this.f5751g = c0456q1;
        this.f5752h = c1316c;
        this.f5753i = interfaceC1942y;
        this.f5754j = cVar;
        this.f5755k = interfaceC1041r;
        this.f5756l = f6;
        this.f5757m = z5;
        this.f5758n = l3;
        this.f5759o = j4;
        this.f5760p = j5;
        this.f5761q = f7;
        this.f5762r = eVar;
        this.f5763s = eVar2;
        this.f5764t = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            InterfaceC1041r s5 = AbstractC1787b.s(v.t0.f15349c);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new P2.D0(5);
                c0626q.m0(P5);
            }
            InterfaceC1041r a = P0.n.a(s5, false, (l4.c) P5);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, a);
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
            C0405d2 c0405d2 = this.f5750f;
            boolean z5 = ((EnumC0409e2) c0405d2.f5767d.f6831h.getValue()) != EnumC0409e2.f5776c;
            boolean z6 = this.f5751g.f6053c;
            long j3 = this.f5748c;
            InterfaceC1193a interfaceC1193a = this.f5749e;
            AbstractC0452p1.c(j3, interfaceC1193a, z5, z6, c0626q, 0);
            AbstractC0452p1.b(this.f5752h, this.f5753i, interfaceC1193a, this.f5754j, this.f5755k, c0405d2, this.f5756l, this.f5757m, this.f5758n, this.f5759o, this.f5760p, this.f5761q, this.f5762r, this.f5763s, this.f5764t, c0626q, 70);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
