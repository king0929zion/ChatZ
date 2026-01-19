package N3;

import D.P0;
import java.util.LinkedHashMap;
import java.util.Map;
import m4.AbstractC1276k;
import x3.C1877a;

/* loaded from: classes.dex */
public final class o extends LinkedHashMap {

    /* renamed from: c, reason: collision with root package name */
    public final P0 f3875c;

    /* renamed from: e, reason: collision with root package name */
    public final C1877a f3876e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(P0 p02, int i6) {
        super(10, 0.75f, true);
        C1877a c1877a = C1877a.f15601g;
        this.f3875c = p02;
        this.f3876e = c1877a;
        this.f3877f = i6;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.f3877f == 0) {
            return this.f3875c.f(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object f6 = this.f3875c.f(obj);
            put(obj, f6);
            return f6;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        AbstractC1276k.f(entry, "eldest");
        boolean z5 = super.size() > this.f3877f;
        if (z5) {
            this.f3876e.f(entry.getValue());
        }
        return z5;
    }
}
