package j2;

import A4.W;
import A4.g0;
import F0.C0120h;
import F0.InterfaceC0121i;
import H0.L;
import T.B0;
import T.C0599c0;
import T.C0607g0;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import e3.C0965b;
import f0.C0990m;
import i1.AbstractC1087g;
import i2.C1115i;
import n0.C1356e;
import o0.C1395f;
import o0.C1400k;
import q0.C1496b;
import s2.C1655c;
import s2.C1660h;
import s2.C1661i;
import t0.AbstractC1688b;
import w2.AbstractC1834d;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.t0;

/* loaded from: classes.dex */
public final class l extends AbstractC1688b implements B0 {

    /* renamed from: w, reason: collision with root package name */
    public static final C0990m f12377w = new C0990m(2);

    /* renamed from: h, reason: collision with root package name */
    public C4.c f12378h;

    /* renamed from: i, reason: collision with root package name */
    public final g0 f12379i = W.b(new C1356e(0));

    /* renamed from: j, reason: collision with root package name */
    public final C0607g0 f12380j = T.r.A(null);

    /* renamed from: k, reason: collision with root package name */
    public final C0599c0 f12381k = new C0599c0(1.0f);

    /* renamed from: l, reason: collision with root package name */
    public final C0607g0 f12382l = T.r.A(null);

    /* renamed from: m, reason: collision with root package name */
    public e f12383m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC1688b f12384n;

    /* renamed from: o, reason: collision with root package name */
    public l4.c f12385o;

    /* renamed from: p, reason: collision with root package name */
    public l4.c f12386p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0121i f12387q;

    /* renamed from: r, reason: collision with root package name */
    public int f12388r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12389s;

    /* renamed from: t, reason: collision with root package name */
    public final C0607g0 f12390t;

    /* renamed from: u, reason: collision with root package name */
    public final C0607g0 f12391u;

    /* renamed from: v, reason: collision with root package name */
    public final C0607g0 f12392v;

    public l(C1661i c1661i, C1115i c1115i) {
        C1145a c1145a = C1145a.a;
        this.f12383m = c1145a;
        this.f12385o = f12377w;
        this.f12387q = C0120h.f1476b;
        this.f12388r = 1;
        this.f12390t = T.r.A(c1145a);
        this.f12391u = T.r.A(c1661i);
        this.f12392v = T.r.A(c1115i);
    }

    @Override // T.B0
    public final void a() {
        C4.c cVar = this.f12378h;
        if (cVar != null) {
            AbstractC1888A.j(cVar, null);
        }
        this.f12378h = null;
        Object obj = this.f12384n;
        B0 b02 = obj instanceof B0 ? (B0) obj : null;
        if (b02 != null) {
            b02.a();
        }
    }

    @Override // T.B0
    public final void b() {
        C4.c cVar = this.f12378h;
        if (cVar != null) {
            AbstractC1888A.j(cVar, null);
        }
        this.f12378h = null;
        Object obj = this.f12384n;
        B0 b02 = obj instanceof B0 ? (B0) obj : null;
        if (b02 != null) {
            b02.b();
        }
    }

    @Override // t0.AbstractC1688b
    public final void c(float f6) {
        this.f12381k.h(f6);
    }

    @Override // t0.AbstractC1688b
    public final void d(C1400k c1400k) {
        this.f12382l.setValue(c1400k);
    }

