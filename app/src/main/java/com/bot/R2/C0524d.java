package R2;

import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import P2.C0348d;
import Q.A0;
import Q.M1;
import Q.N;
import Q.O;
import Q.R1;
import Q.f3;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.e1;
import Z2.AbstractC0783w;
import b0.AbstractC0874g;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import p.AbstractC1464z;
import t0.AbstractC1688b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.o0;
import v.p0;
import v.q0;
import v.t0;
import y2.AbstractC1992b;

/* renamed from: R2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0524d implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6926c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6928f;

    public /* synthetic */ C0524d(InterfaceC1193a interfaceC1193a, boolean z5, int i6) {
        this.f6926c = i6;
        this.f6928f = interfaceC1193a;
        this.f6927e = z5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        long c6;
        switch (this.f6926c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    final boolean z5 = this.f6927e;
                    final int i6 = 0;
                    R1.o(this.f6928f, null, !z5, null, null, null, AbstractC0874g.c(-259153375, new l4.f() { // from class: R2.c
                        @Override // l4.f
                        public final Object d(Object obj3, Object obj4, Object obj5) {
                            switch (i6) {
                                case 0:
                                    C0626q c0626q2 = (C0626q) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    AbstractC1276k.f((q0) obj3, "$this$TextButton");
                                    if (!c0626q2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        c0626q2.V();
                                    } else if (z5) {
                                        c0626q2.b0(1913058858);
                                        p0 a = o0.a(AbstractC1799h.g(8), C1026c.f11796n, c0626q2, 54);
                                        int hashCode = Long.hashCode(c0626q2.f8164T);
                                        InterfaceC0617l0 l3 = c0626q2.l();
                                        C1038o c1038o = C1038o.a;
                                        InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c1038o);
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
                                        T.r.G(c0626q2, c7, C0150g.f1926d);
                                        long j3 = o0.s.f13478e;
                                        M1.a(t0.j(c1038o, 16), j3, 2, 0L, 0, S.l.f7374V, c0626q2, 438, 56);
                                        f3.b(h5.e.j0(R.string.chat_delete_in_progress, c0626q2), null, o0.s.c(0.7f, j3), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 384, 0, 262138);
                                        c0626q2.p(true);
                                        c0626q2.p(false);
                                    } else {
                                        c0626q2.b0(1913735309);
                                        f3.b(h5.e.j0(R.string.button_delete, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                                        c0626q2.p(false);
                                    }
                                    return X3.y.a;
                                default:
                                    C0626q c0626q3 = (C0626q) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    AbstractC1276k.f((q0) obj3, "$this$TextButton");
                                    if (!c0626q3.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        c0626q3.V();
                                    } else if (z5) {
                                        c0626q3.b0(112851617);
                                        M1.a(t0.j(C1038o.a, 16), 0L, 2, 0L, 0, S.l.f7374V, c0626q3, 390, 58);
                                        c0626q3.p(false);
                                    } else {
                                        c0626q3.b0(113040841);
                                        f3.b(h5.e.j0(R.string.button_delete, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                                        c0626q3.p(false);
                                    }
                                    return X3.y.a;
                            }
                        }
                    }, c0626q), c0626q, 805306368, 506);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0530j.e(this.f6927e, this.f6928f, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 2:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    R1.o(this.f6928f, null, !this.f6927e, null, null, null, AbstractC0783w.f10413d, c0626q2, 805306368, 506);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 3:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    InterfaceC1041r j3 = t0.j(C1038o.a, d3.b.a);
                    e1 e1Var = O.a;
                    long j4 = ((N) c0626q3.j(e1Var)).f5431u;
                    C.d dVar = C.e.a;
                    InterfaceC1041r c7 = l0.h.c(AbstractC1464z.f(j3, j4, dVar), dVar);
                    InterfaceC1193a interfaceC1193a = this.f6928f;
                    boolean f6 = c0626q3.f(interfaceC1193a);
                    Object P5 = c0626q3.P();
                    if (f6 || P5 == C0616l.a) {
                        P5 = new C0348d(23, interfaceC1193a);
                        c0626q3.m0(P5);
                    }
                    boolean z6 = this.f6927e;
                    InterfaceC1041r a = AbstractC1992b.a(29, c7, (InterfaceC1193a) P5, z6);
                    V d6 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode = Long.hashCode(c0626q3.f8164T);
                    InterfaceC0617l0 l3 = c0626q3.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q3, a);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q3.f0();
                    if (c0626q3.f8163S) {
                        c0626q3.k(c0148f);
                    } else {
                        c0626q3.p0();
                    }
                    T.r.G(c0626q3, d6, C0150g.f1928f);
                    T.r.G(c0626q3, l3, C0150g.f1927e);
                    T.r.x(c0626q3, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q3, C0150g.f1930h);
                    T.r.G(c0626q3, c8, C0150g.f1926d);
                    AbstractC1688b L5 = Y3.C.L(R.drawable.check, 0, c0626q3);
                    String j02 = h5.e.j0(R.string.model_config_save, c0626q3);
                    if (z6) {
                        c0626q3.b0(62074249);
                        c6 = ((N) c0626q3.j(e1Var)).f5427q;
                        c0626q3.p(false);
                    } else {
                        c0626q3.b0(62171062);
                        c6 = o0.s.c(0.4f, ((N) c0626q3.j(e1Var)).f5427q);
                        c0626q3.p(false);
                    }
                    A0.a(L5, j02, null, c6, c0626q3, 8, 4);
                    c0626q3.p(true);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 4:
                C0626q c0626q4 = (C0626q) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    final boolean z7 = this.f6927e;
                    final int i7 = 1;
                    R1.o(this.f6928f, null, !z7, null, null, null, AbstractC0874g.c(-1427567163, new l4.f() { // from class: R2.c
                        @Override // l4.f
                        public final Object d(Object obj3, Object obj4, Object obj5) {
                            switch (i7) {
                                case 0:
                                    C0626q c0626q22 = (C0626q) obj4;
                                    int intValue22 = ((Integer) obj5).intValue();
                                    AbstractC1276k.f((q0) obj3, "$this$TextButton");
                                    if (!c0626q22.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        c0626q22.V();
                                    } else if (z7) {
                                        c0626q22.b0(1913058858);
                                        p0 a6 = o0.a(AbstractC1799h.g(8), C1026c.f11796n, c0626q22, 54);
                                        int hashCode2 = Long.hashCode(c0626q22.f8164T);
                                        InterfaceC0617l0 l32 = c0626q22.l();
                                        C1038o c1038o = C1038o.a;
                                        InterfaceC1041r c72 = AbstractC1024a.c(c0626q22, c1038o);
                                        InterfaceC0152h.a.getClass();
                                        C0148f c0148f2 = C0150g.f1924b;
                                        c0626q22.f0();
                                        if (c0626q22.f8163S) {
                                            c0626q22.k(c0148f2);
                                        } else {
                                            c0626q22.p0();
                                        }
                                        T.r.G(c0626q22, a6, C0150g.f1928f);
                                        T.r.G(c0626q22, l32, C0150g.f1927e);
                                        T.r.x(c0626q22, Integer.valueOf(hashCode2), C0150g.f1929g);
                                        T.r.C(c0626q22, C0150g.f1930h);
                                        T.r.G(c0626q22, c72, C0150g.f1926d);
                                        long j32 = o0.s.f13478e;
                                        M1.a(t0.j(c1038o, 16), j32, 2, 0L, 0, S.l.f7374V, c0626q22, 438, 56);
                                        f3.b(h5.e.j0(R.string.chat_delete_in_progress, c0626q22), null, o0.s.c(0.7f, j32), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 384, 0, 262138);
                                        c0626q22.p(true);
                                        c0626q22.p(false);
                                    } else {
                                        c0626q22.b0(1913735309);
                                        f3.b(h5.e.j0(R.string.button_delete, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                                        c0626q22.p(false);
                                    }
                                    return X3.y.a;
                                default:
                                    C0626q c0626q32 = (C0626q) obj4;
                                    int intValue32 = ((Integer) obj5).intValue();
                                    AbstractC1276k.f((q0) obj3, "$this$TextButton");
                                    if (!c0626q32.S(intValue32 & 1, (intValue32 & 17) != 16)) {
                                        c0626q32.V();
                                    } else if (z7) {
                                        c0626q32.b0(112851617);
                                        M1.a(t0.j(C1038o.a, 16), 0L, 2, 0L, 0, S.l.f7374V, c0626q32, 390, 58);
                                        c0626q32.p(false);
                                    } else {
                                        c0626q32.b0(113040841);
                                        f3.b(h5.e.j0(R.string.button_delete, c0626q32), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q32, 0, 0, 262142);
                                        c0626q32.p(false);
                                    }
                                    return X3.y.a;
                            }
                        }
                    }, c0626q4), c0626q4, 805306368, 506);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q5 = (C0626q) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    R1.o(this.f6928f, null, !this.f6927e, null, null, null, AbstractC0783w.f10405X, c0626q5, 805306368, 506);
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0524d(boolean z5, InterfaceC1193a interfaceC1193a) {
        this.f6926c = 3;
        this.f6927e = z5;
        this.f6928f = interfaceC1193a;
    }

    public /* synthetic */ C0524d(boolean z5, InterfaceC1193a interfaceC1193a, int i6) {
        this.f6926c = 1;
        this.f6927e = z5;
        this.f6928f = interfaceC1193a;
    }
}
