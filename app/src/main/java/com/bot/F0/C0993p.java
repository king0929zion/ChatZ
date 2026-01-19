package f0;

import Y3.AbstractC0738e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;
import n4.InterfaceC1375d;
import n4.InterfaceC1377f;

/* renamed from: f0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993p implements Set, InterfaceC1377f {

    /* renamed from: c, reason: collision with root package name */
    public final C0999v f11716c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11717e;

    public C0993p(C0999v c0999v, int i6) {
        this.f11717e = i6;
        this.f11716c = c0999v;
    }

    private final boolean a(Collection collection) {
        W.d dVar;
        int i6;
        AbstractC0983f j3;
        boolean b5;
        Set N02 = Y3.m.N0(collection);
        C0999v c0999v = this.f11716c;
        boolean z5 = false;
        do {
            synchronized (AbstractC0997t.f11719b) {
                C0998u c0998u = c0999v.f11722c;
                AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C0998u c0998u2 = (C0998u) AbstractC0992o.h(c0998u);
                dVar = c0998u2.f11720c;
                i6 = c0998u2.f11721d;
            }
            AbstractC1276k.c(dVar);
            W.c builder = dVar.builder();
            Iterator it = c0999v.f11723e.iterator();
            while (((C0971A) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C0971A) it).next();
                if (!N02.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z5 = true;
                }
            }
            W.d build = builder.build();
            if (AbstractC1276k.b(build, dVar)) {
                break;
            }
            C0998u c0998u3 = c0999v.f11722c;
            AbstractC1276k.d(c0998u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = C0999v.b(c0999v, (C0998u) AbstractC0992o.w(c0998u3, c0999v, j3), i6, build);
            }
            AbstractC0992o.n(j3, c0999v);
        } while (!b5);
        return z5;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f11717e) {
            case 0:
                AbstractC0997t.l();
                throw null;
            case 1:
                AbstractC0997t.l();
                throw null;
            default:
                AbstractC0997t.l();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f11717e) {
            case 0:
                AbstractC0997t.l();
                throw null;
            case 1:
                AbstractC0997t.l();
                throw null;
            default:
                AbstractC0997t.l();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f11716c.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f11717e) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC1372a) && !(obj instanceof InterfaceC1375d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC1276k.b(this.f11716c.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f11716c.containsKey(obj);
            default:
                return this.f11716c.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f11717e) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.f11716c.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.f11716c.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f11716c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f11717e) {
            case 0:
                C0999v c0999v = this.f11716c;
                return new C0971A(c0999v, ((W.b) ((AbstractC0738e) c0999v.e().f11720c).entrySet()).iterator(), 0);
            case 1:
                C0999v c0999v2 = this.f11716c;
                return new C0971A(c0999v2, ((W.b) ((AbstractC0738e) c0999v2.e().f11720c).entrySet()).iterator(), 1);
            default:
                C0999v c0999v3 = this.f11716c;
                return new C0971A(c0999v3, ((W.b) ((AbstractC0738e) c0999v3.e().f11720c).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.f11717e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return (!(obj instanceof InterfaceC1372a) || (obj instanceof InterfaceC1375d)) && this.f11716c.remove(((Map.Entry) obj).getKey()) != null;
                }
                return false;
            case 1:
                return this.f11716c.remove(obj) != null;
            default:
                C0999v c0999v = this.f11716c;
                Iterator it = c0999v.f11723e.iterator();
                while (true) {
                    if (((C0971A) it).hasNext()) {
                        obj2 = ((C0971A) it).next();
                        if (AbstractC1276k.b(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                c0999v.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        W.d dVar;
        int i6;
        AbstractC0983f j3;
        boolean b5;
        switch (this.f11717e) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z5 = false;
                    while (it.hasNext()) {
                        if (this.f11716c.remove(((Map.Entry) it.next()).getKey()) != null || z5) {
                            z5 = true;
                        }
                    }
                    return z5;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z6 = false;
                    while (it2.hasNext()) {
                        if (this.f11716c.remove(it2.next()) != null || z6) {
                            z6 = true;
                        }
                    }
                    return z6;
                    break;
                }
            default:
                Set N02 = Y3.m.N0(collection);
                C0999v c0999v = this.f11716c;
                boolean z7 = false;
                do {
                    synchronized (AbstractC0997t.f11719b) {
                        C0998u c0998u = c0999v.f11722c;
                        AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C0998u c0998u2 = (C0998u) AbstractC0992o.h(c0998u);
                        dVar = c0998u2.f11720c;
                        i6 = c0998u2.f11721d;
                    }
                    AbstractC1276k.c(dVar);
                    W.c builder = dVar.builder();
                    Iterator it3 = c0999v.f11723e.iterator();
                    while (((C0971A) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C0971A) it3).next();
                        if (N02.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z7 = true;
                        }
                    }
                    W.d build = builder.build();
                    if (!AbstractC1276k.b(build, dVar)) {
                        C0998u c0998u3 = c0999v.f11722c;
                        AbstractC1276k.d(c0998u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC0992o.f11707c) {
                            j3 = AbstractC0992o.j();
                            b5 = C0999v.b(c0999v, (C0998u) AbstractC0992o.w(c0998u3, c0999v, j3), i6, build);
                        }
                        AbstractC0992o.n(j3, c0999v);
                    }
                    return z7;
                } while (!b5);
                return z7;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        W.d dVar;
        int i6;
        AbstractC0983f j3;
        boolean b5;
        W.d dVar2;
        int i7;
        AbstractC0983f j4;
        boolean b6;
        switch (this.f11717e) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int H3 = Y3.C.H(Y3.n.Z(collection2, 10));
                if (H3 < 16) {
                    H3 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(H3);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C0999v c0999v = this.f11716c;
                boolean z5 = false;
                do {
                    synchronized (AbstractC0997t.f11719b) {
                        C0998u c0998u = c0999v.f11722c;
                        AbstractC1276k.d(c0998u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C0998u c0998u2 = (C0998u) AbstractC0992o.h(c0998u);
                        dVar = c0998u2.f11720c;
                        i6 = c0998u2.f11721d;
                    }
                    AbstractC1276k.c(dVar);
                    W.c builder = dVar.builder();
                    Iterator it = c0999v.f11723e.iterator();
                    while (((C0971A) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((C0971A) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC1276k.b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            builder.remove(entry2.getKey());
                            z5 = true;
                        }
                    }
                    W.d build = builder.build();
                    if (!AbstractC1276k.b(build, dVar)) {
                        C0998u c0998u3 = c0999v.f11722c;
                        AbstractC1276k.d(c0998u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC0992o.f11707c) {
                            j3 = AbstractC0992o.j();
                            b5 = C0999v.b(c0999v, (C0998u) AbstractC0992o.w(c0998u3, c0999v, j3), i6, build);
                        }
                        AbstractC0992o.n(j3, c0999v);
                    }
                    return z5;
                } while (!b5);
                return z5;
            case 1:
                return a(collection);
            default:
                Set N02 = Y3.m.N0(collection);
                C0999v c0999v2 = this.f11716c;
                boolean z6 = false;
                do {
                    synchronized (AbstractC0997t.f11719b) {
                        C0998u c0998u4 = c0999v2.f11722c;
                        AbstractC1276k.d(c0998u4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C0998u c0998u5 = (C0998u) AbstractC0992o.h(c0998u4);
                        dVar2 = c0998u5.f11720c;
                        i7 = c0998u5.f11721d;
                    }
                    AbstractC1276k.c(dVar2);
                    W.c builder2 = dVar2.builder();
                    Iterator it2 = c0999v2.f11723e.iterator();
                    while (((C0971A) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((C0971A) it2).next();
                        if (!N02.contains(entry3.getValue())) {
                            builder2.remove(entry3.getKey());
                            z6 = true;
                        }
                    }
                    W.d build2 = builder2.build();
                    if (!AbstractC1276k.b(build2, dVar2)) {
                        C0998u c0998u6 = c0999v2.f11722c;
                        AbstractC1276k.d(c0998u6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC0992o.f11707c) {
                            j4 = AbstractC0992o.j();
                            b6 = C0999v.b(c0999v2, (C0998u) AbstractC0992o.w(c0998u6, c0999v2, j4), i7, build2);
                        }
                        AbstractC0992o.n(j4, c0999v2);
                    }
                    return z6;
                } while (!b6);
                return z6;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f11716c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1275j.b(this, objArr);
    }
}
