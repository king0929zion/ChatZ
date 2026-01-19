package Z4;

import Q4.t;
import Y3.B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f10545b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = t.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(t.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(X4.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(T4.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f10545b = B.d0(linkedHashMap);
    }
}
