package H0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class N {
    public final J a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1767b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1768c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1770e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1771f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1772g;

    /* renamed from: h, reason: collision with root package name */
    public int f1773h;

    /* renamed from: i, reason: collision with root package name */
    public int f1774i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1775j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1776k;

    /* renamed from: l, reason: collision with root package name */
    public int f1777l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1778m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1779n;

    /* renamed from: o, reason: collision with root package name */
    public int f1780o;

    /* renamed from: q, reason: collision with root package name */
    public W f1782q;

    /* renamed from: d, reason: collision with root package name */
    public F f1769d = F.f1700h;

    /* renamed from: p, reason: collision with root package name */
    public final C0139a0 f1781p = new C0139a0(this);

    public N(J j3) {
        this.a = j3;
    }

    public final i0 a() {
        return this.a.f1721J.f1917d;
    }

    public final void b() {
        F f6 = this.a.f1722K.f1769d;
        F f7 = F.f1698f;
        F f8 = F.f1699g;
        if (f6 == f7 || f6 == f8) {
            if (this.f1781p.f1857E) {
                g(true);
            } else {
                f(true);
            }
        }
        if (f6 == f8) {
            W w5 = this.f1782q;
            if (w5 == null || !w5.f1839y) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j3) {
        W w5 = this.f1782q;
        if (w5 != null) {
            N n3 = w5.f1823i;
            n3.f1769d = F.f1697e;
            C0139a0 c0139a0 = n3.f1781p;
            J j4 = n3.a;
            n3.f1770e = false;
            w5.f1819C = j3;
            t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j4)).getSnapshotObserver();
            V v5 = w5.f1820D;
            snapshotObserver.a.d(j4, snapshotObserver.f1991b, v5);
            n3.f1771f = true;
            n3.f1772g = true;
            if (AbstractC0157l.q(j4)) {
                c0139a0.f1886z = true;
                c0139a0.f1853A = true;
            } else {
                c0139a0.f1885y = true;
            }
            n3.f1769d = F.f1700h;
        }
    }

    public final void d(int i6) {
        int i7 = this.f1777l;
        this.f1777l = i6;
        if ((i7 == 0) != (i6 == 0)) {
            J v5 = this.a.v();
            N n3 = v5 != null ? v5.f1722K : null;
            if (n3 != null) {
                if (i6 == 0) {
                    n3.d(n3.f1777l - 1);
                } else {
                    n3.d(n3.f1777l + 1);
                }
            }
        }
    }

    public final void e(int i6) {
        int i7 = this.f1780o;
        this.f1780o = i6;
        if ((i7 == 0) != (i6 == 0)) {
            J v5 = this.a.v();
            N n3 = v5 != null ? v5.f1722K : null;
            if (n3 != null) {
                if (i6 == 0) {
                    n3.e(n3.f1780o - 1);
                } else {
                    n3.e(n3.f1780o + 1);
                }
            }
        }
    }

    public final void f(boolean z5) {
        if (this.f1776k != z5) {
            this.f1776k = z5;
            if (z5 && !this.f1775j) {
                d(this.f1777l + 1);
            } else {
                if (z5 || this.f1775j) {
                    return;
                }
                d(this.f1777l - 1);
            }
        }
    }

    public final void g(boolean z5) {
        if (this.f1775j != z5) {
            this.f1775j = z5;
            if (z5 && !this.f1776k) {
                d(this.f1777l + 1);
            } else {
                if (z5 || this.f1776k) {
                    return;
                }
                d(this.f1777l - 1);
            }
        }
    }

    public final void h(boolean z5) {
        if (this.f1779n != z5) {
            this.f1779n = z5;
            if (z5 && !this.f1778m) {
                e(this.f1780o + 1);
            } else {
                if (z5 || this.f1778m) {
                    return;
                }
                e(this.f1780o - 1);
            }
        }
    }

    public final void i(boolean z5) {
        if (this.f1778m != z5) {
            this.f1778m = z5;
            if (z5 && !this.f1779n) {
                e(this.f1780o + 1);
            } else {
                if (z5 || this.f1779n) {
                    return;
                }
                e(this.f1780o - 1);
            }
        }
    }

    public final void j() {
        C0139a0 c0139a0 = this.f1781p;
        N n3 = c0139a0.f1869i;
        Object obj = c0139a0.f1882v;
        J j3 = this.a;
        if ((obj != null || n3.a().H() != null) && c0139a0.f1881u) {
            c0139a0.f1881u = false;
            c0139a0.f1882v = n3.a().H();
            J v5 = j3.v();
            if (v5 != null) {
                J.X(v5, false, 7);
            }
        }
        W w5 = this.f1782q;
        if (w5 != null) {
            N n5 = w5.f1823i;
            if (w5.f1818B == null) {
                T U02 = n5.a().U0();
                AbstractC1276k.c(U02);
                if (U02.f1805r.H() == null) {
                    return;
                }
            }
            if (w5.f1817A) {
                w5.f1817A = false;
                T U03 = n5.a().U0();
                AbstractC1276k.c(U03);
                w5.f1818B = U03.f1805r.H();
                if (AbstractC0157l.q(j3)) {
                    J v6 = j3.v();
                    if (v6 != null) {
                        J.X(v6, false, 7);
                        return;
                    }
                    return;
                }
                J v7 = j3.v();
                if (v7 != null) {
                    J.V(v7, false, 7);
                }
            }
        }
    }
}
