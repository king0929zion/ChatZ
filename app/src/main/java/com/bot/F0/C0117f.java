package F0;

import T.C0626q;
import m4.AbstractC1277l;

/* renamed from: F0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117f extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public static final C0117f f1473e = new AbstractC1277l(2);

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (!c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            c0626q.V();
        }
        return X3.y.a;
    }
}
