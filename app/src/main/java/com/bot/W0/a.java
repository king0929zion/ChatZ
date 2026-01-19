package W0;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: c, reason: collision with root package name */
    public final int f8824c;

    public a(int i6) {
        this.f8824c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f8824c == ((a) obj).f8824c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8824c);
    }

    public final String toString() {
        return B3.e.q(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f8824c, ')');
    }
}
