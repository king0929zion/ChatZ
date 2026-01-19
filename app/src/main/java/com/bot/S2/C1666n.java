package s2;

import Y3.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: s2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1666n implements Iterable, InterfaceC1372a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1666n f14805e = new C1666n(w.f9813c);

    /* renamed from: c, reason: collision with root package name */
    public final Map f14806c;

    public C1666n(Map map) {
        this.f14806c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1666n) {
            return AbstractC1276k.b(this.f14806c, ((C1666n) obj).f14806c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14806c.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f14806c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new X3.i(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f14806c + ')';
    }
}
