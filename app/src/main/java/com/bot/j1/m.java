package J1;

import D.C0103y;
import F0.AbstractC0137z;
import F0.V;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.AbstractC0461s;
import Q.I2;
import Q.f3;
import Q.t3;
import R.i0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import b0.C0873f;
import e0.InterfaceC0958c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1032i;
import h0.C1038o;
import h0.InterfaceC1041r;
import m.C1230l;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.C1791d;
import v.InterfaceC1802i0;
import v.o0;
import v.p0;
import v.r0;
import v.t0;

/* loaded from: classes.dex */
public final class m implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2843c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2845f;

    public /* synthetic */ m(int i6, Object obj, Object obj2) {
        this.f2843c = i6;
        this.f2844e = obj;
        this.f2845f = obj2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f2843c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0626q.E()) {
                    c0626q.V();
                } else {
                    ((q) this.f2844e).f2858j.d((I1.j) this.f2845f, c0626q, 0);
                }
                return X3.y.a;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0626q2.E()) {
                    c0626q2.V();
                } else {
                    Y3.C.e((InterfaceC0958c) this.f2844e, (C0873f) this.f2845f, c0626q2, 0);
                }
                return X3.y.a;
            case 2:
                C0626q c0626q3 = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                I1.j jVar = (I1.j) this.f2845f;
                if ((intValue & 3) == 2 && c0626q3.E()) {
                    c0626q3.V();
                } else {
                    I1.v vVar = jVar.f2544e;
                    AbstractC1276k.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((h) vVar).f2832i.i((C1230l) this.f2844e, jVar, c0626q3, 0);
                }
                return X3.y.a;
            case 3:
                C0626q c0626q4 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    InterfaceC1041r x5 = AbstractC1787b.x(t0.a(C1038o.a, AbstractC0461s.f6091c, AbstractC0461s.f6092d), (InterfaceC1802i0) this.f2844e);
                    C1791d c1791d = AbstractC1799h.f15306d;
                    C1032i c1032i = C1026c.f11796n;
                    l4.f fVar = (l4.f) this.f2845f;
                    p0 a = o0.a(c1791d, c1032i, c0626q4, 54);
                    int hashCode = Long.hashCode(c0626q4.f8164T);
                    InterfaceC0617l0 l3 = c0626q4.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q4, x5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q4.f0();
                    if (c0626q4.f8163S) {
                        c0626q4.k(c0148f);
                    } else {
                        c0626q4.p0();
                    }
                    T.r.G(c0626q4, a, C0150g.f1928f);
                    T.r.G(c0626q4, l3, C0150g.f1927e);
                    C0146e c0146e = C0150g.f1929g;
                    if (c0626q4.f8163S || !AbstractC1276k.b(c0626q4.P(), Integer.valueOf(hashCode))) {
                        B3.e.v(hashCode, c0626q4, hashCode, c0146e);
                    }
                    T.r.G(c0626q4, c6, C0150g.f1926d);
                    fVar.d(r0.a, c0626q4, 6);
                    c0626q4.p(true);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            case 4:
                C0626q c0626q5 = (C0626q) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c0626q5.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f3.a(((t3) this.f2844e).f6129j, (C0873f) this.f2845f, c0626q5, 0);
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                C0626q c0626q6 = (C0626q) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (c0626q6.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C0873f c0873f = (C0873f) this.f2844e;
                    I2 i22 = (I2) this.f2845f;
                    AbstractC1276k.c(i22);
                    c0873f.d(i22, c0626q6, 0);
                } else {
                    c0626q6.V();
                }
                return X3.y.a;
            case 6:
                C0626q c0626q7 = (C0626q) obj;
                int intValue5 = ((Number) obj2).intValue();
                if (c0626q7.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    X x6 = (X) this.f2844e;
                    Object P5 = c0626q7.P();
                    if (P5 == C0616l.a) {
                        P5 = new C0103y(x6, 8);
                        c0626q7.m0(P5);
                    }
                    InterfaceC1041r m3 = AbstractC0137z.m(C1038o.a, (l4.c) P5);
                    C0873f c0873f2 = (C0873f) this.f2845f;
                    V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode2 = Long.hashCode(c0626q7.f8164T);
                    InterfaceC0617l0 l5 = c0626q7.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q7, m3);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q7.f0();
                    if (c0626q7.f8163S) {
                        c0626q7.k(c0148f2);
                    } else {
                        c0626q7.p0();
                    }
                    T.r.G(c0626q7, d6, C0150g.f1928f);
                    T.r.G(c0626q7, l5, C0150g.f1927e);
                    C0146e c0146e2 = C0150g.f1929g;
                    if (c0626q7.f8163S || !AbstractC1276k.b(c0626q7.P(), Integer.valueOf(hashCode2))) {
                        B3.e.v(hashCode2, c0626q7, hashCode2, c0146e2);
                    }
                    T.r.G(c0626q7, c7, C0150g.f1926d);
                    c0873f2.m(c0626q7, 0);
                    c0626q7.p(true);
                } else {
                    c0626q7.V();
                }
                return X3.y.a;
            case 7:
                C0626q c0626q8 = (C0626q) obj;
                int intValue6 = ((Number) obj2).intValue();
                String str = (String) this.f2844e;
                if (c0626q8.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean f6 = c0626q8.f(str);
                    Object P6 = c0626q8.P();
                    if (f6 || P6 == C0616l.a) {
                        P6 = new M2.b(str, 5);
                        c0626q8.m0(P6);
                    }
                    InterfaceC1041r a6 = P0.n.a(C1038o.a, false, (l4.c) P6);
                    C0873f c0873f3 = (C0873f) this.f2845f;
                    V d7 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode3 = Long.hashCode(c0626q8.f8164T);
                    InterfaceC0617l0 l6 = c0626q8.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q8, a6);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f3 = C0150g.f1924b;
                    c0626q8.f0();
                    if (c0626q8.f8163S) {
                        c0626q8.k(c0148f3);
                    } else {
                        c0626q8.p0();
                    }
                    T.r.G(c0626q8, d7, C0150g.f1928f);
                    T.r.G(c0626q8, l6, C0150g.f1927e);
                    C0146e c0146e3 = C0150g.f1929g;
                    if (c0626q8.f8163S || !AbstractC1276k.b(c0626q8.P(), Integer.valueOf(hashCode3))) {
                        B3.e.v(hashCode3, c0626q8, hashCode3, c0146e3);
                    }
                    T.r.G(c0626q8, c8, C0150g.f1926d);
                    c0873f3.m(c0626q8, 0);
                    c0626q8.p(true);
                } else {
                    c0626q8.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q9 = (C0626q) obj;
                int intValue7 = ((Number) obj2).intValue();
                if (c0626q9.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ((l4.f) this.f2844e).d((i0) this.f2845f, c0626q9, 6);
                } else {
                    c0626q9.V();
                }
                return X3.y.a;
        }
    }

    public m(I1.j jVar, C1230l c1230l) {
        this.f2843c = 2;
        this.f2845f = jVar;
        this.f2844e = c1230l;
    }
}
