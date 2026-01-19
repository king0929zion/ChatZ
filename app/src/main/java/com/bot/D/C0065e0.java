package D;

import b4.InterfaceC0905c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: D.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065e0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.D f1006i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H0 f1007j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O.N0 f1008k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065e0(B0.D d6, H0 h02, O.N0 n02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f1006i = d6;
        this.f1007j = h02;
        this.f1008k = n02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0065e0 c0065e0 = (C0065e0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0065e0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0065e0 c0065e0 = new C0065e0(this.f1006i, this.f1007j, this.f1008k, interfaceC0905c);
        c0065e0.f1005h = obj;
        return c0065e0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f1005h;
        H0 h02 = this.f1007j;
        B0.D d6 = this.f1006i;
        AbstractC1888A.y(interfaceC1942y, null, new C0061c0(d6, h02, null), 1);
        AbstractC1888A.y(interfaceC1942y, null, new C0063d0(d6, this.f1008k, null), 1);
        return X3.y.a;
    }
}
