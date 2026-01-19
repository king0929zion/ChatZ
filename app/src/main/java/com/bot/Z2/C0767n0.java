package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: Z2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767n0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10268h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.d f10269i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f10270j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767n0(A.d dVar, T.X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10269i = dVar;
        this.f10270j = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0767n0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0767n0(this.f10269i, this.f10270j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10268h;
        if (i6 == 0) {
            X3.a.e(obj);
            if (((Boolean) this.f10270j.getValue()).booleanValue()) {
                this.f10268h = 1;
                Object a = this.f10269i.a(null, this);
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
