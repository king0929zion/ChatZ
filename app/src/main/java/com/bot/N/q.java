package N;

import D.AbstractC0090r0;
import D.c1;
import F0.AbstractC0113d;
import F0.U;
import F0.W;
import F0.X;
import F0.k0;
import H0.A0;
import H0.AbstractC0157l;
import H0.InterfaceC0160o;
import H0.InterfaceC0170z;
import H0.S;
import P0.w;
import P0.x;
import S0.C0545g;
import S0.K;
import S0.L;
import S0.P;
import Y3.v;
import android.os.Trace;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class q extends AbstractC1040q implements InterfaceC0170z, InterfaceC0160o, A0 {

    /* renamed from: A, reason: collision with root package name */
    public l4.c f3600A;

    /* renamed from: B, reason: collision with root package name */
    public i f3601B;

    /* renamed from: C, reason: collision with root package name */
    public l4.c f3602C;

    /* renamed from: D, reason: collision with root package name */
    public Map f3603D;

    /* renamed from: E, reason: collision with root package name */
    public d f3604E;

    /* renamed from: F, reason: collision with root package name */
    public o f3605F;

    /* renamed from: G, reason: collision with root package name */
    public p f3606G;

    /* renamed from: r, reason: collision with root package name */
    public C0545g f3607r;

    /* renamed from: s, reason: collision with root package name */
    public P f3608s;

    /* renamed from: t, reason: collision with root package name */
    public W0.d f3609t;

    /* renamed from: u, reason: collision with root package name */
    public l4.c f3610u;

    /* renamed from: v, reason: collision with root package name */
    public int f3611v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3612w;

    /* renamed from: x, reason: collision with root package name */
    public int f3613x;

    /* renamed from: y, reason: collision with root package name */
    public int f3614y;

    /* renamed from: z, reason: collision with root package name */
    public List f3615z;

    public q(C0545g c0545g, P p5, W0.d dVar, l4.c cVar, int i6, boolean z5, int i7, int i8, List list, l4.c cVar2, i iVar, l4.c cVar3) {
        this.f3607r = c0545g;
        this.f3608s = p5;
        this.f3609t = dVar;
        this.f3610u = cVar;
        this.f3611v = i6;
        this.f3612w = z5;
        this.f3613x = i7;
        this.f3614y = i8;
        this.f3615z = list;
        this.f3600A = cVar2;
        this.f3601B = iVar;
        this.f3602C = cVar3;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

        @Override // H0.A0
    public final void I(x xVar) {
        o oVar = this.f3605F;
        o oVar2 = oVar;
        if (oVar == null) {
            final int i6 = 0;
            l4.c r02 = new l4.c(this) { // from class: N.o

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ q f3596e;

                {
                    this.f3596e = this;
                }

                @Override // l4.c
                public final Object f(Object obj) {
                    L l3;
                    boolean z5;
                    switch (i6) {
                        case 0:
                            List list = (List) obj;
                            q qVar = this.f3596e;
                            L l5 = qVar.N0().f3531n;
                            if (l5 != null) {
                                K k3 = l5.a;
                                l3 = new L(new K(k3.a, P.e(qVar.f3608s, o0.s.f13481h, 0L, null, 0L, 0, 0L, 16777214), k3.f7591c, k3.f7592d, k3.f7593e, k3.f7594f, k3.f7595g, k3.f7596h, k3.f7597i, k3.f7598j), l5.f7599b, l5.f7600c);
                                list.add(l3);
                            } else {
                                l3 = null;
                            }
                            return Boolean.valueOf(l3 != null);
                        case 1:
                            C0545g c0545g = (C0545g) obj;
                            q qVar2 = this.f3596e;
                            p pVar = qVar2.f3606G;
                            v vVar = v.f9812c;
                            if (pVar == null) {
                                p pVar2 = new p(qVar2.f3607r, c0545g);
                                d dVar = new d(c0545g, qVar2.f3608s, qVar2.f3609t, qVar2.f3611v, qVar2.f3612w, qVar2.f3613x, qVar2.f3614y, vVar);
                                dVar.d(qVar2.N0().f3527j);
                                pVar2.f3599d = dVar;
                                qVar2.f3606G = pVar2;
                            } else if (!AbstractC1276k.b(c0545g, pVar.f3597b)) {
                                pVar.f3597b = c0545g;
                                d dVar2 = pVar.f3599d;
                                if (dVar2 != null) {
                                    P p5 = qVar2.f3608s;
                                    W0.d dVar3 = qVar2.f3609t;
                                    int i7 = qVar2.f3611v;
                                    boolean z6 = qVar2.f3612w;
                                    int i8 = qVar2.f3613x;
                                    int i9 = qVar2.f3614y;
                                    dVar2.a = c0545g;
                                    boolean c6 = p5.c(dVar2.f3528k);
                                    dVar2.f3528k = p5;
                                    if (!c6) {
                                        dVar2.f3534q <<= 2;
                                        dVar2.f3529l = null;
                                        dVar2.f3531n = null;
                                        dVar2.f3533p = -1;
                                        dVar2.f3532o = -1;
                                    }
                                    dVar2.f3519b = dVar3;
                                    dVar2.f3520c = i7;
                                    dVar2.f3521d = z6;
                                    dVar2.f3522e = i8;
                                    dVar2.f3523f = i9;
                                    dVar2.f3524g = vVar;
                                    dVar2.f3534q = (dVar2.f3534q << 2) | 2;
                                    dVar2.f3529l = null;
                                    dVar2.f3531n = null;
                                    dVar2.f3533p = -1;
                                    dVar2.f3532o = -1;
                                }
                            }
                            AbstractC0157l.m(qVar2);
                            AbstractC0157l.l(qVar2);
                            AbstractC0157l.k(qVar2);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            q qVar3 = this.f3596e;
                            p pVar3 = qVar3.f3606G;
                            if (pVar3 == null) {
                                z5 = false;
                            } else {
                                l4.c cVar = qVar3.f3602C;
                                if (cVar != null) {
                                    cVar.f(pVar3);
                                }
                                p pVar4 = qVar3.f3606G;
                                if (pVar4 != null) {
                                    pVar4.f3598c = booleanValue;
                                }
                                AbstractC0157l.m(qVar3);
                                AbstractC0157l.l(qVar3);
                                AbstractC0157l.k(qVar3);
                                z5 = true;
                            }
                            return Boolean.valueOf(z5);
                    }
                }
            };
            this.f3605F = r02;
            oVar2 = r02;
        }
        C0545g c0545g = this.f3607r;
        s4.e[] eVarArr = P0.v.a;
        xVar.a(P0.t.f4508B, Y4.l.H(c0545g));
        p pVar = this.f3606G;
        if (pVar != null) {
            C0545g c0545g2 = pVar.f3597b;
            w wVar = P0.t.f4509C;
            s4.e[] eVarArr2 = P0.v.a;
            s4.e eVar = eVarArr2[16];
            xVar.a(wVar, c0545g2);
            boolean z5 = pVar.f3598c;
            w wVar2 = P0.t.f4510D;
            s4.e eVar2 = eVarArr2[17];
            xVar.a(wVar2, Boolean.valueOf(z5));
        }
        final int i7 = 1;
        xVar.a(P0.l.f4477l, new P0.a(null, new l4.c(this) { // from class: N.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f3596e;

            {
                this.f3596e = this;
            }

            @Override // l4.c
            public final Object f(Object obj) {
                L l3;
                boolean z52;
                switch (i7) {
                    case 0:
                        List list = (List) obj;
                        q qVar = this.f3596e;
                        L l5 = qVar.N0().f3531n;
                        if (l5 != null) {
                            K k3 = l5.a;
                            l3 = new L(new K(k3.a, P.e(qVar.f3608s, o0.s.f13481h, 0L, null, 0L, 0, 0L, 16777214), k3.f7591c, k3.f7592d, k3.f7593e, k3.f7594f, k3.f7595g, k3.f7596h, k3.f7597i, k3.f7598j), l5.f7599b, l5.f7600c);
                            list.add(l3);
                        } else {
                            l3 = null;
                        }
                        return Boolean.valueOf(l3 != null);
                    case 1:
                        C0545g c0545g3 = (C0545g) obj;
                        q qVar2 = this.f3596e;
                        p pVar2 = qVar2.f3606G;
                        v vVar = v.f9812c;
                        if (pVar2 == null) {
                            p pVar22 = new p(qVar2.f3607r, c0545g3);
                            d dVar = new d(c0545g3, qVar2.f3608s, qVar2.f3609t, qVar2.f3611v, qVar2.f3612w, qVar2.f3613x, qVar2.f3614y, vVar);
                            dVar.d(qVar2.N0().f3527j);
                            pVar22.f3599d = dVar;
                            qVar2.f3606G = pVar22;
                        } else if (!AbstractC1276k.b(c0545g3, pVar2.f3597b)) {
                            pVar2.f3597b = c0545g3;
                            d dVar2 = pVar2.f3599d;
                            if (dVar2 != null) {
                                P p5 = qVar2.f3608s;
                                W0.d dVar3 = qVar2.f3609t;
                                int i72 = qVar2.f3611v;
                                boolean z6 = qVar2.f3612w;
                                int i8 = qVar2.f3613x;
                                int i9 = qVar2.f3614y;
                                dVar2.a = c0545g3;
                                boolean c6 = p5.c(dVar2.f3528k);
                                dVar2.f3528k = p5;
                                if (!c6) {
                                    dVar2.f3534q <<= 2;
                                    dVar2.f3529l = null;
                                    dVar2.f3531n = null;
                                    dVar2.f3533p = -1;
                                    dVar2.f3532o = -1;
                                }
                                dVar2.f3519b = dVar3;
                                dVar2.f3520c = i72;
                                dVar2.f3521d = z6;
                                dVar2.f3522e = i8;
                                dVar2.f3523f = i9;
                                dVar2.f3524g = vVar;
                                dVar2.f3534q = (dVar2.f3534q << 2) | 2;
                                dVar2.f3529l = null;
                                dVar2.f3531n = null;
                                dVar2.f3533p = -1;
                                dVar2.f3532o = -1;
                            }
                        }
                        AbstractC0157l.m(qVar2);
                        AbstractC0157l.l(qVar2);
                        AbstractC0157l.k(qVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q qVar3 = this.f3596e;
                        p pVar3 = qVar3.f3606G;
                        if (pVar3 == null) {
                            z52 = false;
                        } else {
                            l4.c cVar = qVar3.f3602C;
                            if (cVar != null) {
                                cVar.f(pVar3);
                            }
                            p pVar4 = qVar3.f3606G;
                            if (pVar4 != null) {
                                pVar4.f3598c = booleanValue;
                            }
                            AbstractC0157l.m(qVar3);
                            AbstractC0157l.l(qVar3);
                            AbstractC0157l.k(qVar3);
                            z52 = true;
                        }
                        return Boolean.valueOf(z52);
                }
            }
        }));
        final int i8 = 2;
        xVar.a(P0.l.f4478m, new P0.a(null, new l4.c(this) { // from class: N.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q f3596e;

            {
                this.f3596e = this;
            }

            @Override // l4.c
            public final Object f(Object obj) {
                L l3;
                boolean z52;
                switch (i8) {
                    case 0:
                        List list = (List) obj;
                        q qVar = this.f3596e;
                        L l5 = qVar.N0().f3531n;
                        if (l5 != null) {
                            K k3 = l5.a;
                            l3 = new L(new K(k3.a, P.e(qVar.f3608s, o0.s.f13481h, 0L, null, 0L, 0, 0L, 16777214), k3.f7591c, k3.f7592d, k3.f7593e, k3.f7594f, k3.f7595g, k3.f7596h, k3.f7597i, k3.f7598j), l5.f7599b, l5.f7600c);
                            list.add(l3);
                        } else {
                            l3 = null;
                        }
                        return Boolean.valueOf(l3 != null);
                    case 1:
                        C0545g c0545g3 = (C0545g) obj;
                        q qVar2 = this.f3596e;
                        p pVar2 = qVar2.f3606G;
                        v vVar = v.f9812c;
                        if (pVar2 == null) {
                            p pVar22 = new p(qVar2.f3607r, c0545g3);
                            d dVar = new d(c0545g3, qVar2.f3608s, qVar2.f3609t, qVar2.f3611v, qVar2.f3612w, qVar2.f3613x, qVar2.f3614y, vVar);
                            dVar.d(qVar2.N0().f3527j);
                            pVar22.f3599d = dVar;
                            qVar2.f3606G = pVar22;
                        } else if (!AbstractC1276k.b(c0545g3, pVar2.f3597b)) {
                            pVar2.f3597b = c0545g3;
                            d dVar2 = pVar2.f3599d;
                            if (dVar2 != null) {
                                P p5 = qVar2.f3608s;
                                W0.d dVar3 = qVar2.f3609t;
                                int i72 = qVar2.f3611v;
                                boolean z6 = qVar2.f3612w;
                                int i82 = qVar2.f3613x;
                                int i9 = qVar2.f3614y;
                                dVar2.a = c0545g3;
                                boolean c6 = p5.c(dVar2.f3528k);
                                dVar2.f3528k = p5;
                                if (!c6) {
                                    dVar2.f3534q <<= 2;
                                    dVar2.f3529l = null;
                                    dVar2.f3531n = null;
                                    dVar2.f3533p = -1;
                                    dVar2.f3532o = -1;
                                }
                                dVar2.f3519b = dVar3;
                                dVar2.f3520c = i72;
                                dVar2.f3521d = z6;
                                dVar2.f3522e = i82;
                                dVar2.f3523f = i9;
                                dVar2.f3524g = vVar;
                                dVar2.f3534q = (dVar2.f3534q << 2) | 2;
                                dVar2.f3529l = null;
                                dVar2.f3531n = null;
                                dVar2.f3533p = -1;
                                dVar2.f3532o = -1;
                            }
                        }
                        AbstractC0157l.m(qVar2);
                        AbstractC0157l.l(qVar2);
                        AbstractC0157l.k(qVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q qVar3 = this.f3596e;
                        p pVar3 = qVar3.f3606G;
                        if (pVar3 == null) {
                            z52 = false;
                        } else {
                            l4.c cVar = qVar3.f3602C;
                            if (cVar != null) {
                                cVar.f(pVar3);
                            }
                            p pVar4 = qVar3.f3606G;
                            if (pVar4 != null) {
                                pVar4.f3598c = booleanValue;
                            }
                            AbstractC0157l.m(qVar3);
                            AbstractC0157l.l(qVar3);
                            AbstractC0157l.k(qVar3);
                            z52 = true;
                        }
                        return Boolean.valueOf(z52);
                }
            }
        }));
        xVar.a(P0.l.f4479n, new P0.a(null, new A.b(this, 18)));
        P0.v.a(xVar, oVar2);
    }

    public final void M0(boolean z5, boolean z6, boolean z7, boolean z8) {
        if (z6 || z7 || z8) {
            d N02 = N0();
            C0545g c0545g = this.f3607r;
            P p5 = this.f3608s;
            W0.d dVar = this.f3609t;
            int i6 = this.f3611v;
            boolean z9 = this.f3612w;
            int i7 = this.f3613x;
            int i8 = this.f3614y;
            List list = this.f3615z;
            N02.a = c0545g;
            boolean c6 = p5.c(N02.f3528k);
            N02.f3528k = p5;
            if (!c6) {
                N02.f3534q <<= 2;
                N02.f3529l = null;
                N02.f3531n = null;
                N02.f3533p = -1;
                N02.f3532o = -1;
            }
            N02.f3519b = dVar;
            N02.f3520c = i6;
            N02.f3521d = z9;
            N02.f3522e = i7;
            N02.f3523f = i8;
            N02.f3524g = list;
            N02.f3534q = (N02.f3534q << 2) | 2;
            N02.f3529l = null;
            N02.f3531n = null;
            N02.f3533p = -1;
            N02.f3532o = -1;
        }
        if (this.f11819q) {
            if (z6 || (z5 && this.f3605F != null)) {
                AbstractC0157l.m(this);
            }
            if (z6 || z7 || z8) {
                AbstractC0157l.l(this);
                AbstractC0157l.k(this);
            }
            if (z5) {
                AbstractC0157l.k(this);
            }
        }
    }

    public final d N0() {
        if (this.f3604E == null) {
            this.f3604E = new d(this.f3607r, this.f3608s, this.f3609t, this.f3611v, this.f3612w, this.f3613x, this.f3614y, this.f3615z);
        }
        d dVar = this.f3604E;
        AbstractC1276k.c(dVar);
        return dVar;
    }

    public final d O0(InterfaceC0961c interfaceC0961c) {
        d dVar;
        p pVar = this.f3606G;
        if (pVar != null && pVar.f3598c && (dVar = pVar.f3599d) != null) {
            dVar.d(interfaceC0961c);
            return dVar;
        }
        d N02 = N0();
        N02.d(interfaceC0961c);
        return N02;
    }

    @Override // H0.InterfaceC0170z
    public final int P(S s5, U u5, int i6) {
        return O0(s5).a(i6, s5.getLayoutDirection());
    }

    public final boolean P0(l4.c cVar, l4.c cVar2, i iVar, l4.c cVar3) {
        boolean z5;
        if (this.f3610u != cVar) {
            this.f3610u = cVar;
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f3600A != cVar2) {
            this.f3600A = cVar2;
            z5 = true;
        }
        if (!AbstractC1276k.b(this.f3601B, iVar)) {
            this.f3601B = iVar;
            z5 = true;
        }
        if (this.f3602C == cVar3) {
            return z5;
        }
        this.f3602C = cVar3;
        return true;
    }

    public final boolean Q0(P p5, List list, int i6, int i7, boolean z5, W0.d dVar, int i8) {
        boolean z6 = !this.f3608s.c(p5);
        this.f3608s = p5;
        if (!AbstractC1276k.b(this.f3615z, list)) {
            this.f3615z = list;
            z6 = true;
        }
        if (this.f3614y != i6) {
            this.f3614y = i6;
            z6 = true;
        }
        if (this.f3613x != i7) {
            this.f3613x = i7;
            z6 = true;
        }
        if (this.f3612w != z5) {
            this.f3612w = z5;
            z6 = true;
        }
        if (!AbstractC1276k.b(this.f3609t, dVar)) {
            this.f3609t = dVar;
            z6 = true;
        }
        if (this.f3611v == i8) {
            return z6;
        }
        this.f3611v = i8;
        return true;
    }

    public final boolean R0(C0545g c0545g) {
        boolean b5 = AbstractC1276k.b(this.f3607r.f7630e, c0545g.f7630e);
        boolean z5 = (b5 && AbstractC1276k.b(this.f3607r.f7629c, c0545g.f7629c)) ? false : true;
        if (z5) {
            this.f3607r = c0545g;
        }
        if (!b5) {
            this.f3606G = null;
        }
        return z5;
    }

    @Override // H0.InterfaceC0170z
    public final W d(X x5, U u5, long j3) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            d O02 = O0(x5);
            boolean c6 = O02.c(j3, x5.getLayoutDirection());
            L l3 = O02.f3531n;
            if (l3 == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + O02);
            }
            long j4 = l3.f7600c;
            l3.f7599b.a.a();
            if (c6) {
                AbstractC0157l.t(this, 2).d1();
                l4.c cVar = this.f3610u;
                if (cVar != null) {
                    cVar.f(l3);
                }
                i iVar = this.f3601B;
                if (iVar != null) {
                    iVar.c(l3);
                }
                Map map = this.f3603D;
                if (map == null) {
                    map = new LinkedHashMap(2);
                }
                map.put(AbstractC0113d.a, Integer.valueOf(Math.round(l3.f7601d)));
                map.put(AbstractC0113d.f1471b, Integer.valueOf(Math.round(l3.f7602e)));
                this.f3603D = map;
            }
            l4.c cVar2 = this.f3600A;
            if (cVar2 != null) {
                cVar2.f(l3.f7603f);
            }
            int i6 = (int) (j4 >> 32);
            int i7 = (int) (j4 & 4294967295L);
            k0 w5 = u5.w(s4.j.s(i6, i6, i7, i7));
            Map map2 = this.f3603D;
            AbstractC1276k.c(map2);
            W D4 = x5.D(i6, i7, map2, new c1(w5, 1));
            Trace.endSection();
            return D4;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // H0.InterfaceC0170z
    public final int j(S s5, U u5, int i6) {
        return AbstractC0090r0.o(O0(s5).e(s5.getLayoutDirection()).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
                @Override // H0.InterfaceC0160o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(H0.L r27) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.q.k0(H0.L):void");
    }

    @Override // H0.InterfaceC0170z
    public final int m0(S s5, U u5, int i6) {
        return O0(s5).a(i6, s5.getLayoutDirection());
    }

    @Override // H0.InterfaceC0170z
    public final int z0(S s5, U u5, int i6) {
        return AbstractC0090r0.o(O0(s5).e(s5.getLayoutDirection()).c());
    }
}
