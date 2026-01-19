package Z2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: Z2.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757i0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10232h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.X f10233i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f10234j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0757i0(float f6, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10232h = f6;
        this.f10233i = x5;
        this.f10234j = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0757i0 c0757i0 = (C0757i0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0757i0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0757i0(this.f10232h, this.f10233i, this.f10234j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        if (!((Boolean) this.f10233i.getValue()).booleanValue()) {
            this.f10234j.setValue(Float.valueOf(this.f10232h));
        }
        return X3.y.a;
    }
}
