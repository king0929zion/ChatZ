package O1;

import F2.h;
import M.q;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final h f4310c = new h(12);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f4311d = new LinkedHashMap();
    public final ReentrantLock a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4312b;

    public a(String str, boolean z5) {
        ReentrantLock reentrantLock;
        synchronized (f4310c) {
            try {
                LinkedHashMap linkedHashMap = f4311d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        this.f4312b = z5 ? new q(str) : null;
    }
}
