package D;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import R2.AbstractC0530j;
import S0.C0545g;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import Z2.AbstractC0783w;
import com.bot.core.model.LLMSetting;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.List;
import l4.InterfaceC1193a;
import m.InterfaceC1194A;
import m4.AbstractC1276k;
import q.AbstractC1490b;
import q.C1491c;
import q.C1492d;
import u.AbstractC1734b;
import u4.AbstractC1776n;
import v.AbstractC1799h;
import v.AbstractC1812s;
import v.C1813t;
import x.C1851b;

/* loaded from: classes.dex */
public final /* synthetic */ class I0 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f783c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f787h;

    public /* synthetic */ I0(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f783c = i6;
        this.f784e = obj;
        this.f785f = obj2;
        this.f786g = obj3;
        this.f787h = obj4;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.f783c) {
            case 0:
                o0.N n3 = (o0.N) this.f784e;
                C0098v0 c0098v0 = (C0098v0) this.f785f;
                X0.v vVar = (X0.v) this.f786g;
                Object obj5 = (X0.p) this.f787h;
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q.b0(-84507373);
                boolean booleanValue = ((Boolean) c0626q.j(AbstractC0204q0.f2373w)).booleanValue();
                boolean g3 = c0626q.g(booleanValue);
                Object P5 = c0626q.P();
                Object obj6 = C0616l.a;
                if (g3 || P5 == obj6) {
                    P5 = new M.m(booleanValue);
                    c0626q.m0(P5);
                }
                M.m mVar = (M.m) P5;
                boolean z5 = n3.a != 16;
                if (((Boolean) ((I0.F0) ((I0.a1) c0626q.j(AbstractC0204q0.f2370t))).a.getValue()).booleanValue() && c0098v0.b() && S0.O.c(vVar.f9125b) && z5) {
                    c0626q.b0(-707487962);
                    C0545g c0545g = vVar.a;
                    S0.O o5 = new S0.O(vVar.f9125b);
                    boolean h3 = c0626q.h(mVar);
                    Object P6 = c0626q.P();
                    if (h3 || P6 == obj6) {
                        P6 = new K0(mVar, null);
                        c0626q.m0(P6);
                    }
                    T.r.h(c0545g, o5, (l4.e) P6, c0626q);
                    boolean h6 = c0626q.h(mVar) | c0626q.h(obj5) | c0626q.f(vVar) | c0626q.h(c0098v0) | c0626q.f(n3);
                    Object P7 = c0626q.P();
                    if (h6 || P7 == obj6) {
                        Object j02 = new J0(mVar, obj5, vVar, c0098v0, n3, 0);
                        c0626q.m0(j02);
                        P7 = j02;
                    }
                    obj4 = l0.h.g(interfaceC1041r, (l4.c) P7);
                    c0626q.p(false);
                } else {
                    c0626q.b0(-705473241);
                    c0626q.p(false);
                    obj4 = C1038o.a;
                }
                c0626q.p(false);
                return obj4;
            case 1:
                List<LLMSetting> list = (List) this.f784e;
                String str = (String) this.f785f;
                l4.c cVar = (l4.c) this.f786g;
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f787h;
                C0626q c0626q2 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                C1813t a = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
                int hashCode = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l3 = c0626q2.l();
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, C1038o.a);
                InterfaceC0152h.a.getClass();
                C0148f c0148f = C0150g.f1924b;
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, a, C0150g.f1928f);
                T.r.G(c0626q2, l3, C0150g.f1927e);
                T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                T.r.C(c0626q2, C0150g.f1930h);
                T.r.G(c0626q2, c6, C0150g.f1926d);
                c0626q2.b0(495308237);
                for (LLMSetting lLMSetting : list) {
                    boolean b5 = AbstractC1276k.b(lLMSetting.a, str);
                    boolean f6 = c0626q2.f(lLMSetting) | c0626q2.f(cVar) | c0626q2.f(interfaceC1193a);
                    Object P8 = c0626q2.P();
                    if (f6 || P8 == C0616l.a) {
                        P8 = new A.g(lLMSetting, cVar, interfaceC1193a, 5);
                        c0626q2.m0(P8);
                    }
                    AbstractC0530j.d(lLMSetting, b5, (InterfaceC1193a) P8, c0626q2, 0);
                }
                c0626q2.p(false);
                c0626q2.p(true);
                return X3.y.a;
            case 2:
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) this.f784e;
                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) this.f785f;
                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) this.f786g;
                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) this.f787h;
                C0626q c0626q3 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q3.S(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC0783w.O(Y4.l.I(new Z2.f1(R.drawable.cloud, h5.e.j0(R.string.settings_model_services, c0626q3), h5.e.j0(R.string.settings_model_services_subtitle, c0626q3), interfaceC1193a2, 8), new Z2.f1(R.drawable.lucide_bot, h5.e.j0(R.string.settings_model_config, c0626q3), h5.e.j0(R.string.settings_model_config_subtitle, c0626q3), interfaceC1193a3, 8), new Z2.f1(R.drawable.search, h5.e.j0(R.string.settings_search_services, c0626q3), h5.e.j0(R.string.settings_search_services_subtitle, c0626q3), interfaceC1193a4, 8), new Z2.f1(R.drawable.terminal, h5.e.j0(R.string.settings_mcp, c0626q3), h5.e.j0(R.string.settings_mcp_subtitle, c0626q3), interfaceC1193a5, 8)), null, c0626q3, 0);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 3:
                String str2 = (String) this.f784e;
                String str3 = (String) this.f785f;
                T.X x5 = (T.X) this.f786g;
                T.X x6 = (T.X) this.f787h;
                C0626q c0626q4 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q4.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String j03 = h5.e.j0(R.string.settings_theme_mode, c0626q4);
                    Object P9 = c0626q4.P();
                    C0602e c0602e = C0616l.a;
                    if (P9 == c0602e) {
                        P9 = new C(x5, 25);
                        c0626q4.m0(P9);
                    }
                    Z2.f1 f1Var = new Z2.f1(R.drawable.ic_contrast, j03, str2, (InterfaceC1193a) P9, 8);
                    String j04 = h5.e.j0(R.string.settings_language, c0626q4);
                    Object P10 = c0626q4.P();
                    if (P10 == c0602e) {
                        P10 = new C(x6, 26);
                        c0626q4.m0(P10);
                    }
                    AbstractC0783w.O(Y4.l.I(f1Var, new Z2.f1(R.drawable.language, j04, str3, (InterfaceC1193a) P10, 8)), null, c0626q4, 0);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            default:
                l4.e eVar = (l4.e) this.f784e;
                C1492d c1492d = (C1492d) this.f785f;
                l4.f fVar = (l4.f) this.f786g;
                InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) this.f787h;
                C1491c c1491c = (C1491c) obj;
                C0626q c0626q5 = (C0626q) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c0626q5.f(c1491c) ? 4 : 2;
                }
                if (c0626q5.S(intValue3 & 1, (intValue3 & 19) != 18)) {
                    String str4 = (String) eVar.m(c0626q5, 0);
                    if (AbstractC1776n.Q(str4)) {
                        AbstractC1734b.c("Label must not be blank");
                    }
                    c1492d.getClass();
                    AbstractC1490b.a.j(str4, Boolean.TRUE, c1491c, fVar, interfaceC1193a6, c0626q5, Integer.valueOf((intValue3 << 9) & 7168));
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ I0(l4.e eVar, C1492d c1492d, l4.f fVar, InterfaceC1193a interfaceC1193a) {
        this.f783c = 4;
        this.f784e = eVar;
        this.f785f = c1492d;
        this.f786g = fVar;
        this.f787h = interfaceC1193a;
    }
}
