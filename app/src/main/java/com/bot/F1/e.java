package F1;

import Y3.B;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import m4.AbstractC1276k;
import m4.C1270e;
import s2.C1666n;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class e {
    public final LinkedHashMap a;

    public e(int i6) {
        switch (i6) {
            case 1:
                this.a = new LinkedHashMap();
                return;
            case 2:
                this.a = new LinkedHashMap();
                return;
            case 3:
                this.a = new LinkedHashMap(0, 0.75f, true);
                return;
            case 4:
            default:
                this.a = new LinkedHashMap();
                return;
            case AbstractC1787b.f15290g /* 5 */:
                this.a = new LinkedHashMap((int) ((7 / 0.75f) + 1.0f));
                return;
        }
    }

    public void a(C1270e c1270e, l4.c cVar) {
        AbstractC1276k.f(cVar, "initializer");
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(c1270e)) {
            linkedHashMap.put(c1270e, new g(c1270e, cVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + c1270e.b() + '.').toString());
    }

    public void b(B2.a aVar) {
        AbstractC1276k.f(aVar, "migration");
        int i6 = aVar.a;
        int i7 = aVar.f498b;
        Integer valueOf = Integer.valueOf(i6);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i7))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i7)) + " with " + aVar);
        }
        treeMap.put(Integer.valueOf(i7), aVar);
    }

    public d c() {
        Collection values = this.a.values();
        AbstractC1276k.f(values, "initializers");
        g[] gVarArr = (g[]) values.toArray(new g[0]);
        return new d((g[]) Arrays.copyOf(gVarArr, gVarArr.length));
    }

    public kotlinx.serialization.json.c d() {
        return new kotlinx.serialization.json.c(this.a);
    }

    public kotlinx.serialization.json.b e(String str, kotlinx.serialization.json.b bVar) {
        AbstractC1276k.f(bVar, "element");
        return (kotlinx.serialization.json.b) this.a.put(str, bVar);
    }

    public e(C1666n c1666n) {
        this.a = B.e0(c1666n.f14806c);
    }
}
