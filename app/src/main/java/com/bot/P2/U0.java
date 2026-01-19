package P2;

import b3.AbstractC0888d;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class U0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4798h = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((U0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new U0(this.f4798h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return AbstractC0888d.i(this.f4798h);
    }
}
