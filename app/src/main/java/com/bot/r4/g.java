package r4;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: g, reason: collision with root package name */
    public static final g f14686g = new e(1, 0, 1);

    @Override // r4.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.f14679c == gVar.f14679c && this.f14680e == gVar.f14680e;
    }

    @Override // r4.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f14679c * 31) + this.f14680e;
    }

    @Override // r4.e
    public final boolean isEmpty() {
        return this.f14679c > this.f14680e;
    }

    @Override // r4.e
    public final String toString() {
        return this.f14679c + ".." + this.f14680e;
    }
}
