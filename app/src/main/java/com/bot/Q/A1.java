package Q;

import T.C0626q;
import t.C1682j;

/* loaded from: classes.dex */
public final class A1 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5127c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1682j f5129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b3 f5130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0.L f5131h;

    public A1(boolean z5, boolean z6, C1682j c1682j, b3 b3Var, o0.L l3) {
        this.f5127c = z5;
        this.f5128e = z6;
        this.f5129f = c1682j;
        this.f5130g = b3Var;
        this.f5131h = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            C0483x1.a.a(this.f5127c, this.f5128e, this.f5129f, null, this.f5130g, this.f5131h, S.l.f7374V, S.l.f7374V, c0626q, 100663296, 200);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
