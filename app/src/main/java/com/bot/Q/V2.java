package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.C0873f;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import p.C1417G;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public final class V2 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5551c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0.L f5552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f5554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1417G f5555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f5556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0873f f5557j;

    public V2(InterfaceC1041r interfaceC1041r, o0.L l3, long j3, float f6, C1417G c1417g, float f7, C0873f c0873f) {
        this.f5551c = interfaceC1041r;
        this.f5552e = l3;
        this.f5553f = j3;
        this.f5554g = f6;
        this.f5555h = c1417g;
        this.f5556i = f7;
        this.f5557j = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        boolean S5 = c0626q.S(intValue & 1, (intValue & 3) != 2);
        X3.y yVar = X3.y.a;
        if (!S5) {
            c0626q.V();
            return yVar;
        }
        InterfaceC1041r c6 = X2.c(this.f5551c, this.f5552e, X2.d(this.f5553f, this.f5554g, c0626q), this.f5555h, ((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).e0(this.f5556i));
        Object P5 = c0626q.P();
        C0602e c0602e = C0616l.a;
        if (P5 == c0602e) {
            P5 = new P2.D0(9);
            c0626q.m0(P5);
        }
        InterfaceC1041r a = P0.n.a(c6, false, (l4.c) P5);
        Object P6 = c0626q.P();
        if (P6 == c0602e) {
            P6 = U2.a;
            c0626q.m0(P6);
        }
        InterfaceC1041r a6 = B0.Q.a(a, yVar, (PointerInputEventHandler) P6);
        F0.V d6 = AbstractC1806l.d(C1026c.f11786c, true);
        int hashCode = Long.hashCode(c0626q.f8164T);
        InterfaceC0617l0 l3 = c0626q.l();
        InterfaceC1041r c7 = AbstractC1024a.c(c0626q, a6);
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
        C0146e c0146e = C0150g.f1929g;
        if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
            B3.e.v(hashCode, c0626q, hashCode, c0146e);
        }
        T.r.G(c0626q, c7, C0150g.f1926d);
        this.f5557j.m(c0626q, 0);
        c0626q.p(true);
        return yVar;
    }
}
