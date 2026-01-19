package y;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.AbstractC1318d;
import n.C1327h0;
import n.C1336m;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class d0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0.k f15849i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0.k kVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15849i = kVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new d0(this.f15849i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f15848h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1336m c1336m = (C1336m) this.f15849i.f11565f;
            Float f6 = new Float(S.l.f7374V);
            C1327h0 r5 = AbstractC1318d.r(S.l.f7374V, 400.0f, new Float(0.5f), 1);
            this.f15848h = 1;
            Object i7 = AbstractC1318d.i(c1336m, f6, r5, true, null, this, 8);
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
        return X3.y.a;
    }
}
