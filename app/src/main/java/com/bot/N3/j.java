package N3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(a aVar, InterfaceC1193a interfaceC1193a) {
        AbstractC1276k.f(aVar, "key");
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(aVar);
        if (obj != null) {
            return obj;
        }
        Object b5 = interfaceC1193a.b();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(aVar, b5);
        if (putIfAbsent != null) {
            b5 = putIfAbsent;
        }
        AbstractC1276k.d(b5, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return b5;
    }

    public final boolean b(a aVar) {
        AbstractC1276k.f(aVar, "key");
        return d().containsKey(aVar);
    }

    public final Object c(a aVar) {
        AbstractC1276k.f(aVar, "key");
        Object e6 = e(aVar);
        if (e6 != null) {
            return e6;
        }
        throw new IllegalStateException("No instance for key " + aVar);
    }

    public final Map d() {
        return this.a;
    }

    public final Object e(a aVar) {
        AbstractC1276k.f(aVar, "key");
        return d().get(aVar);
    }

    public final void f(a aVar, Object obj) {
        AbstractC1276k.f(aVar, "key");
        AbstractC1276k.f(obj, "value");
        d().put(aVar, obj);
    }
}
