package Q;

import T.C0607g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.C1604s0;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A2 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2 f5133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1604s0 f5134j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(C2 c22, C1604s0 c1604s0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5133i = c22;
        this.f5134j = c1604s0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((A2) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new A2(this.f5133i, this.f5134j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C2 c22 = this.f5133i;
        C0607g0 c0607g0 = c22.f5192q;
        int i6 = this.f5132h;
        if (i6 == 0) {
            X3.a.e(obj);
            c0607g0.setValue(Boolean.TRUE);
            p.C0 c02 = c22.f5197v;
            B2 b22 = c22.f5196u;
            this.f5132h = 1;
            c02.getClass();
            Object l3 = AbstractC1888A.l(new p.B0(p.x0.f13824e, c02, this.f5134j, b22, null), this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (l3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        c0607g0.setValue(Boolean.FALSE);
        return X3.y.a;
    }
}
