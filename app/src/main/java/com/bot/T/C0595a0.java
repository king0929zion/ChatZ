package T;

import m4.AbstractC1276k;

/* renamed from: T.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595a0 {
    public final String a;

    public C0595a0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0595a0) && AbstractC1276k.b(this.a, ((C0595a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
