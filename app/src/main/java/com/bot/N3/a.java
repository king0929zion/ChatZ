package N3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    public a(String str) {
        this.a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && AbstractC1276k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AttributeKey: " + this.a;
    }
}
