package D2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class h extends i {
    public final Object a;

    public h(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && AbstractC1276k.b(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + ")";
    }
}
