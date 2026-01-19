package W2;

import A4.g0;
import X2.C0688c;
import X2.C0692g;
import X3.y;
import androidx.lifecycle.O;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f8868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f8869j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0692g c0692g, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8868i = c0692g;
        this.f8869j = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new d(this.f8868i, this.f8869j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f8867h;
        C0692g c0692g = this.f8868i;
        if (i6 == 0) {
            X3.a.e(obj);
            long j3 = this.f8869j;
            if (j3 <= 0) {
                c0692g.getClass();
            } else if (j3 != c0692g.f9292w) {
                c0692g.f9292w = j3;
                this.f8867h = 1;
                Object m3 = AbstractC1888A.m(3000L, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (m3 == enumC0927a) {
                    return enumC0927a;
                }
            }
            return y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        X3.a.e(obj);
        c0692g.f9289t = 0;
        g0 g0Var = c0692g.f9281l;
        Boolean bool = Boolean.TRUE;
        g0Var.getClass();
        g0Var.l(null, bool);
        AbstractC1888A.y(O.i(c0692g), null, new C0688c(c0692g, null), 3);
        return y.a;
    }
}
