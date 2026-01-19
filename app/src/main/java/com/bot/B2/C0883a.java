package b2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.tencent.mmkv.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o4.AbstractC1410a;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0883a f11001d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f11002e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f11004c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f11003b = new HashSet();
    public final HashMap a = new HashMap();

    public C0883a(Context context) {
        this.f11004c = context.getApplicationContext();
    }

    public static C0883a c(Context context) {
        if (f11001d == null) {
            synchronized (f11002e) {
                try {
                    if (f11001d == null) {
                        f11001d = new C0883a(context);
                    }
                } finally {
                }
            }
        }
        return f11001d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f11004c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f11003b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0884b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.a;
        if (AbstractC1410a.y()) {
            try {
                AbstractC1410a.g(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0884b interfaceC0884b = (InterfaceC0884b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = interfaceC0884b.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0884b.b(this.f11004c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
