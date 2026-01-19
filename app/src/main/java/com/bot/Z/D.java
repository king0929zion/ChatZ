package z;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.InterfaceC1563e1;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class D extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f16038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2004b f16039i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16040j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C2004b c2004b, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16039i = c2004b;
        this.f16040j = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((D) p((InterfaceC0905c) obj2, (InterfaceC1563e1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new D(this.f16039i, this.f16040j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f16038h;
        C2004b c2004b = this.f16039i;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f16038h = 1;
            Object i7 = c2004b.i(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (i7 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        double d6 = S.l.f7374V;
        if (-0.5d > d6 || d6 > 0.5d) {
            AbstractC1734b.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        c2004b.t(c2004b.k(this.f16040j), S.l.f7374V, true);
        return X3.y.a;
    }
}
