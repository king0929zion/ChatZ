package P2;

/* renamed from: P2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345b0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4828b;

    public C0345b0(long j3, long j4) {
        this.a = j3;
        this.f4828b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0345b0)) {
            return false;
        }
        C0345b0 c0345b0 = (C0345b0) obj;
        return o0.s.d(this.a, c0345b0.a) && o0.s.d(this.f4828b, c0345b0.f4828b);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f4828b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return B3.e.o("InputModeChipColors(background=", o0.s.j(this.a), ", content=", o0.s.j(this.f4828b), ")");
    }
}
