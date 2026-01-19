package Q;

import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;

/* loaded from: classes.dex */
public final class J0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f5307c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f5309f;

    public J0(G0 g02, boolean z5, C0873f c0873f) {
        this.f5307c = g02;
        this.f5308e = z5;
        this.f5309f = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            c0626q.b0(-864293207);
            c0626q.p(false);
            T.B b5 = U.a;
            boolean z5 = this.f5308e;
            G0 g02 = this.f5307c;
            T.r.a(b5.a(new o0.s(z5 ? g02.a : g02.f5255d)), AbstractC0874g.c(-893579015, new E(this.f5309f, 2), c0626q), c0626q, 56);
            c0626q.b0(-863072055);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
