package Y2;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: Y2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9717h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0720i f9718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0717f(C0720i c0720i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9718i = c0720i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0717f) p((InterfaceC0905c) obj2, (InterfaceC0008i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0717f(this.f9718i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9717h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f9717h = 1;
            Object g3 = this.f9718i.g(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (g3 == enumC0927a) {
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
