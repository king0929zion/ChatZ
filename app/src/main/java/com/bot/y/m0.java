package y;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class m0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15893h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0 f15894i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f15895j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15894i = n0Var;
        this.f15895j = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((m0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new m0(this.f15894i, this.f15895j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f15893h;
        if (i6 == 0) {
            X3.a.e(obj);
            i0 i0Var = this.f15894i.f15899s;
            this.f15893h = 1;
            Object f6 = i0Var.f(this.f15895j, this);
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
