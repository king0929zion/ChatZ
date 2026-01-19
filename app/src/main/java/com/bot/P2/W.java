package P2;

import m4.AbstractC1276k;
import o0.C1395f;

/* loaded from: classes.dex */
public final class W {
    public final C1395f a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4804b;

    public W(C1395f c1395f, boolean z5) {
        this.a = c1395f;
        this.f4804b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w5 = (W) obj;
        return AbstractC1276k.b(this.a, w5.a) && this.f4804b == w5.f4804b;
    }

    public final int hashCode() {
        C1395f c1395f = this.a;
        return Boolean.hashCode(this.f4804b) + ((c1395f == null ? 0 : c1395f.hashCode()) * 31);
    }

    public final String toString() {
        return "DecodedImageState(bitmap=" + this.a + ", isLoading=" + this.f4804b + ")";
    }
}
