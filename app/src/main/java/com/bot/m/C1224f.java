package m;

import F0.AbstractC0137z;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;
import f0.C0996s;
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import n.s0;
import n.y0;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1224f extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f12796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.c f12798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1237s f12799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0996s f12800i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0873f f12801j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224f(y0 y0Var, Object obj, l4.c cVar, C1237s c1237s, C0996s c0996s, C0873f c0873f) {
        super(2);
        this.f12796e = y0Var;
        this.f12797f = obj;
        this.f12798g = cVar;
        this.f12799h = c1237s;
        this.f12800i = c0996s;
        this.f12801j = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            Object P5 = c0626q.P();
            l4.c cVar = this.f12798g;
            C1237s c1237s = this.f12799h;
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = (C1198E) cVar.f(c1237s);
                c0626q.m0(P5);
            }
            C1198E c1198e = (C1198E) P5;
            y0 y0Var = this.f12796e;
            s0 f6 = y0Var.f();
            C0607g0 c0607g0 = y0Var.f13280d;
            Object c6 = f6.c();
            Object obj3 = this.f12797f;
            boolean g3 = c0626q.g(AbstractC1276k.b(c6, obj3));
            Object P6 = c0626q.P();
            if (g3 || P6 == c0602e) {
                P6 = AbstractC1276k.b(y0Var.f().c(), obj3) ? C1211S.f12761b : ((C1198E) cVar.f(c1237s)).f12711b;
                c0626q.m0(P6);
            }
            C1211S c1211s = (C1211S) P6;
            Object P7 = c0626q.P();
            if (P7 == c0602e) {
                P7 = new C1231m(AbstractC1276k.b(obj3, c0607g0.getValue()));
                c0626q.m0(P7);
            }
            C1231m c1231m = (C1231m) P7;
            C1210Q c1210q = c1198e.a;
            boolean h3 = c0626q.h(c1198e);
            Object P8 = c0626q.P();
            if (h3 || P8 == c0602e) {
                P8 = new F0.C(c1198e, 1);
                c0626q.m0(P8);
            }
            InterfaceC1041r k3 = AbstractC0137z.k(C1038o.a, (l4.f) P8);
            c1231m.a.setValue(Boolean.valueOf(AbstractC1276k.b(obj3, c0607g0.getValue())));
            InterfaceC1041r c7 = k3.c(c1231m);
            boolean h6 = c0626q.h(obj3);
            Object P9 = c0626q.P();
            if (h6 || P9 == c0602e) {
                P9 = new B0.G(obj3, 23);
                c0626q.m0(P9);
            }
            l4.c cVar2 = (l4.c) P9;
            boolean f7 = c0626q.f(c1211s);
            Object P10 = c0626q.P();
            if (f7 || P10 == c0602e) {
                P10 = new F0.B(c1211s, 9);
                c0626q.m0(P10);
            }
            AbstractC1244z.a(this.f12796e, cVar2, c7, c1210q, c1211s, (l4.e) P10, AbstractC0874g.c(-143346359, new C1223e(this.f12800i, obj3, c1237s, this.f12801j), c0626q), c0626q, 12582912);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
