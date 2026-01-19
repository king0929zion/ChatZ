package X3;

import java.io.Serializable;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class l implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Object f9396c;

    public /* synthetic */ l(Object obj) {
        this.f9396c = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof k) {
            return ((k) obj).f9395c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return AbstractC1276k.b(this.f9396c, ((l) obj).f9396c);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9396c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f9396c;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
