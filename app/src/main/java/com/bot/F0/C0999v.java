package f0;

import Y3.AbstractC0738e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import n4.InterfaceC1376e;

/* renamed from: f0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999v implements InterfaceC0972B, Map, InterfaceC1376e {

    /* renamed from: c, reason: collision with root package name */
    public C0998u f11722c;

    /* renamed from: e, reason: collision with root package name */
    public final C0993p f11723e;

    /* renamed from: f, reason: collision with root package name */
    public final C0993p f11724f;

    /* renamed from: g, reason: collision with root package name */
    public final C0993p f11725g;

    public C0999v() {
        Y.c cVar = Y.c.f9543f;
        AbstractC0983f j3 = AbstractC0992o.j();
        C0998u c0998u = new C0998u(j3.g(), cVar);
        if (!(j3 instanceof C0978a)) {
            c0998u.f11648b = new C0998u(1, cVar);
        }
        this.f11722c = c0998u;
        this.f11723e = new C0993p(this, 0);
        this.f11724f = new C0993p(this, 1);
        this.f11725g = new C0993p(this, 2);
    }

    public static final boolean b(C0999v c0999v, C0998u c0998u, int i6, W.d dVar) {
        boolean z5;
        synchronized (AbstractC0997t.f11719b) {
            int i7 = c0998u.f11721d;
            if (i7 == i6) {
                c0998u.f11720c = dVar;
                z5 = true;
                c0998u.f11721d = i7 + 1;
            } else {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D a() {
        return this.f11722c;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC0983f j3;
        C0998u c0998u = this.f11722c;
        AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C0998u c0998u2 = (C0998u) AbstractC0992o.h(c0998u);
        Y.c cVar = Y.c.f9543f;
        if (cVar != c0998u2.f11720c) {
            C0998u c0998u3 = this.f11722c;
            AbstractC1276k.d(c0998u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                C0998u c0998u4 = (C0998u) AbstractC0992o.w(c0998u3, this, j3);
                synchronized (AbstractC0997t.f11719b) {
                    c0998u4.f11720c = cVar;
                    c0998u4.f11721d++;
                }
            }
            AbstractC0992o.n(j3, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().f11720c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().f11720c.containsValue(obj);
    }

    @Override // f0.InterfaceC0972B
    public final void d(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f11722c = (C0998u) abstractC0974D;
    }

    public final C0998u e() {
        C0998u c0998u = this.f11722c;
        AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C0998u) AbstractC0992o.t(c0998u, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f11723e;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().f11720c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((AbstractC0738e) e().f11720c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f11724f;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        W.d dVar;
        int i6;
        Object put;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.f11719b) {
                C0998u c0998u = this.f11722c;
                AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C0998u c0998u2 = (C0998u) AbstractC0992o.h(c0998u);
                dVar = c0998u2.f11720c;
                i6 = c0998u2.f11721d;
            }
            AbstractC1276k.c(dVar);
            Y.e eVar = (Y.e) dVar.builder();
            put = eVar.put(obj, obj2);
            W.d build = eVar.build();
            if (AbstractC1276k.b(build, dVar)) {
                break;
            }
            C0998u c0998u3 = this.f11722c;
            AbstractC1276k.d(c0998u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = b(this, (C0998u) AbstractC0992o.w(c0998u3, this, j3), i6, build);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        W.d dVar;
        int i6;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.f11719b) {
                C0998u c0998u = this.f11722c;
                AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C0998u c0998u2 = (C0998u) AbstractC0992o.h(c0998u);
                dVar = c0998u2.f11720c;
                i6 = c0998u2.f11721d;
            }
            AbstractC1276k.c(dVar);
            Y.e eVar = (Y.e) dVar.builder();
            eVar.putAll(map);
            W.d build = eVar.build();
            if (AbstractC1276k.b(build, dVar)) {
                return;
            }
            C0998u c0998u3 = this.f11722c;
            AbstractC1276k.d(c0998u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = b(this, (C0998u) AbstractC0992o.w(c0998u3, this, j3), i6, build);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        W.d dVar;
        int i6;
        Object remove;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (AbstractC0997t.f11719b) {
                C0998u c0998u = this.f11722c;
                AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C0998u c0998u2 = (C0998u) AbstractC0992o.h(c0998u);
                dVar = c0998u2.f11720c;
                i6 = c0998u2.f11721d;
            }
            AbstractC1276k.c(dVar);
            W.c builder = dVar.builder();
            remove = builder.remove(obj);
            W.d build = builder.build();
            if (AbstractC1276k.b(build, dVar)) {
                break;
            }
            C0998u c0998u3 = this.f11722c;
            AbstractC1276k.d(c0998u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = b(this, (C0998u) AbstractC0992o.w(c0998u3, this, j3), i6, build);
            }
            AbstractC0992o.n(j3, this);
        } while (!b5);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        AbstractC0738e abstractC0738e = (AbstractC0738e) e().f11720c;
        abstractC0738e.getClass();
        return ((Y.c) abstractC0738e).f9545e;
    }

    public final String toString() {
        C0998u c0998u = this.f11722c;
        AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((C0998u) AbstractC0992o.h(c0998u)).f11720c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f11725g;
    }
}
