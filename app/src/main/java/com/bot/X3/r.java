package X3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final int f9408c;

    public /* synthetic */ r(int i6) {
        this.f9408c = i6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC1276k.g(this.f9408c ^ Integer.MIN_VALUE, ((r) obj).f9408c ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f9408c == ((r) obj).f9408c;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9408c);
    }

    public final String toString() {
        return String.valueOf(this.f9408c & 4294967295L);
    }
}
