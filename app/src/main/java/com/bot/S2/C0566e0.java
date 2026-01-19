package S2;

import java.util.List;
import m4.AbstractC1276k;

/* renamed from: S2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566e0 {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7749b;

    public C0566e0(List list) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC1276k.f(list, "elements");
        this.a = list;
        this.f7749b = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0566e0)) {
            return false;
        }
        C0566e0 c0566e0 = (C0566e0) obj;
        return AbstractC1276k.b(this.a, c0566e0.a) && this.f7749b == c0566e0.f7749b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7749b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheEntry(elements=" + this.a + ", timestamp=" + this.f7749b + ")";
    }
}
