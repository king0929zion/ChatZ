package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: X2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708x extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9378h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9379i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708x(L l3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9379i = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0708x) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0708x(this.f9379i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9378h;
        if (i6 == 0) {
            X3.a.e(obj);
            L l3 = this.f9379i;
            g0 g0Var = l3.f9197D;
            C0707w c0707w = new C0707w(l3, null);
            this.f9378h = 1;
            Object f6 = A4.W.f(g0Var, c0707w, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (f6 == enumC0927a) {
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
