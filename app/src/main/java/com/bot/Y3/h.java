package Y3;

import java.util.Iterator;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class h implements  Set {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        AbstractC1276k.f(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i6 += next != null ? next.hashCode() : 0;
        }
        return i6;
    }
}
