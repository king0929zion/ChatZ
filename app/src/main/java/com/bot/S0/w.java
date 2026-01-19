package S0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f7674c = new w(0, false);
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7675b;

    public w() {
        this.a = false;
        this.f7675b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && this.f7675b == wVar.f7675b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7675b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) C0549k.a(this.f7675b)) + ')';
    }

    public w(int i6, boolean z5) {
        this.a = z5;
        this.f7675b = i6;
    }
}
