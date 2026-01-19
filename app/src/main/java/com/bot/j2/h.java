package j2;

import A4.C0010k;
import b4.C0911i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f12370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f12371i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12371i = lVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((h) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new h(this.f12371i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f12370h;
        if (i6 == 0) {
            X3.a.e(obj);
            l lVar = this.f12371i;
            C0010k H3 = T.r.H(new Y3.l(lVar, 11));
            f fVar = new f(lVar, null);
            int i7 = A4.A.a;
            B4.o oVar = new B4.o(new A3.f(fVar, (InterfaceC0905c) null), H3, C0911i.f11057c, -2, EnumC2050a.f16327c);
            g gVar = new g(lVar);
            this.f12370h = 1;
            Object b5 = oVar.b(gVar, this);
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
        return X3.y.a;
    }
}
