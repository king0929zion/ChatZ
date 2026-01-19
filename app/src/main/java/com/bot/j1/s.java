package J1;

import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.A0;
import Q.N;
import Q.O;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import T.d1;
import T.e1;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import p.AbstractC1464z;
import t0.AbstractC1688b;
import u4.AbstractC1776n;
import v.AbstractC1806l;
import v.t0;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2859c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2865j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2866k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2867l;

    public /* synthetic */ s(I1.B b5, InterfaceC1041r interfaceC1041r, InterfaceC1028e interfaceC1028e, l4.c cVar, l4.c cVar2, l4.c cVar3, l4.c cVar4, l4.c cVar5, int i6) {
        this.f2860e = b5;
        this.f2861f = interfaceC1041r;
        this.f2862g = interfaceC1028e;
        this.f2863h = cVar;
        this.f2864i = cVar2;
        this.f2865j = cVar3;
        this.f2866k = cVar4;
        this.f2867l = cVar5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        long c6;
        switch (this.f2859c) {
            case 0:
                ((Integer) obj2).getClass();
                s4.j.b((I1.B) this.f2860e, (InterfaceC1041r) this.f2861f, (InterfaceC1028e) this.f2862g, (l4.c) this.f2863h, (l4.c) this.f2864i, (l4.c) this.f2865j, (l4.c) this.f2866k, (l4.c) this.f2867l, (C0626q) obj, T.r.J(49));
                return X3.y.a;
            default:
                String str = (String) this.f2860e;
                String str2 = (String) this.f2861f;
                String str3 = (String) this.f2862g;
                String str4 = (String) this.f2863h;
                a3.w wVar = (a3.w) this.f2864i;
                X x5 = (X) this.f2865j;
                X x6 = (X) this.f2866k;
                d1 d1Var = (d1) this.f2867l;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    boolean z5 = !((Boolean) x5.getValue()).booleanValue() && AbstractC1776n.l0((String) x6.getValue()).toString().length() > 0 && str == null && str2 == null && str3 == null && str4 == null && ((Boolean) d1Var.getValue()).booleanValue();
                    InterfaceC1041r j3 = t0.j(C1038o.a, d3.b.a);
                    e1 e1Var = O.a;
                    long j4 = ((N) c0626q.j(e1Var)).f5431u;
                    C.d dVar = C.e.a;
                    InterfaceC1041r c7 = l0.h.c(AbstractC1464z.f(j3, j4, dVar), dVar);
                    boolean h3 = c0626q.h(wVar);
                    Object P5 = c0626q.P();
                    if (h3 || P5 == C0616l.a) {
                        P5 = new W2.n(wVar, 5);
                        c0626q.m0(P5);
                    }
                    InterfaceC1041r a = AbstractC1992b.a(29, c7, (InterfaceC1193a) P5, z5);
                    V d6 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q, a);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    T.r.G(c0626q, d6, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q, C0150g.f1930h);
                    T.r.G(c0626q, c8, C0150g.f1926d);
                    AbstractC1688b L5 = Y3.C.L(R.drawable.check, 0, c0626q);
                    String j02 = h5.e.j0(R.string.model_config_save, c0626q);
                    if (z5) {
                        c0626q.b0(1418251441);
                        c6 = ((N) c0626q.j(e1Var)).f5427q;
                        c0626q.p(false);
                    } else {
                        c0626q.b0(1418348254);
                        c6 = o0.s.c(0.4f, ((N) c0626q.j(e1Var)).f5427q);
                        c0626q.p(false);
                    }
                    A0.a(L5, j02, null, c6, c0626q, 8, 4);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ s(String str, String str2, String str3, String str4, a3.w wVar, X x5, X x6, X x7) {
        this.f2860e = str;
        this.f2861f = str2;
        this.f2862g = str3;
        this.f2863h = str4;
        this.f2864i = wVar;
        this.f2865j = x5;
        this.f2866k = x6;
        this.f2867l = x7;
    }
}
