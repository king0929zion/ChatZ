package r;

import b4.InterfaceC0905c;

/* renamed from: r.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1605s1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f14467i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605s1(long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14467i = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C1605s1 c1605s1 = (C1605s1) p((InterfaceC0905c) obj2, (B1) obj);
        X3.y yVar = X3.y.a;
        c1605s1.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1605s1 c1605s1 = new C1605s1(this.f14467i, interfaceC0905c);
        c1605s1.f14466h = obj;
        return c1605s1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        E1 e12 = ((B1) this.f14466h).a;
        e12.c(e12.f14022k, this.f14467i, 1);
        return X3.y.a;
    }
}
