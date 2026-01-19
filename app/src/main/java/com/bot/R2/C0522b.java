package R2;

import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import P2.C0348d;
import Q.A0;
import Q.N;
import Q.O;
import Q.R1;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.e1;
import Z2.AbstractC0783w;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import p.AbstractC1464z;
import v.AbstractC1787b;
import v.AbstractC1806l;
import v.t0;
import y2.AbstractC1992b;

/* renamed from: R2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0522b implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6922c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6923e;

    public /* synthetic */ C0522b(int i6, int i7, InterfaceC1193a interfaceC1193a) {
        this.f6922c = i7;
        this.f6923e = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6922c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    R1.o(this.f6923e, null, false, null, null, null, AbstractC0530j.a, c0626q, 805306368, 510);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    R1.o(this.f6923e, null, false, null, null, null, AbstractC0530j.f6940b, c0626q2, 805306368, 510);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 2:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    R1.o(this.f6923e, null, false, null, null, null, AbstractC0530j.f6943e, c0626q3, 805306368, 510);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0530j.j(this.f6923e, (C0626q) obj, T.r.J(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0783w.a(this.f6923e, (C0626q) obj, T.r.J(1));
                break;
            case AbstractC1787b.f15290g /* 5 */:
                C0626q c0626q4 = (C0626q) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    R1.o(this.f6923e, null, false, null, null, null, AbstractC0783w.f10415e, c0626q4, 805306368, 510);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            case 6:
                C0626q c0626q5 = (C0626q) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    InterfaceC1041r j3 = t0.j(C1038o.a, d3.b.a);
                    e1 e1Var = O.a;
                    long j4 = ((N) c0626q5.j(e1Var)).f5431u;
                    C.d dVar = C.e.a;
                    InterfaceC1041r c6 = l0.h.c(AbstractC1464z.f(j3, j4, dVar), dVar);
                    InterfaceC1193a interfaceC1193a = this.f6923e;
                    boolean f6 = c0626q5.f(interfaceC1193a);
                    Object P5 = c0626q5.P();
                    if (f6 || P5 == C0616l.a) {
                        P5 = new C0348d(24, interfaceC1193a);
                        c0626q5.m0(P5);
                    }
                    InterfaceC1041r a = AbstractC1992b.a(31, c6, (InterfaceC1193a) P5, false);
                    V d6 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode = Long.hashCode(c0626q5.f8164T);
                    InterfaceC0617l0 l3 = c0626q5.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q5, a);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q5.f0();
                    if (c0626q5.f8163S) {
                        c0626q5.k(c0148f);
                    } else {
                        c0626q5.p0();
                    }
                    T.r.G(c0626q5, d6, C0150g.f1928f);
                    T.r.G(c0626q5, l3, C0150g.f1927e);
                    T.r.x(c0626q5, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q5, C0150g.f1930h);
                    T.r.G(c0626q5, c7, C0150g.f1926d);
                    A0.a(Y3.C.L(R.drawable.add, 0, c0626q5), h5.e.j0(R.string.mcp_add, c0626q5), null, ((N) c0626q5.j(e1Var)).f5427q, c0626q5, 8, 4);
                    c0626q5.p(true);
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
            case 7:
                C0626q c0626q6 = (C0626q) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    R1.o(this.f6923e, null, false, null, null, null, AbstractC0783w.f10441r, c0626q6, 805306368, 510);
                } else {
                    c0626q6.V();
                }
                return X3.y.a;
            case 8:
                C0626q c0626q7 = (C0626q) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    R1.o(this.f6923e, null, false, null, null, null, AbstractC0783w.f10442s, c0626q7, 805306368, 510);
                } else {
                    c0626q7.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q8 = (C0626q) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    R1.g(this.f6923e, null, false, null, null, AbstractC0783w.f10412c0, c0626q8, 1572864, 62);
                } else {
                    c0626q8.V();
                }
                return X3.y.a;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0522b(int i6, InterfaceC1193a interfaceC1193a) {
        this.f6922c = i6;
        this.f6923e = interfaceC1193a;
    }
}
