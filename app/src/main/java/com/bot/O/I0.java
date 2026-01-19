package O;

import D.EnumC0075j0;
import I0.C0185h;
import I0.C0192k0;
import I0.InterfaceC0194l0;
import S0.C0542d;
import S0.C0545g;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import u.AbstractC1735c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class I0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3957h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ N0 f3958i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(N0 n02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3958i = n02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((I0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new I0(this.f3958i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0545g c0545g;
        InterfaceC0194l0 interfaceC0194l0;
        int i6 = this.f3957h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        N0 n02 = this.f3958i;
        if (S0.O.c(n02.n().f9125b) || !n02.j()) {
            c0545g = null;
        } else {
            c0545g = Y3.C.v(n02.n());
            C0545g x5 = Y3.C.x(n02.n(), n02.n().a.f7630e.length());
            C0545g w5 = Y3.C.w(n02.n(), n02.n().a.f7630e.length());
            C0542d c0542d = new C0542d(x5);
            c0542d.c(w5);
            C0545g i7 = c0542d.i();
            int f6 = S0.O.f(n02.n().f9125b);
            n02.f3994c.f(N0.e(i7, S0.F.b(f6, f6)));
            n02.q(EnumC0075j0.f1042c);
            n02.a.f1069e = true;
        }
        if (c0545g != null && (interfaceC0194l0 = n02.f3998g) != null) {
            C0192k0 a = AbstractC1735c.a(c0545g);
            this.f3957h = 1;
            ((C0185h) interfaceC0194l0).a(a);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (yVar == enumC0927a) {
                return enumC0927a;
            }
        }
        return yVar;
    }
}
