package R2;

import b4.InterfaceC0905c;
import r.C1606t;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class L extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1606t f6911h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6912i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.c f6913j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C1606t c1606t, boolean z5, l4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6911h = c1606t;
        this.f6912i = z5;
        this.f6913j = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        L l3 = (L) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        l3.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new L(this.f6911h, this.f6912i, this.f6913j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        boolean z5 = this.f6911h.f14471e.getValue() == H.f6897e;
        if (z5 != this.f6912i) {
            this.f6913j.f(Boolean.valueOf(z5));
        }
        return X3.y.a;
    }
}
