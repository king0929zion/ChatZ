package R2;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import T.d1;
import X2.C0692g;
import b0.AbstractC0874g;
import com.bot.core.model.ConversationInfo;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.LinkedHashMap;
import java.util.List;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1244z;
import m.C1197D;
import m.C1204K;
import m.C1211S;
import m.C1212T;
import m.C1217Y;
import m.b0;
import m.d0;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.D0;
import n.E0;
import v.AbstractC1799h;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;
import w0.InterfaceC1830a;
import x.C1851b;

/* loaded from: classes.dex */
public final class y implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f7063c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f7064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X2.L f7066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f7067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f7068i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1830a f7069j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f7070k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d1 f7071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f7072m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X f7073n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X f7074o;

    public y(List list, X x5, String str, X2.L l3, InterfaceC1193a interfaceC1193a, C0692g c0692g, InterfaceC1830a interfaceC1830a, X x6, d1 d1Var, X x7, X x8, X x9) {
        this.f7063c = list;
        this.f7064e = x5;
        this.f7065f = str;
        this.f7066g = l3;
        this.f7067h = interfaceC1193a;
        this.f7068i = c0692g;
        this.f7069j = interfaceC1830a;
        this.f7070k = x6;
        this.f7071l = d1Var;
        this.f7072m = x7;
        this.f7073n = x8;
        this.f7074o = x9;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        C1851b c1851b = (C1851b) obj;
        int intValue = ((Number) obj2).intValue();
        C0626q c0626q = (C0626q) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i6 = (c0626q.f(c1851b) ? 4 : 2) | intValue2;
        } else {
            i6 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i6 |= c0626q.d(intValue) ? 32 : 16;
        }
        if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
            ConversationInfo conversationInfo = (ConversationInfo) this.f7063c.get(intValue);
            c0626q.b0(309100770);
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
            boolean z5 = !AbstractC1276k.b((String) this.f7064e.getValue(), conversationInfo.a);
            D0 s5 = AbstractC1318d.s(300, 6, null);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = u.f7037c;
                c0626q.m0(P5);
            }
            E0 e02 = AbstractC1205L.a;
            AbstractC1244z.b(C1814u.a, z5, null, null, new C1211S(new d0((C1212T) null, new b0(new C1204K((l4.c) P5, 1), s5), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125)).a(AbstractC1205L.c(AbstractC1318d.s(300, 6, null), 2)), null, AbstractC0874g.c(-1559301863, new x(conversationInfo, this.f7065f, this.f7066g, this.f7067h, this.f7068i, this.f7069j, this.f7070k, this.f7071l, this.f7064e, this.f7072m, this.f7073n, this.f7074o), c0626q), c0626q, 1572870, 22);
            c0626q.p(true);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
