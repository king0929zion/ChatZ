package G;

/* loaded from: classes.dex */
public final class a {
    public final int a;

    public a(int i6) {
        this.a = i6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
