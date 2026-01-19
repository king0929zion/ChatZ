package x;

import B0.B;
import H0.J;
import T.C0601d0;
import T.C0602e;
import T.C0607g0;
import T.X;
import X3.y;
import Z2.C0789z;
import c4.EnumC0927a;
import e1.InterfaceC0961c;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import f0.C0987j;
import n.AbstractC1318d;
import n.AbstractC1343r;
import n.C1336m;
import n.E0;
import p.O0;
import p.x0;
import r.C1529K;
import r.C1609u;
import r.InterfaceC1623y1;
import t.C1682j;
import u.AbstractC1734b;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;
import x4.s0;
import y.AbstractC1975o;
import y.C1954K;
import y.C1965e;
import y.W;
import y.Y;
import y.a0;
import y.b0;
import y.d0;
import y.e0;

/* loaded from: classes.dex */
public final class s implements InterfaceC1623y1 {

    /* renamed from: x, reason: collision with root package name */
    public static final e0.k f15544x = e0.l.b(new C0789z(20), new O0(13));
    public final C1850a a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15545b;

    /* renamed from: c, reason: collision with root package name */
    public l f15546c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15547d;

    /* renamed from: e, reason: collision with root package name */
    public final B f15548e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f15549f;

    /* renamed from: g, reason: collision with root package name */
    public final C1682j f15550g;

    /* renamed from: h, reason: collision with root package name */
    public float f15551h;

    /* renamed from: i, reason: collision with root package name */
    public final C1529K f15552i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f15553j;

    /* renamed from: k, reason: collision with root package name */
    public J f15554k;

    /* renamed from: l, reason: collision with root package name */
    public final p f15555l;

    /* renamed from: m, reason: collision with root package name */
    public final C1965e f15556m;

    /* renamed from: n, reason: collision with root package name */
    public final C1954K f15557n;

    /* renamed from: o, reason: collision with root package name */
    public final C1609u f15558o;

    /* renamed from: p, reason: collision with root package name */
    public final b0 f15559p;

    /* renamed from: q, reason: collision with root package name */
    public final C0987j f15560q;

    /* renamed from: r, reason: collision with root package name */
    public final Y f15561r;

    /* renamed from: s, reason: collision with root package name */
    public final X f15562s;

    /* renamed from: t, reason: collision with root package name */
    public final C0607g0 f15563t;

    /* renamed from: u, reason: collision with root package name */
    public final C0607g0 f15564u;

    /* renamed from: v, reason: collision with root package name */
    public final X f15565v;

    /* renamed from: w, reason: collision with root package name */
    public final e0.k f15566w;

            public s(int i6, int i7) {
        Object obj = new Object();
        obj.a = -1;
        obj.f15440d = -1;
        this.a = obj;
        Object obj2 = new Object();
        obj2.f378b = new C0601d0(i6);
        obj2.f379c = new C0601d0(i7);
        obj2.f381e = new W(i6);
        this.f15548e = obj2;
        this.f15549f = new C0607g0(u.a, C0602e.f8080g);
        this.f15550g = new C1682j();
        this.f15552i = new C1529K(new W0.e(this, 16));
        this.f15553j = true;
        this.f15555l = new p(this, 0);
        this.f15556m = new C1965e();
        this.f15557n = new C1954K();
        this.f15558o = new C1609u(1);
        this.f15559p = new b0(new Y3.s(this, i6));
        this.f15560q = new C0987j(this, 25);
        this.f15561r = new Y();
        this.f15562s = AbstractC1975o.g();
        Boolean bool = Boolean.FALSE;
        this.f15563t = T.r.A(bool);
        this.f15564u = T.r.A(bool);
        this.f15565v = AbstractC1975o.g();
        e0.k kVar = new e0.k(11);
        E0 e02 = AbstractC1318d.f13114j;
        Float valueOf = Float.valueOf(S.l.f7374V);
        kVar.f11565f = new C1336m(e02, valueOf, (AbstractC1343r) e02.a.f(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f15566w = kVar;
    }

    public static Object i(s sVar, int i6, d4.c cVar) {
        sVar.getClass();
        Object a = sVar.a(x0.f13823c, new r(sVar, i6, null), cVar);
        return a == EnumC0927a.f11114c ? a : y.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5.f15552i.a(r6, r7, r0) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r5.f15556m.h(r0) == r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // r.InterfaceC1623y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p.x0 r6, l4.e r7, d4.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof x.q
            if (r0 == 0) goto L13
            r0 = r8
            x.q r0 = (x.q) r0
            int r1 = r0.f15541k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15541k = r1
            goto L18
        L13:
            x.q r0 = new x.q
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f15539i
            int r1 = r0.f15541k
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            X3.a.e(r8)
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            d4.i r6 = r0.f15538h
            r7 = r6
            l4.e r7 = (l4.e) r7
            p.x0 r6 = r0.f15537g
            X3.a.e(r8)
            goto L5c
        L3d:
            X3.a.e(r8)
            T.g0 r8 = r5.f15549f
            java.lang.Object r8 = r8.getValue()
            x.l r1 = x.u.a
            if (r8 != r1) goto L5c
            r0.f15537g = r6
            r8 = r7
            d4.i r8 = (d4.i) r8
            r0.f15538h = r8
            r0.f15541k = r3
            y.e r8 = r5.f15556m
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r4) goto L5c
            goto L6b
        L5c:
            r8 = 0
            r0.f15537g = r8
            r0.f15538h = r8
            r0.f15541k = r2
            r.K r8 = r5.f15552i
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r4) goto L6c
        L6b:
            return r4
        L6c:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.s.a(p.x0, l4.e, d4.c):java.lang.Object");
    }

