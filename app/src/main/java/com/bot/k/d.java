package K;

import D.C;
import D.C0103y;
import F0.AbstractC0137z;
import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.A0;
import Q.E0;
import Q.N;
import Q.O;
import Q.V1;
import Q.t3;
import R2.AbstractC0530j;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import T.d1;
import T.e1;
import T.r;
import X3.y;
import Y2.EnumC0731u;
import Z2.AbstractC0783w;
import a3.C0818g;
import a3.w;
import b0.C0873f;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.List;
import l0.h;
import l4.InterfaceC1193a;
import o0.s;
import p.AbstractC1464z;
import t0.AbstractC1688b;
import v.AbstractC1787b;
import v.AbstractC1806l;
import v.t0;
import x4.InterfaceC1942y;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2915c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2919h;

    public /* synthetic */ d(N n3, V1 v12, t3 t3Var, C0873f c0873f, int i6) {
        this.f2915c = 1;
        this.f2917f = n3;
        this.f2918g = v12;
        this.f2919h = t3Var;
        this.f2916e = c0873f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        long j3;
        switch (this.f2915c) {
            case 0:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) this.f2917f;
                X x5 = (X) this.f2918g;
                C0873f c0873f = (C0873f) this.f2916e;
                c cVar = (c) this.f2919h;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    Object P5 = c0626q.P();
                    C0602e c0602e = C0616l.a;
                    if (P5 == c0602e) {
                        P5 = new C0103y(x5, 5);
                        c0626q.m0(P5);
                    }
                    InterfaceC1041r m3 = AbstractC0137z.m(interfaceC1041r, (l4.c) P5);
                    V d6 = AbstractC1806l.d(C1026c.f11786c, true);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q, m3);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    r.G(c0626q, d6, C0150g.f1928f);
                    r.G(c0626q, l3, C0150g.f1927e);
                    r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                    r.C(c0626q, C0150g.f1930h);
                    r.G(c0626q, c6, C0150g.f1926d);
                    c0873f.m(c0626q, 0);
                    Object P6 = c0626q.P();
                    if (P6 == c0602e) {
                        P6 = new C(x5, 4);
                        c0626q.m0(P6);
                    }
                    cVar.b((InterfaceC1193a) P6, c0626q, 6);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return y.a;
            case 1:
                ((Integer) obj2).getClass();
                E0.b((N) this.f2917f, (V1) this.f2918g, (t3) this.f2919h, (C0873f) this.f2916e, (C0626q) obj, r.J(385));
                return y.a;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0530j.n((String) this.f2917f, (l4.c) this.f2918g, (InterfaceC1193a) this.f2916e, (InterfaceC1193a) this.f2919h, (C0626q) obj, r.J(3121));
                return y.a;
            case 3:
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f2917f;
                w wVar = (w) this.f2918g;
                l4.c cVar2 = (l4.c) this.f2916e;
                d1 d1Var = (d1) this.f2919h;
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    InterfaceC1041r j4 = t0.j(C1038o.a, d3.b.a);
                    e1 e1Var = O.a;
                    long j5 = ((N) c0626q2.j(e1Var)).f5431u;
                    C.d dVar = C.e.a;
                    InterfaceC1041r c7 = h.c(AbstractC1464z.f(j4, j5, dVar), dVar);
                    boolean z5 = !((Boolean) d1Var.getValue()).booleanValue();
                    boolean h3 = c0626q2.h(interfaceC1942y) | c0626q2.h(wVar) | c0626q2.f(cVar2);
                    Object P7 = c0626q2.P();
                    if (h3 || P7 == C0616l.a) {
                        P7 = new A.g(interfaceC1942y, wVar, cVar2, 10);
                        c0626q2.m0(P7);
                    }
                    InterfaceC1041r a = AbstractC1992b.a(29, c7, (InterfaceC1193a) P7, z5);
                    V d7 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode2 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l5 = c0626q2.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, a);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f2);
                    } else {
                        c0626q2.p0();
                    }
                    r.G(c0626q2, d7, C0150g.f1928f);
                    r.G(c0626q2, l5, C0150g.f1927e);
                    r.x(c0626q2, Integer.valueOf(hashCode2), C0150g.f1929g);
                    r.C(c0626q2, C0150g.f1930h);
                    r.G(c0626q2, c8, C0150g.f1926d);
                    AbstractC1688b L5 = Y3.C.L(R.drawable.add, 0, c0626q2);
                    String j02 = h5.e.j0(R.string.model_config_bot_add, c0626q2);
                    if (((Boolean) d1Var.getValue()).booleanValue()) {
                        c0626q2.b0(942872884);
                        j3 = s.c(0.4f, ((N) c0626q2.j(e1Var)).f5427q);
                        c0626q2.p(false);
                    } else {
                        c0626q2.b0(942987367);
                        j3 = ((N) c0626q2.j(e1Var)).f5427q;
                        c0626q2.p(false);
                    }
                    A0.a(L5, j02, null, j3, c0626q2, 8, 4);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return y.a;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0783w.j((Z2.C) this.f2917f, (l4.c) this.f2918g, (l4.c) this.f2916e, (InterfaceC1193a) this.f2919h, (C0626q) obj, r.J(1));
                return y.a;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC0783w.o((C0818g) this.f2917f, (InterfaceC1193a) this.f2918g, (InterfaceC1193a) this.f2916e, (l4.c) this.f2919h, (C0626q) obj, r.J(9));
                return y.a;
            default:
                ((Integer) obj2).getClass();
                AbstractC0783w.r((EnumC0731u) this.f2918g, (List) this.f2916e, (String) this.f2919h, (InterfaceC1041r) this.f2917f, (C0626q) obj, r.J(1));
                return y.a;
        }
    }

    public /* synthetic */ d(EnumC0731u enumC0731u, List list, String str, InterfaceC1041r interfaceC1041r, int i6) {
        this.f2915c = 6;
        this.f2918g = enumC0731u;
        this.f2916e = list;
        this.f2919h = str;
        this.f2917f = interfaceC1041r;
    }

    public /* synthetic */ d(Object obj, X3.e eVar, X3.e eVar2, X3.e eVar3, int i6, int i7) {
        this.f2915c = i7;
        this.f2917f = obj;
        this.f2918g = eVar;
        this.f2916e = eVar2;
        this.f2919h = eVar3;
    }

    public /* synthetic */ d(Object obj, Object obj2, X3.e eVar, Object obj3, int i6) {
        this.f2915c = i6;
        this.f2917f = obj;
        this.f2918g = obj2;
        this.f2916e = eVar;
        this.f2919h = obj3;
    }
}
