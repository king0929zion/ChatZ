package z0;

import android.view.KeyEvent;
import m4.AbstractC1276k;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014b {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2014b) {
            return AbstractC1276k.b(this.a, ((C2014b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
