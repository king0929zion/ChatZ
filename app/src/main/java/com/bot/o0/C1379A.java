package o0;

/* renamed from: o0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379A {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1379A) {
            return this.a == ((C1379A) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 0 ? "Argb8888" : i6 == 1 ? "Alpha8" : i6 == 2 ? "Rgb565" : i6 == 3 ? "F16" : i6 == 4 ? "Gpu" : "Unknown";
    }
}
