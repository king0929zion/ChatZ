package D;

import F0.AbstractC0137z;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.L2;
import Q.R1;
import Q.f3;
import R.AbstractC0507l;
import S2.AbstractC0565e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import Z2.AbstractC0783w;
import a3.C0808F;
import a3.C0811I;
import a3.C0818g;
import androidx.lifecycle.InterfaceC0846u;
import b0.C0873f;
import com.bot.core.model.McpServer;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e0.InterfaceC0958c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import java.util.List;
import l4.InterfaceC1193a;
import m4.C1285t;
import n.C1321e0;
import r.B1;
import r.E1;
import v.AbstractC1787b;
import v.AbstractC1806l;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f808c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f811g;

    public /* synthetic */ L(L2 l22, InterfaceC1041r interfaceC1041r, C0873f c0873f, int i6) {
        this.f808c = 4;
        this.f811g = l22;
        this.f809e = interfaceC1041r;
        this.f810f = c0873f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f808c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0090r0.h((InterfaceC1041r) this.f809e, (O.N0) this.f811g, (C0873f) this.f810f, (C0626q) obj, T.r.J(385));
                return X3.y.a;
            case 1:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) this.f809e;
                T.X x5 = (T.X) this.f811g;
                C0873f c0873f = (C0873f) this.f810f;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    Object P5 = c0626q.P();
                    if (P5 == C0616l.a) {
                        P5 = new C0103y(x5, 3);
                        c0626q.m0(P5);
                    }
                    InterfaceC1041r m3 = AbstractC0137z.m(interfaceC1041r, (l4.c) P5);
                    F0.V d6 = AbstractC1806l.d(C1026c.f11786c, true);
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
                    T.r.G(c0626q, d6, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q, C0150g.f1930h);
                    T.r.G(c0626q, c6, C0150g.f1926d);
                    c0873f.m(c0626q, 0);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 2:
                ((Integer) obj2).getClass();
                Y3.C.b((I1.j) this.f809e, (InterfaceC0958c) this.f811g, (C0873f) this.f810f, (C0626q) obj, T.r.J(385));
                return X3.y.a;
            case 3:
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f809e;
                C1321e0 c1321e0 = (C1321e0) this.f811g;
                I1.j jVar = (I1.j) this.f810f;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                AbstractC1888A.y(interfaceC1942y, null, new J1.z(floatValue, c1321e0, jVar, null), 3);
                return X3.y.a;
            case 4:
                ((Integer) obj2).getClass();
                R1.l((L2) this.f811g, (InterfaceC1041r) this.f809e, (C0873f) this.f810f, (C0626q) obj, T.r.J(391));
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC0507l.c((InterfaceC0846u) this.f809e, (l4.c) this.f811g, (InterfaceC1193a) this.f810f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC0565e.l((String) this.f809e, (String) this.f811g, (String) this.f810f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC0783w.c((InterfaceC1041r) this.f809e, (InterfaceC1193a) this.f811g, (InterfaceC1193a) this.f810f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC0783w.A((a3.w) this.f809e, (InterfaceC1193a) this.f811g, (l4.c) this.f810f, (C0626q) obj, T.r.J(9));
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                ((Integer) obj2).getClass();
                AbstractC0783w.l((C0818g) this.f809e, (String) this.f811g, (InterfaceC1193a) this.f810f, (C0626q) obj, T.r.J(9));
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                ((Integer) obj2).getClass();
                AbstractC0783w.S((List) this.f809e, (String) this.f811g, (l4.c) this.f810f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC0783w.n((McpServer) this.f811g, (InterfaceC1193a) this.f810f, (InterfaceC1041r) this.f809e, (C0626q) obj, T.r.J(9));
                return X3.y.a;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC0783w.h((String) this.f809e, (InterfaceC1193a) this.f811g, (InterfaceC1193a) this.f810f, (C0626q) obj, T.r.J(385));
                return X3.y.a;
            case 13:
                String str = (String) this.f809e;
                Integer num = (Integer) this.f811g;
                T.X x6 = (T.X) this.f810f;
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c0626q2.V();
                } else if (!((D2.c) x6.getValue()).a) {
                    c0626q2.b0(64781755);
                    f3.b(h5.e.j0(R.string.model_config_reasoning_budget_unsupported, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                    c0626q2.p(false);
                } else if (str != null) {
                    c0626q2.b0(64960036);
                    f3.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                    c0626q2.p(false);
                } else if (num != null) {
                    c0626q2.b0(65093770);
                    f3.b(h5.e.k0(R.string.model_config_reasoning_budget_hint_max, new Object[]{num}, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                    c0626q2.p(false);
                } else {
                    c0626q2.b0(65250754);
                    f3.b(h5.e.j0(R.string.model_config_reasoning_budget_hint, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                    c0626q2.p(false);
                }
                return X3.y.a;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC0783w.s((a3.w) this.f809e, (String) this.f811g, (InterfaceC1193a) this.f810f, (C0626q) obj, T.r.J(9));
                return X3.y.a;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC0783w.F((C0808F) this.f809e, (InterfaceC1193a) this.f811g, (l4.c) this.f810f, (C0626q) obj, T.r.J(9));
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                ((Integer) obj2).getClass();
                AbstractC0783w.K((C0811I) this.f809e, (D2.e) this.f811g, (InterfaceC1193a) this.f810f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC0783w.M((C0811I) this.f809e, (InterfaceC1193a) this.f811g, (l4.c) this.f810f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC0783w.L((Z2.a1) this.f809e, (InterfaceC1193a) this.f811g, (InterfaceC1193a) this.f810f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            default:
                C1285t c1285t = (C1285t) this.f809e;
                E1 e12 = (E1) this.f811g;
                B1 b1 = (B1) this.f810f;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h3 = e12.h(e12.d(floatValue2 - c1285t.f12970c));
                E1 e13 = b1.a;
                c1285t.f12970c += e12.d(e12.g(e13.c(e13.f14022k, h3, 1)));
                return X3.y.a;
        }
    }

    public /* synthetic */ L(McpServer mcpServer, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, int i6) {
        this.f808c = 11;
        this.f811g = mcpServer;
        this.f810f = interfaceC1193a;
        this.f809e = interfaceC1041r;
    }

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, int i6) {
        this.f808c = i6;
        this.f809e = obj;
        this.f811g = obj2;
        this.f810f = obj3;
    }

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, int i6, int i7) {
        this.f808c = i7;
        this.f809e = obj;
        this.f811g = obj2;
        this.f810f = obj3;
    }
}
