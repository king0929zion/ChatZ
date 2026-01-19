package U2;

import B4.D;
import D.C;
import D.C0062d;
import D.C0086p;
import D.C0103y;
import D.b1;
import F0.AbstractC0137z;
import F0.V;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import M2.C0250a;
import O.B;
import Q.A0;
import Q.AbstractC0452p1;
import Q.C0405d2;
import Q.M1;
import Q.N;
import Q.O;
import Q.f3;
import S0.P;
import S2.AbstractC0565e;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.W0;
import T.X;
import T.d1;
import T.e1;
import T.r;
import X3.y;
import b0.AbstractC0874g;
import b0.C0873f;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1031h;
import h0.C1032i;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import i4.AbstractC1118b;
import j1.AbstractC1135a;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1244z;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.AbstractC1350y;
import n.C1297F;
import n.EnumC1310T;
import o0.C1381C;
import o0.C1386H;
import o0.s;
import p.AbstractC1464z;
import t0.AbstractC1688b;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1789c;
import v.C1795f;
import v.C1813t;
import v.C1814u;
import v.C1818y;
import v.Z;
import v.o0;
import v.p0;
import v.t0;
import w.AbstractC1829a;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public abstract class a {
    public static final C0873f a = new C0873f(new B(2), false, -186627927);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f8606b = new C0873f(new B(3), false, 358992056);

    public static final void a(d1 d1Var, long j3, C0626q c0626q, int i6) {
        d1 d1Var2;
        int i7;
        C0627q0 t5;
        c cVar;
        String str;
        String n3;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(-1057747068);
        if ((i6 & 6) == 0) {
            d1Var2 = d1Var;
            i7 = i6 | (c0626q2.f(d1Var2) ? 4 : 2);
        } else {
            d1Var2 = d1Var;
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q2.e(j3) ? 32 : 16;
        }
        if (c0626q2.S(i7 & 1, (i7 & 19) != 18)) {
            Long l3 = (Long) d1Var2.getValue();
            c0626q2.b0(859477863);
            if (l3 == null || (n3 = n(l3.longValue())) == null) {
                c0626q2.p(false);
                str = null;
            } else {
                str = h5.e.k0(R.string.reasoning_time_suffix, new Object[]{n3}, c0626q2);
                c0626q2.p(false);
            }
            if (str == null) {
                t5 = c0626q2.t();
                if (t5 != null) {
                    cVar = new c(d1Var2, j3, i6, 0);
                    t5.f8193d = cVar;
                }
                return;
            }
            InterfaceC1041r o5 = t0.o(56, S.l.f7374V, 2, C1038o.a);
            V d6 = AbstractC1806l.d(C1026c.f11789g, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, o5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, d6, C0150g.f1928f);
            r.G(c0626q2, l5, C0150g.f1927e);
            r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q2, C0150g.f1930h);
            r.G(c0626q2, c6, C0150g.f1926d);
            f3.b(str, null, s.c(0.9f, j3), 0L, null, 0L, null, 0L, 0, false, 1, 0, new P(0L, s4.j.z(16), W0.k.f8835i, null, 0L, 0, 0L, 16777145), c0626q, 0, 12610560, 106490);
            c0626q2 = c0626q;
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        t5 = c0626q2.t();
        if (t5 != null) {
            cVar = new c(d1Var, j3, i6, 1);
            t5.f8193d = cVar;
        }
    }

    public static final void b(final String str, final List list, final InterfaceC1041r interfaceC1041r, final boolean z5, final L2.e eVar, final Long l3, final Long l5, C0626q c0626q, final int i6) {
        C0626q c0626q2;
        C0627q0 t5;
        l4.e eVar2;
        int i7;
        int i8;
        long j3;
        X x5;
        long j4;
        String str2;
        int i9;
        boolean z6;
        boolean z7;
        AbstractC1276k.f(str, "messageId");
        AbstractC1276k.f(list, "reasoningContent");
        c0626q.d0(-532948760);
        int i10 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.h(list) ? 32 : 16) | (c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.d(eVar == null ? -1 : eVar.ordinal()) ? 16384 : 8192) | (c0626q.f(l3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.f(l5) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT);
        if (c0626q.S(i10 & 1, (599187 & i10) != 599186)) {
            boolean f6 = c0626q.f(list);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            Object obj = P5;
            if (f6 || P5 == c0602e) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                c0626q.m0(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            if (list2.isEmpty()) {
                t5 = c0626q.t();
                if (t5 != null) {
                    final int i11 = 0;
                    eVar2 = new l4.e(str, list, interfaceC1041r, z5, eVar, l3, l5, i6, i11) { // from class: U2.b

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f8607c;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ String f8608e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ List f8609f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC1041r f8610g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ boolean f8611h;

                        /* renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ L2.e f8612i;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ Long f8613j;

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ Long f8614k;

                        {
                            this.f8607c = i11;
                        }

                        @Override // l4.e
                        public final Object m(Object obj3, Object obj4) {
                            switch (this.f8607c) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int J4 = r.J(385);
                                    a.b(this.f8608e, this.f8609f, this.f8610g, this.f8611h, this.f8612i, this.f8613j, this.f8614k, (C0626q) obj3, J4);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int J5 = r.J(385);
                                    a.b(this.f8608e, this.f8609f, this.f8610g, this.f8611h, this.f8612i, this.f8613j, this.f8614k, (C0626q) obj3, J5);
                                    break;
                            }
                            return y.a;
                        }
                    };
                    t5.f8193d = eVar2;
                }
                return;
            }
            int i12 = i10 & 14;
            boolean z8 = i12 == 4;
            Object P6 = c0626q.P();
            if (z8 || P6 == c0602e) {
                P6 = r.A(Boolean.FALSE);
                c0626q.m0(P6);
            }
            X x6 = (X) P6;
            C0405d2 f7 = AbstractC0452p1.f(6, 2, c0626q);
            int i13 = ((i10 >> 12) & 896) | ((i10 >> 15) & 14) | ((i10 >> 6) & 112);
            Boolean valueOf = Boolean.valueOf(z5);
            boolean z9 = ((((i13 & 896) ^ 384) > 256 && c0626q.f(l5)) || (i13 & 384) == 256) | ((((i13 & 112) ^ 48) > 32 && c0626q.g(z5)) || (i13 & 48) == 32) | ((((i13 & 14) ^ 6) > 4 && c0626q.f(l3)) || (i13 & 6) == 4);
            Object P7 = c0626q.P();
            if (z9 || P7 == c0602e) {
                P7 = new h(z5, l3, l5, null);
                c0626q.m0(P7);
            }
            l4.e eVar3 = (l4.e) P7;
            Object P8 = c0626q.P();
            if (P8 == c0602e) {
                P8 = r.A(l5);
                c0626q.m0(P8);
            }
            X x7 = (X) P8;
            boolean h3 = c0626q.h(eVar3);
            Object P9 = c0626q.P();
            if (h3 || P9 == c0602e) {
                P9 = new W0(eVar3, x7, null);
                c0626q.m0(P9);
            }
            r.g(l3, valueOf, l5, (l4.e) P9, c0626q);
            L2.e eVar4 = L2.e.f3079j;
            L2.e eVar5 = L2.e.f3074e;
            if (eVar == eVar5) {
                i7 = -1453897030;
                i8 = R.string.reasoning_connecting;
            } else if (z5) {
                i7 = -1453894826;
                i8 = R.string.reasoning_active;
            } else if (eVar == L2.e.f3077h) {
                i7 = -1453891947;
                i8 = R.string.reasoning_error;
            } else if (eVar == L2.e.f3078i) {
                i7 = -1453889033;
                i8 = R.string.reasoning_stopped;
            } else if (eVar == eVar4) {
                i7 = -1453886024;
                i8 = R.string.reasoning_retrying;
            } else {
                i7 = -1453884105;
                i8 = R.string.reasoning_process;
            }
            String j5 = B3.e.j(c0626q, i7, i8, c0626q, false);
            int ordinal = eVar.ordinal();
            if (ordinal == 4) {
                c0626q.b0(124164945);
                j3 = ((N) c0626q.j(O.a)).f5433w;
                c0626q.p(false);
            } else if (ordinal != 5) {
                c0626q.b0(124169299);
                j3 = ((N) c0626q.j(O.a)).a;
                c0626q.p(false);
            } else {
                c0626q.b0(124167358);
                j3 = s.c(0.6f, ((N) c0626q.j(O.a)).f5427q);
                c0626q.p(false);
            }
            if (Y3.k.C0(new L2.e[]{eVar5, eVar4}).contains(eVar) || z5) {
                x5 = x7;
                j4 = j3;
                str2 = j5;
                i9 = i12;
                z6 = true;
            } else {
                x5 = x7;
                j4 = j3;
                str2 = j5;
                i9 = i12;
                z6 = false;
            }
            InterfaceC1041r c6 = interfaceC1041r.c(t0.a);
            String str3 = str2;
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l6 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, c6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            long j6 = j4;
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            r.G(c0626q, a6, C0150g.f1928f);
            r.G(c0626q, l6, C0150g.f1927e);
            r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q, C0150g.f1930h);
            r.G(c0626q, c7, C0150g.f1926d);
            boolean f8 = c0626q.f(x6);
            Object P10 = c0626q.P();
            if (f8 || P10 == c0602e) {
                P10 = new C(x6, 12);
                c0626q.m0(P10);
            }
            c0626q2 = c0626q;
            e(str, str3, j6, z6, x5, (InterfaceC1193a) P10, c0626q2, i9);
            c0626q2.p(true);
            if (((Boolean) x6.getValue()).booleanValue()) {
                c0626q2.b0(1419103092);
                boolean f9 = c0626q2.f(x6);
                Object P11 = c0626q2.P();
                if (f9 || P11 == c0602e) {
                    P11 = new C(x6, 13);
                    c0626q2.m0(P11);
                }
                AbstractC0452p1.a((InterfaceC1193a) P11, null, f7, S.l.f7374V, false, null, 0L, 0L, S.l.f7374V, 0L, null, null, null, AbstractC0874g.c(-1567445832, new D.W0(list2, z5, x5, 3), c0626q2), c0626q, 0);
                c0626q2 = c0626q;
                z7 = false;
            } else {
                z7 = false;
                c0626q2.b0(1414655770);
            }
            c0626q2.p(z7);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        t5 = c0626q2.t();
        if (t5 != null) {
            final int i14 = 1;
            eVar2 = new l4.e(str, list, interfaceC1041r, z5, eVar, l3, l5, i6, i14) { // from class: U2.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f8607c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f8608e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f8609f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f8610g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f8611h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ L2.e f8612i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Long f8613j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ Long f8614k;

                {
                    this.f8607c = i14;
                }

                @Override // l4.e
                public final Object m(Object obj3, Object obj4) {
                    switch (this.f8607c) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int J4 = r.J(385);
                            a.b(this.f8608e, this.f8609f, this.f8610g, this.f8611h, this.f8612i, this.f8613j, this.f8614k, (C0626q) obj3, J4);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int J5 = r.J(385);
                            a.b(this.f8608e, this.f8609f, this.f8610g, this.f8611h, this.f8612i, this.f8613j, this.f8614k, (C0626q) obj3, J5);
                            break;
                    }
                    return y.a;
                }
            };
            t5.f8193d = eVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static final void c(final String str, final boolean z5, final boolean z6, final boolean z7, C0626q c0626q, final int i6) {
        long j3;
        float f6;
        long j4;
        float f7;
        ?? r42;
        C1038o c1038o;
        c0626q.d0(-2075762358);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.g(z5) ? 32 : 16) | (c0626q.g(z6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.g(z7) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            float f8 = 12;
            float f9 = 22;
            e1 e1Var = O.a;
            long c6 = s.c(0.18f, ((N) c0626q.j(e1Var)).a);
            long c7 = s.c(0.6f, ((N) c0626q.j(e1Var)).f5407c);
            if (z7) {
                c0626q.b0(-1942785167);
                c7 = ((N) c0626q.j(e1Var)).a;
            } else {
                c0626q.b0(-1942784736);
            }
            c0626q.p(false);
            long c8 = s.c(0.75f, ((N) c0626q.j(e1Var)).a);
            C1818y c1818y = t0.a;
            InterfaceC1041r r5 = AbstractC1787b.r(c1818y);
            float f10 = 2;
            p0 a6 = o0.a(AbstractC1799h.g(f10), C1026c.f11795m, c0626q, 6);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q, r5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            r.G(c0626q, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            r.G(c0626q, c9, c0146e4);
            C1038o c1038o2 = C1038o.a;
            InterfaceC1041r c10 = t0.n(c1038o2, 36).c(t0.f15348b);
            long j5 = c7;
            C1813t a7 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11799q, c0626q, 48);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c11 = AbstractC1024a.c(c0626q, c10);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            r.G(c0626q, a7, c0146e);
            r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            r.G(c0626q, c11, c0146e4);
            C1386H c1386h = o0.y.f13496b;
            if (z5) {
                j3 = c6;
                c0626q.b0(1931687240);
                AbstractC1787b.h(c0626q, t0.d(c1038o2, f8));
                c0626q.p(false);
            } else {
                c0626q.b0(1931457592);
                j3 = c6;
                AbstractC1806l.a(AbstractC1464z.f(t0.d(t0.n(c1038o2, f10), f8), j3, c1386h), c0626q, 0);
                c0626q.p(false);
            }
            InterfaceC1041r j6 = t0.j(c1038o2, f9);
            C.d dVar = C.e.a;
            InterfaceC1041r f11 = AbstractC1464z.f(l0.h.c(j6, dVar), j5, c1386h);
            V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode3 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l6 = c0626q.l();
            InterfaceC1041r c12 = AbstractC1024a.c(c0626q, f11);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            r.G(c0626q, d6, c0146e);
            r.G(c0626q, l6, c0146e2);
            AbstractC1135a.n(hashCode3, c0626q, c0146e3, c0626q, c0144d);
            r.G(c0626q, c12, c0146e4);
            if (z7) {
                c0626q.b0(-1743920457);
                f6 = f8;
                f7 = f10;
                r42 = 0;
                j4 = j3;
                M1.a(t0.j(c1038o2, 16), ((N) c0626q.j(e1Var)).f5405b, f7, 0L, 0, S.l.f7374V, c0626q, 390, 56);
                c0626q.p(false);
                c1038o = c1038o2;
            } else {
                f6 = f8;
                j4 = j3;
                f7 = f10;
                r42 = 0;
                c0626q.b0(-1743659623);
                c1038o = c1038o2;
                AbstractC1806l.a(AbstractC1464z.f(l0.h.c(t0.j(c1038o, 6), dVar), c8, c1386h), c0626q, 0);
                c0626q.p(false);
            }
            c0626q.p(true);
            if (z6) {
                c0626q.b0(1932824568);
                AbstractC1787b.h(c0626q, C1814u.a(c1038o));
                c0626q.p(r42);
            } else {
                c0626q.b0(1932610792);
                AbstractC1806l.a(AbstractC1464z.f(C1814u.a(t0.n(c1038o, f7)), j4, c1386h), c0626q, r42);
                c0626q.p(r42);
            }
            c0626q.p(true);
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            AbstractC0565e.c(str, AbstractC1787b.A(S.l.f7374V, f6, 1, new Z(1.0f, true)).c(c1818y), true, null, z7, c0626q, (i7 & 14) | 24960 | ((i7 << 6) & 458752), 8);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(str, z5, z6, z7, i6) { // from class: U2.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f8621c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f8622e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f8623f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f8624g;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = r.J(1);
                    a.c(this.f8621c, this.f8622e, this.f8623f, this.f8624g, (C0626q) obj, J4);
                    return y.a;
                }
            };
        }
    }

    public static final void d(List list, boolean z5, d1 d1Var, InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        String n3;
        c0626q.d0(1126649885);
        int i7 = i6 | (c0626q.h(list) ? 4 : 2) | (c0626q.g(z5) ? 32 : 16) | (c0626q.f(d1Var) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            Long l3 = (Long) d1Var.getValue();
            c0626q.b0(574476979);
            String j02 = h5.e.j0(R.string.chat_reasoning_process_title, c0626q);
            if (l3 == null || (n3 = B3.e.n(n(l3.longValue()), "s")) == null) {
                c0626q.p(false);
            } else {
                j02 = h5.e.k0(R.string.reasoning_title_with_time, new Object[]{j02, n3}, c0626q);
                c0626q.p(false);
            }
            InterfaceC1041r c6 = interfaceC1041r.c(t0.a);
            C1031h c1031h = C1026c.f11799q;
            C1795f g3 = AbstractC1799h.g(0);
            boolean f6 = c0626q.f(j02) | c0626q.h(list) | ((i7 & 112) == 32);
            Object P5 = c0626q.P();
            if (f6 || P5 == C0616l.a) {
                P5 = new J1.k(j02, list, z5);
                c0626q.m0(P5);
            }
            AbstractC1118b.a(c6, null, null, g3, c1031h, null, false, null, (l4.c) P5, c0626q, 221184, 462);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q2.g(list, z5, d1Var, interfaceC1041r, i6, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public static final void e(String str, final String str2, long j3, final boolean z5, final d1 d1Var, final InterfaceC1193a interfaceC1193a, C0626q c0626q, final int i6) {
        final String str3;
        int i7;
        long j4;
        C0626q c0626q2;
        long j5;
        ?? r42;
        Object obj;
        C1381C c1381c;
        C1038o c1038o;
        InterfaceC1041r interfaceC1041r;
        C0626q c0626q3 = c0626q;
        c0626q3.d0(-1175511923);
        if ((i6 & 6) == 0) {
            str3 = str;
            i7 = (c0626q3.f(str3) ? 4 : 2) | i6;
        } else {
            str3 = str;
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q3.f(str2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q3.e(j3) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q3.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q3.f(d1Var) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q3.h(interfaceC1193a) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        int i8 = i7;
        if (c0626q3.S(i8 & 1, (i8 & 74899) != 74898)) {
            boolean z6 = (i8 & 14) == 4;
            Object P5 = c0626q3.P();
            Object obj2 = C0616l.a;
            if (z6 || P5 == obj2) {
                P5 = r.A(new e1.l(0L));
                c0626q3.m0(P5);
            }
            X x5 = (X) P5;
            if (!z5 || ((int) (((e1.l) x5.getValue()).a >> 32)) <= 0) {
                j5 = j3;
                r42 = 0;
                obj = obj2;
                c0626q3.b0(1488007105);
                c0626q3.p(false);
                c1381c = null;
            } else {
                c0626q3.b0(1488059340);
                r42 = 0;
                obj = obj2;
                C1297F g3 = AbstractC1318d.g(AbstractC1318d.p("reasoningTitleShimmer", c0626q3, 0), -((int) (((e1.l) x5.getValue()).a >> 32)), ((int) (((e1.l) x5.getValue()).a >> 32)) * 2, AbstractC1318d.o(AbstractC1318d.s(1400, 2, AbstractC1350y.f13277c), EnumC1310T.f13041c, 4), "reasoningTitleShimmerOffset", c0626q3, 28680, 0);
                j5 = j3;
                c1381c = new C1381C(Y4.l.I(new s(s.c(0.35f, j5)), new s(s.c(1.0f, j5)), new s(s.c(0.35f, j5))), (Float.floatToRawIntBits(S.l.f7374V) & 4294967295L) | (Float.floatToRawIntBits(((Number) g3.f12991f.getValue()).floatValue() - ((int) (((e1.l) x5.getValue()).a >> 32))) << 32), (Float.floatToRawIntBits(((Number) g3.f12991f.getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(S.l.f7374V) & 4294967295L));
                c0626q3.p(false);
            }
            C1381C c1381c2 = c1381c;
            InterfaceC1041r a6 = AbstractC1992b.a(15, t0.a, interfaceC1193a, r42);
            p0 a7 = o0.a(AbstractC1799h.g(4), C1026c.f11796n, c0626q3, 54);
            int hashCode = Long.hashCode(c0626q3.f8164T);
            InterfaceC0617l0 l3 = c0626q3.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q3, a6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q3.f0();
            if (c0626q3.f8163S) {
                c0626q3.k(c0148f);
            } else {
                c0626q3.p0();
            }
            r.G(c0626q3, a7, C0150g.f1928f);
            r.G(c0626q3, l3, C0150g.f1927e);
            r.x(c0626q3, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q3, C0150g.f1930h);
            r.G(c0626q3, c6, C0150g.f1926d);
            boolean f6 = c0626q3.f(x5);
            Object P6 = c0626q3.P();
            if (f6 || P6 == obj) {
                P6 = new C0103y(x5, 12);
                c0626q3.m0(P6);
            }
            C1038o c1038o2 = C1038o.a;
            InterfaceC1041r n3 = AbstractC0137z.n(c1038o2, (l4.c) P6);
            if (c1381c2 != null) {
                c0626q3.b0(712970452);
                c1038o = c1038o2;
                InterfaceC1041r q3 = o0.y.q(c1038o, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, null, 458751);
                boolean f7 = c0626q3.f(c1381c2);
                Object P7 = c0626q3.P();
                if (f7 || P7 == obj) {
                    P7 = new d(c1381c2, 1);
                    c0626q3.m0(P7);
                }
                interfaceC1041r = l0.h.f(q3, (l4.c) P7);
                c0626q3.p(r42);
            } else {
                c1038o = c1038o2;
                c0626q3.b0(713467289);
                c0626q3.p(r42);
                interfaceC1041r = c1038o;
            }
            InterfaceC1041r c7 = n3.c(interfaceC1041r);
            P p5 = new P(0L, s4.j.z(16), W0.k.f8835i, null, 0L, 0, 0L, 16777209);
            long j6 = c1381c2 != null ? s.f13477d : j5;
            int i9 = i8 >> 3;
            long j7 = j5;
            long j8 = j6;
            j4 = j7;
            f3.b(str2, c7, j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, p5, c0626q, i9 & 14, 12582912, 131064);
            C0626q c0626q4 = c0626q;
            a(d1Var, j4, c0626q4, (i9 & 112) | ((i8 >> 12) & 14));
            A0.a(Y3.C.L(R.drawable.keyboard_arrow_right, r42, c0626q4), h5.e.j0(R.string.chat_view_details, c0626q4), t0.j(c1038o, 20), s.c(0.6f, ((N) c0626q4.j(O.a)).a), c0626q4, 392, 0);
            c0626q4.p(true);
            c0626q2 = c0626q4;
        } else {
            j4 = j3;
            c0626q3.V();
            c0626q2 = c0626q3;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            final long j9 = j4;
            t5.f8193d = new l4.e() { // from class: U2.f
                @Override // l4.e
                public final Object m(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    a.e(str3, str2, j9, z5, d1Var, interfaceC1193a, (C0626q) obj3, r.J(i6 | 1));
                    return y.a;
                }
            };
        }
    }

    public static final void f(L2.h hVar, C0626q c0626q, int i6) {
        C0626q c0626q2 = c0626q;
        c0626q2.d0(1523271239);
        int i7 = i6 | (c0626q2.h(hVar) ? 4 : 2);
        if (c0626q2.S(i7 & 1, (i7 & 3) != 2)) {
            X3.o o5 = o(hVar, c0626q);
            long j3 = ((s) o5.f9403c).a;
            long j4 = ((s) o5.f9404e).a;
            AbstractC1688b abstractC1688b = (AbstractC1688b) o5.f9405f;
            C.d a6 = C.e.a(16);
            C1038o c1038o = C1038o.a;
            InterfaceC1041r z5 = AbstractC1787b.z(AbstractC1464z.f(l0.h.c(c1038o, a6), j3, o0.y.f13496b), 10, 6);
            p0 a7 = o0.a(AbstractC1799h.g(4), C1026c.f11796n, c0626q2, 54);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, z5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, a7, C0150g.f1928f);
            r.G(c0626q2, l3, C0150g.f1927e);
            r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q2, C0150g.f1930h);
            r.G(c0626q2, c6, C0150g.f1926d);
            int ordinal = hVar.f3087d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                c0626q2.b0(1548982776);
                M1.a(t0.j(c1038o, 12), j4, 2, 0L, 0, S.l.f7374V, c0626q, 390, 56);
                c0626q2 = c0626q;
                c0626q2.p(false);
            } else {
                c0626q2.b0(1549232667);
                A0.a(abstractC1688b, null, t0.j(c1038o, 14), j4, c0626q2, 440, 0);
                c0626q2.p(false);
            }
            f3.b(hVar.f3085b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new P(s.c(0.8f, ((N) c0626q2.j(O.a)).f5427q), s4.j.z(12), W0.k.f8835i, null, 0L, 0, 0L, 16777208), c0626q, 0, 0, 131070);
            c0626q2 = c0626q;
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new D(i6, 20, hVar);
        }
    }

    public static final void g(L2.h hVar, final boolean z5, final boolean z6, C0626q c0626q, int i6) {
        final int i7;
        C1789c c1789c;
        boolean z7;
        final L2.h hVar2 = hVar;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(hVar2, "tool");
        c0626q2.d0(905056839);
        int i8 = i6 | (c0626q2.h(hVar2) ? 4 : 2) | (c0626q2.g(z5) ? 32 : 16) | (c0626q2.g(z6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q2.S(i8 & 1, (i8 & 147) != 146)) {
            X3.o o5 = o(hVar2, c0626q2);
            long j3 = ((s) o5.f9403c).a;
            long j4 = ((s) o5.f9404e).a;
            boolean z8 = (hVar2.f3086c.isEmpty() && hVar2.f3088e == null && hVar2.f3089f == null) ? false : true;
            boolean f6 = c0626q2.f(hVar2.a);
            Object P5 = c0626q2.P();
            Object obj = C0616l.a;
            if (f6 || P5 == obj) {
                P5 = r.A(0);
                c0626q2.m0(P5);
            }
            X x5 = (X) P5;
            float f7 = 12;
            long z9 = s4.j.z(16);
            float f8 = 28;
            float f9 = 16;
            float f10 = ((Number) x5.getValue()).intValue() > 0 ? ((e1.f) AbstractC1117a.c(new e1.f(((((InterfaceC0961c) c0626q2.j(AbstractC0204q0.f2358h)).T(((Number) x5.getValue()).intValue()) - f8) / 2) + f7), new e1.f(0))).f11571c : f7;
            C1818y c1818y = t0.a;
            InterfaceC1041r r5 = AbstractC1787b.r(c1818y);
            p0 a6 = o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q2, 0);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, r5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            r.G(c0626q2, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            r.G(c0626q2, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            r.x(c0626q2, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            r.C(c0626q2, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            r.G(c0626q2, c6, c0146e4);
            C1038o c1038o = C1038o.a;
            InterfaceC1041r c7 = t0.n(c1038o, 36).c(t0.f15348b);
            C1031h c1031h = C1026c.f11799q;
            C1789c c1789c2 = AbstractC1799h.f15305c;
            C1813t a7 = AbstractC1812s.a(c1789c2, c1031h, c0626q2, 48);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, c7);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, a7, c0146e);
            r.G(c0626q2, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
            r.G(c0626q2, c8, c0146e4);
            C1386H c1386h = o0.y.f13496b;
            if (z5) {
                c1789c = c1789c2;
                c0626q2.b0(-503513789);
                AbstractC1787b.h(c0626q2, t0.d(c1038o, f10));
                c0626q2.p(false);
            } else {
                c0626q2.b0(-503769260);
                c1789c = c1789c2;
                AbstractC1806l.a(AbstractC1464z.f(t0.d(t0.n(c1038o, 2), f10), ((N) c0626q2.j(O.a)).f5379B, c1386h), c0626q2, 0);
                c0626q2.p(false);
            }
            InterfaceC1041r f11 = AbstractC1464z.f(l0.h.c(t0.j(c1038o, f8), C.e.a), j3, c1386h);
            V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode3 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l6 = c0626q2.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, f11);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, d6, c0146e);
            r.G(c0626q2, l6, c0146e2);
            AbstractC1135a.n(hashCode3, c0626q2, c0146e3, c0626q2, c0144d);
            r.G(c0626q2, c9, c0146e4);
            C1789c c1789c3 = c1789c;
            A0.a(p(hVar.f3085b, c0626q2), null, t0.j(c1038o, f9), j4, c0626q2, 440, 0);
            c0626q2.p(true);
            if (z6) {
                z7 = false;
                c0626q2.b0(-509498091);
            } else {
                c0626q2.b0(-502912544);
                z7 = false;
                AbstractC1806l.a(AbstractC1464z.f(C1814u.a(t0.n(c1038o, 2)), ((N) c0626q2.j(O.a)).f5379B, c1386h), c0626q2, 0);
            }
            c0626q2.p(z7);
            c0626q2.p(true);
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            InterfaceC1041r z10 = AbstractC1787b.z(l0.h.c(new Z(1.0f, true), C.e.a(f7)), f7, f7);
            C1813t a8 = AbstractC1812s.a(c1789c3, C1026c.f11798p, c0626q2, 0);
            int hashCode4 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l7 = c0626q2.l();
            InterfaceC1041r c10 = AbstractC1024a.c(c0626q2, z10);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, a8, c0146e);
            r.G(c0626q2, l7, c0146e2);
            AbstractC1135a.n(hashCode4, c0626q2, c0146e3, c0626q2, c0144d);
            r.G(c0626q2, c10, c0146e4);
            boolean f12 = c0626q2.f(x5);
            Object P6 = c0626q2.P();
            if (f12 || P6 == obj) {
                P6 = new C0103y(x5, 13);
                c0626q2.m0(P6);
            }
            InterfaceC1041r n3 = AbstractC0137z.n(c1818y, (l4.c) P6);
            p0 a9 = o0.a(AbstractC1799h.f15307e, C1026c.f11796n, c0626q2, 54);
            int hashCode5 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l8 = c0626q2.l();
            InterfaceC1041r c11 = AbstractC1024a.c(c0626q2, n3);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, a9, c0146e);
            r.G(c0626q2, l8, c0146e2);
            AbstractC1135a.n(hashCode5, c0626q2, c0146e3, c0626q2, c0144d);
            r.G(c0626q2, c11, c0146e4);
            hVar2 = hVar;
            i7 = i6;
            f3.b(hVar.f3085b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new P(((N) c0626q2.j(O.a)).f5427q, z9, W0.k.f8835i, null, 0L, 0, 0L, 16777208), c0626q, 0, 0, 131070);
            L2.i iVar = hVar2.f3087d;
            Long l9 = hVar2.f3091h;
            l(iVar, l9 != null ? Long.valueOf(l9.longValue() - hVar2.f3090g) : null, c0626q, 0);
            c0626q.p(true);
            AbstractC1244z.b(C1814u.a, z8, null, AbstractC1205L.a(null, 15).a(AbstractC1205L.b(null, 3)), AbstractC1205L.d(null, 15).a(AbstractC1205L.c(null, 3)), null, AbstractC0874g.c(-2054153794, new b1(hVar2, 10), c0626q), c0626q, 1600518, 18);
            c0626q2 = c0626q;
            c0626q2.p(true);
            c0626q2.p(true);
        } else {
            i7 = i6;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(z5, z6, i7) { // from class: U2.j

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f8644e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f8645f;

                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int J4 = r.J(9);
                    a.g(L2.h.this, this.f8644e, this.f8645f, (C0626q) obj2, J4);
                    return y.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x06a5, code lost:
    
        if (r0 == r3) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x00f5, code lost:
    
        if (u4.AbstractC1776n.Q(r9) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0508, code lost:
    
        if (r10 == r7) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05ed  */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53, types: [int] */
    /* JADX WARN: Type inference failed for: r8v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r62, final java.lang.String r63, T.C0626q r64, final int r65) {
        /*
            Method dump skipped, instructions count: 2640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.h(java.lang.String, java.lang.String, T.q, int):void");
    }

    public static final void i(List list, C0626q c0626q, int i6) {
        int i7;
        C0626q c0626q2;
        AbstractC1276k.f(list, "toolCalls");
        c0626q.d0(797066920);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(list) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            C1795f g3 = AbstractC1799h.g(8);
            C1032i c1032i = C1026c.f11796n;
            boolean h3 = c0626q.h(list);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0250a(list, 3);
                c0626q.m0(P5);
            }
            c0626q2 = c0626q;
            AbstractC1118b.b(null, null, null, g3, c1032i, null, false, null, (l4.c) P5, c0626q2, 221184, 463);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0062d(i6, 1, list);
        }
    }

    public static final void j(final String str, final List list, final InterfaceC1041r interfaceC1041r, C0626q c0626q, final int i6) {
        C0627q0 t5;
        l4.e eVar;
        long j3;
        String k02;
        boolean z5;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(str, "messageId");
        AbstractC1276k.f(list, "toolCalls");
        c0626q2.d0(-1013964445);
        int i7 = i6 | (c0626q2.f(str) ? 4 : 2) | (c0626q2.h(list) ? 32 : 16);
        if (!c0626q2.S(i7 & 1, (i7 & 147) != 146)) {
            c0626q2.V();
        } else {
            if (list.isEmpty()) {
                t5 = c0626q2.t();
                if (t5 != null) {
                    final int i8 = 0;
                    eVar = new l4.e(str, list, interfaceC1041r, i6, i8) { // from class: U2.k

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f8646c;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ String f8647e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ List f8648f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC1041r f8649g;

                        {
                            this.f8646c = i8;
                        }

                        @Override // l4.e
                        public final Object m(Object obj, Object obj2) {
                            int i9 = this.f8646c;
                            C0626q c0626q3 = (C0626q) obj;
                            ((Integer) obj2).getClass();
                            switch (i9) {
                                case 0:
                                    a.j(this.f8647e, this.f8648f, this.f8649g, c0626q3, r.J(385));
                                    break;
                                default:
                                    a.j(this.f8647e, this.f8648f, this.f8649g, c0626q3, r.J(385));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    t5.f8193d = eVar;
                }
                return;
            }
            boolean z6 = (i7 & 14) == 4;
            Object P5 = c0626q2.P();
            Object obj = C0616l.a;
            if (z6 || P5 == obj) {
                P5 = r.A(Boolean.FALSE);
                c0626q2.m0(P5);
            }
            X x5 = (X) P5;
            C0405d2 f6 = AbstractC0452p1.f(6, 2, c0626q2);
            int i9 = (i7 >> 3) & 14;
            boolean isEmpty = list.isEmpty();
            L2.i iVar = L2.i.f3092c;
            L2.i iVar2 = L2.i.f3093e;
            if (!isEmpty) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((L2.h) it.next()).f3087d == L2.i.f3095g) {
                        c0626q2.b0(806243244);
                        j3 = ((N) c0626q2.j(O.a)).f5433w;
                        c0626q2.p(false);
                        break;
                    }
                }
            }
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    L2.i iVar3 = ((L2.h) it2.next()).f3087d;
                    if (iVar3 == iVar2 || iVar3 == iVar) {
                        c0626q2.b0(806248238);
                        j3 = ((N) c0626q2.j(O.a)).a;
                        c0626q2.p(false);
                        break;
                    }
                }
            }
            c0626q2.b0(806249838);
            j3 = ((N) c0626q2.j(O.a)).a;
            c0626q2.p(false);
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    L2.i iVar4 = ((L2.h) it3.next()).f3087d;
                    if (iVar4 == iVar2 || iVar4 == iVar) {
                        k02 = B3.e.j(c0626q2, -2108211625, R.string.chat_tool_calls_in_progress, c0626q2, false);
                        break;
                    }
                }
            }
            c0626q2.b0(-2108137938);
            k02 = h5.e.k0(R.string.chat_tool_calls_used, new Object[]{Integer.valueOf(list.size())}, c0626q2);
            c0626q2.p(false);
            C1818y c1818y = t0.a;
            InterfaceC1041r c6 = interfaceC1041r.c(c1818y);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            r.G(c0626q2, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            r.G(c0626q2, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            r.x(c0626q2, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            r.C(c0626q2, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            r.G(c0626q2, c7, c0146e4);
            boolean f7 = c0626q2.f(x5);
            Object P6 = c0626q2.P();
            if (f7 || P6 == obj) {
                P6 = new C(x5, 14);
                c0626q2.m0(P6);
            }
            InterfaceC1041r a7 = AbstractC1992b.a(15, c1818y, (InterfaceC1193a) P6, false);
            p0 a8 = o0.a(AbstractC1799h.g(4), C1026c.f11796n, c0626q2, 54);
            String str2 = k02;
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, a7);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, a8, c0146e);
            r.G(c0626q2, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
            r.G(c0626q2, c8, c0146e4);
            f3.b(str2, null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, new P(0L, s4.j.z(16), W0.k.f8835i, null, 0L, 0, 0L, 16777209), c0626q, 0, 12582912, 131066);
            c0626q2 = c0626q;
            AbstractC1688b L5 = Y3.C.L(R.drawable.keyboard_arrow_right, 0, c0626q2);
            String j02 = h5.e.j0(R.string.chat_view_details, c0626q2);
            long c9 = s.c(0.6f, ((N) c0626q2.j(O.a)).a);
            C1038o c1038o = C1038o.a;
            A0.a(L5, j02, t0.j(c1038o, 20), c9, c0626q2, 392, 0);
            c0626q2.p(true);
            AbstractC1787b.h(c0626q2, t0.d(c1038o, 8));
            i(list, c0626q2, i9);
            c0626q2.p(true);
            if (((Boolean) x5.getValue()).booleanValue()) {
                c0626q2.b0(-508273813);
                boolean f8 = c0626q2.f(x5);
                Object P7 = c0626q2.P();
                if (f8 || P7 == obj) {
                    P7 = new C(x5, 15);
                    c0626q2.m0(P7);
                }
                AbstractC0452p1.a((InterfaceC1193a) P7, null, f6, S.l.f7374V, false, null, 0L, 0L, S.l.f7374V, 0L, null, null, null, AbstractC0874g.c(-380755661, new l(list, 0), c0626q2), c0626q, 0);
                c0626q2 = c0626q;
                z5 = false;
            } else {
                z5 = false;
                c0626q2.b0(-511433953);
            }
            c0626q2.p(z5);
        }
        t5 = c0626q2.t();
        if (t5 != null) {
            final int i10 = 1;
            eVar = new l4.e(str, list, interfaceC1041r, i6, i10) { // from class: U2.k

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f8646c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f8647e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f8648f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f8649g;

                {
                    this.f8646c = i10;
                }

                @Override // l4.e
                public final Object m(Object obj2, Object obj22) {
                    int i92 = this.f8646c;
                    C0626q c0626q3 = (C0626q) obj2;
                    ((Integer) obj22).getClass();
                    switch (i92) {
                        case 0:
                            a.j(this.f8647e, this.f8648f, this.f8649g, c0626q3, r.J(385));
                            break;
                        default:
                            a.j(this.f8647e, this.f8648f, this.f8649g, c0626q3, r.J(385));
                            break;
                    }
                    return y.a;
                }
            };
            t5.f8193d = eVar;
        }
    }

    public static final void k(List list, InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        c0626q.d0(1868354841);
        int i7 = (c0626q.h(list) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            String j02 = h5.e.j0(R.string.chat_tool_calls_title, c0626q);
            C1031h c1031h = C1026c.f11799q;
            C1795f g3 = AbstractC1799h.g(0);
            boolean f6 = c0626q.f(j02) | c0626q.h(list);
            Object P5 = c0626q.P();
            if (f6 || P5 == C0616l.a) {
                P5 = new C0086p(27, list, j02);
                c0626q.m0(P5);
            }
            AbstractC1118b.a(interfaceC1041r, null, null, g3, c1031h, null, false, null, (l4.c) P5, c0626q, 221190, 462);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new m(list, interfaceC1041r, i6, 0);
        }
    }

    public static final void l(L2.i iVar, Long l3, C0626q c0626q, int i6) {
        X3.i iVar2;
        int i7;
        long j3;
        String k02;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(-349997358);
        int i8 = i6 | (c0626q2.d(iVar.ordinal()) ? 4 : 2) | (c0626q2.f(l3) ? 32 : 16);
        if (c0626q2.S(i8 & 1, (i8 & 19) != 18)) {
            int ordinal = iVar.ordinal();
            if (ordinal == 0) {
                c0626q2.b0(-1340006845);
                iVar2 = new X3.i(h5.e.j0(R.string.tool_status_pending, c0626q2), new s(((N) c0626q2.j(O.a)).f5378A));
                c0626q2.p(false);
            } else if (ordinal == 1) {
                c0626q2.b0(-1340003133);
                iVar2 = new X3.i(h5.e.j0(R.string.tool_status_running, c0626q2), new s(((N) c0626q2.j(O.a)).a));
                c0626q2.p(false);
            } else if (ordinal == 2) {
                c0626q2.b0(1409696088);
                if (l3 == null) {
                    c0626q2.b0(1409733783);
                    c0626q2.p(false);
                    k02 = null;
                } else {
                    c0626q2.b0(1409733784);
                    k02 = h5.e.k0(R.string.tool_status_duration_ms, new Object[]{Long.valueOf(l3.longValue())}, c0626q2);
                    c0626q2.p(false);
                }
                if (k02 == null) {
                    k02 = B3.e.j(c0626q2, -1339995141, R.string.tool_status_done, c0626q2, false);
                } else {
                    c0626q2.b0(-1339998303);
                    c0626q2.p(false);
                }
                iVar2 = new X3.i(k02, new s(((N) c0626q2.j(O.a)).a));
                c0626q2.p(false);
            } else {
                if (ordinal != 3) {
                    c0626q2.b0(-1340007878);
                    c0626q2.p(false);
                    throw new RuntimeException();
                }
                c0626q2.b0(-1339990400);
                iVar2 = new X3.i(h5.e.j0(R.string.tool_status_failed, c0626q2), new s(((N) c0626q2.j(O.a)).f5433w));
                c0626q2.p(false);
            }
            String str = (String) iVar2.f9393c;
            long j4 = ((s) iVar2.f9394e).a;
            p0 a6 = o0.a(AbstractC1799h.g(4), C1026c.f11796n, c0626q2, 54);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            C1038o c1038o = C1038o.a;
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, c1038o);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            r.G(c0626q2, a6, C0150g.f1928f);
            r.G(c0626q2, l5, C0150g.f1927e);
            r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q2, C0150g.f1930h);
            r.G(c0626q2, c6, C0150g.f1926d);
            if (iVar == L2.i.f3093e) {
                c0626q2.b0(-515644415);
                j3 = j4;
                i7 = 12;
                M1.a(t0.j(c1038o, 12), j3, 2, 0L, 0, S.l.f7374V, c0626q2, 390, 56);
            } else {
                i7 = 12;
                j3 = j4;
                c0626q2.b0(-537889612);
            }
            c0626q2.p(false);
            f3.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new P(j3, s4.j.z(i7), null, null, 0L, 0, 0L, 16777212), c0626q, 0, 0, 131070);
            c0626q2 = c0626q;
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 12, iVar, l3);
        }
    }

    public static final String m(String str) {
        if (AbstractC1776n.Q(str)) {
            return null;
        }
        try {
            URI uri = AbstractC1776n.G(str, "://", false) ? new URI(str) : new URI("https://".concat(str));
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "https";
            }
            return scheme + "://" + host + "/favicon.ico";
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String n(long j3) {
        long j4 = (j3 + 50) / 100;
        if (j4 < 0) {
            j4 = 0;
        }
        long j5 = 10;
        return (j4 / j5) + "." + (j4 % j5);
    }

    public static final X3.o o(L2.h hVar, C0626q c0626q) {
        long c6;
        long j3;
        AbstractC1688b p5 = p(hVar.f3085b, c0626q);
        int ordinal = hVar.f3087d.ordinal();
        if (ordinal == 2) {
            c0626q.b0(-212966157);
            e1 e1Var = O.a;
            c6 = s.c(0.6f, ((N) c0626q.j(e1Var)).f5407c);
            j3 = ((N) c0626q.j(e1Var)).a;
            c0626q.p(false);
        } else if (ordinal != 3) {
            c0626q.b0(-212616632);
            e1 e1Var2 = O.a;
            c6 = ((N) c0626q.j(e1Var2)).f5428r;
            j3 = ((N) c0626q.j(e1Var2)).a;
            c0626q.p(false);
        } else {
            c0626q.b0(-212780777);
            e1 e1Var3 = O.a;
            c6 = s.c(0.6f, ((N) c0626q.j(e1Var3)).f5435y);
            j3 = ((N) c0626q.j(e1Var3)).f5433w;
            c0626q.p(false);
        }
        return new X3.o(new s(c6), new s(j3), p5);
    }

    public static final AbstractC1688b p(String str, C0626q c0626q) {
        if (AbstractC1276k.b(str, "web_search")) {
            c0626q.b0(-188613108);
            AbstractC1688b L5 = Y3.C.L(R.drawable.search, 0, c0626q);
            c0626q.p(false);
            return L5;
        }
        if (AbstractC1276k.b(str, "web_fetch")) {
            c0626q.b0(-188611250);
            AbstractC1688b L6 = Y3.C.L(R.drawable.language, 0, c0626q);
            c0626q.p(false);
            return L6;
        }
        c0626q.b0(-188609556);
        AbstractC1688b L7 = Y3.C.L(R.drawable.search, 0, c0626q);
        c0626q.p(false);
        return L7;
    }
}
