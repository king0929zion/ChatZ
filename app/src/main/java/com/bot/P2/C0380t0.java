package P2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: P2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380t0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5066h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A4.N f5067i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x.s f5068j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f5069k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f5070l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.X f5071m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T.X f5072n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0380t0(A4.N n3, x.s sVar, T.X x5, T.X x6, T.X x7, T.X x8, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5067i = n3;
        this.f5068j = sVar;
        this.f5069k = x5;
        this.f5070l = x6;
        this.f5071m = x7;
        this.f5072n = x8;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((C0380t0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0380t0(this.f5067i, this.f5068j, this.f5069k, this.f5070l, this.f5071m, this.f5072n, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5066h;
        if (i6 == 0) {
            X3.a.e(obj);
            C0378s0 c0378s0 = new C0378s0(this.f5068j, this.f5069k, this.f5070l, this.f5071m, this.f5072n);
            this.f5066h = 1;
            Object b5 = this.f5067i.b(c0378s0, this);
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
        throw new RuntimeException();
    }
}
