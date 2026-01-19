package h0;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030g implements InterfaceC1028e {
    public final float a;

    public C1030g(float f6) {
        this.a = f6;
    }

    @Override // h0.InterfaceC1028e
    public final long a(long j3, long j4, e1.m mVar) {
        long j5 = ((((int) (j4 >> 32)) - ((int) (j3 >> 32))) << 32) | ((((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) & 4294967295L);
        float f6 = 1;
        float f7 = (this.a + f6) * (((int) (j5 >> 32)) / 2.0f);
        float f8 = (f6 - 1.0f) * (((int) (j5 & 4294967295L)) / 2.0f);
        return (Math.round(f8) & 4294967295L) | (Math.round(f7) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1030g) && Float.compare(this.a, ((C1030g) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
