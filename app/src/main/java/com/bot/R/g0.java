package R;

import T.C0626q;

/* loaded from: classes.dex */
public final class g0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6776c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f6777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.e f6778f;

    public /* synthetic */ g0(long j3, l4.e eVar, int i6) {
        this.f6776c = i6;
        this.f6777e = j3;
        this.f6778f = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6776c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    l0.c(this.f6777e, this.f6778f, c0626q, 0);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    l0.c(this.f6777e, this.f6778f, c0626q2, 0);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
