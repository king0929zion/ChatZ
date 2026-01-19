package X;

import java.util.ListIterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public int f9046c;

    /* renamed from: e, reason: collision with root package name */
    public int f9047e;

    public a(int i6, int i7) {
        this.f9046c = i6;
        this.f9047e = i7;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9046c < this.f9047e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9046c > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9046c;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9046c - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
