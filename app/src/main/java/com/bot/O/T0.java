package O;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class T0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4037b;

    public T0(long j3, long j4) {
        this.a = j3;
        this.f4037b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T0)) {
            return false;
        }
        T0 t02 = (T0) obj;
        return o0.s.d(this.a, t02.a) && o0.s.d(this.f4037b, t02.f4037b);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f4037b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC1135a.p(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) o0.s.j(this.f4037b));
        sb.append(')');
        return sb.toString();
    }
}
