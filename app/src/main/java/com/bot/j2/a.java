package J2;

import E2.b;
import L2.h;
import L2.i;
import M4.C0255c;
import M4.F;
import N4.j;
import N4.m;
import Y3.C;
import Y3.n;
import com.bot.core.model.ToolCallInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.c;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a {
    public static final m a = b.a;

    public static String a(List list) {
        AbstractC1276k.f(list, "toolCalls");
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(n.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            Map map = hVar.f3086c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C.H(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), b(entry.getValue()));
            }
            String str = hVar.f3088e;
            if (str == null) {
                str = hVar.f3089f;
            }
            arrayList.add(new ToolCallInfo(hVar.f3085b, linkedHashMap, str != null ? j.a(str) : null, hVar.f3087d == i.f3094f));
        }
        m mVar = a;
        mVar.getClass();
        return mVar.b(new C0255c(ToolCallInfo.Companion.serializer(), 0), arrayList);
    }

    public static kotlinx.serialization.json.b b(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof kotlinx.serialization.json.b) {
            return (kotlinx.serialization.json.b) obj;
        }
        if (obj instanceof String) {
            return j.a((String) obj);
        }
        if (obj instanceof Number) {
            F f6 = j.a;
            return new N4.n((Number) obj, false);
        }
        if (obj instanceof Boolean) {
            F f7 = j.a;
            return new N4.n((Boolean) obj, false);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return j.a(obj.toString());
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(n.Z(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        int H3 = C.H(n.Z(entrySet, 10));
        if (H3 < 16) {
            H3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H3);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(String.valueOf(entry.getKey()), b(entry.getValue()));
        }
        return new c(linkedHashMap);
    }
}