    @Override // r.InterfaceC1623y1
    public final boolean b() {
        return this.f15552i.b();
    }

    @Override // r.InterfaceC1623y1
    public final boolean c() {
        return ((Boolean) this.f15564u.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final boolean d() {
        return ((Boolean) this.f15563t.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final float e(float f6) {
        return this.f15552i.e(f6);
    }

        public final void f(l lVar, boolean z5, boolean z6) {
        e0.k kVar;
        long j3;
        AbstractC0983f e6;
        l4.c e7;
        AbstractC0983f h3;
        E0 e02 = AbstractC1318d.f13114j;
        Object r32 = lVar.f15501k;
        int i6 = lVar.f15504n;
        int i7 = lVar.f15492b;
        m mVar = lVar.a;
        this.f15559p.f15840e = r32.size();
        e0.k kVar2 = this.f15566w;
        B b5 = this.f15548e;
        if (!z5 && this.f15545b) {
            this.f15546c = lVar;
            e6 = AbstractC0997t.e();
            e7 = e6 != null ? e6.e() : null;
            h3 = AbstractC0997t.h(e6);
            try {
                if (((Number) ((C1336m) kVar2.f11565f).f13186e.getValue()).floatValue() != S.l.f7374V && mVar != null && mVar.a == ((C0601d0) b5.f378b).g() && i7 == ((C0601d0) b5.f379c).g()) {
                    s0 s0Var = (s0) kVar2.f11564e;
                    if (s0Var != null) {
                        s0Var.f(null);
                    }
                    kVar2.f11565f = new C1336m(e02, Float.valueOf(S.l.f7374V), null, 60);
                }
                return;
            } finally {
                AbstractC0997t.k(e6, h3, e7);
            }
        }
        if (z5) {
            this.f15545b = true;
        }
        this.f15564u.setValue(Boolean.valueOf(((mVar != null ? mVar.a : 0) == 0 && i7 == 0) ? false : true));
        this.f15563t.setValue(Boolean.valueOf(lVar.f15493c));
        this.f15551h -= lVar.f15494d;
        this.f15549f.setValue(lVar);
        if (z6) {
            b5.getClass();
            if (!(((float) i7) >= S.l.f7374V)) {
                AbstractC1734b.c("scrollOffset should be non-negative");
            }
            ((C0601d0) b5.f379c).h(i7);
            kVar = kVar2;
        } else {
            m mVar2 = (m) Y3.m.q0(r32);
            m mVar3 = (m) Y3.m.x0(r32);
            if (mVar2 != null) {
                kVar = kVar2;
                j3 = mVar2.a;
            } else {
                kVar = kVar2;
                j3 = -1;
            }
            Y4.l.W("firstVisibleItem:index", j3);
            Y4.l.W("lastVisibleItem:index", mVar3 != null ? mVar3.a : -1L);
            b5.getClass();
            b5.f380d = mVar != null ? mVar.f15517k : null;
            if (b5.a || i6 > 0) {
                b5.a = true;
                if (!(((float) i7) >= S.l.f7374V)) {
                    AbstractC1734b.c("scrollOffset should be non-negative");
                }
                b5.e(mVar != null ? mVar.a : 0, i7);
            }
            if (this.f15553j) {
                C1850a c1850a = this.a;
                int i8 = c1850a.a;
                boolean z7 = c1850a.f15439c;
                if (i8 != -1 && !r32.isEmpty() && i8 != C1850a.a(lVar, z7)) {
                    c1850a.a = -1;
                    a0 a0Var = c1850a.f15438b;
                    if (a0Var != null) {
                        a0Var.cancel();
                    }
                    c1850a.f15438b = null;
                }
                int i9 = c1850a.f15440d;
                if (i9 != -1 && c1850a.f15441e != S.l.f7374V && i9 != i6 && !r32.isEmpty()) {
                    int a = C1850a.a(lVar, c1850a.f15441e < S.l.f7374V);
                    if (a >= 0 && a < i6) {
                        c1850a.a = a;
                        c1850a.f15438b = C0987j.E(this.f15560q, a);
                    }
                }
                c1850a.f15440d = i6;
            }
        }
        if (z5) {
            float f6 = lVar.f15496f;
            InterfaceC0961c interfaceC0961c = lVar.f15499i;
            InterfaceC1942y interfaceC1942y = lVar.f15498h;
            kVar.getClass();
            if (f6 <= interfaceC0961c.e0(e0.a)) {
                return;
            }
            e6 = AbstractC0997t.e();
            e7 = e6 != null ? e6.e() : null;
            h3 = AbstractC0997t.h(e6);
            e0.k kVar3 = kVar;
            try {
                float floatValue = ((Number) ((C1336m) kVar3.f11565f).f13186e.getValue()).floatValue();
                s0 s0Var2 = (s0) kVar3.f11564e;
                if (s0Var2 != null) {
                    s0Var2.f(null);
                }
                C1336m c1336m = (C1336m) kVar3.f11565f;
                if (c1336m.f13190i) {
                    kVar3.f11565f = AbstractC1318d.l(c1336m, floatValue - f6, S.l.f7374V, 30);
                } else {
                    kVar3.f11565f = new C1336m(e02, Float.valueOf(-f6), null, 60);
                }
                kVar3.f11564e = AbstractC1888A.y(interfaceC1942y, null, new d0(kVar3, null), 3);
            } finally {
            }
        }
    }

    public final l g() {
        return (l) this.f15549f.getValue();
    }

            public final void h(float f6, l lVar) {
        a0 a0Var;
        a0 a0Var2;
        if (this.f15553j) {
            Object r02 = lVar.f15501k;
            Object r12 = lVar.f15501k;
            boolean isEmpty = r02.isEmpty();
            C1850a c1850a = this.a;
            if (!isEmpty) {
                boolean z5 = f6 < S.l.f7374V;
                int a = C1850a.a(lVar, z5);
                if (a >= 0 && a < lVar.f15504n) {
                    if (a != c1850a.a) {
                        if (c1850a.f15439c != z5) {
                            c1850a.a = -1;
                            a0 a0Var3 = c1850a.f15438b;
                            if (a0Var3 != null) {
                                a0Var3.cancel();
                            }
                            c1850a.f15438b = null;
                        }
                        c1850a.f15439c = z5;
                        c1850a.a = a;
                        c1850a.f15438b = C0987j.E(this.f15560q, a);
                    }
                    if (z5) {
                        m mVar = (m) Y3.m.w0(r12);
                        if (((mVar.f15521o + mVar.f15522p) + lVar.f15507q) - lVar.f15503m < (-f6) && (a0Var2 = c1850a.f15438b) != null) {
                            a0Var2.a();
                        }
                    } else if (lVar.f15502l - ((m) Y3.m.o0(r12)).f15521o < f6 && (a0Var = c1850a.f15438b) != null) {
                        a0Var.a();
                    }
                }
            }
            c1850a.f15441e = f6;
        }
    }

    public final void j(int i6) {
        B b5 = this.f15548e;
        if (((C0601d0) b5.f378b).g() != i6 || ((C0601d0) b5.f379c).g() != 0) {
            C1954K c1954k = this.f15557n;
            c1954k.d();
            c1954k.f15783b = null;
            c1954k.f15784c = -1;
        }
        b5.e(i6, 0);
        b5.f380d = null;
        J j3 = this.f15554k;
        if (j3 != null) {
            j3.k();
        }
    }
}
