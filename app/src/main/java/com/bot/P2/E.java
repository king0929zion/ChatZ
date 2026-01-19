package P2;

import D.C0103y;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.D1;
import Q.a3;
import Q.f3;
import Q.t3;
import Q.u3;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import Z2.AbstractC0783w;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import v.AbstractC1799h;
import v.C1818y;
import w.AbstractC1829a;
import x.C1851b;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4679c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f4680e;

    public /* synthetic */ E(T.X x5, int i6) {
        this.f4679c = i6;
        this.f4680e = x5;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        boolean z5;
        C0626q c0626q;
        switch (this.f4679c) {
            case 0:
                l4.e eVar = (l4.e) obj;
                C0626q c0626q2 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f(eVar, "innerTextField");
                if ((intValue & 6) == 0) {
                    intValue |= c0626q2.h(eVar) ? 4 : 2;
                }
                int i6 = intValue;
                if (c0626q2.S(i6 & 1, (i6 & 19) != 18)) {
                    if (((X0.v) this.f4680e.getValue()).a.f7630e.length() == 0) {
                        c0626q2.b0(596496964);
                        z5 = false;
                        f3.b(h5.e.j0(R.string.input_message_placeholder, c0626q2), null, o0.s.c(0.6f, ((Q.N) c0626q2.j(Q.O.a)).f5429s), 0L, null, 0L, null, 0L, 0, false, 0, 0, new S0.P(0L, s4.j.z(16), null, null, 0L, 0, 0L, 16777213), c0626q2, 0, 12582912, 131066);
                        c0626q = c0626q2;
                    } else {
                        z5 = false;
                        c0626q2.b0(579098276);
                        c0626q = c0626q2;
                    }
                    c0626q.p(z5);
                    eVar.m(c0626q, Integer.valueOf(i6 & 14));
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 1:
                C0626q c0626q3 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C1818y c1818y = v.t0.a;
                    v.p0 a = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q3, 48);
                    int hashCode = Long.hashCode(c0626q3.f8164T);
                    InterfaceC0617l0 l3 = c0626q3.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q3, c1818y);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q3.f0();
                    if (c0626q3.f8163S) {
                        c0626q3.k(c0148f);
                    } else {
                        c0626q3.p0();
                    }
                    T.r.G(c0626q3, a, C0150g.f1928f);
                    T.r.G(c0626q3, l3, C0150g.f1927e);
                    T.r.x(c0626q3, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q3, C0150g.f1930h);
                    T.r.G(c0626q3, c6, C0150g.f1926d);
                    String j02 = h5.e.j0(R.string.mcp_enabled_label, c0626q3);
                    S0.P p5 = ((t3) c0626q3.j(u3.a)).f6130k;
                    long j3 = ((Q.N) c0626q3.j(Q.O.a)).f5427q;
                    if (1.0f <= 0.0d) {
                        AbstractC1829a.a("invalid weight; must be greater than zero");
                    }
                    f3.b(j02, new v.Z(1.0f, true), j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, p5, c0626q3, 0, 0, 131064);
                    T.X x5 = this.f4680e;
                    boolean booleanValue = ((Boolean) x5.getValue()).booleanValue();
                    boolean f6 = c0626q3.f(x5);
                    Object P5 = c0626q3.P();
                    if (f6 || P5 == C0616l.a) {
                        P5 = new C0103y(x5, 18);
                        c0626q3.m0(P5);
                    }
                    a3.a(booleanValue, (l4.c) P5, null, false, null, c0626q3, 0, 124);
                    c0626q3.p(true);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 2:
                C0626q c0626q4 = (C0626q) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q4.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    T.X x6 = this.f4680e;
                    String str = (String) x6.getValue();
                    C1818y c1818y2 = v.t0.a;
                    boolean f7 = c0626q4.f(x6);
                    Object P6 = c0626q4.P();
                    if (f7 || P6 == C0616l.a) {
                        P6 = new C0103y(x6, 19);
                        c0626q4.m0(P6);
                    }
                    D1.a(str, (l4.c) P6, c1818y2, false, false, null, AbstractC0783w.f10421h, null, null, null, null, false, null, null, null, true, 0, 0, null, null, c0626q4, 1573248, 12582912, 8257464);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q5 = (C0626q) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q5.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    T.X x7 = this.f4680e;
                    String str2 = (String) x7.getValue();
                    C1818y c1818y3 = v.t0.a;
                    boolean f8 = c0626q5.f(x7);
                    Object P7 = c0626q5.P();
                    if (f8 || P7 == C0616l.a) {
                        P7 = new C0103y(x7, 17);
                        c0626q5.m0(P7);
                    }
                    D1.a(str2, (l4.c) P7, c1818y3, false, false, null, AbstractC0783w.f10423i, AbstractC0783w.f10425j, null, null, null, false, null, null, null, true, 0, 0, null, null, c0626q5, 14156160, 12582912, 8257336);
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
        }
    }
}
