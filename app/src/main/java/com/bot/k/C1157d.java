package k;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157d implements Iterator, Map.Entry {

    /* renamed from: c, reason: collision with root package name */
    public int f12532c;

    /* renamed from: e, reason: collision with root package name */
    public int f12533e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1159f f12535g;

    public C1157d(C1159f c1159f) {
        this.f12535g = c1159f;
        this.f12532c = c1159f.f12539f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f12534f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i6 = this.f12533e;
        C1159f c1159f = this.f12535g;
        return AbstractC1276k.b(key, c1159f.g(i6)) && AbstractC1276k.b(entry.getValue(), c1159f.k(this.f12533e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f12534f) {
            return this.f12535g.g(this.f12533e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12534f) {
            return this.f12535g.k(this.f12533e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12533e < this.f12532c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f12534f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i6 = this.f12533e;
        C1159f c1159f = this.f12535g;
        Object g3 = c1159f.g(i6);
        Object k3 = c1159f.k(this.f12533e);
        return (g3 == null ? 0 : g3.hashCode()) ^ (k3 != null ? k3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12533e++;
        this.f12534f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12534f) {
            throw new IllegalStateException();
        }
        this.f12535g.i(this.f12533e);
        this.f12533e--;
        this.f12532c--;
        this.f12534f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12534f) {
            return this.f12535g.j(this.f12533e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
