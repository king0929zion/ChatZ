package P2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class K extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4751h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.X f4752i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(T.X x5, InterfaceC0905c interfaceC0905c, String str) {
        super(2, interfaceC0905c);
        this.f4751h = str;
        this.f4752i = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        K k3 = (K) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        k3.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new K(this.f4752i, interfaceC0905c, this.f4751h);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        T.X x5 = this.f4752i;
        String str = ((X0.v) x5.getValue()).a.f7630e;
        String str2 = this.f4751h;
        if (!str2.equals(str)) {
            int length = str2.length();
            x5.setValue(new X0.v(S0.F.b(length, length), str2, 4));
        }
        return X3.y.a;
    }
}
