package s2;

import Y3.w;
import java.util.Map;
import m4.AbstractC1276k;

/* renamed from: s2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1668p {

    /* renamed from: b, reason: collision with root package name */
    public static final C1668p f14813b = new C1668p(w.f9813c);
    public final Map a;

    public C1668p(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1668p) {
            return AbstractC1276k.b(this.a, ((C1668p) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.a + ')';
    }
}
