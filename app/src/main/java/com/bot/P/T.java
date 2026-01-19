package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class T extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13650h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U f13651i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13651i = u5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((T) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new T(this.f13651i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13650h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return X3.y.a;
        }
        X3.a.e(obj);
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        U u5 = this.f13651i;
        A4.V v5 = u5.f13652r.a;
        B4.m mVar = new B4.m(obj2, obj3, obj4, u5, 5);
        this.f13650h = 1;
        v5.getClass();
        A4.V.l(v5, mVar, this);
        return EnumC0927a.f11114c;
    }
}
