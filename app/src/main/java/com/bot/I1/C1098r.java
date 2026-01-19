package i1;

import T.C0626q;
import m4.AbstractC1277l;

/* renamed from: i1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098r extends AbstractC1277l implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C1098r f12007f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1098r f12008g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12009e;

    static {
        int i6 = 2;
        f12007f = new C1098r(i6, 0);
        f12008g = new C1098r(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1098r(int i6, int i7) {
        super(i6);
        this.f12009e = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f12009e) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (!c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
