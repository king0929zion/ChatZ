package R;

import Q.s3;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1573i;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class C extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6684h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.D f6686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s3 f6687k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(B0.D d6, s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6686j = d6;
        this.f6687k = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C c6 = new C(this.f6686j, this.f6687k, interfaceC0905c);
        c6.f6685i = obj;
        return c6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6684h;
        if (i6 == 0) {
            X3.a.e(obj);
            B b5 = new B((InterfaceC1942y) this.f6685i, this.f6687k, null);
            this.f6684h = 1;
            Object h3 = AbstractC1573i.h(this.f6686j, b5, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (h3 == enumC0927a) {
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
