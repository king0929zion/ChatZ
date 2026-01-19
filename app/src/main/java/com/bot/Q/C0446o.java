package Q;

import T.C0626q;
import h0.C1038o;
import v.AbstractC1806l;

/* renamed from: Q.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446o implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f6019c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f6020e;

    public C0446o(float f6, float f7) {
        this.f6019c = f6;
        this.f6020e = f7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            AbstractC1806l.a(v.t0.k(C1038o.a, this.f6019c, this.f6020e), c0626q, 0);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
