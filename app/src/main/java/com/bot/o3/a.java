package O3;

import F2.h;
import Y3.w;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a {
    private volatile /* synthetic */ Object current = w.f9813c;

    static {
        AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "current");
    }

    public final Object a(h hVar) {
        AbstractC1276k.f(hVar, "key");
        return ((Map) this.current).get(hVar);
    }
}
