package N3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class t implements q {

    /* renamed from: c, reason: collision with root package name */
    public final Map f3878c;

    public t(Map map) {
        AbstractC1276k.f(map, "values");
        h hVar = new h();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add((String) list.get(i6));
            }
            hVar.put(str, arrayList);
        }
        this.f3878c = hVar;
    }

    @Override // N3.q
    public final Set a() {
        Set entrySet = this.f3878c.entrySet();
        AbstractC1276k.f(entrySet, "<this>");
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        AbstractC1276k.e(unmodifiableSet, "unmodifiableSet(this)");
        return unmodifiableSet;
    }

    @Override // N3.q
    public final boolean b() {
        return true;
    }

    @Override // N3.q
    public final void c(l4.e eVar) {
        for (Map.Entry entry : this.f3878c.entrySet()) {
            eVar.m((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // N3.q
    public final String d(String str) {
        List list = (List) this.f3878c.get(str);
        if (list != null) {
            return (String) Y3.m.q0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (true != qVar.b()) {
            return false;
        }
        return a().equals(qVar.a());
    }

    public final int hashCode() {
        Set a = a();
        return a.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // N3.q
    public final boolean isEmpty() {
        return this.f3878c.isEmpty();
    }
}
