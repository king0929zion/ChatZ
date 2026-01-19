package F0;

/* renamed from: F0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123k implements InterfaceC0121i {
    @Override // F0.InterfaceC0121i
    public final long a(long j3, long j4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (4294967295L & Float.floatToRawIntBits(1.0f));
        int i6 = q0.a;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0123k)) {
            return false;
        }
        ((C0123k) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
