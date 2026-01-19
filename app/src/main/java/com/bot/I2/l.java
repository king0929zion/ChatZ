package I2;

import java.util.List;

/* loaded from: classes.dex */
public final class l extends m {
    public final Object a;

    public l(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a.equals(((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToolCalls(tools=" + this.a + ")";
    }
}
