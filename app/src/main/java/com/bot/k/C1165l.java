package k;

/* renamed from: k.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165l {
    public final long a;

    public static long a(int i6, int i7) {
        return (i7 & 4294967295L) | (i6 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1165l) {
            return this.a == ((C1165l) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j3 = this.a;
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return B3.e.q(sb, (int) (j3 & 4294967295L), ')');
    }
}
