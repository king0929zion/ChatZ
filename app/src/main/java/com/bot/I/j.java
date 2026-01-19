package I;

import T.C0626q;
import X3.y;
import b0.C0873f;
import h0.InterfaceC1041r;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2095c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f2096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f2097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2098g;

    public /* synthetic */ j(InterfaceC1041r interfaceC1041r, C0873f c0873f, int i6, int i7) {
        this.f2095c = i7;
        this.f2096e = interfaceC1041r;
        this.f2097f = c0873f;
        this.f2098g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f2095c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                k.c(this.f2096e, this.f2097f, c0626q, T.r.J(this.f2098g | 1));
                break;
            case 1:
                k.d(this.f2096e, this.f2097f, c0626q, T.r.J(this.f2098g | 1));
                break;
            case 2:
                p.d(this.f2096e, this.f2097f, c0626q, T.r.J(this.f2098g | 1));
                break;
            case 3:
                k.b(this.f2096e, this.f2097f, c0626q, T.r.J(this.f2098g | 1));
                break;
            default:
                k.a(this.f2096e, this.f2097f, c0626q, T.r.J(this.f2098g | 1));
                break;
        }
        return y.a;
    }
}
