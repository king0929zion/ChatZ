package t2;

import io.ktor.utils.io.u;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717a extends u {

    /* renamed from: b, reason: collision with root package name */
    public final int f14900b;

    public C1717a(int i6) {
        this.f14900b = i6;
        if (i6 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1717a) {
            return this.f14900b == ((C1717a) obj).f14900b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14900b;
    }

    public final String toString() {
        return String.valueOf(this.f14900b);
    }
}
