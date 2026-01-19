package Y3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class F extends h5.e {
    public static LinkedHashSet n0(Set set, Object obj) {
        AbstractC1276k.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C.H(set.size()));
        boolean z5 = false;
        for (Object obj2 : set) {
            boolean z6 = true;
            if (!z5 && AbstractC1276k.b(obj2, obj)) {
                z5 = true;
                z6 = false;
            }
            if (z6) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set o0(Set set, Iterable iterable) {
        AbstractC1276k.f(set, "<this>");
        Collection<?> J0 = iterable instanceof Collection ? (Collection) iterable : m.J0(iterable);
        if (J0.isEmpty()) {
            return m.N0(set);
        }
        if (!(J0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(J0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) J0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet p0(Set set, Iterable iterable) {
        AbstractC1276k.f(set, "<this>");
        AbstractC1276k.f(iterable, "elements");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(C.H(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        r.c0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet q0(Set set, Object obj) {
        AbstractC1276k.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C.H(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
