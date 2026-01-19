package T;

import D.o1;
import H0.C0166v;
import U.C0670a;
import U.C0671b;
import U.C0672c;
import U.C0674e;
import U.C0681l;
import U.C0682m;
import android.os.Trace;
import b0.C0878k;
import b4.C0911i;
import b4.InterfaceC0910h;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.AbstractC0992o;
import g0.C1013a;
import g0.InterfaceC1015c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import k.C1147A;
import k.C1177y;
import l.AbstractC1180a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import o4.AbstractC1410a;

/* renamed from: T.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626q {

    /* renamed from: A, reason: collision with root package name */
    public int f8145A;

    /* renamed from: B, reason: collision with root package name */
    public int f8146B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8147C;

    /* renamed from: D, reason: collision with root package name */
    public final C0624p f8148D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f8149E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8150F;

    /* renamed from: G, reason: collision with root package name */
    public I0 f8151G;

    /* renamed from: H, reason: collision with root package name */
    public J0 f8152H;

    /* renamed from: I, reason: collision with root package name */
    public M0 f8153I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8154J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC0617l0 f8155K;

    /* renamed from: L, reason: collision with root package name */
    public C0670a f8156L;

    /* renamed from: M, reason: collision with root package name */
    public final C0671b f8157M;

    /* renamed from: N, reason: collision with root package name */
    public C0594a f8158N;

    /* renamed from: O, reason: collision with root package name */
    public C0672c f8159O;

    /* renamed from: P, reason: collision with root package name */
    public G0 f8160P;

    /* renamed from: Q, reason: collision with root package name */
    public final g0.d f8161Q;

    /* renamed from: R, reason: collision with root package name */
    public final InterfaceC0910h f8162R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f8163S;

    /* renamed from: T, reason: collision with root package name */
    public long f8164T;

    /* renamed from: U, reason: collision with root package name */
    public C0637w f8165U;
    public final H0.G0 a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0633u f8166b;

    /* renamed from: c, reason: collision with root package name */
    public final J0 f8167c;

    /* renamed from: d, reason: collision with root package name */
    public final k.P f8168d;

    /* renamed from: e, reason: collision with root package name */
    public final C0670a f8169e;

    /* renamed from: f, reason: collision with root package name */
    public final C0670a f8170f;

    /* renamed from: g, reason: collision with root package name */
    public final A3.c f8171g;

    /* renamed from: h, reason: collision with root package name */
    public final C0639x f8172h;

    /* renamed from: j, reason: collision with root package name */
    public C0615k0 f8174j;

    /* renamed from: k, reason: collision with root package name */
    public int f8175k;

    /* renamed from: l, reason: collision with root package name */
    public int f8176l;

    /* renamed from: m, reason: collision with root package name */
    public int f8177m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f8179o;

    /* renamed from: p, reason: collision with root package name */
    public C1177y f8180p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8181q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8182r;

    /* renamed from: v, reason: collision with root package name */
    public C1147A f8186v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8187w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8189y;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f8173i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final C0166v f8178n = new C0166v();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f8183s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final C0166v f8184t = new C0166v();

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0617l0 f8185u = C0878k.f10988g;

    /* renamed from: x, reason: collision with root package name */
    public final C0166v f8188x = new C0166v();

    /* renamed from: z, reason: collision with root package name */
    public int f8190z = -1;

    public C0626q(H0.G0 g02, AbstractC0633u abstractC0633u, J0 j02, k.P p5, C0670a c0670a, C0670a c0670a2, A3.c cVar, C0639x c0639x) {
        this.a = g02;
        this.f8166b = abstractC0633u;
        this.f8167c = j02;
        this.f8168d = p5;
        this.f8169e = c0670a;
        this.f8170f = c0670a2;
        this.f8171g = cVar;
        this.f8172h = c0639x;
        this.f8147C = abstractC0633u.f() || abstractC0633u.d();
        this.f8148D = new C0624p(this, 0);
        this.f8149E = new ArrayList();
        I0 c6 = j02.c();
        c6.c();
        this.f8151G = c6;
        J0 j03 = new J0();
        if (abstractC0633u.f()) {
            j03.b();
        }
        if (abstractC0633u.d()) {
            j03.f7976n = new C1147A();
        }
        this.f8152H = j03;
        M0 d6 = j03.d();
        d6.e(true);
        this.f8153I = d6;
        this.f8157M = new C0671b(this, c0670a);
        I0 c7 = this.f8152H.c();
        try {
            C0594a a = c7.a(0);
            c7.c();
            this.f8158N = a;
            this.f8159O = new C0672c();
            this.f8161Q = new g0.d(this);
            InterfaceC0910h j3 = abstractC0633u.j();
            InterfaceC0910h C5 = C();
            this.f8162R = j3.Y(C5 == null ? C0911i.f11057c : C5);
        } catch (Throwable th) {
            c7.c();
            throw th;
        }
    }

    public static final int R(C0626q c0626q, int i6, boolean z5, int i7) {
        I0 i02 = c0626q.f8151G;
        C0671b c0671b = c0626q.f8157M;
        boolean j3 = i02.j(i6);
        int[] iArr = i02.f7953b;
        if (j3) {
            int i8 = i02.i(i6);
            Object p5 = i02.p(iArr, i6);
            if (i8 == 206 && AbstractC1276k.b(p5, AbstractC0629s.f8204e)) {
                Object h3 = i02.h(i6, 0);
                C0 c02 = h3 instanceof C0 ? (C0) h3 : null;
                Object obj = c02 != null ? c02.a : null;
                C0620n c0620n = obj instanceof C0620n ? (C0620n) obj : null;
                if (c0620n != null) {
                    for (C0626q c0626q2 : c0620n.f8130c.f8136e) {
                        J0 j02 = c0626q2.f8167c;
                        if (j02.f7967e > 0 && (j02.f7966c[1] & PegdownExtensions.MULTI_LINE_IMAGE_URLS) != 0) {
                            C0639x c0639x = c0626q2.f8172h;
                            synchronized (c0639x.f8237g) {
                                c0639x.p();
                                k.M m3 = c0639x.f8247q;
                                c0639x.f8247q = Y4.l.t();
                                try {
                                    c0639x.f8255y.i0(m3);
                                } finally {
                                }
                            }
                            C0670a c0670a = new C0670a();
                            c0626q2.f8156L = c0670a;
                            I0 c6 = c0626q2.f8167c.c();
                            try {
                                c0626q2.f8151G = c6;
                                C0671b c0671b2 = c0626q2.f8157M;
                                C0670a c0670a2 = c0671b2.f8557b;
                                try {
                                    c0671b2.f8557b = c0670a;
                                    c0626q2.Q(0);
                                    C0671b c0671b3 = c0626q2.f8157M;
                                    c0671b3.b();
                                    if (c0671b3.f8558c) {
                                        c0671b3.f8557b.f8556c.W(U.C.f8538c);
                                        if (c0671b3.f8558c) {
                                            c0671b3.d(false);
                                            c0671b3.d(false);
                                            c0671b3.f8557b.f8556c.W(C0682m.f8579c);
                                            c0671b3.f8558c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                c6.c();
                            }
                        }
                        c0626q.f8166b.r(c0626q2.f8172h);
                    }
                }
                return i02.o(i6);
            }
            if (!i02.l(i6)) {
                return i02.o(i6);
            }
        } else if (i02.d(i6)) {
            int i9 = iArr[(i6 * 5) + 3] + i6;
            int i10 = 0;
            for (int i11 = i6 + 1; i11 < i9; i11 += iArr[(i11 * 5) + 3]) {
                boolean l3 = i02.l(i11);
                if (l3) {
                    c0671b.c();
                    Object n3 = i02.n(i11);
                    c0671b.c();
                    c0671b.f8563h.add(n3);
                }
                i10 += R(c0626q, i11, l3 || z5, l3 ? 0 : i7 + i10);
                if (l3) {
                    c0671b.c();
                    c0671b.a();
                }
            }
            if (!i02.l(i6)) {
                return i10;
            }
        } else if (!i02.l(i6)) {
            return i02.o(i6);
        }
        return 1;
    }

    public final C0627q0 A() {
        if (this.f8145A != 0) {
            return null;
        }
        ArrayList arrayList = this.f8149E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C0627q0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean B() {
        if (!E() || this.f8187w) {
            return true;
        }
        C0627q0 A5 = A();
        return (A5 == null || (A5.f8191b & 4) == 0) ? false : true;
    }

    public final g0.d C() {
        if (this.f8166b.k()) {
            return this.f8161Q;
        }
        return null;
    }

    public final boolean D() {
        return this.f8163S;
    }

    public final boolean E() {
        C0627q0 A5;
        return (this.f8163S || this.f8189y || this.f8187w || (A5 = A()) == null || (A5.f8191b & 8) != 0) ? false : true;
    }

    public final void F(ArrayList arrayList) {
        C0670a c0670a = this.f8170f;
        C0671b c0671b = this.f8157M;
        C0670a c0670a2 = c0671b.f8557b;
        try {
            c0671b.f8557b = c0670a;
            c0670a.f8556c.W(U.A.f8536c);
            if (arrayList.size() <= 0) {
                c0671b.b();
                c0671b.f8557b.f8556c.W(U.n.f8580c);
                c0671b.f8561f = 0;
            } else {
                X3.i iVar = (X3.i) arrayList.get(0);
                W w5 = (W) iVar.f9393c;
                w5.getClass();
                throw null;
            }
        } finally {
            c0671b.f8557b = c0670a2;
        }
    }

    public final void G(InterfaceC0617l0 interfaceC0617l0, Object obj) {
        Z(126665345, null);
        H();
        n0(obj);
        long j3 = this.f8164T;
        try {
            this.f8164T = 126665345;
            if (this.f8163S) {
                M0.z(this.f8153I);
            }
            boolean z5 = (this.f8163S || AbstractC1276k.b(this.f8151G.f(), interfaceC0617l0)) ? false : true;
            if (z5) {
                N(interfaceC0617l0);
            }
            W(202, 0, AbstractC0629s.f8202c, interfaceC0617l0);
            this.f8155K = null;
            this.f8187w = z5;
            throw null;
        } finally {
        }
    }

    public final Object H() {
        boolean z5 = this.f8163S;
        C0602e c0602e = C0616l.a;
        if (!z5) {
            Object m3 = this.f8151G.m();
            if (!this.f8189y || (m3 instanceof F0)) {
                return m3;
            }
        } else if (this.f8182r) {
            AbstractC0629s.a("A call to createNode(), emitNode() or useNode() expected");
            return c0602e;
        }
        return c0602e;
    }

    public final List I() {
        AbstractC0633u abstractC0633u = this.f8166b;
        InterfaceC0631t h3 = abstractC0633u.h();
        C0639x c0639x = h3 != null ? (C0639x) h3 : null;
        if (c0639x != null) {
            J0 j02 = c0639x.f8239i;
            I0 c6 = j02.c();
            try {
                Integer t5 = AbstractC1410a.t(c6, abstractC0633u, 0, c6.f7954c);
                if (t5 != null) {
                    c6 = j02.c();
                    try {
                        ArrayList T5 = AbstractC1410a.T(c6, t5.intValue(), 0);
                        c6.c();
                        return Y3.m.z0(T5, c0639x.f8255y.I());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return Y3.v.f9812c;
    }

    public final int J(int i6) {
        int q3 = this.f8151G.q(i6) + 1;
        int i7 = 0;
        while (q3 < i6) {
            if (!this.f8151G.k(q3)) {
                i7++;
            }
            q3 += L0.a(this.f8151G.f7953b, q3);
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(T.C0639x r9, T.C0639x r10, java.lang.Integer r11, java.util.List r12, l4.InterfaceC1193a r13) {
        /*
            r8 = this;
            boolean r0 = r8.f8150F
            int r1 = r8.f8175k
            r2 = 1
            r8.f8150F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f8175k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            X3.i r6 = (X3.i) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f9393c     // Catch: java.lang.Throwable -> L24
            T.q0 r7 = (T.C0627q0) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f9394e     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.h0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.h0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.f8251u = r10     // Catch: java.lang.Throwable -> L24
            r9.f8252v = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L4d
            r9.f8251u = r5     // Catch: java.lang.Throwable -> L24
            r9.f8252v = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.f8251u = r5     // Catch: java.lang.Throwable -> L24
            r9.f8252v = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.f8150F = r0
            r8.f8175k = r1
            return r10
        L62:
            r8.f8150F = r0
            r8.f8175k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0626q.K(T.x, T.x, java.lang.Integer, java.util.List, l4.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f8009b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0626q.L():void");
    }

    public final void M() {
        int i6;
        Q(this.f8151G.f7958g);
        C0671b c0671b = this.f8157M;
        c0671b.d(false);
        C0166v c0166v = c0671b.f8559d;
        C0626q c0626q = c0671b.a;
        I0 i02 = c0626q.f8151G;
        if (i02.f7954c > 0 && c0166v.a(-2) != (i6 = i02.f7960i)) {
            if (!c0671b.f8558c && c0671b.f8560e) {
                c0671b.d(false);
                c0671b.f8557b.f8556c.W(U.q.f8583c);
                c0671b.f8558c = true;
            }
            if (i6 > 0) {
                C0594a a = i02.a(i6);
                c0166v.c(i6);
                c0671b.d(false);
                U.M m3 = c0671b.f8557b.f8556c;
                m3.W(U.p.f8582c);
                AbstractC1410a.Q(m3, 0, a);
                c0671b.f8558c = true;
            }
        }
        c0671b.f8557b.f8556c.W(U.y.f8595c);
        int i7 = c0671b.f8561f;
        I0 i03 = c0626q.f8151G;
        c0671b.f8561f = i03.f7953b[(i03.f7958g * 5) + 3] + i7;
    }

    public final void N(InterfaceC0617l0 interfaceC0617l0) {
        C1147A c1147a = this.f8186v;
        if (c1147a == null) {
            c1147a = new C1147A();
            this.f8186v = c1147a;
        }
        c1147a.i(this.f8151G.f7958g, interfaceC0617l0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(int r7, int r8, int r9) {
        /*
            r6 = this;
            T.I0 r0 = r6.f8151G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            U.b r1 = r6.f8157M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0626q.O(int, int, int):void");
    }

    public final Object P() {
        boolean z5 = this.f8163S;
        C0602e c0602e = C0616l.a;
        if (!z5) {
            Object m3 = this.f8151G.m();
            if (!this.f8189y || (m3 instanceof F0)) {
                return m3 instanceof C0 ? ((C0) m3).a : m3;
            }
        } else if (this.f8182r) {
            AbstractC0629s.a("A call to createNode(), emitNode() or useNode() expected");
            return c0602e;
        }
        return c0602e;
    }

    public final void Q(int i6) {
        boolean l3 = this.f8151G.l(i6);
        C0671b c0671b = this.f8157M;
        if (l3) {
            c0671b.c();
            Object n3 = this.f8151G.n(i6);
            c0671b.c();
            c0671b.f8563h.add(n3);
        }
        R(this, i6, l3, 0);
        c0671b.c();
        if (l3) {
            c0671b.a();
        }
    }

    public final boolean S(int i6, boolean z5) {
        C0627q0 A5;
        if ((i6 & 1) == 0 && (this.f8163S || this.f8189y)) {
            G0 g02 = this.f8160P;
            if (g02 != null && (A5 = A()) != null && g02.b()) {
                int i7 = A5.f8191b;
                if ((i7 & PegdownExtensions.STRIKETHROUGH) != 0) {
                    return true;
                }
                int i8 = i7 | 1;
                A5.f8191b = i8;
                A5.f8191b = (this.f8189y ? i7 | 129 : i8 & (-129)) | PegdownExtensions.WIKILINKS;
                U.M m3 = this.f8157M.f8557b.f8556c;
                m3.W(U.x.f8594c);
                AbstractC1410a.Q(m3, 0, A5);
                this.f8166b.q(A5);
                return false;
            }
        } else if (!z5 && E()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0626q.T():void");
    }

    public final void U() {
        I0 i02 = this.f8151G;
        int i6 = i02.f7960i;
        this.f8176l = i6 >= 0 ? i02.f7953b[(i6 * 5) + 1] & 67108863 : 0;
        i02.t();
    }

    public final void V() {
        if (this.f8176l != 0) {
            AbstractC0629s.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f8163S) {
            return;
        }
        C0627q0 A5 = A();
        if (A5 != null) {
            int i6 = A5.f8191b;
            if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
                A5.f8191b = i6 | 16;
            }
        }
        if (this.f8183s.isEmpty()) {
            U();
        } else {
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0626q.W(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void X() {
        W(-127, 0, null, null);
    }

    public final void Y(int i6, C0595a0 c0595a0) {
        W(i6, 0, c0595a0, null);
    }

    public final void Z(int i6, Object obj) {
        W(i6, 0, obj, null);
    }

    public final void a() {
        i();
        this.f8173i.clear();
        this.f8178n.f2001b = 0;
        this.f8184t.f2001b = 0;
        this.f8188x.f2001b = 0;
        this.f8186v = null;
        C0672c c0672c = this.f8159O;
        c0672c.f8569d.S();
        c0672c.f8568c.S();
        this.f8164T = 0;
        this.f8145A = 0;
        this.f8182r = false;
        this.f8163S = false;
        this.f8189y = false;
        this.f8150F = false;
        this.f8190z = -1;
        I0 i02 = this.f8151G;
        if (!i02.f7957f) {
            i02.c();
        }
        if (this.f8153I.f8007w) {
            return;
        }
        x();
    }

    public final void a0(Object obj, boolean z5) {
        if (z5) {
            I0 i02 = this.f8151G;
            if (i02.f7962k <= 0) {
                if ((i02.f7953b[(i02.f7958g * 5) + 1] & 1073741824) == 0) {
                    AbstractC0619m0.a("Expected a node group");
                }
                i02.u();
                return;
            }
            return;
        }
        if (obj != null && this.f8151G.f() != obj) {
            C0671b c0671b = this.f8157M;
            c0671b.getClass();
            c0671b.d(false);
            U.M m3 = c0671b.f8557b.f8556c;
            m3.W(U.F.f8541c);
            AbstractC1410a.Q(m3, 0, obj);
        }
        this.f8151G.u();
    }

    public final void b(Object obj, l4.e eVar) {
        if (this.f8163S) {
            U.M m3 = this.f8159O.f8568c;
            m3.W(U.G.f8542c);
            AbstractC1410a.Q(m3, 0, obj);
            AbstractC1276k.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            AbstractC1291z.b(2, eVar);
            AbstractC1410a.Q(m3, 1, eVar);
            return;
        }
        C0671b c0671b = this.f8157M;
        c0671b.b();
        U.M m5 = c0671b.f8557b.f8556c;
        m5.W(U.G.f8542c);
        AbstractC1276k.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        AbstractC1291z.b(2, eVar);
        AbstractC1410a.R(m5, 0, obj, 1, eVar);
    }

    public final void b0(int i6) {
        int i7;
        int i8;
        if (this.f8174j != null) {
            W(i6, 0, null, null);
            return;
        }
        if (this.f8182r) {
            AbstractC0629s.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f8164T = Long.rotateLeft(Long.rotateLeft(this.f8164T, 3) ^ i6, 3) ^ this.f8177m;
        this.f8177m++;
        I0 i02 = this.f8151G;
        boolean z5 = this.f8163S;
        C0602e c0602e = C0616l.a;
        if (z5) {
            i02.f7962k++;
            this.f8153I.Q(c0602e, false, c0602e, i6);
            w(false, null);
            return;
        }
        if (i02.g() == i6 && ((i8 = i02.f7958g) >= i02.f7959h || (i02.f7953b[(i8 * 5) + 1] & PegdownExtensions.NOT_USED) == 0)) {
            i02.u();
            w(false, null);
            return;
        }
        if (i02.f7962k <= 0 && (i7 = i02.f7958g) != i02.f7959h) {
            int i9 = this.f8175k;
            M();
            this.f8157M.e(i9, i02.s());
            r.k(this.f8183s, i7, i02.f7958g);
        }
        i02.f7962k++;
        this.f8163S = true;
        this.f8155K = null;
        if (this.f8153I.f8007w) {
            M0 d6 = this.f8152H.d();
            this.f8153I = d6;
            d6.M();
            this.f8154J = false;
            this.f8155K = null;
        }
        M0 m02 = this.f8153I;
        m02.d();
        int i10 = m02.f8004t;
        m02.Q(c0602e, false, c0602e, i6);
        this.f8158N = m02.b(i10);
        w(false, null);
    }

    public final boolean c(float f6) {
        Object H3 = H();
        if ((H3 instanceof Float) && f6 == ((Number) H3).floatValue()) {
            return false;
        }
        n0(Float.valueOf(f6));
        return true;
    }

    public final void c0(int i6) {
        W(i6, 0, null, null);
    }

    public final boolean d(int i6) {
        Object H3 = H();
        if ((H3 instanceof Integer) && i6 == ((Number) H3).intValue()) {
            return false;
        }
        n0(Integer.valueOf(i6));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T.C0626q d0(int r7) {
        /*
            r6 = this;
            r6.b0(r7)
            boolean r7 = r6.f8163S
            A3.c r0 = r6.f8171g
            java.util.ArrayList r1 = r6.f8149E
            T.x r2 = r6.f8172h
            if (r7 == 0) goto L26
            T.q0 r7 = new T.q0
            r7.<init>(r2)
            r1.add(r7)
            r6.n0(r7)
            int r1 = r6.f8146B
            r7.f8194e = r1
            int r1 = r7.f8191b
            r1 = r1 & (-17)
            r7.f8191b = r1
            r0.i()
            return r6
        L26:
            T.I0 r7 = r6.f8151G
            int r7 = r7.f7960i
            java.util.ArrayList r3 = r6.f8183s
            int r7 = T.r.t(r3, r7)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            T.N r7 = (T.N) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            T.I0 r3 = r6.f8151G
            java.lang.Object r3 = r3.m()
            T.e r4 = T.C0616l.a
            boolean r4 = m4.AbstractC1276k.b(r3, r4)
            if (r4 == 0) goto L51
            T.q0 r3 = new T.q0
            r3.<init>(r2)
            r6.n0(r3)
            goto L58
        L51:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            m4.AbstractC1276k.d(r3, r2)
            T.q0 r3 = (T.C0627q0) r3
        L58:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L70
            int r7 = r3.f8191b
            r5 = r7 & 64
            if (r5 == 0) goto L64
            r5 = r4
            goto L65
        L64:
            r5 = r2
        L65:
            if (r5 == 0) goto L6b
            r7 = r7 & (-65)
            r3.f8191b = r7
        L6b:
            if (r5 == 0) goto L6e
            goto L70
        L6e:
            r7 = r2
            goto L71
        L70:
            r7 = r4
        L71:
            int r5 = r3.f8191b
            if (r7 == 0) goto L78
            r7 = r5 | 8
            goto L7a
        L78:
            r7 = r5 & (-9)
        L7a:
            r3.f8191b = r7
            r1.add(r3)
            int r7 = r6.f8146B
            r3.f8194e = r7
            int r7 = r3.f8191b
            r7 = r7 & (-17)
            r3.f8191b = r7
            r0.i()
            int r7 = r3.f8191b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb6
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.175E-43)
            r3.f8191b = r7
            U.b r7 = r6.f8157M
            U.a r7 = r7.f8557b
            U.M r7 = r7.f8556c
            U.D r0 = U.D.f8539c
            r7.W(r0)
            o4.AbstractC1410a.Q(r7, r2, r3)
            boolean r7 = r6.f8189y
            if (r7 != 0) goto Lb6
            int r7 = r3.f8191b
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto Lb6
            r6.f8189y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f8191b = r7
        Lb6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0626q.d0(int):T.q");
    }

    public final boolean e(long j3) {
        Object H3 = H();
        if ((H3 instanceof Long) && j3 == ((Number) H3).longValue()) {
            return false;
        }
        n0(Long.valueOf(j3));
        return true;
    }

    public final void e0(Object obj) {
        if (!this.f8163S && this.f8151G.g() == 207 && !AbstractC1276k.b(this.f8151G.f(), obj) && this.f8190z < 0) {
            this.f8190z = this.f8151G.f7958g;
            this.f8189y = true;
        }
        W(207, 0, null, obj);
    }

    public final boolean f(Object obj) {
        if (AbstractC1276k.b(H(), obj)) {
            return false;
        }
        n0(obj);
        return true;
    }

    public final void f0() {
        W(125, 2, null, null);
        this.f8182r = true;
    }

    public final boolean g(boolean z5) {
        Object H3 = H();
        if ((H3 instanceof Boolean) && z5 == ((Boolean) H3).booleanValue()) {
            return false;
        }
        n0(Boolean.valueOf(z5));
        return true;
    }

    public final void g0() {
        this.f8177m = 0;
        this.f8151G = this.f8167c.c();
        W(100, 0, null, null);
        AbstractC0633u abstractC0633u = this.f8166b;
        abstractC0633u.t();
        InterfaceC0617l0 i6 = abstractC0633u.i();
        this.f8188x.c(this.f8187w ? 1 : 0);
        this.f8187w = f(i6);
        this.f8155K = null;
        if (!this.f8181q) {
            this.f8181q = abstractC0633u.e();
        }
        if (!this.f8147C) {
            this.f8147C = abstractC0633u.f();
        }
        if (this.f8147C) {
            e1 e1Var = g0.e.a;
            AbstractC1276k.d(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            i6 = ((C0878k) i6).c(e1Var, new f1(C()));
        }
        this.f8185u = i6;
        Set set = (Set) r.B(i6, g0.g.a);
        if (set != null) {
            set.add(y());
            abstractC0633u.o(set);
        }
        W(Long.hashCode(abstractC0633u.g()), 0, null, null);
    }

    public final boolean h(Object obj) {
        if (H() == obj) {
            return false;
        }
        n0(obj);
        return true;
    }

    public final boolean h0(C0627q0 c0627q0, Object obj) {
        C0594a c0594a = c0627q0.f8192c;
        if (c0594a == null) {
            return false;
        }
        int a = this.f8151G.a.a(c0594a);
        if (!this.f8150F || a < this.f8151G.f7958g) {
            return false;
        }
        ArrayList arrayList = this.f8183s;
        int t5 = r.t(arrayList, a);
        if (t5 < 0) {
            int i6 = -(t5 + 1);
            if (!(obj instanceof E)) {
                obj = null;
            }
            arrayList.add(i6, new N(c0627q0, a, obj));
            return true;
        }
        N n3 = (N) arrayList.get(t5);
        if (!(obj instanceof E)) {
            n3.f8010c = null;
            return true;
        }
        Object obj2 = n3.f8010c;
        if (obj2 == null) {
            n3.f8010c = obj;
            return true;
        }
        if (obj2 instanceof k.N) {
            ((k.N) obj2).a(obj);
            return true;
        }
        k.N n5 = k.W.a;
        k.N n6 = new k.N(2);
        n6.j(obj2);
        n6.j(obj);
        n3.f8010c = n6;
        return true;
    }

    public final void i() {
        this.f8174j = null;
        this.f8175k = 0;
        this.f8176l = 0;
        this.f8164T = 0L;
        this.f8182r = false;
        C0671b c0671b = this.f8157M;
        c0671b.f8558c = false;
        c0671b.f8559d.f2001b = 0;
        c0671b.f8561f = 0;
        c0671b.f8560e = true;
        c0671b.f8562g = 0;
        c0671b.f8563h.clear();
        c0671b.f8564i = -1;
        c0671b.f8565j = -1;
        c0671b.f8566k = -1;
        c0671b.f8567l = 0;
        this.f8149E.clear();
        this.f8179o = null;
        this.f8180p = null;
    }

    public final void i0(k.M m3) {
        ArrayList arrayList = this.f8183s;
        for (int C5 = Y4.l.C(arrayList); -1 < C5; C5--) {
            N n3 = (N) arrayList.get(C5);
            C0594a c0594a = n3.a.f8192c;
            if (c0594a == null || !c0594a.a()) {
                arrayList.remove(C5);
            } else {
                int i6 = n3.f8009b;
                int i7 = c0594a.a;
                if (i6 != i7) {
                    n3.f8009b = i7;
                }
            }
        }
        Object[] objArr = m3.f12485b;
        Object[] objArr2 = m3.f12486c;
        long[] jArr = m3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j3 = jArr[i8];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j3) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = objArr[i11];
                            Object obj2 = objArr2[i11];
                            AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            C0627q0 c0627q0 = (C0627q0) obj;
                            C0594a c0594a2 = c0627q0.f8192c;
                            if (c0594a2 != null) {
                                int i12 = c0594a2.a;
                                if (obj2 == C0602e.f8082i) {
                                    obj2 = null;
                                }
                                arrayList.add(new N(c0627q0, i12, obj2));
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        Y3.q.b0(arrayList, r.a);
    }

    public final Object j(AbstractC0623o0 abstractC0623o0) {
        return r.B(l(), abstractC0623o0);
    }

    public final void j0(int i6, int i7) {
        if (o0(i6) != i7) {
            if (i6 < 0) {
                C1177y c1177y = this.f8180p;
                if (c1177y == null) {
                    c1177y = new C1177y();
                    this.f8180p = c1177y;
                }
                c1177y.f(i6, i7);
                return;
            }
            int[] iArr = this.f8179o;
            if (iArr == null) {
                int i8 = this.f8151G.f7954c;
                int[] iArr2 = new int[i8];
                Arrays.fill(iArr2, 0, i8, -1);
                this.f8179o = iArr2;
                iArr = iArr2;
            }
            iArr[i6] = i7;
        }
    }

    public final void k(InterfaceC1193a interfaceC1193a) {
        if (!this.f8182r) {
            AbstractC0629s.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f8182r = false;
        if (!this.f8163S) {
            AbstractC0629s.a("createNode() can only be called when inserting");
        }
        C0166v c0166v = this.f8178n;
        int i6 = c0166v.a[c0166v.f2001b - 1];
        M0 m02 = this.f8153I;
        C0594a b5 = m02.b(m02.f8006v);
        this.f8176l++;
        C0672c c0672c = this.f8159O;
        U.M m3 = c0672c.f8568c;
        m3.W(U.r.f8584d);
        AbstractC1410a.Q(m3, 0, interfaceC1193a);
        m3.f8552e[m3.f8553f - m3.f8550c[m3.f8551d - 1].a] = i6;
        AbstractC1410a.Q(m3, 1, b5);
        U.M m5 = c0672c.f8569d;
        m5.W(U.r.f8585e);
        m5.f8552e[m5.f8553f - m5.f8550c[m5.f8551d - 1].a] = i6;
        AbstractC1410a.Q(m5, 0, b5);
    }

    public final void k0(int i6, int i7) {
        int o02 = o0(i6);
        if (o02 != i7) {
            int i8 = i7 - o02;
            ArrayList arrayList = this.f8173i;
            int size = arrayList.size() - 1;
            while (i6 != -1) {
                int o03 = o0(i6) + i8;
                j0(i6, o03);
                int i9 = size;
                while (true) {
                    if (-1 < i9) {
                        C0615k0 c0615k0 = (C0615k0) arrayList.get(i9);
                        if (c0615k0 != null && c0615k0.a(i6, o03)) {
                            size = i9 - 1;
                            break;
                        }
                        i9--;
                    } else {
                        break;
                    }
                }
                if (i6 < 0) {
                    i6 = this.f8151G.f7960i;
                } else if (this.f8151G.l(i6)) {
                    return;
                } else {
                    i6 = this.f8151G.q(i6);
                }
            }
        }
    }

    public final InterfaceC0617l0 l() {
        InterfaceC0617l0 interfaceC0617l0;
        InterfaceC0617l0 interfaceC0617l02 = this.f8155K;
        if (interfaceC0617l02 != null) {
            return interfaceC0617l02;
        }
        int i6 = this.f8151G.f7960i;
        boolean z5 = this.f8163S;
        C0595a0 c0595a0 = AbstractC0629s.f8202c;
        if (z5 && this.f8154J) {
            int i7 = this.f8153I.f8006v;
            while (i7 > 0) {
                if (this.f8153I.s(i7) == 202 && AbstractC1276k.b(this.f8153I.t(i7), c0595a0)) {
                    Object q3 = this.f8153I.q(i7);
                    AbstractC1276k.d(q3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC0617l0 interfaceC0617l03 = (InterfaceC0617l0) q3;
                    this.f8155K = interfaceC0617l03;
                    return interfaceC0617l03;
                }
                M0 m02 = this.f8153I;
                i7 = m02.E(m02.f7986b, i7);
            }
        }
        if (this.f8151G.f7954c > 0) {
            while (i6 > 0) {
                if (this.f8151G.i(i6) == 202) {
                    I0 i02 = this.f8151G;
                    if (AbstractC1276k.b(i02.p(i02.f7953b, i6), c0595a0)) {
                        C1147A c1147a = this.f8186v;
                        if (c1147a == null || (interfaceC0617l0 = (InterfaceC0617l0) c1147a.b(i6)) == null) {
                            I0 i03 = this.f8151G;
                            Object b5 = i03.b(i03.f7953b, i6);
                            AbstractC1276k.d(b5, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            interfaceC0617l0 = (InterfaceC0617l0) b5;
                        }
                        this.f8155K = interfaceC0617l0;
                        return interfaceC0617l0;
                    }
                }
                i6 = this.f8151G.q(i6);
            }
        }
        InterfaceC0617l0 interfaceC0617l04 = this.f8185u;
        this.f8155K = interfaceC0617l04;
        return interfaceC0617l04;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y.e, b0.j] */
    public final C0878k l0(InterfaceC0617l0 interfaceC0617l0, C0878k c0878k) {
        C0878k c0878k2 = (C0878k) interfaceC0617l0;
        c0878k2.getClass();
        ?? eVar = new Y.e(c0878k2);
        eVar.f10987j = c0878k2;
        eVar.putAll(c0878k);
        C0878k build = eVar.build();
        Y(204, AbstractC0629s.f8203d);
        H();
        n0(build);
        H();
        n0(c0878k);
        p(false);
        return build;
    }

    public final C1013a m() {
        Collection collection;
        if (!this.f8166b.k()) {
            return null;
        }
        Z3.b w5 = Y4.l.w();
        M0 m02 = this.f8153I;
        w5.addAll(AbstractC1410a.j(m02, null, m02.f8004t, null));
        I0 i02 = this.f8151G;
        boolean z5 = i02.f7957f;
        int[] iArr = i02.f7953b;
        if (z5 || i02.f7954c == 0) {
            collection = Y3.v.f9812c;
        } else {
            g0.j jVar = new g0.j(i02);
            int i6 = i02.f7960i;
            Object valueOf = Integer.valueOf(i02.f7963l - L0.c(iArr, i6));
            while (i6 >= 0) {
                jVar.m(i02.i(i6), i02.k(i6) ? i02.p(iArr, i6) : C0616l.a, i02.a.f(i6), valueOf);
                valueOf = i02.a(i6);
                i6 = i02.q(i6);
            }
            collection = (ArrayList) jVar.a;
        }
        w5.addAll(collection);
        w5.addAll(I());
        return new C1013a(Y4.l.p(w5));
    }

    public final void m0(Object obj) {
        if (obj instanceof B0) {
            C0 c02 = new C0((B0) obj, this.f8177m - 1);
            if (this.f8163S) {
                U.M m3 = this.f8157M.f8557b.f8556c;
                m3.W(U.w.f8593c);
                AbstractC1410a.Q(m3, 0, c02);
            }
            this.f8168d.add(obj);
            obj = c02;
        }
        n0(obj);
    }

    public final void n(k.M m3, l4.e eVar) {
        ArrayList arrayList = this.f8183s;
        if (this.f8150F) {
            AbstractC0629s.a("Reentrant composition is not supported");
        }
        this.f8171g.i();
        Trace.beginSection("Compose:recompose");
        try {
            this.f8146B = Long.hashCode(AbstractC0992o.j().g());
            this.f8186v = null;
            i0(m3);
            this.f8175k = 0;
            this.f8150F = true;
            try {
                g0();
                Object H3 = H();
                if (H3 != eVar && eVar != null) {
                    n0(eVar);
                }
                C0624p c0624p = this.f8148D;
                V.e q3 = r.q();
                try {
                    q3.b(c0624p);
                    C0595a0 c0595a0 = AbstractC0629s.a;
                    if (eVar != null) {
                        Y(200, c0595a0);
                        AbstractC1291z.b(2, eVar);
                        eVar.m(this, 1);
                        p(false);
                    } else if (!this.f8187w || H3 == null || H3.equals(C0616l.a)) {
                        T();
                    } else {
                        Y(200, c0595a0);
                        AbstractC1291z.b(2, H3);
                        l4.e eVar2 = (l4.e) H3;
                        AbstractC1291z.b(2, eVar2);
                        eVar2.m(this, 1);
                        p(false);
                    }
                    q3.k(q3.f8761f - 1);
                    v();
                    this.f8150F = false;
                    arrayList.clear();
                    if (!this.f8153I.f8007w) {
                        AbstractC0629s.a("Check failed");
                    }
                    x();
                } catch (Throwable th) {
                    q3.k(q3.f8761f - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void n0(Object obj) {
        if (this.f8163S) {
            M0 m02 = this.f8153I;
            if (m02.f7998n <= 0 || m02.f7993i == m02.f7995k) {
                m02.F(obj);
                return;
            }
            C1147A c1147a = m02.f8003s;
            if (c1147a == null) {
                c1147a = new C1147A();
            }
            m02.f8003s = c1147a;
            int i6 = m02.f8006v;
            Object b5 = c1147a.b(i6);
            if (b5 == null) {
                b5 = new k.I();
                c1147a.i(i6, b5);
            }
            ((k.I) b5).a(obj);
            return;
        }
        I0 i02 = this.f8151G;
        boolean z5 = i02.f7965n;
        C0671b c0671b = this.f8157M;
        if (!z5) {
            C0594a a = i02.a(i02.f7960i);
            U.M m3 = c0671b.f8557b.f8556c;
            m3.W(C0674e.f8571c);
            AbstractC1410a.R(m3, 0, a, 1, obj);
            return;
        }
        int c6 = (i02.f7963l - L0.c(i02.f7953b, i02.f7960i)) - 1;
        if (c0671b.a.f8151G.f7960i - c0671b.f8561f >= 0) {
            c0671b.d(true);
            U.M m5 = c0671b.f8557b.f8556c;
            m5.W(U.r.f8587g);
            AbstractC1410a.Q(m5, 0, obj);
            m5.f8552e[m5.f8553f - m5.f8550c[m5.f8551d - 1].a] = c6;
            return;
        }
        I0 i03 = this.f8151G;
        C0594a a6 = i03.a(i03.f7960i);
        U.M m6 = c0671b.f8557b.f8556c;
        m6.W(U.r.f8586f);
        AbstractC1410a.R(m6, 0, obj, 1, a6);
        m6.f8552e[m6.f8553f - m6.f8550c[m6.f8551d - 1].a] = c6;
    }

    public final void o(int i6, int i7) {
        if (i6 <= 0 || i6 == i7) {
            return;
        }
        o(this.f8151G.q(i6), i7);
        if (this.f8151G.l(i6)) {
            Object n3 = this.f8151G.n(i6);
            C0671b c0671b = this.f8157M;
            c0671b.c();
            c0671b.f8563h.add(n3);
        }
    }

    public final int o0(int i6) {
        int i7;
        if (i6 >= 0) {
            int[] iArr = this.f8179o;
            return (iArr == null || (i7 = iArr[i6]) < 0) ? this.f8151G.o(i6) : i7;
        }
        C1177y c1177y = this.f8180p;
        if (c1177y == null || c1177y.c(i6) < 0) {
            return 0;
        }
        int c6 = c1177y.c(i6);
        if (c6 >= 0) {
            return c1177y.f12588c[c6];
        }
        AbstractC1180a.e("Cannot find value for key " + i6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ba  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0626q.p(boolean):void");
    }

    public final void p0() {
        if (!this.f8182r) {
            AbstractC0629s.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f8182r = false;
        if (this.f8163S) {
            AbstractC0629s.a("useNode() called while inserting");
        }
        I0 i02 = this.f8151G;
        Object n3 = i02.n(i02.f7960i);
        C0671b c0671b = this.f8157M;
        c0671b.c();
        c0671b.f8563h.add(n3);
        if (this.f8189y && (n3 instanceof InterfaceC0608h)) {
            c0671b.b();
            C0670a c0670a = c0671b.f8557b;
            if (n3 != null) {
                c0670a.f8556c.W(U.I.f8544c);
            } else {
                c0670a.getClass();
            }
        }
    }

    public final void q() {
        p(false);
        C0627q0 A5 = A();
        if (A5 != null) {
            int i6 = A5.f8191b;
            if ((i6 & 1) != 0) {
                A5.f8191b = i6 | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    public final C0627q0 t() {
        C0627q0 c0627q0;
        C0594a a;
        o1 o1Var;
        ArrayList arrayList = this.f8149E;
        C0627q0 c0627q02 = !arrayList.isEmpty() ? (C0627q0) arrayList.remove(arrayList.size() - 1) : null;
        if (c0627q02 != null) {
            c0627q02.f8191b &= -9;
            this.f8171g.i();
            int i6 = this.f8146B;
            k.H h3 = c0627q02.f8195f;
            if (h3 != null && (c0627q02.f8191b & 16) == 0) {
                Object[] objArr = h3.f12461b;
                int[] iArr = h3.f12462c;
                long[] jArr = h3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    loop0: while (true) {
                        long j3 = jArr[i7];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j3 & 255) < 128) {
                                    int i10 = (i7 << 3) + i9;
                                    Object obj = objArr[i10];
                                    if (iArr[i10] != i6) {
                                        o1Var = new o1(i6, 1, c0627q02, h3);
                                        break loop0;
                                    }
                                }
                                j3 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                    }
                }
            }
            o1Var = null;
            C0671b c0671b = this.f8157M;
            if (o1Var != null) {
                U.M m3 = c0671b.f8557b.f8556c;
                m3.W(C0681l.f8578c);
                AbstractC1410a.R(m3, 0, o1Var, 1, this.f8172h);
            }
            int i11 = c0627q02.f8191b;
            if ((i11 & PegdownExtensions.STRIKETHROUGH) != 0) {
                c0627q02.f8191b = i11 & (-513);
                U.M m5 = c0671b.f8557b.f8556c;
                m5.W(U.o.f8581c);
                AbstractC1410a.Q(m5, 0, c0627q02);
                int i12 = c0627q02.f8191b;
                c0627q02.f8191b = i12 & (-129);
                if ((i12 & PegdownExtensions.ANCHORLINKS) != 0) {
                    c0627q02.f8191b = i12 & (-1153);
                    this.f8189y = false;
                }
            }
        }
        if (c0627q02 != null) {
            int i13 = c0627q02.f8191b;
            if ((i13 & 16) == 0 && ((i13 & 1) != 0 || this.f8181q)) {
                if (c0627q02.f8192c == null) {
                    if (this.f8163S) {
                        M0 m02 = this.f8153I;
                        a = m02.b(m02.f8006v);
                    } else {
                        I0 i02 = this.f8151G;
                        a = i02.a(i02.f7960i);
                    }
                    c0627q02.f8192c = a;
                }
                c0627q02.f8191b &= -5;
                c0627q0 = c0627q02;
                p(false);
                return c0627q0;
            }
        }
        c0627q0 = null;
        p(false);
        return c0627q0;
    }

    public final void u() {
        if (this.f8150F || this.f8190z != 100) {
            AbstractC0619m0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f8190z = -1;
        this.f8189y = false;
    }

    public final void v() {
        p(false);
        this.f8166b.c();
        p(false);
        C0671b c0671b = this.f8157M;
        if (c0671b.f8558c) {
            c0671b.d(false);
            c0671b.d(false);
            c0671b.f8557b.f8556c.W(C0682m.f8579c);
            c0671b.f8558c = false;
        }
        c0671b.b();
        if (c0671b.f8559d.f2001b != 0) {
            AbstractC0629s.a("Missed recording an endGroup()");
        }
        if (!this.f8173i.isEmpty()) {
            AbstractC0629s.a("Start/end imbalance");
        }
        i();
        this.f8151G.c();
        this.f8187w = this.f8188x.b() != 0;
    }

    public final void w(boolean z5, C0615k0 c0615k0) {
        this.f8173i.add(this.f8174j);
        this.f8174j = c0615k0;
        int i6 = this.f8176l;
        C0166v c0166v = this.f8178n;
        c0166v.c(i6);
        c0166v.c(this.f8177m);
        c0166v.c(this.f8175k);
        if (z5) {
            this.f8175k = 0;
        }
        this.f8176l = 0;
        this.f8177m = 0;
    }

    public final void x() {
        J0 j02 = new J0();
        if (this.f8147C) {
            j02.b();
        }
        if (this.f8166b.d()) {
            j02.f7976n = new C1147A();
        }
        this.f8152H = j02;
        M0 d6 = j02.d();
        d6.e(true);
        this.f8153I = d6;
    }

    public final InterfaceC1015c y() {
        C0637w c0637w = this.f8165U;
        if (c0637w != null) {
            return c0637w;
        }
        C0637w c0637w2 = new C0637w(this.f8172h);
        this.f8165U = c0637w2;
        return c0637w2;
    }

    public final InterfaceC0617l0 z() {
        return l();
    }
}
