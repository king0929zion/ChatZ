package R;

import Q.s3;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import p.x0;
import x4.InterfaceC1942y;

/* renamed from: R.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518x extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6843h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s3 f6844i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0518x(s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6844i = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0518x) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0518x(this.f6844i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6843h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f6843h = 1;
            Object c6 = this.f6844i.c(x0.f13823c, this);
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
