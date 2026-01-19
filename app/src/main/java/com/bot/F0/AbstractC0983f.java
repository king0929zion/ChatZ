package f0;

import H0.C0158m;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0983f {
    public C0989l a;

    /* renamed from: b, reason: collision with root package name */
    public long f11680b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11681c;

    /* renamed from: d, reason: collision with root package name */
    public int f11682d;

    public AbstractC0983f(long j3, C0989l c0989l) {
        int i6;
        int numberOfTrailingZeros;
        this.a = c0989l;
        this.f11680b = j3;
        C0990m c0990m = AbstractC0992o.a;
        if (j3 != 0) {
            C0989l d6 = d();
            long j4 = d6.f11700f;
            long[] jArr = d6.f11701g;
            if (jArr != null) {
                j3 = jArr[0];
            } else {
                long j5 = d6.f11699e;
                if (j5 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j5);
                } else {
                    long j6 = d6.f11698c;
                    if (j6 != 0) {
                        j4 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                    }
                }
                j3 = numberOfTrailingZeros + j4;
            }
            synchronized (AbstractC0992o.f11707c) {
                i6 = AbstractC0992o.f11710f.a(j3);
            }
        } else {
            i6 = -1;
        }
        this.f11682d = i6;
    }

    public static void q(AbstractC0983f abstractC0983f) {
        AbstractC0992o.f11706b.o(abstractC0983f);
    }

    public final void a() {
        synchronized (AbstractC0992o.f11707c) {
            b();
            p();
        }
    }

    public void b() {
        AbstractC0992o.f11708d = AbstractC0992o.f11708d.b(g());
    }

    public abstract void c();

    public C0989l d() {
        return this.a;
    }

    public abstract l4.c e();

    public abstract boolean f();

    public long g() {
        return this.f11680b;
    }

    public int h() {
        return 0;
    }

    public abstract l4.c i();

    public final AbstractC0983f j() {
        C0158m c0158m = AbstractC0992o.f11706b;
        AbstractC0983f abstractC0983f = (AbstractC0983f) c0158m.e();
        c0158m.o(this);
        return abstractC0983f;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(InterfaceC0972B interfaceC0972B);

    public final void o() {
        int i6 = this.f11682d;
        if (i6 >= 0) {
            AbstractC0992o.u(i6);
            this.f11682d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(C0989l c0989l) {
        this.a = c0989l;
    }

    public void s(long j3) {
        this.f11680b = j3;
    }

    public void t(int i6) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC0983f u(l4.c cVar);
}
