package T;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class H0 {
    public final C0626q a;

    public /* synthetic */ H0(C0626q c0626q) {
        this.a = c0626q;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H0) {
            return AbstractC1276k.b(this.a, ((H0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
