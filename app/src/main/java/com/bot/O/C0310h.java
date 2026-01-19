package O;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.f3;
import Q.t3;
import Q.u3;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import b3.AbstractC0888d;
import com.bot.core.model.LLMSetting;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import o0.C1400k;
import p.AbstractC1464z;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.C1814u;
import w.AbstractC1829a;

/* renamed from: O.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0310h implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4124c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4126f;

    public /* synthetic */ C0310h(Object obj, boolean z5, int i6) {
        this.f4124c = i6;
        this.f4126f = obj;
        this.f4125e = z5;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.f4124c) {
            case 0:
                final InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f4126f;
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q.b0(-196777734);
                final long j3 = ((T0) c0626q.j(U0.a)).a;
                boolean e6 = c0626q.e(j3) | c0626q.f(interfaceC1193a);
                final boolean z5 = this.f4125e;
                boolean g3 = e6 | c0626q.g(z5);
                Object P5 = c0626q.P();
                if (g3 || P5 == C0616l.a) {
                    P5 = new l4.c() { // from class: O.i
                        @Override // l4.c
                        public final Object f(Object obj4) {
                            l0.d dVar = (l0.d) obj4;
                            return dVar.b(new C0296a(interfaceC1193a, z5, AbstractC0336u0.q(dVar, Float.intBitsToFloat((int) (dVar.f12643c.c() >> 32)) / 2.0f), new C1400k(j3, 5)));
                        }
                    };
                    c0626q.m0(P5);
                }
                InterfaceC1041r f6 = l0.h.f(interfaceC1041r, (l4.c) P5);
                c0626q.p(false);
                return f6;
            default:
                LLMSetting lLMSetting = (LLMSetting) this.f4126f;
                String str2 = lLMSetting.f11197b;
                C0626q c0626q2 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$Card");
                if (c0626q2.S(intValue & 1, (intValue & 17) != 16)) {
                    InterfaceC1041r z6 = AbstractC1787b.z(v.t0.a, 16, 14);
                    v.p0 a = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q2, 48);
                    int hashCode = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l3 = c0626q2.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, z6);
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
                    String str3 = lLMSetting.a;
                    if (AbstractC1776n.Q(str2)) {
                        str = str3 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str3;
                    } else {
                        str = str2;
                    }
                    AbstractC0888d.b(40, 384, c0626q2, null, str, lLMSetting.f11206k);
                    C1038o c1038o = C1038o.a;
                    AbstractC1787b.h(c0626q2, v.t0.n(c1038o, 12));
                    if (AbstractC1776n.Q(str2)) {
                        str2 = str3 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str3;
                    }
                    S0.P p5 = ((t3) c0626q2.j(u3.a)).f6127h;
                    long j4 = ((Q.N) c0626q2.j(Q.O.a)).f5427q;
                    if (1.0f <= 0.0d) {
                        AbstractC1829a.a("invalid weight; must be greater than zero");
                    }
                    f3.b(str2, new v.Z(1.0f, true), j4, 0L, null, 0L, null, 0L, 2, false, 1, 0, p5, c0626q2, 0, 24960, 110584);
                    if (this.f4125e) {
                        c0626q2.b0(-2098081840);
                        float f7 = 8;
                        AbstractC1787b.h(c0626q2, v.t0.n(c1038o, f7));
                        AbstractC1806l.a(AbstractC1464z.f(v.t0.j(c1038o, f7), o0.y.d(4281648985L), C.e.a), c0626q2, 0);
                    } else {
                        c0626q2.b0(-2115890162);
                    }
                    c0626q2.p(false);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
