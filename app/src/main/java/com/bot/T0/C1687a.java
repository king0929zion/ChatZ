package t0;

import H0.L;
import e1.j;
import e1.l;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o0.C1395f;
import o0.C1400k;
import o4.AbstractC1410a;
import q0.InterfaceC1498d;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1687a extends AbstractC1688b {

    /* renamed from: h, reason: collision with root package name */
    public final C1395f f14826h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14827i;

    /* renamed from: j, reason: collision with root package name */
    public int f14828j = 1;

    /* renamed from: k, reason: collision with root package name */
    public final long f14829k;

    /* renamed from: l, reason: collision with root package name */
    public float f14830l;

    /* renamed from: m, reason: collision with root package name */
    public C1400k f14831m;

    public C1687a(C1395f c1395f, long j3) {
        int i6;
        int i7;
        this.f14826h = c1395f;
        this.f14827i = j3;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i6 = (int) (j3 >> 32)) < 0 || (i7 = (int) (4294967295L & j3)) < 0 || i6 > c1395f.a.getWidth() || i7 > c1395f.a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f14829k = j3;
        this.f14830l = 1.0f;
    }

    @Override // t0.AbstractC1688b
    public final void c(float f6) {
        this.f14830l = f6;
    }

    @Override // t0.AbstractC1688b
    public final void d(C1400k c1400k) {
        this.f14831m = c1400k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1687a)) {
            return false;
        }
        C1687a c1687a = (C1687a) obj;
        return AbstractC1276k.b(this.f14826h, c1687a.f14826h) && j.c(0L, 0L) && l.b(this.f14827i, c1687a.f14827i) && this.f14828j == c1687a.f14828j;
    }

    @Override // t0.AbstractC1688b
    public final long h() {
        return AbstractC1410a.S(this.f14829k);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14828j) + AbstractC1135a.c(AbstractC1135a.c(this.f14826h.hashCode() * 31, 31, 0L), 31, this.f14827i);
    }

    @Override // t0.AbstractC1688b
    public final void i(L l3) {
        InterfaceC1498d.q0(l3, this.f14826h, this.f14827i, (Math.round(Float.intBitsToFloat((int) (r1.c() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (l3.f1765c.c() >> 32))) << 32), this.f14830l, this.f14831m, this.f14828j, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f14826h);
        sb.append(", srcOffset=");
        sb.append((Object) j.f(0L));
        sb.append(", srcSize=");
        sb.append((Object) l.c(this.f14827i));
        sb.append(", filterQuality=");
        int i6 = this.f14828j;
        sb.append((Object) (i6 == 0 ? "None" : i6 == 1 ? "Low" : i6 == 2 ? "Medium" : i6 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
