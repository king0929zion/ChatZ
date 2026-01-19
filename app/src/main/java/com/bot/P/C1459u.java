package p;

import B0.C0040p;
import D.C0057a0;
import H0.AbstractC0156k;
import T.C0602e;
import T.C0607g0;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import e1.InterfaceC0961c;
import i4.AbstractC1120d;
import n0.C1356e;
import o4.AbstractC1410a;
import v.InterfaceC1802i0;

/* renamed from: p.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459u {
    public final InterfaceC0961c a;

    /* renamed from: b, reason: collision with root package name */
    public long f13799b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final X f13800c;

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f13801d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13802e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13803f;

    /* renamed from: g, reason: collision with root package name */
    public long f13804g;

    /* renamed from: h, reason: collision with root package name */
    public long f13805h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0156k f13806i;

    public C1459u(Context context, InterfaceC0961c interfaceC0961c, long j3, InterfaceC1802i0 interfaceC1802i0) {
        this.a = interfaceC0961c;
        X x5 = new X(context, o0.y.B(j3));
        this.f13800c = x5;
        this.f13801d = new C0607g0(X3.y.a, C0602e.f8080g);
        this.f13802e = true;
        this.f13804g = 0L;
        this.f13805h = -1L;
        C0057a0 c0057a0 = new C0057a0(this, 5);
        C0040p c0040p = B0.Q.a;
        B0.X x6 = new B0.X(null, null, c0057a0);
        this.f13806i = Build.VERSION.SDK_INT >= 31 ? new C1430e0(x6, this, x5) : new C1430e0(x6, this, x5, interfaceC1802i0);
    }

    public final void a() {
        boolean z5;
        X x5 = this.f13800c;
        EdgeEffect edgeEffect = x5.f13660d;
        boolean z6 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = !edgeEffect.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = x5.f13661e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 = !edgeEffect2.isFinished() || z5;
        }
        EdgeEffect edgeEffect3 = x5.f13662f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 = !edgeEffect3.isFinished() || z5;
        }
        EdgeEffect edgeEffect4 = x5.f13663g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z5) {
                z6 = false;
            }
            z5 = z6;
        }
        if (z5) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, l4.e r21, d4.c r22) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1459u.b(long, l4.e, d4.c):java.lang.Object");
    }

    public final long c() {
        long j3 = this.f13799b;
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            j3 = AbstractC1120d.p(this.f13804g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (this.f13804g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (this.f13804g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f13802e) {
            this.f13801d.setValue(X3.y.a);
        }
    }

    public final float e(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i6 = (int) (j3 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i6) / Float.intBitsToFloat((int) (this.f13804g & 4294967295L));
        EdgeEffect b5 = this.f13800c.b();
        float f6 = -intBitsToFloat2;
        float f7 = 1 - intBitsToFloat;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            f6 = AbstractC1462x.c(b5, f6, f7);
        } else {
            b5.onPull(f6, f7);
        }
        return (i7 >= 31 ? AbstractC1462x.b(b5) : 0.0f) == S.l.f7374V ? Float.intBitsToFloat((int) (4294967295L & this.f13804g)) * (-f6) : Float.intBitsToFloat(i6);
    }

    public final float f(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i6 = (int) (j3 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i6) / Float.intBitsToFloat((int) (this.f13804g >> 32));
        EdgeEffect c6 = this.f13800c.c();
        float f6 = 1 - intBitsToFloat;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            intBitsToFloat2 = AbstractC1462x.c(c6, intBitsToFloat2, f6);
        } else {
            c6.onPull(intBitsToFloat2, f6);
        }
        return (i7 >= 31 ? AbstractC1462x.b(c6) : 0.0f) == S.l.f7374V ? Float.intBitsToFloat((int) (this.f13804g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i6);
    }

    public final float g(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i6 = (int) (j3 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i6) / Float.intBitsToFloat((int) (this.f13804g >> 32));
        EdgeEffect d6 = this.f13800c.d();
        float f6 = -intBitsToFloat2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            f6 = AbstractC1462x.c(d6, f6, intBitsToFloat);
        } else {
            d6.onPull(f6, intBitsToFloat);
        }
        return (i7 >= 31 ? AbstractC1462x.b(d6) : 0.0f) == S.l.f7374V ? Float.intBitsToFloat((int) (this.f13804g >> 32)) * (-f6) : Float.intBitsToFloat(i6);
    }

    public final float h(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i6 = (int) (j3 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i6) / Float.intBitsToFloat((int) (this.f13804g & 4294967295L));
        EdgeEffect e6 = this.f13800c.e();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            intBitsToFloat2 = AbstractC1462x.c(e6, intBitsToFloat2, intBitsToFloat);
        } else {
            e6.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i7 >= 31 ? AbstractC1462x.b(e6) : 0.0f) == S.l.f7374V ? Float.intBitsToFloat((int) (this.f13804g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i6);
    }

    public final void i(long j3) {
        boolean a = C1356e.a(this.f13804g, 0L);
        boolean a6 = C1356e.a(j3, this.f13804g);
        this.f13804g = j3;
        if (!a6) {
            long K2 = (AbstractC1410a.K(Float.intBitsToFloat((int) (j3 & 4294967295L))) & 4294967295L) | (AbstractC1410a.K(Float.intBitsToFloat((int) (j3 >> 32))) << 32);
            X x5 = this.f13800c;
            x5.f13659c = K2;
            EdgeEffect edgeEffect = x5.f13660d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (K2 >> 32), (int) (K2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = x5.f13661e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (K2 >> 32), (int) (K2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = x5.f13662f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (K2 & 4294967295L), (int) (K2 >> 32));
            }
            EdgeEffect edgeEffect4 = x5.f13663g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (K2 & 4294967295L), (int) (K2 >> 32));
            }
            EdgeEffect edgeEffect5 = x5.f13664h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (K2 >> 32), (int) (K2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = x5.f13665i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (K2 >> 32), (int) (K2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = x5.f13666j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (K2 & 4294967295L), (int) (K2 >> 32));
            }
            EdgeEffect edgeEffect8 = x5.f13667k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & K2), (int) (K2 >> 32));
            }
        }
        if (a || a6) {
            return;
        }
        a();
    }
}
