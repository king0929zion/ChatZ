package N1;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class I extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3664h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f3666j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3666j = q3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((I) p((InterfaceC0905c) obj2, (P1.o) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        I i6 = new I(this.f3666j, interfaceC0905c);
        i6.f3665i = obj;
        return i6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3664h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        P1.o oVar = (P1.o) this.f3665i;
        this.f3664h = 1;
        Object a = Q.a(this.f3666j, oVar, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return a == enumC0927a ? enumC0927a : a;
    }
}
