package com.vladsch.flexmark.util.collection.iteration;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class IndexedItemIterator<R> implements ReversibleIndexedIterator<R> {
    private final Indexed<R> items;
    private int last;
    private int modificationCount;
    private int next;
    private final boolean reversed;

    public IndexedItemIterator(Indexed<R> indexed) {
        this(indexed, false);
    }

    @Override // java.util.Iterator
    public void forEachRemaining(Consumer<? super R> consumer) {
        while (hasNext()) {
            consumer.accept(next());
        }
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterator
    public int getIndex() {
        int i6 = this.last;
        if (i6 >= 0) {
            return i6;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != -1;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterator
    public boolean isReversed() {
        return this.reversed;
    }

    @Override // java.util.Iterator
    public R next() {
        if (this.modificationCount != this.items.modificationCount()) {
            throw new ConcurrentModificationException();
        }
        int i6 = this.next;
        int i7 = -1;
        if (i6 == -1) {
            throw new NoSuchElementException();
        }
        this.last = i6;
        if (this.reversed) {
            if (i6 > 0) {
                i7 = i6 - 1;
            }
        } else if (i6 != this.items.size() - 1) {
            i7 = this.next + 1;
        }
        this.next = i7;
        return this.items.get(this.last);
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.last == -1) {
            throw new NoSuchElementException();
        }
        if (this.modificationCount != this.items.modificationCount()) {
            throw new ConcurrentModificationException();
        }
        this.items.removeAt(this.last);
        this.last = -1;
        this.modificationCount = this.items.modificationCount();
    }

    public IndexedItemIterator(Indexed<R> indexed, boolean z5) {
        this.items = indexed;
        this.reversed = z5;
        int size = z5 ? indexed.size() - 1 : 0;
        this.next = size;
        if (size >= indexed.size()) {
            this.next = -1;
        }
        this.last = -1;
        this.modificationCount = indexed.modificationCount();
    }
}
