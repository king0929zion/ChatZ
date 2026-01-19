package I;

import D.C0103y;
import F0.AbstractC0137z;
import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.C0405d2;
import R2.AbstractC0530j;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import X3.y;
import b0.C0873f;
import com.bot.core.model.ConversationInfo;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2115c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f2116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2118g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X3.e f2119h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2120i;

    public /* synthetic */ s(ConversationInfo conversationInfo, C0405d2 c0405d2, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, InterfaceC1193a interfaceC1193a3, int i6) {
        this.f2117f = conversationInfo;
        this.f2118g = c0405d2;
        this.f2116e = interfaceC1193a;
        this.f2119h = interfaceC1193a2;
        this.f2120i = interfaceC1193a3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f2115c) {
            case 0:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) this.f2117f;
                X x5 = (X) this.f2118g;
                C0873f c0873f = (C0873f) this.f2119h;
                K.c cVar = (K.c) this.f2120i;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    Object P5 = c0626q.P();
                    if (P5 == C0616l.a) {
                        P5 = new C0103y(x5, 4);
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
                    T.r.G(c0626q, d6, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q, C0150g.f1930h);
                    T.r.G(c0626q, c6, C0150g.f1926d);
                    c0873f.m(c0626q, 0);
                    cVar.b(this.f2116e, c0626q, 6);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return y.a;
            default:
                ((Integer) obj2).getClass();
                AbstractC0530j.b((ConversationInfo) this.f2117f, (C0405d2) this.f2118g, this.f2116e, (InterfaceC1193a) this.f2119h, (InterfaceC1193a) this.f2120i, (C0626q) obj, T.r.J(28041));
                return y.a;
        }
    }

    public /* synthetic */ s(InterfaceC1041r interfaceC1041r, X x5, C0873f c0873f, K.c cVar, InterfaceC1193a interfaceC1193a) {
        this.f2117f = interfaceC1041r;
        this.f2118g = x5;
        this.f2119h = c0873f;
        this.f2120i = cVar;
        this.f2116e = interfaceC1193a;
    }
}
