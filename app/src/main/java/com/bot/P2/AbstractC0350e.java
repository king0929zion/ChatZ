package P2;

import D.C0072i;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import p.AbstractC1464z;
import v.AbstractC1806l;
import y2.AbstractC1992b;

/* renamed from: P2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0350e {
    public static final float a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4914b = 80;

    /* renamed from: c, reason: collision with root package name */
    public static final float f4915c = 150;

    /* renamed from: d, reason: collision with root package name */
    public static final float f4916d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final float f4917e = 24;

    /* renamed from: f, reason: collision with root package name */
    public static final float f4918f = 16;

    public static final void a(InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        AbstractC1276k.f(interfaceC1193a, "onClick");
        c0626q.d0(69410375);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            long j3 = o0.s.f13477d;
            long c6 = o0.s.c(0.9f, o0.s.f13475b);
            InterfaceC1041r f6 = AbstractC1464z.f(l0.h.c(v.t0.j(interfaceC1041r, f4917e), C.e.a), j3, o0.y.f13496b);
            boolean z5 = (i7 & 112) == 32;
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new C0348d(0, interfaceC1193a);
                c0626q.m0(P5);
            }
            InterfaceC1041r a6 = AbstractC1992b.a(15, f6, (InterfaceC1193a) P5, false);
            F0.V d6 = AbstractC1806l.d(C1026c.f11790h, false);
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
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c7, C0150g.f1926d);
            Q.A0.a(Y3.C.L(R.drawable.close_rounded, 0, c0626q), h5.e.j0(R.string.button_delete, c0626q), v.t0.j(C1038o.a, f4918f), c6, c0626q, 3464, 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 1, interfaceC1041r, interfaceC1193a);
        }
    }
}
