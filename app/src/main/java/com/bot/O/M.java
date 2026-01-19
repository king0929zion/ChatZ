package O;

import T.C0626q;
import b0.C0873f;
import h0.InterfaceC1041r;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3981c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f3982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f3983f;

    public /* synthetic */ M(InterfaceC1041r interfaceC1041r, C0873f c0873f, int i6, int i7) {
        this.f3981c = i7;
        this.f3982e = interfaceC1041r;
        this.f3983f = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f3981c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                AbstractC0336u0.c(this.f3982e, this.f3983f, c0626q, T.r.J(49));
                break;
            default:
                AbstractC0336u0.f(this.f3982e, this.f3983f, c0626q, T.r.J(49));
                break;
        }
        return X3.y.a;
    }
}
