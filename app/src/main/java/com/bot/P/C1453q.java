package p;

import b4.InterfaceC0905c;
import t.C1679g;
import t.C1680h;
import t.C1682j;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: p.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1453q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f13764h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1453q(r rVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13764h = rVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C1453q c1453q = (C1453q) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c1453q.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1453q(this.f13764h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        r rVar = this.f13764h;
        C1679g c1679g = rVar.f13772F;
        if (c1679g != null) {
            C1680h c1680h = new C1680h(c1679g);
            C1682j c1682j = rVar.f13781t;
            if (c1682j != null) {
                AbstractC1888A.y(rVar.A0(), null, new C1427d(c1682j, c1680h, null), 3);
            }
            rVar.f13772F = null;
        }
        return X3.y.a;
    }
}
