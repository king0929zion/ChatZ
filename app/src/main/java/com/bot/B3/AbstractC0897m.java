package b3;

import B0.Q;
import D.Q0;
import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import O.C0319l0;
import O.J;
import Q.C0448o1;
import Q.R1;
import Q.f3;
import S2.Y;
import T.B;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import X3.y;
import Y3.C;
import Z2.C0782v0;
import Z2.K0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.AbstractC0874g;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import io.ktor.utils.io.u;
import java.util.List;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1244z;
import m4.AbstractC1276k;
import o0.s;
import p.AbstractC1464z;
import v.AbstractC1787b;
import v.AbstractC1806l;
import v.C1810p;
import v.C1818y;
import v.t0;
import z.C2004b;
import z.H;

/* renamed from: b3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0897m {
    public static final B a = new B(new C0782v0(10));

    public static final void a(C0898n c0898n, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        AbstractC1276k.f(c0898n, "state");
        AbstractC1276k.f(interfaceC1193a, "onDismiss");
        c0626q.d0(1614711812);
        int i7 = (c0626q.h(c0898n) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            AbstractC1244z.c(c0898n.a && !c0898n.f11044b.isEmpty(), null, AbstractC1205L.b(null, 3), AbstractC1205L.c(null, 3), null, AbstractC0874g.c(-1481463252, new Q0(11, c0898n, interfaceC1193a), c0626q), c0626q, 200064, 18);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 18, c0898n, interfaceC1193a);
        }
    }

    public static final void b(final List list, final int i6, l4.c cVar, final InterfaceC1193a interfaceC1193a, C0626q c0626q, final int i7) {
        final l4.c cVar2;
        C0627q0 t5;
        l4.e eVar;
        int i8;
        boolean z5;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(list, "images");
        AbstractC1276k.f(interfaceC1193a, "onDismiss");
        c0626q2.d0(173449937);
        int i9 = i7 | (c0626q2.h(list) ? 4 : 2) | (c0626q2.d(i6) ? 32 : 16) | 384 | (c0626q2.h(interfaceC1193a) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q2.S(i9 & 1, (i9 & 1171) != 1170)) {
            Object P5 = c0626q2.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new Y(22);
                c0626q2.m0(P5);
            }
            final l4.c cVar3 = (l4.c) P5;
            if (list.isEmpty()) {
                interfaceC1193a.b();
                t5 = c0626q2.t();
                if (t5 != null) {
                    final int i10 = 0;
                    eVar = new l4.e(list, i6, cVar3, interfaceC1193a, i7, i10) { // from class: b3.f

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f11025c;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ List f11026e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f11027f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ l4.c f11028g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC1193a f11029h; {
                            this.f11025c = i10;
                        }

                        @Override // l4.e
                        public final Object m(Object obj, Object obj2) {
                            switch (this.f11025c) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int J4 = T.r.J(1);
                                    AbstractC0897m.b(this.f11026e, this.f11027f, this.f11028g, this.f11029h, (C0626q) obj, J4);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int J5 = T.r.J(1);
                                    AbstractC0897m.b(this.f11026e, this.f11027f, this.f11028g, this.f11029h, (C0626q) obj, J5);
                                    break;
                            }
                            return y.a;
                        }
                    };
                    t5.f8193d = eVar;
                }
                return;
            }
            int i11 = i9 & 7168;
            boolean z6 = i11 == 2048;
            Object P6 = c0626q2.P();
            if (z6 || P6 == c0602e) {
                P6 = new K0(5, interfaceC1193a);
                c0626q2.m0(P6);
            }
            C.a(false, (InterfaceC1193a) P6, c0626q2, 0, 1);
            final int size = list.size();
            int f6 = AbstractC1117a.f(i6, 0, size - 1);
            boolean d6 = c0626q2.d(size);
            Object P7 = c0626q2.P();
            if (d6 || P7 == c0602e) {
                P7 = new InterfaceC1193a() { // from class: b3.g
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        return Integer.valueOf(size);
                    }
                };
                c0626q2.m0(P7);
            }
            InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P7;
            float f7 = H.a;
            Object[] objArr = new Object[0];
            e0.k kVar = C2004b.f16081J;
            boolean d7 = c0626q2.d(f6) | c0626q2.c(S.l.f7374V) | c0626q2.f(interfaceC1193a2);
            Object P8 = c0626q2.P();
            if (d7 || P8 == c0602e) {
                P8 = new J(f6, interfaceC1193a2);
                c0626q2.m0(P8);
            }
            C2004b c2004b = (C2004b) e0.l.c(objArr, kVar, (InterfaceC1193a) P8, c0626q2, 0);
            c2004b.f16082I.setValue(interfaceC1193a2);
            boolean f8 = c0626q2.f(c2004b);
            Object P9 = c0626q2.P();
            if (f8 || P9 == c0602e) {
                P9 = new C0894j(c2004b, cVar3, null);
                c0626q2.m0(P9);
            }
            T.r.f(c0626q2, c2004b, (l4.e) P9);
            C1818y c1818y = t0.f15349c;
            InterfaceC1041r f9 = AbstractC1464z.f(c1818y, s.f13475b, o0.y.f13496b);
            boolean z7 = i11 == 2048;
            Object P10 = c0626q2.P();
            if (z7 || P10 == c0602e) {
                i8 = 1;
                P10 = new C0448o1(i8, interfaceC1193a);
                c0626q2.m0(P10);
            } else {
                i8 = 1;
            }
            InterfaceC1041r a6 = Q.a(f9, y.a, (PointerInputEventHandler) P10);
            V d8 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, a6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, d8, C0150g.f1928f);
            T.r.G(c0626q2, l3, C0150g.f1927e);
            T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q2, C0150g.f1930h);
            T.r.G(c0626q2, c6, C0150g.f1926d);
            C1810p c1810p = C1810p.f15333b;
            int i12 = i8;
            u.a(c2004b, c1818y, null, null, S.l.f7374V, null, null, false, null, null, null, AbstractC0874g.c(1785529816, new C0319l0(list, 3), c0626q2), c0626q2, 48);
            C1033j c1033j = C1026c.f11788f;
            C1038o c1038o = C1038o.a;
            R1.g(interfaceC1193a, AbstractC1787b.C(c1810p.e(c1038o, c1033j), S.l.f7374V, 40, 16, S.l.f7374V, 9), false, null, null, AbstractC0888d.f11024c, c0626q, ((i9 >> 9) & 14) | 1572864, 60);
            c0626q2 = c0626q;
            if (list.size() > i12) {
                c0626q2.b0(-563642930);
                f3.b((c2004b.f16051d.f16172b.g() + i12) + " / " + list.size(), AbstractC1787b.C(c1810p.e(c1038o, C1026c.f11793k), S.l.f7374V, S.l.f7374V, S.l.f7374V, 32, 7), s.f13477d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 384, 0, 262136);
                c0626q2 = c0626q;
                z5 = false;
            } else {
                z5 = false;
                c0626q2.b0(-571395317);
            }
            c0626q2.p(z5);
            c0626q2.p(true);
            cVar2 = cVar3;
        } else {
            c0626q2.V();
            cVar2 = cVar;
        }
        t5 = c0626q2.t();
        if (t5 != null) {
            final int i13 = 1;
            eVar = new l4.e(list, i6, cVar2, interfaceC1193a, i7, i13) { // from class: b3.f

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f11025c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f11026e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f11027f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l4.c f11028g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f11029h; {
                    this.f11025c = i13;
                }

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    switch (this.f11025c) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int J4 = T.r.J(1);
                            AbstractC0897m.b(this.f11026e, this.f11027f, this.f11028g, this.f11029h, (C0626q) obj, J4);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int J5 = T.r.J(1);
                            AbstractC0897m.b(this.f11026e, this.f11027f, this.f11028g, this.f11029h, (C0626q) obj, J5);
                            break;
                    }
                    return y.a;
                }
            };
            t5.f8193d = eVar;
        }
    }
}
