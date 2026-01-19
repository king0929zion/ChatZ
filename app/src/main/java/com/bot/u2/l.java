package U2;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.N;
import Q.O;
import Q.R1;
import Q.f3;
import Q.t3;
import Q.u3;
import T.C0626q;
import T.InterfaceC0617l0;
import T.r;
import X3.y;
import Z2.AbstractC0783w;
import Z2.f1;
import com.bot.core.model.McpTool;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.Iterator;
import java.util.List;
import m.InterfaceC1194A;
import m4.AbstractC1276k;
import o0.s;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;
import v.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8650c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8651e;

    public /* synthetic */ l(List list, int i6) {
        this.f8650c = i6;
        this.f8651e = list;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f8650c) {
            case 0:
                C0626q c0626q = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$ModalBottomSheet");
                if (c0626q.S(intValue & 1, (intValue & 17) != 16)) {
                    a.k(this.f8651e, AbstractC1787b.z(t0.a, 10, 12), c0626q, 48);
                } else {
                    c0626q.V();
                }
                return y.a;
            case 1:
                C0626q c0626q2 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                InterfaceC1041r C5 = AbstractC1787b.C(C1038o.a, S.l.f7374V, 16, S.l.f7374V, S.l.f7374V, 13);
                C1813t a = AbstractC1812s.a(AbstractC1799h.g(8), C1026c.f11798p, c0626q2, 6);
                int hashCode = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l3 = c0626q2.l();
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, C5);
                InterfaceC0152h.a.getClass();
                C0148f c0148f = C0150g.f1924b;
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f);
                } else {
                    c0626q2.p0();
                }
                r.G(c0626q2, a, C0150g.f1928f);
                r.G(c0626q2, l3, C0150g.f1927e);
                r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                r.C(c0626q2, C0150g.f1930h);
                r.G(c0626q2, c6, C0150g.f1926d);
                List list = this.f8651e;
                f3.b(h5.e.k0(R.string.mcp_tools_title, new Object[]{Integer.valueOf(list.size())}, c0626q2), null, ((N) c0626q2.j(O.a)).f5427q, 0L, W0.k.f8835i, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6127h, c0626q2, 1572864, 0, 131002);
                c0626q2.b0(2108608971);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC0783w.q((McpTool) it.next(), c0626q2, 8);
                }
                c0626q2.p(false);
                c0626q2.p(true);
                return y.a;
            default:
                C0626q c0626q3 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$Card");
                if (c0626q3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q3, 0);
                    int hashCode2 = Long.hashCode(c0626q3.f8164T);
                    InterfaceC0617l0 l5 = c0626q3.l();
                    C1038o c1038o = C1038o.a;
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q3, c1038o);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q3.f0();
                    if (c0626q3.f8163S) {
                        c0626q3.k(c0148f2);
                    } else {
                        c0626q3.p0();
                    }
                    r.G(c0626q3, a6, C0150g.f1928f);
                    r.G(c0626q3, l5, C0150g.f1927e);
                    r.x(c0626q3, Integer.valueOf(hashCode2), C0150g.f1929g);
                    r.C(c0626q3, C0150g.f1930h);
                    r.G(c0626q3, c7, C0150g.f1926d);
                    c0626q3.b0(1426332638);
                    List list2 = this.f8651e;
                    int i6 = 0;
                    for (Object obj4 : list2) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            Y4.l.U();
                            throw null;
                        }
                        AbstractC0783w.P((f1) obj4, c0626q3, 0);
                        if (i6 != Y4.l.C(list2)) {
                            c0626q3.b0(905970737);
                            R1.f(AbstractC1787b.C(c1038o, 56, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), (float) 0.5d, s.c(0.6f, ((N) c0626q3.j(O.a)).f5379B), c0626q3, 54, 0);
                        } else {
                            c0626q3.b0(904196173);
                        }
                        c0626q3.p(false);
                        i6 = i7;
                    }
                    c0626q3.p(false);
                    c0626q3.p(true);
                } else {
                    c0626q3.V();
                }
                return y.a;
        }
    }
}
