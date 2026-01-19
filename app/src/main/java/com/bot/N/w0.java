package n;

import T.C0603e0;
import T.C0607g0;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class w0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public float f13272h;

    /* renamed from: i, reason: collision with root package name */
    public int f13273i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f13274j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y0 f13275k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13275k = y0Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((w0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        w0 w0Var = new w0(this.f13275k, interfaceC0905c);
        w0Var.f13274j = obj;
        return w0Var;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        final float n3;
        InterfaceC1942y interfaceC1942y;
        int i6 = this.f13273i;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y2 = (InterfaceC1942y) this.f13274j;
            n3 = AbstractC1318d.n(interfaceC1942y2.c());
            interfaceC1942y = interfaceC1942y2;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n3 = this.f13272h;
            interfaceC1942y = (InterfaceC1942y) this.f13274j;
            X3.a.e(obj);
        }
        while (AbstractC1888A.w(interfaceC1942y)) {
            final y0 y0Var = this.f13275k;
            l4.c cVar = new l4.c() { // from class: n.v0
                @Override // l4.c
                public final Object f(Object obj2) {
                    long longValue = ((Long) obj2).longValue();
                    y0 y0Var2 = y0.this;
                    boolean g3 = y0Var2.g();
                    C0603e0 c0603e0 = y0Var2.f13283g;
                    if (!g3) {
                        if (c0603e0.g() == Long.MIN_VALUE) {
                            c0603e0.h(longValue);
                            ((C0607g0) y0Var2.a.a).setValue(Boolean.TRUE);
                        }
                        long g6 = longValue - c0603e0.g();
                        float f6 = n3;
                        if (f6 != S.l.f7374V) {
                            g6 = AbstractC1410a.L(g6 / f6);
                        }
                        y0Var2.n(g6);
                        y0Var2.h(g6, f6 == S.l.f7374V);
                    }
                    return X3.y.a;
                }
            };
            this.f13274j = interfaceC1942y;
            this.f13272h = n3;
            this.f13273i = 1;
            InterfaceC0910h interfaceC0910h = this.f11435e;
            AbstractC1276k.c(interfaceC0910h);
            Object a = T.r.w(interfaceC0910h).a(this, cVar);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
                return enumC0927a;
            }
        }
        return X3.y.a;
    }
}
