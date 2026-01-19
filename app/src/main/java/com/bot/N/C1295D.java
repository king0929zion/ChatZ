package n;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295D implements InterfaceC1292A {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1349x f12981b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12982c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12983d;

    public C1295D(int i6, int i7, InterfaceC1349x interfaceC1349x) {
        this.a = i6;
        this.f12981b = interfaceC1349x;
        this.f12982c = i6 * 1000000;
        this.f12983d = i7 * 1000000;
    }

    @Override // n.InterfaceC1292A
    public final float b(long j3, float f6, float f7, float f8) {
        long j4 = j3 - this.f12983d;
        if (j4 < 0) {
            j4 = 0;
        }
        long j5 = this.f12982c;
        long j6 = j4 > j5 ? j5 : j4;
        if (j6 == 0) {
            return f8;
        }
        return (e(j6, f6, f7, f8) - e(j6 - 1000000, f6, f7, f8)) * 1000.0f;
    }

    @Override // n.InterfaceC1292A
    public final long c(float f6, float f7, float f8) {
        return this.f12983d + this.f12982c;
    }

    @Override // n.InterfaceC1292A
    public final float e(long j3, float f6, float f7, float f8) {
        long j4 = j3 - this.f12983d;
        if (j4 < 0) {
            j4 = 0;
        }
        long j5 = this.f12982c;
        if (j4 > j5) {
            j4 = j5;
        }
        float c6 = this.f12981b.c(this.a == 0 ? 1.0f : ((float) j4) / ((float) j5));
        return (f7 * c6) + ((1 - c6) * f6);
    }
}
