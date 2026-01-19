package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: Z2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761k0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.d f10245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f10246j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0761k0(A.d dVar, T.X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10245i = dVar;
        this.f10246j = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0761k0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0761k0(this.f10245i, this.f10246j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10244h;
        if (i6 == 0) {
            X3.a.e(obj);
            if (((Boolean) this.f10246j.getValue()).booleanValue()) {
                this.f10244h = 1;
                Object a = this.f10245i.a(null, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (a == enumC0927a) {
                    return enumC0927a;
                }
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
