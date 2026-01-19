package T2;

/* loaded from: classes.dex */
public final class W extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8422c;

    public W(boolean z5) {
        this.f8422c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W) && this.f8422c == ((W) obj).f8422c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8422c);
    }

    public final String toString() {
        return "InHtmlTagName(isClosing=" + this.f8422c + ")";
    }
}
