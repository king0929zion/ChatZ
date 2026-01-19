package P2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: P2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375q0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5034h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f5035i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A4.N f5036j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f5037k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f5038l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.X f5039m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T.X f5040n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T.X f5041o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375q0(float f6, A4.N n3, T.X x5, T.X x6, T.X x7, T.X x8, T.X x9, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5035i = f6;
        this.f5036j = n3;
        this.f5037k = x5;
        this.f5038l = x6;
        this.f5039m = x7;
        this.f5040n = x8;
        this.f5041o = x9;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0375q0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0375q0(this.f5035i, this.f5036j, this.f5037k, this.f5038l, this.f5039m, this.f5040n, this.f5041o, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5034h;
        T.X x5 = this.f5038l;
        if (i6 == 0) {
            X3.a.e(obj);
            if (e1.f.b(this.f5035i, 0) > 0 && ((Number) this.f5037k.getValue()).intValue() > 0) {
                if (!((Boolean) x5.getValue()).booleanValue() && (((C0344b) this.f5039m.getValue()).a || ((EnumC0356h) this.f5040n.getValue()) != EnumC0356h.f4933c)) {
                    C0352f c0352f = C0352f.a;
                    this.f5034h = 1;
                    Object a = this.f5036j.a(c0352f, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (a == enumC0927a) {
                        return enumC0927a;
                    }
                }
            }
            return X3.y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        X3.a.e(obj);
        if (((Boolean) x5.getValue()).booleanValue()) {
            this.f5041o.setValue(Boolean.FALSE);
        }
        return X3.y.a;
    }
}
