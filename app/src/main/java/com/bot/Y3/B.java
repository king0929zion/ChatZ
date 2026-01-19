package Y3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class B implements C,   {
    public static Object Y(Object obj, Map map) {
        AbstractC1276k.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map Z(X3.i... iVarArr) {
        if (iVarArr.length <= 0) {
            return w.f9813c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C.H(iVarArr.length));
        a0(linkedHashMap, iVarArr);
        return linkedHashMap;
    }

    public static final void a0(HashMap hashMap, X3.i[] iVarArr) {
        for (X3.i iVar : iVarArr) {
            hashMap.put(iVar.f9393c, iVar.f9394e);
        }
    }

    public static List b0(Map map) {
        AbstractC1276k.f(map, "<this>");
        int size = map.size();
        v vVar = v.f9812c;
        if (size == 0) {
            return vVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return vVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return Y4.l.H(new X3.i(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new X3.i(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new X3.i(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map c0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return w.f9813c;
        }
        if (size == 1) {
            return C.I((X3.i) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C.H(arrayList.size()));
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj = arrayList.get(i6);
            i6++;
            X3.i iVar = (X3.i) obj;
            linkedHashMap.put(iVar.f9393c, iVar.f9394e);
        }
        return linkedHashMap;
    }

    public static Map d0(Map map) {
        AbstractC1276k.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? e0(map) : C.V(map) : w.f9813c;
    }

    public static LinkedHashMap e0(Map map) {
        AbstractC1276k.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
