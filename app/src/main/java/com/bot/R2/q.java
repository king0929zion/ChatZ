package R2;

import Q.N;
import Q.O;
import Q.f3;
import Q.t3;
import Q.u3;
import S0.P;
import T.C0626q;
import h0.C1038o;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import x.C1851b;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7019c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7020e;

    public /* synthetic */ q(String str, int i6) {
        this.f7019c = i6;
        this.f7020e = str;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f7019c) {
            case 0:
                C0626q c0626q = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q.S(intValue & 1, (intValue & 17) != 16)) {
                    f3.b(this.f7020e, AbstractC1787b.z(C1038o.a, 16, 8), o0.s.c(0.7f, ((N) c0626q.j(O.a)).f5429s), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q.j(u3.a)).f6128i, c0626q, 48, 0, 131064);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                C0626q c0626q2 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    f3.b(this.f7020e, AbstractC1787b.C(C1038o.a, S.l.f7374V, S.l.f7374V, S.l.f7374V, 12, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new P(((N) c0626q2.j(O.a)).f5427q, s4.j.z(16), W0.k.f8836j, null, 0L, 0, 0L, 16777208), c0626q2, 48, 0, 131068);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q3 = (C0626q) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q3.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    f3.b(this.f7020e, AbstractC1787b.C(C1038o.a, S.l.f7374V, S.l.f7374V, S.l.f7374V, 12, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new P(((N) c0626q3.j(O.a)).f5427q, s4.j.z(16), W0.k.f8836j, null, 0L, 0, 0L, 16777208), c0626q3, 48, 0, 131068);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
        }
    }
}
