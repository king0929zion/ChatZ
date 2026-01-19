package d1;

/* renamed from: d1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f11383b = 66305;
    public final int a;

    public static String a(int i6) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i7 = i6 & 255;
        String str = "Invalid";
        sb.append((Object) (i7 == 1 ? "Strategy.Simple" : i7 == 2 ? "Strategy.HighQuality" : i7 == 3 ? "Strategy.Balanced" : i7 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i8 = (i6 >> 8) & 255;
        sb.append((Object) (i8 == 1 ? "Strictness.None" : i8 == 2 ? "Strictness.Loose" : i8 == 3 ? "Strictness.Normal" : i8 == 4 ? "Strictness.Strict" : i8 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i9 = (i6 >> 16) & 255;
        if (i9 == 1) {
            str = "WordBreak.None";
        } else if (i9 == 2) {
            str = "WordBreak.Phrase";
        } else if (i9 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0938e) {
            return this.a == ((C0938e) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
