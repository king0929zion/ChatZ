package x;

import F0.j0;
import F0.k0;
import h0.C1032i;
import h0.InterfaceC1027d;
import java.util.List;
import u.AbstractC1734b;
import x4.AbstractC1888A;
import y.C1944A;
import y.C1948E;
import y.C1952I;
import y.C1954K;

/* loaded from: classes.dex */
public final class m {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15508b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15509c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1027d f15510d;

    /* renamed from: e, reason: collision with root package name */
    public final C1032i f15511e;

    /* renamed from: f, reason: collision with root package name */
    public final e1.m f15512f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15513g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15514h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15515i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15516j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f15517k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f15518l;

    /* renamed from: m, reason: collision with root package name */
    public final C1954K f15519m;

    /* renamed from: n, reason: collision with root package name */
    public final long f15520n;

    /* renamed from: o, reason: collision with root package name */
    public int f15521o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15522p;

    /* renamed from: q, reason: collision with root package name */
    public final int f15523q;

    /* renamed from: r, reason: collision with root package name */
    public final int f15524r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15525s;

    /* renamed from: t, reason: collision with root package name */
    public int f15526t = Integer.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public int f15527u;

    /* renamed from: v, reason: collision with root package name */
    public int f15528v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f15529w;

    public m(int i6, List list, boolean z5, InterfaceC1027d interfaceC1027d, C1032i c1032i, e1.m mVar, int i7, int i8, int i9, long j3, Object obj, Object obj2, C1954K c1954k, long j4) {
        this.a = i6;
        this.f15508b = list;
        this.f15509c = z5;
        this.f15510d = interfaceC1027d;
        this.f15511e = c1032i;
        this.f15512f = mVar;
        this.f15513g = i7;
        this.f15514h = i8;
        this.f15515i = i9;
        this.f15516j = j3;
        this.f15517k = obj;
        this.f15518l = obj2;
        this.f15519m = c1954k;
        this.f15520n = j4;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            k0 k0Var = (k0) list.get(i12);
            boolean z6 = this.f15509c;
            i10 += z6 ? k0Var.f1486e : k0Var.f1485c;
            i11 = Math.max(i11, !z6 ? k0Var.f1486e : k0Var.f1485c);
        }
        this.f15522p = i10;
        int i13 = i10 + this.f15515i;
        this.f15523q = i13 >= 0 ? i13 : 0;
        this.f15524r = i11;
        this.f15529w = new int[this.f15508b.size() * 2];
    }

    public final int a(long j3) {
        return (int) (this.f15509c ? j3 & 4294967295L : j3 >> 32);
    }

    public final long b(int i6) {
        if (i6 == 0 && this.f15508b.size() == 0) {
            if (this.f15509c) {
                return (4294967295L & this.f15521o) | (0 << 32);
            }
            return (4294967295L & 0) | (this.f15521o << 32);
        }
        int[] iArr = this.f15529w;
        return (4294967295L & iArr[r7 + 1]) | (iArr[i6 * 2] << 32);
    }

    public final void c(j0 j0Var, boolean z5) {
        List list;
        int i6;
        if (this.f15526t == Integer.MIN_VALUE) {
            AbstractC1734b.a("position() should be called first");
        }
        List list2 = this.f15508b;
        int size = list2.size();
        int i7 = 0;
        while (i7 < size) {
            k0 k0Var = (k0) list2.get(i7);
            int i8 = this.f15527u;
            boolean z6 = this.f15509c;
            int i9 = i8 - (z6 ? k0Var.f1486e : k0Var.f1485c);
            int i10 = this.f15528v;
            long b5 = b(i7);
            C1952I c1952i = (C1952I) this.f15519m.a.g(this.f15517k);
            r0.b bVar = null;
            C1948E c1948e = c1952i != null ? c1952i.a[i7] : null;
            if (c1948e != null) {
                if (z5) {
                    c1948e.f15773r = b5;
                    list = list2;
                    i6 = size;
                } else {
                    list = list2;
                    i6 = size;
                    if (!e1.j.c(c1948e.f15773r, C1948E.f15755s)) {
                        b5 = c1948e.f15773r;
                    }
                    long e6 = e1.j.e(b5, ((e1.j) c1948e.f15772q.getValue()).a);
                    if (((a(b5) <= i9 && a(e6) <= i9) || (a(b5) >= i10 && a(e6) >= i10)) && ((Boolean) c1948e.f15763h.getValue()).booleanValue()) {
                        AbstractC1888A.y(c1948e.a, null, new C1944A(c1948e, null), 3);
                    }
                    b5 = e6;
                }
                bVar = c1948e.f15769n;
            } else {
                list = list2;
                i6 = size;
            }
            long e7 = e1.j.e(b5, this.f15516j);
            if (!z5 && c1948e != null) {
                c1948e.f15768m = e7;
            }
            if (z6) {
                if (bVar != null) {
                    j0Var.getClass();
                    j0.b(j0Var, k0Var);
                    k0Var.p0(e1.j.e(e7, k0Var.f1489h), S.l.f7374V, bVar);
                } else {
                    j0.q(j0Var, k0Var, e7);
                }
            } else if (bVar == null) {
                j0.o(j0Var, k0Var, e7);
            } else if (j0Var.e() == e1.m.f11576c || j0Var.g() == 0) {
                j0.b(j0Var, k0Var);
                k0Var.p0(e1.j.e(e7, k0Var.f1489h), S.l.f7374V, bVar);
            } else {
                int g3 = (j0Var.g() - k0Var.f1485c) - ((int) (e7 >> 32));
                j0.b(j0Var, k0Var);
                k0Var.p0(e1.j.e((((int) (e7 & 4294967295L)) & 4294967295L) | (g3 << 32), k0Var.f1489h), S.l.f7374V, bVar);
            }
            i7++;
            list2 = list;
            size = i6;
        }
    }

    public final void d(int i6, int i7, int i8) {
        int i9;
        this.f15521o = i6;
        boolean z5 = this.f15509c;
        this.f15526t = z5 ? i8 : i7;
        List list = this.f15508b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0 k0Var = (k0) list.get(i10);
            int i11 = i10 * 2;
            int[] iArr = this.f15529w;
            if (z5) {
                InterfaceC1027d interfaceC1027d = this.f15510d;
                if (interfaceC1027d == null) {
                    AbstractC1734b.b("null horizontalAlignment when isVertical == true");
                    throw new RuntimeException();
                }
                iArr[i11] = interfaceC1027d.a(k0Var.f1485c, i7, this.f15512f);
                iArr[i11 + 1] = i6;
                i9 = k0Var.f1486e;
            } else {
                iArr[i11] = i6;
                int i12 = i11 + 1;
                C1032i c1032i = this.f15511e;
                if (c1032i == null) {
                    AbstractC1734b.b("null verticalAlignment when isVertical == false");
                    throw new RuntimeException();
                }
                iArr[i12] = c1032i.a(k0Var.f1486e, i8);
                i9 = k0Var.f1485c;
            }
            i6 += i9;
        }
        this.f15527u = -this.f15513g;
        this.f15528v = this.f15526t + this.f15514h;
    }
}
