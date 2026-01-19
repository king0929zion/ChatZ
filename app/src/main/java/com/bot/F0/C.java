package F0;

import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0626q;
import T.H0;
import e1.C0959a;
import h0.AbstractC1024a;
import h0.InterfaceC1041r;
import m.C1198E;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class C extends AbstractC1277l implements l4.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Object obj, int i6) {
        super(3);
        this.f1392e = i6;
        this.f1393f = obj;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1392e) {
            case 0:
                C0626q c0626q = ((H0) obj).a;
                C0626q c0626q2 = (C0626q) obj2;
                ((Number) obj3).intValue();
                int hashCode = Long.hashCode(c0626q2.f8164T);
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, (InterfaceC1041r) this.f1393f);
                c0626q.c0(509942095);
                InterfaceC0152h.a.getClass();
                T.r.G(c0626q, c6, C0150g.f1926d);
                T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                c0626q.p(false);
                return X3.y.a;
            default:
                k0 w5 = ((U) obj2).w(((C0959a) obj3).a);
                return ((X) obj).D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new B0.F(14, w5, (C1198E) this.f1393f));
        }
    }
}
