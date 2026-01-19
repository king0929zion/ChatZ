package O;

import D.EnumC0073i0;
import F0.InterfaceC0134w;
import S0.C0542d;
import S0.C0545g;
import T.C0602e;
import T.C0607g0;
import java.util.ArrayList;
import java.util.ListIterator;
import k.AbstractC1171s;
import k.C1149C;
import k.C1151E;
import m4.AbstractC1276k;
import n0.C1353b;
import n0.C1354c;
import u.AbstractC1734b;
import w0.InterfaceC1830a;
import x4.InterfaceC1942y;

/* renamed from: O.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332s0 {
    public final z0 a;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1830a f4194e;

    /* renamed from: f, reason: collision with root package name */
    public l4.c f4195f;

    /* renamed from: k, reason: collision with root package name */
    public C1353b f4200k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0134w f4201l;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0307f0 f4209t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4210u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1942y f4211v;

    /* renamed from: w, reason: collision with root package name */
    public C0341z f4212w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4213x;

    /* renamed from: b, reason: collision with root package name */
    public final C0607g0 f4191b = T.r.A(null);

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f4192c = T.r.A(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    public l4.c f4193d = new O(this, 7);

    /* renamed from: g, reason: collision with root package name */
    public final M.q f4196g = new M.q(10);

    /* renamed from: h, reason: collision with root package name */
    public final m0.w f4197h = new m0.w();

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f4198i = T.r.A(Boolean.FALSE);

    /* renamed from: j, reason: collision with root package name */
    public final T.E f4199j = T.r.s(new L(this, 3));

    /* renamed from: m, reason: collision with root package name */
    public final C0607g0 f4202m = new C0607g0(X3.y.a, C0602e.f8080g);

    /* renamed from: n, reason: collision with root package name */
    public final C0607g0 f4203n = T.r.A(new C1353b(0));

    /* renamed from: o, reason: collision with root package name */
    public final C0607g0 f4204o = T.r.A(new C1353b(0));

    /* renamed from: p, reason: collision with root package name */
    public final C0607g0 f4205p = T.r.A(null);

    /* renamed from: q, reason: collision with root package name */
    public final C0607g0 f4206q = T.r.A(null);

    /* renamed from: r, reason: collision with root package name */
    public final C0607g0 f4207r = T.r.A(null);

    /* renamed from: s, reason: collision with root package name */
    public final C0607g0 f4208s = T.r.A(null);

    public C0332s0(z0 z0Var) {
        this.a = z0Var;
        z0Var.f4267e = new O(this, 8);
        z0Var.f4268f = new C0319l0(this, 0);
        z0Var.f4269g = new C0321m0(this);
        z0Var.f4270h = new L(this, 4);
        z0Var.f4271i = new O(this, 1);
        z0Var.f4272j = new O(this, 2);
    }

    public final long a(InterfaceC0134w interfaceC0134w, long j3) {
        InterfaceC0134w interfaceC0134w2 = this.f4201l;
        if (interfaceC0134w2 == null || !interfaceC0134w2.j()) {
            return 9205357640488583168L;
        }
        return j().R(interfaceC0134w, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            O.G r0 = r13.f()
            r1 = 0
            if (r0 == 0) goto L11
            O.z0 r0 = r13.a
            k.E r2 = r0.a()
            int r2 = r2.f12450e
            if (r2 != 0) goto L14
        L11:
            r0 = r1
            goto La0
        L14:
            S0.d r2 = new S0.d
            r2.<init>()
            F0.w r3 = r13.j()
            java.util.ArrayList r3 = r0.c(r3)
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L29:
            boolean r5 = r4.hasPrevious()
            r6 = -1
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.previous()
            O.r r5 = (O.r) r5
            k.E r7 = r0.a()
            long r8 = r5.a
            java.lang.Object r5 = r7.e(r8)
            O.G r5 = (O.G) r5
            if (r5 == 0) goto L29
            O.F r7 = r5.a
            int r7 = r7.f3941b
            O.F r5 = r5.f3945b
            int r5 = r5.f3941b
            if (r7 == r5) goto L29
            int r4 = r4.nextIndex()
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == r6) goto L9c
            int r5 = r3.size()
            r6 = 0
            r7 = r6
        L5c:
            if (r7 >= r5) goto L9c
            java.lang.Object r8 = r3.get(r7)
            O.r r8 = (O.r) r8
            k.E r9 = r0.a()
            long r10 = r8.a
            java.lang.Object r9 = r9.e(r10)
            O.G r9 = (O.G) r9
            if (r9 == 0) goto L99
            S0.g r8 = r8.d()
            O.F r10 = r9.a
            int r10 = r10.f3941b
            O.F r9 = r9.f3945b
            int r9 = r9.f3941b
            long r9 = S0.F.b(r10, r9)
            if (r7 < r4) goto L86
            r11 = 1
            goto L87
        L86:
            r11 = r6
        L87:
            int r12 = S0.O.f(r9)
            int r9 = S0.O.e(r9)
            r2.d(r8, r12, r9)
            if (r11 != 0) goto L99
            r8 = 10
            r2.b(r8)
        L99:
            int r7 = r7 + 1
            goto L5c
        L9c:
            S0.g r0 = r2.i()
        La0:
            if (r0 == 0) goto Lb4
            java.lang.String r2 = r0.f7630e
            int r2 = r2.length()
            if (r2 <= 0) goto Lab
            r1 = r0
        Lab:
            if (r1 == 0) goto Lb4
            l4.c r0 = r13.f4195f
            if (r0 == 0) goto Lb4
            r0.f(r1)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0332s0.b():void");
    }

    public final r c(F f6) {
        return (r) this.a.f4265c.e(f6.f3942c);
    }

    public final X3.i d() {
        int i6;
        int i7;
        int i8;
        if (f() == null) {
            return null;
        }
        z0 z0Var = this.a;
        if (z0Var.f4264b.isEmpty()) {
            return null;
        }
        C0542d c0542d = new C0542d();
        ArrayList c6 = z0Var.c(j());
        ListIterator listIterator = c6.listIterator(c6.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i6 = -1;
                break;
            }
            G g3 = (G) z0Var.a().e(((r) listIterator.previous()).a);
            if (g3 != null && g3.a.f3941b != g3.f3945b.f3941b) {
                i6 = listIterator.nextIndex();
                break;
            }
        }
        if (i6 != -1) {
            int size = c6.size();
            int i9 = 0;
            i7 = -1;
            i8 = -1;
            int i10 = 0;
            while (i10 < size) {
                r rVar = (r) c6.get(i10);
                G g6 = (G) z0Var.a().e(rVar.a);
                if (g6 != null) {
                    C0545g d6 = rVar.d();
                    long b5 = S0.F.b(g6.a.f3941b, g6.f3945b.f3941b);
                    int i11 = i10 >= i6 ? 1 : i9;
                    if (i7 == -1) {
                        i7 = S0.O.f(b5);
                        c0542d.d(d6, i9, S0.O.f(b5));
                    }
                    c0542d.d(d6, S0.O.f(b5), S0.O.e(b5));
                    if (i11 == 0) {
                        c0542d.b('\n');
                    } else {
                        i8 = c0542d.f7623c.length();
                        c0542d.d(d6, S0.O.e(b5), d6.f7630e.length());
                    }
                }
                i10++;
                i9 = 0;
            }
        } else {
            i7 = -1;
            i8 = -1;
        }
        C0545g i12 = c0542d.i();
        if (i7 == -1 || i8 == -1) {
            return null;
        }
        return new X3.i(i12, new S0.O(S0.F.b(i7, i8)));
    }

    public final EnumC0073i0 e() {
        return (EnumC0073i0) this.f4207r.getValue();
    }

    public final G f() {
        return (G) this.f4191b.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f4192c.getValue()).booleanValue();
    }

    public final boolean h() {
        G f6 = f();
        if (f6 != null) {
            F f7 = f6.f3945b;
            F f8 = f6.a;
            if (!AbstractC1276k.b(f8, f7)) {
                if (f8.f3942c == f7.f3942c) {
                    return true;
                }
                InterfaceC0134w j3 = j();
                z0 z0Var = this.a;
                ArrayList c6 = z0Var.c(j3);
                int size = c6.size();
                for (int i6 = 0; i6 < size; i6++) {
                    G g3 = (G) z0Var.a().e(((r) c6.get(i6)).a);
                    if (g3 != null && g3.a.f3941b != g3.f3945b.f3941b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        InterfaceC1830a interfaceC1830a;
        C1151E c1151e = AbstractC1171s.a;
        AbstractC1276k.d(c1151e, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.a.f4273k.setValue(c1151e);
        this.f4213x = false;
        o();
        if (f() != null) {
            this.f4193d.f(null);
            if (!g() || (interfaceC1830a = this.f4194e) == null) {
                return;
            }
            interfaceC1830a.a(9);
        }
    }

    public final InterfaceC0134w j() {
        InterfaceC0134w interfaceC0134w = this.f4201l;
        if (interfaceC0134w == null) {
            AbstractC1734b.b("null coordinates");
            throw new RuntimeException();
        }
        if (!interfaceC0134w.j()) {
            AbstractC1734b.a("unattached coordinates");
        }
        return interfaceC0134w;
    }

    public final void k(boolean z5) {
        C0607g0 c0607g0 = this.f4192c;
        if (((Boolean) c0607g0.getValue()).booleanValue() != z5) {
            c0607g0.setValue(Boolean.valueOf(z5));
            o();
        }
    }

    public final void l(G g3) {
        this.f4191b.setValue(g3);
        if (g3 != null) {
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (O.AbstractC0336u0.p(r10, r11) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r20 = this;
            r0 = r20
            O.G r1 = r0.f()
            F0.w r2 = r0.f4201l
            r3 = 0
            if (r1 == 0) goto L14
            O.F r4 = r1.a
            if (r4 == 0) goto L14
            O.r r4 = r0.c(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            O.F r5 = r1.f3945b
            if (r5 == 0) goto L20
            O.r r5 = r0.c(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            F0.w r6 = r4.c()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            F0.w r7 = r5.c()
            goto L31
        L30:
            r7 = r3
        L31:
            T.g0 r8 = r0.f4206q
            T.g0 r9 = r0.f4205p
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r10 = r2.j()
            if (r10 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            n0.c r10 = O.AbstractC0336u0.A(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L78
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.a(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7d
        L60:
            long r11 = r2.R(r6, r11)
            n0.b r4 = new n0.b
            r4.<init>(r11)
            D.i0 r6 = r0.e()
            D.i0 r15 = D.EnumC0073i0.f1035e
            if (r6 == r15) goto L7e
            boolean r6 = O.AbstractC0336u0.p(r10, r11)
            if (r6 == 0) goto L7d
            goto L7e
        L78:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r4 = r3
        L7e:
            r9.setValue(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.a(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            long r1 = r2.R(r7, r4)
            n0.b r4 = new n0.b
            r4.<init>(r1)
            D.i0 r5 = r0.e()
            D.i0 r6 = D.EnumC0073i0.f1036f
            if (r5 == r6) goto La6
            boolean r1 = O.AbstractC0336u0.p(r10, r1)
            if (r1 == 0) goto La7
        La6:
            r3 = r4
        La7:
            r8.setValue(r3)
            return
        Lab:
            r9.setValue(r3)
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0332s0.m():void");
    }

    public final boolean n(long j3, long j4, boolean z5, H h3) {
        ArrayList arrayList;
        InterfaceC0307f0 interfaceC0307f0;
        z0 z0Var;
        S0.L l3;
        long j5;
        int i6;
        ArrayList arrayList2;
        long j6;
        EnumC0320m enumC0320m;
        C0309g0 c0309g0;
        EnumC0320m enumC0320m2;
        EnumC0320m enumC0320m3;
        z0 z0Var2;
        int i7;
        boolean z6;
        EnumC0320m enumC0320m4;
        EnumC0320m enumC0320m5;
        ArrayList arrayList3;
        EnumC0320m enumC0320m6;
        EnumC0320m enumC0320m7;
        int i8;
        EnumC0320m enumC0320m8;
        int i9;
        int i10;
        F f6;
        F f7;
        this.f4207r.setValue(z5 ? EnumC0073i0.f1035e : EnumC0073i0.f1036f);
        this.f4208s.setValue(new C1353b(j3));
        InterfaceC0134w j7 = j();
        z0 z0Var3 = this.a;
        ArrayList c6 = z0Var3.c(j7);
        int i11 = k.r.a;
        C1149C c1149c = new C1149C(6);
        int size = c6.size();
        for (int i12 = 0; i12 < size; i12++) {
            c1149c.e(((r) c6.get(i12)).a, i12);
        }
        int i13 = 2;
        long j8 = 9223372034707292159L;
        C0309g0 c0309g02 = new C0309g0(j3, j4, j7, z5, (j4 & 9223372034707292159L) == 9205357640488583168L ? null : f(), new I2.C(c1149c, i13));
        int size2 = c6.size();
        int i14 = 0;
        while (true) {
            arrayList = c0309g02.f4120h;
            if (i14 >= size2) {
                break;
            }
            r rVar = (r) c6.get(i14);
            InterfaceC0134w c7 = rVar.c();
            if (c7 == null || (l3 = (S0.L) rVar.f4182c.b()) == null) {
                z0Var2 = z0Var3;
                i7 = size2;
                i8 = i14;
                arrayList2 = c6;
                i6 = i13;
                j5 = j8;
            } else {
                int i15 = i13;
                j5 = j8;
                long R5 = c0309g02.f4115c.R(c7, 0L);
                i6 = i15;
                ArrayList arrayList4 = c6;
                long e6 = C1353b.e(c0309g02.a, R5);
                long j9 = c0309g02.f4114b;
                long e7 = (j9 & j5) == 9205357640488583168L ? 9205357640488583168L : C1353b.e(j9, R5);
                long j10 = rVar.a;
                long j11 = l3.f7600c;
                arrayList2 = arrayList4;
                float f8 = (int) (j11 >> 32);
                float f9 = (int) (j11 & 4294967295L);
                int i16 = (int) (e6 >> 32);
                float intBitsToFloat = Float.intBitsToFloat(i16);
                EnumC0320m enumC0320m9 = EnumC0320m.f4153f;
                EnumC0320m enumC0320m10 = EnumC0320m.f4151c;
                EnumC0320m enumC0320m11 = EnumC0320m.f4152e;
                if (intBitsToFloat < S.l.f7374V) {
                    j6 = 4294967295L;
                    enumC0320m = enumC0320m10;
                } else if (Float.intBitsToFloat(i16) > f8) {
                    j6 = 4294967295L;
                    enumC0320m = enumC0320m9;
                } else {
                    j6 = 4294967295L;
                    enumC0320m = enumC0320m11;
                }
                int i17 = (int) (j6 & e6);
                EnumC0320m enumC0320m12 = Float.intBitsToFloat(i17) < S.l.f7374V ? enumC0320m10 : Float.intBitsToFloat(i17) > f9 ? enumC0320m9 : enumC0320m11;
                boolean z7 = c0309g02.f4116d;
                G g3 = c0309g02.f4117e;
                if (z7) {
                    c0309g0 = c0309g02;
                    z0Var2 = z0Var3;
                    enumC0320m5 = AbstractC0336u0.m(enumC0320m, enumC0320m12, c0309g0, j10, g3 != null ? g3.f3945b : null);
                    i7 = size2;
                    i8 = i14;
                    arrayList3 = arrayList;
                    enumC0320m8 = enumC0320m;
                    enumC0320m2 = enumC0320m8;
                    enumC0320m3 = enumC0320m12;
                    enumC0320m7 = enumC0320m3;
                    enumC0320m6 = enumC0320m5;
                    z6 = z7;
                    enumC0320m4 = enumC0320m6;
                } else {
                    c0309g0 = c0309g02;
                    EnumC0320m m3 = AbstractC0336u0.m(enumC0320m, enumC0320m12, c0309g0, j10, g3 != null ? g3.a : null);
                    enumC0320m2 = enumC0320m;
                    enumC0320m3 = enumC0320m12;
                    z0Var2 = z0Var3;
                    i7 = size2;
                    z6 = z7;
                    enumC0320m4 = enumC0320m2;
                    enumC0320m5 = enumC0320m3;
                    arrayList3 = arrayList;
                    enumC0320m6 = m3;
                    enumC0320m7 = enumC0320m6;
                    i8 = i14;
                    enumC0320m8 = enumC0320m7;
                }
                c0309g02 = c0309g0;
                EnumC0320m y5 = AbstractC0336u0.y(enumC0320m2, enumC0320m3);
                if (y5 == enumC0320m11 || y5 != enumC0320m6) {
                    int length = l3.a.a.f7630e.length();
                    I2.C c8 = c0309g02.f4118f;
                    if (z6) {
                        i10 = AbstractC0336u0.s(e6, l3);
                        if (g3 == null || (f7 = g3.f3945b) == null) {
                            length = i10;
                        } else {
                            int compare = c8.compare(Long.valueOf(f7.f3942c), Long.valueOf(j10));
                            if (compare < 0) {
                                length = 0;
                            } else if (compare <= 0) {
                                length = f7.f3941b;
                            }
                        }
                        i9 = length;
                    } else {
                        int s5 = AbstractC0336u0.s(e6, l3);
                        if (g3 == null || (f6 = g3.a) == null) {
                            length = s5;
                        } else {
                            int compare2 = c8.compare(Long.valueOf(f6.f3942c), Long.valueOf(j10));
                            if (compare2 < 0) {
                                length = 0;
                            } else if (compare2 <= 0) {
                                length = f6.f3941b;
                            }
                        }
                        i9 = s5;
                        i10 = length;
                    }
                    int s6 = (e7 & j5) == 9205357640488583168L ? -1 : AbstractC0336u0.s(e7, l3);
                    int i18 = c0309g02.f4123k + 2;
                    c0309g02.f4123k = i18;
                    D d6 = new D(j10, i18, i10, i9, s6, l3);
                    c0309g02.f4121i = c0309g02.a(c0309g02.f4121i, enumC0320m8, enumC0320m7);
                    c0309g02.f4122j = c0309g02.a(c0309g02.f4122j, enumC0320m4, enumC0320m5);
                    c0309g02.f4119g.e(j10, arrayList3.size());
                    arrayList3.add(d6);
                }
            }
            i14 = i8 + 1;
            i13 = i6;
            c6 = arrayList2;
            j8 = j5;
            size2 = i7;
            z0Var3 = z0Var2;
        }
        z0 z0Var4 = z0Var3;
        int i19 = c0309g02.f4123k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            interfaceC0307f0 = null;
        } else if (size3 != 1) {
            int i20 = c0309g02.f4121i;
            int i21 = i20 == -1 ? i19 : i20;
            int i22 = c0309g02.f4122j;
            interfaceC0307f0 = new C0328q(c0309g02.f4119g, arrayList, i21, i22 == -1 ? i19 : i22, c0309g02.f4116d, c0309g02.f4117e);
        } else {
            D d7 = (D) Y3.m.D0(arrayList);
            int i23 = c0309g02.f4121i;
            int i24 = i23 == -1 ? i19 : i23;
            int i25 = c0309g02.f4122j;
            interfaceC0307f0 = new C0(c0309g02.f4116d, i24, i25 == -1 ? i19 : i25, c0309g02.f4117e, d7);
        }
        if (interfaceC0307f0 == null || !interfaceC0307f0.e(this.f4209t)) {
            return false;
        }
        G a = h3.a(interfaceC0307f0);
        if (!AbstractC1276k.b(a, f())) {
            if (g()) {
                z0Var = z0Var4;
                ArrayList arrayList5 = z0Var.f4264b;
                int size4 = arrayList5.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size4) {
                        break;
                    }
                    if (((r) arrayList5.get(i26)).d().f7630e.length() > 0) {
                        InterfaceC1830a interfaceC1830a = this.f4194e;
                        if (interfaceC1830a != null) {
                            interfaceC1830a.a(9);
                        }
                    } else {
                        i26++;
                    }
                }
            } else {
                z0Var = z0Var4;
            }
            z0Var.f4273k.setValue(interfaceC0307f0.i(a));
            this.f4193d.f(a);
            this.f4210u = false;
        }
        this.f4209t = interfaceC0307f0;
        return true;
    }

    public final void o() {
        x4.s0 s0Var;
        if (((Boolean) this.f4198i.getValue()).booleanValue()) {
            boolean z5 = this.f4213x;
            M.q qVar = this.f4196g;
            if (z5 && g()) {
                if (((C1354c) this.f4199j.getValue()) == null) {
                    return;
                }
                qVar.w();
            } else {
                J.l lVar = (J.l) qVar.f3179e;
                if (lVar == null || (s0Var = lVar.f2803x) == null) {
                    return;
                }
                s0Var.f(null);
                lVar.f2803x = null;
            }
        }
    }
}
