package W2;

import T.X;
import X2.C0694i;
import X2.L;
import X3.y;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f9011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X f9012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(L l3, X x5, X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9010h = l3;
        this.f9011i = x5;
        this.f9012j = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        r rVar = (r) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        y yVar = y.a;
        rVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new r(this.f9010h, this.f9011i, this.f9012j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        X x5 = this.f9011i;
        boolean z5 = ((D2.c) x5.getValue()).f1273b;
        L l3 = this.f9010h;
        X x6 = this.f9012j;
        if (z5 && !((C0694i) x6.getValue()).f9303d) {
            l3.s(true);
        } else if (!((D2.c) x5.getValue()).a && ((C0694i) x6.getValue()).f9303d) {
            l3.s(false);
        }
        return y.a;
    }
}
