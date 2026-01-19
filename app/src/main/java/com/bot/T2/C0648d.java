package T2;

import o4.AbstractC1410a;

/* renamed from: T2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648d extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final char f8436e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8437f;

    public C0648d(char c6, int i6) {
        this.f8436e = c6;
        this.f8437f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0648d)) {
            return false;
        }
        C0648d c0648d = (C0648d) obj;
        return this.f8436e == c0648d.f8436e && this.f8437f == c0648d.f8437f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8437f) + (Character.hashCode(this.f8436e) * 31);
    }

    public final String toString() {
        return "FenceStart(marker=" + this.f8436e + ", count=" + this.f8437f + ")";
    }
}
