package p;

import b4.InterfaceC0905c;
import t.C1682j;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: p.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451p extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f13762h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451p(r rVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13762h = rVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C1451p c1451p = (C1451p) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c1451p.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1451p(this.f13762h, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t.g] */
    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        r rVar = this.f13762h;
        if (rVar.f13772F == null) {
            ?? obj2 = new Object();
            C1682j c1682j = rVar.f13781t;
            if (c1682j != null) {
                AbstractC1888A.y(rVar.A0(), null, new C1425c(c1682j, obj2, null), 3);
            }
            rVar.f13772F = obj2;
        }
        return X3.y.a;
    }
}
