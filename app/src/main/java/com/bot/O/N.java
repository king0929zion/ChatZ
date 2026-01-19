package O;

import D.AbstractC0090r0;
import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3988c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f3989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f3990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0332s0 f3991g;

    public /* synthetic */ N(C0332s0 c0332s0, z0 z0Var, C0873f c0873f) {
        this.f3991g = c0332s0;
        this.f3989e = z0Var;
        this.f3990f = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f3988c;
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i6) {
            case 0:
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    z0 z0Var = this.f3989e;
                    C0873f c0873f = this.f3990f;
                    C0332s0 c0332s0 = this.f3991g;
                    AbstractC0090r0.e(c0332s0, AbstractC0874g.c(-284825865, new N(z0Var, c0873f, c0332s0), c0626q), c0626q, 48);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    T.r.a(A0.a.a(this.f3989e), AbstractC0874g.c(610483127, new D.H(this.f3990f, this.f3991g), c0626q), c0626q, 56);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ N(z0 z0Var, C0873f c0873f, C0332s0 c0332s0) {
        this.f3989e = z0Var;
        this.f3990f = c0873f;
        this.f3991g = c0332s0;
    }
}
