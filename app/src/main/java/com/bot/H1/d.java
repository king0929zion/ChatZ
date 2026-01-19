package H1;

import B3.e;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d {
    public final c a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2021b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2022c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2023d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                e.x(autoCloseable);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }
}
