package R;

import Q.s3;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m0.EnumC1245A;
import p.x0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class H extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6700h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EnumC1245A f6701i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s3 f6702j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(EnumC1245A enumC1245A, s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6701i = enumC1245A;
        this.f6702j = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((H) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new H(this.f6701i, this.f6702j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6700h;
        EnumC1245A enumC1245A = this.f6701i;
        s3 s3Var = this.f6702j;
        if (i6 == 0) {
            X3.a.e(obj);
            if (enumC1245A.b()) {
                this.f6700h = 1;
                Object c6 = s3Var.c(x0.f13825f, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (c6 == enumC0927a) {
                    return enumC0927a;
                }
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        if (s3Var.b() && !enumC1245A.b()) {
            s3Var.a();
        }
        return X3.y.a;
    }
}
