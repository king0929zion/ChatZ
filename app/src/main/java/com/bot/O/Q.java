package O;

import I0.C0185h;
import I0.C0192k0;
import I0.InterfaceC0194l0;
import S0.C0545g;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import u.AbstractC1735c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4028h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0194l0 f4029i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0545g f4030j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(InterfaceC0194l0 interfaceC0194l0, C0545g c0545g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4029i = interfaceC0194l0;
        this.f4030j = c0545g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Q) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new Q(this.f4029i, this.f4030j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4028h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        C0192k0 a = AbstractC1735c.a(this.f4030j);
        this.f4028h = 1;
        ((C0185h) this.f4029i).a(a);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return yVar == enumC0927a ? enumC0927a : yVar;
    }
}
