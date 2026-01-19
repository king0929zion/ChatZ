package y;

import D.f1;
import H0.C0158m;
import N1.C0290l;
import T.C0611i0;
import android.os.Trace;
import e1.C0959a;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import i4.AbstractC1120d;
import i4.AbstractC1121e;
import java.util.List;
import m4.AbstractC1276k;
import u.AbstractC1734b;
import v4.AbstractC1828d;
import v4.C1825a;
import v4.EnumC1827c;

/* loaded from: classes.dex */
public final class q0 implements a0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final C0158m f15916b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.c f15917c;

    /* renamed from: d, reason: collision with root package name */
    public C0959a f15918d;

    /* renamed from: e, reason: collision with root package name */
    public F0.t0 f15919e;

    /* renamed from: f, reason: collision with root package name */
    public F0.O f15920f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15922h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15923i;

    /* renamed from: j, reason: collision with root package name */
    public Object f15924j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15925k;

    /* renamed from: l, reason: collision with root package name */
    public p0 f15926l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15927m;

    /* renamed from: n, reason: collision with root package name */
    public long f15928n;

    /* renamed from: o, reason: collision with root package name */
    public long f15929o;

    /* renamed from: p, reason: collision with root package name */
    public long f15930p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15931q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0290l f15932r;

    public q0(C0290l c0290l, int i6, C0158m c0158m, l4.c cVar) {
        this.f15932r = c0290l;
        this.a = i6;
        this.f15916b = c0158m;
        this.f15917c = cVar;
        int i7 = AbstractC1828d.f15394b;
        this.f15930p = System.nanoTime() - AbstractC1828d.a;
    }

    @Override // y.a0
    public final void a() {
        this.f15927m = true;
    }

    public final void b() {
        F0.O o5 = this.f15920f;
        if (o5 != null) {
            switch (o5.a) {
                case 0:
                    break;
                default:
                    F0.H b5 = o5.b();
                    if ((b5 != null ? b5.f1416f : null) != null) {
                        F0.Q.a(o5.f1437b, o5.f1438c);
                        break;
                    }
                    break;
            }
        }
        this.f15920f = null;
        F0.t0 t0Var = this.f15919e;
        if (t0Var != null) {
            t0Var.dispose();
        }
        this.f15919e = null;
        this.f15926l = null;
    }

    public final boolean c(C1961a c1961a) {
        boolean d6;
        if (!this.f15932r.a) {
            return false;
        }
        if (this.f15927m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d6 = d(c1961a);
            } finally {
                Trace.endSection();
            }
        } else {
            d6 = d(c1961a);
        }
        Y4.l.W("compose:lazy:prefetch:execute:item", -1L);
        return d6;
    }

    @Override // y.a0
    public final void cancel() {
        if (this.f15922h) {
            return;
        }
        this.f15922h = true;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e9 A[Catch: all -> 0x01b4, LOOP:2: B:100:0x01bd->B:110:0x01e9, LOOP_END, TRY_ENTER, TryCatch #2 {all -> 0x01b4, blocks: (B:84:0x0173, B:86:0x017b, B:88:0x0181, B:91:0x018f, B:93:0x019b, B:94:0x01b1, B:95:0x019e, B:99:0x01b6, B:100:0x01bd, B:102:0x01c5, B:107:0x01d6, B:108:0x01db, B:110:0x01e9, B:117:0x01ef), top: B:83:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, y.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(y.C1961a r22) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.q0.d(y.a):boolean");
    }

    public final boolean e() {
        F0.O o5;
        return this.f15923i || ((o5 = this.f15920f) != null && o5.c());
    }

    public final void f(long j3) {
        if (this.f15922h) {
            AbstractC1734b.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f15921g) {
            AbstractC1734b.a("Request was already measured!");
        }
        this.f15921g = true;
        F0.t0 t0Var = this.f15919e;
        if (t0Var == null) {
            AbstractC1734b.b("performComposition() must be called before performMeasure()");
            throw new RuntimeException();
        }
        int a = t0Var.a();
        for (int i6 = 0; i6 < a; i6++) {
            t0Var.b(j3, i6);
        }
    }

    public final void g(Object obj, Object obj2, C1963c c1963c) {
        F0.O o5;
        F0.O o6 = this.f15920f;
        if (o6 == null) {
            C0290l c0290l = this.f15932r;
            l4.e a = ((C1956M) c0290l.f3755b).a(this.a, obj, obj2);
            F0.Q a6 = ((F0.v0) c0290l.f3756c).a();
            if (a6.f1442c.H()) {
                a6.k(obj, a, true);
                o5 = new F0.O(a6, obj, 1);
            } else {
                o5 = new F0.O(a6, obj, 0);
            }
            o6 = o5;
            this.f15920f = o6;
            this.f15924j = obj;
        }
        this.f15931q = false;
        while (!o6.c() && !this.f15931q) {
            f1 f1Var = new f1(this, c1963c);
            switch (o6.a) {
                case 0:
                    break;
                default:
                    F0.H b5 = o6.b();
                    C0611i0 c0611i0 = b5 != null ? b5.f1416f : null;
                    if (c0611i0 != null && !c0611i0.c()) {
                        F0.Q q3 = o6.f1437b;
                        AbstractC0983f e6 = AbstractC0997t.e();
                        l4.c e7 = e6 != null ? e6.e() : null;
                        AbstractC0983f h3 = AbstractC0997t.h(e6);
                        try {
                            H0.J j3 = q3.f1442c;
                            j3.f1750u = true;
                            try {
                                c0611i0.e(f1Var);
                                j3.f1750u = false;
                                break;
                            } finally {
                            }
                        } finally {
                            AbstractC0997t.k(e6, h3, e7);
                        }
                    }
                    break;
            }
        }
        j();
        if (this.f15931q) {
            c1963c.f15842b = C1963c.a(this.f15929o, c1963c.f15842b);
        } else {
            c1963c.a = C1963c.a(this.f15929o, c1963c.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m4.w, java.lang.Object] */
    public final p0 h() {
        F0.t0 t0Var = this.f15919e;
        if (t0Var == null) {
            AbstractC1734b.b("Should precompose before resolving nested prefetch states");
            throw new RuntimeException();
        }
        Object obj = new Object();
        t0Var.c(new I1.z(obj, 1));
        List list = (List) obj.f12973c;
        if (list != null) {
            return new p0(this, list);
        }
        return null;
    }

    public final boolean i(long j3, long j4) {
        if (this.f15927m) {
            j4 = 0;
        }
        return j3 > j4;
    }

    public final void j() {
        int i6 = AbstractC1828d.f15394b;
        long nanoTime = System.nanoTime() - AbstractC1828d.a;
        long j3 = this.f15930p;
        EnumC1827c enumC1827c = EnumC1827c.NANOSECONDS;
        AbstractC1276k.f(enumC1827c, "unit");
        long j4 = 0;
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j3) {
                int i7 = C1825a.f15384g;
            } else {
                j4 = C1825a.g(j3 < 0 ? C1825a.f15383f : C1825a.f15382e);
            }
        } else if (((nanoTime - 1) | 1) == Long.MAX_VALUE) {
            j4 = nanoTime < 0 ? C1825a.f15383f : C1825a.f15382e;
        } else {
            long j5 = nanoTime - j3;
            if (((~(j5 ^ j3)) & (j5 ^ nanoTime)) < 0) {
                EnumC1827c enumC1827c2 = EnumC1827c.MILLISECONDS;
                if (enumC1827c.compareTo(enumC1827c2) < 0) {
                    long j6 = AbstractC1121e.j(1L, enumC1827c2, enumC1827c);
                    long j7 = (nanoTime / j6) - (j3 / j6);
                    long j8 = (nanoTime % j6) - (j3 % j6);
                    int i8 = C1825a.f15384g;
                    j4 = C1825a.e(AbstractC1120d.u(j7, enumC1827c2), AbstractC1120d.u(j8, enumC1827c));
                } else {
                    j4 = C1825a.g(j5 < 0 ? C1825a.f15383f : C1825a.f15382e);
                }
            } else {
                j4 = AbstractC1120d.u(j5, enumC1827c);
            }
        }
        long j9 = j4 >> 1;
        int i9 = C1825a.f15384g;
        long j10 = (1 & ((int) j4)) == 0 ? j9 : j9 > 9223372036854L ? Long.MAX_VALUE : j9 < -9223372036854L ? Long.MIN_VALUE : j9 * 1000000;
        this.f15929o = j10;
        long j11 = this.f15928n - j10;
        this.f15928n = j11;
        this.f15930p = nanoTime;
        Y4.l.W("compose:lazy:prefetch:available_time_nanos", j11);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.f15918d + ", isComposed = " + e() + ", isMeasured = " + this.f15921g + ", isCanceled = " + this.f15922h + " }";
    }
}
