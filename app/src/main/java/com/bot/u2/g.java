package U2;

import T.C0626q;
import X3.y;
import java.util.List;
import x.C1851b;

/* loaded from: classes.dex */
public final class g implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f8632c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f8634f;

    public g(List list, List list2, boolean z5) {
        this.f8632c = list;
        this.f8633e = list2;
        this.f8634f = z5;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
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
            String str = (String) this.f8632c.get(intValue);
            c0626q.b0(1924545528);
            boolean z5 = intValue == 0;
            List list = this.f8633e;
            a.c(str, z5, intValue == Y4.l.C(list), this.f8634f && intValue == Y4.l.C(list), c0626q, 0);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return y.a;
    }
}
