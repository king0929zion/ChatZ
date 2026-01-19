package p;

import H0.AbstractC0157l;
import I0.AbstractC0204q0;
import I0.X0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import l4.InterfaceC1193a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13623h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S f13624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13624i = s5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Q) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new Q(this.f13624i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13623h;
        S s5 = this.f13624i;
        if (i6 == 0) {
            X3.a.e(obj);
            long b5 = ((X0) AbstractC0157l.h(s5, AbstractC0204q0.f2369s)).b();
            this.f13623h = 1;
            Object m3 = AbstractC1888A.m(b5, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (m3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        InterfaceC1193a interfaceC1193a = s5.f13645P;
        if (interfaceC1193a != null) {
            interfaceC1193a.b();
        }
        return X3.y.a;
    }
}
