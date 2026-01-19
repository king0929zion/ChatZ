package I0;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.C1928k;

/* loaded from: classes.dex */
public final class Q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2232h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2233i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f2234j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2234j = s5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((Q) p((InterfaceC0905c) obj2, (D0) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        Q q3 = new Q(this.f2234j, interfaceC0905c);
        q3.f2233i = obj;
        return q3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f2232h;
        if (i6 == 0) {
            X3.a.e(obj);
            D0 d02 = (D0) this.f2233i;
            this.f2233i = d02;
            this.f2232h = 1;
            C1928k c1928k = new C1928k(1, Y4.d.K(this));
            c1928k.t();
            S s5 = this.f2234j;
            X0.w wVar = s5.f2243e;
            X0.q qVar = wVar.a;
            qVar.a();
            wVar.f9127b.set(new X0.A(wVar, qVar));
            c1928k.v(new B0.F(5, d02, s5));
            Object s6 = c1928k.s();
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (s6 == enumC0927a) {
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
