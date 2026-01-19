package X3;

import java.io.Serializable;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f9395c;

    public k(Throwable th) {
        AbstractC1276k.f(th, "exception");
        this.f9395c = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return AbstractC1276k.b(this.f9395c, ((k) obj).f9395c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9395c.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f9395c + ')';
    }
}
