package j2;

import F0.AbstractC0137z;
import F0.InterfaceC0121i;
import H0.L;
import T.C0599c0;
import T.C0601d0;
import T.C0607g0;
import android.os.SystemClock;
import f0.C0987j;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import n0.C1356e;
import o0.C1400k;
import q0.C1496b;
import t0.AbstractC1688b;

/* loaded from: classes.dex */
public final class t extends AbstractC1688b {

    /* renamed from: h, reason: collision with root package name */
    public AbstractC1688b f12406h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1688b f12407i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0121i f12408j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12409k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12410l;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12413o;

    /* renamed from: m, reason: collision with root package name */
    public final C0601d0 f12411m = new C0601d0(0);

    /* renamed from: n, reason: collision with root package name */
    public long f12412n = -1;

    /* renamed from: p, reason: collision with root package name */
    public final C0599c0 f12414p = new C0599c0(1.0f);

    /* renamed from: q, reason: collision with root package name */
    public final C0607g0 f12415q = T.r.A(null);

    public t(AbstractC1688b abstractC1688b, AbstractC1688b abstractC1688b2, InterfaceC0121i interfaceC0121i, int i6, boolean z5) {
        this.f12406h = abstractC1688b;
        this.f12407i = abstractC1688b2;
        this.f12408j = interfaceC0121i;
        this.f12409k = i6;
        this.f12410l = z5;
    }

    @Override // t0.AbstractC1688b
    public final void c(float f6) {
        this.f12414p.h(f6);
    }

    @Override // t0.AbstractC1688b
    public final void d(C1400k c1400k) {
        this.f12415q.setValue(c1400k);
    }

    @Override // t0.AbstractC1688b
    public final long h() {
        AbstractC1688b abstractC1688b = this.f12406h;
        long h3 = abstractC1688b != null ? abstractC1688b.h() : 0L;
        AbstractC1688b abstractC1688b2 = this.f12407i;
        long h6 = abstractC1688b2 != null ? abstractC1688b2.h() : 0L;
        boolean z5 = h3 != 9205357640488583168L;
        boolean z6 = h6 != 9205357640488583168L;
        if (z5 && z6) {
            return AbstractC1120d.c(Math.max(C1356e.d(h3), C1356e.d(h6)), Math.max(C1356e.b(h3), C1356e.b(h6)));
        }
        return 9205357640488583168L;
    }

    @Override // t0.AbstractC1688b
    public final void i(L l3) {
        boolean z5 = this.f12413o;
        C0599c0 c0599c0 = this.f12414p;
        AbstractC1688b abstractC1688b = this.f12407i;
        if (z5) {
            j(l3, abstractC1688b, c0599c0.g());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f12412n == -1) {
            this.f12412n = uptimeMillis;
        }
        float f6 = ((float) (uptimeMillis - this.f12412n)) / this.f12409k;
        float g3 = c0599c0.g() * AbstractC1117a.e(f6, S.l.f7374V, 1.0f);
        float g6 = this.f12410l ? c0599c0.g() - g3 : c0599c0.g();
        this.f12413o = f6 >= 1.0f;
        j(l3, this.f12406h, g6);
        j(l3, abstractC1688b, g3);
        if (this.f12413o) {
            this.f12406h = null;
        } else {
            C0601d0 c0601d0 = this.f12411m;
            c0601d0.h(c0601d0.g() + 1);
        }
    }

    public final void j(L l3, AbstractC1688b abstractC1688b, float f6) {
        C1496b c1496b = l3.f1765c;
        if (abstractC1688b == null || f6 <= S.l.f7374V) {
            return;
        }
        long c6 = c1496b.c();
        long h3 = abstractC1688b.h();
        long o5 = (h3 == 9205357640488583168L || C1356e.e(h3) || c6 == 9205357640488583168L || C1356e.e(c6)) ? c6 : AbstractC0137z.o(h3, this.f12408j.a(h3, c6));
        C0607g0 c0607g0 = this.f12415q;
        if (c6 == 9205357640488583168L || C1356e.e(c6)) {
            abstractC1688b.g(l3, o5, f6, (C1400k) c0607g0.getValue());
            return;
        }
        long j3 = o5;
        float f7 = 2;
        float d6 = (C1356e.d(c6) - C1356e.d(j3)) / f7;
        float b5 = (C1356e.b(c6) - C1356e.b(j3)) / f7;
        ((C0987j) c1496b.f13944e.f1972e).y(d6, b5, d6, b5);
        abstractC1688b.g(l3, j3, f6, (C1400k) c0607g0.getValue());
        float f8 = -d6;
        float f9 = -b5;
        ((C0987j) c1496b.f13944e.f1972e).y(f8, f9, f8, f9);
    }
}
