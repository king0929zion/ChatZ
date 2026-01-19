package S2;

import T.C0626q;
import java.util.List;

/* renamed from: S2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0564d0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7744c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f7745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0.P f7746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7747g;

    public /* synthetic */ C0564d0(List list, S0.P p5, boolean z5, int i6, int i7) {
        this.f7744c = i7;
        this.f7745e = list;
        this.f7746f = p5;
        this.f7747g = z5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f7744c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                AbstractC0565e.s(this.f7745e, this.f7746f, this.f7747g, c0626q, T.r.J(1));
                break;
            default:
                AbstractC0565e.w(this.f7745e, this.f7746f, this.f7747g, c0626q, T.r.J(1));
                break;
        }
        return X3.y.a;
    }
}
