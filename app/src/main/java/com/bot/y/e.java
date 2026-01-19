package Y;

import a0.C0792b;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import n4.InterfaceC1376e;

/* loaded from: classes.dex */
public class e extends AbstractMap implements W.c, Map, InterfaceC1376e {

    /* renamed from: c, reason: collision with root package name */
    public c f9549c;

    /* renamed from: e, reason: collision with root package name */
    public C0792b f9550e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public n f9551f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9552g;

    /* renamed from: h, reason: collision with root package name */
    public int f9553h;

    /* renamed from: i, reason: collision with root package name */
    public int f9554i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a0.b] */
    public e(c cVar) {
        this.f9549c = cVar;
        this.f9551f = cVar.f9544c;
        this.f9554i = cVar.f9545e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a0.b] */
    @Override // W.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c build() {
        n nVar = this.f9551f;
        c cVar = this.f9549c;
        if (nVar != cVar.f9544c) {
            this.f9550e = new Object();
            cVar = new c(this.f9551f, this.f9554i);
        }
        this.f9549c = cVar;
        return cVar;
    }

    public final void b(int i6) {
        this.f9554i = i6;
        this.f9553h++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f9551f = n.f9569e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f9551f.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f9551f.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f9552g = null;
        this.f9551f = this.f9551f.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f9552g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, a0.a] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVar = null;
        c cVar2 = map instanceof c ? (c) map : null;
        if (cVar2 == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVar = eVar.build();
            }
        } else {
            cVar = cVar2;
        }
        if (cVar == null) {
            super.putAll(map);
            return;
        }
        Object obj = new Object();
        obj.a = 0;
        int i6 = this.f9554i;
        n nVar = this.f9551f;
        n nVar2 = cVar.f9544c;
        AbstractC1276k.d(nVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f9551f = nVar.m(nVar2, 0, obj, this);
        int i7 = (cVar.f9545e + i6) - obj.a;
        if (i6 != i7) {
            b(i7);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i6 = this.f9554i;
        n o5 = this.f9551f.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o5 == null) {
            o5 = n.f9569e;
        }
        this.f9551f = o5;
        return i6 != this.f9554i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9554i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new j(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f9552g = null;
        n n3 = this.f9551f.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n3 == null) {
            n3 = n.f9569e;
        }
        this.f9551f = n3;
        return this.f9552g;
    }
}
