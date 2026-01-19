package R2;

import D.I0;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.C0415g0;
import Q.C0443n0;
import Q.D1;
import Q.V1;
import Q.W1;
import Q.b3;
import S2.Y;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import T.d1;
import Z2.AbstractC0783w;
import b0.AbstractC0874g;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.List;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1244z;
import m4.AbstractC1276k;
import v.AbstractC1799h;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;
import v.t0;
import x.C1851b;

/* renamed from: R2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0533m implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6966c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f6968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.c f6969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6971i;

    public /* synthetic */ C0533m(String str, b3 b3Var, X x5, List list, l4.c cVar) {
        this.f6967e = str;
        this.f6970h = b3Var;
        this.f6971i = x5;
        this.f6968f = list;
        this.f6969g = cVar;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f6966c) {
            case 0:
                d1 d1Var = (d1) this.f6970h;
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f6971i;
                C0626q c0626q = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q.S(intValue & 1, (intValue & 17) != 16)) {
                    C1813t a = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q, C1038o.a);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    T.r.G(c0626q, a, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q, C0150g.f1930h);
                    T.r.G(c0626q, c6, C0150g.f1926d);
                    boolean booleanValue = ((Boolean) d1Var.getValue()).booleanValue();
                    List list = this.f6968f;
                    AbstractC1244z.b(C1814u.a, booleanValue && !list.isEmpty(), null, AbstractC1205L.b(null, 3).a(AbstractC1205L.a(null, 15)), AbstractC1205L.c(null, 3).a(AbstractC1205L.d(null, 15)), null, AbstractC0874g.c(-234397989, new I0(list, this.f6967e, this.f6969g, interfaceC1193a, 1), c0626q), c0626q, 1600518, 18);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                b3 b3Var = (b3) this.f6970h;
                X x5 = (X) this.f6971i;
                C0443n0 c0443n0 = (C0443n0) obj;
                C0626q c0626q2 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? c0626q2.f(c0443n0) : c0626q2.h(c0443n0) ? 4 : 2;
                }
                int i6 = intValue2;
                if (c0626q2.S(i6 & 1, (i6 & 19) != 18)) {
                    InterfaceC1041r c7 = c0443n0.b().c(t0.a);
                    Object P5 = c0626q2.P();
                    C0602e c0602e = C0616l.a;
                    if (P5 == c0602e) {
                        P5 = new Y(11);
                        c0626q2.m0(P5);
                    }
                    D1.a(this.f6967e, (l4.c) P5, c7, false, true, null, AbstractC0783w.f10435o, AbstractC0783w.f10437p, null, AbstractC0874g.c(615288601, new C0415g0(x5, 2), c0626q2), null, false, null, null, null, false, 0, 0, null, b3Var, c0626q2, 819486768, 0, 4193576);
                    boolean booleanValue2 = ((Boolean) x5.getValue()).booleanValue();
                    Object P6 = c0626q2.P();
                    if (P6 == c0602e) {
                        P6 = new D.C(x5, 17);
                        c0626q2.m0(P6);
                    }
                    c0443n0.a(booleanValue2, P6, null, null, false, ((V1) c0626q2.j(W1.a)).f5545c, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(1758360370, new Z2.J(this.f6968f, this.f6969g, x5, 0), c0626q2), c0626q2, 48, 6 | ((i6 << 3) & 112), 988);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0533m(List list, d1 d1Var, String str, l4.c cVar, InterfaceC1193a interfaceC1193a) {
        this.f6968f = list;
        this.f6970h = d1Var;
        this.f6967e = str;
        this.f6969g = cVar;
        this.f6971i = interfaceC1193a;
    }
}
