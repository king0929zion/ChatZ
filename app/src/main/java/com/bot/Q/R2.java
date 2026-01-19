package Q;

import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;

/* loaded from: classes.dex */
public final class R2 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.e f5502c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0873f f5503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.e f5504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5506h;

    public R2(l4.e eVar, C0873f c0873f, l4.e eVar2, long j3, long j4) {
        this.f5502c = eVar;
        this.f5503e = c0873f;
        this.f5504f = eVar2;
        this.f5505g = j3;
        this.f5506h = j4;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            T.r.a(f3.a.a(u3.a(S.y.f7503h, c0626q)), AbstractC0874g.c(969655473, new Q2(this.f5502c, this.f5503e, this.f5504f, u3.a(S.y.f7497b, c0626q), this.f5505g, this.f5506h), c0626q), c0626q, 56);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
