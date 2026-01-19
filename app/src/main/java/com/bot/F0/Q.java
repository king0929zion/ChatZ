package F0;

import H0.C0139a0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import T.AbstractC0633u;
import T.C0611i0;
import T.C0639x;
import T.EnumC0613j0;
import T.InterfaceC0608h;
import android.os.Handler;
import b0.C0879l;
import f0.AbstractC0983f;
import f0.AbstractC0992o;
import f0.AbstractC0997t;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0608h {

    /* renamed from: c, reason: collision with root package name */
    public final H0.J f1442c;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0633u f1443e;

    /* renamed from: f, reason: collision with root package name */
    public y0 f1444f;

    /* renamed from: g, reason: collision with root package name */
    public int f1445g;

    /* renamed from: h, reason: collision with root package name */
    public int f1446h;

    /* renamed from: i, reason: collision with root package name */
    public final k.M f1447i;

    /* renamed from: j, reason: collision with root package name */
    public final k.M f1448j;

    /* renamed from: k, reason: collision with root package name */
    public final J f1449k;

    /* renamed from: l, reason: collision with root package name */
    public final G f1450l;

    /* renamed from: m, reason: collision with root package name */
    public final k.M f1451m;

    /* renamed from: n, reason: collision with root package name */
    public final x0 f1452n;

    /* renamed from: o, reason: collision with root package name */
    public final k.M f1453o;

    /* renamed from: p, reason: collision with root package name */
    public final V.e f1454p;

    /* renamed from: q, reason: collision with root package name */
    public int f1455q;

    /* renamed from: r, reason: collision with root package name */
    public int f1456r;

    /* renamed from: s, reason: collision with root package name */
    public final String f1457s;

    public Q(H0.J j3, y0 y0Var) {
        this.f1442c = j3;
        this.f1444f = y0Var;
        long[] jArr = k.V.a;
        this.f1447i = new k.M();
        this.f1448j = new k.M();
        this.f1449k = new J(this);
        this.f1450l = new G(this);
        this.f1451m = new k.M();
        this.f1452n = new x0();
        this.f1453o = new k.M();
        this.f1454p = new V.e(new Object[16]);
        this.f1457s = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void a(Q q3, Object obj) {
        H0.J j3 = q3.f1442c;
        q3.h();
        H0.J j4 = (H0.J) q3.f1451m.k(obj);
        if (j4 != null) {
            if (q3.f1456r <= 0) {
                E0.a.b("No pre-composed items to dispose");
            }
            int i6 = ((V.e) ((V.b) j3.o()).f8751e).i(j4);
            if (i6 < ((V.e) ((V.b) j3.o()).f8751e).f8761f - q3.f1456r) {
                E0.a.b("Item is not in pre-composed item range");
            }
            q3.f1455q++;
            q3.f1456r--;
            H h3 = (H) q3.f1447i.g(j4);
            if (h3 != null) {
                e(h3);
            }
            int i7 = (((V.e) ((V.b) j3.o()).f8751e).f8761f - q3.f1456r) - q3.f1455q;
            q3.j(i6, i7);
            q3.g(i7);
        }
        if (q3.f1454p.h(obj)) {
            H0.J.X(j3, true, 6);
        }
    }

    public static void e(H h3) {
        k.N n3;
        C0611i0 c0611i0 = h3.f1416f;
        if (c0611i0 != null) {
            c0611i0.f8105h.set(EnumC0613j0.f8115e);
            C0879l c0879l = c0611i0.f8108k;
            if (c0879l.f10991d.h()) {
                n3 = c0879l.f10991d;
                k.N n5 = k.W.a;
                c0879l.f10991d = new k.N();
                c0879l.f10990c.g();
            } else {
                n3 = null;
            }
            c0879l.b();
            C0639x c0639x = c0611i0.a;
            c0639x.f8250t = null;
            if (n3 != null) {
                c0639x.f8254x.f10998k = n3;
                c0639x.f8256z = 2;
            }
            h3.f1416f = null;
            C0639x c0639x2 = h3.f1413c;
            if (c0639x2 != null) {
                c0639x2.m();
            }
            h3.f1413c = null;
        }
    }

    @Override // T.InterfaceC0608h
    public final void b() {
        C0639x c0639x;
        H0.J j3 = this.f1442c;
        j3.f1750u = true;
        k.M m3 = this.f1447i;
        Object[] objArr = m3.f12486c;
        long[] jArr = m3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j4 = jArr[i6];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j4) < 128 && (c0639x = ((H) objArr[(i6 << 3) + i8]).f1413c) != null) {
                            c0639x.m();
                        }
                        j4 >>= 8;
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
        j3.R();
        j3.f1750u = false;
        m3.a();
        this.f1448j.a();
        this.f1456r = 0;
        this.f1455q = 0;
        this.f1451m.a();
        h();
    }

    @Override // T.InterfaceC0608h
    public final void c() {
        i(true);
    }

    public final void d(H h3, boolean z5) {
        C0611i0 c0611i0 = h3.f1416f;
        if (c0611i0 != null) {
            AbstractC0983f e6 = AbstractC0997t.e();
            l4.c e7 = e6 != null ? e6.e() : null;
            AbstractC0983f h6 = AbstractC0997t.h(e6);
            try {
                H0.J j3 = this.f1442c;
                j3.f1750u = true;
                if (z5) {
                    while (!c0611i0.c()) {
                        try {
                            c0611i0.e(new F(0));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c0611i0.a();
                h3.f1416f = null;
                j3.f1750u = false;
            } finally {
                AbstractC0997t.k(e6, h6, e7);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [F0.t0, java.lang.Object] */
    public final t0 f(Object obj) {
        return !this.f1442c.H() ? new Object() : new N(this, obj);
    }

    public final void g(int i6) {
        boolean z5;
        boolean z6 = false;
        this.f1455q = 0;
        List o5 = this.f1442c.o();
        V.b bVar = (V.b) o5;
        int i7 = (((V.e) bVar.f8751e).f8761f - this.f1456r) - 1;
        if (i6 <= i7) {
            this.f1452n.clear();
            if (i6 <= i7) {
                int i8 = i6;
                while (true) {
                    Object g3 = this.f1447i.g((H0.J) bVar.get(i8));
                    AbstractC1276k.c(g3);
                    ((k.J) this.f1452n.f1542e).a(((H) g3).a);
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f1444f.e(this.f1452n);
            AbstractC0983f e6 = AbstractC0997t.e();
            l4.c e7 = e6 != null ? e6.e() : null;
            AbstractC0983f h3 = AbstractC0997t.h(e6);
            z5 = false;
            while (i7 >= i6) {
                try {
                    H0.J j3 = (H0.J) ((V.b) o5).get(i7);
                    Object g6 = this.f1447i.g(j3);
                    AbstractC1276k.c(g6);
                    H h6 = (H) g6;
                    Object obj = h6.a;
                    if (((k.J) this.f1452n.f1542e).c(obj)) {
                        this.f1455q++;
                        if (((Boolean) h6.f1417g.getValue()).booleanValue()) {
                            H0.N n3 = j3.f1722K;
                            C0139a0 c0139a0 = n3.f1781p;
                            H0.H h7 = H0.H.f1707f;
                            c0139a0.f1875o = h7;
                            H0.W w5 = n3.f1782q;
                            if (w5 != null) {
                                w5.f1827m = h7;
                            }
                            l(h6, false);
                            if (h6.f1418h) {
                                z5 = true;
                            }
                        }
                    } else {
                        H0.J j4 = this.f1442c;
                        j4.f1750u = true;
                        this.f1447i.k(j3);
                        C0639x c0639x = h6.f1413c;
                        if (c0639x != null) {
                            c0639x.m();
                        }
                        this.f1442c.S(i7, 1);
                        j4.f1750u = false;
                    }
                    this.f1448j.k(obj);
                    i7--;
                } catch (Throwable th) {
                    AbstractC0997t.k(e6, h3, e7);
                    throw th;
                }
            }
            AbstractC0997t.k(e6, h3, e7);
        } else {
            z5 = false;
        }
        if (z5) {
            synchronized (AbstractC0992o.f11707c) {
                k.N n5 = AbstractC0992o.f11714j.f11668h;
                if (n5 != null) {
                    if (n5.h()) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                AbstractC0992o.a();
            }
        }
        h();
    }

    public final void h() {
        int i6 = ((V.e) ((V.b) this.f1442c.o()).f8751e).f8761f;
        k.M m3 = this.f1447i;
        if (m3.f12488e != i6) {
            E0.a.a("Inconsistency between the count of nodes tracked by the state (" + m3.f12488e + ") and the children count on the SubcomposeLayout (" + i6 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i6 - this.f1455q) - this.f1456r < 0) {
            StringBuilder k3 = AbstractC1135a.k("Incorrect state. Total children ", i6, ". Reusable children ");
            k3.append(this.f1455q);
            k3.append(". Precomposed children ");
            k3.append(this.f1456r);
            E0.a.a(k3.toString());
        }
        k.M m5 = this.f1451m;
        if (m5.f12488e == this.f1456r) {
            return;
        }
        E0.a.a("Incorrect state. Precomposed children " + this.f1456r + ". Map size " + m5.f12488e);
    }

    public final void i(boolean z5) {
        this.f1456r = 0;
        this.f1451m.a();
        List o5 = this.f1442c.o();
        int i6 = ((V.e) ((V.b) o5).f8751e).f8761f;
        if (this.f1455q != i6) {
            this.f1455q = i6;
            AbstractC0983f e6 = AbstractC0997t.e();
            l4.c e7 = e6 != null ? e6.e() : null;
            AbstractC0983f h3 = AbstractC0997t.h(e6);
            for (int i7 = 0; i7 < i6; i7++) {
                try {
                    H0.J j3 = (H0.J) ((V.b) o5).get(i7);
                    H h6 = (H) this.f1447i.g(j3);
                    if (h6 != null && ((Boolean) h6.f1417g.getValue()).booleanValue()) {
                        H0.N n3 = j3.f1722K;
                        C0139a0 c0139a0 = n3.f1781p;
                        H0.H h7 = H0.H.f1707f;
                        c0139a0.f1875o = h7;
                        H0.W w5 = n3.f1782q;
                        if (w5 != null) {
                            w5.f1827m = h7;
                        }
                        l(h6, z5);
                        h6.a = AbstractC0137z.a;
                    }
                } catch (Throwable th) {
                    AbstractC0997t.k(e6, h3, e7);
                    throw th;
                }
            }
            AbstractC0997t.k(e6, h3, e7);
            this.f1448j.a();
        }
        h();
    }

    public final void j(int i6, int i7) {
        H0.J j3 = this.f1442c;
        j3.f1750u = true;
        j3.L(i6, i7, 1);
        j3.f1750u = false;
    }

    public final void k(Object obj, l4.e eVar, boolean z5) {
        H0.J j3 = this.f1442c;
        if (j3.H()) {
            h();
            if (this.f1448j.c(obj)) {
                return;
            }
            this.f1453o.k(obj);
            k.M m3 = this.f1451m;
            Object g3 = m3.g(obj);
            if (g3 == null) {
                g3 = n(obj);
                if (g3 != null) {
                    j(((V.e) ((V.b) j3.o()).f8751e).i(g3), ((V.e) ((V.b) j3.o()).f8751e).f8761f);
                    this.f1456r++;
                } else {
                    int i6 = ((V.e) ((V.b) j3.o()).f8751e).f8761f;
                    H0.J j4 = new H0.J(2);
                    j3.f1750u = true;
                    j3.B(i6, j4);
                    j3.f1750u = false;
                    this.f1456r++;
                    g3 = j4;
                }
                m3.m(obj, g3);
            }
            m((H0.J) g3, obj, z5, eVar);
        }
    }

    public final void l(H h3, boolean z5) {
        C0639x c0639x;
        if (z5 || !h3.f1418h) {
            h3.f1417g = T.r.A(Boolean.FALSE);
        } else {
            h3.f1417g.setValue(Boolean.FALSE);
        }
        if (h3.f1416f != null) {
            e(h3);
            return;
        }
        if (z5) {
            C0639x c0639x2 = h3.f1413c;
            if (c0639x2 != null) {
                c0639x2.l();
                return;
            }
            return;
        }
        H0.p0 outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) H0.M.a(this.f1442c)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (h3.f1418h || (c0639x = h3.f1413c) == null) {
                return;
            }
            c0639x.l();
            return;
        }
        A0.b bVar = new A0.b(h3, 2);
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) outOfFrameExecutor;
        Y3.j jVar = viewTreeObserverOnGlobalLayoutListenerC0216x.f2457k;
        boolean isEmpty = jVar.isEmpty();
        jVar.addLast(bVar);
        if (isEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC0216x.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC0216x.f2459l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010d, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x010a, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0117, B:67:0x0121), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010d, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x010a, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0117, B:67:0x0121), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010d, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x010a, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0117, B:67:0x0121), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010d, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x010a, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0117, B:67:0x0121), top: B:36:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [F0.H, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(H0.J r10, java.lang.Object r11, boolean r12, l4.e r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.Q.m(H0.J, java.lang.Object, boolean, l4.e):void");
    }

    public final H0.J n(Object obj) {
        k.M m3;
        int i6;
        if (this.f1455q == 0) {
            return null;
        }
        V.b bVar = (V.b) this.f1442c.o();
        int i7 = ((V.e) bVar.f8751e).f8761f - this.f1456r;
        int i8 = i7 - this.f1455q;
        int i9 = i7 - 1;
        int i10 = i9;
        while (true) {
            m3 = this.f1447i;
            if (i10 < i8) {
                i6 = -1;
                break;
            }
            Object g3 = m3.g((H0.J) bVar.get(i10));
            AbstractC1276k.c(g3);
            if (AbstractC1276k.b(((H) g3).a, obj)) {
                i6 = i10;
                break;
            }
            i10--;
        }
        if (i6 == -1) {
            while (i9 >= i8) {
                Object g6 = m3.g((H0.J) bVar.get(i9));
                AbstractC1276k.c(g6);
                H h3 = (H) g6;
                Object obj2 = h3.a;
                if (obj2 == AbstractC0137z.a || this.f1444f.h(obj, obj2)) {
                    h3.a = obj;
                    i10 = i9;
                    i6 = i10;
                    break;
                }
                i9--;
            }
            i10 = i9;
        }
        if (i6 == -1) {
            return null;
        }
        if (i10 != i8) {
            j(i10, i8);
        }
        this.f1455q--;
        H0.J j3 = (H0.J) bVar.get(i8);
        Object g7 = m3.g(j3);
        AbstractC1276k.c(g7);
        H h6 = (H) g7;
        h6.f1417g = T.r.A(Boolean.TRUE);
        h6.f1415e = true;
        h6.f1414d = true;
        return j3;
    }
}