    @Override // T.B0
    public final void e() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f12378h == null) {
                t0 e6 = AbstractC1888A.e();
                E4.e eVar = AbstractC1898K.a;
                C4.c c6 = AbstractC1888A.c(Y4.d.P(e6, C4.o.a.f16023i));
                this.f12378h = c6;
                Object obj = this.f12384n;
                B0 b02 = obj instanceof B0 ? (B0) obj : null;
                if (b02 != null) {
                    b02.e();
                }
                if (this.f12389s) {
                    C1660h a = C1661i.a((C1661i) this.f12391u.getValue());
                    a.f14750b = ((C1115i) this.f12392v.getValue()).f12076b;
                    a.f14765q = null;
                    a.a().f14790z.getClass();
                    C1655c c1655c = AbstractC1834d.a;
                    k(new c(null));
                } else {
                    AbstractC1888A.y(c6, null, new h(this, null), 3);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // t0.AbstractC1688b
    public final long h() {
        AbstractC1688b abstractC1688b = (AbstractC1688b) this.f12380j.getValue();
        if (abstractC1688b != null) {
            return abstractC1688b.h();
        }
        return 9205357640488583168L;
    }

    @Override // t0.AbstractC1688b
    public final void i(L l3) {
        C1496b c1496b = l3.f1765c;
        C1356e c1356e = new C1356e(c1496b.c());
        g0 g0Var = this.f12379i;
        g0Var.getClass();
        g0Var.l(null, c1356e);
        AbstractC1688b abstractC1688b = (AbstractC1688b) this.f12380j.getValue();
        if (abstractC1688b != null) {
            abstractC1688b.g(l3, c1496b.c(), this.f12381k.g(), (C1400k) this.f12382l.getValue());
        }
    }

    public final AbstractC1688b j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? AbstractC1087g.a(new C1395f(((BitmapDrawable) drawable).getBitmap()), this.f12388r) : new C0965b(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(j2.e r13) {
        /*
            r12 = this;
            j2.e r0 = r12.f12383m
            l4.c r1 = r12.f12385o
            java.lang.Object r13 = r1.f(r13)
            j2.e r13 = (j2.e) r13
            r12.f12383m = r13
            T.g0 r1 = r12.f12390t
            r1.setValue(r13)
            boolean r1 = r13 instanceof j2.d
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            j2.d r1 = (j2.d) r1
            s2.o r1 = r1.f12365b
            goto L25
        L1c:
            boolean r1 = r13 instanceof j2.C1146b
            if (r1 == 0) goto L62
            r1 = r13
            j2.b r1 = (j2.C1146b) r1
            s2.e r1 = r1.f12364b
        L25:
            s2.i r3 = r1.a()
            v2.b r3 = r3.f14771g
            j2.m r4 = j2.n.a
            v2.d r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof v2.AbstractC1823a
            if (r4 == 0) goto L62
            t0.b r4 = r0.a()
            boolean r5 = r0 instanceof j2.c
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            t0.b r8 = r13.a()
            F0.i r9 = r12.f12387q
            v2.a r3 = (v2.AbstractC1823a) r3
            r3.getClass()
            boolean r3 = r1 instanceof s2.C1667o
            if (r3 == 0) goto L59
            s2.o r1 = (s2.C1667o) r1
            boolean r1 = r1.f14812g
            if (r1 != 0) goto L56
            goto L59
        L56:
            r1 = 0
        L57:
            r11 = r1
            goto L5b
        L59:
            r1 = 1
            goto L57
        L5b:
            j2.t r6 = new j2.t
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L63
        L62:
            r6 = r2
        L63:
            if (r6 == 0) goto L66
            goto L6a
        L66:
            t0.b r6 = r13.a()
        L6a:
            r12.f12384n = r6
            T.g0 r1 = r12.f12380j
            r1.setValue(r6)
            C4.c r1 = r12.f12378h
            if (r1 == 0) goto La0
            t0.b r1 = r0.a()
            t0.b r3 = r13.a()
            if (r1 == r3) goto La0
            t0.b r0 = r0.a()
            boolean r1 = r0 instanceof T.B0
            if (r1 == 0) goto L8a
            T.B0 r0 = (T.B0) r0
            goto L8b
        L8a:
            r0 = r2
        L8b:
            if (r0 == 0) goto L90
            r0.b()
        L90:
            t0.b r0 = r13.a()
            boolean r1 = r0 instanceof T.B0
            if (r1 == 0) goto L9b
            r2 = r0
            T.B0 r2 = (T.B0) r2
        L9b:
            if (r2 == 0) goto La0
            r2.e()
        La0:
            l4.c r0 = r12.f12386p
            if (r0 == 0) goto La7
            r0.f(r13)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.l.k(j2.e):void");
    }
}
