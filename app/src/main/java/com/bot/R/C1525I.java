package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: r.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525I extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14060h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1529K f14061i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p.x0 f14062j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.e f14063k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1525I(C1529K c1529k, p.x0 x0Var, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14061i = c1529k;
        this.f14062j = x0Var;
        this.f14063k = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1525I) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1525I(this.f14061i, this.f14062j, this.f14063k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14060h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1529K c1529k = this.f14061i;
            p.C0 c02 = c1529k.f14072c;
            C1527J c1527j = c1529k.f14071b;
            C1523H c1523h = new C1523H(c1529k, this.f14063k, null);
            this.f14060h = 1;
            c02.getClass();
            Object l3 = AbstractC1888A.l(new p.B0(this.f14062j, c02, c1523h, c1527j, null), this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (l3 == enumC0927a) {
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
