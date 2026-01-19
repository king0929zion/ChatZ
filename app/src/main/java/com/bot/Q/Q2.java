package Q;

import T.C0626q;
import b0.C0873f;

/* loaded from: classes.dex */
public final class Q2 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.e f5493c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0873f f5494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.e f5495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S0.P f5496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5497h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5498i;

    public Q2(l4.e eVar, C0873f c0873f, l4.e eVar2, S0.P p5, long j3, long j4) {
        this.f5493c = eVar;
        this.f5494e = c0873f;
        this.f5495f = eVar2;
        this.f5496g = p5;
        this.f5497h = j3;
        this.f5498i = j4;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            c0626q.b0(-168976609);
            S2.a(this.f5494e, this.f5493c, this.f5495f, this.f5496g, this.f5497h, this.f5498i, c0626q, 0);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
