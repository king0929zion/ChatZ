package D;

import Z2.C0782v0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1571h0;
import r.AbstractC1573i;
import r.C1556c0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class B0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f734h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.D f735i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H0 f736j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(B0.D d6, H0 h02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f735i = d6;
        this.f736j = h02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((B0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new B0(this.f735i, this.f736j, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, m4.v] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f734h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        this.f734h = 1;
        H0 h02 = this.f736j;
        C0104y0 c0104y0 = new C0104y0(h02, 0);
        C0106z0 c0106z0 = new C0106z0(h02, 0);
        C0106z0 c0106z02 = new C0106z0(h02, 1);
        B4.D d6 = new B4.D(h02, 3);
        b1 b1Var = new b1(c0104y0, 15);
        W0.e eVar = new W0.e(c0106z0, 11);
        C0782v0 c0782v0 = new C0782v0(22);
        float f6 = AbstractC1571h0.a;
        Object h3 = AbstractC1573i.h(this.f735i, new C1556c0(c0782v0, new Object(), null, b1Var, d6, c0106z02, eVar, null), this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (h3 != enumC0927a) {
            h3 = yVar;
        }
        if (h3 != enumC0927a) {
            h3 = yVar;
        }
        if (h3 != enumC0927a) {
            h3 = yVar;
        }
        return h3 == enumC0927a ? enumC0927a : yVar;
    }
}
