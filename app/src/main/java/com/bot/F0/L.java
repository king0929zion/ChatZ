package F0;

import e1.C0959a;
import java.util.List;

/* loaded from: classes.dex */
public final class L extends H0.G {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f1433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.e f1434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Q q3, l4.e eVar, String str) {
        super(str);
        this.f1433b = q3;
        this.f1434c = eVar;
    }

    @Override // F0.V
    public final W e(X x5, List list, long j3) {
        Q q3 = this.f1433b;
        J j4 = q3.f1449k;
        j4.f1425c = x5.getLayoutDirection();
        j4.f1426e = x5.a();
        j4.f1427f = x5.b0();
        boolean d02 = x5.d0();
        l4.e eVar = this.f1434c;
        if (d02 || q3.f1442c.f1741l == null) {
            q3.f1445g = 0;
            W w5 = (W) eVar.m(j4, new C0959a(j3));
            return new K(w5, q3, q3.f1445g, w5, 1);
        }
        q3.f1446h = 0;
        W w6 = (W) eVar.m(q3.f1450l, new C0959a(j3));
        return new K(w6, q3, q3.f1446h, w6, 0);
    }
}
