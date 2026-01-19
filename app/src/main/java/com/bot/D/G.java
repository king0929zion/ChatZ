package D;

import T.C0626q;
import b0.C0873f;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f764c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O.N0 f765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f767g;

    public /* synthetic */ G(O.N0 n02, C0873f c0873f, int i6, int i7) {
        this.f764c = i7;
        this.f765e = n02;
        this.f766f = c0873f;
        this.f767g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f764c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                AbstractC0090r0.d(this.f765e, this.f766f, c0626q, T.r.J(this.f767g | 1));
                break;
            default:
                AbstractC0090r0.f(this.f765e, this.f766f, c0626q, T.r.J(this.f767g | 1));
                break;
        }
        return X3.y.a;
    }
}
