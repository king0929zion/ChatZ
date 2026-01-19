package P2;

import b4.InterfaceC0905c;
import n.C1316c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4775h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f4776i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1316c f4777j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1316c f4778k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(boolean z5, C1316c c1316c, C1316c c1316c2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4776i = z5;
        this.f4777j = c1316c;
        this.f4778k = c1316c2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        Q q3 = (Q) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        q3.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        Q q3 = new Q(this.f4776i, this.f4777j, this.f4778k, interfaceC0905c);
        q3.f4775h = obj;
        return q3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f4775h;
        X3.a.e(obj);
        boolean z5 = this.f4776i;
        C1316c c1316c = this.f4778k;
        C1316c c1316c2 = this.f4777j;
        if (z5) {
            AbstractC1888A.y(interfaceC1942y, null, new M(c1316c2, null), 3);
            AbstractC1888A.y(interfaceC1942y, null, new N(c1316c, null), 3);
        } else {
            AbstractC1888A.y(interfaceC1942y, null, new O(c1316c2, null), 3);
            AbstractC1888A.y(interfaceC1942y, null, new P(c1316c, null), 3);
        }
        return X3.y.a;
    }
}
