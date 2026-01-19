package Q;

import A4.C0005f;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class j3 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k3 f5911i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(k3 k3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5911i = k3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((j3) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new j3(this.f5911i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5910h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return X3.y.a;
        }
        X3.a.e(obj);
        Object obj2 = new Object();
        k3 k3Var = this.f5911i;
        A4.V v5 = k3Var.f5945r.a;
        C0005f c0005f = new C0005f(6, obj2, k3Var);
        this.f5910h = 1;
        v5.getClass();
        A4.V.l(v5, c0005f, this);
        return EnumC0927a.f11114c;
    }
}
