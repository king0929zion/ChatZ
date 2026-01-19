package O;

import D.C0098v0;
import D.EnumC0073i0;
import D.EnumC0075j0;
import D.d1;
import T.C0607g0;
import n0.C1353b;
import w0.InterfaceC1830a;

/* loaded from: classes.dex */
public final class L0 implements D.H0 {

    /* renamed from: b, reason: collision with root package name */
    public S0.O f3978b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N0 f3980d;
    public boolean a = true;

    /* renamed from: c, reason: collision with root package name */
    public H f3979c = I.f3953d;

    public L0(N0 n02) {
        this.f3980d = n02;
    }

    @Override // D.H0
    public final void a(long j3, H h3) {
        long j4;
        d1 d6;
        d1 d7;
        N0 n02 = this.f3980d;
        C0607g0 c0607g0 = n02.f4008q;
        if (n02.k() && ((EnumC0073i0) c0607g0.getValue()) == null) {
            c0607g0.setValue(EnumC0073i0.f1036f);
            n02.f4010s = -1;
            this.a = true;
            this.f3979c = h3;
            n02.o();
            C0098v0 c0098v0 = n02.f3995d;
            if (c0098v0 == null || (d7 = c0098v0.d()) == null || !d7.c(j3)) {
                j4 = j3;
                C0098v0 c0098v02 = n02.f3995d;
                if (c0098v02 != null && (d6 = c0098v02.d()) != null) {
                    int a = n02.f3993b.a(d6.b(j4, true));
                    X0.v e6 = N0.e(n02.n().a, S0.F.b(a, a));
                    n02.h(false);
                    InterfaceC1830a interfaceC1830a = n02.f4001j;
                    if (interfaceC1830a != null) {
                        interfaceC1830a.a(9);
                    }
                    n02.f3994c.f(e6);
                    n02.f4013v = new S0.O(e6.f9125b);
                }
                this.a = false;
            } else {
                if (n02.n().a.f7630e.length() == 0) {
                    return;
                }
                n02.h(false);
                long c6 = N0.c(n02, X0.v.a(n02.n(), null, S0.O.f7610b, 5), j3, true, false, this.f3979c, true);
                j4 = j3;
                n02.f4006o = new S0.O(c6);
                this.f3978b = new S0.O(c6);
            }
            n02.q(EnumC0075j0.f1042c);
            n02.f4005n = j4;
            n02.f4009r.setValue(new C1353b(j4));
            n02.f4007p = 0L;
        }
    }

    @Override // D.H0
    public final void b() {
        f();
    }

    @Override // D.H0
    public final void c() {
    }

    @Override // D.H0
    public final void d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    @Override // D.H0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r9) {
        /*
            r8 = this;
            O.N0 r0 = r8.f3980d
            boolean r1 = r0.k()
            if (r1 == 0) goto Ldd
            X0.v r1 = r0.n()
            S0.g r1 = r1.a
            java.lang.String r1 = r1.f7630e
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Ldd
        L18:
            long r1 = r0.f4007p
            long r9 = n0.C1353b.f(r1, r9)
            r0.f4007p = r9
            D.v0 r9 = r0.f3995d
            r10 = 0
            if (r9 == 0) goto Lda
            D.d1 r9 = r9.d()
            if (r9 == 0) goto Lda
            long r1 = r0.f4005n
            long r3 = r0.f4007p
            long r1 = n0.C1353b.f(r1, r3)
            n0.b r3 = new n0.b
            r3.<init>(r1)
            T.g0 r1 = r0.f4009r
            r1.setValue(r3)
            S0.O r1 = r0.f4006o
            if (r1 != 0) goto L8e
            n0.b r1 = r0.i()
            m4.AbstractC1276k.c(r1)
            long r1 = r1.a
            boolean r1 = r9.c(r1)
            if (r1 != 0) goto L8e
            X0.p r1 = r0.f3993b
            long r2 = r0.f4005n
            r4 = 1
            int r2 = r9.b(r2, r4)
            int r1 = r1.a(r2)
            X0.p r2 = r0.f3993b
            n0.b r3 = r0.i()
            m4.AbstractC1276k.c(r3)
            long r5 = r3.a
            int r9 = r9.b(r5, r4)
            int r9 = r2.a(r9)
            if (r1 != r9) goto L76
            O.H r9 = O.I.f3953d
        L74:
            r6 = r9
            goto L79
        L76:
            O.H r9 = O.I.f3954e
            goto L74
        L79:
            X0.v r1 = r0.n()
            n0.b r9 = r0.i()
            m4.AbstractC1276k.c(r9)
            long r2 = r9.a
            r5 = 0
            r7 = 1
            r4 = 0
            long r1 = O.N0.c(r0, r1, r2, r4, r5, r6, r7)
            goto Lc9
        L8e:
            S0.O r1 = r0.f4006o
            if (r1 == 0) goto L99
            long r1 = r1.a
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            goto L9f
        L99:
            long r1 = r0.f4005n
            int r1 = r9.b(r1, r10)
        L9f:
            n0.b r2 = r0.i()
            m4.AbstractC1276k.c(r2)
            long r2 = r2.a
            int r9 = r9.b(r2, r10)
            S0.O r2 = r0.f4006o
            if (r2 != 0) goto Lb3
            if (r1 != r9) goto Lb3
            goto Ldd
        Lb3:
            X0.v r1 = r0.n()
            n0.b r9 = r0.i()
            m4.AbstractC1276k.c(r9)
            long r2 = r9.a
            O.H r6 = r8.f3979c
            r7 = 1
            r4 = 0
            r5 = 0
            long r1 = O.N0.c(r0, r1, r2, r4, r5, r6, r7)
        Lc9:
            S0.O r9 = new S0.O
            r9.<init>(r1)
            r8.f3978b = r9
            S0.O r9 = r0.f4006o
            boolean r9 = S0.O.a(r1, r9)
            if (r9 != 0) goto Lda
            r8.a = r10
        Lda:
            r0.t(r10)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.L0.e(long):void");
    }

    public final void f() {
        N0 n02 = this.f3980d;
        n02.f4008q.setValue(null);
        n02.f4009r.setValue(null);
        this.f3979c = I.f3953d;
        n02.t(true);
        S0.O o5 = this.f3978b;
        boolean c6 = S0.O.c(o5 != null ? o5.a : n02.n().f9125b);
        n02.q(c6 ? EnumC0075j0.f1044f : EnumC0075j0.f1043e);
        C0098v0 c0098v0 = n02.f3995d;
        if (c0098v0 != null) {
            c0098v0.f1194m.setValue(Boolean.valueOf(!c6 && AbstractC0336u0.w(n02, true)));
        }
        C0098v0 c0098v02 = n02.f3995d;
        if (c0098v02 != null) {
            c0098v02.f1195n.setValue(Boolean.valueOf(!c6 && AbstractC0336u0.w(n02, false)));
        }
        C0098v0 c0098v03 = n02.f3995d;
        if (c0098v03 != null) {
            c0098v03.f1196o.setValue(Boolean.valueOf(c6 && AbstractC0336u0.w(n02, true)));
        }
        if (this.a) {
            N0.b(n02, n02.f4006o);
        }
        n02.f4006o = null;
    }

    @Override // D.H0
    public final void onCancel() {
        f();
    }
}
