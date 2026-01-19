package P2;

import I0.C0207s0;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class L extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m0.w f4760i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.S0 f4761j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(int i6, m0.w wVar, I0.S0 s02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4759h = i6;
        this.f4760i = wVar;
        this.f4761j = s02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        L l3 = (L) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        l3.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new L(this.f4759h, this.f4760i, this.f4761j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        if (this.f4759h > 0) {
            m0.w.a(this.f4760i);
            I0.S0 s02 = this.f4761j;
            if (s02 != null) {
                ((C0207s0) s02).b();
            }
        }
        return X3.y.a;
    }
}
