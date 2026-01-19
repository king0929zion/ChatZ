package m;

import A4.C0010k;
import A4.C0024z;
import T.C0621n0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.y0;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240v extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f12845h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12846i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f12847j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f12848k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240v(y0 y0Var, T.X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12847j = y0Var;
        this.f12848k = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1240v) p((InterfaceC0905c) obj2, (C0621n0) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1240v c1240v = new C1240v(this.f12847j, this.f12848k, interfaceC0905c);
        c1240v.f12846i = obj;
        return c1240v;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f12845h;
        if (i6 == 0) {
            X3.a.e(obj);
            C0621n0 c0621n0 = (C0621n0) this.f12846i;
            y0 y0Var = this.f12847j;
            C0010k H3 = T.r.H(new A0.b(y0Var, 18));
            C0024z c0024z = new C0024z(c0621n0, y0Var, this.f12848k, 4);
            this.f12845h = 1;
            Object b5 = H3.b(c0024z, this);
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
        return X3.y.a;
    }
}
