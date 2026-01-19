package S2;

import T.C0626q;

/* renamed from: S2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0586s implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7874c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0.P f7876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7877g;

    public /* synthetic */ C0586s(String str, S0.P p5, boolean z5, int i6, int i7) {
        this.f7874c = i7;
        this.f7875e = str;
        this.f7876f = p5;
        this.f7877g = z5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f7874c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                AbstractC0565e.m(this.f7875e, this.f7876f, this.f7877g, c0626q, T.r.J(1));
                break;
            case 1:
                AbstractC0565e.o(this.f7875e, this.f7876f, this.f7877g, c0626q, T.r.J(1));
                break;
            default:
                AbstractC0565e.a(this.f7875e, this.f7876f, this.f7877g, c0626q, T.r.J(1));
                break;
        }
        return X3.y.a;
    }
}
