package R;

import T.C0626q;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6741c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f6742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0.P f6743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.e f6744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6745h;

    public /* synthetic */ c0(long j3, S0.P p5, l4.e eVar, int i6, int i7) {
        this.f6741c = i7;
        this.f6742e = j3;
        this.f6743f = p5;
        this.f6744g = eVar;
        this.f6745h = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6741c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0507l.d(this.f6742e, this.f6743f, this.f6744g, (C0626q) obj, T.r.J(this.f6745h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                l0.b(this.f6742e, this.f6743f, this.f6744g, (C0626q) obj, T.r.J(this.f6745h | 1));
                break;
        }
        return X3.y.a;
    }
}
