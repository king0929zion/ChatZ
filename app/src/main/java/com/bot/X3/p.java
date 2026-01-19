package X3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class p implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final byte f9406c;

    public /* synthetic */ p(byte b5) {
        this.f9406c = b5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1276k.g(this.f9406c & 255, ((p) obj).f9406c & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f9406c == ((p) obj).f9406c;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f9406c);
    }

    public final String toString() {
        return String.valueOf(this.f9406c & 255);
    }
}
