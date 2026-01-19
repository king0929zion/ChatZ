package p;

import B0.C0040p;
import B0.EnumC0041q;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.InterfaceC0154i;
import H0.InterfaceC0155j;
import I0.AbstractC0204q0;
import I0.X0;
import O.C0311h0;
import O.C0316k;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import k.AbstractC1171s;
import k.C1151E;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1353b;
import r.C1566f1;
import t.C1679g;
import t.C1680h;
import t.C1682j;
import t.C1683k;
import t.C1684l;
import x4.AbstractC1888A;
import x4.C1940w;
import x4.InterfaceC1922e0;

/* loaded from: classes.dex */
public abstract class r extends AbstractC0156k implements H0.w0, z0.e, H0.A0, H0.F0, InterfaceC0154i, H0.m0, y0.c {

    /* renamed from: O, reason: collision with root package name */
    public static final C1423b f13766O = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final C1424b0 f13767A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1455r0 f13768B;

    /* renamed from: C, reason: collision with root package name */
    public B0.X f13769C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC0155j f13770D;

    /* renamed from: E, reason: collision with root package name */
    public C1684l f13771E;

    /* renamed from: F, reason: collision with root package name */
    public C1679g f13772F;

    /* renamed from: G, reason: collision with root package name */
    public final C1151E f13773G;

    /* renamed from: H, reason: collision with root package name */
    public long f13774H;

    /* renamed from: I, reason: collision with root package name */
    public C1684l f13775I;

    /* renamed from: J, reason: collision with root package name */
    public C1682j f13776J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f13777K;

    /* renamed from: L, reason: collision with root package name */
    public e0.k f13778L;

    /* renamed from: M, reason: collision with root package name */
    public x4.s0 f13779M;

    /* renamed from: N, reason: collision with root package name */
    public final C1423b f13780N;

    /* renamed from: t, reason: collision with root package name */
    public C1682j f13781t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1455r0 f13782u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13783v;

    /* renamed from: w, reason: collision with root package name */
    public String f13784w;

    /* renamed from: x, reason: collision with root package name */
    public P0.i f13785x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13786y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1193a f13787z;

