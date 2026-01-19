package X3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final short f9412c;

    public /* synthetic */ w(short s5) {
        this.f9412c = s5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1276k.g(this.f9412c & 65535, ((w) obj).f9412c & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f9412c == ((w) obj).f9412c;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f9412c);
    }

    public final String toString() {
        return String.valueOf(this.f9412c & 65535);
    }
}
