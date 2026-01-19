package z;

import T.C0599c0;
import T.C0601d0;
import T.C0602e;
import T.C0607g0;
import T.X;
import c4.EnumC0927a;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.InterfaceC0961c;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import i4.AbstractC1117a;
import i4.AbstractC1118b;
import java.util.List;
import l4.InterfaceC1193a;
import n0.C1353b;
import o4.AbstractC1410a;
import p.x0;
import r.C1529K;
import r.C1609u;
import r.InterfaceC1623y1;
import t.C1682j;
import u.AbstractC1734b;
import y.AbstractC1975o;
import y.C1965e;
import y.Y;
import y.Z;
import y.a0;
import y.b0;

/* loaded from: classes.dex */
public abstract class E implements InterfaceC1623y1 {

    /* renamed from: A, reason: collision with root package name */
    public long f16041A;

    /* renamed from: B, reason: collision with root package name */
    public final Y f16042B;

    /* renamed from: C, reason: collision with root package name */
    public final X f16043C;

    /* renamed from: D, reason: collision with root package name */
    public final X f16044D;

    /* renamed from: E, reason: collision with root package name */
    public final C0607g0 f16045E;

    /* renamed from: F, reason: collision with root package name */
    public final C0607g0 f16046F;

    /* renamed from: G, reason: collision with root package name */
    public final C0607g0 f16047G;

    /* renamed from: H, reason: collision with root package name */
    public final C0607g0 f16048H;
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public t f16049b;

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f16050c;

    /* renamed from: d, reason: collision with root package name */
    public final v f16051d;

    /* renamed from: e, reason: collision with root package name */
    public int f16052e;

    /* renamed from: f, reason: collision with root package name */
    public int f16053f;

    /* renamed from: g, reason: collision with root package name */
    public long f16054g;

    /* renamed from: h, reason: collision with root package name */
    public long f16055h;

    /* renamed from: i, reason: collision with root package name */
    public float f16056i;

    /* renamed from: j, reason: collision with root package name */
    public float f16057j;

    /* renamed from: k, reason: collision with root package name */
    public final C1529K f16058k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16059l;

    /* renamed from: m, reason: collision with root package name */
    public int f16060m;

    /* renamed from: n, reason: collision with root package name */
    public a0 f16061n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16062o;

    /* renamed from: p, reason: collision with root package name */
    public final C0607g0 f16063p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0961c f16064q;

    /* renamed from: r, reason: collision with root package name */
    public final C1682j f16065r;

    /* renamed from: s, reason: collision with root package name */
    public final C0601d0 f16066s;

    /* renamed from: t, reason: collision with root package name */
    public final C0601d0 f16067t;

    /* renamed from: u, reason: collision with root package name */
    public final b0 f16068u;

    /* renamed from: v, reason: collision with root package name */
    public final k f16069v;

    /* renamed from: w, reason: collision with root package name */
    public final C1609u f16070w;

    /* renamed from: x, reason: collision with root package name */
    public final C1965e f16071x;

    /* renamed from: y, reason: collision with root package name */
    public final C0607g0 f16072y;

    /* renamed from: z, reason: collision with root package name */
    public final x.p f16073z;

