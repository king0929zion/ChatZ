package I0;

import A4.C0016q;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class h1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2301h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A4.e0 f2302i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J0 f2303j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(A4.e0 e0Var, J0 j02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2302i = e0Var;
        this.f2303j = j02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((h1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new h1(this.f2302i, this.f2303j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f2301h;
        if (i6 == 0) {
            X3.a.e(obj);
            C0016q c0016q = new C0016q(this.f2303j, 2);
            this.f2301h = 1;
            Object b5 = this.f2302i.b(c0016q, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        throw new RuntimeException();
    }
}
