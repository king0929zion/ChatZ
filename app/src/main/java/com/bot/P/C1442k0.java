package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: p.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442k0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13738h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1444l0 f13739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442k0(C1444l0 c1444l0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13739i = c1444l0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1442k0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1442k0(this.f13739i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13738h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f13738h = 1;
            Object N02 = C1444l0.N0(this.f13739i, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (N02 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