    public r(C1682j c1682j, InterfaceC1455r0 interfaceC1455r0, boolean z5, boolean z6, String str, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        this.f13781t = c1682j;
        this.f13782u = interfaceC1455r0;
        this.f13783v = z5;
        this.f13784w = str;
        this.f13785x = iVar;
        this.f13786y = z6;
        this.f13787z = interfaceC1193a;
        this.f13767A = new C1424b0(c1682j, 0, new D.P0(1, this, r.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 11));
        C1151E c1151e = AbstractC1171s.a;
        this.f13773G = new C1151E();
        this.f13774H = 0L;
        C1682j c1682j2 = this.f13781t;
        this.f13776J = c1682j2;
        this.f13777K = c1682j2 == null;
        this.f13780N = f13766O;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        i0();
        if (!this.f13777K) {
            W0();
        }
        if (this.f13786y) {
            M0(this.f13767A);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    @Override // z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.W0()
            long r0 = z0.AbstractC2015c.b(r11)
            boolean r2 = r10.f13786y
            r3 = 3
            r4 = 0
            k.E r5 = r10.f13773G
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = z0.AbstractC2015c.c(r11)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = p.AbstractC1464z.p(r11)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            t.l r2 = new t.l
            long r8 = r10.f13774H
            r2.<init>(r8)
            r5.h(r0, r2)
            t.j r0 = r10.f13781t
            if (r0 == 0) goto L3e
            x4.y r0 = r10.A0()
            p.n r1 = new p.n
            r1.<init>(r10, r2, r4)
            x4.AbstractC1888A.y(r0, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r10.Y0(r11)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r10.f13786y
            if (r2 == 0) goto L78
            int r2 = z0.AbstractC2015c.c(r11)
            if (r2 != r6) goto L78
            boolean r2 = p.AbstractC1464z.p(r11)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.g(r0)
            t.l r0 = (t.C1684l) r0
            if (r0 == 0) goto L75
            t.j r1 = r10.f13781t
            if (r1 == 0) goto L72
            x4.y r1 = r10.A0()
            p.o r2 = new p.o
            r2.<init>(r10, r0, r4)
            x4.AbstractC1888A.y(r1, r4, r2, r3)
        L72:
            r10.Z0(r11)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r.F(android.view.KeyEvent):boolean");
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        S0();
        if (this.f13776J == null) {
            this.f13781t = null;
        }
        InterfaceC0155j interfaceC0155j = this.f13770D;
        if (interfaceC0155j != null) {
            N0(interfaceC0155j);
        }
        this.f13770D = null;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        P0.i iVar = this.f13785x;
        if (iVar != null) {
            P0.v.e(xVar, iVar.a);
        }
        String str = this.f13784w;
        C1421a c1421a = new C1421a(this, 1);
        s4.e[] eVarArr = P0.v.a;
        xVar.a(P0.l.f4467b, new P0.a(str, c1421a));
        if (this.f13786y) {
            this.f13767A.I(xVar);
        } else {
            xVar.a(P0.t.f4530i, X3.y.a);
        }
        P0(xVar);
    }

    public void L() {
        C1679g c1679g;
        C1682j c1682j = this.f13781t;
        if (c1682j != null && (c1679g = this.f13772F) != null) {
            c1682j.b(new C1680h(c1679g));
        }
        this.f13772F = null;
        B0.X x5 = this.f13769C;
        if (x5 != null) {
            x5.L();
        }
    }

    public void P0(P0.x xVar) {
    }

    public abstract B0.X Q0();

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.r, java.lang.Object] */
    public final boolean R0() {
        Object obj = new Object();
        AbstractC0157l.y(this, C1566f1.f14315s, new C0311h0(obj, 1));
        if (!obj.f12968c) {
            int i6 = K.f13595b;
            ViewParent parent = AbstractC0157l.x(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    public final void S0() {
        C1682j c1682j = this.f13781t;
        C1151E c1151e = this.f13773G;
        if (c1682j != null) {
            C1684l c1684l = this.f13771E;
            if (c1684l != null) {
                c1682j.b(new C1683k(c1684l));
            }
            C1684l c1684l2 = this.f13775I;
            if (c1684l2 != null) {
                c1682j.b(new C1683k(c1684l2));
            }
            C1679g c1679g = this.f13772F;
            if (c1679g != null) {
                c1682j.b(new C1680h(c1679g));
            }
            Object[] objArr = c1151e.f12448c;
            long[] jArr = c1151e.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j3 = jArr[i6];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((255 & j3) < 128) {
                                c1682j.b(new C1683k((C1684l) objArr[(i6 << 3) + i8]));
                            }
                            j3 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        this.f13771E = null;
        this.f13775I = null;
        this.f13772F = null;
        c1151e.a();
    }

    public final void T0(boolean z5) {
        C1682j c1682j = this.f13781t;
        if (c1682j != null) {
            x4.s0 s0Var = this.f13779M;
            if (s0Var == null || !s0Var.d()) {
                C1684l c1684l = z5 ? this.f13775I : this.f13771E;
                if (c1684l != null) {
                    C1683k c1683k = new C1683k(c1684l);
                    InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) ((C4.c) A0()).f686c.r(C1940w.f15731e);
                    AbstractC1888A.y(A0(), null, new C1433g(c1682j, c1683k, interfaceC1922e0 != null ? interfaceC1922e0.S(new Z2.X(9, c1682j, c1683k)) : null, null), 3);
                }
            } else {
                x4.s0 s0Var2 = this.f13779M;
                if (s0Var2 != null) {
                    s0Var2.f(null);
                }
            }
            if (z5) {
                this.f13775I = null;
            } else {
                this.f13771E = null;
            }
        }
    }

    public final void U0(long j3, boolean z5) {
        C1682j c1682j = this.f13781t;
        if (c1682j != null) {
            x4.s0 s0Var = this.f13779M;
            if (s0Var == null || !s0Var.d()) {
                C1684l c1684l = z5 ? this.f13775I : this.f13771E;
                if (c1684l != null) {
                    AbstractC1888A.y(A0(), null, new C1437i(null, c1682j, c1684l), 3);
                }
            } else {
                s0Var.f(null);
                AbstractC1888A.y(A0(), null, new C1435h(s0Var, j3, c1682j, null), 3);
            }
            if (z5) {
                this.f13775I = null;
            } else {
                this.f13771E = null;
            }
        }
    }

    public final void V0(long j3, boolean z5) {
        C1682j c1682j = this.f13781t;
        if (c1682j != null) {
            C1684l c1684l = new C1684l(j3);
            if (R0()) {
                this.f13779M = AbstractC1888A.y(A0(), null, new C1439j(c1682j, c1684l, z5, this, null), 3);
                return;
            }
            if (z5) {
                this.f13775I = c1684l;
            } else {
                this.f13771E = c1684l;
            }
            AbstractC1888A.y(A0(), null, new C1441k(null, c1682j, c1684l), 3);
        }
    }

    public final void W0() {
        if (this.f13770D != null) {
            return;
        }
        InterfaceC1455r0 interfaceC1455r0 = this.f13783v ? this.f13768B : this.f13782u;
        if (interfaceC1455r0 != null) {
            if (this.f13781t == null) {
                this.f13781t = new C1682j();
            }
            this.f13767A.R0(this.f13781t);
            C1682j c1682j = this.f13781t;
            AbstractC1276k.c(c1682j);
            InterfaceC0155j a = interfaceC1455r0.a(c1682j);
            M0(a);
            this.f13770D = a;
        }
    }

    public void X0() {
    }

    public abstract boolean Y0(KeyEvent keyEvent);

    public abstract void Z0(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r3.f13770D == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1(t.C1682j r4, p.InterfaceC1455r0 r5, boolean r6, boolean r7, java.lang.String r8, P0.i r9, l4.InterfaceC1193a r10) {
        /*
            r3 = this;
            t.j r0 = r3.f13776J
            boolean r0 = m4.AbstractC1276k.b(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.S0()
            r3.f13776J = r4
            r3.f13781t = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            p.r0 r0 = r3.f13782u
            boolean r0 = m4.AbstractC1276k.b(r0, r5)
            if (r0 != 0) goto L1f
            r3.f13782u = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f13783v
            if (r5 == r6) goto L2b
            r3.f13783v = r6
            if (r6 == 0) goto L2a
            r3.i0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.f13786y
            p.b0 r6 = r3.f13767A
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.M0(r6)
            goto L3d
        L37:
            r3.N0(r6)
            r3.S0()
        L3d:
            H0.AbstractC0157l.m(r3)
            r3.f13786y = r7
        L42:
            java.lang.String r5 = r3.f13784w
            boolean r5 = m4.AbstractC1276k.b(r5, r8)
            if (r5 != 0) goto L4f
            r3.f13784w = r8
            H0.AbstractC0157l.m(r3)
        L4f:
            P0.i r5 = r3.f13785x
            boolean r5 = m4.AbstractC1276k.b(r5, r9)
            if (r5 != 0) goto L5c
            r3.f13785x = r9
            H0.AbstractC0157l.m(r3)
        L5c:
            r3.f13787z = r10
            boolean r5 = r3.f13777K
            t.j r7 = r3.f13776J
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.f13777K = r2
            if (r2 != 0) goto L75
            H0.j r5 = r3.f13770D
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            H0.j r4 = r3.f13770D
            if (r4 != 0) goto L80
            boolean r5 = r3.f13777K
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.N0(r4)
        L85:
            r4 = 0
            r3.f13770D = r4
            r3.W0()
        L8b:
            t.j r4 = r3.f13781t
            r6.R0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r.a1(t.j, p.r0, boolean, boolean, java.lang.String, P0.i, l4.a):void");
    }

    @Override // y0.c
    public final void f0() {
        e0.k kVar = this.f13778L;
        if (kVar != null) {
            kVar.t();
        }
    }

    @Override // H0.m0
    public final void i0() {
        if (this.f13783v) {
            AbstractC0157l.r(this, new C1421a(this, 0));
        }
    }

    @Override // z0.e
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // H0.F0
    public final Object m() {
        return this.f13780N;
    }

    @Override // y0.c
    public final void v0(C0316k c0316k, EnumC0041q enumC0041q) {
        ArrayList arrayList = (ArrayList) c0316k.f4140c;
        W0();
        if (this.f13786y) {
            if (this.f13778L == null) {
                this.f13778L = new e0.k(this);
            }
            e0.k kVar = this.f13778L;
            if (kVar != null) {
                InterfaceC1193a interfaceC1193a = this.f13787z;
                r rVar = (r) kVar.f11564e;
                int i6 = 0;
                if (enumC0041q != EnumC0041q.f476e) {
                    if (enumC0041q != EnumC0041q.f477f || ((y0.b) kVar.f11565f) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i6 < size) {
                        y0.b bVar = (y0.b) arrayList.get(i6);
                        if (bVar.f15966i && !bVar.equals((y0.b) kVar.f11565f)) {
                            kVar.t();
                            return;
                        }
                        i6++;
                    }
                    return;
                }
                y0.b bVar2 = (y0.b) kVar.f11565f;
                if (bVar2 == null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        y0.b bVar3 = (y0.b) arrayList.get(i7);
                        if (!bVar3.f15965h && bVar3.f15961d) {
                            y0.b bVar4 = (y0.b) arrayList.get(0);
                            kVar.f11565f = bVar4;
                            rVar.V0(bVar4.f15960c, true);
                            bVar4.f15966i = true;
                            return;
                        }
                    }
                    return;
                }
                long j3 = bVar2.f15960c;
                int size3 = arrayList.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    y0.b bVar5 = (y0.b) arrayList.get(i8);
                    if (bVar5.f15965h && bVar5.f15961d) {
                        if (Math.abs(C1353b.d(C1353b.e(((y0.b) arrayList.get(0)).f15960c, j3))) > ((X0) AbstractC0157l.h(rVar, AbstractC0204q0.f2369s)).f()) {
                            kVar.t();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    y0.b bVar6 = (y0.b) arrayList.get(i9);
                    if (bVar6.f15966i || !bVar6.f15965h || bVar6.f15961d) {
                        int size5 = arrayList.size();
                        while (i6 < size5) {
                            if (((y0.b) arrayList.get(i6)).f15966i) {
                                kVar.t();
                                return;
                            }
                            i6++;
                        }
                        return;
                    }
                }
                ((y0.b) arrayList.get(0)).f15966i = true;
                rVar.U0(j3, true);
                interfaceC1193a.b();
                kVar.f11565f = null;
            }
        }
    }

    public void w(C0040p c0040p, EnumC0041q enumC0041q, long j3) {
        B0.X Q02;
        long j4 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        this.f13774H = (Float.floatToRawIntBits((int) (j4 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j4 & 4294967295L)) & 4294967295L);
        W0();
        if (this.f13786y && enumC0041q == EnumC0041q.f476e) {
            int i6 = c0040p.f474f;
            if (i6 == 4) {
                AbstractC1888A.y(A0(), null, new C1451p(this, null), 3);
            } else if (i6 == 5) {
                AbstractC1888A.y(A0(), null, new C1453q(this, null), 3);
            }
        }
        if (this.f13769C == null && (Q02 = Q0()) != null) {
            M0(Q02);
            this.f13769C = Q02;
        }
        B0.X x5 = this.f13769C;
        if (x5 != null) {
            x5.w(c0040p, enumC0041q, j3);
        }
    }

    @Override // H0.A0
    public final boolean x0() {
        return true;
    }
}
