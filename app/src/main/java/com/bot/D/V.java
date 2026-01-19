package D;

import A4.C0010k;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class V extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f939h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0098v0 f940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f941j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X0.w f942k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O.N0 f943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X0.k f944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0098v0 c0098v0, T.X x5, X0.w wVar, O.N0 n02, X0.k kVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f940i = c0098v0;
        this.f941j = x5;
        this.f942k = wVar;
        this.f943l = n02;
        this.f944m = kVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((V) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new V(this.f940i, this.f941j, this.f942k, this.f943l, this.f944m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f939h;
        C0098v0 c0098v0 = this.f940i;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                C0010k H3 = T.r.H(new C(this.f941j, 1));
                B4.m mVar = new B4.m(c0098v0, this.f942k, this.f943l, this.f944m, 1);
                this.f939h = 1;
                Object b5 = H3.b(mVar, this);
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
            AbstractC0090r0.q(c0098v0);
            return X3.y.a;
        } catch (Throwable th) {
            AbstractC0090r0.q(c0098v0);
            throw th;
        }
    }
}
