package W2;

import I0.C0207s0;
import I0.S0;
import R2.A;
import X2.L;
import X3.y;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class s extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9013h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S0 f9014i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0.n f9015j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L f9016k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z5, S0 s02, m0.n nVar, L l3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9013h = z5;
        this.f9014i = s02;
        this.f9015j = nVar;
        this.f9016k = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        s sVar = (s) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        y yVar = y.a;
        sVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new s(this.f9013h, this.f9014i, this.f9015j, this.f9016k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        if (this.f9013h) {
            S0 s02 = this.f9014i;
            if (s02 != null) {
                ((C0207s0) s02).a();
            }
        } else {
            ((m0.q) this.f9015j).b(true);
            this.f9016k.m(A.f6854c);
        }
        return y.a;
    }
}
