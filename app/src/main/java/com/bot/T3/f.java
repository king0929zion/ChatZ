package t3;

import B0.F;
import B0.G;
import N3.p;
import java.util.LinkedHashMap;
import z3.u;

/* loaded from: classes.dex */
public final class f {
    public final LinkedHashMap a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14933b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14934c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final C1727b f14935d = C1727b.f14914g;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14936e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14937f = true;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14938g = p.a;

    public final void a(u uVar, l4.c cVar) {
        N3.a key = uVar.getKey();
        LinkedHashMap linkedHashMap = this.f14933b;
        linkedHashMap.put(uVar.getKey(), new F(17, (l4.c) linkedHashMap.get(key), cVar));
        N3.a key2 = uVar.getKey();
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2.containsKey(key2)) {
            return;
        }
        linkedHashMap2.put(uVar.getKey(), new G(uVar, 28));
    }
}
