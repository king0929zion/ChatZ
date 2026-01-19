package U2;

import T.C0616l;
import T.C0626q;
import X3.y;
import Z2.AbstractC0783w;
import Z2.C;
import Z2.P;
import a3.C0810H;
import f0.C0996s;
import java.util.List;
import l4.InterfaceC1193a;
import x.C1851b;

/* loaded from: classes.dex */
public final class n implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8655c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8657f;

    public /* synthetic */ n(List list, int i6, Object obj) {
        this.f8655c = i6;
        this.f8656e = list;
        this.f8657f = obj;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        int i7;
        int i8;
        switch (this.f8655c) {
            case 0:
                C1851b c1851b = (C1851b) obj;
                int intValue = ((Number) obj2).intValue();
                C0626q c0626q = (C0626q) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i6 = (c0626q.f(c1851b) ? 4 : 2) | intValue2;
                } else {
                    i6 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i6 |= c0626q.d(intValue) ? 32 : 16;
                }
                if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
                    L2.h hVar = (L2.h) this.f8656e.get(intValue);
                    c0626q.b0(1844295633);
                    a.g(hVar, intValue == 0, intValue == Y4.l.C((List) this.f8657f), c0626q, 8);
                    c0626q.p(false);
                } else {
                    c0626q.V();
                }
                return y.a;
            case 1:
                Object obj5 = (C1851b) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0626q c0626q2 = (C0626q) obj3;
                int intValue4 = ((Number) obj4).intValue();
                C0996s c0996s = (C0996s) this.f8657f;
                if ((intValue4 & 6) == 0) {
                    i7 = (c0626q2.f(obj5) ? 4 : 2) | intValue4;
                } else {
                    i7 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i7 |= c0626q2.d(intValue3) ? 32 : 16;
                }
                if (c0626q2.S(i7 & 1, (i7 & 147) != 146)) {
                    C c6 = (C) this.f8656e.get(intValue3);
                    c0626q2.b0(-946653070);
                    boolean f6 = c0626q2.f(c0996s) | c0626q2.f(c6);
                    Object P5 = c0626q2.P();
                    Object obj6 = C0616l.a;
                    if (f6 || P5 == obj6) {
                        P5 = new P(c0996s, c6, 0);
                        c0626q2.m0(P5);
                    }
                    l4.c cVar = (l4.c) P5;
                    boolean f7 = c0626q2.f(c0996s) | c0626q2.f(c6);
                    Object P6 = c0626q2.P();
                    if (f7 || P6 == obj6) {
                        P6 = new P(c0996s, c6, 1);
                        c0626q2.m0(P6);
                    }
                    l4.c cVar2 = (l4.c) P6;
                    boolean f8 = c0626q2.f(c0996s) | c0626q2.f(c6);
                    Object P7 = c0626q2.P();
                    if (f8 || P7 == obj6) {
                        P7 = new X4.k(1, c0996s, c6);
                        c0626q2.m0(P7);
                    }
                    AbstractC0783w.j(c6, cVar, cVar2, (InterfaceC1193a) P7, c0626q2, 0);
                    c0626q2.p(false);
                } else {
                    c0626q2.V();
                }
                return y.a;
            default:
                Object obj7 = (C1851b) obj;
                int intValue5 = ((Number) obj2).intValue();
                C0626q c0626q3 = (C0626q) obj3;
                int intValue6 = ((Number) obj4).intValue();
                Object obj8 = (l4.c) this.f8657f;
                if ((intValue6 & 6) == 0) {
                    i8 = (c0626q3.f(obj7) ? 4 : 2) | intValue6;
                } else {
                    i8 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i8 |= c0626q3.d(intValue5) ? 32 : 16;
                }
                if (c0626q3.S(i8 & 1, (i8 & 147) != 146)) {
                    C0810H c0810h = (C0810H) this.f8656e.get(intValue5);
                    c0626q3.b0(-1285033029);
                    boolean f9 = c0626q3.f(obj8) | c0626q3.h(c0810h);
                    Object P8 = c0626q3.P();
                    if (f9 || P8 == C0616l.a) {
                        P8 = new X4.k(2, obj8, c0810h);
                        c0626q3.m0(P8);
                    }
                    AbstractC0783w.I(c0810h, (InterfaceC1193a) P8, null, c0626q3, C0810H.f10622i, 4);
                    c0626q3.p(false);
                } else {
                    c0626q3.V();
                }
                return y.a;
        }
    }
}
