package P2;

import T.C0626q;
import java.util.List;
import x.C1851b;

/* loaded from: classes.dex */
public final class C0 implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4673c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f4674e;

    public /* synthetic */ C0(List list, int i6) {
        this.f4673c = i6;
        this.f4674e = list;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        int i7;
        switch (this.f4673c) {
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
                    L2.c cVar = (L2.c) this.f4674e.get(intValue);
                    c0626q.b0(-144853070);
                    L0.c(cVar, c0626q, 0);
                    c0626q.p(false);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C1851b c1851b2 = (C1851b) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0626q c0626q2 = (C0626q) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i7 = (c0626q2.f(c1851b2) ? 4 : 2) | intValue4;
                } else {
                    i7 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i7 |= c0626q2.d(intValue3) ? 32 : 16;
                }
                if (c0626q2.S(i7 & 1, (i7 & 147) != 146)) {
                    L2.h hVar = (L2.h) this.f4674e.get(intValue3);
                    c0626q2.b0(1141587255);
                    U2.a.f(hVar, c0626q2, 8);
                    c0626q2.p(false);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
