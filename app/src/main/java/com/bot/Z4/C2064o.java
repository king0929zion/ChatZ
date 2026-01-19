package z4;

import m4.AbstractC1276k;

/* renamed from: z4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2064o {

    /* renamed from: b, reason: collision with root package name */
    public static final C2063n f16373b = new Object();
    public final Object a;

    public static final Object a(Object obj) {
        if (obj instanceof C2063n) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2064o) {
            return AbstractC1276k.b(this.a, ((C2064o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof C2062m) {
            return ((C2062m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