    /* JADX WARN: Type inference failed for: r1v4, types: [z.y] */
    /* JADX WARN: Type inference failed for: r6v4, types: [z.h, java.lang.Object] */
    public E(float f6, int i6) {
        double d6 = f6;
        if (-0.5d > d6 || d6 > 0.5d) {
            AbstractC1734b.a("currentPageOffsetFraction " + f6 + " is not within the range -0.5 to 0.5");
        }
        this.f16050c = T.r.A(new C1353b(0L));
        this.f16051d = new v(i6, f6, this);
        this.f16052e = i6;
        this.f16054g = Long.MAX_VALUE;
        final int i7 = 0;
        this.f16058k = new C1529K(new l4.c(this) { // from class: z.x

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E f16178e; {
                this.f16178e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // l4.c
            public final Object f(Object obj) {
                t tVar;
                switch (i7) {
                    case 0:
                        Object r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        E e6 = this.f16178e;
                        long k3 = AbstractC1118b.k(e6);
                        float f7 = e6.f16056i + floatValue;
                        long L5 = AbstractC1410a.L(f7);
                        e6.f16056i = f7 - ((float) L5);
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j3 = k3 + L5;
                            long g3 = AbstractC1117a.g(j3, e6.f16055h, e6.f16054g);
                            boolean z5 = j3 != g3;
                            long j4 = g3 - k3;
                            float f8 = (float) j4;
                            e6.f16057j = f8;
                            long abs = Math.abs(j4);
                            float f9 = S.l.f7374V;
                            if (abs != 0) {
                                e6.f16047G.setValue(Boolean.valueOf(f8 > S.l.f7374V));
                                e6.f16048H.setValue(Boolean.valueOf(f8 < S.l.f7374V));
                            }
                            int i8 = (int) j4;
                            int i9 = -i8;
                            t a = ((t) e6.f16063p.getValue()).a(i9);
                            if (a != null && (tVar = e6.f16049b) != null) {
                                t a6 = tVar.a(i9);
                                if (a6 != null) {
                                    e6.f16049b = a6;
                                } else {
                                    a = null;
                                }
                            }
                            if (a != null) {
                                e6.h(a, e6.a, true);
                                e6.f16043C.setValue(X3.y.a);
                            } else {
                                v vVar = e6.f16051d;
                                E e7 = vVar.a;
                                C0599c0 c0599c0 = vVar.f16173c;
                                if (e7.o() != 0) {
                                    f9 = i8 / e7.o();
                                }
                                c0599c0.h(c0599c0.g() + f9);
                                H0.J j5 = (H0.J) e6.f16072y.getValue();
                                if (j5 != null) {
                                    j5.k();
                                }
                            }
                            if (z5) {
                                r14 = Long.valueOf(j4);
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        E e8 = this.f16178e;
                        Z z6 = (Z) obj;
                        AbstractC0983f e9 = AbstractC0997t.e();
                        l4.c e10 = e9 != null ? e9.e() : null;
                        AbstractC0983f h3 = AbstractC0997t.h(e9);
                        try {
                            z6.a(e8.f16052e);
                            AbstractC0997t.k(e9, h3, e10);
                            return X3.y.a;
                        } catch (Throwable th) {
                            AbstractC0997t.k(e9, h3, e10);
                            throw th;
                        }
                }
            }
        });
        this.f16059l = true;
        this.f16060m = -1;
        this.f16063p = new C0607g0(H.f16075c, C0602e.f8080g);
        this.f16064q = H.f16074b;
        this.f16065r = new C1682j();
        this.f16066s = new C0601d0(-1);
        this.f16067t = new C0601d0(i6);
        C0602e c0602e = C0602e.f8083j;
        final int i8 = 0;
        T.r.r(c0602e, new InterfaceC1193a(this) { // from class: z.y

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E f16180e; {
                this.f16180e = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                int k3;
                switch (i8) {
                    case 0:
                        E e6 = this.f16180e;
                        return Integer.valueOf(e6.f16058k.b() ? e6.f16067t.g() : e6.f16051d.f16172b.g());
                    case 1:
                        E e7 = this.f16180e;
                        C0601d0 c0601d0 = e7.f16066s;
                        boolean b5 = e7.f16058k.b();
                        v vVar = e7.f16051d;
                        k3 = e7.k(!b5 ? vVar.f16172b.g() : c0601d0.g() != -1 ? c0601d0.g() : Math.abs(vVar.f16173c.g()) >= Math.abs(Math.min(e7.f16064q.e0(H.a), ((float) e7.n()) / 2.0f) / ((float) e7.n())) ? ((Boolean) e7.f16047G.getValue()).booleanValue() ? e7.f16052e + 1 : e7.f16052e : vVar.f16172b.g());
                        return Integer.valueOf(k3);
                    default:
                        k3 = this.f16180e.m();
                        return Integer.valueOf(k3);
                }
            }
        });
        final int i9 = 1;
        T.r.r(c0602e, new InterfaceC1193a(this) { // from class: z.y

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E f16180e; {
                this.f16180e = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                int k3;
                switch (i9) {
                    case 0:
                        E e6 = this.f16180e;
                        return Integer.valueOf(e6.f16058k.b() ? e6.f16067t.g() : e6.f16051d.f16172b.g());
                    case 1:
                        E e7 = this.f16180e;
                        C0601d0 c0601d0 = e7.f16066s;
                        boolean b5 = e7.f16058k.b();
                        v vVar = e7.f16051d;
                        k3 = e7.k(!b5 ? vVar.f16172b.g() : c0601d0.g() != -1 ? c0601d0.g() : Math.abs(vVar.f16173c.g()) >= Math.abs(Math.min(e7.f16064q.e0(H.a), ((float) e7.n()) / 2.0f) / ((float) e7.n())) ? ((Boolean) e7.f16047G.getValue()).booleanValue() ? e7.f16052e + 1 : e7.f16052e : vVar.f16172b.g());
                        return Integer.valueOf(k3);
                    default:
                        k3 = this.f16180e.m();
                        return Integer.valueOf(k3);
                }
            }
        });
        b0 b0Var = new b0(new l4.c(this) { // from class: z.x

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E f16178e; {
                this.f16178e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // l4.c
            public final Object f(Object obj) {
                t tVar;
                switch (i9) {
                    case 0:
                        Object r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        E e6 = this.f16178e;
                        long k3 = AbstractC1118b.k(e6);
                        float f7 = e6.f16056i + floatValue;
                        long L5 = AbstractC1410a.L(f7);
                        e6.f16056i = f7 - ((float) L5);
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j3 = k3 + L5;
                            long g3 = AbstractC1117a.g(j3, e6.f16055h, e6.f16054g);
                            boolean z5 = j3 != g3;
                            long j4 = g3 - k3;
                            float f8 = (float) j4;
                            e6.f16057j = f8;
                            long abs = Math.abs(j4);
                            float f9 = S.l.f7374V;
                            if (abs != 0) {
                                e6.f16047G.setValue(Boolean.valueOf(f8 > S.l.f7374V));
                                e6.f16048H.setValue(Boolean.valueOf(f8 < S.l.f7374V));
                            }
                            int i82 = (int) j4;
                            int i92 = -i82;
                            t a = ((t) e6.f16063p.getValue()).a(i92);
                            if (a != null && (tVar = e6.f16049b) != null) {
                                t a6 = tVar.a(i92);
                                if (a6 != null) {
                                    e6.f16049b = a6;
                                } else {
                                    a = null;
                                }
                            }
                            if (a != null) {
                                e6.h(a, e6.a, true);
                                e6.f16043C.setValue(X3.y.a);
                            } else {
                                v vVar = e6.f16051d;
                                E e7 = vVar.a;
                                C0599c0 c0599c0 = vVar.f16173c;
                                if (e7.o() != 0) {
                                    f9 = i82 / e7.o();
                                }
                                c0599c0.h(c0599c0.g() + f9);
                                H0.J j5 = (H0.J) e6.f16072y.getValue();
                                if (j5 != null) {
                                    j5.k();
                                }
                            }
                            if (z5) {
                                r14 = Long.valueOf(j4);
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        E e8 = this.f16178e;
                        Z z6 = (Z) obj;
                        AbstractC0983f e9 = AbstractC0997t.e();
                        l4.c e10 = e9 != null ? e9.e() : null;
                        AbstractC0983f h3 = AbstractC0997t.h(e9);
                        try {
                            z6.a(e8.f16052e);
                            AbstractC0997t.k(e9, h3, e10);
                            return X3.y.a;
                        } catch (Throwable th) {
                            AbstractC0997t.k(e9, h3, e10);
                            throw th;
                        }
                }
            }
        });
        this.f16068u = b0Var;
        final int i10 = 2;
        this.f16069v = new k(new Object(), b0Var, new InterfaceC1193a(this) { // from class: z.y

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E f16180e; {
                this.f16180e = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                int k3;
                switch (i10) {
                    case 0:
                        E e6 = this.f16180e;
                        return Integer.valueOf(e6.f16058k.b() ? e6.f16067t.g() : e6.f16051d.f16172b.g());
                    case 1:
                        E e7 = this.f16180e;
                        C0601d0 c0601d0 = e7.f16066s;
                        boolean b5 = e7.f16058k.b();
                        v vVar = e7.f16051d;
                        k3 = e7.k(!b5 ? vVar.f16172b.g() : c0601d0.g() != -1 ? c0601d0.g() : Math.abs(vVar.f16173c.g()) >= Math.abs(Math.min(e7.f16064q.e0(H.a), ((float) e7.n()) / 2.0f) / ((float) e7.n())) ? ((Boolean) e7.f16047G.getValue()).booleanValue() ? e7.f16052e + 1 : e7.f16052e : vVar.f16172b.g());
                        return Integer.valueOf(k3);
                    default:
                        k3 = this.f16180e.m();
                        return Integer.valueOf(k3);
                }
            }
        });
        this.f16070w = new C1609u(1);
        this.f16071x = new C1965e();
        this.f16072y = T.r.A(null);
        this.f16073z = new x.p(this, 1);
        this.f16041A = AbstractC0960b.b(0, 0, 15);
        this.f16042B = new Y();
        this.f16043C = AbstractC1975o.g();
        this.f16044D = AbstractC1975o.g();
        Boolean bool = Boolean.FALSE;
        this.f16045E = T.r.A(bool);
        this.f16046F = T.r.A(bool);
        this.f16047G = T.r.A(bool);
        this.f16048H = T.r.A(bool);
    }

    public static int j(boolean z5, t tVar) {
        List list = tVar.a;
        int i6 = tVar.f16158h;
        if (!z5) {
            return (((C2009g) Y3.m.o0(list)).a - i6) - 1;
        }
        int i7 = i6 + 1;
        return i7 < 0 ? TableCell.NOT_TRACKED : ((C2009g) Y3.m.w0(list)).a + i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r8.a(r6, r7, r0) != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r5.i(r0) == r4) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(z.E r5, p.x0 r6, l4.e r7, d4.c r8) {
        /*
            boolean r0 = r8 instanceof z.C2002C
            if (r0 == 0) goto L13
            r0 = r8
            z.C r0 = (z.C2002C) r0
            int r1 = r0.f16037l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16037l = r1
            goto L18
        L13:
            z.C r0 = new z.C
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f16035j
            int r1 = r0.f16037l
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L41
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            z.E r5 = r0.f16032g
            X3.a.e(r8)
            goto L7d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            d4.i r5 = r0.f16034i
            r7 = r5
            l4.e r7 = (l4.e) r7
            p.x0 r6 = r0.f16033h
            z.E r5 = r0.f16032g
            X3.a.e(r8)
            goto L56
        L41:
            X3.a.e(r8)
            r0.f16032g = r5
            r0.f16033h = r6
            r8 = r7
            d4.i r8 = (d4.i) r8
            r0.f16034i = r8
            r0.f16037l = r3
            java.lang.Object r8 = r5.i(r0)
            if (r8 != r4) goto L56
            goto L7c
        L56:
            r.K r8 = r5.f16058k
            boolean r8 = r8.b()
            if (r8 != 0) goto L6b
            z.v r8 = r5.f16051d
            T.d0 r8 = r8.f16172b
            int r8 = r8.g()
            T.d0 r1 = r5.f16067t
            r1.h(r8)
        L6b:
            r.K r8 = r5.f16058k
            r0.f16032g = r5
            r1 = 0
            r0.f16033h = r1
            r0.f16034i = r1
            r0.f16037l = r2
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r4) goto L7d
        L7c:
            return r4
        L7d:
            r6 = -1
            T.d0 r5 = r5.f16066s
            r5.h(r6)
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.E.s(z.E, p.x0, l4.e, d4.c):java.lang.Object");
    }

    @Override // r.InterfaceC1623y1
    public final Object a(x0 x0Var, l4.e eVar, d4.c cVar) {
        return s(this, x0Var, eVar, cVar);
    }

    @Override // r.InterfaceC1623y1
    public final boolean b() {
        return this.f16058k.b();
    }

    @Override // r.InterfaceC1623y1
    public final boolean c() {
        return ((Boolean) this.f16046F.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final boolean d() {
        return ((Boolean) this.f16045E.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final float e(float f6) {
        return this.f16058k.e(f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r15, n.C1327h0 r16, d4.c r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof z.z
            if (r1 == 0) goto L15
            r1 = r0
            z.z r1 = (z.z) r1
            int r2 = r1.f16185k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16185k = r2
            goto L1a
        L15:
            z.z r1 = new z.z
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.f16183i
            int r2 = r1.f16185k
            r3 = 0
            X3.y r4 = X3.y.a
            r5 = 2
            r6 = 1
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r2 == 0) goto L40
            if (r2 == r6) goto L37
            if (r2 != r5) goto L2f
            X3.a.e(r0)
            return r4
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            int r15 = r1.f16181g
            n.h0 r2 = r1.f16182h
            X3.a.e(r0)
            r12 = r2
            goto L6f
        L40:
            X3.a.e(r0)
            z.v r0 = r14.f16051d
            T.d0 r2 = r0.f16172b
            int r2 = r2.g()
            if (r15 != r2) goto L58
            T.c0 r0 = r0.f16173c
            float r0 = r0.g()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L58
            goto Lb3
        L58:
            int r0 = r14.m()
            if (r0 != 0) goto L5f
            goto Lb3
        L5f:
            r0 = r16
            r1.f16182h = r0
            r1.f16181g = r15
            r1.f16185k = r6
            java.lang.Object r2 = r14.i(r1)
            if (r2 != r7) goto L6e
            goto Lb2
        L6e:
            r12 = r0
        L6f:
            double r8 = (double) r3
            r10 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 > 0) goto L7d
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 > 0) goto L7d
            goto L93
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pageOffsetFraction "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = " is not within the range -0.5 to 0.5"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            u.AbstractC1734b.a(r0)
        L93:
            int r10 = r14.k(r15)
            int r15 = r14.o()
            float r15 = (float) r15
            float r11 = r3 * r15
            z.A r8 = new z.A
            r13 = 0
            r9 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r15 = 0
            r1.f16182h = r15
            r1.f16185k = r5
            p.x0 r15 = p.x0.f13823c
            java.lang.Object r15 = r14.a(r15, r8, r1)
            if (r15 != r7) goto Lb3
        Lb2:
            return r7
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.E.f(int, n.h0, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #0 {all -> 0x015b, blocks: (B:28:0x00b5, B:42:0x00c4, B:45:0x00cd, B:48:0x00da, B:50:0x00e6, B:55:0x0121, B:57:0x0116, B:61:0x00fe), top: B:27:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(z.t r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.E.h(z.t, boolean, boolean):void");
    }

    public final Object i(d4.c cVar) {
        Object h3;
        return (this.f16063p.getValue() == H.f16075c && (h3 = this.f16071x.h(cVar)) == EnumC0927a.f11114c) ? h3 : X3.y.a;
    }

    public final int k(int i6) {
        if (m() > 0) {
            return AbstractC1117a.f(i6, 0, m() - 1);
        }
        return 0;
    }

    public final t l() {
        return (t) this.f16063p.getValue();
    }

    public abstract int m();

    public final int n() {
        return ((t) this.f16063p.getValue()).f16152b;
    }

    public final int o() {
        return ((t) this.f16063p.getValue()).f16153c + n();
    }

    public final long p() {
        return ((C1353b) this.f16050c.getValue()).a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void r(float f6, t tVar) {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        List list = tVar.a;
        if (this.f16059l && !list.isEmpty()) {
            boolean z5 = f6 > S.l.f7374V;
            int j3 = j(z5, tVar);
            if (j3 < 0 || j3 >= m()) {
                return;
            }
            if (j3 != this.f16060m) {
                if (this.f16062o != z5 && (a0Var3 = this.f16061n) != null) {
                    a0Var3.cancel();
                }
                this.f16062o = z5;
                this.f16060m = j3;
                this.f16061n = this.f16068u.a(j3, this.f16041A, true, null);
            }
            if (z5) {
                if ((((C2009g) Y3.m.w0(list)).f16114j + (tVar.f16152b + tVar.f16153c)) - tVar.f16157g >= f6 || (a0Var2 = this.f16061n) == null) {
                    return;
                }
                a0Var2.a();
                return;
            }
            if (tVar.f16156f - ((C2009g) Y3.m.o0(list)).f16114j >= (-f6) || (a0Var = this.f16061n) == null) {
                return;
            }
            a0Var.a();
        }
    }

    public final void t(int i6, float f6, boolean z5) {
        v vVar = this.f16051d;
        C0601d0 c0601d0 = vVar.f16172b;
        C0599c0 c0599c0 = vVar.f16173c;
        if (c0601d0.g() != i6 || c0599c0.g() != f6) {
            this.f16069v.a();
        }
        vVar.f16172b.h(i6);
        vVar.f16176f.a(i6);
        c0599c0.h(f6);
        vVar.f16175e = null;
        if (!z5) {
            this.f16044D.setValue(X3.y.a);
            return;
        }
        H0.J j3 = (H0.J) this.f16072y.getValue();
        if (j3 != null) {
            j3.k();
        }
    }
}
