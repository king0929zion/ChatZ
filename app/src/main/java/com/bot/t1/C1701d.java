package t1;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701d {
    public final DisplayCutout a;

    public C1701d(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final o1.c a() {
        return Build.VERSION.SDK_INT >= 30 ? o1.c.c(L0.c.b(this.a)) : o1.c.f13500e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1701d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C1701d) obj).a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
