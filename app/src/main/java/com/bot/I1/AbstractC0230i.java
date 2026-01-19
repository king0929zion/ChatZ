package I1;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.Z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.C1270e;

/* renamed from: I1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0230i {
    public static String a(L1.e eVar, int i6) {
        AbstractC1276k.f(eVar, "context");
        if (i6 <= 16777215) {
            return String.valueOf(i6);
        }
        try {
            Context context = eVar.a;
            AbstractC1276k.c(context);
            String resourceName = context.getResources().getResourceName(i6);
            AbstractC1276k.c(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i6);
        }
    }

    public static t4.h b(v vVar) {
        AbstractC1276k.f(vVar, "<this>");
        return t4.j.q(vVar, new A2.a(26));
    }

    public static o c(Z z5) {
        F1.d dVar = p.a;
        F1.a aVar = F1.a.f1544b;
        AbstractC1276k.f(dVar, "factory");
        AbstractC1276k.f(aVar, "extras");
        B0.H h3 = new B0.H(z5, dVar, aVar);
        C1270e a = AbstractC1289x.a(o.class);
        String b5 = a.b();
        if (b5 != null) {
            return (o) h3.g(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static String d(Class cls) {
        LinkedHashMap linkedHashMap = I.f2537b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            G g3 = (G) cls.getAnnotation(G.class);
            str = g3 != null ? g3.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        AbstractC1276k.c(str);
        return str;
    }

    public static final ArrayList e(Map map, l4.c cVar) {
        AbstractC1276k.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0229h c0229h = (C0229h) entry.getValue();
            Boolean bool = c0229h != null ? Boolean.FALSE : null;
            AbstractC1276k.c(bool);
            if (!bool.booleanValue() && !c0229h.f2542b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) cVar.f((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
