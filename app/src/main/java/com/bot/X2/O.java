package X2;

import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class O {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9226b;

    public O(AbstractList abstractList, Map map) {
        AbstractC1276k.f(abstractList, "tools");
        this.a = abstractList;
        this.f9226b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o5 = (O) obj;
        return AbstractC1276k.b(this.a, o5.a) && this.f9226b.equals(o5.f9226b);
    }

    public final int hashCode() {
        return this.f9226b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "McpToolRegistry(tools=" + this.a + ", toolServerMap=" + this.f9226b + ")";
    }
}
