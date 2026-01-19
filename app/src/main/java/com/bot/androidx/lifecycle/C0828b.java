package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828b {
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10866b;

    public C0828b(HashMap hashMap) {
        this.f10866b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0841o enumC0841o = (EnumC0841o) entry.getValue();
            List list = (List) this.a.get(enumC0841o);
            if (list == null) {
                list = new ArrayList();
                this.a.put(enumC0841o, list);
            }
            list.add((C0829c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0829c c0829c = (C0829c) list.get(size);
                Method method = c0829c.f10867b;
                try {
                    int i6 = c0829c.a;
                    if (i6 == 0) {
                        method.invoke(obj, null);
                    } else if (i6 == 1) {
                        method.invoke(obj, interfaceC0846u);
                    } else if (i6 == 2) {
                        method.invoke(obj, interfaceC0846u, enumC0841o);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to call observer method", e7.getCause());
                }
            }
        }
    }
}
