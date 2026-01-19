package Z2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: Z2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749e0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10189h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.X f10190i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f10191j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749e0(float f6, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10189h = f6;
        this.f10190i = x5;
        this.f10191j = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0749e0 c0749e0 = (C0749e0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0749e0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0749e0(this.f10189h, this.f10190i, this.f10191j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        if (!((Boolean) this.f10190i.getValue()).booleanValue()) {
            this.f10191j.setValue(Float.valueOf(this.f10189h));
        }
        return X3.y.a;
    }
}
