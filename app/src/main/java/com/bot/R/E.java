package R;

import Q.s3;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import p.x0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class E extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s3 f6690i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6690i = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((E) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new E(this.f6690i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6689h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f6689h = 1;
            Object c6 = this.f6690i.c(x0.f13824e, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
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
