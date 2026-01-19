package Q;

import R.AbstractC0514t;
import b.C0858b;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class R0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5499h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S0 f5500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0858b f5501j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(S0 s02, C0858b c0858b, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5500i = s02;
        this.f5501j = c0858b;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((R0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new R0(this.f5500i, this.f5501j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5499h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1316c c1316c = this.f5500i.f5508e;
            Float f6 = new Float(AbstractC0514t.a.c(this.f5501j.f10912c));
            this.f5499h = 1;
            Object e6 = c1316c.e(this, f6);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (e6 == enumC0927a) {
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
