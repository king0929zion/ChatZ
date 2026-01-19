package D;

import A4.C0005f;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class g1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f1027h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0100w0 f1028i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(C0100w0 c0100w0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f1028i = c0100w0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((g1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new g1(this.f1028i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f1027h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return X3.y.a;
        }
        X3.a.e(obj);
        this.f1027h = 1;
        C0100w0 c0100w0 = this.f1028i;
        c0100w0.getClass();
        k.I i7 = new k.I();
        A4.V v5 = c0100w0.a.a;
        C0005f c0005f = new C0005f(2, i7, c0100w0);
        v5.getClass();
        A4.V.l(v5, c0005f, this);
        return EnumC0927a.f11114c;
    }
}
