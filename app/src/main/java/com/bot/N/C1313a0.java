package n;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: n.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313a0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13077h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13078i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f13079j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f13080k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f13081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y0 f13082m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f13083n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313a0(Object obj, Object obj2, C1321e0 c1321e0, y0 y0Var, float f6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13079j = obj;
        this.f13080k = obj2;
        this.f13081l = c1321e0;
        this.f13082m = y0Var;
        this.f13083n = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1313a0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1313a0 c1313a0 = new C1313a0(this.f13079j, this.f13080k, this.f13081l, this.f13082m, this.f13083n, interfaceC0905c);
        c1313a0.f13078i = obj;
        return c1313a0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13077h;
        X3.y yVar = X3.y.a;
        C1321e0 c1321e0 = this.f13081l;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f13078i;
            Object obj2 = this.f13079j;
            Object obj3 = this.f13080k;
            if (AbstractC1276k.b(obj2, obj3)) {
                c1321e0.f13146n = null;
                if (AbstractC1276k.b(c1321e0.f13135c.getValue(), obj2)) {
                    return yVar;
                }
            } else {
                C1321e0.t(c1321e0);
            }
            boolean b5 = AbstractC1276k.b(obj2, obj3);
            float f6 = this.f13083n;
            if (!b5) {
                y0 y0Var = this.f13082m;
                y0Var.p(obj2);
                y0Var.n(0L);
                c1321e0.f13134b.setValue(obj2);
                y0Var.j(f6);
            }
            c1321e0.C(f6);
            if (c1321e0.f13145m.i()) {
                AbstractC1888A.y(interfaceC1942y, null, new Z(c1321e0, null), 3);
            } else {
                c1321e0.f13144l = Long.MIN_VALUE;
            }
            this.f13077h = 1;
            Object w5 = C1321e0.w(c1321e0, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (w5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        c1321e0.B();
        return yVar;
    }
}
