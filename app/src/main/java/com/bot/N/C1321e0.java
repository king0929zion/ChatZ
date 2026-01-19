package n;

import T.C0599c0;
import T.C0607g0;
import c4.EnumC0927a;
import f0.C1001x;
import i4.AbstractC1117a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import x4.C1928k;

/* renamed from: n.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321e0 extends N3.s {

    /* renamed from: r, reason: collision with root package name */
    public static final C1338n f13132r = new C1338n(S.l.f7374V);

    /* renamed from: s, reason: collision with root package name */
    public static final C1338n f13133s = new C1338n(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final C0607g0 f13134b;

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f13135c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13136d;

    /* renamed from: e, reason: collision with root package name */
    public y0 f13137e;

    /* renamed from: f, reason: collision with root package name */
    public long f13138f;

    /* renamed from: g, reason: collision with root package name */
    public final Y3.l f13139g;

    /* renamed from: h, reason: collision with root package name */
    public final C0599c0 f13140h;

    /* renamed from: i, reason: collision with root package name */
    public C1928k f13141i;

    /* renamed from: j, reason: collision with root package name */
    public final H4.c f13142j;

    /* renamed from: k, reason: collision with root package name */
    public final C1308Q f13143k;

    /* renamed from: l, reason: collision with root package name */
    public long f13144l;

    /* renamed from: m, reason: collision with root package name */
    public final k.I f13145m;

    /* renamed from: n, reason: collision with root package name */
    public V f13146n;

    /* renamed from: o, reason: collision with root package name */
    public final C1311U f13147o;

    /* renamed from: p, reason: collision with root package name */
    public float f13148p;

    /* renamed from: q, reason: collision with root package name */
    public final C1311U f13149q;

    /* JADX WARN: Type inference failed for: r3v6, types: [n.U] */
    /* JADX WARN: Type inference failed for: r3v7, types: [n.U] */
    public C1321e0(I1.j jVar) {
        super(2);
        this.f13134b = T.r.A(jVar);
        this.f13135c = T.r.A(jVar);
        this.f13136d = jVar;
        this.f13139g = new Y3.l(this, 14);
        this.f13140h = new C0599c0(S.l.f7374V);
        this.f13142j = new H4.c();
        this.f13143k = new C1308Q();
        this.f13144l = Long.MIN_VALUE;
        this.f13145m = new k.I();
        final int i6 = 0;
        this.f13147o = new l4.c(this) { // from class: n.U

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1321e0 f13045e;

            {
                this.f13045e = this;
            }

            @Override // l4.c
            public final Object f(Object obj) {
                Long l3 = (Long) obj;
                switch (i6) {
                    case 0:
                        this.f13045e.f13144l = l3.longValue();
                        return X3.y.a;
                    default:
                        long longValue = l3.longValue();
                        C1321e0 c1321e0 = this.f13045e;
                        long j3 = longValue - c1321e0.f13144l;
                        c1321e0.f13144l = longValue;
                        long L5 = AbstractC1410a.L(j3 / c1321e0.f13148p);
                        k.I i7 = c1321e0.f13145m;
                        if (i7.i()) {
                            Object[] objArr = i7.a;
                            int i8 = i7.f12466b;
                            int i9 = 0;
                            for (int i10 = 0; i10 < i8; i10++) {
                                V v5 = (V) objArr[i10];
                                C1321e0.z(v5, L5);
                                v5.f13047c = true;
                            }
                            y0 y0Var = c1321e0.f13137e;
                            if (y0Var != null) {
                                y0Var.o();
                            }
                            int i11 = i7.f12466b;
                            Object[] objArr2 = i7.a;
                            r4.g z5 = AbstractC1117a.z(0, i11);
                            int i12 = z5.f14679c;
                            int i13 = z5.f14680e;
                            if (i12 <= i13) {
                                while (true) {
                                    objArr2[i12 - i9] = objArr2[i12];
                                    if (((V) objArr2[i12]).f13047c) {
                                        i9++;
                                    }
                                    if (i12 != i13) {
                                        i12++;
                                    }
                                }
                            }
                            Y3.k.o0(null, objArr2, i11 - i9, i11);
                            i7.f12466b -= i9;
                        }
                        V v6 = c1321e0.f13146n;
                        if (v6 != null) {
                            v6.f13051g = c1321e0.f13138f;
                            C1321e0.z(v6, L5);
                            c1321e0.C(v6.f13048d);
                            if (v6.f13048d == 1.0f) {
                                c1321e0.f13146n = null;
                            }
                            c1321e0.B();
                        }
                        return X3.y.a;
                }
            }
        };
        final int i7 = 1;
        this.f13149q = new l4.c(this) { // from class: n.U

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1321e0 f13045e;

            {
                this.f13045e = this;
            }

            @Override // l4.c
            public final Object f(Object obj) {
                Long l3 = (Long) obj;
                switch (i7) {
                    case 0:
                        this.f13045e.f13144l = l3.longValue();
                        return X3.y.a;
                    default:
                        long longValue = l3.longValue();
                        C1321e0 c1321e0 = this.f13045e;
                        long j3 = longValue - c1321e0.f13144l;
                        c1321e0.f13144l = longValue;
                        long L5 = AbstractC1410a.L(j3 / c1321e0.f13148p);
                        k.I i72 = c1321e0.f13145m;
                        if (i72.i()) {
                            Object[] objArr = i72.a;
                            int i8 = i72.f12466b;
                            int i9 = 0;
                            for (int i10 = 0; i10 < i8; i10++) {
                                V v5 = (V) objArr[i10];
                                C1321e0.z(v5, L5);
                                v5.f13047c = true;
                            }
                            y0 y0Var = c1321e0.f13137e;
                            if (y0Var != null) {
                                y0Var.o();
                            }
                            int i11 = i72.f12466b;
                            Object[] objArr2 = i72.a;
                            r4.g z5 = AbstractC1117a.z(0, i11);
                            int i12 = z5.f14679c;
                            int i13 = z5.f14680e;
                            if (i12 <= i13) {
                                while (true) {
                                    objArr2[i12 - i9] = objArr2[i12];
                                    if (((V) objArr2[i12]).f13047c) {
                                        i9++;
                                    }
                                    if (i12 != i13) {
                                        i12++;
                                    }
                                }
                            }
                            Y3.k.o0(null, objArr2, i11 - i9, i11);
                            i72.f12466b -= i9;
                        }
                        V v6 = c1321e0.f13146n;
                        if (v6 != null) {
                            v6.f13051g = c1321e0.f13138f;
                            C1321e0.z(v6, L5);
                            c1321e0.C(v6.f13048d);
                            if (v6.f13048d == 1.0f) {
                                c1321e0.f13146n = null;
                            }
                            c1321e0.B();
                        }
                        return X3.y.a;
                }
            }
        };
    }

    public static final void t(C1321e0 c1321e0) {
        y0 y0Var = c1321e0.f13137e;
        C0599c0 c0599c0 = c1321e0.f13140h;
        if (y0Var == null) {
            return;
        }
        V v5 = c1321e0.f13146n;
        if (v5 == null) {
            if (c1321e0.f13138f <= 0 || c0599c0.g() == 1.0f || AbstractC1276k.b(c1321e0.f13135c.getValue(), c1321e0.f13134b.getValue())) {
                v5 = null;
            } else {
                v5 = new V();
                v5.f13048d = c0599c0.g();
                long j3 = c1321e0.f13138f;
                v5.f13051g = j3;
                v5.f13052h = AbstractC1410a.L((1.0d - c0599c0.g()) * j3);
                v5.f13049e.e(c0599c0.g(), 0);
            }
        }
        if (v5 != null) {
            v5.f13051g = c1321e0.f13138f;
            c1321e0.f13145m.a(v5);
            y0Var.m(v5);
        }
        c1321e0.f13146n = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        if (T.r.w(r11).a(r1, r2) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(n.C1321e0 r10, d4.c r11) {
        /*
            k.I r0 = r10.f13145m
            boolean r1 = r11 instanceof n.Y
            if (r1 == 0) goto L15
            r1 = r11
            n.Y r1 = (n.Y) r1
            int r2 = r1.f13066i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13066i = r2
            goto L1a
        L15:
            n.Y r1 = new n.Y
            r1.<init>(r10, r11)
        L1a:
            b4.h r11 = r1.f11435e
            java.lang.Object r2 = r1.f13064g
            int r3 = r1.f13066i
            r4 = 2
            r5 = 1
            r6 = -9223372036854775808
            X3.y r8 = X3.y.a
            c4.a r9 = c4.EnumC0927a.f11114c
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L37
            if (r3 != r4) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            X3.a.e(r2)
            goto L73
        L3b:
            X3.a.e(r2)
            boolean r2 = r0.h()
            if (r2 == 0) goto L49
            n.V r2 = r10.f13146n
            if (r2 != 0) goto L49
            return r8
        L49:
            m4.AbstractC1276k.c(r11)
            float r2 = n.AbstractC1318d.n(r11)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L5b
            r10.y()
            r10.f13144l = r6
            return r8
        L5b:
            long r2 = r10.f13144l
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L73
            n.U r2 = r10.f13147o
            r1.f13066i = r5
            m4.AbstractC1276k.c(r11)
            I0.Z r11 = T.r.w(r11)
            java.lang.Object r11 = r11.a(r1, r2)
            if (r11 != r9) goto L73
            goto L89
        L73:
            boolean r11 = r0.i()
            if (r11 != 0) goto L81
            n.V r11 = r10.f13146n
            if (r11 == 0) goto L7e
            goto L81
        L7e:
            r10.f13144l = r6
            return r8
        L81:
            r1.f13066i = r4
            java.lang.Object r11 = r10.x(r1)
            if (r11 != r9) goto L73
        L89:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1321e0.u(n.e0, d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r0.d(r1) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(n.C1321e0 r7, d4.c r8) {
        /*
            H4.c r0 = r7.f13142j
            boolean r1 = r8 instanceof n.C1317c0
            if (r1 == 0) goto L15
            r1 = r8
            n.c0 r1 = (n.C1317c0) r1
            int r2 = r1.f13105j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13105j = r2
            goto L1a
        L15:
            n.c0 r1 = new n.c0
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.f13103h
            int r2 = r1.f13105j
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r1.f13102g
            X3.a.e(r8)
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r2 = r1.f13102g
            X3.a.e(r8)
            r8 = r2
            goto L51
        L3d:
            X3.a.e(r8)
            T.g0 r8 = r7.f13134b
            java.lang.Object r8 = r8.getValue()
            r1.f13102g = r8
            r1.f13105j = r4
            java.lang.Object r2 = r0.d(r1)
            if (r2 != r5) goto L51
            goto L6d
        L51:
            r1.f13102g = r8
            r1.f13105j = r3
            x4.k r2 = new x4.k
            b4.c r1 = Y4.d.K(r1)
            r2.<init>(r4, r1)
            r2.t()
            r7.f13141i = r2
            r1 = 0
            r0.c(r1)
            java.lang.Object r0 = r2.s()
            if (r0 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r6 = r0
            r0 = r8
            r8 = r6
        L71:
            boolean r8 = m4.AbstractC1276k.b(r8, r0)
            if (r8 == 0) goto L7a
            X3.y r7 = X3.y.a
            return r7
        L7a:
            r0 = -9223372036854775808
            r7.f13144l = r0
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "targetState while waiting for composition"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1321e0.v(n.e0, d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r0.d(r1) == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(n.C1321e0 r8, d4.c r9) {
        /*
            H4.c r0 = r8.f13142j
            boolean r1 = r9 instanceof n.C1319d0
            if (r1 == 0) goto L15
            r1 = r9
            n.d0 r1 = (n.C1319d0) r1
            int r2 = r1.f13126j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13126j = r2
            goto L1a
        L15:
            n.d0 r1 = new n.d0
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f13124h
            int r2 = r1.f13126j
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r1.f13123g
            X3.a.e(r9)
            goto L7d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r2 = r1.f13123g
            X3.a.e(r9)
            r9 = r2
            goto L51
        L3d:
            X3.a.e(r9)
            T.g0 r9 = r8.f13134b
            java.lang.Object r9 = r9.getValue()
            r1.f13123g = r9
            r1.f13126j = r4
            java.lang.Object r2 = r0.d(r1)
            if (r2 != r5) goto L51
            goto L79
        L51:
            java.lang.Object r2 = r8.f13136d
            boolean r2 = m4.AbstractC1276k.b(r9, r2)
            r6 = 0
            if (r2 == 0) goto L5e
            r0.c(r6)
            goto L83
        L5e:
            r1.f13123g = r9
            r1.f13126j = r3
            x4.k r2 = new x4.k
            b4.c r1 = Y4.d.K(r1)
            r2.<init>(r4, r1)
            r2.t()
            r8.f13141i = r2
            r0.c(r6)
            java.lang.Object r0 = r2.s()
            if (r0 != r5) goto L7a
        L79:
            return r5
        L7a:
            r7 = r0
            r0 = r9
            r9 = r7
        L7d:
            boolean r1 = m4.AbstractC1276k.b(r9, r0)
            if (r1 == 0) goto L86
        L83:
            X3.y r8 = X3.y.a
            return r8
        L86:
            r1 = -9223372036854775808
            r8.f13144l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1321e0.w(n.e0, d4.c):java.lang.Object");
    }

    public static void z(V v5, long j3) {
        long j4 = v5.a + j3;
        v5.a = j4;
        long j5 = v5.f13052h;
        if (j4 >= j5) {
            v5.f13048d = 1.0f;
            return;
        }
        I0 i02 = v5.f13046b;
        if (i02 == null) {
            float f6 = ((float) j4) / ((float) j5);
            v5.f13048d = (f6 * 1.0f) + ((1 - f6) * v5.f13049e.a(0));
            return;
        }
        C1338n c1338n = v5.f13049e;
        C1338n c1338n2 = v5.f13050f;
        if (c1338n2 == null) {
            c1338n2 = f13132r;
        }
        v5.f13048d = AbstractC1117a.e(((C1338n) i02.i(j4, c1338n, f13133s, c1338n2)).a(0), S.l.f7374V, 1.0f);
    }

    public final Object A(float f6, Object obj, d4.i iVar) {
        if (S.l.f7374V > f6 || f6 > 1.0f) {
            AbstractC1309S.a("Expecting fraction between 0 and 1. Got " + f6);
        }
        y0 y0Var = this.f13137e;
        if (y0Var != null) {
            Object a = C1308Q.a(this.f13143k, new C1315b0(obj, this.f13134b.getValue(), this, y0Var, f6, null), iVar);
            if (a == EnumC0927a.f11114c) {
                return a;
            }
        }
        return X3.y.a;
    }

    public final void B() {
        y0 y0Var = this.f13137e;
        if (y0Var == null) {
            return;
        }
        y0Var.l(AbstractC1410a.L(this.f13140h.g() * ((Number) y0Var.f13288l.getValue()).longValue()));
    }

    public final void C(float f6) {
        this.f13140h.h(f6);
    }

    @Override // N3.s
    public final Object k() {
        return this.f13135c.getValue();
    }

    @Override // N3.s
    public final Object l() {
        return this.f13134b.getValue();
    }

    @Override // N3.s
    public final void o(Object obj) {
        this.f13135c.setValue(obj);
    }

    @Override // N3.s
    public final void p(y0 y0Var) {
        y0 y0Var2 = this.f13137e;
        if (y0Var2 != null && !y0Var.equals(y0Var2)) {
            AbstractC1309S.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f13137e + ", new instance: " + y0Var);
        }
        this.f13137e = y0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X3.f] */
    @Override // N3.s
    public final void q() {
        this.f13137e = null;
        ((C1001x) C0.f12980b.getValue()).b(this);
    }

    public final Object x(d4.c cVar) {
        float n3 = AbstractC1318d.n(cVar.o());
        X3.y yVar = X3.y.a;
        if (n3 <= S.l.f7374V) {
            y();
            return yVar;
        }
        this.f13148p = n3;
        Object a = T.r.w(cVar.o()).a(cVar, this.f13149q);
        return a == EnumC0927a.f11114c ? a : yVar;
    }

    public final void y() {
        y0 y0Var = this.f13137e;
        if (y0Var != null) {
            y0Var.c();
        }
        this.f13145m.d();
        if (this.f13146n != null) {
            this.f13146n = null;
            C(1.0f);
            B();
        }
    }
}
