package n;

import T.C0607g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class X extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13059h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f13060i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f13061j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f13062k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y0 f13063l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C1321e0 c1321e0, Object obj, y0 y0Var, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f13061j = c1321e0;
        this.f13062k = obj;
        this.f13063l = y0Var;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
        switch (this.f13059h) {
            case 0:
                return new X(this.f13063l, this.f13061j, this.f13062k, interfaceC0905c).r(X3.y.a);
            default:
                return new X(this.f13061j, this.f13062k, this.f13063l, interfaceC0905c).r(X3.y.a);
        }
    }

    @Override // d4.a
    public final Object r(Object obj) {
        switch (this.f13059h) {
            case 0:
                int i6 = this.f13060i;
                y0 y0Var = this.f13063l;
                if (i6 == 0) {
                    X3.a.e(obj);
                    W w5 = new W(this.f13061j, this.f13062k, y0Var, null);
                    this.f13060i = 1;
                    Object l3 = AbstractC1888A.l(w5, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (l3 == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                y0Var.i();
                return X3.y.a;
            default:
                int i7 = this.f13060i;
                y0 y0Var2 = this.f13063l;
                if (i7 == 0) {
                    X3.a.e(obj);
                    C1321e0 c1321e0 = this.f13061j;
                    c1321e0.y();
                    C0607g0 c0607g0 = c1321e0.f13134b;
                    c1321e0.f13144l = Long.MIN_VALUE;
                    c1321e0.C(S.l.f7374V);
                    Object value = c1321e0.f13135c.getValue();
                    Object obj2 = this.f13062k;
                    float f6 = obj2.equals(value) ? -4.0f : obj2.equals(c0607g0.getValue()) ? -5.0f : -3.0f;
                    y0Var2.p(obj2);
                    y0Var2.n(0L);
                    c0607g0.setValue(obj2);
                    c1321e0.C(S.l.f7374V);
                    c1321e0.o(obj2);
                    y0Var2.j(f6);
                    if (f6 == -3.0f) {
                        this.f13060i = 1;
                        Object w6 = C1321e0.w(c1321e0, this);
                        EnumC0927a enumC0927a2 = EnumC0927a.f11114c;
                        if (w6 == enumC0927a2) {
                            return enumC0927a2;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                y0Var2.i();
                return X3.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(y0 y0Var, C1321e0 c1321e0, Object obj, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f13063l = y0Var;
        this.f13061j = c1321e0;
        this.f13062k = obj;
    }
}
