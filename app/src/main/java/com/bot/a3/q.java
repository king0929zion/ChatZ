package a3;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class q extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10688h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f10689i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10689i = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((q) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new q(this.f10689i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10688h;
        w wVar = this.f10689i;
        if (i6 == 0) {
            X3.a.e(obj);
            g0 g0Var = wVar.f10724W;
            Boolean bool = Boolean.TRUE;
            g0Var.getClass();
            g0Var.l(null, bool);
            this.f10688h = 1;
            Object z5 = wVar.z(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (z5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        g0 g0Var2 = wVar.f10724W;
        Boolean bool2 = Boolean.FALSE;
        g0Var2.getClass();
        g0Var2.l(null, bool2);
        return X3.y.a;
    }
}
