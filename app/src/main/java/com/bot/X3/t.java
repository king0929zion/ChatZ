package X3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final long f9410c;

    public /* synthetic */ t(long j3) {
        this.f9410c = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC1276k.h(this.f9410c ^ Long.MIN_VALUE, ((t) obj).f9410c ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f9410c == ((t) obj).f9410c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9410c);
    }

    public final String toString() {
        return a.g(this.f9410c, 10);
    }
}
