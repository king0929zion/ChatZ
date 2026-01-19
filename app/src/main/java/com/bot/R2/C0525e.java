package R2;

import T.C0626q;
import Z2.AbstractC0783w;
import l4.InterfaceC1193a;

/* renamed from: R2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0525e implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6929c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6932g;

    public /* synthetic */ C0525e(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, boolean z5, int i6, int i7) {
        this.f6929c = i7;
        this.f6930e = interfaceC1193a;
        this.f6931f = interfaceC1193a2;
        this.f6932g = z5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f6929c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                AbstractC0530j.c(this.f6930e, this.f6931f, this.f6932g, c0626q, T.r.J(49));
                break;
            default:
                AbstractC0783w.g(this.f6930e, this.f6931f, this.f6932g, c0626q, T.r.J(49));
                break;
        }
        return X3.y.a;
    }
}
