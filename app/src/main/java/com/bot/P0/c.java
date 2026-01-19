package P0;

/* loaded from: classes.dex */
public final class c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4432b;

    public c(int i6, int i7) {
        this.a = i6;
        this.f4432b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.f4432b == cVar.f4432b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4432b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.a);
        sb.append(", columnCount=");
        return B3.e.q(sb, this.f4432b, ')');
    }
}
