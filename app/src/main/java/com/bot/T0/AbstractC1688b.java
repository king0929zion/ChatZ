package t0;

import H0.L;
import L1.d;
import S.l;
import e1.m;
import f0.C0987j;
import m4.AbstractC1276k;
import o0.C1400k;
import q0.C1496b;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1688b {

    /* renamed from: c, reason: collision with root package name */
    public d f14832c;

    /* renamed from: e, reason: collision with root package name */
    public C1400k f14833e;

    /* renamed from: f, reason: collision with root package name */
    public float f14834f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public m f14835g = m.f11576c;

    public abstract void c(float f6);

    public abstract void d(C1400k c1400k);

    public void f(m mVar) {
    }

    public final void g(L l3, long j3, float f6, C1400k c1400k) {
        C1496b c1496b = l3.f1765c;
        if (this.f14834f != f6) {
            c(f6);
            this.f14834f = f6;
        }
        if (!AbstractC1276k.b(this.f14833e, c1400k)) {
            d(c1400k);
            this.f14833e = c1400k;
        }
        m layoutDirection = l3.getLayoutDirection();
        if (this.f14835g != layoutDirection) {
            f(layoutDirection);
            this.f14835g = layoutDirection;
        }
        int i6 = (int) (j3 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (c1496b.c() >> 32)) - Float.intBitsToFloat(i6);
        int i7 = (int) (j3 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c1496b.c() & 4294967295L)) - Float.intBitsToFloat(i7);
        ((C0987j) c1496b.f13944e.f1972e).y(l.f7374V, l.f7374V, intBitsToFloat, intBitsToFloat2);
        if (f6 > l.f7374V) {
            try {
                if (Float.intBitsToFloat(i6) > l.f7374V && Float.intBitsToFloat(i7) > l.f7374V) {
                    i(l3);
                }
            } finally {
                ((C0987j) c1496b.f13944e.f1972e).y(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long h();

    public abstract void i(L l3);
}
