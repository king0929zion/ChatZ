package F0;

import T.AbstractC0633u;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class u0 extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0 f1534f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i6) {
        super(2);
        this.f1533e = i6;
        this.f1534f = v0Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f1533e) {
            case 0:
                this.f1534f.a().f1443e = (AbstractC0633u) obj2;
                return X3.y.a;
            case 1:
                Q a = this.f1534f.a();
                ((H0.J) obj).e0(new L(a, (l4.e) obj2, a.f1457s));
                return X3.y.a;
            default:
                H0.J j3 = (H0.J) obj;
                v0 v0Var = this.f1534f;
                y0 y0Var = v0Var.a;
                Q q3 = j3.f1723L;
                if (q3 == null) {
                    q3 = new Q(j3, y0Var);
                    j3.f1723L = q3;
                }
                v0Var.f1537b = q3;
                v0Var.a().h();
                Q a6 = v0Var.a();
                if (a6.f1444f != y0Var) {
                    a6.f1444f = y0Var;
                    a6.i(false);
                    H0.J.X(a6.f1442c, false, 7);
                }
                return X3.y.a;
        }
    }
}
