package A4;

/* loaded from: classes.dex */
public final class d0 {
    public final long a;

    public d0(long j3) {
        this.a = j3;
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j3 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.a == ((d0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        Z3.b bVar = new Z3.b(2);
        long j3 = this.a;
        if (j3 > 0) {
            bVar.add("stopTimeout=" + j3 + "ms");
        }
        return B3.e.r(new StringBuilder("SharingStarted.WhileSubscribed("), Y3.m.v0(Y4.l.p(bVar), null, null, null, null, 63), ')');
    }
}
