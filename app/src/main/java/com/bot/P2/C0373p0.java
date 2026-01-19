package P2;

import A4.C0017s;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: P2.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373p0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x.s f5011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A4.N f5012j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f5013k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f5014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.X f5015m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0373p0(x.s sVar, A4.N n3, T.X x5, T.X x6, T.X x7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5011i = sVar;
        this.f5012j = n3;
        this.f5013k = x5;
        this.f5014l = x6;
        this.f5015m = x7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0373p0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0373p0(this.f5011i, this.f5012j, this.f5013k, this.f5014l, this.f5015m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5010h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        C0017s c0017s = new C0017s(new A2.a(2), A4.W.g(T.r.H(new C0361j0(this.f5011i, 1))), null, 0);
        B4.m mVar = new B4.m(this.f5012j, this.f5013k, this.f5014l, this.f5015m, 4);
        this.f5010h = 1;
        B4.v vVar = new B4.v(c0017s, mVar, null);
        B4.u uVar = new B4.u(o(), this, 0);
        Object T5 = Y3.C.T(uVar, uVar, vVar);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (T5 != enumC0927a) {
            T5 = yVar;
        }
        return T5 == enumC0927a ? enumC0927a : yVar;
    }
}
