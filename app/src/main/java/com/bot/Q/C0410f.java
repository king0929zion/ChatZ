package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import R.AbstractC0507l;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import b0.C0873f;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;

/* renamed from: Q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410f implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.e f5797c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.e f5798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5801h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0873f f5802i;

    public C0410f(l4.e eVar, l4.e eVar2, long j3, long j4, long j5, long j6, C0873f c0873f) {
        this.f5797c = eVar;
        this.f5798e = eVar2;
        this.f5799f = j4;
        this.f5800g = j5;
        this.f5801h = j6;
        this.f5802i = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            InterfaceC1041r x5 = AbstractC1787b.x(C1038o.a, AbstractC0426j.f5895e);
            C1813t a = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
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
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, a, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            C0146e c0146e3 = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e3);
            }
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e4);
            c0626q.b0(346092326);
            c0626q.p(false);
            l4.e eVar = this.f5797c;
            if (eVar == null) {
                c0626q.b0(346396529);
            } else {
                c0626q.b0(346396530);
                AbstractC0507l.d(this.f5799f, u3.a(S.g.f7327f, c0626q), AbstractC0874g.c(71284337, new C0406e(0, eVar), c0626q), c0626q, 384);
            }
            c0626q.p(false);
            l4.e eVar2 = this.f5798e;
            if (eVar2 == null) {
                c0626q.b0(347174009);
            } else {
                c0626q.b0(347174010);
                AbstractC0507l.d(this.f5800g, u3.a(S.g.f7329h, c0626q), AbstractC0874g.c(705583346, new C0406e(1, eVar2), c0626q), c0626q, 384);
            }
            c0626q.p(false);
            v.J j3 = new v.J(C1026c.f11800r);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, j3);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode2))) {
                B3.e.v(hashCode2, c0626q, hashCode2, c0146e3);
            }
            T.r.G(c0626q, c7, c0146e4);
            AbstractC0507l.d(this.f5801h, u3.a(S.g.f7323b, c0626q), this.f5802i, c0626q, 0);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
